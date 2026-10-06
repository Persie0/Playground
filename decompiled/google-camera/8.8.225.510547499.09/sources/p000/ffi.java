package p000;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21627a;

    /* JADX INFO: renamed from: b */
    private final oju f21628b;

    /* JADX INFO: renamed from: c */
    private final oju f21629c;

    /* JADX INFO: renamed from: d */
    private final oju f21630d;

    /* JADX INFO: renamed from: e */
    private final oju f21631e;

    /* JADX INFO: renamed from: f */
    private final oju f21632f;

    /* JADX INFO: renamed from: g */
    private final oju f21633g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f21634h;

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i) {
        this.f21634h = i;
        this.f21627a = ojuVar;
        this.f21628b = ojuVar2;
        this.f21629c = ojuVar3;
        this.f21630d = ojuVar4;
        this.f21631e = ojuVar5;
        this.f21632f = ojuVar6;
        this.f21633g = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[] bArr) {
        this.f21634h = i;
        this.f21631e = ojuVar;
        this.f21628b = ojuVar2;
        this.f21629c = ojuVar3;
        this.f21632f = ojuVar4;
        this.f21630d = ojuVar5;
        this.f21633g = ojuVar6;
        this.f21627a = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[] cArr) {
        this.f21634h = i;
        this.f21627a = ojuVar;
        this.f21628b = ojuVar2;
        this.f21629c = ojuVar3;
        this.f21632f = ojuVar4;
        this.f21631e = ojuVar5;
        this.f21630d = ojuVar6;
        this.f21633g = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[] fArr) {
        this.f21634h = i;
        this.f21627a = ojuVar;
        this.f21632f = ojuVar2;
        this.f21633g = ojuVar3;
        this.f21630d = ojuVar4;
        this.f21628b = ojuVar5;
        this.f21629c = ojuVar6;
        this.f21631e = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[] iArr) {
        this.f21634h = i;
        this.f21628b = ojuVar;
        this.f21629c = ojuVar2;
        this.f21630d = ojuVar3;
        this.f21633g = ojuVar4;
        this.f21627a = ojuVar5;
        this.f21632f = ojuVar6;
        this.f21631e = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[] sArr) {
        this.f21634h = i;
        this.f21629c = ojuVar;
        this.f21633g = ojuVar2;
        this.f21628b = ojuVar3;
        this.f21632f = ojuVar4;
        this.f21627a = ojuVar5;
        this.f21631e = ojuVar6;
        this.f21630d = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[] zArr) {
        this.f21634h = i;
        this.f21632f = ojuVar;
        this.f21630d = ojuVar2;
        this.f21631e = ojuVar3;
        this.f21627a = ojuVar4;
        this.f21633g = ojuVar5;
        this.f21628b = ojuVar6;
        this.f21629c = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[][] bArr) {
        this.f21634h = i;
        this.f21631e = ojuVar;
        this.f21632f = ojuVar2;
        this.f21628b = ojuVar3;
        this.f21633g = ojuVar4;
        this.f21627a = ojuVar5;
        this.f21629c = ojuVar6;
        this.f21630d = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[][] cArr) {
        this.f21634h = i;
        this.f21631e = ojuVar;
        this.f21632f = ojuVar2;
        this.f21628b = ojuVar3;
        this.f21633g = ojuVar4;
        this.f21627a = ojuVar5;
        this.f21629c = ojuVar6;
        this.f21630d = ojuVar7;
    }

    public ffi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[][] sArr) {
        this.f21634h = i;
        this.f21631e = ojuVar;
        this.f21632f = ojuVar2;
        this.f21628b = ojuVar3;
        this.f21633g = ojuVar4;
        this.f21627a = ojuVar5;
        this.f21630d = ojuVar6;
        this.f21629c = ojuVar7;
    }

    /* JADX INFO: renamed from: a */
    public static ffi m8337a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static ffi m8338b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static ffi m8339c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static ffi m8340d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static ffi m8341e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static ffi m8342f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static ffi m8343g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static ffi m8344h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new ffi(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 9, (short[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        mxk mxkVarMo17127f;
        switch (this.f21634h) {
            case 0:
                return new ffh(((iig) this.f21627a).get(), ((dww) this.f21628b).m6836a(), (jfs) this.f21629c.get(), (elx) this.f21630d.get(), (ScheduledExecutorService) this.f21631e.get(), (gxa) this.f21632f.get(), (mrm) this.f21633g.get(), null, null, null);
            case 1:
                return new fdd((eby) this.f21631e.get(), (jwn) this.f21628b.get(), (jwn) this.f21629c.get(), (ebv) this.f21632f.get(), (guk) this.f21630d.get(), (hah) this.f21633g.get(), (dhv) this.f21627a.get());
            case 2:
                return new ffq((jww) this.f21627a.get(), (jwl) this.f21628b.get(), (hmw) this.f21629c.get(), (msa) this.f21632f.get(), (dhv) this.f21631e.get(), (eby) this.f21630d.get(), (hah) this.f21633g.get(), null, null);
            case 3:
                fie fieVar = (fie) this.f21629c.get();
                flc flcVar = (flc) this.f21633g.get();
                return new glk(fieVar, flcVar, (jwn) this.f21631e.get(), ((fxj) this.f21630d).m8922a());
            case 4:
                return new frm(((kbm) this.f21628b).get(), ((crv) this.f21629c).m5442a(), ohh.m18485a(this.f21630d), ((Long) this.f21633g.get()).longValue(), (DynamicDepthUtils) this.f21627a.get(), (mrm) ((ohj) this.f21632f).f46012a, (gtl) this.f21631e.get());
            case 5:
                kmd kmdVar = ((fxk) this.f21632f).get();
                cem cemVar = ((cen) this.f21630d).get();
                dhv dhvVar = (dhv) this.f21631e.get();
                nps npsVar = (nps) this.f21627a.get();
                gvw gvwVar = (gvw) this.f21633g.get();
                fyn fynVar = ((fyo) this.f21628b).get();
                ehw ehwVar = ((ehx) this.f21629c).get();
                dhx dhxVar = dhf.f11040a;
                dhvVar.mo6176d();
                return new fzq(new fxv(kmdVar, cemVar, new cfn(fynVar, cemVar, npsVar), gvwVar, ehwVar), mxk.m17136H(35), 1);
            case 6:
                fvu fvuVarM8922a = ((fxj) this.f21627a).m8922a();
                gcx gcxVar = (gcx) this.f21632f.get();
                jwn jwnVarM7519a = ((emf) this.f21633g).m7519a();
                jwn jwnVar = (jwn) this.f21630d.get();
                jwn jwnVar2 = (jwn) this.f21628b.get();
                gdw gdwVar = (gdw) this.f21629c.get();
                return new gdl(fvuVarM8922a, gcxVar, jwnVarM7519a, jwnVar, jwnVar2, gdwVar, null);
            case 7:
                Object obj = this.f21631e.get();
                fvu fvuVarM8922a2 = ((fxj) this.f21632f).m8922a();
                final fuf fufVar = (fuf) this.f21628b.get();
                imu imuVar = (imu) this.f21633g.get();
                final ikw ikwVarM11415a = ((ikv) this.f21627a).m11415a();
                final mrm mrmVarM8495b = ((fjp) this.f21629c).m8495b();
                final dhv dhvVar2 = (dhv) this.f21630d.get();
                final djm djmVar = (djm) obj;
                if (imuVar.f31549a == 2 && dhvVar2.mo6184l(dib.f11273ag)) {
                    mxkVarMo17127f = mzx.f41874a;
                } else {
                    mxi mxiVar = new mxi();
                    mxiVar.mo17072d(gmz.m9533a(gnf.RAW_TELE, new gnb(fvuVarM8922a2, imuVar, djmVar, fufVar, ikwVarM11415a, dhvVar2, mrmVarM8495b, 1, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)));
                    final kmd kmdVarM11490e = imuVar.m11490e();
                    if (kmdVarM11490e != null) {
                        final byte[] bArr = null;
                        final byte[] bArr2 = null;
                        final byte[] bArr3 = null;
                        final byte[] bArr4 = null;
                        final byte[] bArr5 = null;
                        mxiVar.mo17072d(gmz.m9533a(gnf.RAW_TELE_ZOOM, new oju(djmVar, fufVar, ikwVarM11415a, dhvVar2, mrmVarM8495b, bArr, bArr2, bArr3, bArr4, bArr5) { // from class: gna

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ fuf f25670b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ ikw f25671c;

                            /* JADX INFO: renamed from: d */
                            public final /* synthetic */ dhv f25672d;

                            /* JADX INFO: renamed from: e */
                            public final /* synthetic */ mrm f25673e;

                            /* JADX INFO: renamed from: f */
                            public final /* synthetic */ djm f25674f;

                            @Override // p000.oju
                            public final Object get() {
                                kmd kmdVar2 = this.f25669a;
                                djm djmVar2 = this.f25674f;
                                fuf fufVar2 = this.f25670b;
                                ikw ikwVar = this.f25671c;
                                dhv dhvVar3 = this.f25672d;
                                mrm mrmVar = this.f25673e;
                                kmdVar2.mo14565r();
                                return goy.m9597j(djmVar2, kmdVar2, fufVar2, ikwVar, dhvVar3, mrmVar, false);
                            }
                        }));
                    }
                    mxkVarMo17127f = mxiVar.mo17127f();
                }
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 8:
                Object obj2 = this.f21631e.get();
                fvu fvuVarM8922a3 = ((fxj) this.f21632f).m8922a();
                fuf fufVar2 = (fuf) this.f21628b.get();
                imu imuVar2 = (imu) this.f21633g.get();
                ikw ikwVarM11415a2 = ((ikv) this.f21627a).m11415a();
                mrm mrmVarM8495b2 = ((fjp) this.f21629c).m8495b();
                dhv dhvVar3 = (dhv) this.f21630d.get();
                Object objM17136H = !dhvVar3.mo6184l(dib.f11273ag) ? mzx.f41874a : mxk.m17136H(gmz.m9533a(gnf.RAW_ULTRAWIDE, new gnb(fvuVarM8922a3, imuVar2, (djm) obj2, fufVar2, ikwVarM11415a2, dhvVar3, mrmVarM8495b2, 0, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)));
                objM17136H.getClass();
                return objM17136H;
            default:
                Object obj3 = this.f21631e.get();
                fvu fvuVarM8922a4 = ((fxj) this.f21632f).m8922a();
                fuf fufVar3 = (fuf) this.f21628b.get();
                imu imuVar3 = (imu) this.f21633g.get();
                ikw ikwVarM11415a3 = ((ikv) this.f21627a).m11415a();
                dhv dhvVar4 = (dhv) this.f21630d.get();
                mrm mrmVarM8495b3 = ((fjp) this.f21629c).m8495b();
                djm djmVar2 = (djm) obj3;
                kmd kmdVarM11492g = imuVar3.m11492g();
                Object objM17136H2 = kmdVarM11492g == null ? mzx.f41874a : mxk.m17136H(gmz.m9533a(gnf.RAW_WIDE_ZOOM, new gnb(fvuVarM8922a4, kmdVarM11492g, djmVar2, fufVar3, ikwVarM11415a3, dhvVar4, mrmVarM8495b3, 2, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)));
                objM17136H2.getClass();
                return objM17136H2;
        }
    }
}
