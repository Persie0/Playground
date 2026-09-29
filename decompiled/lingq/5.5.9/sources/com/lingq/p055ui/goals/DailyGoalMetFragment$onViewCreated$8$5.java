package com.lingq.p055ui.goals;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$5", m19206f = "DailyGoalMetFragment.kt", m19207l = {249}, m19208m = "invokeSuspend")
public final class DailyGoalMetFragment$onViewCreated$8$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22574e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalMetFragment f22575f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$5$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$5$1", m19206f = "DailyGoalMetFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34521 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22576e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DailyGoalMetFragment f22577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34521(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super C34521> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22577f = dailyGoalMetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34521 c34521 = new C34521(this.f22577f, interfaceC9968c);
            c34521.f22576e = obj;
            return c34521;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34521) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f22576e;
            String str = (String) pair.f38012a;
            String str2 = (String) pair.f38013b;
            InstagramShareFragment instagramShareFragment = new InstagramShareFragment();
            Bundle bundle = new Bundle();
            bundle.putString("imageUrl", str2);
            bundle.putString("title", str);
            instagramShareFragment.m3583e0(bundle);
            instagramShareFragment.mo3772s0(this.f22577f.m3594l(), "instagramShareFragment");
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalMetFragment$onViewCreated$8$5(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super DailyGoalMetFragment$onViewCreated$8$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22575f = dailyGoalMetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalMetFragment$onViewCreated$8$5(this.f22575f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalMetFragment$onViewCreated$8$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22574e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
            DailyGoalMetFragment dailyGoalMetFragment = this.f22575f;
            DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = dailyGoalMetFragment.m9758o0();
            C34521 c34521 = new C34521(dailyGoalMetFragment, null);
            this.f22574e = 1;
            if (C0062b.m369m0(dailyGoalMetViewModelM9758o0.f22599O, c34521, this) == coroutineSingletons) {
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
