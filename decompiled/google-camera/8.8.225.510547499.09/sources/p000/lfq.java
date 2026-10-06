package p000;

import android.media.MediaFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfq implements lfp {

    /* JADX INFO: renamed from: b */
    public final nqf f38158b = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    private final lfk f38159c;

    public lfq(lfk lfkVar) {
        this.f38159c = lfkVar;
    }

    @Override // p000.lfp
    /* JADX INFO: renamed from: a */
    public final void mo15285a(leq leqVar) {
        this.f38159c.mo8409b(leqVar.f38073b, leqVar.f38074c);
        leqVar.close();
    }

    @Override // p000.lfp
    /* JADX INFO: renamed from: b */
    public final void mo15286b(MediaFormat mediaFormat) {
        this.f38158b.mo14894e(mediaFormat);
    }
}
