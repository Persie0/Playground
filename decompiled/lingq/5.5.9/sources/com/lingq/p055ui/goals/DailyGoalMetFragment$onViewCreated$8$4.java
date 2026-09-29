package com.lingq.p055ui.goals;

import ae.C0062b;
import android.content.Intent;
import android.net.Uri;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$4", m19206f = "DailyGoalMetFragment.kt", m19207l = {241}, m19208m = "invokeSuspend")
public final class DailyGoalMetFragment$onViewCreated$8$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22570e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalMetFragment f22571f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "url", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$4$1", m19206f = "DailyGoalMetFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34511 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22572e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DailyGoalMetFragment f22573f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34511(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super C34511> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22573f = dailyGoalMetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34511 c34511 = new C34511(this.f22573f, interfaceC9968c);
            c34511.f22572e = obj;
            return c34511;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34511) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f22572e;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f22573f.m3595l0(intent);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalMetFragment$onViewCreated$8$4(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super DailyGoalMetFragment$onViewCreated$8$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22571f = dailyGoalMetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalMetFragment$onViewCreated$8$4(this.f22571f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalMetFragment$onViewCreated$8$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22570e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
            DailyGoalMetFragment dailyGoalMetFragment = this.f22571f;
            DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = dailyGoalMetFragment.m9758o0();
            C34511 c34511 = new C34511(dailyGoalMetFragment, null);
            this.f22570e = 1;
            if (C0062b.m369m0(dailyGoalMetViewModelM9758o0.f22595K, c34511, this) == coroutineSingletons) {
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
