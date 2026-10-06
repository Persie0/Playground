package com.bumptech.glide.manager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.akq;
import p000.akr;
import p000.aks;
import p000.aku;
import p000.akv;
import p000.alf;
import p000.byz;
import p000.bza;
import p000.cbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleLifecycle implements byz, aku {

    /* JADX INFO: renamed from: a */
    private final Set f6485a = new HashSet();

    /* JADX INFO: renamed from: b */
    private final aks f6486b;

    public LifecycleLifecycle(aks aksVar) {
        this.f6486b = aksVar;
        aksVar.m879a(this);
    }

    @Override // p000.byz
    /* JADX INFO: renamed from: a */
    public final void mo3200a(bza bzaVar) {
        this.f6485a.add(bzaVar);
        if (this.f6486b.f598a == akr.DESTROYED) {
            bzaVar.mo2867g();
        } else if (this.f6486b.f598a.m872a(akr.f595d)) {
            bzaVar.mo2868h();
        } else {
            bzaVar.mo2869i();
        }
    }

    @Override // p000.byz
    /* JADX INFO: renamed from: e */
    public final void mo3204e(bza bzaVar) {
        this.f6485a.remove(bzaVar);
    }

    @alf(m907a = akq.ON_DESTROY)
    public void onDestroy(akv akvVar) {
        Iterator it = cbi.m3385f(this.f6485a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2867g();
        }
        akvVar.getLifecycle().m881c(this);
    }

    @alf(m907a = akq.ON_START)
    public void onStart(akv akvVar) {
        Iterator it = cbi.m3385f(this.f6485a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2868h();
        }
    }

    @alf(m907a = akq.ON_STOP)
    public void onStop(akv akvVar) {
        Iterator it = cbi.m3385f(this.f6485a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2869i();
        }
    }
}
