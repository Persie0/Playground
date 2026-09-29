package com.lingq.p055ui.home.challenges;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
import com.lingq.p055ui.home.challenges.ChallengesFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fi.C5537a;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import no.C7828f;
import p003a2.C0009a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p290o6.C7946b;
import p301oh.C8049h;
import p312p2.C8170b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p382s7.C8969b;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import ph.C8273e;
import si.AbstractC9040x;
import si.ViewOnClickListenerC9024h;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengesFragment extends AbstractC9040x {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23048E0 = {C0204c.m857q(ChallengesFragment.class, "getBinding()Lcom/lingq/databinding/FragmentChallengesBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f23049A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f23050B0;

    /* JADX INFO: renamed from: C0 */
    public ChallengesAdapter f23051C0;

    /* JADX INFO: renamed from: D0 */
    public ChallengesAdapter f23052D0;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesFragment$a */
    public static final class C3517a implements InterfaceC7774a<Pair<? extends C5537a, ? extends Boolean>> {
        public C3517a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(Pair<? extends C5537a, ? extends Boolean> pair) {
            Pair<? extends C5537a, ? extends Boolean> pair2 = pair;
            C5207g.m11111f(pair2, "it");
            C5537a c5537a = (C5537a) pair2.f38012a;
            boolean zBooleanValue = ((Boolean) pair2.f38013b).booleanValue();
            ChallengesFragment challengesFragment = ChallengesFragment.this;
            if (!zBooleanValue) {
                C4924a.m10447Z(C8573r0.m16725g0(challengesFragment), C7499b.m14936e(c5537a.f34236b, c5537a.f34242h));
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
            ChallengesViewModel challengesViewModelM9794q0 = challengesFragment.m9794q0();
            C5207g.m11111f(c5537a, "challenge");
            C7828f.m15570d(C8573r0.m16767w0(challengesViewModelM9794q0), challengesViewModelM9794q0.f23099f, null, new ChallengesViewModel$joinChallenge$1(challengesViewModelM9794q0, c5537a, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesFragment$b */
    public static final class C3518b implements InterfaceC7774a<Pair<? extends C5537a, ? extends Boolean>> {
        public C3518b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(Pair<? extends C5537a, ? extends Boolean> pair) {
            Pair<? extends C5537a, ? extends Boolean> pair2 = pair;
            C5207g.m11111f(pair2, "it");
            C5537a c5537a = (C5537a) pair2.f38012a;
            boolean zBooleanValue = ((Boolean) pair2.f38013b).booleanValue();
            ChallengesFragment challengesFragment = ChallengesFragment.this;
            if (!zBooleanValue) {
                C4924a.m10447Z(C8573r0.m16725g0(challengesFragment), C7499b.m14936e(c5537a.f34236b, c5537a.f34242h));
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
            ChallengesViewModel challengesViewModelM9794q0 = challengesFragment.m9794q0();
            C5207g.m11111f(c5537a, "challenge");
            C7828f.m15570d(C8573r0.m16767w0(challengesViewModelM9794q0), challengesViewModelM9794q0.f23099f, null, new ChallengesViewModel$joinChallenge$1(challengesViewModelM9794q0, c5537a, null), 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$1] */
    public ChallengesFragment() {
        super(R.layout.fragment_challenges);
        this.f23049A0 = C4924a.m10477o0(this, ChallengesFragment$binding$2.f23055j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$2
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
        this.f23050B0 = C8573r0.m16711Z(this, C5209i.m11118a(ChallengesViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.challenges.ChallengesFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9791n0(ChallengesFragment challengesFragment, C8273e c8273e) {
        C5207g.m11111f(challengesFragment, "this$0");
        C5207g.m11111f(c8273e, "$this_with");
        challengesFragment.m9794q0().m9797m2();
        C7828f.m15570d(C7499b.m14906H(challengesFragment), null, null, new ChallengesFragment$onViewCreated$4$5$1(c8273e, null), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m9792o0(ChallengesFragment challengesFragment, C8273e c8273e) {
        C5207g.m11111f(challengesFragment, "this$0");
        C5207g.m11111f(c8273e, "$this_with");
        challengesFragment.m9794q0().m9797m2();
        C7828f.m15570d(C7499b.m14906H(challengesFragment), null, null, new ChallengesFragment$onViewCreated$4$2$1(c8273e, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        InterfaceC10060r interfaceC10060r = new InterfaceC10060r() { // from class: si.n
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p471x2.InterfaceC10060r
            /* JADX INFO: renamed from: c */
            public final C10063s0 mo2934c(View view2, C10063s0 c10063s0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
                ChallengesFragment challengesFragment = this.f47270a;
                C5207g.m11111f(challengesFragment, "this$0");
                C5207g.m11111f(view2, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = challengesFragment.m9793p0().f44688g;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                SwipeRefreshLayout swipeRefreshLayout = challengesFragment.m9793p0().f44687f;
                C5207g.m11110e(swipeRefreshLayout, "binding.swipeContainer");
                ViewGroup.LayoutParams layoutParams = swipeRefreshLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c8170bM18864a.f44305d;
                swipeRefreshLayout.setLayoutParams(marginLayoutParams);
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
        m9794q0().f23104k.setValue(Boolean.valueOf(C4924a.m10460g(m3578a0())));
        C8273e c8273eM9793p0 = m9793p0();
        c8273eM9793p0.f44688g.setTitle(m3600t(R.string.lingq_challenges));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8273eM9793p0.f44688g;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC9024h(1, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8273eM9793p0.f44687f;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C8969b(this, 12, c8273eM9793p0));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8273eM9793p0.f44684c;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(5)));
        this.f23051C0 = new ChallengesAdapter(new C3517a());
        this.f23052D0 = new ChallengesAdapter(new C3518b());
        ChallengesAdapter challengesAdapter = this.f23051C0;
        if (challengesAdapter == null) {
            C5207g.m11117l("challengesAdapter");
            throw null;
        }
        recyclerView.setAdapter(challengesAdapter);
        if (C4924a.m10460g(m3578a0())) {
            SwipeRefreshLayout swipeRefreshLayout2 = c8273eM9793p0.f44683b;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setColorSchemeResources(R.color.indigo_lightest, R.color.yellow_dark, R.color.green);
            }
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setOnRefreshListener(new C7946b(this, 10, c8273eM9793p0));
            }
            RecyclerView recyclerView2 = c8273eM9793p0.f44685d;
            if (recyclerView2 != null) {
                m3578a0();
                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
            }
            if (recyclerView2 != null) {
                recyclerView2.m4199g(new C8049h((int) C6716m.m13316a(5)));
            }
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f23052D0);
            }
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3519xd3defc43(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final C8273e m9793p0() {
        return (C8273e) this.f23049A0.m10489a(this, f23048E0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final ChallengesViewModel m9794q0() {
        return (ChallengesViewModel) this.f23050B0.getValue();
    }
}
