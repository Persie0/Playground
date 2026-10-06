package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cda implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5251a;

    /* JADX INFO: renamed from: b */
    private final oju f5252b;

    /* JADX INFO: renamed from: c */
    private final oju f5253c;

    /* JADX INFO: renamed from: d */
    private final oju f5254d;

    /* JADX INFO: renamed from: e */
    private final oju f5255e;

    /* JADX INFO: renamed from: f */
    private final oju f5256f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f5257g;

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i) {
        this.f5257g = i;
        this.f5251a = ojuVar;
        this.f5252b = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5254d = ojuVar4;
        this.f5255e = ojuVar5;
        this.f5256f = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5251a = ojuVar2;
        this.f5254d = ojuVar3;
        this.f5252b = ojuVar4;
        this.f5253c = ojuVar5;
        this.f5255e = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr, byte[] bArr2) {
        this.f5257g = i;
        this.f5252b = ojuVar;
        this.f5256f = ojuVar2;
        this.f5251a = ojuVar3;
        this.f5253c = ojuVar4;
        this.f5255e = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr) {
        this.f5257g = i;
        this.f5255e = ojuVar;
        this.f5253c = ojuVar2;
        this.f5256f = ojuVar3;
        this.f5254d = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5252b = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr, byte[] bArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5255e = ojuVar2;
        this.f5251a = ojuVar3;
        this.f5252b = ojuVar4;
        this.f5253c = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[] fArr) {
        this.f5257g = i;
        this.f5255e = ojuVar;
        this.f5252b = ojuVar2;
        this.f5256f = ojuVar3;
        this.f5251a = ojuVar4;
        this.f5253c = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[] iArr) {
        this.f5257g = i;
        this.f5251a = ojuVar;
        this.f5256f = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5252b = ojuVar4;
        this.f5254d = ojuVar5;
        this.f5255e = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[] sArr) {
        this.f5257g = i;
        this.f5251a = ojuVar;
        this.f5254d = ojuVar2;
        this.f5252b = ojuVar3;
        this.f5253c = ojuVar4;
        this.f5256f = ojuVar5;
        this.f5255e = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[] zArr) {
        this.f5257g = i;
        this.f5252b = ojuVar;
        this.f5251a = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5256f = ojuVar4;
        this.f5255e = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][] bArr) {
        this.f5257g = i;
        this.f5252b = ojuVar;
        this.f5256f = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5255e = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][] cArr) {
        this.f5257g = i;
        this.f5251a = ojuVar;
        this.f5254d = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5255e = ojuVar4;
        this.f5256f = ojuVar5;
        this.f5252b = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][] fArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5251a = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5252b = ojuVar4;
        this.f5254d = ojuVar5;
        this.f5255e = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][] iArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5251a = ojuVar2;
        this.f5253c = ojuVar3;
        this.f5254d = ojuVar4;
        this.f5252b = ojuVar5;
        this.f5255e = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][] sArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5253c = ojuVar2;
        this.f5251a = ojuVar3;
        this.f5255e = ojuVar4;
        this.f5252b = ojuVar5;
        this.f5254d = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][] zArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5252b = ojuVar2;
        this.f5255e = ojuVar3;
        this.f5253c = ojuVar4;
        this.f5254d = ojuVar5;
        this.f5251a = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][][] bArr) {
        this.f5257g = i;
        this.f5253c = ojuVar;
        this.f5256f = ojuVar2;
        this.f5255e = ojuVar3;
        this.f5254d = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5252b = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][][] cArr) {
        this.f5257g = i;
        this.f5253c = ojuVar;
        this.f5256f = ojuVar2;
        this.f5255e = ojuVar3;
        this.f5254d = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5252b = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][][] fArr) {
        this.f5257g = i;
        this.f5253c = ojuVar;
        this.f5254d = ojuVar2;
        this.f5251a = ojuVar3;
        this.f5252b = ojuVar4;
        this.f5255e = ojuVar5;
        this.f5256f = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][][] iArr) {
        this.f5257g = i;
        this.f5252b = ojuVar;
        this.f5254d = ojuVar2;
        this.f5255e = ojuVar3;
        this.f5253c = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5256f = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][][] sArr) {
        this.f5257g = i;
        this.f5254d = ojuVar;
        this.f5252b = ojuVar2;
        this.f5256f = ojuVar3;
        this.f5255e = ojuVar4;
        this.f5251a = ojuVar5;
        this.f5253c = ojuVar6;
    }

    public cda(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][][] zArr) {
        this.f5257g = i;
        this.f5256f = ojuVar;
        this.f5253c = ojuVar2;
        this.f5252b = ojuVar3;
        this.f5251a = ojuVar4;
        this.f5255e = ojuVar5;
        this.f5254d = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static cda m3477a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 0);
    }

    /* JADX INFO: renamed from: b */
    public static cda m3478b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static cda m3479c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static cda m3480d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static cda m3481e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static cda m3482f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new cda(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 15, (short[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5257g) {
            case 0:
                return new ccz((fcp) this.f5251a.get(), ((cde) this.f5252b).m3490a(), ((fxk) this.f5253c).get(), (jwn) this.f5254d.get(), ((imu) this.f5255e.get()).m11491f().mo14556i(), ((ikv) this.f5256f).m11415a());
            case 1:
                return new cbt((fup) this.f5256f.get(), ((fuy) this.f5251a).get(), ((cdn) this.f5254d).get(), ((cde) this.f5252b).m3490a().booleanValue(), (dhv) this.f5253c.get(), ((fxk) this.f5255e).get(), null, null, null, null);
            case 2:
                return new cea((cdz) this.f5255e.get(), (dcl) this.f5253c.get(), (CameraActivityTiming) this.f5256f.get(), ((dce) this.f5254d).get(), (doe) this.f5251a.get(), (Executor) this.f5252b.get(), null, null, null);
            case 3:
                jwf jwfVar = (jwf) this.f5251a.get();
                hnv hnvVarM10532a = ((hog) this.f5254d).m10532a();
                return ((dhv) this.f5256f.get()).mo6184l(dib.f11318bY) ? jbx.m12869n(new cgg((chx) this.f5255e.get(), (hnw) this.f5252b.get(), (jvd) this.f5253c.get(), hnvVarM10532a, jwfVar, 0)) : cdw.f5366g;
            case 4:
                return new cgp(((dww) this.f5251a).m6836a(), (jwn) this.f5256f.get(), ((dws) this.f5253c).m6830a(), (elx) this.f5252b.get(), ((ity) this.f5254d).get(), ((cgf) this.f5255e).get());
            case 5:
                return new dfn(this.f5252b, this.f5251a, this.f5253c, (Executor) this.f5256f.get(), (Executor) this.f5255e.get(), (kbz) this.f5254d.get());
            case 6:
                return new cit(((dws) this.f5255e).m6830a(), (dhv) this.f5252b.get(), ((eru) this.f5256f).get(), (jvd) this.f5251a.get(), (Executor) this.f5253c.get(), (kbz) this.f5254d.get());
            case 7:
                return new msa((imu) this.f5253c.get(), (kov) this.f5252b.get(), ((fxk) this.f5256f).get(), (inm) this.f5255e.get(), (dhv) this.f5251a.get(), (jwn) this.f5254d.get());
            case 8:
                return new cwt((cwo) this.f5251a.get(), (cwq) this.f5254d.get(), (jwf) this.f5253c.get(), (cwm) this.f5255e.get(), (cwl) this.f5256f.get(), (jww) this.f5252b.get());
            case 9:
                return new cwy((cuh) this.f5256f.get(), (csm) this.f5253c.get(), (idl) this.f5251a.get(), (cwj) this.f5255e.get(), (dbr) this.f5252b.get(), ((cxe) this.f5254d).get());
            case 10:
                return new cxy((BottomBarController) this.f5256f.get(), (igb) this.f5251a.get(), (icf) this.f5253c.get(), ((czg) this.f5254d).get(), (daj) this.f5252b.get(), (dhv) this.f5255e.get(), null, null);
            case 11:
                return new cym((BottomBarController) this.f5256f.get(), (igb) this.f5252b.get(), (hxp) this.f5255e.get(), (icf) this.f5253c.get(), ((czg) this.f5254d).get(), ((crv) this.f5251a).m5442a(), null, null);
            case 12:
                return new dad(((dws) this.f5256f).m6830a(), (hqo) this.f5251a.get(), (jwf) this.f5253c.get(), (jww) this.f5252b.get(), (jww) this.f5254d.get(), (dhv) this.f5255e.get());
            case 13:
                return new dbu(((dws) this.f5253c).m6830a(), (cej) this.f5256f.get(), ((ema) this.f5255e).get(), (fcp) this.f5254d.get(), ((kbm) this.f5251a).get(), ((dce) this.f5252b).get(), null, null, null);
            case 14:
                return new dcb(((dws) this.f5253c).m6830a(), (cej) this.f5256f.get(), ((ema) this.f5255e).get(), (fcp) this.f5254d.get(), ((kbm) this.f5251a).get(), ((dce) this.f5252b).get(), null, null, null);
            case 15:
                return new dfn((jvd) this.f5254d.get(), (ddq) this.f5252b.get(), (dcm) this.f5256f.get(), ((dce) this.f5255e).get(), ((kbm) this.f5251a).get(), (dcf) this.f5253c.get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 16:
                ((hfb) this.f5254d).m10179a();
                dhv dhvVar = (dhv) this.f5253c.get();
                ((hfb) this.f5251a).m10179a();
                return new dfb(dhvVar);
            case 17:
                return new dff((det) this.f5256f.get(), new cwd((short[]) null), ((dey) this.f5253c).get(), (kcf) this.f5252b.get(), ((dfx) this.f5251a).get(), ((dws) this.f5255e).m6830a(), (kbz) this.f5254d.get(), null, null);
            case 18:
                return new dfn((dgi) this.f5253c.get(), (dgu) this.f5254d.get(), (dgo) this.f5251a.get(), (dsx) this.f5252b.get(), (dgb) this.f5255e.get(), (dfo) this.f5256f.get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 19:
                return new dgi(((etl) this.f5252b).m7866a(), (dgl) this.f5256f.get(), (ggm) this.f5251a.get(), (jww) this.f5253c.get(), (ScheduledExecutorService) this.f5255e.get(), (fcp) this.f5254d.get());
            default:
                return new dgu(((etl) this.f5256f).m7866a(), (dgw) this.f5255e.get(), (ggm) this.f5251a.get(), (jww) this.f5252b.get(), (ScheduledExecutorService) this.f5253c.get(), (fcp) this.f5254d.get());
        }
    }
}
