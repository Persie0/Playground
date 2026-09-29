package com.lingq.p055ui.goals;

import androidx.fragment.app.C0980t0;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$4", m19206f = "DailyGoalCoinsTutorialFragment.kt", m19207l = {64}, m19208m = "invokeSuspend")
public final class DailyGoalCoinsTutorialFragment$onViewCreated$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22501e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalCoinsTutorialFragment f22502f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$4$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalCoinsTutorialFragment$onViewCreated$4$1", m19206f = "DailyGoalCoinsTutorialFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34381 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DailyGoalCoinsTutorialFragment f22503e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34381(DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment, InterfaceC9968c<? super C34381> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22503e = dailyGoalCoinsTutorialFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C34381(this.f22503e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34381) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
            this.f22503e.m9756o0().mo9731b0(false);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalCoinsTutorialFragment$onViewCreated$4(DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment, InterfaceC9968c<? super DailyGoalCoinsTutorialFragment$onViewCreated$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22502f = dailyGoalCoinsTutorialFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalCoinsTutorialFragment$onViewCreated$4(this.f22502f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalCoinsTutorialFragment$onViewCreated$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22501e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = this.f22502f;
            C0980t0 c0980t0M3601v = dailyGoalCoinsTutorialFragment.m3601v();
            Lifecycle.State state = Lifecycle.State.CREATED;
            C34381 c34381 = new C34381(dailyGoalCoinsTutorialFragment, null);
            this.f22501e = 1;
            if (RepeatOnLifecycleKt.m3905a(c0980t0M3601v, state, c34381, this) == coroutineSingletons) {
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
