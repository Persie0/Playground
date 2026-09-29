package com.lingq.feature.karaoke;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.domain.model.language.AppUsageType;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.dh4;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fa4;
import p000.fh4;
import p000.fy1;
import p000.gh4;
import p000.gr3;
import p000.hm5;
import p000.nk3;
import p000.or1;
import p000.sq5;
import p000.thb;
import p000.ui3;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wz2;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class KaraokeFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public boolean f26192A0;

    /* JADX INFO: renamed from: B0 */
    public final w41 f26193B0;

    /* JADX INFO: renamed from: C0 */
    public final sq5 f26194C0;

    /* JADX INFO: renamed from: D0 */
    public hm5 f26195D0;

    /* JADX INFO: renamed from: w0 */
    public eta f26196w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f26197x0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f26198y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f26199z0;

    public KaraokeFragment() {
        super(R$layout.fragment_karaoke);
        this.f26197x0 = false;
        this.f26199z0 = new Object();
        this.f26192A0 = false;
        final KaraokeFragment$special$$inlined$viewModels$default$1 karaokeFragment$special$$inlined$viewModels$default$1 = new KaraokeFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.karaoke.KaraokeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) karaokeFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26193B0 = new w41(y38.m24933a(C2118c.class), new ui3() { // from class: com.lingq.feature.karaoke.KaraokeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.karaoke.KaraokeFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26207b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.karaoke.KaraokeFragment$special$$inlined$viewModels$default$4
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
        this.f26194C0 = new sq5(3, y38.m24933a(fh4.class), new uq0(this, 5));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1318983642, true, new wz2(this, 5)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        this.f5688b0 = true;
        w41 w41Var = this.f26193B0;
        C2118c c2118c = (C2118c) w41Var.getValue();
        if (c2118c.f26299m.f39105b) {
            c2118c.f26295i.mo50y(LqAnalyticsValues$LessonExitPath.QuitLesson);
        }
        ((C2118c) w41Var.getValue()).mo9034v0(AppUsageType.Listening);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23641m0(this);
        hm5 hm5Var = this.f26195D0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("audio play location", ((fh4) this.f26194C0.getValue()).f39105b ? "reader" : "playlist");
        ((C1240a) hm5Var).m7025f("Karaoke mode opened", bundle);
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new KaraokeFragment$onViewCreated$2(this, null), 3).mo4540r(new dh4(this, 0));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26198y0 == null) {
            synchronized (this.f26199z0) {
                try {
                    if (this.f26198y0 == null) {
                        this.f26198y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26198y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9019c0() {
        if (this.f26196w0 == null) {
            this.f26196w0 = new eta(super.mo2107i(), this);
            this.f26197x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9020d0() {
        if (this.f26192A0) {
            return;
        }
        this.f26192A0 = true;
        this.f26195D0 = (hm5) ((fy1) ((gh4) mo6995b())).f39919b.f48736r.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f26197x0) {
            return null;
        }
        m9019c0();
        return this.f26196w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f26196w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9019c0();
        m9020d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9019c0();
        m9020d0();
    }
}
