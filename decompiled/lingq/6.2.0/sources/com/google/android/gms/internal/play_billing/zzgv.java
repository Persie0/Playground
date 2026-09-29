package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.ij6;
import p000.m9c;
import p000.n8c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgv extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final zzgv f12232b;

    /* JADX INFO: renamed from: a */
    public boolean f12233a = true;

    static {
        zzgv zzgvVar = new zzgv();
        f12232b = zzgvVar;
        zzgvVar.f12233a = false;
    }

    /* JADX INFO: renamed from: a */
    public static zzgv m5688a() {
        return f12232b;
    }

    /* JADX INFO: renamed from: f */
    public static int m5689f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof n8c)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM16703a = m9c.m16703a(length, bArr, 0, length);
        if (iM16703a == 0) {
            return 1;
        }
        return iM16703a;
    }

    /* JADX INFO: renamed from: b */
    public final zzgv m5690b() {
        if (isEmpty()) {
            return new zzgv();
        }
        zzgv zzgvVar = new zzgv(this);
        zzgvVar.f12233a = true;
        return zzgvVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m5691c() {
        this.f12233a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m5694g();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m5692d(zzgv zzgvVar) {
        m5694g();
        if (zzgvVar.isEmpty()) {
            return;
        }
        putAll(zzgvVar);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5693e() {
        return this.f12233a;
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

    /* JADX INFO: renamed from: g */
    public final void m5694g() {
        if (this.f12233a) {
            return;
        }
        ij6.m13946b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM5689f = 0;
        for (Map.Entry entry : entrySet()) {
            iM5689f += m5689f(entry.getValue()) ^ m5689f(entry.getKey());
        }
        return iM5689f;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m5694g();
        Charset charset = m9c.f50823a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m5694g();
        for (Object obj : map.keySet()) {
            Charset charset = m9c.f50823a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m5694g();
        return super.remove(obj);
    }
}
