package p000;

import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.camera.p014ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqv implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f29201a;

    /* JADX INFO: renamed from: b */
    private final Object f29202b;

    public hqv(ihk ihkVar, int i) {
        this.f29201a = i;
        this.f29202b = ihkVar;
    }

    public hqv(oju ojuVar, int i) {
        this.f29201a = i;
        this.f29202b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static hqv m10643a(oju ojuVar) {
        return new hqv(ojuVar, 9);
    }

    /* JADX INFO: renamed from: b */
    public static jfs m10644b(dhv dhvVar) {
        return new jfs(dhvVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f29201a) {
            case 0:
                return new jpd((dhv) this.f29202b.get());
            case 1:
                return ((hoq) this.f29202b).get();
            case 2:
                return new dlr((hrh) this.f29202b.get(), 6);
            case 3:
                return new hry((hsd) this.f29202b.get());
            case 4:
                return Boolean.valueOf(((dhv) this.f29202b.get()).mo6183k(diu.f11712b));
            case 5:
                htf htfVar = (htf) this.f29202b.get();
                htfVar.getClass();
                return new idi(htfVar, 1);
            case 6:
                BreadcrumbsView breadcrumbsView = ((iig) this.f29202b).get().f31074k;
                lku.m15662p(breadcrumbsView);
                return new jfs((ife) breadcrumbsView);
            case 7:
                ZoomLockView zoomLockView = ((iig) this.f29202b).get().f31079p;
                lku.m15662p(zoomLockView);
                return new ikt(zoomLockView);
            case 8:
                return new hyb((ScheduledExecutorService) this.f29202b.get());
            case 9:
                return ((hyg) this.f29202b.get()).f29911c;
            case 10:
                return new hzu(((ema) this.f29202b).get());
            case 11:
                return m10644b((dhv) this.f29202b.get());
            case 12:
                return new jfs((kcj) this.f29202b.get());
            case 13:
                Object obj = ((ihk) this.f29202b).f30967b;
                obj.getClass();
                return obj;
            case 14:
                Object obj2 = ((ihk) this.f29202b).f30966a;
                obj2.getClass();
                return obj2;
            case 15:
                dhv dhvVar = (dhv) this.f29202b.get();
                return new ihz(((Integer) dhvVar.mo6173a(dif.f11477a).get()).intValue(), ((Integer) dhvVar.mo6173a(dif.f11478b).get()).intValue(), ((Float) dhvVar.mo6180h(dif.f11480d).get()).floatValue(), ((Float) dhvVar.mo6180h(dif.f11481e).get()).floatValue(), ((Float) dhvVar.mo6180h(dif.f11482f).get()).floatValue(), new DecelerateInterpolator(1.0f));
            case 16:
                ViewfinderCover viewfinderCover = (ViewfinderCover) this.f29202b.get();
                viewfinderCover.getClass();
                return viewfinderCover;
            case 17:
                jww jwwVar = (jww) this.f29202b.get();
                jwwVar.getClass();
                return jwwVar;
            case 18:
                jww jwwVar2 = (jww) this.f29202b.get();
                jwwVar2.getClass();
                return jwwVar2;
            case 19:
                jww jwwVar3 = (jww) this.f29202b.get();
                jwwVar3.getClass();
                return jwwVar3;
            default:
                jww jwwVar4 = (jww) this.f29202b.get();
                jwwVar4.getClass();
                return jwwVar4;
        }
    }
}
