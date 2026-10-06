package p000;

import android.view.WindowManager;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihi extends ihg {

    /* JADX INFO: renamed from: a */
    private static final nbh f30957a = nbh.m17259h("com/google/android/apps/camera/ui/viewfinder/LowResViewfinderSizeSelector");

    /* JADX INFO: renamed from: b */
    private static final kbc f30958b = kbc.m13903h(1024, 768);

    /* JADX INFO: renamed from: c */
    private static final kbc f30959c = kbc.m13903h(1280, 720);

    /* JADX INFO: renamed from: d */
    private final kme f30960d;

    public ihi(WindowManager windowManager, dhv dhvVar, kme kmeVar, String str) {
        super(windowManager, dhvVar, str);
        this.f30960d = kmeVar;
    }

    @Override // p000.ihg, p000.ihv
    /* JADX INFO: renamed from: b */
    public final kbc mo11324b(List list, kan kanVar, kmq kmqVar, ikw ikwVar, kmg kmgVar) {
        kbc kbcVar;
        if (ikwVar == ikw.PHOTO) {
            try {
                kbc kbcVar2 = gdz.m9082a(this.f30960d.mo13854a(kmgVar), m11323a(list, kanVar.m13875a()), 34).f24348b;
                if (kan.f35487b.m13883m(kan.m13873j(kbcVar2))) {
                    kbcVar = f30959c;
                } else {
                    lku.m15669w(kan.f35486a.m13883m(kan.m13873j(kbcVar2)));
                    kbcVar = f30958b;
                }
                if (list.contains(kbcVar)) {
                    return kbcVar;
                }
            } catch (gdy e) {
                ((nbe) ((nbe) ((nbe) f30957a.m17252c()).mo17283h(e)).mo17276G((char) 4256)).mo17293r("selectViewfinderSize: cameraId=%s", kmgVar);
            }
        }
        return super.mo11324b(list, kanVar, kmqVar, ikwVar, kmgVar);
    }
}
