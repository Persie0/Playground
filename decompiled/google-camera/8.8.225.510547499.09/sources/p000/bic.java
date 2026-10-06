package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bic implements bib {

    /* JADX INFO: renamed from: a */
    private final List f3399a;

    /* JADX INFO: renamed from: c */
    private bmf f3401c = null;

    /* JADX INFO: renamed from: d */
    private float f3402d = -1.0f;

    /* JADX INFO: renamed from: b */
    private bmf f3400b = m2486g(0.0f);

    public bic(List list) {
        this.f3399a = list;
    }

    /* JADX INFO: renamed from: g */
    private final bmf m2486g(float f) {
        List list = this.f3399a;
        bmf bmfVar = (bmf) list.get(list.size() - 1);
        if (f >= bmfVar.m2708c()) {
            return bmfVar;
        }
        for (int size = this.f3399a.size() - 2; size > 0; size--) {
            bmf bmfVar2 = (bmf) this.f3399a.get(size);
            if (this.f3400b != bmfVar2 && bmfVar2.m2709d(f)) {
                return bmfVar2;
            }
        }
        return (bmf) this.f3399a.get(0);
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: a */
    public final float mo2480a() {
        List list = this.f3399a;
        return ((bmf) list.get(list.size() - 1)).m2707b();
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: b */
    public final float mo2481b() {
        return ((bmf) this.f3399a.get(0)).m2708c();
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: c */
    public final bmf mo2482c() {
        return this.f3400b;
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: d */
    public final boolean mo2483d(float f) {
        bmf bmfVar = this.f3401c;
        bmf bmfVar2 = this.f3400b;
        if (bmfVar == bmfVar2 && this.f3402d == f) {
            return true;
        }
        this.f3401c = bmfVar2;
        this.f3402d = f;
        return false;
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: e */
    public final boolean mo2484e() {
        return false;
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: f */
    public final boolean mo2485f(float f) {
        if (this.f3400b.m2709d(f)) {
            return !this.f3400b.m2710e();
        }
        this.f3400b = m2486g(f);
        return true;
    }
}
