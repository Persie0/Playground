package com.google.common.collect;

import dm.C5212l;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3180c<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C5212l.m11140M(getKey(), entry.getKey()) && C5212l.m11140M(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        int iHashCode = 0;
        int iHashCode2 = key == null ? 0 : key.hashCode();
        if (value != null) {
            iHashCode = value.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
