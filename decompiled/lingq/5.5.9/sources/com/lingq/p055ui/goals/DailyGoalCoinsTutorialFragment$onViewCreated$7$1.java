package com.lingq.p055ui.goals;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8321m;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$7$1", m19206f = "DailyGoalCoinsTutorialFragment.kt", m19207l = {82}, m19208m = "invokeSuspend")
public final class DailyGoalCoinsTutorialFragment$onViewCreated$7$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22505e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalCoinsTutorialFragment f22506f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$7$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/util/DailyGoalMet;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$7$1$1", m19206f = "DailyGoalCoinsTutorialFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34391 extends SuspendLambda implements InterfaceC2056p<DailyGoalMet, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22507e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DailyGoalCoinsTutorialFragment f22508f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34391(DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment, InterfaceC9968c<? super C34391> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22508f = dailyGoalCoinsTutorialFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34391 c34391 = new C34391(this.f22508f, interfaceC9968c);
            c34391.f22507e = obj;
            return c34391;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(DailyGoalMet dailyGoalMet, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34391) mo1336a(dailyGoalMet, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            DailyGoalMet dailyGoalMet = (DailyGoalMet) this.f22507e;
            Bundle bundle = new Bundle();
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
            DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = this.f22508f;
            bundle.putString("Streak Language", dailyGoalCoinsTutorialFragment.m9756o0().mo498E1());
            C7796d c7796d = dailyGoalCoinsTutorialFragment.f22492C0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(bundle, "Daily Streak Goal Hit");
            if (dailyGoalMet != null) {
                C8321m c8321mM9755n0 = dailyGoalCoinsTutorialFragment.m9755n0();
                if (dailyGoalMet.f22150e) {
                    c8321mM9755n0.f45021c.setText(dailyGoalCoinsTutorialFragment.m3600t(R.string.daily_goal_met_doubled));
                }
                StreakActivityLevelView streakActivityLevelView = c8321mM9755n0.f45022d;
                C5207g.m11110e(streakActivityLevelView, "viewStreakActivityLevel");
                C4924a.m10457e0(streakActivityLevelView);
                StreakActivityLevelView streakActivityLevelView2 = c8321mM9755n0.f45022d;
                C5207g.m11110e(streakActivityLevelView2, "viewStreakActivityLevel");
                int i10 = StreakActivityLevelView.f16812e;
                streakActivityLevelView2.m9375a(dailyGoalMet.f22147b, dailyGoalMet.f22148c, dailyGoalMet.f22149d, true);
                DailyGoalCoinsTutorialViewModel dailyGoalCoinsTutorialViewModelM9756o0 = dailyGoalCoinsTutorialFragment.m9756o0();
                C7828f.m15570d(C8573r0.m16767w0(dailyGoalCoinsTutorialViewModelM9756o0), dailyGoalCoinsTutorialViewModelM9756o0.f22516e, null, new DailyGoalCoinsTutorialViewModel$meetMilestone$1(dailyGoalCoinsTutorialViewModelM9756o0, null), 2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalCoinsTutorialFragment$onViewCreated$7$1(DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment, InterfaceC9968c<? super DailyGoalCoinsTutorialFragment$onViewCreated$7$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22506f = dailyGoalCoinsTutorialFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalCoinsTutorialFragment$onViewCreated$7$1(this.f22506f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalCoinsTutorialFragment$onViewCreated$7$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22505e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
            DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = this.f22506f;
            DailyGoalCoinsTutorialViewModel dailyGoalCoinsTutorialViewModelM9756o0 = dailyGoalCoinsTutorialFragment.m9756o0();
            C34391 c34391 = new C34391(dailyGoalCoinsTutorialFragment, null);
            this.f22505e = 1;
            if (C0062b.m369m0(dailyGoalCoinsTutorialViewModelM9756o0.f22521j, c34391, this) == coroutineSingletons) {
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
