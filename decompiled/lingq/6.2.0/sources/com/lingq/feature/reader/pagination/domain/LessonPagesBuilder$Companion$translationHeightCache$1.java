package com.lingq.feature.reader.pagination.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.i55;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonPagesBuilder$Companion$translationHeightCache$1 extends LinkedHashMap<i55, Integer> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof i55) {
            return super.containsKey((i55) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Integer) {
            return super.containsValue((Integer) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof i55) {
            return (Integer) super.get((i55) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof i55) ? obj2 : (Integer) super.getOrDefault((i55) obj, (Integer) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof i55) && (obj2 instanceof Integer)) {
            return super.remove((i55) obj, (Integer) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<i55, Integer> entry) {
        return super.size() > 600;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof i55) {
            return (Integer) super.remove((i55) obj);
        }
        return null;
    }
}
