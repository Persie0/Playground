package p000;

import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fit implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22150a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22151b;

    public /* synthetic */ fit(chw chwVar, int i) {
        this.f22151b = i;
        this.f22150a = chwVar;
    }

    public /* synthetic */ fit(ffl fflVar, int i) {
        this.f22151b = i;
        this.f22150a = fflVar;
    }

    public /* synthetic */ fit(fiv fivVar, int i) {
        this.f22151b = i;
        this.f22150a = fivVar;
    }

    public /* synthetic */ fit(fjg fjgVar, int i) {
        this.f22151b = i;
        this.f22150a = fjgVar;
    }

    public /* synthetic */ fit(fme fmeVar, int i) {
        this.f22151b = i;
        this.f22150a = fmeVar;
    }

    public /* synthetic */ fit(fmv fmvVar, int i) {
        this.f22151b = i;
        this.f22150a = fmvVar;
    }

    public fit(fnw fnwVar, int i, byte[] bArr) {
        this.f22151b = i;
        this.f22150a = fnwVar;
    }

    public fit(foc focVar, int i) {
        this.f22151b = i;
        this.f22150a = focVar;
    }

    public /* synthetic */ fit(gtd gtdVar, int i, byte[] bArr, byte[] bArr2) {
        this.f22151b = i;
        this.f22150a = gtdVar;
    }

    public /* synthetic */ fit(jww jwwVar, int i) {
        this.f22151b = i;
        this.f22150a = jwwVar;
    }

    public /* synthetic */ fit(oju ojuVar, int i) {
        this.f22151b = i;
        this.f22150a = ojuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fhp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v22, types: [elx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v11, types: [elw, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object ezcVar;
        glk glkVarM8367k;
        fxg fxgVar;
        int i = 10;
        int i2 = 11;
        switch (this.f22151b) {
            case 0:
                ?? r0 = this.f22150a;
                fiv fivVar = (fiv) r0;
                fivVar.f22169a.mo8333h();
                if (fivVar.f22174f.mo16813g()) {
                    ((fhq) fivVar.f22174f.mo16809c()).mo8448d(r0);
                }
                fivVar.f22176h = true;
                fivVar.f22172d.getLooper().quitSafely();
                fivVar.f22173e.getLooper().quitSafely();
                fivVar.f22188t.close();
                fivVar.f22184p.close();
                fivVar.f22185q.close();
                fivVar.f22183o.close();
                fivVar.f22170b.mo8469e();
                break;
            case 1:
                ((fiv) this.f22150a).m8476g();
                break;
            case 2:
                fiv fivVar2 = (fiv) this.f22150a;
                if (!fivVar2.f22187s) {
                    fivVar2.f22180l.set(0L);
                }
                fivVar2.f22187s = true;
                fivVar2.f22171c.m8459b(true);
                fivVar2.m8476g();
                break;
            case 3:
                ((fiv) this.f22150a).m8476g();
                break;
            case 4:
                fjg fjgVar = (fjg) this.f22150a;
                fjgVar.m8488f();
                kyt kytVar = fjgVar.f22226b;
                if (kytVar != null) {
                    fjgVar.f22226b = null;
                    kytVar.close();
                }
                AmbientModeSupport.AmbientController ambientController = fjgVar.f22227c;
                if (ambientController != null) {
                    ambientController.m1655e();
                    fjgVar.f22227c = null;
                }
                break;
            case 5:
                ((fjg) this.f22150a).m8488f();
                break;
            case 6:
                try {
                    ((fhy) this.f22150a.get()).mo8424c();
                } catch (RuntimeException e) {
                    ((nbe) ((nbe) ((nbe) fjn.f22272a.m17252c()).mo17283h(e)).mo17276G((char) 2347)).mo17290o("Prewarm of microvideo encoder failed... will try again later!");
                    return;
                }
                break;
            case 7:
                this.f22150a.mo3415bf(true);
                break;
            case 8:
                this.f22150a.mo3415bf(false);
                break;
            case 9:
                ((gtd) this.f22150a).f26335b.mo3415bf(true);
                break;
            case 10:
                fme fmeVar = (fme) this.f22150a;
                if (!fmeVar.f22551g) {
                    fmeVar.f22551g = true;
                    fmeVar.f22545a.mo3415bf(false);
                    kba kbaVar = fmeVar.f22549e;
                    if (kbaVar != null) {
                        kbaVar.close();
                    }
                    kba kbaVar2 = fmeVar.f22550f;
                    if (kbaVar2 != null) {
                        kbaVar2.close();
                    }
                }
                break;
            case 11:
                ffl fflVar = (ffl) this.f22150a;
                if (!fflVar.f21669o) {
                    if (fflVar.f21666l.mo6184l(dib.f11317bX)) {
                        fflVar.f21655a.mo11230b().performHapticFeedback(0);
                    }
                    fflVar.f21669o = true;
                    jvd jvdVar = fflVar.f21665k;
                    iey ieyVar = fflVar.f21663i;
                    ieyVar.getClass();
                    jvdVar.m13541c(new fdo(ieyVar, i));
                    fflVar.f21663i.mo11162e();
                    fflVar.f21675u.m6079c(false);
                    fflVar.f21658d.mo11023v(false);
                    fflVar.f21674t.m10697b(true);
                    fflVar.f21674t.m10699d(true);
                    fflVar.f21662h.mo9127m();
                    fflVar.f21661g.startLongShot();
                    ljf ljfVar = fflVar.f21677w;
                    ?? r1 = ljfVar.f38370b;
                    if (((Boolean) ljfVar.f38371c.mo3831be()).booleanValue() && (glkVarM8367k = ((ffq) ljfVar.f38372d).m8367k()) != null && ((kmr) glkVarM8367k.f25502c).mo14541J() && ((fxgVar = (fxg) glkVarM8367k.f25503d.mo3831be()) == fxg.HDR_PLUS_WITH_TORCH || fxgVar == fxg.NORMAL_WITH_FLASH)) {
                        ljfVar.f38375g.mo7482d(ljfVar.f38373e);
                        ezcVar = new ezc(ljfVar, 2, (byte[]) null, (byte[]) null, (byte[]) null);
                    } else {
                        ezcVar = cgw.f5703p;
                    }
                    r1.add(ezcVar);
                    fflVar.f21655a.mo11207O();
                    fflVar.f21657c.mo10853f();
                    fflVar.f21664j.mo9213a(ffl.class);
                    fflVar.f21656b.mo11766q(true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (fflVar.f21668n != null) {
                        fflVar.f21668n.cancel(false);
                    }
                    fflVar.f21668n = fflVar.f21659e.scheduleAtFixedRate(new eqd(fflVar, jCurrentTimeMillis, 3), 1L, 1L, TimeUnit.SECONDS);
                    if (fflVar.f21671q) {
                        fflVar.m8352a();
                    }
                    break;
                }
                break;
            case 12:
                fmv fmvVar = (fmv) this.f22150a;
                Handler handler = fmvVar.f22689b;
                ffl fflVar2 = fmvVar.f22688a;
                fflVar2.getClass();
                handler.post(new fit(fflVar2, i2));
                break;
            case 13:
                ((chw) this.f22150a).mo3777k();
                break;
            case 14:
                foc focVar = (foc) this.f22150a;
                if (!focVar.f22881l) {
                    focVar.f22822A.mo10787cd();
                }
                break;
            case 15:
                mhs mhsVar = new mhs(((foc) this.f22150a).f22888s.mo3705s(), ((foc) this.f22150a).f22827F);
                mhsVar.m16389q(C0100R.string.dialog_ok, new cdo(this, 10, (byte[]) null));
                mhsVar.m16386n(C0100R.string.dialog_cancel, new fns(1));
                if (((foc) this.f22150a).f22825D.mo3831be() == ikw.PHOTO_SPHERE) {
                    mhsVar.m16384l(C0100R.string.cancel_photo_sphere);
                } else {
                    mhsVar.m16384l(C0100R.string.cancel_panorama);
                }
                mhsVar.m16383k(true);
                ((foc) this.f22150a).f22831J = mhsVar.mo7256b();
                ((foc) this.f22150a).f22831J.show();
                break;
            case 16:
                mhs mhsVar2 = new mhs(((foc) this.f22150a).f22888s.mo3705s(), ((foc) this.f22150a).f22827F);
                mhsVar2.m16389q(C0100R.string.dialog_ok, new cdo(this, 11, (char[]) null));
                mhsVar2.m16386n(C0100R.string.dialog_cancel, new fns(0));
                mhsVar2.m16384l(C0100R.string.photosphere_fisheye_confirm_dialog);
                mhsVar2.m16383k(true);
                ((foc) this.f22150a).f22832K = mhsVar2.mo7256b();
                ((foc) this.f22150a).f22832K.show();
                break;
            case 17:
                ((foc) this.f22150a).f22822A.mo10785c();
                break;
            case 18:
                ((foc) this.f22150a).f22822A.mo10783a();
                break;
            case 19:
                ((foc) ((fnw) this.f22150a).f22811a).m8612C();
                ((foc) ((fnw) this.f22150a).f22811a).m8619w();
                break;
            default:
                DialogInterfaceC0155eg dialogInterfaceC0155eg = ((foc) this.f22150a).f22831J;
                if (dialogInterfaceC0155eg != null) {
                    dialogInterfaceC0155eg.dismiss();
                }
                DialogInterfaceC0155eg dialogInterfaceC0155eg2 = ((foc) this.f22150a).f22832K;
                if (dialogInterfaceC0155eg2 != null) {
                    dialogInterfaceC0155eg2.dismiss();
                }
                break;
        }
    }
}
