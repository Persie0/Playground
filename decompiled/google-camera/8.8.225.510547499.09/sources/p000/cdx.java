package p000;

import android.util.ArraySet;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5368a;

    /* JADX INFO: renamed from: b */
    private final oju f5369b;

    /* JADX INFO: renamed from: c */
    private final oju f5370c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f5371d;

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f5371d = i;
        this.f5368a = ojuVar;
        this.f5369b = ojuVar2;
        this.f5370c = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f5371d = i;
        this.f5368a = ojuVar;
        this.f5370c = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f5371d = i;
        this.f5370c = ojuVar;
        this.f5368a = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f5371d = i;
        this.f5370c = ojuVar;
        this.f5368a = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5370c = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f5371d = i;
        this.f5368a = ojuVar;
        this.f5370c = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f5371d = i;
        this.f5368a = ojuVar;
        this.f5370c = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5370c = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f5371d = i;
        this.f5370c = ojuVar;
        this.f5369b = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f5371d = i;
        this.f5368a = ojuVar;
        this.f5370c = ojuVar2;
        this.f5369b = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5370c = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5370c = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5368a = ojuVar2;
        this.f5370c = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f5371d = i;
        this.f5370c = ojuVar;
        this.f5369b = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f5371d = i;
        this.f5370c = ojuVar;
        this.f5369b = ojuVar2;
        this.f5368a = ojuVar3;
    }

    public cdx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f5371d = i;
        this.f5369b = ojuVar;
        this.f5370c = ojuVar2;
        this.f5368a = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static cdx m3533a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new cdx(ojuVar, ojuVar2, ojuVar3, 13);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5371d) {
            case 0:
                oju ojuVar = this.f5368a;
                ikw ikwVarM11415a = ((ikv) this.f5369b).m11415a();
                kbz kbzVar = (kbz) this.f5370c.get();
                if (ikwVarM11415a == ikw.PHOTO) {
                    return cdw.f5361b;
                }
                ojuVar.getClass();
                return jbx.m12870o(new doy(ojuVar, 1), kbzVar, "audioinit");
            case 1:
                return !((dhv) this.f5368a.get()).mo6184l(dhu.f11201c) ? ((ccw) this.f5370c).get() : ((cco) this.f5369b).get();
            case 2:
                jvd jvdVar = (jvd) this.f5370c.get();
                fba fbaVar = ((eru) this.f5368a).get();
                cdv cdvVar = (cdv) this.f5369b.get();
                fdh.m8265e(jvdVar, fbaVar, cdvVar);
                return jbx.m12869n(new baa(cdvVar, 20));
            case 3:
                return new cdz((dnm) this.f5368a.get(), ((kmf) this.f5369b).get(), (Executor) this.f5370c.get());
            case 4:
                return new cec(((ema) this.f5368a).get(), (hai) this.f5370c.get(), (jvd) this.f5369b.get(), dvb.m6761a());
            case 5:
                dhv dhvVar = (dhv) this.f5369b.get();
                jvd jvdVar2 = (jvd) this.f5370c.get();
                cfj cfjVar = (cfj) this.f5368a.get();
                dhx dhxVar = dhf.f11040a;
                dhvVar.mo6176d();
                return new cfk(jvdVar2, cfjVar);
            case 6:
                oju ojuVar2 = this.f5368a;
                dhv dhvVar2 = (dhv) this.f5370c.get();
                chx chxVar = (chx) this.f5369b.get();
                dhx dhxVar2 = dhf.f11040a;
                dhvVar2.mo6176d();
                Set set = ((ohm) ojuVar2).get();
                if (set.isEmpty()) {
                    return new cex();
                }
                cew cewVar = new cew(set, chxVar.f5767b);
                for (cfg cfgVar : cewVar.f5474a) {
                    cewVar.f5475b.m13537d(jwr.m13641k(cfgVar.mo3596b().mo3590a(), new cei(cewVar, 2), not.INSTANCE));
                    cewVar.f5475b.m13537d(jwr.m13641k(cfgVar.mo3596b().mo3591b(), new cei(cewVar, 3), not.INSTANCE));
                }
                return cewVar;
            case 7:
                dhv dhvVar3 = (dhv) this.f5370c.get();
                oju ojuVar3 = this.f5368a;
                oju ojuVar4 = this.f5369b;
                ArraySet arraySet = new ArraySet();
                if (dhvVar3.mo6184l(dhf.f11042c)) {
                    cfv cfvVar = (cfv) ojuVar3.get();
                    cfx cfxVar = cfvVar.f5523a;
                    cfvVar.m3608h();
                    arraySet.add(cfvVar);
                    ((cfs) ojuVar4.get()).mo3596b();
                }
                mxk mxkVarM17134F = mxk.m17134F(arraySet);
                mxkVarM17134F.getClass();
                return mxkVarM17134F;
            case 8:
                return new cfh((nps) this.f5369b.get(), (fvy) this.f5370c.get(), this.f5368a);
            case 9:
                dhv dhvVar4 = (dhv) this.f5370c.get();
                Object objM17136H = (dhvVar4.mo6184l(dib.f11318bY) && dhvVar4.mo6183k(dib.f11348cb)) ? mxk.m17136H(ipn.m11594a((ipm) this.f5369b.get(), jwr.m13640j((jwn) this.f5368a.get(), cgh.f5586b), ipl.f31746j)) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 10:
                kfk kfkVar = (kfk) this.f5368a.get();
                mrm mrmVar = (mrm) this.f5369b.get();
                mrm mrmVar2 = (mrm) this.f5370c.get();
                if (!mrmVar.mo16813g()) {
                    return mzw.f41870a;
                }
                mwt mwtVarM17115i = mwx.m17115i();
                mwtVarM17115i.mo17110e(((kgg) mrmVar.mo16809c()).mo14193c().f36540a, kfkVar.mo14132s((kgg) mrmVar.mo16809c()));
                if (mrmVar2.mo16813g()) {
                    mwtVarM17115i.mo17110e(((kgg) mrmVar2.mo16809c()).mo14193c().f36540a, kfkVar.mo14132s((kgg) mrmVar2.mo16809c()));
                }
                return mwtVarM17115i.mo17059b();
            case 11:
                return new dmy(((fwt) this.f5369b).get(), (cgj) this.f5370c.get(), (jwn) this.f5368a.get());
            case 12:
                return new che((cdz) this.f5368a.get(), (nqf) this.f5369b.get(), ((kbm) this.f5370c).get());
            case 13:
                return new cka((ScheduledExecutorService) this.f5368a.get(), (nqf) this.f5369b.get(), ((err) this.f5370c).get());
            case 14:
                return new cmg(((err) this.f5368a).get(), (jwn) this.f5369b.get(), (jvd) this.f5370c.get());
            case 15:
                return !((cde) this.f5369b).m3490a().booleanValue() ? cdw.f5363d : new ets((cmp) this.f5368a.get(), (AmbientModeSupport.AmbientController) this.f5370c.get(), 1, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 16:
                return !((cde) this.f5369b).m3490a().booleanValue() ? ((coq) this.f5370c).get() : ((coo) this.f5368a).get();
            case 17:
                ((cde) this.f5368a).m3490a().booleanValue();
                return cdw.f5362c;
            case 18:
                return new coe((Executor) this.f5370c.get(), ((cjj) this.f5369b).m3824a(), ((cmz) this.f5368a).get());
            case 19:
                cok cokVar = (cok) this.f5370c.get();
                dth dthVarM6758a = ((dun) this.f5369b).m6758a();
                duc ducVarM6756b = duh.m6756b((dvg) this.f5368a.get());
                ducVarM6756b.f12580c = dthVarM6758a;
                ducVarM6756b.m6750b(cokVar);
                return ducVarM6756b.m6749a();
            default:
                ((etl) this.f5370c).m7866a();
                ((cmw) this.f5368a).get();
                return new cos();
        }
    }
}
