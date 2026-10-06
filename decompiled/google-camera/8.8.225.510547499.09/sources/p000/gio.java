package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gio implements gib {

    /* JADX INFO: renamed from: b */
    private static final nbh f24897b = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/aaa/illumination/SelfieFlashIlluminationController");

    /* JADX INFO: renamed from: a */
    public final gwp f24898a;

    /* JADX INFO: renamed from: c */
    private final jvd f24899c;

    /* JADX INFO: renamed from: d */
    private final boolean f24900d;

    /* JADX INFO: renamed from: e */
    private int f24901e;

    /* JADX INFO: renamed from: f */
    private final Object f24902f = new Object();

    /* JADX INFO: renamed from: g */
    private final bkn f24903g;

    public gio(gwp gwpVar, jvd jvdVar, bkn bknVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24898a = gwpVar;
        this.f24899c = jvdVar;
        this.f24903g = bknVar;
        this.f24900d = dhvVar.mo6183k(dib.f11244aD);
    }

    @Override // p000.gib
    /* JADX INFO: renamed from: a */
    public final gia mo9273a(kfo kfoVar) {
        gin ginVar = new gin(0);
        try {
            synchronized (this.f24902f) {
                int i = this.f24901e + 1;
                this.f24901e = i;
                if (i == 1) {
                    kew kewVarMo14152a = kfoVar.mo14152a();
                    ((kir) kewVarMo14152a).f36197c = 5;
                    ((kir) kewVarMo14152a).f36199e = Integer.valueOf(true != this.f24900d ? 0 : 2);
                    nps npsVarMo14155d = kfoVar.mo14155d(((kir) kewVarMo14152a).m14365d());
                    final nqf nqfVarM17621g = nqf.m17621g();
                    this.f24899c.execute(new Runnable() { // from class: gik
                        @Override // java.lang.Runnable
                        public final void run() {
                            kxk.m14975U(this.f24892a.f24898a.mo9850b(), new gim(nqfVarM17621g), not.INSTANCE);
                        }
                    });
                    kxk.m14962H(npsVarMo14155d, nqfVarM17621g).get();
                    jay jayVar = (jay) nqfVarM17621g.get();
                    bkn bknVar = this.f24903g;
                    gec gecVar = new gec(jayVar.f33635a);
                    gig gigVar = new gig(gecVar);
                    ((ggs) bknVar.f3651a).m9230n(gigVar);
                    try {
                        gecVar.f24357a.mo2282d(new fro(bknVar, gigVar, 14, null, null, null), not.INSTANCE);
                        ((Boolean) gecVar.f24357a.get()).booleanValue();
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (CancellationException | ExecutionException | kec e2) {
            ((nbe) ((nbe) ((nbe) f24897b.m17251b()).mo17283h(e2)).mo17276G((char) 2679)).mo17290o("Couldn't turn on selfie flash");
        }
        return ginVar;
    }

    @Override // p000.gib
    /* JADX INFO: renamed from: b */
    public final void mo9274b() {
        synchronized (this.f24902f) {
            int i = this.f24901e;
            if (i > 0) {
                int i2 = i - 1;
                this.f24901e = i2;
                if (i2 == 0) {
                    this.f24899c.execute(new ghv(this, 8));
                }
            }
        }
    }
}
