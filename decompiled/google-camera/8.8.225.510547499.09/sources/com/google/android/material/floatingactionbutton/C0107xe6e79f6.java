package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import p000.aai;
import p000.aal;
import p000.mid;
import p000.miq;
import p000.miv;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0107xe6e79f6 extends aai {

    /* JADX INFO: renamed from: a */
    private Rect f8145a;

    /* JADX INFO: renamed from: b */
    private final boolean f8146b;

    /* JADX INFO: renamed from: c */
    private final boolean f8147c;

    public C0107xe6e79f6() {
        this.f8146b = false;
        this.f8147c = true;
    }

    public C0107xe6e79f6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, miq.f40635a);
        this.f8146b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f8147c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: u */
    private static boolean m4831u(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aal) {
            return ((aal) layoutParams).f14a instanceof BottomSheetBehavior;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private final boolean m4832v(View view, mid midVar) {
        return (this.f8146b || this.f8147c) && ((aal) midVar.getLayoutParams()).f19f == view.getId();
    }

    /* JADX INFO: renamed from: w */
    private final void m4833w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, mid midVar) {
        if (m4832v(appBarLayout, midVar)) {
            if (this.f8145a == null) {
                this.f8145a = new Rect();
            }
            Rect rect = this.f8145a;
            miv.m16436a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m4743d()) {
                int i = mid.f40578b;
                throw null;
            }
            int i2 = mid.f40578b;
            throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m4834x(View view, mid midVar) {
        if (m4832v(view, midVar)) {
            if (view.getTop() >= (midVar.getHeight() / 2) + ((aal) midVar.getLayoutParams()).topMargin) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: a */
    public final void mo4a(aal aalVar) {
        if (aalVar.f21h == 0) {
            aalVar.f21h = 80;
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        mid midVar = (mid) view;
        List listM1422a = coordinatorLayout.m1422a(midVar);
        int size = listM1422a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listM1422a.get(i2);
            if (view2 instanceof AppBarLayout) {
                m4833w(coordinatorLayout, (AppBarLayout) view2, midVar);
            } else if (m4831u(view2)) {
                m4834x(view2, midVar);
            }
        }
        coordinatorLayout.m1426j(midVar, i);
        return true;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo12i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        mid midVar = (mid) view;
        if (view2 instanceof AppBarLayout) {
            m4833w(coordinatorLayout, (AppBarLayout) view2, midVar);
        } else if (m4831u(view2)) {
            m4834x(view2, midVar);
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ boolean mo21r(View view, Rect rect) {
        return false;
    }
}
