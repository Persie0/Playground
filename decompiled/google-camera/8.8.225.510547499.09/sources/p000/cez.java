package p000;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cez implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5486a;

    /* JADX INFO: renamed from: b */
    private final oju f5487b;

    /* JADX INFO: renamed from: c */
    private final oju f5488c;

    /* JADX INFO: renamed from: d */
    private final oju f5489d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f5490e;

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f5490e = i;
        this.f5486a = ojuVar;
        this.f5487b = ojuVar2;
        this.f5488c = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f5490e = i;
        this.f5486a = ojuVar;
        this.f5488c = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr, byte[] bArr2) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5487b = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f5490e = i;
        this.f5487b = ojuVar;
        this.f5486a = ojuVar2;
        this.f5489d = ojuVar3;
        this.f5488c = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f5490e = i;
        this.f5487b = ojuVar;
        this.f5488c = ojuVar2;
        this.f5489d = ojuVar3;
        this.f5486a = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f5490e = i;
        this.f5486a = ojuVar;
        this.f5489d = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5488c = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f5490e = i;
        this.f5487b = ojuVar;
        this.f5489d = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5488c = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5486a = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f5490e = i;
        this.f5487b = ojuVar;
        this.f5489d = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5488c = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f5490e = i;
        this.f5489d = ojuVar;
        this.f5488c = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5486a = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5486a = ojuVar2;
        this.f5489d = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5486a = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f5490e = i;
        this.f5486a = ojuVar;
        this.f5489d = ojuVar2;
        this.f5487b = ojuVar3;
        this.f5488c = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f5490e = i;
        this.f5489d = ojuVar;
        this.f5486a = ojuVar2;
        this.f5488c = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5486a = ojuVar2;
        this.f5489d = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f5490e = i;
        this.f5489d = ojuVar;
        this.f5488c = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][][] fArr) {
        this.f5490e = i;
        this.f5489d = ojuVar;
        this.f5488c = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f5490e = i;
        this.f5486a = ojuVar;
        this.f5489d = ojuVar2;
        this.f5488c = ojuVar3;
        this.f5487b = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5487b = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5489d = ojuVar4;
    }

    public cez(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f5490e = i;
        this.f5488c = ojuVar;
        this.f5489d = ojuVar2;
        this.f5486a = ojuVar3;
        this.f5487b = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static cez m3587a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new cez(ojuVar, ojuVar2, ojuVar3, ojuVar4, 8, (byte[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static cez m3588b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new cez(ojuVar, ojuVar2, ojuVar3, ojuVar4, 19, (float[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        kan kanVar;
        switch (this.f5490e) {
            case 0:
                final cdu cduVar = ((err) this.f5486a).get();
                final nqf nqfVar = (nqf) this.f5487b.get();
                final oju ojuVar = this.f5488c;
                final oju ojuVar2 = this.f5489d;
                return new hjk() { // from class: cey
                    @Override // java.lang.Runnable
                    public final void run() {
                        nqf nqfVar2 = nqfVar;
                        oju ojuVar3 = ojuVar2;
                        cdu cduVar2 = cduVar;
                        oju ojuVar4 = ojuVar;
                        nqfVar2.mo14894e((cet) ojuVar3.get());
                        jvb jvbVarM3529i = cduVar2.m3529i();
                        jwn jwnVar = (jwn) ojuVar4.get();
                        cet cetVar = (cet) ojuVar3.get();
                        cetVar.getClass();
                        jvbVarM3529i.m13537d(jwnVar.mo3830a(new cbx(cetVar, 8), not.INSTANCE));
                    }
                };
            case 1:
                return new ccs((cbv) this.f5486a.get(), (jww) this.f5488c.get(), (jww) this.f5487b.get(), (dhv) this.f5489d.get());
            case 2:
                cfh cfhVar = (cfh) this.f5487b.get();
                cfo cfoVar = (cfo) this.f5486a.get();
                dhv dhvVar = (dhv) this.f5489d.get();
                oju ojuVar3 = this.f5488c;
                dhx dhxVar = dhf.f11040a;
                dhvVar.mo6176d();
                Object objM17137I = ((Boolean) ((jww) ojuVar3.get()).mo3831be()).booleanValue() ? mxk.m17137I(cfhVar, cfoVar) : mzx.f41874a;
                objM17137I.getClass();
                return objM17137I;
            case 3:
                ihk ihkVar = ((haj) this.f5486a).get();
                return new cfx(ihkVar, (dhv) this.f5488c.get(), (hah) this.f5489d.get(), null, null, null);
            case 4:
                mrm mrmVarM6617a = ((dra) this.f5487b).m6617a();
                oju ojuVar4 = this.f5489d;
                gdz gdzVar = ((geb) this.f5486a).get();
                jvb jvbVar = (jvb) this.f5488c.get();
                if (mrmVarM6617a.mo16813g()) {
                    kan kanVarM13873j = kan.m13873j(gdzVar.f24348b);
                    boolean zM13883m = kan.f35487b.m13883m(kanVarM13873j);
                    boolean zM13883m2 = kan.f35486a.m13883m(kanVarM13873j);
                    if (zM13883m) {
                        kanVar = kan.f35487b;
                    } else {
                        kanVar = zM13883m2 ? kan.f35486a : kan.f35488c;
                    }
                    objM17136H = mxk.m17136H(dez.m6036f(new apv(jvbVar, mrmVarM6617a, ojuVar4, kanVar, 3), "aizm"));
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 5:
                return new chb((kms) this.f5486a.get(), (kbz) this.f5489d.get(), (dnn) this.f5487b.get(), (dhv) this.f5488c.get());
            case 6:
                return new chd(this.f5488c, (jvd) this.f5486a.get(), ((eru) this.f5487b).get(), (kbz) this.f5489d.get());
            case 7:
                return new clq(((dws) this.f5487b).m6830a(), (ckp) this.f5489d.get(), (ScheduledExecutorService) this.f5488c.get(), (ScheduledExecutorService) this.f5486a.get(), 1);
            case 8:
                return new cky((jwn) this.f5487b.get(), (jwn) this.f5489d.get(), (eby) this.f5486a.get(), (eax) this.f5488c.get());
            case 9:
                boolean zBooleanValue = ((cde) this.f5489d).m3490a().booleanValue();
                ((cde) this.f5488c).m3490a().booleanValue();
                ohb ohbVarM18485a = ohh.m18485a(this.f5487b);
                ohh.m18485a(this.f5486a);
                mxi mxiVarM17132D = mxk.m17132D();
                if (zBooleanValue) {
                    mxiVarM17132D.mo17072d((dgg) ohbVarM18485a.get());
                }
                mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 10:
                bko bkoVar = (bko) this.f5486a.get();
                Executor executor = (Executor) this.f5489d.get();
                ((dws) this.f5487b).m6830a();
                return new cok(bkoVar, executor, (dhv) this.f5488c.get(), null, null, null);
            case 11:
                return new cqj((djm) this.f5488c.get(), (csm) this.f5486a.get(), (fws) this.f5487b.get(), (kbz) this.f5489d.get(), null, null, null, null);
            case 12:
                return new csr((jfs) this.f5489d.get(), (crh) this.f5486a.get(), (icf) this.f5488c.get(), (jvd) this.f5487b.get(), null, null);
            case 13:
                return new dxt(((cwa) this.f5488c).get(), this.f5486a, (jvb) this.f5487b.get(), this.f5489d, 1);
            case 14:
                return new dal((djm) this.f5488c.get(), (har) this.f5486a.get(), (jww) this.f5489d.get(), ohh.m18485a(this.f5487b), null, null, null);
            case 15:
                return new cvy((iht) this.f5489d.get(), ((dbl) this.f5488c).get(), ((dra) this.f5486a).m6617a(), (cte) this.f5487b.get(), (byte[]) null, (byte[]) null);
            case 16:
                return new ddr(((dcp) this.f5488c).get(), (CameraFatalErrorTrackerDatabase) this.f5487b.get(), ((ckl) this.f5486a).m3838a(), (dhv) this.f5489d.get(), null);
            case 17:
                ohh.m18485a(this.f5489d);
                dhv dhvVar2 = (dhv) this.f5488c.get();
                ((err) this.f5487b).get();
                if (dhvVar2.mo6184l(dig.f11503q)) {
                    dhvVar2.mo6177e();
                }
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 18:
                Object objM17136H2 = ((dec) this.f5487b.get()).m5985g() ? mxk.m17136H(new dft((AmbientModeSupport.AmbientController) this.f5489d.get(), this.f5488c, (jvd) this.f5486a.get(), 1, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 19:
                return new cvy(((fxj) this.f5489d).m8922a(), (dxx) this.f5488c.get(), (dyf) this.f5486a.get(), ((fkq) this.f5487b).get());
            default:
                return new clq(((err) this.f5487b).get(), (jww) this.f5488c.get(), (dlc) this.f5486a.get(), (igb) this.f5489d.get(), 2);
        }
    }
}
