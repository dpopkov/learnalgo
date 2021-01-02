package learn.algo.leetcode.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lists {

    public static <T> boolean containSameItems(List<T> a, List<T> b) {
        Set<T> s1 = new HashSet<>(a);
        Set<T> s2 = new HashSet<>(b);
        return s1.equals(s2);
    }

    @SuppressWarnings("unchecked")
    public static <T> boolean deepContainSameItems(List<T> a, List<T> b) {
        if (a.size() != b.size()) {
            return false;
        }
        T t = a.get(0);
        if (!(t instanceof List)) {
            return containSameItems(a, b);
        }
        Set<T> s1 = (Set<T>) deepToSet(a);
        Set<T> s2 = (Set<T>) deepToSet(b);
        return s1.equals(s2);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static Object deepToSet(Object a) {
        if (a instanceof List) {
            List<?> list = (List<?>) a;
            Object t = list.get(0);
            if (t instanceof List) {
                Set set = new HashSet();
                for (Object item : list) {
                    set.add(deepToSet(item));
                }
                return set;
            } else {
                return new HashSet<>(list);
            }
        }
        throw new IllegalArgumentException("Input parameter must be List");
    }
}
