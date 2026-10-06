package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f28064a;

    /* JADX INFO: renamed from: b */
    private final oju f28065b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f28066c;

    public hjw(oju ojuVar, oju ojuVar2, int i) {
        this.f28066c = i;
        this.f28064a = ojuVar;
        this.f28065b = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    public hjw(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f28066c = i;
        this.f28065b = ojuVar;
        this.f28064a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static hjw m10395a(oju ojuVar, oju ojuVar2) {
        return new hjw(ojuVar, ojuVar2, 11);
    }

    /* JADX INFO: renamed from: b */
    public static hjw m10396b(oju ojuVar, oju ojuVar2) {
        return new hjw(ojuVar, ojuVar2, 12);
    }

    /* JADX INFO: renamed from: c */
    public static hjw m10397c(oju ojuVar, oju ojuVar2) {
        return new hjw(ojuVar, ojuVar2, 17);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        jwn jwnVarM13637g;
        final int i = 5;
        switch (this.f28066c) {
            case 0:
                final Instrumentation instrumentation = (Instrumentation) this.f28064a.get();
                return new hkx() { // from class: hjv
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        Instrumentation instrumentation2 = instrumentation;
                        ViewfinderJankSession viewfinderJankSession = new ViewfinderJankSession();
                        instrumentation2.m4300f(viewfinderJankSession);
                        return viewfinderJankSession;
                    }
                };
            case 1:
                jvd jvdVar = (jvd) this.f28065b.get();
                CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.f28064a.get();
                hjx hjxVar = new hjx(jvdVar);
                jvh.m13561i(hjxVar.f28070d, new gjd(cameraActivityTiming, 9));
                return hjxVar;
            case 2:
                final Instrumentation instrumentation2 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar = (ksa) this.f28065b.get();
                final int i2 = 3;
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i2) {
                            case 0:
                                Instrumentation instrumentation3 = instrumentation2;
                                hlg hlgVar = new hlg(ksaVar);
                                instrumentation3.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation4 = instrumentation2;
                                hlc hlcVar = new hlc(ksaVar, hks.values());
                                instrumentation4.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation5 = instrumentation2;
                                hlc hlcVar2 = new hlc(ksaVar, hlj.values());
                                instrumentation5.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation6 = instrumentation2;
                                hlc hlcVar3 = new hlc(ksaVar, hkr.values());
                                instrumentation6.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation7 = instrumentation2;
                                hle hleVar = new hle(ksaVar);
                                instrumentation7.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation8 = instrumentation2;
                                hli hliVar = new hli(ksaVar);
                                instrumentation8.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 3:
                final Instrumentation instrumentation3 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar2 = (ksa) this.f28065b.get();
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i) {
                            case 0:
                                Instrumentation instrumentation4 = instrumentation3;
                                hlg hlgVar = new hlg(ksaVar2);
                                instrumentation4.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation5 = instrumentation3;
                                hlc hlcVar = new hlc(ksaVar2, hks.values());
                                instrumentation5.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation6 = instrumentation3;
                                hlc hlcVar2 = new hlc(ksaVar2, hlj.values());
                                instrumentation6.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation7 = instrumentation3;
                                hlc hlcVar3 = new hlc(ksaVar2, hkr.values());
                                instrumentation7.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation8 = instrumentation3;
                                hle hleVar = new hle(ksaVar2);
                                instrumentation8.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation9 = instrumentation3;
                                hli hliVar = new hli(ksaVar2);
                                instrumentation9.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 4:
                final Instrumentation instrumentation4 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar3 = (ksa) this.f28065b.get();
                final int i3 = 1;
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i3) {
                            case 0:
                                Instrumentation instrumentation5 = instrumentation4;
                                hlg hlgVar = new hlg(ksaVar3);
                                instrumentation5.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation6 = instrumentation4;
                                hlc hlcVar = new hlc(ksaVar3, hks.values());
                                instrumentation6.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation7 = instrumentation4;
                                hlc hlcVar2 = new hlc(ksaVar3, hlj.values());
                                instrumentation7.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation8 = instrumentation4;
                                hlc hlcVar3 = new hlc(ksaVar3, hkr.values());
                                instrumentation8.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation9 = instrumentation4;
                                hle hleVar = new hle(ksaVar3);
                                instrumentation9.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation10 = instrumentation4;
                                hli hliVar = new hli(ksaVar3);
                                instrumentation10.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 5:
                final Instrumentation instrumentation5 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar4 = (ksa) this.f28065b.get();
                final int i4 = 4;
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i4) {
                            case 0:
                                Instrumentation instrumentation6 = instrumentation5;
                                hlg hlgVar = new hlg(ksaVar4);
                                instrumentation6.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation7 = instrumentation5;
                                hlc hlcVar = new hlc(ksaVar4, hks.values());
                                instrumentation7.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation8 = instrumentation5;
                                hlc hlcVar2 = new hlc(ksaVar4, hlj.values());
                                instrumentation8.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation9 = instrumentation5;
                                hlc hlcVar3 = new hlc(ksaVar4, hkr.values());
                                instrumentation9.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation10 = instrumentation5;
                                hle hleVar = new hle(ksaVar4);
                                instrumentation10.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation11 = instrumentation5;
                                hli hliVar = new hli(ksaVar4);
                                instrumentation11.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 6:
                final Instrumentation instrumentation6 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar5 = (ksa) this.f28065b.get();
                final int i5 = 0;
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i5) {
                            case 0:
                                Instrumentation instrumentation7 = instrumentation6;
                                hlg hlgVar = new hlg(ksaVar5);
                                instrumentation7.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation8 = instrumentation6;
                                hlc hlcVar = new hlc(ksaVar5, hks.values());
                                instrumentation8.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation9 = instrumentation6;
                                hlc hlcVar2 = new hlc(ksaVar5, hlj.values());
                                instrumentation9.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation10 = instrumentation6;
                                hlc hlcVar3 = new hlc(ksaVar5, hkr.values());
                                instrumentation10.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation11 = instrumentation6;
                                hle hleVar = new hle(ksaVar5);
                                instrumentation11.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation12 = instrumentation6;
                                hli hliVar = new hli(ksaVar5);
                                instrumentation12.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 7:
                final Instrumentation instrumentation7 = (Instrumentation) this.f28064a.get();
                final ksa ksaVar6 = (ksa) this.f28065b.get();
                final int i6 = 2;
                return new hkx() { // from class: hkl
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i6) {
                            case 0:
                                Instrumentation instrumentation8 = instrumentation7;
                                hlg hlgVar = new hlg(ksaVar6);
                                instrumentation8.m4300f(hlgVar);
                                return hlgVar;
                            case 1:
                                Instrumentation instrumentation9 = instrumentation7;
                                hlc hlcVar = new hlc(ksaVar6, hks.values());
                                instrumentation9.m4300f(hlcVar);
                                return hlcVar;
                            case 2:
                                Instrumentation instrumentation10 = instrumentation7;
                                hlc hlcVar2 = new hlc(ksaVar6, hlj.values());
                                instrumentation10.m4300f(hlcVar2);
                                return hlcVar2;
                            case 3:
                                Instrumentation instrumentation11 = instrumentation7;
                                hlc hlcVar3 = new hlc(ksaVar6, hkr.values());
                                instrumentation11.m4300f(hlcVar3);
                                return hlcVar3;
                            case 4:
                                Instrumentation instrumentation12 = instrumentation7;
                                hle hleVar = new hle(ksaVar6);
                                instrumentation12.m4300f(hleVar);
                                return hleVar;
                            default:
                                Instrumentation instrumentation13 = instrumentation7;
                                hli hliVar = new hli(ksaVar6);
                                instrumentation13.m4300f(hliVar);
                                return hliVar;
                        }
                    }
                };
            case 8:
                return new lqc((kpa) this.f28065b.get(), (dhv) this.f28064a.get());
            case 9:
                return mxk.m17136H(new ets(this.f28064a, (AmbientModeSupport.AmbientController) this.f28065b.get(), 4, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
            case 10:
                return new hmp((hmr) this.f28064a.get(), (ScheduledExecutorService) this.f28065b.get());
            case 11:
                return new ihk((Context) this.f28064a.get(), (hst) this.f28065b.get());
            case 12:
                jwn jwnVar = (jwn) this.f28064a.get();
                dhv dhvVar = (dhv) this.f28065b.get();
                nbh nbhVar = hni.f28479a;
                if (!dhvVar.mo6184l(dib.f11351ce)) {
                    jwnVarM13637g = ivx.f32441d != null ? jwr.m13637g(fxo.m8928b(ivx.f32441d, hni.f28480b)) : jwr.m13637g(fxo.m8931e());
                } else if (ivx.f32441d == null) {
                    ((nbe) ((nbe) hni.f28479a.m17251b()).mo17276G((char) 3755)).mo17290o("Camera framework flag for Macro Focus was not found.");
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                } else {
                    jwnVarM13637g = fxo.m8932f(ivx.f32441d, jwr.m13640j(jwnVar, fod.f22915t));
                }
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            case 13:
                return ((dhv) this.f28065b.get()).mo6184l(dib.f11351ce) ? ((etl) this.f28064a).m7866a() : mqu.f41450a;
            case 14:
                return ((dhv) this.f28064a.get()).mo6184l(dib.f11351ce) ? ((etl) this.f28065b).m7866a() : mqu.f41450a;
            case 15:
                hah hahVar = (hah) this.f28064a.get();
                switch (((Integer) ((dhv) this.f28065b.get()).mo6173a(dib.f11228O).get()).intValue()) {
                    case 0:
                        return new jwf(hnp.OFF);
                    case 1:
                        return new jwf(hnp.AUTO);
                    case 2:
                        return new jwf(hnp.ON);
                    default:
                        return new jwf(hnp.m10514a(((Boolean) hahVar.mo10031c(gzy.f27055n)).booleanValue()));
                }
            case 16:
                return new hns(((ems) this.f28064a).get(), ((ckl) this.f28065b).m3838a());
            case 17:
                return ((dhv) this.f28065b.get()).mo6184l(did.f11436ao) ? mrm.m16829i((gny) this.f28064a.get()) : mqu.f41450a;
            case 18:
                dhv dhvVar2 = (dhv) this.f28065b.get();
                Object objM17136H = (dhvVar2.mo6184l(dhi.f11115b) && dhvVar2.mo6184l(dhi.f11119f) && dhvVar2.mo6184l(diy.f11744a)) ? mxk.m17136H((dgn) ohh.m18485a(this.f28064a).get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 19:
                Context contextM6830a = ((dws) this.f28065b).m6830a();
                Executor executor = (Executor) this.f28064a.get();
                nqf nqfVarM17621g = nqf.m17621g();
                executor.execute(new htj(contextM6830a, nqfVarM17621g));
                return nqfVarM17621g;
            default:
                return jbx.m12869n(new hri(((dki) this.f28065b).get().mo6314a(rgoX.ZEwchDtJPwz), (hlv) this.f28064a.get(), 5));
        }
    }
}
