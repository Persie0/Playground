package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzmc extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final zzmc f14566b;

    /* JADX INFO: renamed from: a */
    public boolean f14567a;

    static {
        zzmc zzmcVar = new zzmc();
        f14566b = zzmcVar;
        zzmcVar.f14567a = false;
    }

    private zzmc() {
        this.f14567a = true;
    }

    public zzmc(Map map) {
        super(map);
        this.f14567a = true;
    }

    /* JADX INFO: renamed from: b */
    public static zzmc m8504b() {
        return f14566b;
    }

    /* JADX INFO: renamed from: c */
    public final zzmc m8505c() {
        return isEmpty() ? new zzmc() : new zzmc(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8508h();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m8506d() {
        this.f14567a = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8507e() {
        return this.f14567a;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (!(obj instanceof Map)) {
            break;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                Iterator it = entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!map.containsKey(entry.getKey())) {
                            break;
                            break;
                        }
                        value = entry.getValue();
                        obj2 = map.get(entry.getKey());
                    }
                } while (((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2));
            }
        }
        return true;
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m8508h() {
        if (!this.f14567a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[LOOP:2: B:17:0x0059->B:18:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        Object value;
        int i10;
        int length;
        int i11 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = C2849t6.f14439a;
                iHashCode = bArr.length;
                for (byte b10 : bArr) {
                    iHashCode = (iHashCode * 31) + b10;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
                value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr2 = (byte[]) value;
                    Charset charset2 = C2849t6.f14439a;
                    length = bArr2.length;
                    for (byte b11 : bArr2) {
                        length = (length * 31) + b11;
                    }
                    if (length == 0) {
                        iHashCode2 = length;
                    }
                } else {
                    iHashCode2 = value.hashCode();
                }
                i11 += iHashCode2 ^ iHashCode;
            } else {
                iHashCode = key.hashCode();
            }
            value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                Charset charset3 = C2849t6.f14439a;
                length = bArr3.length;
                while (i10 < r4) {
                    length = (length * 31) + b11;
                }
                if (length == 0) {
                    iHashCode2 = length;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i11 += iHashCode2 ^ iHashCode;
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m8508h();
        Charset charset = C2849t6.f14439a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8508h();
        for (Object obj : map.keySet()) {
            Charset charset = C2849t6.f14439a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8508h();
        return super.remove(obj);
    }
}
