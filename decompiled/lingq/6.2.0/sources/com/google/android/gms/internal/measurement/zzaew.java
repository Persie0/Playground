package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.ij6;
import p000.kib;
import p000.yhb;

/* JADX INFO: loaded from: classes.dex */
public final class zzaew extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final zzaew f11872b;

    /* JADX INFO: renamed from: a */
    public boolean f11873a = true;

    static {
        zzaew zzaewVar = new zzaew();
        f11872b = zzaewVar;
        zzaewVar.f11873a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m5435b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof yhb)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM15263a = kib.m15263a(length, bArr, 0, length);
        if (iM15263a == 0) {
            return 1;
        }
        return iM15263a;
    }

    /* JADX INFO: renamed from: a */
    public final zzaew m5436a() {
        if (isEmpty()) {
            return new zzaew();
        }
        zzaew zzaewVar = new zzaew(this);
        zzaewVar.f11873a = true;
        return zzaewVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m5437c() {
        if (this.f11873a) {
            return;
        }
        ij6.m13946b();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m5437c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM5435b = 0;
        for (Map.Entry entry : entrySet()) {
            iM5435b += m5435b(entry.getValue()) ^ m5435b(entry.getKey());
        }
        return iM5435b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m5437c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m5437c();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m5437c();
        return super.remove(obj);
    }
}
