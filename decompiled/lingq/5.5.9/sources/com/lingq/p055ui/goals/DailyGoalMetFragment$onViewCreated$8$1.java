package com.lingq.p055ui.goals;

import ae.C0062b;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8315l;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1", m19206f = "DailyGoalMetFragment.kt", m19207l = {124}, m19208m = "invokeSuspend")
public final class DailyGoalMetFragment$onViewCreated$8$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22543e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalMetFragment f22544f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/util/DailyGoalMet;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1", m19206f = "DailyGoalMetFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34481 extends SuspendLambda implements InterfaceC2056p<DailyGoalMet, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22545e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DailyGoalMetFragment f22546f;

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22547a;

            public a(DailyGoalMetFragment dailyGoalMetFragment) {
                this.f22547a = dailyGoalMetFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22547a.m9758o0().m9760m2();
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22548a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22549b;

            public b(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22548a = dailyGoalMetFragment;
                this.f22549b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22548a.m9758o0().m9762o2(this.f22549b);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22550a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22551b;

            public c(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22550a = dailyGoalMetFragment;
                this.f22551b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22550a.m9758o0().m9761n2(this.f22551b);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$1$1$d */
        public static final class d implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22552a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22553b;

            public d(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22552a = dailyGoalMetFragment;
                this.f22553b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22552a.m9758o0().m9759l2(this.f22553b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34481(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super C34481> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22546f = dailyGoalMetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34481 c34481 = new C34481(this.f22546f, interfaceC9968c);
            c34481.f22545e = obj;
            return c34481;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(DailyGoalMet dailyGoalMet, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34481) mo1336a(dailyGoalMet, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String strM613i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            DailyGoalMet dailyGoalMet = (DailyGoalMet) this.f22545e;
            boolean z10 = dailyGoalMet.f22152g > 0;
            Bundle bundle = new Bundle();
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
            DailyGoalMetFragment dailyGoalMetFragment = this.f22546f;
            bundle.putString("Streak Language", dailyGoalMetFragment.m9758o0().mo498E1());
            C7796d c7796d = dailyGoalMetFragment.f22530D0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(bundle, "Daily Streak Goal Hit");
            C8315l c8315lM9757n0 = dailyGoalMetFragment.m9757n0();
            boolean z11 = dailyGoalMet.f22150e;
            if (z10) {
                TextView textView = c8315lM9757n0.f44987i;
                String strM3600t = dailyGoalMetFragment.m3600t(R.string.streak_milestone);
                C5207g.m11110e(strM3600t, "getString(R.string.streak_milestone)");
                String str = String.format(strM3600t, Arrays.copyOf(new Object[]{new Integer(dailyGoalMet.f22152g)}, 1));
                C5207g.m11110e(str, "format(format, *args)");
                textView.setText(str);
                ImageView imageView = c8315lM9757n0.f44984f;
                C5207g.m11110e(imageView, "ivMilestone");
                C4924a.m10457e0(imageView);
                List<Integer> list = C6716m.f37937a;
                int identifier = imageView.getContext().getResources().getIdentifier(C0166e.m761g("ic_streak_milestone_", dailyGoalMet.f22152g), "drawable", imageView.getContext().getPackageName());
                if (identifier != 0) {
                    imageView.setImageResource(identifier);
                } else {
                    ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6258n(Integer.valueOf(R.drawable.ic_none)).m12716c().m6245E(imageView);
                }
            } else {
                if (z11) {
                    c8315lM9757n0.f44987i.setText(dailyGoalMetFragment.m3600t(R.string.daily_goal_met_doubled));
                }
                StreakActivityLevelView streakActivityLevelView = c8315lM9757n0.f44990l;
                C5207g.m11110e(streakActivityLevelView, "viewStreakActivityLevel");
                C4924a.m10457e0(streakActivityLevelView);
                StreakActivityLevelView streakActivityLevelView2 = c8315lM9757n0.f44990l;
                C5207g.m11110e(streakActivityLevelView2, "viewStreakActivityLevel");
                int i10 = StreakActivityLevelView.f16812e;
                streakActivityLevelView2.m9375a(dailyGoalMet.f22147b, dailyGoalMet.f22148c, dailyGoalMet.f22149d, true);
            }
            if (z10) {
                strM613i = c8315lM9757n0.f44987i.getText().toString();
            } else if (z11) {
                Locale locale = Locale.getDefault();
                String strM3600t2 = dailyGoalMetFragment.m3600t(R.string.daily_goal_met_share_double);
                C5207g.m11110e(strM3600t2, "getString(R.string.daily_goal_met_share_double)");
                strM613i = C0141b.m613i(new Object[]{C4924a.m10439R(dailyGoalMetFragment.m3578a0(), dailyGoalMetFragment.m9758o0().mo498E1())}, 1, locale, strM3600t2, "format(locale, format, *args)");
            } else {
                Locale locale2 = Locale.getDefault();
                String strM3600t3 = dailyGoalMetFragment.m3600t(R.string.daily_goal_met_share);
                C5207g.m11110e(strM3600t3, "getString(R.string.daily_goal_met_share)");
                strM613i = C0141b.m613i(new Object[]{C4924a.m10439R(dailyGoalMetFragment.m3578a0(), dailyGoalMetFragment.m9758o0().mo498E1())}, 1, locale2, strM3600t3, "format(locale, format, *args)");
            }
            DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = dailyGoalMetFragment.m9758o0();
            C7828f.m15570d(C8573r0.m16767w0(dailyGoalMetViewModelM9758o0), dailyGoalMetViewModelM9758o0.f22605e, null, new DailyGoalMetViewModel$meetMilestone$1(dailyGoalMetViewModelM9758o0, null), 2);
            c8315lM9757n0.f44982d.setOnClickListener(new a(dailyGoalMetFragment));
            c8315lM9757n0.f44986h.setOnClickListener(new b(dailyGoalMetFragment, strM613i));
            c8315lM9757n0.f44983e.setOnClickListener(new c(dailyGoalMetFragment, strM613i));
            c8315lM9757n0.f44981c.setOnClickListener(new d(dailyGoalMetFragment, strM613i));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalMetFragment$onViewCreated$8$1(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super DailyGoalMetFragment$onViewCreated$8$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22544f = dailyGoalMetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalMetFragment$onViewCreated$8$1(this.f22544f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalMetFragment$onViewCreated$8$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22543e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
            DailyGoalMetFragment dailyGoalMetFragment = this.f22544f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(dailyGoalMetFragment.m9758o0().f22612l);
            C34481 c34481 = new C34481(dailyGoalMetFragment, null);
            this.f22543e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c34481, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
