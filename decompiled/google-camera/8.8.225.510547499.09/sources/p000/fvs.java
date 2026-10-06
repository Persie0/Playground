package p000;

import android.util.DisplayMetrics;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvs {

    /* JADX INFO: renamed from: a */
    public static final nbh f23675a = nbh.m17259h("com/google/android/apps/camera/one/capture/CaptureOneCameraCreator");

    /* JADX INFO: renamed from: b */
    public final nps f23676b;

    /* JADX INFO: renamed from: c */
    public final jvd f23677c;

    /* JADX INFO: renamed from: d */
    public final Executor f23678d;

    /* JADX INFO: renamed from: e */
    public final gdc f23679e;

    /* JADX INFO: renamed from: f */
    public final gwp f23680f;

    /* JADX INFO: renamed from: g */
    public final DisplayMetrics f23681g;

    /* JADX INFO: renamed from: h */
    public final CameraActivityTiming f23682h;

    /* JADX INFO: renamed from: i */
    public final hkx f23683i;

    /* JADX INFO: renamed from: j */
    public final jww f23684j;

    /* JADX INFO: renamed from: k */
    public final mrm f23685k;

    /* JADX INFO: renamed from: l */
    public final ikw f23686l;

    /* JADX INFO: renamed from: m */
    public final dbr f23687m;

    /* JADX INFO: renamed from: n */
    public final mrm f23688n;

    /* JADX INFO: renamed from: o */
    public final cgu f23689o;

    /* JADX INFO: renamed from: p */
    public final fve f23690p;

    /* JADX INFO: renamed from: q */
    public final dhv f23691q;

    /* JADX INFO: renamed from: r */
    public fvr f23692r;

    /* JADX INFO: renamed from: s */
    public final kms f23693s;

    /* JADX INFO: renamed from: t */
    public final grz f23694t;

    /* JADX INFO: renamed from: u */
    public final lqc f23695u;

    /* JADX INFO: renamed from: v */
    public final glk f23696v;

    /* JADX INFO: renamed from: w */
    private final kcu f23697w;

    /* JADX INFO: renamed from: x */
    private final jwn f23698x;

    public fvs(jvd jvdVar, grz grzVar, gwp gwpVar, Executor executor, gdc gdcVar, kms kmsVar, DisplayMetrics displayMetrics, CameraActivityTiming cameraActivityTiming, hkx hkxVar, dbr dbrVar, kcu kcuVar, mrm mrmVar, dhv dhvVar, cgu cguVar, jww jwwVar, nps npsVar, fve fveVar, jwn jwnVar, glk glkVar, mrm mrmVar2, lqc lqcVar, ikw ikwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23677c = jvdVar;
        this.f23694t = grzVar;
        this.f23678d = executor;
        this.f23679e = gdcVar;
        this.f23680f = gwpVar;
        this.f23693s = kmsVar;
        this.f23681g = displayMetrics;
        this.f23682h = cameraActivityTiming;
        this.f23683i = hkxVar;
        this.f23684j = jwwVar;
        this.f23696v = glkVar;
        this.f23685k = mrmVar2;
        this.f23695u = lqcVar;
        this.f23686l = ikwVar;
        this.f23687m = dbrVar;
        this.f23697w = kcuVar;
        this.f23688n = mrmVar;
        this.f23689o = cguVar;
        this.f23676b = npsVar;
        this.f23690p = fveVar;
        this.f23698x = jwnVar;
        this.f23691q = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final fmj m8836a(flz flzVar) {
        this.f23693s.m14581f(flzVar.f22529a);
        return new fmj(flzVar, new fmf(flzVar.f22529a, flzVar.f22532d.f31019a, flzVar.f22531c, ((Boolean) this.f23698x.mo3831be()).booleanValue()));
    }

    /* JADX INFO: renamed from: b */
    public final nps m8837b(flz flzVar, nps npsVar) {
        return m8838c(m8836a(flzVar), npsVar);
    }

    /* JADX INFO: renamed from: c */
    public final nps m8838c(final fmj fmjVar, final nps npsVar) {
        this.f23697w.mo13987d(fmjVar.f22561a.f22529a);
        return kxk.m14970P(new nol() { // from class: fvp
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, nps] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kbz] */
            /* JADX WARN: Type inference failed for: r11v3, types: [fve, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v13, types: [ewe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kbz] */
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                fue etgVar;
                fvs fvsVar = this.f23668a;
                fmj fmjVar2 = fmjVar;
                nps npsVar2 = npsVar;
                fvr fvrVar = fvsVar.f23692r;
                if (fvrVar != null && fmjVar2.f22562b.equals(fvrVar.f23671a)) {
                    Future future = fvrVar.f23674d;
                    try {
                        if ((!future.isDone() || ((ihw) future.get()).f31016a.isValid()) && !fvrVar.f23672b.mo8573g()) {
                            fvr fvrVar2 = fvsVar.f23692r;
                            fvrVar2.getClass();
                            return fvrVar2.f23673c;
                        }
                    } catch (InterruptedException e) {
                    } catch (ExecutionException e2) {
                    }
                }
                fvsVar.m8840e();
                try {
                    mrm mrmVarMo16808b = fvsVar.f23685k.mo16808b(fod.f22899d);
                    flz flzVar = fmjVar2.f22561a;
                    fvu fvuVarM14581f = fvsVar.f23693s.m14581f(flzVar.f22529a);
                    nps npsVarM17554j = nod.m17554j(npsVar2, new lqt(fvsVar, fmjVar2, mrmVarMo16808b, fvuVarM14581f, 1), fvsVar.f23677c);
                    OneCameraTiming oneCameraTiming = (OneCameraTiming) fvsVar.f23683i.mo10394a();
                    kbc kbcVar = flzVar.f22531c;
                    fws fwsVar = new fws(flzVar, npsVarM17554j, fvsVar.f23681g, fvsVar.f23680f, fvsVar.f23695u, fvsVar.f23686l, fvsVar.f23679e, fvsVar.f23687m, mrmVarMo16808b, fvsVar.f23688n, fvsVar.f23689o, fvsVar.f23676b, fvsVar.f23690p, null);
                    oneCameraTiming.m10437h(hkv.ONECAMERA_CREATE);
                    oneCameraTiming.f6970a.mo13961e("OneCamera#create");
                    kmg kmgVar = flzVar.f22529a;
                    kba kbaVarM9694c = fvsVar.f23694t.m9694c();
                    glk glkVar = fvsVar.f23696v;
                    kms kmsVar = fvsVar.f23693s;
                    dhv dhvVar = fvsVar.f23691q;
                    glkVar.f25502c.mo13961e("OneCameraDependencies#new");
                    bkn bknVar = new bkn(fvuVarM14581f);
                    try {
                        fvu fvuVarM9446h = gls.m9446h(fvuVarM14581f.mo14556i(), kmsVar, glkVar.f25501b, dhvVar);
                        kan kanVarM11542n = inr.m11542n(((fmz) glkVar.f25503d).m8600d(fvuVarM14581f.mo14558k()));
                        fxh fxhVarMo7815C = glkVar.f25500a.mo7815C(bknVar, fwsVar, new bkn(gdz.m9082a(fvuVarM9446h, !kan.m13874k(kbcVar.f35517a, kbcVar.f35518b).m13883m(kanVarM11542n) ? kbc.m13902g(kanVarM11542n.m13879e(kbcVar)) : kbcVar, 35)));
                        glkVar.f25502c.mo13962f();
                        Object obj = fwsVar.f23769f;
                        if (obj == ikw.PORTRAIT) {
                            etgVar = new etk(((etf) fxhVarMo7815C).f17364a, ((etf) fxhVarMo7815C).f17365b);
                        } else if (obj == ikw.LONG_EXPOSURE) {
                            etgVar = new eth(((etf) fxhVarMo7815C).f17364a, ((etf) fxhVarMo7815C).f17365b);
                        } else if (obj == ikw.MOTION_BLUR) {
                            etgVar = new eti(((etf) fxhVarMo7815C).f17364a, ((etf) fxhVarMo7815C).f17365b);
                        } else {
                            etgVar = obj == ikw.IMAGE_INTENT ? new etg(((etf) fxhVarMo7815C).f17364a, ((etf) fxhVarMo7815C).f17365b) : new etj(((etf) fxhVarMo7815C).f17364a, ((etf) fxhVarMo7815C).f17365b);
                        }
                        fuc fucVarMo7848a = etgVar.mo7848a();
                        oneCameraTiming.m10437h(hkv.ONECAMERA_CREATED);
                        oneCameraTiming.f6970a.mo13962f();
                        fucVarMo7848a.mo8574h().m13537d(kbaVarM9694c);
                        fucVarMo7848a.mo8574h().m13537d(new ezc(npsVarM17554j, 12));
                        if (mrmVarMo16808b.mo16813g()) {
                            fucVarMo7848a.mo8574h().m13537d((ipp) mrmVarMo16808b.mo16809c());
                        }
                        jvh.m13562j(fucVarMo7848a.mo8575i().f39914b, new cis(fvsVar, 20), not.INSTANCE);
                        oneCameraTiming.m10437h(hkv.ONECAMERA_START);
                        oneCameraTiming.f6971b = oneCameraTiming.f6970a.mo13957a("OneCamera#start");
                        nps npsVarM17553i = nod.m17553i(nnj.m17524j(fucVarMo7848a.mo8571e(), Throwable.class, new cqc(fucVarMo7848a, kbaVarM9694c, 2), not.INSTANCE), new fye(kbaVarM9694c, oneCameraTiming, fucVarMo7848a, 1), fvsVar.f23678d);
                        fmf fmfVar = fmjVar2.f22562b;
                        if (fucVarMo7848a == null) {
                            throw new NullPointerException("Null camera");
                        }
                        fvsVar.f23692r = new fvr(fmfVar, fucVarMo7848a, npsVarM17553i, npsVarM17554j);
                        return fvsVar.f23692r.f23673c;
                    } catch (gdy e3) {
                        throw new IllegalStateException("Unable to access OneCamera.", e3);
                    }
                } catch (RuntimeException e4) {
                    return kxk.m14964J(e4);
                }
            }
        }, this.f23678d);
    }

    /* JADX INFO: renamed from: d */
    public final void m8839d() {
        this.f23678d.execute(new fnx(this, 17));
    }

    /* JADX INFO: renamed from: e */
    public final void m8840e() {
        fvr fvrVar = this.f23692r;
        if (fvrVar == null) {
            return;
        }
        fvrVar.m8835a();
        this.f23692r = null;
    }
}
