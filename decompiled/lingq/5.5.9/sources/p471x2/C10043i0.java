package p471x2;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: x2.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10043i0 {
    /* JADX INFO: renamed from: a */
    public static boolean m18815a(ViewParent viewParent, View view, float f3, float f10, boolean z10) {
        return viewParent.onNestedFling(view, f3, f10, z10);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18816b(ViewParent viewParent, View view, float f3, float f10) {
        return viewParent.onNestedPreFling(view, f3, f10);
    }

    /* JADX INFO: renamed from: c */
    public static void m18817c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        viewParent.onNestedPreScroll(view, i10, i11, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m18818d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        viewParent.onNestedScroll(view, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: e */
    public static void m18819e(ViewParent viewParent, View view, View view2, int i10) {
        viewParent.onNestedScrollAccepted(view, view2, i10);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18820f(ViewParent viewParent, View view, View view2, int i10) {
        return viewParent.onStartNestedScroll(view, view2, i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m18821g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
