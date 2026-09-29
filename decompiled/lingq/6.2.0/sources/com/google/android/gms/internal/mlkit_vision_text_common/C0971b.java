package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import p000.C3386nv;
import p000.mjb;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0971b implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f12019a;

    /* JADX INFO: renamed from: b */
    public Collection f12020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0972c f12021c;

    public C0971b(C0972c c0972c) {
        this.f12021c = c0972c;
        this.f12019a = c0972c.f12024c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12019a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f12019a.next();
        this.f12020b = (Collection) entry.getValue();
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        zzaa zzaaVar = (zzaa) this.f12021c.f12025d;
        zzaaVar.getClass();
        List list = (List) collection;
        return new zzbg(key, list instanceof RandomAccess ? new mjb(zzaaVar, key, list, null) : new C0974e(zzaaVar, key, list, null));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f12020b != null)) {
            C3386nv.m17633t("no calls to next() since the last call to remove()");
            return;
        }
        this.f12019a.remove();
        this.f12021c.f12025d.getClass();
        this.f12020b.size();
        this.f12020b.clear();
        this.f12020b = null;
    }
}
