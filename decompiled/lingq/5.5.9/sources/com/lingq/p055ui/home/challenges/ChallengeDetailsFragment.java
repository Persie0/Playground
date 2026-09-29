package com.lingq.p055ui.home.challenges;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.challenges.ChallengeDetailsFragment;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p068d9.C5097k;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p312p2.C8170b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import ph.C8279f;
import si.AbstractC9038v;
import si.C9021e;
import si.ViewOnClickListenerC9019c;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeDetailsFragment extends AbstractC9038v {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22857E0 = {C0204c.m857q(ChallengeDetailsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentChallengesDetailsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f22858A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f22859B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f22860C0;

    /* JADX INFO: renamed from: D0 */
    public ChallengeDetailAdapter f22861D0;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsFragment$a */
    public static final class C3485a implements ChallengeDetailAdapter.InterfaceC3483c {
        public C3485a() {
        }

        @Override // com.lingq.p055ui.home.challenges.ChallengeDetailAdapter.InterfaceC3483c
        /* JADX INFO: renamed from: a */
        public final void mo9781a(LeaderboardMetric leaderboardMetric) {
            String str;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
            ChallengeDetailsViewModel challengeDetailsViewModelM9785q0 = ChallengeDetailsFragment.this.m9785q0();
            StateFlowImpl stateFlowImpl = challengeDetailsViewModelM9785q0.f22896M;
            if (leaderboardMetric != stateFlowImpl.getValue()) {
                stateFlowImpl.setValue(leaderboardMetric);
                ChallengeDetail challengeDetail = (ChallengeDetail) challengeDetailsViewModelM9785q0.f22897N.getValue();
                if (challengeDetail == null || (str = challengeDetail.f21639g) == null) {
                    str = "";
                }
                challengeDetailsViewModelM9785q0.m9788n2(leaderboardMetric, str);
                challengeDetailsViewModelM9785q0.m9789o2(leaderboardMetric);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$1] */
    public ChallengeDetailsFragment() {
        super(R.layout.fragment_challenges_details);
        this.f22858A0 = C4924a.m10477o0(this, ChallengeDetailsFragment$binding$2.f22863j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$2
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
        this.f22859B0 = C8573r0.m16711Z(this, C5209i.m11118a(ChallengeDetailsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$4
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$viewModels$default$5
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
        this.f22860C0 = new C1681f(C5209i.m11118a(C9021e.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.challenges.ChallengeDetailsFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

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
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9782n0(ChallengeDetailsFragment challengeDetailsFragment) {
        C5207g.m11111f(challengeDetailsFragment, "this$0");
        ChallengeDetailsViewModel challengeDetailsViewModelM9785q0 = challengeDetailsFragment.m9785q0();
        C7828f.m15570d(C8573r0.m16767w0(challengeDetailsViewModelM9785q0), challengeDetailsViewModelM9785q0.f22909h, null, new ChallengeDetailsViewModel$updateJoin$1(challengeDetailsViewModelM9785q0, null), 2);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m9783o0(ChallengeDetailsFragment challengeDetailsFragment, C8279f c8279f) {
        C5207g.m11111f(challengeDetailsFragment, "this$0");
        C5207g.m11111f(c8279f, "$this_with");
        challengeDetailsFragment.m9785q0().m9787m2();
        C7828f.m15570d(C7499b.m14906H(challengeDetailsFragment), null, null, new ChallengeDetailsFragment$onViewCreated$4$2$1(c8279f, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        InterfaceC10060r interfaceC10060r = new InterfaceC10060r() { // from class: si.b
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p471x2.InterfaceC10060r
            /* JADX INFO: renamed from: c */
            public final C10063s0 mo2934c(View view2, C10063s0 c10063s0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
                ChallengeDetailsFragment challengeDetailsFragment = this.f47246a;
                C5207g.m11111f(challengeDetailsFragment, "this$0");
                C5207g.m11111f(view2, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = challengeDetailsFragment.m9784p0().f44751d;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                boolean z10 = ((C9021e) challengeDetailsFragment.f22860C0.getValue()).f47251b;
                int i10 = c8170bM18864a.f44305d;
                if (z10) {
                    SwipeRefreshLayout swipeRefreshLayout = challengeDetailsFragment.m9784p0().f44750c;
                    C5207g.m11110e(swipeRefreshLayout, "binding.swipeContainer");
                    swipeRefreshLayout.setPadding(swipeRefreshLayout.getPaddingLeft(), swipeRefreshLayout.getPaddingTop(), swipeRefreshLayout.getPaddingRight(), i10);
                }
                Button button = challengeDetailsFragment.m9784p0().f44748a;
                C5207g.m11110e(button, "binding.btnJoinOrLeave");
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i10;
                button.setLayoutParams(marginLayoutParams);
                return C10063s0.f51076b;
            }
        };
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, interfaceC10060r);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 400L;
        m3591j0(c8228i2);
        C8279f c8279fM9784p0 = m9784p0();
        c8279fM9784p0.f44751d.setTitle(m3600t(R.string.lingq_challenges));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8279fM9784p0.f44751d;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC9019c(0, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8279fM9784p0.f44750c;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C5097k(this, 8, c8279fM9784p0));
        boolean z10 = ((C9021e) this.f22860C0.getValue()).f47251b;
        Button button = c8279fM9784p0.f44748a;
        if (z10) {
            C5207g.m11110e(button, "btnJoinOrLeave");
            C4924a.m10442U(button);
        } else {
            button.setOnClickListener(new ViewOnClickListenerC7718c(7, this));
        }
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8279fM9784p0.f44749b;
        recyclerView.setLayoutManager(linearLayoutManager);
        ChallengeDetailAdapter challengeDetailAdapter = new ChallengeDetailAdapter(new C3485a());
        this.f22861D0 = challengeDetailAdapter;
        recyclerView.setAdapter(challengeDetailAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3486xf6036572(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final C8279f m9784p0() {
        return (C8279f) this.f22858A0.m10489a(this, f22857E0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final ChallengeDetailsViewModel m9785q0() {
        return (ChallengeDetailsViewModel) this.f22859B0.getValue();
    }
}
