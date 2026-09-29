package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p000.ts3;
import p000.ucd;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0977h extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzba f12043b;

    public /* synthetic */ C0977h(zzba zzbaVar, int i) {
        this.f12042a = i;
        this.f12043b = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f12042a;
        zzba zzbaVar = this.f12043b;
        switch (i) {
            case 0:
                zzbaVar.clear();
                break;
            default:
                zzbaVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f12042a;
        zzba zzbaVar = this.f12043b;
        switch (i) {
            case 0:
                Map mapM5485d = zzbaVar.m5485d();
                if (mapM5485d != null) {
                    return mapM5485d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM5489h = zzbaVar.m5489h(entry.getKey());
                    if (iM5489h != -1 && ts3.m22281b(zzbaVar.m5484c()[iM5489h], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return zzbaVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f12042a;
        zzba zzbaVar = this.f12043b;
        switch (i) {
            case 0:
                Map mapM5485d = zzbaVar.m5485d();
                return mapM5485d != null ? mapM5485d.entrySet().iterator() : new C0976g(zzbaVar, 1);
            default:
                Map mapM5485d2 = zzbaVar.m5485d();
                return mapM5485d2 != null ? mapM5485d2.keySet().iterator() : new C0976g(zzbaVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f12042a;
        zzba zzbaVar = this.f12043b;
        switch (i) {
            case 0:
                Map mapM5485d = zzbaVar.m5485d();
                if (mapM5485d != null) {
                    return mapM5485d.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!zzbaVar.m5487f()) {
                        int iM5488g = zzbaVar.m5488g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = zzbaVar.f12072a;
                        Objects.requireNonNull(obj2);
                        int iM22679c = ucd.m22679c(key, value, iM5488g, obj2, zzbaVar.m5482a(), zzbaVar.m5483b(), zzbaVar.m5484c());
                        if (iM22679c != -1) {
                            zzbaVar.m5486e(iM22679c, iM5488g);
                            zzbaVar.f12077f--;
                            zzbaVar.f12076e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map mapM5485d2 = zzbaVar.m5485d();
                if (mapM5485d2 != null) {
                    return mapM5485d2.keySet().remove(obj);
                }
                return zzbaVar.m5491j(obj) != zzba.f12071j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f12042a;
        zzba zzbaVar = this.f12043b;
        switch (i) {
            case 0:
                break;
        }
        return zzbaVar.size();
    }
}
