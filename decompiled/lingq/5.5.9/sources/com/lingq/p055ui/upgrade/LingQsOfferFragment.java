package com.lingq.p055ui.upgrade;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import dm.C5207g;
import dm.C5209i;
import fk.ViewOnClickListenerC5566h;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p205jk.AbstractC6506b;
import p260m8.C7499b;
import p322pd.C8227h;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8264c2;
import sj.ViewOnClickListenerC9058q;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/upgrade/LingQsOfferFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LingQsOfferFragment extends AbstractC6506b {

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31936C0 = {C0204c.m857q(LingQsOfferFragment.class, "getBinding()Lcom/lingq/databinding/FragmentUpgradeLingqsOfferBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f31937A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f31938B0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$1] */
    public LingQsOfferFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f31937A0 = C8573r0.m16711Z(this, C5209i.m11118a(LingQsOfferViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.upgrade.LingQsOfferFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f31938B0 = C4924a.m10477o0(this, LingQsOfferFragment$binding$2.f31939j);
    }

    /* JADX INFO: renamed from: n0 */
    public static final LingQsOfferViewModel m10404n0(LingQsOfferFragment lingQsOfferFragment) {
        return (LingQsOfferViewModel) lingQsOfferFragment.f31937A0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 1, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(1, false);
        c8228i.f48293c = 300L;
        m3589h0(c8228i);
        C8227h c8227h = new C8227h();
        c8227h.f48293c = 180L;
        m3587g0(c8227h);
        C8264c2 c8264c2M10405o0 = m10405o0();
        c8264c2M10405o0.f44643d.setOnClickListener(new ViewOnClickListenerC5566h(2, this));
        c8264c2M10405o0.f44640a.setOnClickListener(new ViewOnClickListenerC9058q(6, this));
        c8264c2M10405o0.f44644e.m4933b();
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4913xedd82717(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8264c2 m10405o0() {
        return (C8264c2) this.f31938B0.m10489a(this, f31936C0[0]);
    }
}
