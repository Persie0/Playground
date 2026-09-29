package com.lingq.p055ui.home.language.stats;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.language.stats.LanguageStatsFragment;
import com.lingq.p055ui.home.library.RepairStreakFragment;
import com.lingq.player.PlayerController;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.LanguageProgressUpdate;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import dm.C5212l;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p278nh.C7777d;
import p278nh.InterfaceC7792s;
import p290o6.C7946b;
import p312p2.C8170b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9370m;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p487xi.AbstractC10194b;
import p487xi.C10201i;
import p487xi.C10208p;
import ph.C8268d0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/language/stats/LanguageStatsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageStatsFragment extends AbstractC10194b {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24239F0 = {C0204c.m857q(LanguageStatsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLanguageStatsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f24240A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f24241B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f24242C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC5182d f24243D0;

    /* JADX INFO: renamed from: E0 */
    public PlayerController f24244E0;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$a */
    public static final class C3706a implements InterfaceC7792s {
        public C3706a() {
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: a */
        public final void mo9909a(LanguageProgressSort languageProgressSort) {
            C5207g.m11111f(languageProgressSort, "newFilter");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = LanguageStatsFragment.this.m9908p0();
            String key = languageProgressSort.getKey();
            C5207g.m11111f(key, "newInterval");
            C7828f.m15570d(C8573r0.m16767w0(languageStatsViewModelM9908p0), null, null, new LanguageStatsViewModel$setLessonFilter$1(languageStatsViewModelM9908p0, key, null), 3);
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: b */
        public final void mo9910b(ChallengeDetail challengeDetail, boolean z10) {
            C5207g.m11111f(challengeDetail, "challengeDetail");
            LanguageStatsFragment languageStatsFragment = LanguageStatsFragment.this;
            if (!z10) {
                C4924a.m10447Z(C8573r0.m16725g0(languageStatsFragment), C7499b.m14936e(challengeDetail.f21634b, challengeDetail.f21641i));
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = languageStatsFragment.m9908p0();
            C7828f.m15570d(C8573r0.m16767w0(languageStatsViewModelM9908p0), languageStatsViewModelM9908p0.f24306h, null, new LanguageStatsViewModel$joinChallenge$1(languageStatsViewModelM9908p0, challengeDetail, null), 2);
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: c */
        public final void mo9911c(boolean z10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            StateFlowImpl stateFlowImpl = LanguageStatsFragment.this.m9908p0().f24298V;
            if (((Boolean) stateFlowImpl.getValue()).booleanValue() != z10) {
                stateFlowImpl.setValue(Boolean.valueOf(z10));
            }
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: d */
        public final void mo9912d(String str, int i10) {
            C5207g.m11111f(str, "stat");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: e */
        public final void mo9913e(LanguageProgressMetric languageProgressMetric, LanguageProgressPeriod languageProgressPeriod) {
            C5207g.m11111f(languageProgressMetric, "newMetric");
            C5207g.m11111f(languageProgressPeriod, "newPeriod");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = LanguageStatsFragment.this.m9908p0();
            StateFlowImpl stateFlowImpl = languageStatsViewModelM9908p0.f24299W;
            Object value = stateFlowImpl.getValue();
            StateFlowImpl stateFlowImpl2 = languageStatsViewModelM9908p0.f24300X;
            if (languageProgressMetric == value && languageProgressPeriod == stateFlowImpl2.getValue()) {
                return;
            }
            stateFlowImpl.setValue(languageProgressMetric);
            stateFlowImpl2.setValue(languageProgressPeriod);
            languageStatsViewModelM9908p0.m9917l2();
            languageStatsViewModelM9908p0.m9920o2();
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: f */
        public final void mo9914f(int i10, int i11, int i12, int i13) {
            RepairStreakFragment repairStreakFragment = new RepairStreakFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("streak", i10);
            bundle.putInt("previousDayLingqs", i11);
            bundle.putInt("goal", i12);
            bundle.putInt("activityLevel", i13);
            repairStreakFragment.m3583e0(bundle);
            repairStreakFragment.mo3772s0(LanguageStatsFragment.this.m3594l(), "repairStreakFragment");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: g */
        public final void mo9915g(String str, int i10, double d10) {
            String strM3600t;
            C5207g.m11111f(str, "stat");
            boolean zM11106a = C5207g.m11106a(str, LanguageProgressUpdate.HoursListening.getKey());
            LanguageStatsFragment languageStatsFragment = LanguageStatsFragment.this;
            if (zM11106a) {
                strM3600t = languageStatsFragment.m3600t(R.string.stats_add_listening);
            } else if (C5207g.m11106a(str, LanguageProgressUpdate.WordsReading.getKey())) {
                strM3600t = languageStatsFragment.m3600t(R.string.stats_add_reading);
            } else if (C5207g.m11106a(str, LanguageProgressUpdate.WordsWriting.getKey())) {
                strM3600t = languageStatsFragment.m3600t(R.string.stats_add_writing);
            } else {
                strM3600t = C5207g.m11106a(str, LanguageProgressUpdate.HoursSpeaking.getKey()) ? languageStatsFragment.m3600t(R.string.stats_add_speaking) : "";
            }
            String str2 = strM3600t;
            C5207g.m11110e(str2, "when (stat) {\n          …e -> \"\"\n                }");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            String str3 = (String) languageStatsFragment.m9908p0().f24309k.getValue();
            C5207g.m11111f(str3, "interval");
            C4924a.m10447Z(C8573r0.m16725g0(languageStatsFragment), new C10208p(str2, str, i10, str3, (float) d10));
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: h */
        public final void mo9916h() {
            C4924a.m10447Z(C8573r0.m16725g0(LanguageStatsFragment.this), C5212l.m11171o());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$1] */
    public LanguageStatsFragment() {
        super(R.layout.fragment_language_stats);
        this.f24240A0 = C4924a.m10477o0(this, LanguageStatsFragment$binding$2.f24246j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$2
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
        this.f24241B0 = C8573r0.m16711Z(this, C5209i.m11118a(LanguageStatsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$viewModels$default$5
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
        this.f24242C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9906n0(LanguageStatsFragment languageStatsFragment, C8268d0 c8268d0) {
        C5207g.m11111f(languageStatsFragment, "this$0");
        C5207g.m11111f(c8268d0, "$this_with");
        languageStatsFragment.m9908p0().m9918m2();
        C7828f.m15570d(C7499b.m14906H(languageStatsFragment), null, null, new LanguageStatsFragment$onViewCreated$4$3$1(c8268d0, null), 3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        InterfaceC10060r interfaceC10060r = new InterfaceC10060r() { // from class: xi.n
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p471x2.InterfaceC10060r
            /* JADX INFO: renamed from: c */
            public final C10063s0 mo2934c(View view2, C10063s0 c10063s0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
                LanguageStatsFragment languageStatsFragment = this.f51617a;
                C5207g.m11111f(languageStatsFragment, "this$0");
                C5207g.m11111f(view2, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = languageStatsFragment.m9907o0().f44663c;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                SwipeRefreshLayout swipeRefreshLayout = languageStatsFragment.m9907o0().f44662b;
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
        m9908p0().f24310l.setValue(Boolean.valueOf(C7777d.m15481b(this)));
        C10201i c10201i = new C10201i(new C3706a(), null);
        C8268d0 c8268d0M9907o0 = m9907o0();
        c8268d0M9907o0.f44663c.setNavigationOnClickListener(new ViewOnClickListenerC2239y(13, this));
        MaterialToolbar materialToolbar = c8268d0M9907o0.f44663c;
        materialToolbar.mo1059k(R.menu.menu_language_stats);
        materialToolbar.setOnMenuItemClickListener(new C9370m(12, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8268d0M9907o0.f44662b;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C7946b(this, 12, c8268d0M9907o0));
        boolean zM15481b = C7777d.m15481b(this);
        RecyclerView recyclerView = c8268d0M9907o0.f44661a;
        if (zM15481b) {
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager());
        } else {
            m3578a0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        }
        recyclerView.setAdapter(c10201i);
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3707x2a82f6fa(this, Lifecycle.State.STARTED, null, this, c10201i), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8268d0 m9907o0() {
        return (C8268d0) this.f24240A0.m10489a(this, f24239F0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final LanguageStatsViewModel m9908p0() {
        return (LanguageStatsViewModel) this.f24241B0.getValue();
    }
}
