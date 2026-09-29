package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.manager.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2145a implements InterfaceC2152h {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC2153i> f10854a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public boolean f10855b;

    /* JADX INFO: renamed from: c */
    public boolean f10856c;

    /* JADX INFO: renamed from: a */
    public final void m6364a() {
        this.f10856c = true;
        Iterator it = C7492l.m14883d(this.f10854a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6257h();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6365b() {
        this.f10855b = true;
        Iterator it = C7492l.m14883d(this.f10854a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6252a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6366c() {
        this.f10855b = false;
        Iterator it = C7492l.m14883d(this.f10854a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6253b();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: p */
    public final void mo6362p(InterfaceC2153i interfaceC2153i) {
        this.f10854a.add(interfaceC2153i);
        if (this.f10856c) {
            interfaceC2153i.mo6257h();
        } else if (this.f10855b) {
            interfaceC2153i.mo6252a();
        } else {
            interfaceC2153i.mo6253b();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: y */
    public final void mo6363y(InterfaceC2153i interfaceC2153i) {
        this.f10854a.remove(interfaceC2153i);
    }
}
