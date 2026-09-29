package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p389t2.C9185d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.fragment.app.s0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class AbstractC0977s0 {
    /* JADX INFO: renamed from: d */
    public static void m3796d(View view, List list) {
        boolean z10;
        boolean z11;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            } else {
                if (list.get(i10) == view) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            return;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.i.m18717k(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            z11 = false;
                            break;
                        } else {
                            if (list.get(i13) == childAt) {
                                z11 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (!z11 && C10029b0.i.m18717k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3797g(View view, Rect rect) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.g.m18698b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3798h(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3780a(View view, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo3781b(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo3782c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3783e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo3784f(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract Object mo3785i(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: j */
    public abstract Object mo3786j(Object obj, Object obj2);

    /* JADX INFO: renamed from: k */
    public abstract void mo3787k(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: l */
    public abstract void mo3788l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: m */
    public abstract void mo3789m(View view, Object obj);

    /* JADX INFO: renamed from: n */
    public abstract void mo3790n(Object obj, Rect rect);

    /* JADX INFO: renamed from: o */
    public void mo3791o(Object obj, C9185d c9185d, RunnableC0960k runnableC0960k) {
        runnableC0960k.run();
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo3792p(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: q */
    public abstract void mo3793q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: r */
    public abstract Object mo3794r(Object obj);
}
