package p000;

import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24124a;

    /* JADX INFO: renamed from: b */
    private final oju f24125b;

    /* JADX INFO: renamed from: c */
    private final oju f24126c;

    /* JADX INFO: renamed from: d */
    private final oju f24127d;

    /* JADX INFO: renamed from: e */
    private final oju f24128e;

    /* JADX INFO: renamed from: f */
    private final oju f24129f;

    /* JADX INFO: renamed from: g */
    private final oju f24130g;

    /* JADX INFO: renamed from: h */
    private final oju f24131h;

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ int f24132i;

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i) {
        this.f24132i = i;
        this.f24124a = ojuVar;
        this.f24125b = ojuVar2;
        this.f24126c = ojuVar3;
        this.f24127d = ojuVar4;
        this.f24128e = ojuVar5;
        this.f24129f = ojuVar6;
        this.f24130g = ojuVar7;
        this.f24131h = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[] bArr) {
        this.f24132i = i;
        this.f24125b = ojuVar;
        this.f24129f = ojuVar2;
        this.f24124a = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24128e = ojuVar5;
        this.f24131h = ojuVar6;
        this.f24130g = ojuVar7;
        this.f24127d = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, char[] cArr) {
        this.f24132i = i;
        this.f24129f = ojuVar;
        this.f24124a = ojuVar2;
        this.f24131h = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24130g = ojuVar5;
        this.f24127d = ojuVar6;
        this.f24125b = ojuVar7;
        this.f24128e = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, float[] fArr) {
        this.f24132i = i;
        this.f24127d = ojuVar;
        this.f24131h = ojuVar2;
        this.f24125b = ojuVar3;
        this.f24129f = ojuVar4;
        this.f24128e = ojuVar5;
        this.f24126c = ojuVar6;
        this.f24130g = ojuVar7;
        this.f24124a = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, int[] iArr) {
        this.f24132i = i;
        this.f24130g = ojuVar;
        this.f24128e = ojuVar2;
        this.f24125b = ojuVar3;
        this.f24129f = ojuVar4;
        this.f24131h = ojuVar5;
        this.f24124a = ojuVar6;
        this.f24126c = ojuVar7;
        this.f24127d = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, short[] sArr) {
        this.f24132i = i;
        this.f24125b = ojuVar;
        this.f24131h = ojuVar2;
        this.f24129f = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24128e = ojuVar5;
        this.f24127d = ojuVar6;
        this.f24130g = ojuVar7;
        this.f24124a = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, boolean[] zArr) {
        this.f24132i = i;
        this.f24131h = ojuVar;
        this.f24129f = ojuVar2;
        this.f24124a = ojuVar3;
        this.f24130g = ojuVar4;
        this.f24126c = ojuVar5;
        this.f24127d = ojuVar6;
        this.f24128e = ojuVar7;
        this.f24125b = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[][] bArr) {
        this.f24132i = i;
        this.f24129f = ojuVar;
        this.f24126c = ojuVar2;
        this.f24127d = ojuVar3;
        this.f24125b = ojuVar4;
        this.f24124a = ojuVar5;
        this.f24131h = ojuVar6;
        this.f24128e = ojuVar7;
        this.f24130g = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, char[][] cArr) {
        this.f24132i = i;
        this.f24124a = ojuVar;
        this.f24129f = ojuVar2;
        this.f24131h = ojuVar3;
        this.f24127d = ojuVar4;
        this.f24125b = ojuVar5;
        this.f24126c = ojuVar6;
        this.f24128e = ojuVar7;
        this.f24130g = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, float[][] fArr) {
        this.f24132i = i;
        this.f24124a = ojuVar;
        this.f24129f = ojuVar2;
        this.f24125b = ojuVar3;
        this.f24130g = ojuVar4;
        this.f24126c = ojuVar5;
        this.f24127d = ojuVar6;
        this.f24128e = ojuVar7;
        this.f24131h = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, int[][] iArr) {
        this.f24132i = i;
        this.f24129f = ojuVar;
        this.f24130g = ojuVar2;
        this.f24126c = ojuVar3;
        this.f24127d = ojuVar4;
        this.f24131h = ojuVar5;
        this.f24128e = ojuVar6;
        this.f24124a = ojuVar7;
        this.f24125b = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, short[][] sArr) {
        this.f24132i = i;
        this.f24131h = ojuVar;
        this.f24129f = ojuVar2;
        this.f24127d = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24125b = ojuVar5;
        this.f24124a = ojuVar6;
        this.f24128e = ojuVar7;
        this.f24130g = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, boolean[][] zArr) {
        this.f24132i = i;
        this.f24129f = ojuVar;
        this.f24126c = ojuVar2;
        this.f24128e = ojuVar3;
        this.f24127d = ojuVar4;
        this.f24130g = ojuVar5;
        this.f24124a = ojuVar6;
        this.f24125b = ojuVar7;
        this.f24131h = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[][][] bArr) {
        this.f24132i = i;
        this.f24124a = ojuVar;
        this.f24125b = ojuVar2;
        this.f24130g = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24128e = ojuVar5;
        this.f24131h = ojuVar6;
        this.f24127d = ojuVar7;
        this.f24129f = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, char[][][] cArr) {
        this.f24132i = i;
        this.f24127d = ojuVar;
        this.f24126c = ojuVar2;
        this.f24128e = ojuVar3;
        this.f24130g = ojuVar4;
        this.f24131h = ojuVar5;
        this.f24125b = ojuVar6;
        this.f24124a = ojuVar7;
        this.f24129f = ojuVar8;
    }

    public gbq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, short[][][] sArr) {
        this.f24132i = i;
        this.f24127d = ojuVar;
        this.f24125b = ojuVar2;
        this.f24124a = ojuVar3;
        this.f24126c = ojuVar4;
        this.f24129f = ojuVar5;
        this.f24128e = ojuVar6;
        this.f24131h = ojuVar7;
        this.f24130g = ojuVar8;
    }

    /* JADX INFO: renamed from: a */
    public static gbq m9024a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new gbq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 0);
    }

    /* JADX INFO: renamed from: b */
    public static gbq m9025b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new gbq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static gbq m9026c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new gbq(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 2, (char[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        switch (this.f24132i) {
            case 0:
                return new gbl((fvy) this.f24124a.get(), (nps) this.f24126c.get(), ((dki) this.f24125b).get(), (ccz) this.f24127d.get(), (hah) this.f24128e.get(), ohh.m18485a(this.f24129f), ((Boolean) this.f24130g.get()).booleanValue(), (kbz) this.f24131h.get());
            case 1:
                return new fzq(new fzq(new fyc(((dki) this.f24125b).get(), ((cen) this.f24129f).get(), (grc) this.f24124a.get(), ((geb) this.f24126c).get(), ((grp) this.f24130g).get(), (fzu) this.f24128e.get(), (kbz) this.f24127d.get()), mxk.m17136H(35), 1), (C1058va) this.f24131h.get(), 0, null, null, null);
            case 2:
                kfk kfkVar = (kfk) this.f24129f.get();
                oju ojuVar = this.f24124a;
                oju ojuVar2 = this.f24131h;
                long jLongValue = ((ehk) this.f24126c).get().longValue();
                mrm mrmVar = (mrm) this.f24130g.get();
                oju ojuVar3 = this.f24127d;
                ebv ebvVar = (ebv) this.f24125b.get();
                ecj ecjVar = (ecj) this.f24128e.get();
                if (mrmVar.mo16813g()) {
                    return ((gjg) ojuVar).get().m10142a(jLongValue, kfkVar.mo14131r((kho) mrmVar.mo16809c(), ebvVar.f13300b), ecjVar, 2);
                }
                lku.m15669w(((Map) ojuVar3.get()).size() > 1);
                return ((gjb) ojuVar2).get().m19486n(jLongValue, ebvVar.f13300b, ecjVar);
            case 3:
                dhv dhvVar = (dhv) this.f24125b.get();
                har harVar = (har) this.f24131h.get();
                gzr gzrVar = (gzr) this.f24129f.get();
                jww jwwVar = (jww) this.f24126c.get();
                jww jwwVar2 = (jww) this.f24128e.get();
                jww jwwVar3 = (jww) this.f24127d.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f24130g);
                fmz fmzVar = (fmz) this.f24124a.get();
                nbh nbhVar = gfy.f24631a;
                if (dhvVar.mo6184l(dim.f11639b)) {
                    geu geuVar = new geu(harVar, gzrVar, gzr.RES_2160P, gfc.f24478F, gzr.RES_1080P, gfc.RES_1080P);
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9178r(gev.VIDEO_RESOLUTION);
                    gfjVarM9181o.m9168h(C0100R.string.video_res);
                    gfjVarM9181o.m9163c(C0100R.string.video_res_desc);
                    gfjVarM9181o.m9162b(gfc.RES_1080P, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd, C0100R.string.video_res_fhd_desc);
                    gfjVarM9181o.m9162b(gfc.f24478F, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k, C0100R.string.video_res_4k_desc);
                    gfjVarM9181o.f24545a = geuVar;
                    gfjVarM9181o.m9179s(new gek(jwwVar, jwwVar2, 3));
                    gfjVarM9181o.m9172l(new fdg(jwwVar, jwwVar2, jwwVar3, 2));
                    gfjVarM9181o.m9171k((gfd) ohbVarM18485a.get());
                    gfjVarM9181o.m9175o(new dam(fmzVar, 18));
                    gfjVarM9181o.m9177q(new dan(jwwVar3, 2));
                    objM17136H = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 4:
                kfk kfkVar2 = (kfk) this.f24130g.get();
                gof gofVar = (gof) this.f24128e.get();
                return new gvb(kfkVar2, gofVar, 0);
            case 5:
                return new hbz(((emu) this.f24131h).get(), (dhv) this.f24129f.get(), (kpa) this.f24124a.get(), (hah) this.f24130g.get(), (hai) this.f24126c.get(), (lih) this.f24127d.get(), this.f24128e, ((inb) this.f24125b).get(), null);
            case 6:
                final jvd jvdVar = (jvd) this.f24127d.get();
                final ohb ohbVarM18485a2 = ohh.m18485a(this.f24131h);
                final ohb ohbVarM18485a3 = ohh.m18485a(this.f24125b);
                final nqf nqfVar = (nqf) this.f24129f.get();
                final ohb ohbVarM18485a4 = ohh.m18485a(this.f24128e);
                final nqf nqfVar2 = (nqf) this.f24126c.get();
                dsx dsxVar = ((dms) this.f24130g).get();
                final cdu cduVar = ((err) this.f24124a).get();
                dsxVar.m6695j();
                return mxk.m17136H(new hjk() { // from class: hck
                    @Override // java.lang.Runnable
                    public final void run() {
                        nqf nqfVar3 = nqfVar2;
                        ohb ohbVar = ohbVarM18485a4;
                        ohb ohbVar2 = ohbVarM18485a3;
                        nqf nqfVar4 = nqfVar;
                        cdu cduVar2 = cduVar;
                        ohb ohbVar3 = ohbVarM18485a2;
                        jvd jvdVar2 = jvdVar;
                        nqfVar3.mo14894e((hdt) ohbVar.get());
                        nqfVar4.mo14894e((hdk) ohbVar2.get());
                        jvb jvbVarM3529i = cduVar2.m3529i();
                        hee heeVar = (hee) ohbVar3.get();
                        heeVar.getClass();
                        jvbVarM3529i.m13537d(new hcu(kxk.m14968N(new gxw(heeVar, 5), jvdVar2), 1));
                    }
                });
            case 7:
                dsx dsxVar2 = ((dms) this.f24129f).get();
                jvb jvbVar = (jvb) this.f24126c.get();
                Object obj = this.f24127d.get();
                kfk kfkVar3 = (kfk) this.f24125b.get();
                mrm mrmVar2 = (mrm) this.f24124a.get();
                oju ojuVar4 = this.f24131h;
                gjj gjjVar = (gjj) this.f24128e.get();
                gva gvaVar = (gva) this.f24130g.get();
                htb htbVar = (htb) obj;
                dsxVar2.m6695j();
                Object objM17136H2 = mrmVar2.mo16813g() ? mxk.m17136H(dez.m6036f(new hct(kfkVar3, mrmVar2, htbVar, jvbVar, ojuVar4, gvaVar, gjjVar, 0, null, null), "pcksmarts")) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 8:
                ((dws) this.f24124a).m6830a();
                return new hdt((Executor) this.f24129f.get(), (fcp) this.f24131h.get(), (hec) this.f24127d.get(), (djm) this.f24125b.get(), (iad) this.f24126c.get(), (fly) this.f24128e.get(), (npk) this.f24130g.get(), null, null, null);
            case 9:
                return new hfg(this.f24131h, this.f24129f, (hfx) this.f24127d.get(), (jvd) this.f24126c.get(), (Handler) this.f24125b.get(), ((ema) this.f24124a).get(), ((dww) this.f24128e).m6836a(), (eby) this.f24130g.get());
            case 10:
                return new hmn(((dws) this.f24129f).m6830a(), (jww) this.f24130g.get(), (gvo) this.f24126c.get(), ((hmi) this.f24127d).get(), (fcp) this.f24131h.get(), (jvd) this.f24128e.get(), ((eru) this.f24124a).get(), (dhv) this.f24125b.get(), null, null, null);
            case 11:
                return new hru((AmbientDelegate) this.f24129f.get(), (hnw) this.f24126c.get(), (Executor) this.f24128e.get(), ((hog) this.f24127d).m10532a(), (Executor) this.f24130g.get(), (Executor) this.f24124a.get(), (dhv) this.f24125b.get(), (kbz) this.f24131h.get(), null, null, null);
            case 12:
                return new hsk(((err) this.f24124a).get(), ((cdf) this.f24129f).get(), ((dws) this.f24125b).m6830a(), (dox) this.f24130g.get(), ohh.m18485a(this.f24126c), (mrm) this.f24127d.get(), (jvd) this.f24128e.get(), (idg) this.f24131h.get(), null, null);
            case 13:
                djm djmVar = (djm) this.f24124a.get();
                Object obj2 = this.f24125b.get();
                khb khbVar = ((khr) this.f24130g).get();
                jvb jvbVar2 = (jvb) this.f24126c.get();
                kbo kboVar = ((kbm) this.f24128e).get();
                kbz kbzVar = (kbz) this.f24131h.get();
                ((khc) this.f24129f).get();
                return new khx(djmVar, (kqj) obj2, khbVar, jvbVar2, kboVar, kbzVar, null, null, null, null, null);
            case 14:
                return new lkr(((ljg) this.f24127d).get(), ((dws) this.f24126c).m6830a(), (Executor) this.f24128e.get(), ((lkl) this.f24130g).get(), this.f24131h, ohh.m18485a(this.f24125b), this.f24124a, this.f24129f);
            default:
                return new llz(((ljg) this.f24127d).get(), ((dws) this.f24125b).m6830a(), (lhz) this.f24124a.get(), (npv) this.f24126c.get(), ohh.m18485a(this.f24129f), ohh.m18485a(this.f24128e), this.f24131h, (Executor) this.f24130g.get());
        }
    }
}
