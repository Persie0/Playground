package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaFormat;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f15209a;

    /* JADX INFO: renamed from: b */
    private final oju f15210b;

    /* JADX INFO: renamed from: c */
    private final oju f15211c;

    /* JADX INFO: renamed from: d */
    private final oju f15212d;

    /* JADX INFO: renamed from: e */
    private final oju f15213e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f15214f;

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f15214f = i;
        this.f15209a = ojuVar;
        this.f15210b = ojuVar2;
        this.f15211c = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f15214f = i;
        this.f15209a = ojuVar;
        this.f15210b = ojuVar2;
        this.f15213e = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15211c = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f15214f = i;
        this.f15209a = ojuVar;
        this.f15212d = ojuVar2;
        this.f15210b = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15211c = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f15214f = i;
        this.f15211c = ojuVar;
        this.f15212d = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15210b = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr, byte[] bArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15212d = ojuVar3;
        this.f15209a = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[] fArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15212d = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[] iArr) {
        this.f15214f = i;
        this.f15212d = ojuVar;
        this.f15211c = ojuVar2;
        this.f15210b = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15209a = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15212d = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15209a = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[] zArr) {
        this.f15214f = i;
        this.f15211c = ojuVar;
        this.f15209a = ojuVar2;
        this.f15212d = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15210b = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][] bArr) {
        this.f15214f = i;
        this.f15211c = ojuVar;
        this.f15210b = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][] cArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15212d = ojuVar3;
        this.f15209a = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][] fArr) {
        this.f15214f = i;
        this.f15213e = ojuVar;
        this.f15210b = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15211c = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][] iArr) {
        this.f15214f = i;
        this.f15211c = ojuVar;
        this.f15212d = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15210b = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][] sArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15213e = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15209a = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][] zArr) {
        this.f15214f = i;
        this.f15212d = ojuVar;
        this.f15209a = ojuVar2;
        this.f15210b = ojuVar3;
        this.f15211c = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][][] bArr) {
        this.f15214f = i;
        this.f15209a = ojuVar;
        this.f15210b = ojuVar2;
        this.f15211c = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15212d = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][][] cArr) {
        this.f15214f = i;
        this.f15209a = ojuVar;
        this.f15213e = ojuVar2;
        this.f15210b = ojuVar3;
        this.f15211c = ojuVar4;
        this.f15212d = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][][] fArr) {
        this.f15214f = i;
        this.f15213e = ojuVar;
        this.f15212d = ojuVar2;
        this.f15209a = ojuVar3;
        this.f15211c = ojuVar4;
        this.f15210b = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][][] iArr) {
        this.f15214f = i;
        this.f15213e = ojuVar;
        this.f15211c = ojuVar2;
        this.f15210b = ojuVar3;
        this.f15212d = ojuVar4;
        this.f15209a = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][][] sArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15211c = ojuVar2;
        this.f15212d = ojuVar3;
        this.f15209a = ojuVar4;
        this.f15213e = ojuVar5;
    }

    public eqq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][][] zArr) {
        this.f15214f = i;
        this.f15210b = ojuVar;
        this.f15212d = ojuVar2;
        this.f15211c = ojuVar3;
        this.f15213e = ojuVar4;
        this.f15209a = ojuVar5;
    }

    /* JADX INFO: renamed from: a */
    public static eqq m7702a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static eqq m7703b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static eqq m7704c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static eqq m7705d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new eqq(ojuVar, ojuVar2, ojuVar4, ojuVar5, ojuVar6, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static eqq m7706e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static eqq m7707f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 16, (int[][][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static eqq m7708g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 17, (boolean[][][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static eqq m7709h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new eqq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 19, (byte[]) null, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        jwn jwnVarM13640j;
        switch (this.f15214f) {
            case 0:
                return new drj(ohh.m18485a(this.f15209a), (gva) this.f15210b.get(), (nsz) this.f15211c.get(), ((ntb) this.f15212d).get(), (kbz) this.f15213e.get(), (byte[]) null);
            case 1:
                return new epc(((dws) this.f15209a).m6830a(), (hst) this.f15210b.get(), (jfs) this.f15213e.get(), (dhv) this.f15212d.get(), (kpb) this.f15211c.get(), null, null, null);
            case 2:
                ikw ikwVarM11415a = ((ikv) this.f15211c).m11415a();
                ohb ohbVarM18485a = ohh.m18485a(this.f15212d);
                ohb ohbVarM18485a2 = ohh.m18485a(this.f15209a);
                npu npuVar = (npu) this.f15210b.get();
                kbz kbzVar = (kbz) this.f15213e.get();
                ikw ikwVar = ikw.PHOTO;
                if (ikwVarM11415a != ikwVar && ikwVarM11415a != ikw.IMAGE_INTENT) {
                    return ciz.f5911a;
                }
                if (ikwVarM11415a != ikwVar) {
                    ohbVarM18485a = ohbVarM18485a2;
                }
                return new dql(npuVar, kbzVar, ohbVarM18485a, 3);
            case 3:
                ohb ohbVarM18485a3 = ohh.m18485a(this.f15210b);
                ohb ohbVarM18485a4 = ohh.m18485a(this.f15211c);
                ohb ohbVarM18485a5 = ohh.m18485a(this.f15212d);
                ohh.m18485a(this.f15213e);
                dhv dhvVar = (dhv) this.f15209a.get();
                ArrayList arrayList = new ArrayList();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6175c();
                arrayList.add((fcq) ohbVarM18485a3.get());
                if (dhvVar.mo6184l(dib.f11254aN)) {
                    arrayList.add((fcq) ohbVarM18485a4.get());
                }
                if (dhvVar.mo6184l(dib.f11253aM)) {
                    arrayList.add((fcq) ohbVarM18485a5.get());
                }
                dhvVar.mo6175c();
                return new fcf(arrayList);
            case 4:
                return new fdj(((dws) this.f15212d).m6830a(), (hst) this.f15211c.get(), ((crv) this.f15210b).m5442a(), (dhv) this.f15213e.get(), (jww) this.f15209a.get());
            case 5:
                return new fdp(((dww) this.f15211c).m6836a(), (fly) this.f15209a.get(), (hah) this.f15212d.get(), (jfs) this.f15213e.get(), (idf) this.f15210b.get(), null, null, null);
            case 6:
                return new fds((chk) this.f15210b.get(), ((dww) this.f15211c).m6836a(), (ggm) this.f15209a.get(), (gye) this.f15213e.get(), (jwn) this.f15212d.get());
            case 7:
                dhv dhvVar2 = (dhv) this.f15211c.get();
                MediaFormat mediaFormatM8491a = fjo.m8491a();
                mrm mrmVar = (mrm) this.f15210b.get();
                mrm mrmVar2 = (mrm) this.f15209a.get();
                return new fhh(dhvVar2, mediaFormatM8491a, mrmVar, mrmVar2, (Executor) this.f15213e.get());
            case 8:
                dsx dsxVar = ((dms) this.f15210b).get();
                lqc lqcVar = ((fxb) this.f15211c).get();
                final oju ojuVar = this.f15212d;
                final oju ojuVar2 = this.f15209a;
                final kbz kbzVar2 = (kbz) this.f15213e.get();
                try {
                    kbzVar2.mo13961e("MICRO_GyroModule#providesShutdownTasks");
                    Object objM17136H = (dsxVar.m6692g() && lqcVar.f38949a) ? mxk.m17136H(new gad() { // from class: fjr
                        @Override // p000.gad, java.lang.Runnable
                        public final void run() {
                            kbz kbzVar3 = kbzVar2;
                            oju ojuVar3 = ojuVar2;
                            oju ojuVar4 = ojuVar;
                            kbzVar3.mo13961e("MICRO_GyroModule#stopGyroCapture");
                            ((dxx) ojuVar3.get()).m6890f((dxy) ojuVar4.get());
                            kbzVar3.mo13962f();
                        }
                    }) : mzx.f41874a;
                    kbzVar2.mo13962f();
                    objM17136H.getClass();
                    return objM17136H;
                } catch (Throwable th) {
                    kbzVar2.mo13962f();
                    throw th;
                }
            case 9:
                return new fon((dbr) this.f15210b.get(), (kms) this.f15211c.get(), (iht) this.f15213e.get(), ((crv) this.f15212d).m5442a(), (jwn) this.f15209a.get());
            case 10:
                gtd gtdVar = (gtd) this.f15211c.get();
                oju ojuVar3 = this.f15212d;
                dhv dhvVar3 = (dhv) this.f15209a.get();
                cwd cwdVar = (cwd) this.f15210b.get();
                kby kbyVar = new kby((kbz) this.f15213e.get(), "PhotoSphereModule#providePhotoSphereAgent");
                try {
                    Object objM16829i = (!dhvVar3.mo6184l(din.f11642b) || cwdVar.m5649G().getSensorList(4).isEmpty() || fex.m8318a((ActivityManager) cwd.m5639H((Context) cwdVar.f9866a, "activity"))) ? mqu.f41450a : mrm.m16829i(new gtd(gtdVar, ojuVar3, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar.close();
                    return objM16829i;
                } catch (Throwable th2) {
                    try {
                        kbyVar.close();
                        break;
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th2;
                }
            case 11:
                return new FastMomentsHdrImpl(((kbm) this.f15212d).get(), (Gcam) this.f15209a.get(), (Executor) this.f15210b.get(), (nsz) this.f15211c.get(), (ckp) this.f15213e.get());
            case 12:
                gti gtiVar = (gti) this.f15213e.get();
                return new fsa(gtiVar, ((dms) this.f15209a).get(), ((kbm) this.f15212d).get(), (dhv) this.f15211c.get(), null, null);
            case 13:
                jvb jvbVar = (jvb) this.f15209a.get();
                jvb jvbVar2 = (jvb) this.f15210b.get();
                fvy fvyVar = new fvy(((dki) this.f15211c).get(), (kbz) this.f15213e.get(), (jvd) this.f15212d.get());
                jvbVar.m13537d(new ezc(fvyVar, 15));
                jvbVar2.m13537d(new ezc(fvyVar, 16));
                return fvyVar;
            case 14:
                kbn kbnVar = ((dki) this.f15209a).get();
                final kbz kbzVar3 = (kbz) this.f15213e.get();
                final Executor executor = (Executor) this.f15210b.get();
                final nqf nqfVar = (nqf) this.f15211c.get();
                final oju ojuVar4 = this.f15212d;
                kbnVar.mo6314a("PictureTakerModule").mo13940b("RootImageCommand requested");
                return dez.m6036f(new Runnable() { // from class: gbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        Executor executor2 = executor;
                        kbz kbzVar4 = kbzVar3;
                        final nqf nqfVar2 = nqfVar;
                        final oju ojuVar5 = ojuVar4;
                        executor2.execute(kbzVar4.mo13959c("PictureTaker", new Runnable() { // from class: gbm
                            @Override // java.lang.Runnable
                            public final void run() {
                                nqfVar2.mo14894e(((gbp) ojuVar5).get());
                            }
                        }));
                    }
                }, "taker");
            case 15:
                dhv dhvVar4 = (dhv) this.f15210b.get();
                ihk ihkVar = ((haj) this.f15211c).get();
                hah hahVar = (hah) this.f15212d.get();
                gdc gdcVar = (gdc) this.f15209a.get();
                hmw hmwVar = (hmw) this.f15213e.get();
                gdb gdbVar = gcv.f24243a;
                if (!dhvVar4.mo6184l(dil.f11632r)) {
                    return jwv.m13644a(Boolean.FALSE);
                }
                jww jwwVarM11349q = ihkVar.m11349q("pref_camera_raw_output_key", false);
                gdcVar.mo3830a(new gcu(jwwVarM11349q, 1), not.INSTANCE);
                jwwVarM11349q.mo3830a(new gcu(gdcVar, 0), not.INSTANCE);
                jww jwwVarM13645b = jwv.m13645b(jwwVarM11349q, new etx(hmwVar, 10), fod.f22904i);
                return dhvVar4.mo6184l(dib.f11305bL) ? jwv.m13645b(jwwVarM13645b, new etx(hahVar, 11), fod.f22905j) : jwwVarM13645b;
            case 16:
                jvb jvbVar3 = (jvb) this.f15213e.get();
                ecq ecqVar = (ecq) this.f15211c.get();
                gde gdeVar = new gde(ecqVar, new dks((edk) this.f15212d.get(), (eby) this.f15209a.get(), 3));
                jvbVar3.m13537d(gdeVar);
                return gdeVar;
            case 17:
                oju ojuVar5 = this.f15210b;
                dhv dhvVar5 = (dhv) this.f15212d.get();
                oju ojuVar6 = this.f15211c;
                oju ojuVar7 = this.f15213e;
                kmd kmdVar = ((fxk) this.f15209a).get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar5.mo6175c();
                if (geg.m9089g(kmdVar, dhvVar5)) {
                    boolean z = ((kpa) ojuVar5.get()).f36761d;
                    jwnVarM13640j = jwr.m13640j((jwn) ojuVar6.get(), new etx(ojuVar7, 13));
                } else {
                    jwnVarM13640j = jwr.m13640j((jwn) ojuVar6.get(), fod.f22907l);
                }
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 18:
                return new gfq((hai) this.f15213e.get(), ((dww) this.f15212d).m6836a(), ((iig) this.f15209a).get(), (dhv) this.f15211c.get(), (fmz) this.f15210b.get());
            case 19:
                dhv dhvVar6 = (dhv) this.f15209a.get();
                jvb jvbVar4 = (jvb) this.f15212d.get();
                kfk kfkVar = (kfk) this.f15210b.get();
                mrm mrmVar3 = (mrm) this.f15213e.get();
                ebv ebvVar = (ebv) this.f15211c.get();
                if (!mrmVar3.mo16813g()) {
                    return mqu.f41450a;
                }
                kfc kfcVarMo14131r = kfkVar.mo14131r(kfkVar.mo14134u((kgg) mrmVar3.mo16809c(), mzx.f41874a), dhvVar6.mo6184l(did.f11436ao) ? ebvVar.f13300b : 2);
                jvbVar4.m13537d(kfcVarMo14131r);
                return mrm.m16829i(kfcVarMo14131r);
            default:
                return new gip((nps) this.f15210b.get(), (kfk) this.f15211c.get(), (mrm) this.f15212d.get(), (mrm) this.f15209a.get(), ((cen) this.f15213e).get());
        }
    }
}
