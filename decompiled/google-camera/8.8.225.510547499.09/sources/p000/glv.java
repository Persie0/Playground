package p000;

import com.google.android.apps.camera.rectiface.jni.RectifaceImpl;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25558a;

    /* JADX INFO: renamed from: b */
    private final oju f25559b;

    /* JADX INFO: renamed from: c */
    private final oju f25560c;

    /* JADX INFO: renamed from: d */
    private final oju f25561d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f25562e;

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25559b = ojuVar2;
        this.f25560c = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25561d = ojuVar2;
        this.f25560c = ojuVar3;
        this.f25559b = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25559b = ojuVar2;
        this.f25561d = ojuVar3;
        this.f25558a = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f25562e = i;
        this.f25561d = ojuVar;
        this.f25559b = ojuVar2;
        this.f25560c = ojuVar3;
        this.f25558a = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f25562e = i;
        this.f25559b = ojuVar;
        this.f25560c = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25559b = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25560c = ojuVar2;
        this.f25561d = ojuVar3;
        this.f25559b = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f25562e = i;
        this.f25561d = ojuVar;
        this.f25559b = ojuVar2;
        this.f25560c = ojuVar3;
        this.f25558a = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f25562e = i;
        this.f25559b = ojuVar;
        this.f25560c = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25559b = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f25562e = i;
        this.f25559b = ojuVar;
        this.f25561d = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25560c = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25559b = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25558a = ojuVar2;
        this.f25559b = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25559b = ojuVar2;
        this.f25561d = ojuVar3;
        this.f25560c = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25560c = ojuVar2;
        this.f25561d = ojuVar3;
        this.f25559b = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][][] fArr) {
        this.f25562e = i;
        this.f25560c = ojuVar;
        this.f25559b = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f25562e = i;
        this.f25558a = ojuVar;
        this.f25560c = ojuVar2;
        this.f25559b = ojuVar3;
        this.f25561d = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f25562e = i;
        this.f25561d = ojuVar;
        this.f25560c = ojuVar2;
        this.f25559b = ojuVar3;
        this.f25558a = ojuVar4;
    }

    public glv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f25562e = i;
        this.f25561d = ojuVar;
        this.f25559b = ojuVar2;
        this.f25558a = ojuVar3;
        this.f25560c = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static glv m9470a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static glv m9471b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static glv m9472c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static glv m9473d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static glv m9474e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static glv m9475f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: g */
    public static glv m9476g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static glv m9477h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 8);
    }

    /* JADX INFO: renamed from: i */
    public static glv m9478i(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 9, (char[][]) null);
    }

    /* JADX INFO: renamed from: j */
    public static glv m9479j(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 10, (short[][]) null);
    }

    /* JADX INFO: renamed from: k */
    public static glv m9480k(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 11, (int[][]) null);
    }

    /* JADX INFO: renamed from: l */
    public static glv m9481l(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new glv(ojuVar, ojuVar2, ojuVar3, ojuVar4, 12, (boolean[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        switch (this.f25562e) {
            case 0:
                return new glu((dhv) this.f25558a.get(), (drj) this.f25559b.get(), (npu) this.f25560c.get(), ((dki) this.f25561d).get(), null, null);
            case 1:
                return new iay(ohh.m18485a(this.f25558a), ohh.m18485a(this.f25561d), ohh.m18485a(this.f25560c), (mrm) this.f25559b.get());
            case 2:
                return new glw(((kak) this.f25560c).get(), ((fxk) this.f25559b).get(), (imu) this.f25561d.get(), (glu) this.f25558a.get());
            case 3:
                Map map = (Map) this.f25560c.get();
                jwn jwnVar = (jwn) this.f25559b.get();
                bkn bknVar = ((gan) this.f25558a).get();
                jvb jvbVar = (jvb) this.f25561d.get();
                lku.m15614I(map.containsKey(gnf.f25701c), "Wide stream not present");
                gmn gmnVar = new gmn(map, jwnVar, bknVar, null, null);
                jvbVar.m13537d(new ezc(gmnVar, 18));
                return gmnVar;
            case 4:
                dhv dhvVar = (dhv) this.f25559b.get();
                final nqf nqfVar = (nqf) this.f25560c.get();
                final ggs ggsVar = (ggs) this.f25558a.get();
                final jvb jvbVar2 = (jvb) this.f25561d.get();
                final int iIntValue = ((Integer) dhvVar.mo6173a(dib.f11362d).get()).intValue();
                return dez.m6036f(new Runnable() { // from class: gmu
                    @Override // java.lang.Runnable
                    public final void run() {
                        jvb jvbVar3 = jvbVar2;
                        nqf nqfVar2 = nqfVar;
                        ggs ggsVar2 = ggsVar;
                        int i = iIntValue;
                        dez.m6035e(jvbVar3, nqfVar2);
                        ggsVar2.m9230n(new gmv(new AtomicInteger(0), i, nqfVar2, ggsVar2));
                    }
                }, "pckvfl");
            case 5:
                jvb jvbVar3 = (jvb) this.f25558a.get();
                kfk kfkVar = (kfk) this.f25560c.get();
                mrm mrmVar = (mrm) this.f25561d.get();
                mrm mrmVarM8495b = ((fjp) this.f25559b).m8495b();
                if (!mrmVar.mo16813g() || !mrmVarM8495b.mo16813g()) {
                    return ciz.f5911a;
                }
                kfc kfcVarMo14131r = kfkVar.mo14131r(kfkVar.mo14132s((kgg) mrmVar.mo16809c()), 1);
                jvbVar3.m13537d(kfcVarMo14131r);
                return dez.m6036f(new ghc(mrmVarM8495b, kfcVarMo14131r, mrmVar, 2), "pckvfe");
            case 6:
                oju ojuVar = this.f25561d;
                oju ojuVar2 = this.f25559b;
                mrm mrmVarM8495b2 = ((fjp) this.f25560c).m8495b();
                dhv dhvVar2 = (dhv) this.f25558a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar2.mo6177e();
                if (!mrmVarM8495b2.mo16813g()) {
                    return kgq.m14212b(((kmd) ojuVar2.get()).mo14556i(), ((fwz) ojuVar).get());
                }
                kgh kghVarM14208a = kgi.m14208a();
                goy.m9590c(dhvVar2);
                kghVarM14208a.m14207l(256L);
                kghVarM14208a.m14206k(kgj.f35913a);
                kghVarM14208a.m14197b(((kmd) ojuVar2.get()).mo14556i());
                kghVarM14208a.m14204i(((fwz) ojuVar).get());
                kghVarM14208a.m14203h(34);
                kghVarM14208a.m14198c(9);
                kghVarM14208a.m14202g(true);
                return kghVarM14208a.m14196a();
            case 7:
                return dez.m6036f(new apv((kfk) this.f25560c.get(), ohh.m18485a(this.f25561d), ohh.m18485a(this.f25559b), (jvb) this.f25558a.get(), 13), "pckreqdyn");
            case 8:
                return new djm(this.f25558a, this.f25559b, this.f25560c, this.f25561d);
            case 9:
                return gls.m9446h(((fxj) this.f25560c).m8922a().mo14556i(), (kms) this.f25558a.get(), ((fwu) this.f25559b).get(), (dhv) this.f25561d.get());
            case 10:
                Object obj = this.f25560c.get();
                kmd kmdVar = (kmd) this.f25559b.get();
                fuf fufVar = (fuf) this.f25558a.get();
                kna knaVar = ((geb) this.f25561d).get().f24347a;
                int i = fufVar.f23584a;
                gmy gmyVarM6226G = ((djm) obj).m6226G();
                gmyVarM6226G.f25660a = kmdVar.mo14556i();
                gmyVarM6226G.f25661b = knaVar;
                gmyVarM6226G.f25662c = i;
                gmyVarM6226G.f25663d = true;
                return gmyVarM6226G.m9532a();
            case 11:
                Object obj2 = this.f25559b.get();
                gdz gdzVar = ((geb) this.f25561d).get();
                imu imuVar = (imu) this.f25558a.get();
                dhv dhvVar3 = (dhv) this.f25560c.get();
                djm djmVar = (djm) obj2;
                int size = imuVar.m11495j().size();
                if (!dhvVar3.mo6184l(dib.f11318bY) || (size == 2 && dhvVar3.mo6184l(dib.f11273ag))) {
                    return mzw.f41870a;
                }
                kmd kmdVarM11489d = imuVar.m11489d();
                kmdVarM11489d.mo14556i();
                kmdVarM11489d.mo14565r();
                kbc kbcVar = new kbc(640, 480);
                if (kan.f35487b.m13883m(kan.m13873j(gdzVar.f24348b))) {
                    kbcVar = new kbc(640, (int) kan.f35487b.m13876b(640.0f));
                } else if (kan.f35488c.m13883m(kan.m13873j(gdzVar.f24348b))) {
                    kbcVar = kbcVar.m13910j();
                }
                kna knaVar2 = new kna(gdzVar.f24347a.f36580a, kbcVar);
                mwt mwtVar = new mwt();
                gnf gnfVar = gnf.YUV_TELE_ZOOM;
                gmy gmyVarM6226G2 = djmVar.m6226G();
                gmyVarM6226G2.f25660a = kmdVarM11489d.mo14556i();
                gmyVarM6226G2.f25661b = knaVar2;
                gmyVarM6226G2.f25662c = 3;
                gmyVarM6226G2.f25663d = false;
                gmyVarM6226G2.f25664e = false;
                gmyVarM6226G2.f25665f = 256L;
                mwtVar.mo17110e(gnfVar, gmyVarM6226G2.m9532a());
                kmd kmdVarM11490e = imuVar.m11490e();
                if (kmdVarM11490e != null) {
                    kmdVarM11490e.mo14565r();
                    gnf gnfVar2 = gnf.YUV_TELE_ZOOM_RM;
                    gmy gmyVarM6226G3 = djmVar.m6226G();
                    gmyVarM6226G3.f25660a = ((kmc) kmdVarM11490e).f36525a;
                    gmyVarM6226G3.f25661b = knaVar2;
                    gmyVarM6226G3.f25662c = 3;
                    gmyVarM6226G3.f25663d = false;
                    gmyVarM6226G3.f25664e = false;
                    gmyVarM6226G3.f25665f = 256L;
                    mwtVar.mo17110e(gnfVar2, gmyVarM6226G3.m9532a());
                }
                return mwtVar.mo17059b();
            case 12:
                return new gnh((kfk) this.f25560c.get(), (bko) this.f25558a.get(), (Executor) this.f25559b.get(), (kbz) this.f25561d.get(), null);
            case 13:
                djm djmVar2 = (djm) this.f25558a.get();
                fvu fvuVarM8922a = ((fxj) this.f25559b).m8922a();
                oju ojuVar3 = this.f25560c;
                oju ojuVar4 = this.f25561d;
                kmq kmqVarMo14558k = fvuVarM8922a.mo14558k();
                if (kmqVarMo14558k == kmq.BACK && djmVar2.m6222C()) {
                    objM17136H = mxk.m17136H((ech) ojuVar3.get());
                } else {
                    objM17136H = (kmqVarMo14558k == kmq.f36557a && djmVar2.m6221B()) ? mxk.m17136H((ech) ojuVar4.get()) : mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 14:
                return new goa((gnz) this.f25560c.get(), ((dws) this.f25559b).m6830a(), (Executor) this.f25558a.get(), (kbz) this.f25561d.get());
            case 15:
                return new gox(((dww) this.f25558a).m6836a(), (ScheduledExecutorService) this.f25559b.get(), (jfs) this.f25561d.get(), (fly) this.f25560c.get(), null, null, null);
            case 16:
                return new RectifaceImpl((gpx) this.f25558a.get(), (gpw) this.f25560c.get(), (jww) this.f25561d.get(), (dhv) this.f25559b.get());
            case 17:
                jww jwwVar = (jww) this.f25561d.get();
                jwn jwnVar2 = (jwn) this.f25560c.get();
                dhv dhvVar4 = (dhv) this.f25559b.get();
                ((gvv) this.f25558a).get();
                return new gvx(jwwVar, jwnVar2, dhvVar4);
            case 18:
                return new gxc(((gxg) this.f25558a).get(), (jvd) this.f25560c.get(), (jfs) ((ohj) this.f25559b).f46012a, this.f25561d, null, null, null);
            case 19:
                return ((dhv) this.f25560c.get()).mo6184l(dhi.f11128o) ? dez.m6036f(new gxn(((dms) this.f25559b).get(), (htb) this.f25561d.get(), ((fxj) this.f25558a).m8922a(), 6, (byte[]) null, (byte[]) null), "smarts") : ciz.f5911a;
            default:
                return new hez(((hfb) this.f25560c).m10179a(), (jwn) this.f25559b.get(), (fcp) this.f25558a.get(), (jww) this.f25561d.get());
        }
    }
}
