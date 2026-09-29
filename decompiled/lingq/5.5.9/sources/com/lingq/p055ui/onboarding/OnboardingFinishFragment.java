package com.lingq.p055ui.onboarding;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.MainViewModel;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import ni.C7796d;
import ni.C7797e;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1676a;
import p040c4.C1681f;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p225kk.C6704a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9369l;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import sj.AbstractC9043b;
import sj.C9052k;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/onboarding/OnboardingFinishFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class OnboardingFinishFragment extends AbstractC9043b {

    /* JADX INFO: renamed from: J0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29364J0 = {C0204c.m857q(OnboardingFinishFragment.class, "getBinding()Lcom/lingq/databinding/FragmentOnboardingFinishBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f29365A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29366B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f29367C0;

    /* JADX INFO: renamed from: D0 */
    public final FragmentViewBindingDelegate f29368D0;

    /* JADX INFO: renamed from: E0 */
    public C7796d f29369E0;

    /* JADX INFO: renamed from: F0 */
    public C6704a f29370F0;

    /* JADX INFO: renamed from: G0 */
    public C7797e f29371G0;

    /* JADX INFO: renamed from: H0 */
    public InterfaceC5180b f29372H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC5179a f29373I0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$1] */
    public OnboardingFinishFragment() {
        super(R.layout.fragment_onboarding_finish);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$2
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
        this.f29365A0 = C8573r0.m16711Z(this, C5209i.m11118a(AuthenticationViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$viewModels$default$5
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
        this.f29366B0 = C8573r0.m16711Z(this, C5209i.m11118a(MainViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
                C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
                return c1046m0Mo796n;
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i = this.m3576Y().mo470i();
                C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f29367C0 = new C1681f(C5209i.m11118a(C9052k.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
        this.f29368D0 = C4924a.m10477o0(this, OnboardingFinishFragment$binding$2.f29374j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0087  */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C0987y.m3825g(this, "upgradeClosed", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.onboarding.OnboardingFinishFragment$onViewCreated$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str, Bundle bundle2) {
                C5207g.m11111f(str, "requestKey");
                C5207g.m11111f(bundle2, "bundle");
                C4924a.m10447Z(C8573r0.m16725g0(this.f29381b), new C1676a(R.id.actionToHome));
                return C9072e.f47360a;
            }
        });
        C9369l c9369l = new C9369l(23, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9369l);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, true);
        c8228i2.f48293c = 300L;
        m3587g0(c8228i2);
        C8228i c8228i3 = new C8228i(0, false);
        c8228i3.f48293c = 300L;
        m3589h0(c8228i3);
        m10235n0().m15505b(null, "onboarding_finished");
        C1681f c1681f = this.f29367C0;
        C9052k c9052k = (C9052k) c1681f.getValue();
        C9052k c9052k2 = (C9052k) c1681f.getValue();
        String str = c9052k.f47336a;
        if (!C7661i.m15250P2(str)) {
            String str2 = c9052k2.f47337b;
            if (true ^ C7661i.m15250P2(str2)) {
                m10237p0().m10330o2(str, str2);
            } else {
                m10237p0().m10331p2();
            }
        } else {
            m10237p0().m10331p2();
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4498x924e44e1(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C7796d m10235n0() {
        C7796d c7796d = this.f29369E0;
        if (c7796d != null) {
            return c7796d;
        }
        C5207g.m11117l("analytics");
        throw null;
    }

    /* JADX INFO: renamed from: o0 */
    public final C6704a m10236o0() {
        C6704a c6704a = this.f29370F0;
        if (c6704a != null) {
            return c6704a;
        }
        C5207g.m11117l("appSettings");
        throw null;
    }

    /* JADX INFO: renamed from: p0 */
    public final AuthenticationViewModel m10237p0() {
        return (AuthenticationViewModel) this.f29365A0.getValue();
    }
}
