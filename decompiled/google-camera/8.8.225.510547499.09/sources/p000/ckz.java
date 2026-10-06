package p000;

import android.content.Context;
import com.google.android.apps.camera.autotimer.analysis.jni.Curator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f6086a;

    /* JADX INFO: renamed from: b */
    private final oju f6087b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f6088c;

    public ckz(oju ojuVar, oju ojuVar2, int i) {
        this.f6088c = i;
        this.f6086a = ojuVar;
        this.f6087b = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, float[][] fArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, int[][] iArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    public ckz(oju ojuVar, oju ojuVar2, int i, boolean[][] zArr) {
        this.f6088c = i;
        this.f6087b = ojuVar;
        this.f6086a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static ckz m3910a(oju ojuVar, oju ojuVar2) {
        return new ckz(ojuVar, ojuVar2, 2, (byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static ckz m3911b(oju ojuVar, oju ojuVar2) {
        return new ckz(ojuVar, ojuVar2, 3);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        knh knhVarMo7000a;
        switch (this.f6088c) {
            case 0:
                oju ojuVar = this.f6086a;
                dhv dhvVar = (dhv) this.f6087b.get();
                return (dhvVar.mo6184l(did.f11424ac) && dhvVar.mo6184l(did.f11425ad)) ? ((etl) ojuVar).m7866a() : mqu.f41450a;
            case 1:
                return ((dhv) this.f6087b.get()).mo6184l(did.f11424ac) ? ((etl) this.f6086a).m7866a() : mqu.f41450a;
            case 2:
                mrm mrmVar = (mrm) this.f6087b.get();
                jvb jvbVar = (jvb) this.f6086a.get();
                if (!mrmVar.mo16813g() || (knhVarMo7000a = ((kni) mrmVar.mo16809c()).mo7000a("AutoTimerSession")) == null) {
                    return mqu.f41450a;
                }
                jvbVar.m13537d(knhVarMo7000a);
                return mrm.m16829i(knhVarMo7000a);
            case 3:
                dhv dhvVar2 = (dhv) this.f6086a.get();
                Context contextM6830a = ((dws) this.f6087b).m6830a();
                boolean zMo6184l = dhvVar2.mo6184l(dhg.f11047b);
                nxl nxlVarM18137O = odq.f45654r.m18137O();
                String absolutePath = contextM6830a.getCacheDir().getAbsolutePath();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                odq odqVar = (odq) nxqVar;
                absolutePath.getClass();
                odqVar.f45656a |= 16777216;
                odqVar.f45669n = absolutePath;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                odq odqVar2 = (odq) nxqVar2;
                odqVar2.f45656a |= 2;
                odqVar2.f45659d = false;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                int i = true == zMo6184l ? 5 : 2;
                odq odqVar3 = (odq) nxlVarM18137O.f44974b;
                odqVar3.f45658c = i - 1;
                odqVar3.f45656a |= 1;
                Curator curator = new Curator((odq) nxlVarM18137O.mo18103l());
                curator.nativeSetCaptureEnabled(true);
                return curator;
            case 4:
                return new dsx((fcp) this.f6087b.get(), (mpx) this.f6086a.get(), (byte[]) null);
            case 5:
                return jbx.m12870o(this.f6086a, (kbz) this.f6087b.get(), "brella");
            case 6:
                Object objM17136H = ((cde) this.f6087b).m3490a().booleanValue() ? mxk.m17136H((cna) ohh.m18485a(this.f6086a).get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 7:
                doe doeVar = (doe) this.f6086a.get();
                return new cpl(doeVar);
            case 8:
                return new cqi(((iig) this.f6086a).get(), (jvd) this.f6087b.get());
            case 9:
                Object ctbVar = ((dhv) this.f6086a.get()).mo6184l(dhh.f11087am) ? (csx) this.f6087b.get() : new ctb();
                ctbVar.getClass();
                return ctbVar;
            case 10:
                return new cvw(((ers) this.f6087b).get(), (dhv) this.f6086a.get(), null, null);
            case 11:
                return new cwk(this.f6086a, (cwd) this.f6087b.get(), null);
            case 12:
                return new cwo((dhv) this.f6087b.get(), (haq) this.f6086a.get());
            case 13:
                return new cwq((dhv) this.f6087b.get(), (haq) this.f6086a.get());
            case 14:
                return new cyu((dox) this.f6087b.get(), (drj) this.f6086a.get(), null, null);
            case 15:
                jzn jznVar = (jzn) this.f6087b.get();
                cdu cduVar = ((err) this.f6086a).get();
                czl czlVar = new czl(jznVar, null, null);
                cduVar.m3529i().m13537d(czlVar);
                return czlVar;
            case 16:
                return new czn((jvb) this.f6086a.get(), this.f6087b, 0);
            case 17:
                try {
                    return gdz.m9082a(((fxj) this.f6087b).m8922a(), ((cwa) this.f6086a).get().f9339d.m13661b(), 35);
                } catch (gdy e) {
                    throw new RuntimeException(e);
                }
            case 18:
                return new czn(((cwa) this.f6086a).get(), this.f6087b, 2);
            case 19:
                return new czs((gtl) this.f6087b.get(), ((gtb) this.f6086a).get());
            default:
                Object objM17136H2 = ((dhv) this.f6086a.get()).mo6184l(dhh.f11086al) ? mxk.m17136H((czz) this.f6087b.get()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
        }
    }
}
