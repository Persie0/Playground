package p000;

import android.app.Notification;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abk {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m118a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m119b(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* JADX INFO: renamed from: c */
    static Notification.Builder m120c(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m121d(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m122e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m123f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m124g(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }

    /* JADX INFO: renamed from: h */
    public static void m125h(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof aet) {
            ((aet) viewParent).mo392d(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                afw.m563a(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(CswIK.MbtwQzRZ, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m126i(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof aeu) {
            ((aeu) viewParent).mo397f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof aet) {
            ((aet) viewParent).mo393e(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                afw.m564b(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m127j(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof aet) {
            ((aet) viewParent).mo394g(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                afw.m565c(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m128k(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof aet) {
            ((aet) viewParent).mo395h(view, i);
            return;
        }
        if (i == 0) {
            try {
                afw.m566d(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(rmwTRjObXLGH.mwvgVJUsnISE, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m129l(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return afw.m567e(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m130m(ViewParent viewParent, View view, float f, float f2) {
        try {
            return afw.m568f(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m131n(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof aet) {
            return ((aet) viewParent).mo396t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return afw.m569g(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }
}
