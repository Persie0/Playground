package com.lingq.feature.statistics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$StatDetail;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fa4;
import p000.fy1;
import p000.gr3;
import p000.hm5;
import p000.nk3;
import p000.nn4;
import p000.or1;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wz2;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LanguageStatsBadgesFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public final w41 f33149B0;

    /* JADX INFO: renamed from: C0 */
    public hm5 f33150C0;

    /* JADX INFO: renamed from: w0 */
    public eta f33151w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f33153y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f33152x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f33154z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f33148A0 = false;

    public LanguageStatsBadgesFragment() {
        final C2783x33fafce c2783x33fafce = new C2783x33fafce(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsBadgesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2783x33fafce.mo0a();
            }
        });
        this.f33149B0 = new w41(y38.m24933a(C2811b.class), new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsBadgesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsBadgesFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f33159b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsBadgesFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(-1343530255, true, new wz2(this, 7)));
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
        hm5 hm5Var = this.f33150C0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("detail", LqAnalyticsValues$StatDetail.Badges.getValue());
        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f33153y0 == null) {
            synchronized (this.f33154z0) {
                try {
                    if (this.f33153y0 == null) {
                        this.f33153y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33153y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9713c0() {
        if (this.f33151w0 == null) {
            this.f33151w0 = new eta(super.mo2107i(), this);
            this.f33152x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9714d0() {
        if (this.f33148A0) {
            return;
        }
        this.f33148A0 = true;
        this.f33150C0 = (hm5) ((fy1) ((nn4) mo6995b())).f39919b.f48736r.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f33152x0) {
            return null;
        }
        m9713c0();
        return this.f33151w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f33151w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9713c0();
        m9714d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9713c0();
        m9714d0();
    }
}
