package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cef implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5429a;

    /* JADX INFO: renamed from: b */
    private final oju f5430b;

    /* JADX INFO: renamed from: c */
    private final oju f5431c;

    /* JADX INFO: renamed from: d */
    private final oju f5432d;

    /* JADX INFO: renamed from: e */
    private final oju f5433e;

    /* JADX INFO: renamed from: f */
    private final oju f5434f;

    /* JADX INFO: renamed from: g */
    private final oju f5435g;

    /* JADX INFO: renamed from: h */
    private final oju f5436h;

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ int f5437i;

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i) {
        this.f5437i = i;
        this.f5429a = ojuVar;
        this.f5430b = ojuVar2;
        this.f5431c = ojuVar3;
        this.f5432d = ojuVar4;
        this.f5433e = ojuVar5;
        this.f5434f = ojuVar6;
        this.f5435g = ojuVar7;
        this.f5436h = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[] bArr) {
        this.f5437i = i;
        this.f5431c = ojuVar;
        this.f5433e = ojuVar2;
        this.f5432d = ojuVar3;
        this.f5434f = ojuVar4;
        this.f5430b = ojuVar5;
        this.f5429a = ojuVar6;
        this.f5435g = ojuVar7;
        this.f5436h = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, char[] cArr) {
        this.f5437i = i;
        this.f5430b = ojuVar;
        this.f5431c = ojuVar2;
        this.f5436h = ojuVar3;
        this.f5434f = ojuVar4;
        this.f5432d = ojuVar5;
        this.f5433e = ojuVar6;
        this.f5435g = ojuVar7;
        this.f5429a = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, float[] fArr) {
        this.f5437i = i;
        this.f5431c = ojuVar;
        this.f5429a = ojuVar2;
        this.f5436h = ojuVar3;
        this.f5430b = ojuVar4;
        this.f5435g = ojuVar5;
        this.f5432d = ojuVar6;
        this.f5434f = ojuVar7;
        this.f5433e = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, int[] iArr) {
        this.f5437i = i;
        this.f5430b = ojuVar;
        this.f5429a = ojuVar2;
        this.f5435g = ojuVar3;
        this.f5432d = ojuVar4;
        this.f5434f = ojuVar5;
        this.f5431c = ojuVar6;
        this.f5436h = ojuVar7;
        this.f5433e = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, short[] sArr) {
        this.f5437i = i;
        this.f5433e = ojuVar;
        this.f5435g = ojuVar2;
        this.f5434f = ojuVar3;
        this.f5429a = ojuVar4;
        this.f5430b = ojuVar5;
        this.f5436h = ojuVar6;
        this.f5432d = ojuVar7;
        this.f5431c = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, boolean[] zArr) {
        this.f5437i = i;
        this.f5430b = ojuVar;
        this.f5436h = ojuVar2;
        this.f5435g = ojuVar3;
        this.f5434f = ojuVar4;
        this.f5429a = ojuVar5;
        this.f5433e = ojuVar6;
        this.f5432d = ojuVar7;
        this.f5431c = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[][] bArr) {
        this.f5437i = i;
        this.f5430b = ojuVar;
        this.f5429a = ojuVar2;
        this.f5435g = ojuVar3;
        this.f5436h = ojuVar4;
        this.f5434f = ojuVar5;
        this.f5431c = ojuVar6;
        this.f5433e = ojuVar7;
        this.f5432d = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, char[][] cArr) {
        this.f5437i = i;
        this.f5433e = ojuVar;
        this.f5432d = ojuVar2;
        this.f5430b = ojuVar3;
        this.f5434f = ojuVar4;
        this.f5435g = ojuVar5;
        this.f5429a = ojuVar6;
        this.f5436h = ojuVar7;
        this.f5431c = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, float[][] fArr) {
        this.f5437i = i;
        this.f5436h = ojuVar;
        this.f5430b = ojuVar2;
        this.f5431c = ojuVar3;
        this.f5432d = ojuVar4;
        this.f5434f = ojuVar5;
        this.f5429a = ojuVar6;
        this.f5435g = ojuVar7;
        this.f5433e = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, int[][] iArr) {
        this.f5437i = i;
        this.f5431c = ojuVar;
        this.f5430b = ojuVar2;
        this.f5434f = ojuVar3;
        this.f5436h = ojuVar4;
        this.f5435g = ojuVar5;
        this.f5432d = ojuVar6;
        this.f5429a = ojuVar7;
        this.f5433e = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, short[][] sArr) {
        this.f5437i = i;
        this.f5429a = ojuVar;
        this.f5432d = ojuVar2;
        this.f5433e = ojuVar3;
        this.f5435g = ojuVar4;
        this.f5434f = ojuVar5;
        this.f5430b = ojuVar6;
        this.f5436h = ojuVar7;
        this.f5431c = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, boolean[][] zArr) {
        this.f5437i = i;
        this.f5430b = ojuVar;
        this.f5429a = ojuVar2;
        this.f5434f = ojuVar3;
        this.f5436h = ojuVar4;
        this.f5432d = ojuVar5;
        this.f5435g = ojuVar6;
        this.f5431c = ojuVar7;
        this.f5433e = ojuVar8;
    }

    public cef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, int i, byte[][][] bArr) {
        this.f5437i = i;
        this.f5434f = ojuVar;
        this.f5430b = ojuVar2;
        this.f5436h = ojuVar3;
        this.f5432d = ojuVar4;
        this.f5431c = ojuVar5;
        this.f5433e = ojuVar6;
        this.f5435g = ojuVar7;
        this.f5429a = ojuVar8;
    }

    /* JADX INFO: renamed from: a */
    public static cef m3553a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new cef(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static cef m3554b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new cef(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static cef m3555c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new cef(ojuVar, ojuVar2, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static cef m3556d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        return new cef(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, 13, (byte[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objUnmodifiableSet;
        switch (this.f5437i) {
            case 0:
                return new cee(((ema) this.f5429a).get(), (cej) this.f5430b.get(), ((eru) this.f5431c).get(), (cec) this.f5432d.get(), ((ert) this.f5433e).get(), (jvd) this.f5434f.get(), ((cjm) this.f5435g).m3825a(), ((Boolean) this.f5436h.get()).booleanValue(), null, null);
            case 1:
                return new cch(((kbm) this.f5431c).get(), (jvb) this.f5433e.get(), ((fxj) this.f5432d).m8922a(), (eat) this.f5434f.get(), (jww) this.f5430b.get(), (jww) this.f5429a.get(), (fcp) this.f5435g.get(), (jwn) this.f5436h.get());
            case 2:
                return new cgb((bkn) this.f5430b.get(), ((cgd) this.f5431c).get(), ((dww) this.f5436h).m6836a(), (fcp) this.f5434f.get(), (jwn) this.f5432d.get(), (jwn) this.f5433e.get(), (jwn) this.f5435g.get(), (dhv) this.f5429a.get(), null, null, null);
            case 3:
                return new cms(((ile) this.f5433e).get(), (hzu) this.f5435g.get(), (kms) this.f5434f.get(), (dbr) this.f5429a.get(), ((err) this.f5430b).get(), (dhv) this.f5436h.get(), (dnn) this.f5432d.get(), (jwn) this.f5431c.get());
            case 4:
                return new cxc((cuh) this.f5430b.get(), (csm) this.f5429a.get(), (iht) this.f5435g.get(), (dbr) this.f5432d.get(), ((cxe) this.f5434f).get(), (jwn) this.f5431c.get(), (jwn) this.f5436h.get(), (dhv) this.f5433e.get());
            case 5:
                return new cye((BottomBarController) this.f5430b.get(), (igb) this.f5436h.get(), ((ity) this.f5435g).get(), ((emb) this.f5434f).get(), (hxp) this.f5429a.get(), (cwd) this.f5433e.get(), (icf) this.f5432d.get(), ((czg) this.f5431c).get(), null, null, null, null);
            case 6:
                return new dgo((dgp) this.f5431c.get(), ((dws) this.f5429a).m6830a(), (gvo) this.f5436h.get(), ((etl) this.f5430b).m7866a(), (fcp) this.f5435g.get(), (ScheduledExecutorService) this.f5432d.get(), (jfs) this.f5434f.get(), (dhv) this.f5433e.get(), null, null, null);
            case 7:
                ((dws) this.f5430b).m6830a();
                return new drt((jvd) this.f5436h.get(), ((hog) this.f5434f).m10532a(), (hnw) this.f5431c.get(), (dhv) this.f5433e.get(), (dsr) this.f5432d.get());
            case 8:
                edk edkVar = (edk) this.f5433e.get();
                eby ebyVar = (eby) this.f5432d.get();
                dhv dhvVar = (dhv) this.f5430b.get();
                return new eer((hnw) this.f5434f.get(), ((hog) this.f5435g).m10532a(), ebyVar.f13316b, edkVar, dhvVar, (ebv) this.f5429a.get(), (jwn) this.f5436h.get(), (jvb) this.f5431c.get());
            case 9:
                return new hee(this.f5429a, this.f5432d, this.f5433e, this.f5435g, this.f5434f, this.f5430b, this.f5436h, this.f5431c, (byte[]) null);
            case 10:
                return new fdq(((dww) this.f5431c).m6836a(), ((dws) this.f5430b).m6830a(), (hah) this.f5434f.get(), (fly) this.f5436h.get(), (jfs) this.f5435g.get(), (ScheduledExecutorService) this.f5432d.get(), ((cmx) this.f5429a).get(), (jwn) this.f5433e.get(), null, null, null);
            case 11:
                boolean zBooleanValue = ((Boolean) this.f5430b.get()).booleanValue();
                Executor executor = (Executor) this.f5429a.get();
                oju ojuVar = this.f5434f;
                frx frxVar = (frx) this.f5436h.get();
                oju ojuVar2 = this.f5432d;
                oju ojuVar3 = this.f5435g;
                gti gtiVar = (gti) this.f5431c.get();
                dhv dhvVar2 = (dhv) this.f5433e.get();
                HashSet hashSet = new HashSet();
                if (dhvVar2 != null) {
                    dhx dhxVar = dii.f11525a;
                }
                if (zBooleanValue) {
                    gtiVar.mo9760e();
                    hashSet.add(new epm(ojuVar3, ojuVar2, executor, 12));
                    dhw dhwVar = dij.f11577a;
                    dhvVar2.mo6176d();
                    fsd fsdVar = (fsd) ojuVar.get();
                    frxVar.getClass();
                    hashSet.add(new fnx(frxVar, 9));
                    fsdVar.getClass();
                    hashSet.add(new fnx(fsdVar, 10));
                    objUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                } else {
                    objUnmodifiableSet = mzx.f41874a;
                }
                objUnmodifiableSet.getClass();
                return objUnmodifiableSet;
            case 12:
                return new frk((ecq) this.f5436h.get(), (kmd) this.f5430b.get(), ((kbm) this.f5431c).get(), (dhv) this.f5432d.get(), ((frd) this.f5434f).get(), (Executor) this.f5429a.get(), (bko) this.f5435g.get(), (gva) this.f5433e.get(), null, null);
            default:
                dxx dxxVar = (dxx) this.f5434f.get();
                kmd kmdVar = ((fxk) this.f5430b).get();
                ((kbm) this.f5436h).get();
                return new fsc(dxxVar, kmdVar, (dhv) this.f5432d.get(), (flc) this.f5431c.get(), (eby) this.f5433e.get(), (hmw) this.f5435g.get(), (msa) this.f5429a.get(), null);
        }
    }
}
