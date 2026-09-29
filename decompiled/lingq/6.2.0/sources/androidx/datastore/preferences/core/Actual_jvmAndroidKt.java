package androidx.datastore.preferences.core;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p000.nn1;
import p000.ph2;
import p000.t62;
import p000.u91;
import p000.v72;

/* JADX INFO: loaded from: classes.dex */
public final class Actual_jvmAndroidKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        set.getClass();
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(u91.m22627s1(set));
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        map.getClass();
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public static final nn1 ioDispatcher() {
        v72 v72Var = ph2.f56212a;
        return t62.f61909c;
    }
}
