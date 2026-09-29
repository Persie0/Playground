package com.lingq.feature.imports;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.imports.data.UserImportSourceType;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.C3244l;
import p000.C3159jt;
import p000.b34;
import p000.cs4;
import p000.d32;
import p000.dl9;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.gr3;
import p000.id6;
import p000.jd6;
import p000.jfa;
import p000.kd6;
import p000.n02;
import p000.nk3;
import p000.or1;
import p000.thb;
import p000.ui3;
import p000.vla;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wla;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class UserImportTypeFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public boolean f26070A0;

    /* JADX INFO: renamed from: B0 */
    public final w41 f26071B0;

    /* JADX INFO: renamed from: w0 */
    public eta f26072w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f26073x0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f26074y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f26075z0;

    public UserImportTypeFragment() {
        super(R$layout.fragment_user_import_type);
        this.f26073x0 = false;
        this.f26075z0 = new Object();
        this.f26070A0 = false;
        final UserImportTypeFragment$special$$inlined$viewModels$default$1 userImportTypeFragment$special$$inlined$viewModels$default$1 = new UserImportTypeFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.imports.UserImportTypeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) userImportTypeFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26071B0 = new w41(y38.m24933a(wla.class), new ui3() { // from class: com.lingq.feature.imports.UserImportTypeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.imports.UserImportTypeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26091b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.imports.UserImportTypeFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(255312352, true, new dl9(this, 11)));
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
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2097xfcdfedfd(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26074y0 == null) {
            synchronized (this.f26075z0) {
                try {
                    if (this.f26074y0 == null) {
                        this.f26074y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26074y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9000c0(n02 n02Var, UserImportSourceType userImportSourceType) {
        Object value;
        vz1.m23640l0(this);
        id6 id6VarM14401a = jd6.m14401a(kd6.Companion, userImportSourceType, n02Var.f52107b, n02Var.f52106a, n02Var.f52108c, 16);
        C3244l c3244l = ((wla) this.f26071B0.getValue()).f67023d;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        jfa.m14428k(b34.m3244j(this), id6VarM14401a, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9001d0() {
        if (this.f26072w0 == null) {
            this.f26072w0 = new eta(super.mo2107i(), this);
            this.f26073x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f26073x0) {
            return null;
        }
        m9001d0();
        return this.f26072w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f26072w0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9001d0();
        if (this.f26070A0) {
            return;
        }
        this.f26070A0 = true;
        ((vla) mo6995b()).getClass();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9001d0();
        if (this.f26070A0) {
            return;
        }
        this.f26070A0 = true;
        ((vla) mo6995b()).getClass();
    }
}
