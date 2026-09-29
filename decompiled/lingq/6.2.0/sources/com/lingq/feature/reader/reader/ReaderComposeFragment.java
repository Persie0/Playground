package com.lingq.feature.reader.reader;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.android.material.R$attr;
import com.lingq.core.p012ui.R$transition;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.daa;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.gr3;
import p000.gu7;
import p000.haa;
import p000.iu7;
import p000.mu7;
import p000.nk3;
import p000.or1;
import p000.qz2;
import p000.r46;
import p000.sq5;
import p000.thb;
import p000.ui3;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.x74;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderComposeFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public w41 f29939B0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f29941D0;

    /* JADX INFO: renamed from: w0 */
    public eta f29942w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f29944y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f29943x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f29945z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f29938A0 = false;

    /* JADX INFO: renamed from: C0 */
    public final sq5 f29940C0 = new sq5(3, y38.m24933a(iu7.class), new uq0(this, 13));

    public ReaderComposeFragment() {
        final ReaderComposeFragment$special$$inlined$viewModels$default$1 readerComposeFragment$special$$inlined$viewModels$default$1 = new ReaderComposeFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.reader.reader.ReaderComposeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) readerComposeFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f29941D0 = new w41(y38.m24933a(C2493a.class), new ui3() { // from class: com.lingq.feature.reader.reader.ReaderComposeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.reader.ReaderComposeFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29950b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.reader.ReaderComposeFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(1454895204, true, new gu7(this, 1)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f29944y0 == null) {
            synchronized (this.f29945z0) {
                try {
                    if (this.f29944y0 == null) {
                        this.f29944y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f29944y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9388c0() {
        if (this.f29942w0 == null) {
            this.f29942w0 = new eta(super.mo2107i(), this);
            this.f29943x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f29943x0) {
            return null;
        }
        m9388c0();
        return this.f29942w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f29942w0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9388c0();
        if (this.f29938A0) {
            return;
        }
        this.f29938A0 = true;
        this.f29939B0 = ((fy1) ((mu7) mo6995b())).m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9388c0();
        if (this.f29938A0) {
            return;
        }
        this.f29938A0 = true;
        this.f29939B0 = ((fy1) ((mu7) mo6995b())).m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        x74.m24339F(this, "lessonEdit", new gu7(this, 0));
        if (((iu7) this.f29940C0.getValue()).f44588e) {
            haa haaVar = new haa(m2090R());
            daa daaVarM13157c = haaVar.m13157c(R$transition.slide_up);
            daa daaVar = null;
            if (daaVarM13157c != null) {
                daaVarM13157c.mo10196Q(r46.m20365H(m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1)));
                daaVarM13157c.mo10194O(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 300));
            } else {
                daaVarM13157c = null;
            }
            m2096X(daaVarM13157c);
            daa daaVarM13157c2 = haaVar.m13157c(R$transition.slide_up);
            if (daaVarM13157c2 != null) {
                daaVarM13157c2.mo10196Q(r46.m20365H(m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1)));
                daaVarM13157c2.mo10194O(r46.m20364G(m2090R(), R$attr.motionDurationMedium2, 250));
                daaVar = daaVarM13157c2;
            }
            m2098Z(daaVar);
        }
    }
}
