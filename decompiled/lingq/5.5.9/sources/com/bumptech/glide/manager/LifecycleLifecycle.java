package com.bumptech.glide.manager;

import androidx.view.C1052r;
import androidx.view.InterfaceC1050p;
import androidx.view.InterfaceC1051q;
import androidx.view.InterfaceC1058x;
import androidx.view.Lifecycle;
import java.util.HashSet;
import java.util.Iterator;
import p258m6.C7492l;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC2152h, InterfaceC1050p {

    /* JADX INFO: renamed from: a */
    public final HashSet f10852a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Lifecycle f10853b;

    public LifecycleLifecycle(C1052r c1052r) {
        this.f10853b = c1052r;
        c1052r.mo3883a(this);
    }

    @InterfaceC1058x(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(InterfaceC1051q interfaceC1051q) {
        Iterator it = C7492l.m14883d(this.f10852a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6257h();
        }
        interfaceC1051q.mo786G().mo3885c(this);
    }

    @InterfaceC1058x(Lifecycle.Event.ON_START)
    public void onStart(InterfaceC1051q interfaceC1051q) {
        Iterator it = C7492l.m14883d(this.f10852a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6252a();
        }
    }

    @InterfaceC1058x(Lifecycle.Event.ON_STOP)
    public void onStop(InterfaceC1051q interfaceC1051q) {
        Iterator it = C7492l.m14883d(this.f10852a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2153i) it.next()).mo6253b();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: p */
    public final void mo6362p(InterfaceC2153i interfaceC2153i) {
        this.f10852a.add(interfaceC2153i);
        Lifecycle lifecycle = this.f10853b;
        if (lifecycle.mo3884b() == Lifecycle.State.DESTROYED) {
            interfaceC2153i.mo6257h();
        } else if (lifecycle.mo3884b().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC2153i.mo6252a();
        } else {
            interfaceC2153i.mo6253b();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: y */
    public final void mo6363y(InterfaceC2153i interfaceC2153i) {
        this.f10852a.remove(interfaceC2153i);
    }
}
