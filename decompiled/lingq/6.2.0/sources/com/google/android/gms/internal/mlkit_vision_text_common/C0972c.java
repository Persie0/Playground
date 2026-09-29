package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import p000.fq5;
import p000.mjb;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0972c extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public transient C0970a f12022a;

    /* JADX INFO: renamed from: b */
    public transient fq5 f12023b;

    /* JADX INFO: renamed from: c */
    public final transient Map f12024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzal f12025d;

    public C0972c(zzal zzalVar, Map map) {
        this.f12025d = zzalVar;
        this.f12024c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f12025d.f12070c;
        if (this.f12024c != map) {
            C0971b c0971b = new C0971b(this);
            while (c0971b.hasNext()) {
                c0971b.next();
                c0971b.remove();
            }
            return;
        }
        zzba zzbaVar = (zzba) map;
        Iterator it = zzbaVar.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        zzbaVar.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f12024c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0970a c0970a = this.f12022a;
        if (c0970a != null) {
            return c0970a;
        }
        C0970a c0970a2 = new C0970a(this);
        this.f12022a = c0970a2;
        return c0970a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f12024c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f12024c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        zzaa zzaaVar = (zzaa) this.f12025d;
        zzaaVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new mjb(zzaaVar, obj, list, null) : new C0974e(zzaaVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f12024c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzal zzalVar = this.f12025d;
        C0973d c0973d = zzalVar.f12034a;
        if (c0973d != null) {
            return c0973d;
        }
        C0973d c0973d2 = new C0973d(zzalVar, zzalVar.f12070c);
        zzalVar.f12034a = c0973d2;
        return c0973d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f12024c.remove(obj);
        if (collection == null) {
            return null;
        }
        ((zzao) this.f12025d).getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12024c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f12024c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        fq5 fq5Var = this.f12023b;
        if (fq5Var != null) {
            return fq5Var;
        }
        fq5 fq5Var2 = new fq5(this, 1);
        this.f12023b = fq5Var2;
        return fq5Var2;
    }
}
