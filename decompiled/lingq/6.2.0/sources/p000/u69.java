package p000;

import android.graphics.Rect;
import androidx.window.core.VerificationMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class u69 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f63496b = 0;

    /* JADX INFO: renamed from: a */
    public final VerificationMode f63497a;

    public u69() {
        VerificationMode verificationMode = VerificationMode.QUIET;
        verificationMode.getClass();
        this.f63497a = verificationMode;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22507a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (fa4.m11650l(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return fa4.m11650l(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22508b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (m22507a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m22509e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m22510f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m22511g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m22512h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    /* JADX INFO: renamed from: c */
    public final q6b m22513c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new q6b(EmptyList.f47638a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        t69.m21878d(sidecarDeviceState2, t69.m21876b(sidecarDeviceState));
        return new q6b(m22514d(t69.m21877c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m22514d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fr3 fr3VarM22515i = m22515i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (fr3VarM22515i != null) {
                arrayList.add(fr3VarM22515i);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final fr3 m22515i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        gp0 gp0Var;
        C3404oc c3404oc = C3404oc.f54159f;
        sidecarDisplayFeature.getClass();
        q41 q41Var = q41.f57242c;
        VerificationMode verificationMode = this.f63497a;
        verificationMode.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new pna(sidecarDisplayFeature, verificationMode, q41Var).mo4312c("Type must be either TYPE_FOLD or TYPE_HINGE", new p69()).mo4312c("Feature bounds must not be 0", new q69()).mo4312c("TYPE_FOLD must have 0 area", new r69()).mo4312c("Feature be pinned to either left or top", new s69()).mo4311a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            gp0Var = gp0.f41121f;
        } else {
            if (type != 2) {
                return null;
            }
            gp0Var = gp0.f41122g;
        }
        int iM21876b = t69.m21876b(sidecarDeviceState);
        if (iM21876b == 0 || iM21876b == 1) {
            return null;
        }
        if (iM21876b == 2) {
            c3404oc = C3404oc.f54160g;
        } else if (iM21876b != 3 && iM21876b == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new fr3(new hh0(rect), gp0Var, c3404oc);
    }
}
