package com.lingq.feature.language;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.nk3;
import p000.sg0;
import p000.thb;
import p000.ui3;
import p000.vm4;
import p000.vz1;
import p000.wz2;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LanguageSelectorFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f26309M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f26311O0;

    /* JADX INFO: renamed from: N0 */
    public boolean f26310N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f26312P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f26313Q0 = false;

    public LanguageSelectorFragment() {
        final LanguageSelectorFragment$special$$inlined$viewModels$default$1 languageSelectorFragment$special$$inlined$viewModels$default$1 = new LanguageSelectorFragment$special$$inlined$viewModels$default$1(this);
        AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.language.LanguageSelectorFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) languageSelectorFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        y38.m24933a(C2120b.class);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1042838352, true, new wz2(this, 6)));
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26311O0 == null) {
            synchronized (this.f26312P0) {
                try {
                    if (this.f26311O0 == null) {
                        this.f26311O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26311O0.mo6995b();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f26310N0) {
            return null;
        }
        m9035l0();
        return this.f26309M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9035l0() {
        if (this.f26309M0 == null) {
            this.f26309M0 = new eta(super.mo2107i(), this);
            this.f26310N0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f26309M0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9035l0();
        if (this.f26313Q0) {
            return;
        }
        this.f26313Q0 = true;
        ((vm4) mo6995b()).getClass();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9035l0();
        if (this.f26313Q0) {
            return;
        }
        this.f26313Q0 = true;
        ((vm4) mo6995b()).getClass();
    }
}
