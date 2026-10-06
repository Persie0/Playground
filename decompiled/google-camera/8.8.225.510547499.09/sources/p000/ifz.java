package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iga f30695a;

    /* JADX INFO: renamed from: b */
    private final Animator f30696b;

    public ifz(iga igaVar, Animator animator) {
        this.f30695a = igaVar;
        this.f30696b = animator;
    }

    /* JADX INFO: renamed from: a */
    final void m11171a() {
        this.f30696b.setStartDelay(150L);
    }

    /* JADX INFO: renamed from: b */
    final void m11172b() {
        this.f30696b.addListener(new ify(this));
    }

    /* JADX INFO: renamed from: c */
    final void m11173c(mrm mrmVar) {
        if (mrmVar.mo16813g()) {
            this.f30696b.addListener(jvh.m13544B(new cwu(this, mrmVar, 8)));
        }
    }

    /* JADX INFO: renamed from: d */
    final void m11174d(int i) {
        this.f30696b.setDuration(i);
    }

    /* JADX INFO: renamed from: e */
    final void m11175e() {
        this.f30696b.setInterpolator(iga.f30699a);
    }

    /* JADX INFO: renamed from: f */
    final void m11176f() {
        this.f30696b.setInterpolator(this.f30695a.f30718s);
    }

    /* JADX INFO: renamed from: g */
    final void m11177g() {
        this.f30696b.setInterpolator(this.f30695a.f30719t);
    }

    /* JADX INFO: renamed from: h */
    final void m11178h(mrm mrmVar) {
        if (mrmVar.mo16813g()) {
            this.f30696b.addListener(jvh.m13545C(new cwu(this, mrmVar, 9)));
        }
    }

    /* JADX INFO: renamed from: i */
    final void m11179i() {
        this.f30696b.addListener(new ifx(this));
    }
}
