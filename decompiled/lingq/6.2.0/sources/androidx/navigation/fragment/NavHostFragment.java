package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.FragmentContainerView;
import kotlin.AbstractC3192a;
import p000.C3386nv;
import p000.C3757xf;
import p000.cs4;
import p000.g70;
import p000.ud6;
import p000.xwc;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC0635c {

    /* JADX INFO: renamed from: w0 */
    public final cs4 f6540w0 = AbstractC3192a.m15356a(new C3757xf(this, 24));

    /* JADX INFO: renamed from: x0 */
    public View f6541x0;

    /* JADX INFO: renamed from: y0 */
    public int f6542y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f6543z0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.f5678T;
        if (i == 0 || i == -1) {
            i = R$id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: C */
    public final void mo2076C() {
        this.f5688b0 = true;
        View view = this.f6541x0;
        if (view != null && xwc.m24782t(view) == m2573c0()) {
            view.setTag(androidx.navigation.R$id.nav_controller_view_tag, null);
        }
        this.f6541x0 = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: F */
    public final void mo2079F(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        super.mo2079F(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R$styleable.NavHost);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R$styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f6542y0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NavHostFragment);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(R$styleable.NavHostFragment_defaultNavHost, false)) {
            this.f6543z0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        if (this.f6543z0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            C3386nv.m17634u("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(androidx.navigation.R$id.nav_controller_view_tag, m2573c0());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.f6541x0 = view2;
            if (view2.getId() == this.f5678T) {
                View view3 = this.f6541x0;
                view3.getClass();
                view3.setTag(androidx.navigation.R$id.nav_controller_view_tag, m2573c0());
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final ud6 m2573c0() {
        return (ud6) this.f6540w0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        context.getClass();
        super.mo2123y(context);
        if (this.f6543z0) {
            g70 g70Var = new g70(m2109k());
            g70Var.m12402l(this);
            g70Var.m12396f();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        m2573c0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f6543z0 = true;
            g70 g70Var = new g70(m2109k());
            g70Var.m12402l(this);
            g70Var.m12396f();
        }
        super.mo2124z(bundle);
    }
}
