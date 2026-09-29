package com.lingq.p055ui.goals;

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
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.shared.util.GoalMetType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import dm.C5207g;
import dm.C5209i;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ni.C7794b;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6704a;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p343qi.AbstractC8631c;
import p402u0.C9370m;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8321m;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/goals/DailyGoalCoinsTutorialFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DailyGoalCoinsTutorialFragment extends AbstractC8631c {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22489E0 = {C0204c.m857q(DailyGoalCoinsTutorialFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDailyGoalCoinsTutorialBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f22490A0 = C4924a.m10477o0(this, DailyGoalCoinsTutorialFragment$binding$2.f22494j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f22491B0;

    /* JADX INFO: renamed from: C0 */
    public C7796d f22492C0;

    /* JADX INFO: renamed from: D0 */
    public C6704a f22493D0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$1] */
    public DailyGoalCoinsTutorialFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$2
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
        this.f22491B0 = C8573r0.m16711Z(this, C5209i.m11118a(DailyGoalCoinsTutorialViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$special$$inlined$viewModels$default$5
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        C6704a c6704a = this.f22493D0;
        if (c6704a == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        c6704a.f37891b.edit().putBoolean("coinsTutorialShown_4", true).apply();
        DailyGoalCoinsTutorialViewModel dailyGoalCoinsTutorialViewModelM9756o0 = m9756o0();
        UserMilestone userMilestone = (UserMilestone) dailyGoalCoinsTutorialViewModelM9756o0.f22522k.getValue();
        InterfaceC7367d interfaceC7367d = dailyGoalCoinsTutorialViewModelM9756o0.f22518g;
        if (userMilestone != null) {
            interfaceC7367d.mo9324h2(new C7794b(GoalMetType.Milestone, userMilestone));
        }
        DailyGoalMet dailyGoalMet = (DailyGoalMet) dailyGoalCoinsTutorialViewModelM9756o0.f22520i.getValue();
        if (dailyGoalMet != null) {
            interfaceC7367d.mo9324h2(new C7794b(GoalMetType.DailyGoal, dailyGoalMet));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9370m c9370m = new C9370m(11, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9370m);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, true);
        c8228i2.f48293c = 200L;
        m3587g0(c8228i2);
        C7828f.m15570d(C7499b.m14906H(this), null, null, new DailyGoalCoinsTutorialFragment$onViewCreated$4(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$5
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
                this.f22504b.m9756o0().mo9731b0(true);
                return C9072e.f47360a;
            }
        });
        C8321m c8321mM9755n0 = m9755n0();
        c8321mM9755n0.f45019a.setOnClickListener(new ViewOnClickListenerC5062d0(4, this));
        c8321mM9755n0.f45020b.setOnClickListener(new ViewOnClickListenerC2238x(5, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3437xf6582ee7(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8321m m9755n0() {
        return (C8321m) this.f22490A0.m10489a(this, f22489E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final DailyGoalCoinsTutorialViewModel m9756o0() {
        return (DailyGoalCoinsTutorialViewModel) this.f22491B0.getValue();
    }
}
