package com.lingq.p055ui.goals;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.activity.result.InterfaceC0202a;
import androidx.fragment.app.C0964m;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.shared.util.GoalMetType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ni.C7794b;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p035c.C1643c;
import p244lh.InterfaceC7367d;
import p254m2.C7472a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p343qi.AbstractC8632d;
import p427v3.AbstractC9634a;
import ph.C8315l;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/goals/DailyGoalMetFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DailyGoalMetFragment extends AbstractC8632d {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22526E0 = {C0204c.m857q(DailyGoalMetFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDailyGoalBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f22527A0 = C4924a.m10477o0(this, DailyGoalMetFragment$binding$2.f22532j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f22528B0;

    /* JADX INFO: renamed from: C0 */
    public C0964m f22529C0;

    /* JADX INFO: renamed from: D0 */
    public C7796d f22530D0;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$a */
    public static final class C3445a implements InterfaceC0202a<Boolean> {
        public C3445a() {
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(Boolean bool) {
            if (bool.booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                TextView textView = DailyGoalMetFragment.this.m9757n0().f44988j;
                C5207g.m11110e(textView, "binding.tvNotifications");
                C4924a.m10442U(textView);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$1] */
    public DailyGoalMetFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$2
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
        this.f22528B0 = C8573r0.m16711Z(this, C5209i.m11118a(DailyGoalMetViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$special$$inlined$viewModels$default$5
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = m9758o0();
        UserMilestone userMilestone = (UserMilestone) dailyGoalMetViewModelM9758o0.f22592H.getValue();
        InterfaceC7367d interfaceC7367d = dailyGoalMetViewModelM9758o0.f22607g;
        if (userMilestone != null) {
            interfaceC7367d.mo9324h2(new C7794b(GoalMetType.Milestone, userMilestone));
        }
        DailyGoalMet dailyGoalMet = (DailyGoalMet) dailyGoalMetViewModelM9758o0.f22611k.getValue();
        if (dailyGoalMet != null) {
            interfaceC7367d.mo9324h2(new C7794b(dailyGoalMet.f22152g > 0 ? GoalMetType.StreakMilestone : GoalMetType.DailyGoal, dailyGoalMet));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 1, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 100L;
        m3587g0(c8228i);
        this.f22529C0 = m3575X(new C3445a(), new C1643c());
        C7828f.m15570d(C7499b.m14906H(this), null, null, new DailyGoalMetFragment$onViewCreated$4(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$5
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22542b.m9758o0().mo9731b0(true);
                return C9072e.f47360a;
            }
        });
        m9757n0().f44979a.setOnClickListener(new ViewOnClickListenerC2238x(6, this));
        if (Build.VERSION.SDK_INT < 33 || C7472a.m14841a(m3578a0(), "android.permission.POST_NOTIFICATIONS") == 0) {
            TextView textView = m9757n0().f44988j;
            C5207g.m11110e(textView, "binding.tvNotifications");
            C4924a.m10442U(textView);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) m3600t(R.string.notifications_daily_reminder));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) m3600t(R.string.texts_notify_me));
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            m9757n0().f44988j.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            m9757n0().f44988j.setOnClickListener(new ViewOnClickListenerC2239y(8, this));
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3446xaa237143(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8315l m9757n0() {
        return (C8315l) this.f22527A0.m10489a(this, f22526E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final DailyGoalMetViewModel m9758o0() {
        return (DailyGoalMetViewModel) this.f22528B0.getValue();
    }
}
