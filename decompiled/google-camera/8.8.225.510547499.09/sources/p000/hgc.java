package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27662a;

    /* JADX INFO: renamed from: b */
    private final oju f27663b;

    /* JADX INFO: renamed from: c */
    private final oju f27664c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f27665d;

    /* JADX INFO: renamed from: e */
    private final Object f27666e;

    public hgc(iif iifVar, oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f27665d = i;
        this.f27666e = iifVar;
        this.f27663b = ojuVar;
        this.f27664c = ojuVar2;
        this.f27662a = ojuVar3;
    }

    public hgc(khb khbVar, oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f27665d = i;
        this.f27666e = khbVar;
        this.f27664c = ojuVar;
        this.f27663b = ojuVar2;
        this.f27662a = ojuVar3;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f27665d = i;
        this.f27662a = ojuVar;
        this.f27666e = ojuVar2;
        this.f27663b = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f27665d = i;
        this.f27664c = ojuVar;
        this.f27663b = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27662a = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f27665d = i;
        this.f27666e = ojuVar;
        this.f27662a = ojuVar2;
        this.f27664c = ojuVar3;
        this.f27663b = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f27665d = i;
        this.f27663b = ojuVar;
        this.f27666e = ojuVar2;
        this.f27664c = ojuVar3;
        this.f27662a = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f27665d = i;
        this.f27664c = ojuVar;
        this.f27666e = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27663b = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f27665d = i;
        this.f27662a = ojuVar;
        this.f27666e = ojuVar2;
        this.f27664c = ojuVar3;
        this.f27663b = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f27665d = i;
        this.f27666e = ojuVar;
        this.f27663b = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f27665d = i;
        this.f27666e = ojuVar;
        this.f27663b = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f27665d = i;
        this.f27666e = ojuVar;
        this.f27663b = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f27665d = i;
        this.f27663b = ojuVar;
        this.f27662a = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f27665d = i;
        this.f27663b = ojuVar;
        this.f27662a = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f27665d = i;
        this.f27662a = ojuVar;
        this.f27664c = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27663b = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f27665d = i;
        this.f27662a = ojuVar;
        this.f27663b = ojuVar2;
        this.f27664c = ojuVar3;
        this.f27666e = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f27665d = i;
        this.f27663b = ojuVar;
        this.f27666e = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27664c = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f27665d = i;
        this.f27662a = ojuVar;
        this.f27664c = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27663b = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f27665d = i;
        this.f27664c = ojuVar;
        this.f27663b = ojuVar2;
        this.f27666e = ojuVar3;
        this.f27662a = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f27665d = i;
        this.f27666e = ojuVar;
        this.f27663b = ojuVar2;
        this.f27664c = ojuVar3;
        this.f27662a = ojuVar4;
    }

    public hgc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f27665d = i;
        this.f27663b = ojuVar;
        this.f27666e = ojuVar2;
        this.f27662a = ojuVar3;
        this.f27664c = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static hgc m10236a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new hgc(ojuVar, ojuVar2, ojuVar3, ojuVar4, 4, (short[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static hgc m10237b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new hgc(ojuVar, ojuVar2, ojuVar3, ojuVar4, 9, (char[][]) null);
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v34, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v35, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        mrm mrmVarM16829i;
        switch (this.f27665d) {
            case 0:
                return new hgb((fcp) this.f27662a.get(), (jww) this.f27666e.get(), (hah) this.f27663b.get(), (hai) this.f27664c.get());
            case 1:
                mrm mrmVar = (mrm) this.f27662a.get();
                Object objM17136H = !mrmVar.mo16813g() ? mzx.f41874a : mxk.m17136H(new clq((jvd) this.f27664c.get(), (oju) this.f27666e, mrmVar, this.f27663b, 4));
                objM17136H.getClass();
                return objM17136H;
            case 2:
                return new hkn((hki) this.f27663b.get(), (Instrumentation) this.f27664c.get(), (ksa) this.f27666e.get(), (kbz) this.f27662a.get());
            case 3:
                return new hml(((dws) this.f27666e).m6830a(), (hah) this.f27662a.get(), mrm.m16829i((gvo) this.f27664c.get()), (dhv) this.f27663b.get());
            case 4:
                return new hna((jww) this.f27662a.get(), (jww) this.f27666e.get(), ((hne) this.f27664c).get(), ((fwv) this.f27663b).get());
            case 5:
                return new hnj(((dww) this.f27664c).m6836a(), ((gcw) this.f27666e).m9065a(), (jfs) this.f27662a.get(), (ihk) this.f27663b.get(), null, null, null);
            case 6:
                dhv dhvVar = (dhv) this.f27666e.get();
                Object objM17136H2 = (dhvVar.mo6184l(dhi.f11115b) && dhvVar.mo6184l(dhi.f11119f) && dhvVar.mo6184l(diy.f11744a)) ? mxk.m17136H(new dft((hah) this.f27663b.get(), (AmbientModeSupport.AmbientController) this.f27662a.get(), ohh.m18485a(this.f27664c), 10, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 7:
                return new hpa((dhv) this.f27663b.get(), (jww) this.f27666e.get(), (jww) this.f27664c.get(), (hqo) this.f27662a.get());
            case 8:
                return new hrl((hst) this.f27666e.get(), ((dws) this.f27663b).m6830a(), (DisplayMetrics) this.f27662a.get(), (kpb) this.f27664c.get());
            case 9:
                mrm mrmVarM10179a = ((hfb) this.f27666e).m10179a();
                hse hseVar = (hse) this.f27663b.get();
                mrm mrmVarM8495b = ((fjp) this.f27662a).m8495b();
                jwn jwnVar = (jwn) this.f27664c.get();
                if (!mrmVarM10179a.mo16813g()) {
                    return mqu.f41450a;
                }
                djm djmVar = (djm) mrmVarM10179a.mo16809c();
                if (mrmVarM8495b.mo16813g()) {
                    hsa hsaVarM10682a = hsa.m10682a(((Integer) mrmVarM8495b.mo16809c()).intValue());
                    if (hsaVarM10682a != hsa.f29385a) {
                        mrmVarM16829i = mrm.m16829i(hsaVarM10682a);
                    } else {
                        ((nbe) ((nbe) hsc.f29392a.m17251b()).mo17276G((char) 3938)).mo17290o("Unsupported tracker type");
                        mrmVarM16829i = mqu.f41450a;
                    }
                } else {
                    mrmVarM16829i = mqu.f41450a;
                }
                djmVar.f11788b.mo13961e("RoiTracker");
                try {
                    boolean z = djmVar.f11789c.mo6184l(diu.f11713c) || djmVar.f11789c.mo6184l(diu.f11714d);
                    hrq hrqVar = new hrq(mrm.m16829i(hseVar), mrmVarM16829i, djmVar.f11789c.mo6184l(diu.f11715e), djmVar.f11789c.mo6182j(diu.f11716f), djmVar.f11789c.mo6182j(diu.f11717g), z, (Context) djmVar.f11787a, jwnVar);
                    return mrm.m16829i(hrqVar);
                } finally {
                    djmVar.f11788b.mo13962f();
                }
            case 10:
                Object objM17136H3 = !((dhv) this.f27663b.get()).mo6184l(dif.f11479c) ? mzx.f41874a : mxk.m17136H(new dft((jvd) this.f27662a.get(), ((eru) this.f27664c).get(), ohh.m18485a(this.f27666e), 11));
                objM17136H3.getClass();
                return objM17136H3;
            case 11:
                Object obj = this.f27666e;
                final ActivityC0157ei activityC0157ei = ((emd) this.f27663b).get();
                jvd jvdVar = (jvd) this.f27664c.get();
                final kbz kbzVar = (kbz) this.f27662a.get();
                final nqf nqfVarM17621g = nqf.m17621g();
                final iif iifVar = (iif) obj;
                jvdVar.m13541c(new Runnable() { // from class: iie
                    @Override // java.lang.Runnable
                    public final void run() {
                        iif iifVar2 = iifVar;
                        ActivityC0157ei activityC0157ei2 = activityC0157ei;
                        kbz kbzVar2 = kbzVar;
                        nqf nqfVar = nqfVarM17621g;
                        if (activityC0157ei2.isDestroyed()) {
                            ((nbe) ((nbe) iif.f31085a.m17251b()).mo17276G((char) 4267)).mo17290o("Error at inflateCameraActivityUi: activity is destroyed");
                        }
                        kbzVar2.mo13961e("CameraActivityUi#mainInflate");
                        iifVar2.f31086b.f31064a.inflate();
                        iifVar2.f31086b.f31065b.inflate();
                        nqfVar.mo14894e(new djm(iifVar2.f31086b.f31080q, (byte[]) null, (byte[]) null));
                        kbzVar2.mo13962f();
                    }
                });
                djm djmVar2 = (djm) kxk.m14974T(nqfVarM17621g);
                djmVar2.getClass();
                return djmVar2;
            case 12:
                return new ijo((dfn) this.f27663b.get(), (elx) this.f27662a.get(), (oju) this.f27666e, (dhv) this.f27664c.get(), 1);
            case 13:
                return new ijo((hxn) this.f27662a.get(), this.f27663b, ((dws) this.f27664c).m6830a(), ((err) this.f27666e).get(), 0);
            case 14:
                return new ijo((hxw) this.f27663b.get(), (hxw) this.f27662a.get(), (oju) this.f27666e, (dhv) this.f27664c.get(), 2);
            case 15:
                return new ijo(this.f27663b, ((err) this.f27666e).get(), (hah) this.f27662a.get(), (jvd) this.f27664c.get(), 3);
            case 16:
                return new ike(((crv) this.f27662a).m5442a(), ((erp) this.f27664c).get(), this.f27666e, (dhv) this.f27663b.get(), 0);
            case 17:
                return new ktz(this.f27666e, this.f27663b, this.f27664c, this.f27662a, null);
            case 18:
                Object obj2 = this.f27666e;
                Set set = ((ohm) this.f27664c).get();
                Executor executor = (Executor) this.f27663b.get();
                kbz kbzVar2 = (kbz) this.f27662a.get();
                HashSet hashSet = new HashSet(set);
                hashSet.add(((kfn) ((khb) obj2).f36008a).f35850n);
                return new kgm(kfi.m14107b(hashSet), new kcf(executor, kbzVar2, "FrameListeners"), null);
            case 19:
                jvb jvbVar = (jvb) this.f27664c.get();
                khg khgVar = (khg) this.f27666e.get();
                kbo kboVar = ((kbm) this.f27662a).get();
                jvb jvbVar2 = new jvb();
                jvbVar.m13537d(new gjm(jvh.m13558f(jvbVar2, "ShutdownHndlr"), kboVar.mo6314a("FrameServer"), khgVar, jvbVar2, 3));
                return jvbVar2;
            default:
                return new khf((ktz) this.f27663b.get(), ((fne) this.f27666e).m8604a(), (kie) this.f27662a.get(), ((kbm) this.f27664c).get(), null, null);
        }
    }
}
