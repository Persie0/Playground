package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwh implements bqt {

    /* JADX INFO: renamed from: a */
    private final bqt f4651a;

    /* JADX INFO: renamed from: b */
    private final Resources f4652b;

    public bwh(Resources resources, bqt bqtVar) {
        bzq.m3278r(resources);
        this.f4652b = resources;
        bzq.m3278r(bqtVar);
        this.f4651a = bqtVar;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        return bxk.m3161f(this.f4652b, this.f4651a.mo2930a(obj, i, i2, bqrVar));
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final boolean mo2931b(Object obj, bqr bqrVar) {
        return this.f4651a.mo2931b(obj, bqrVar);
    }
}
