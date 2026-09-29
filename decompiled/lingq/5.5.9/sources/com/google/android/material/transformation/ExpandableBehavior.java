package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p456wc.InterfaceC9899a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0768c<View> {

    /* JADX INFO: renamed from: a */
    public int f15860a;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC3103a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f15861a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15862b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9899a f15863c;

        public ViewTreeObserverOnPreDrawListenerC3103a(View view, int i10, InterfaceC9899a interfaceC9899a) {
            this.f15861a = view;
            this.f15862b = i10;
            this.f15863c = interfaceC9899a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f15861a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f15860a == this.f15862b) {
                InterfaceC9899a interfaceC9899a = this.f15863c;
                expandableBehavior.mo8933s((View) interfaceC9899a, view, interfaceC9899a.mo8760a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f15860a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15860a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: b */
    public abstract boolean mo2936b(View view, View view2);

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: d */
    public final boolean mo2938d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        InterfaceC9899a interfaceC9899a = (InterfaceC9899a) view2;
        if (interfaceC9899a.mo8760a()) {
            int i10 = this.f15860a;
            if (i10 == 0 || i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f15860a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        this.f15860a = interfaceC9899a.mo8760a() ? 1 : 2;
        mo8933s((View) interfaceC9899a, view, interfaceC9899a.mo8760a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public final boolean mo2942h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC9899a interfaceC9899a;
        int i11;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.g.m18699c(view)) {
            ArrayList arrayListM2923d = coordinatorLayout.m2923d(view);
            int size = arrayListM2923d.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    interfaceC9899a = null;
                    break;
                }
                View view2 = (View) arrayListM2923d.get(i12);
                if (mo2936b(view, view2)) {
                    interfaceC9899a = (InterfaceC9899a) view2;
                    break;
                }
                i12++;
            }
            if (interfaceC9899a != null) {
                if (!interfaceC9899a.mo8760a() ? this.f15860a != 1 : !((i11 = this.f15860a) == 0 || i11 == 2)) {
                    int i13 = interfaceC9899a.mo8760a() ? 1 : 2;
                    this.f15860a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3103a(view, i13, interfaceC9899a));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo8933s(View view, View view2, boolean z10, boolean z11);
}
