package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: df */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0127df {
    /* JADX INFO: renamed from: g */
    private static boolean m6042g(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    protected static void m6043q(List list, View view) {
        int size = list.size();
        if (m6042g(list, view, size)) {
            return;
        }
        if (afh.m477h(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m6042g(list, childAt, size) && afh.m477h(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    protected static boolean m6044r(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: s */
    protected static final void m6045s(View view, Rect rect) {
        if (afe.m461e(view)) {
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

    /* JADX INFO: renamed from: a */
    public abstract Object mo1910a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo1911b(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: c */
    public abstract Object mo1912c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract void mo1913d(Object obj, View view);

    /* JADX INFO: renamed from: e */
    public abstract void mo1914e(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: f */
    public abstract void mo1915f(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo1917h(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: i */
    public abstract void mo1918i(Object obj, Rect rect);

    /* JADX INFO: renamed from: j */
    public abstract void mo1919j(Object obj, View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo1920k(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: l */
    public abstract void mo1921l(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo1922m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract Object mo1923n(Object obj, Object obj2);

    /* JADX INFO: renamed from: o */
    public abstract void mo1924o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: p */
    public void mo1925p(Object obj, exz exzVar, Runnable runnable) {
        throw null;
    }
}
