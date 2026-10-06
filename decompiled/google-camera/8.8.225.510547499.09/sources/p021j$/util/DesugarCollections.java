package p021j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class DesugarCollections {

    /* JADX INFO: renamed from: a */
    public static final Class f33114a;

    /* JADX INFO: renamed from: b */
    private static final Field f33115b;

    /* JADX INFO: renamed from: c */
    private static final Field f33116c;

    /* JADX INFO: renamed from: d */
    private static final Constructor f33117d;

    /* JADX INFO: renamed from: e */
    private static final Constructor f33118e;

    static {
        Field declaredField;
        Field declaredField2;
        Constructor<?> declaredConstructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f33114a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> declaredConstructor2 = null;
        try {
            declaredField = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        f33115b = declaredField;
        if (declaredField != null) {
            declaredField.setAccessible(true);
        }
        try {
            declaredField2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            declaredField2 = null;
        }
        f33116c = declaredField2;
        if (declaredField2 != null) {
            declaredField2.setAccessible(true);
        }
        try {
            declaredConstructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            declaredConstructor = null;
        }
        f33118e = declaredConstructor;
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
        }
        try {
            declaredConstructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f33117d = declaredConstructor2;
        if (declaredConstructor2 != null) {
            declaredConstructor2.setAccessible(true);
        }
    }

    /* JADX INFO: renamed from: c */
    static boolean m12503c(Collection collection, Predicate predicate) {
        boolean zRemoveIf;
        Field field = f33115b;
        if (field == null) {
            try {
                return Collection$EL.removeIf((Collection) f33116c.get(collection), predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        }
        try {
            synchronized (field.get(collection)) {
                zRemoveIf = Collection$EL.removeIf((Collection) f33116c.get(collection), predicate);
            }
            return zRemoveIf;
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C0558g(map);
    }
}
