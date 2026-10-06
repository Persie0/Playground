package p000;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cla implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f6091a;

    /* JADX INFO: renamed from: b */
    private final Object f6092b;

    public cla(cvy cvyVar, int i) {
        this.f6091a = i;
        this.f6092b = cvyVar;
    }

    public cla(oju ojuVar, int i) {
        this.f6091a = i;
        this.f6092b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static cla m3912a(oju ojuVar) {
        return new cla(ojuVar, 2);
    }

    /* JADX INFO: renamed from: b */
    public static cla m3913b(oju ojuVar) {
        return new cla(ojuVar, 19);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f6091a) {
            case 0:
                return jwv.m13645b(((hai) this.f6092b.get()).mo10030b(gzy.f27029am), cgh.f5593i, cgh.f5594j);
            case 1:
                return new ckp(ohh.m18485a(this.f6092b));
            case 2:
                return new clz((cwd) this.f6092b.get(), clm.m3919a(), null, null);
            case 3:
                dvl dvlVarM6866b = dxu.m6866b((dtj) this.f6092b.get());
                dvlVarM6866b.m6779c(500L, TimeUnit.MILLISECONDS);
                dvlVarM6866b.m6778b();
                dvlVarM6866b.f12658a = 3;
                dvlVarM6866b.f12660c = 4;
                return dvlVarM6866b.m6777a();
            case 4:
                npv npvVarM14955A = kxk.m14955A((ScheduledExecutorService) this.f6092b.get());
                npvVarM14955A.getClass();
                return npvVarM14955A;
            case 5:
                C1058va c1058vaM7796a = ((esu) this.f6092b).get();
                Object obj = c1058vaM7796a.f47804c;
                Object obj2 = c1058vaM7796a.f47802a;
                Object obj3 = c1058vaM7796a.f47803b;
                esz eszVar = (esz) obj;
                oju ojuVarM18486b = ohh.m18486b(new iim(eszVar.f16666fY, 16));
                oju ojuVarM18486b2 = ohh.m18486b(jya.f35118a);
                csi csiVar = new csi(ojuVarM18486b, ojuVarM18486b2, eszVar.f16424av);
                esr esrVar = (esr) obj2;
                cuv cuvVar = new cuv(esrVar.f15568aj, ojuVarM18486b, new jyj(ojuVarM18486b2), new jyh(ojuVarM18486b2));
                oju ojuVarM18486b3 = ohh.m18486b(cpm.f8641a);
                esw eswVar = (esw) obj3;
                djm djmVar = (djm) ohh.m18486b(new cpn(csiVar, cuvVar, ohh.m18486b(new cuy(eszVar.f16789hp, eswVar.f15803S, eswVar.f15804T, eswVar.f15805U, eswVar.f15796L, ohh.m18486b(new cla(ojuVarM18486b3, 4)), ojuVarM18486b3, esrVar.f15568aj, eszVar.f16747h, new cvo(eszVar.f16790hq), eszVar.f16531cw, eswVar.f15793I, eswVar.f15797M, eszVar.f16767hT, esrVar.f15613bb, eszVar.f16641f, new cvl(eszVar.f16791hr, eswVar.f15786B), 0)), 0)).get();
                djmVar.getClass();
                return djmVar;
            case 6:
                return new cwd((crn) this.f6092b.get());
            case 7:
                return new cte(((dra) this.f6092b).m6617a());
            case 8:
                return new cuh((cwd) this.f6092b.get(), null);
            case 9:
                return new cvx((dhv) this.f6092b.get(), 1);
            case 10:
                return new cvx((dhv) this.f6092b.get(), 0);
            case 11:
                return new cvx((dhv) this.f6092b.get(), 2);
            case 12:
                return ((cvy) this.f6092b).f9847d;
            case 13:
                return new cwl((haq) this.f6092b.get());
            case 14:
                return new cwd(((fne) this.f6092b).m8604a());
            case 15:
                Object obj4 = ((dfn) this.f6092b.get()).f10792e;
                obj4.getClass();
                return obj4;
            case 16:
                return ((cwa) this.f6092b).get().f9339d.m13661b();
            case 17:
                return new czr((jwn) this.f6092b.get());
            case 18:
                return new cwd((hht) this.f6092b.get());
            case 19:
                return new dbw(((eme) this.f6092b).get());
            default:
                aps apsVarM348g = aek.m348g(((dws) this.f6092b).m6830a(), CameraFatalErrorTrackerDatabase.class, "CameraFatalErrorTracker_db");
                apsVarM348g.m1816d();
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) apsVarM348g.m1813a();
                cameraFatalErrorTrackerDatabase.getClass();
                return cameraFatalErrorTrackerDatabase;
        }
    }
}
