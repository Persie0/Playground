package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etr implements hjk {

    /* JADX INFO: renamed from: a */
    public final ohb f19861a;

    /* JADX INFO: renamed from: b */
    private final ohb f19862b;

    /* JADX INFO: renamed from: c */
    private final nqf f19863c;

    /* JADX INFO: renamed from: d */
    private final ohb f19864d;

    /* JADX INFO: renamed from: e */
    private final ohb f19865e;

    /* JADX INFO: renamed from: f */
    private final iht f19866f;

    /* JADX INFO: renamed from: g */
    private final jww f19867g;

    /* JADX INFO: renamed from: h */
    private final jvd f19868h;

    /* JADX INFO: renamed from: i */
    private final kbz f19869i;

    /* JADX INFO: renamed from: j */
    private final bko f19870j;

    public etr(bko bkoVar, nqf nqfVar, ohb ohbVar, iht ihtVar, ohb ohbVar2, ohb ohbVar3, ohb ohbVar4, jww jwwVar, jvd jvdVar, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f19870j = bkoVar;
        this.f19862b = ohbVar;
        this.f19863c = nqfVar;
        this.f19864d = ohbVar3;
        this.f19865e = ohbVar4;
        this.f19866f = ihtVar;
        this.f19861a = ohbVar2;
        this.f19867g = jwwVar;
        this.f19868h = jvdVar;
        this.f19869i = kbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19869i.mo13961e(EArqVBjecl.HqPJBfmpcXZW);
        this.f19867g.mo3415bf(gzp.f26957e);
        if (cds.m3511j(this.f19870j.m2611e())) {
            ((dbr) this.f19862b.get()).m5898g(kmq.f36557a);
        }
        this.f19863c.mo14894e(this.f19866f);
        this.f19869i.mo13963g("EssentialUiInit#prewarm");
        this.f19865e.get();
        this.f19864d.get();
        this.f19869i.mo13962f();
        this.f19868h.execute(this.f19869i.mo13959c("EssentialUiInit#wire", new esc(this, 8)));
    }
}
