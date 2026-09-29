package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p192j6.InterfaceC6419h;
import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.manager.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2163s implements InterfaceC2153i {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC6419h<?>> f10897a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
        Iterator it = C7492l.m14883d(this.f10897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6419h) it.next()).mo6252a();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
        Iterator it = C7492l.m14883d(this.f10897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6419h) it.next()).mo6253b();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
        Iterator it = C7492l.m14883d(this.f10897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6419h) it.next()).mo6257h();
        }
    }
}
