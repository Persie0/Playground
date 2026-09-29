package p198jc;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p338qd.C8573r0;
import p471x2.C10029b0;
import p471x2.C10036f;
import p471x2.C10049l0;
import p471x2.C10063s0;

/* JADX INFO: renamed from: jc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6452g extends C6453h<View> {

    /* JADX INFO: renamed from: c */
    public final Rect f37015c;

    /* JADX INFO: renamed from: d */
    public final Rect f37016d;

    /* JADX INFO: renamed from: e */
    public int f37017e;

    /* JADX INFO: renamed from: f */
    public int f37018f;

    public AbstractC6452g() {
        this.f37015c = new Rect();
        this.f37016d = new Rect();
        this.f37017e = 0;
    }

    public AbstractC6452g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37015c = new Rect();
        this.f37016d = new Rect();
        this.f37017e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: i */
    public final boolean mo2943i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout appBarLayoutMo8565v;
        int iMo8567x;
        int measuredHeight;
        int i13;
        C10063s0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (appBarLayoutMo8565v = mo8565v(coordinatorLayout.m2923d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.d.m18665b(appBarLayoutMo8565v) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m18865b() + lastWindowInsets.m18868e();
            }
            iMo8567x = mo8567x(appBarLayoutMo8565v) + size;
            measuredHeight = appBarLayoutMo8565v.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iMo8567x -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m2929r(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iMo8567x, i13));
            return true;
        }
        size = coordinatorLayout.getHeight();
        iMo8567x = mo8567x(appBarLayoutMo8565v) + size;
        measuredHeight = appBarLayoutMo8565v.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo8567x -= measuredHeight;
        }
        if (i14 == -1) {
            i13 = 1073741824;
        } else {
            i13 = Integer.MIN_VALUE;
        }
        coordinatorLayout.m2929r(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iMo8567x, i13));
        return true;
    }

    @Override // p198jc.C6453h
    /* JADX INFO: renamed from: u */
    public final void mo13070u(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutMo8565v = mo8565v(coordinatorLayout.m2923d(view));
        int iM16699T = 0;
        if (appBarLayoutMo8565v == null) {
            coordinatorLayout.m2928q(view, i10);
            this.f37017e = 0;
            return;
        }
        CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin;
        int bottom = appBarLayoutMo8565v.getBottom() + ((ViewGroup.MarginLayoutParams) c0771f).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0771f).rightMargin;
        int bottom2 = ((appBarLayoutMo8565v.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin;
        Rect rect = this.f37015c;
        rect.set(paddingLeft, bottom, width, bottom2);
        C10063s0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.d.m18665b(coordinatorLayout) && !C10029b0.d.m18665b(view)) {
                rect.left = lastWindowInsets.m18866c() + rect.left;
                rect.right -= lastWindowInsets.m18867d();
            }
        }
        Rect rect2 = this.f37016d;
        int i11 = c0771f.f5552c;
        if (i11 == 0) {
            i11 = 8388659;
        }
        C10036f.m18798b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        if (this.f37018f != 0) {
            float fMo8566w = mo8566w(appBarLayoutMo8565v);
            int i12 = this.f37018f;
            iM16699T = C8573r0.m16699T((int) (fMo8566w * i12), 0, i12);
        }
        view.layout(rect2.left, rect2.top - iM16699T, rect2.right, rect2.bottom - iM16699T);
        this.f37017e = rect2.top - appBarLayoutMo8565v.getBottom();
    }

    /* JADX INFO: renamed from: v */
    public abstract AppBarLayout mo8565v(ArrayList arrayList);

    /* JADX INFO: renamed from: w */
    public float mo8566w(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: x */
    public int mo8567x(View view) {
        return view.getMeasuredHeight();
    }
}
