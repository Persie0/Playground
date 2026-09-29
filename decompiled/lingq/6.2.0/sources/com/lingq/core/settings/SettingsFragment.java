package com.lingq.core.settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.ht6;
import p000.l19;
import p000.nk3;
import p000.ob1;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public boolean f22651A0;

    /* JADX INFO: renamed from: B0 */
    public ob1 f22652B0;

    /* JADX INFO: renamed from: C0 */
    public w41 f22653C0;

    /* JADX INFO: renamed from: w0 */
    public eta f22654w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f22655x0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f22656y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f22657z0;

    public SettingsFragment() {
        super(R$layout.fragment_settings);
        this.f22655x0 = false;
        this.f22657z0 = new Object();
        this.f22651A0 = false;
        final SettingsFragment$special$$inlined$viewModels$default$1 settingsFragment$special$$inlined$viewModels$default$1 = new SettingsFragment$special$$inlined$viewModels$default$1(this);
        AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.settings.SettingsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) settingsFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        y38.m24933a(C1873e.class);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1376149778, true, new ht6(this, 25)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23640l0(this);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f22656y0 == null) {
            synchronized (this.f22657z0) {
                try {
                    if (this.f22656y0 == null) {
                        this.f22656y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f22656y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8583c0() {
        if (this.f22654w0 == null) {
            this.f22654w0 = new eta(super.mo2107i(), this);
            this.f22655x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8584d0() {
        if (this.f22651A0) {
            return;
        }
        this.f22651A0 = true;
        fy1 fy1Var = (fy1) ((l19) mo6995b());
        this.f22652B0 = (ob1) fy1Var.f39919b.f48696h.get();
        this.f22653C0 = fy1Var.m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f22655x0) {
            return null;
        }
        m8583c0();
        return this.f22654w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f22654w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8583c0();
        m8584d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8583c0();
        m8584d0();
    }
}
