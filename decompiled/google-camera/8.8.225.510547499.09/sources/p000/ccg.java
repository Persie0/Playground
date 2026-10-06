package p000;

import android.hardware.camera2.CameraManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5120a;

    /* JADX INFO: renamed from: b */
    private final oju f5121b;

    /* JADX INFO: renamed from: c */
    private final oju f5122c;

    /* JADX INFO: renamed from: d */
    private final oju f5123d;

    /* JADX INFO: renamed from: e */
    private final oju f5124e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f5125f;

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5121b = ojuVar2;
        this.f5122c = ojuVar3;
        this.f5123d = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5123d = ojuVar2;
        this.f5124e = ojuVar3;
        this.f5120a = ojuVar4;
        this.f5121b = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5122c = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5123d = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5121b = ojuVar2;
        this.f5123d = ojuVar3;
        this.f5122c = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr, byte[] bArr) {
        this.f5125f = i;
        this.f5123d = ojuVar;
        this.f5122c = ojuVar2;
        this.f5124e = ojuVar3;
        this.f5121b = ojuVar4;
        this.f5120a = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[] fArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5121b = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5123d = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[] iArr) {
        this.f5125f = i;
        this.f5121b = ojuVar;
        this.f5120a = ojuVar2;
        this.f5123d = ojuVar3;
        this.f5124e = ojuVar4;
        this.f5122c = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f5125f = i;
        this.f5124e = ojuVar;
        this.f5123d = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5120a = ojuVar4;
        this.f5122c = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[] zArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5121b = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5124e = ojuVar4;
        this.f5123d = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][] bArr) {
        this.f5125f = i;
        this.f5121b = ojuVar;
        this.f5122c = ojuVar2;
        this.f5123d = ojuVar3;
        this.f5120a = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][] cArr) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5124e = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5123d = ojuVar4;
        this.f5122c = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][] fArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5123d = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5121b = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][] iArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5123d = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5121b = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][] sArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5121b = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5123d = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][] zArr) {
        this.f5125f = i;
        this.f5123d = ojuVar;
        this.f5120a = ojuVar2;
        this.f5122c = ojuVar3;
        this.f5121b = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][][] bArr) {
        this.f5125f = i;
        this.f5124e = ojuVar;
        this.f5123d = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5121b = ojuVar4;
        this.f5122c = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][][] cArr) {
        this.f5125f = i;
        this.f5122c = ojuVar;
        this.f5123d = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5120a = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][][] fArr) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5123d = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5122c = ojuVar4;
        this.f5124e = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][][] iArr) {
        this.f5125f = i;
        this.f5123d = ojuVar;
        this.f5122c = ojuVar2;
        this.f5120a = ojuVar3;
        this.f5124e = ojuVar4;
        this.f5121b = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][][] sArr) {
        this.f5125f = i;
        this.f5123d = ojuVar;
        this.f5124e = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5122c = ojuVar4;
        this.f5120a = ojuVar5;
    }

    public ccg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][][] zArr) {
        this.f5125f = i;
        this.f5120a = ojuVar;
        this.f5122c = ojuVar2;
        this.f5121b = ojuVar3;
        this.f5124e = ojuVar4;
        this.f5123d = ojuVar5;
    }

    /* JADX INFO: renamed from: a */
    public static ccg m3431a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new ccg(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 0);
    }

    /* JADX INFO: renamed from: b */
    public static ccg m3432b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new ccg(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 4, (int[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5125f) {
            case 0:
                return new ccf((jvb) this.f5120a.get(), (eat) this.f5121b.get(), ((fxj) this.f5122c).m8922a(), (Executor) this.f5123d.get(), ((kbm) this.f5124e).get());
            case 1:
                return new drj(this.f5122c, this.f5123d, this.f5124e, this.f5120a, this.f5121b, (byte[]) null);
            case 2:
                return new dnu((cwd) this.f5120a.get(), (dhv) this.f5121b.get(), ((dws) this.f5123d).m6830a(), (cej) this.f5122c.get(), (jvd) this.f5124e.get(), 1, null, null);
            case 3:
                mpx mpxVar = (mpx) this.f5124e.get();
                dsx dsxVar = (dsx) this.f5123d.get();
                Object objM17136H = !((dhv) this.f5120a.get()).mo6184l(dhg.f11046a) ? mzx.f41874a : mxk.m17136H(new clq((cwd) this.f5121b.get(), mpxVar, dsxVar, ((err) this.f5122c).get(), 0, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                objM17136H.getClass();
                return objM17136H;
            case 4:
                return dez.m6036f(new cgg((dhv) this.f5120a.get(), ((fxj) this.f5121b).m8922a(), (mrm) this.f5124e.get(), ((clj) this.f5122c).get(), (jvb) this.f5123d.get(), 2), "autotimer");
            case 5:
                mbb mbbVar = (mbb) this.f5122c.get();
                C1058va c1058va = (C1058va) this.f5121b.get();
                ((inb) this.f5124e).get();
                return new djm(mbbVar, c1058va, null, null, null);
            case 6:
                return new cso((jwn) this.f5122c.get(), (ggm) this.f5121b.get(), (inm) this.f5120a.get(), (dhv) this.f5123d.get(), (jwn) this.f5124e.get());
            case 7:
                return new cvt((cvx) this.f5121b.get(), (cvx) this.f5122c.get(), (cvw) this.f5123d.get(), (cvu) this.f5120a.get(), (cvx) this.f5124e.get(), null);
            case 8:
                return new drj(((dws) this.f5120a).m6830a(), (har) this.f5124e.get(), ((cwr) this.f5121b).get(), (dhv) this.f5123d.get(), (fmz) this.f5122c.get(), (byte[]) null, (byte[]) null);
            case 9:
                return new cyi((BottomBarController) this.f5122c.get(), (igb) this.f5121b.get(), (hxp) this.f5120a.get(), (icf) this.f5123d.get(), ((czg) this.f5124e).get(), null, null);
            case 10:
                return new czt((hst) this.f5122c.get(), (ihk) this.f5123d.get(), ((dws) this.f5120a).m6830a(), ((cjm) this.f5121b).m3825a(), (ScheduledExecutorService) this.f5124e.get(), null, null);
            case 11:
                return new czw((gfa) this.f5123d.get(), (elx) this.f5120a.get(), ((dws) this.f5122c).m6830a(), (hah) this.f5121b.get(), (hai) this.f5124e.get());
            case 12:
                return new czy((hst) this.f5122c.get(), (ihk) this.f5123d.get(), ((dws) this.f5120a).m6830a(), ((cjm) this.f5121b).m3825a(), (ScheduledExecutorService) this.f5124e.get(), null, null);
            case 13:
                return new czz((hai) this.f5124e.get(), (dhv) this.f5123d.get(), (dal) this.f5120a.get(), (czy) this.f5121b.get(), (kpb) this.f5122c.get());
            case 14:
                return new ddw(((dws) this.f5122c).m6830a(), (iad) this.f5123d.get(), (dsx) this.f5121b.get(), (Executor) this.f5120a.get(), this.f5124e, null, null);
            case 15:
                return new dec((dhv) this.f5123d.get(), ((cde) this.f5124e).m3490a().booleanValue(), ((cde) this.f5121b).m3490a().booleanValue(), ((ddz) this.f5122c).get(), ((dws) this.f5120a).m6830a(), null, null);
            case 16:
                return new det(((dws) this.f5123d).m6830a(), (lqq) this.f5122c.get(), (ddx) this.f5120a.get(), kdz.m14010a(), (dfh) this.f5124e.get(), (dhv) this.f5121b.get(), null);
            case 17:
                kpb kpbVar = (kpb) this.f5120a.get();
                kpa kpaVar = (kpa) this.f5122c.get();
                hcg hcgVar = (hcg) this.f5121b.get();
                return new djg(kpbVar, kpaVar, hcgVar, ((djf) this.f5123d).get());
            case 18:
                return new dkg(((dws) this.f5120a).m6830a(), (djy) this.f5123d.get(), (dkc) this.f5121b.get(), (gxa) this.f5122c.get(), (hlp) this.f5124e.get());
            case 19:
                return new dfs((kbz) this.f5124e.get(), (jvd) this.f5120a.get(), ((eru) this.f5122c).get(), this.f5121b, this.f5123d, 2);
            default:
                CameraManager cameraManager = ((emn) this.f5123d).get();
                ohb ohbVarM18485a = ohh.m18485a(this.f5122c);
                return new dnm(cameraManager, ohbVarM18485a, (Executor) this.f5121b.get(), ((dcu) this.f5120a).get());
        }
    }
}
