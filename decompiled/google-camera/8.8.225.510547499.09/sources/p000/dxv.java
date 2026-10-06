package p000;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12852a;

    /* JADX INFO: renamed from: b */
    private final oju f12853b;

    /* JADX INFO: renamed from: c */
    private final oju f12854c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f12855d;

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12853b = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f12855d = i;
        this.f12854c = ojuVar;
        this.f12853b = ojuVar2;
        this.f12852a = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12854c = ojuVar2;
        this.f12852a = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f12855d = i;
        this.f12854c = ojuVar;
        this.f12852a = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f12855d = i;
        this.f12854c = ojuVar;
        this.f12852a = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12854c = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12854c = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12854c = ojuVar2;
        this.f12852a = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][][] fArr) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12854c = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12854c = ojuVar2;
        this.f12853b = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f12855d = i;
        this.f12853b = ojuVar;
        this.f12852a = ojuVar2;
        this.f12854c = ojuVar3;
    }

    public dxv(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f12855d = i;
        this.f12852a = ojuVar;
        this.f12854c = ojuVar2;
        this.f12853b = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static dxv m6873a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 0);
    }

    /* JADX INFO: renamed from: b */
    public static dxv m6874b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dxv m6875c(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dxv m6876d(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dxv m6877e(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dxv m6878f(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static dxv m6879g(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static dxv m6880h(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 9, (short[][]) null);
    }

    /* JADX INFO: renamed from: i */
    public static dxv m6881i(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 10, (int[][]) null);
    }

    /* JADX INFO: renamed from: j */
    public static dxv m6882j(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dxv(ojuVar, ojuVar2, ojuVar3, 20, (float[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12855d) {
            case 0:
                dsx dsxVar = ((dms) this.f12852a).get();
                dhv dhvVar = (dhv) this.f12853b.get();
                lqc lqcVar = ((fxb) this.f12854c).get();
                dxu.m6872h(dsxVar, dhvVar, lqcVar);
                if (dxu.m6871g(dsxVar, lqcVar)) {
                    dhx dhxVar = dii.f11525a;
                    dhvVar.mo6176d();
                    if (ivs.f32335o != null) {
                        dhvVar.mo6178f();
                        return fxo.m8928b(ivs.f32335o, ivs.f32336p);
                    }
                }
                return fxo.m8931e();
            case 1:
                gdz gdzVar = ((geb) this.f12853b).get();
                dhv dhvVar2 = (dhv) this.f12852a.get();
                kbc kbcVar = ((fwz) this.f12854c).get();
                kbc kbcVar2 = gdzVar.f24348b;
                if (dhvVar2.mo6184l(did.f11414Y)) {
                    return kbcVar;
                }
                if (kan.f35487b.m13883m(kan.m13873j(kbcVar2))) {
                    return dye.f12882b;
                }
                lku.m15669w(kan.f35486a.m13883m(kan.m13873j(kbcVar2)));
                return dye.f12881a;
            case 2:
                return new dyi((mrm) this.f12854c.get(), ((dws) this.f12853b).m6830a(), (dhv) this.f12852a.get());
            case 3:
                return new eav((end) this.f12854c.get(), (fvu) this.f12852a.get(), (kmd) this.f12853b.get());
            case 4:
                return new bko((ebv) this.f12854c.get(), ((dws) this.f12852a).m6830a().getFilesDir(), dvb.m6761a(), (kpb) this.f12853b.get());
            case 5:
                return new eco((jwn) this.f12853b.get(), (Executor) this.f12852a.get(), (jvb) this.f12854c.get());
            case 6:
                Object obj = (((egx) this.f12853b).m7318b().booleanValue() || ((egx) this.f12854c).m7318b().booleanValue()) ? (efw) this.f12852a.get() : gcm.f24206b;
                obj.getClass();
                return obj;
            case 7:
                return (((egx) this.f12852a).m7318b().booleanValue() || ((egx) this.f12854c).m7318b().booleanValue()) ? mrm.m16829i(((efv) this.f12853b).get()) : mqu.f41450a;
            case 8:
                return (((egx) this.f12852a).m7318b().booleanValue() || ((egx) this.f12854c).m7318b().booleanValue()) ? ((egg) this.f12853b).get() : gcn.f24209b;
            case 9:
                boolean zBooleanValue = ((egx) this.f12853b).m7318b().booleanValue();
                final jwn jwnVar = (jwn) this.f12852a.get();
                final hnw hnwVar = (hnw) this.f12854c.get();
                Object objM17136H = zBooleanValue ? mxk.m17136H(new egy() { // from class: egu
                    @Override // p000.egy
                    /* JADX INFO: renamed from: a */
                    public final String mo7312a(String str) {
                        jwn jwnVar2 = jwnVar;
                        hnw hnwVar2 = hnwVar;
                        return str + "\n==HAWK Summary==\n  Throttled: " + (!((Boolean) jwnVar2.mo3831be()).booleanValue()) + "\n  Level: " + String.valueOf(hnwVar2.mo10518e()) + "\n";
                    }
                }) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 10:
                final oju ojuVar = this.f12853b;
                final nqf nqfVar = (nqf) this.f12852a.get();
                return dez.m6036f(((kbz) this.f12854c.get()).mo13959c("HdrPlusImageCaptureAvailability", new Runnable() { // from class: eha
                    @Override // java.lang.Runnable
                    public final void run() {
                        nqfVar.mo14894e((jwn) ojuVar.get());
                    }
                }), "hdrplusa");
            case 11:
                return new djm(((kbm) this.f12853b).get(), (kbz) this.f12854c.get(), ((dws) this.f12852a).m6830a());
            case 12:
                return new eiw((ekt) this.f12853b.get(), (eks) this.f12852a.get(), kdz.m14010a(), (kpb) this.f12854c.get());
            case 13:
                return new ejj((ejd) this.f12853b.get(), (eim) this.f12852a.get(), (hah) this.f12854c.get());
            case 14:
                dhv dhvVar3 = (dhv) this.f12853b.get();
                ((cde) this.f12852a).m3490a().booleanValue();
                ohh.m18485a(this.f12854c);
                if (dhvVar3.mo6184l(dhi.f11115b)) {
                    dhvVar3.mo6184l(dhi.f11119f);
                }
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 15:
                dhv dhvVar4 = (dhv) this.f12853b.get();
                ((cde) this.f12852a).m3490a().booleanValue();
                Object objM17136H2 = (dhvVar4.mo6184l(dhi.f11115b) && dhvVar4.mo6184l(dhi.f11119f)) ? mxk.m17136H((dgn) ohh.m18485a(this.f12854c).get()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 16:
                Activity activity = ((ema) this.f12852a).get();
                ((dws) this.f12853b).m6830a();
                gtd.m9736s();
                return new jiy(activity);
            case 17:
                fba fbaVar = ((eru) this.f12852a).get();
                jvd jvdVar = (jvd) this.f12854c.get();
                mrm mrmVarM5442a = ((crv) this.f12853b).m5442a();
                Object objM17136H3 = mrmVarM5442a.mo16813g() ? mxk.m17136H(new dft(mrmVarM5442a, jvdVar, fbaVar, 5)) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 18:
                return new etn((elx) this.f12852a.get(), (hah) this.f12853b.get(), (hai) this.f12854c.get());
            case 19:
                return new C1058va((dbr) this.f12852a.get(), (jvd) this.f12854c.get(), (jwn) this.f12853b.get());
            default:
                Object obj2 = (((dhv) this.f12854c.get()).mo6184l(did.f11434am) && ((Boolean) ((jww) this.f12853b.get()).mo3831be()).booleanValue()) ? (mrm) this.f12852a.get() : mqu.f41450a;
                obj2.getClass();
                return obj2;
        }
    }
}
