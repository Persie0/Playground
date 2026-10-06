package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bid implements bib {

    /* JADX INFO: renamed from: a */
    private final bmf f3403a;

    /* JADX INFO: renamed from: b */
    private float f3404b = -1.0f;

    public bid(List list) {
        this.f3403a = (bmf) list.get(0);
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: a */
    public final float mo2480a() {
        return this.f3403a.m2707b();
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: b */
    public final float mo2481b() {
        return this.f3403a.m2708c();
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: c */
    public final bmf mo2482c() {
        return this.f3403a;
    }

    @Override // p000.bib
    /* JADX INFO: renamed from: d */
    public final boolean mo2483d(float f) {
        if (this.f3404b == f) {
            return true;
        }
        this.f3404b = f;
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
        return !this.f3403a.m2710e();
    }
}
