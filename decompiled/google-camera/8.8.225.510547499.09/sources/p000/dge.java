package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dge {

    /* JADX INFO: renamed from: a */
    private static final nbh f10881a = nbh.m17259h("com/google/android/apps/camera/coach/CoachCameraResourcesManager");

    /* JADX INFO: renamed from: b */
    private final Deque f10882b = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    final synchronized mrm m6098a() {
        if (this.f10882b.isEmpty()) {
            return mqu.f41450a;
        }
        return mrm.m16829i((cvy) this.f10882b.getLast());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6099b() {
        if (this.f10882b.isEmpty()) {
            ((nbe) ((nbe) f10881a.m17252c()).mo17276G((char) 865)).mo17290o("onCameraEnd. Resource Q is empty!");
        } else {
            ((dyf) ((cvy) this.f10882b.removeFirst()).f9846c).m6921j(xPAWq.oVHQXwcWWIpUE);
            this.f10882b.size();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6100c(cvy cvyVar) {
        ((dyf) cvyVar.f9846c).m6920i("camera-coach-session");
        this.f10882b.addLast(cvyVar);
        this.f10882b.size();
    }
}
