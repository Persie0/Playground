package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import fi.C5537a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$observePastChallenges$1", m19206f = "ChallengesViewModel.kt", m19207l = {183}, m19208m = "invokeSuspend")
final class ChallengesViewModel$observePastChallenges$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23134e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesViewModel f23135f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$observePastChallenges$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/a;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$observePastChallenges$1$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35331 extends SuspendLambda implements InterfaceC2056p<List<? extends C5537a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23136e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengesViewModel f23137f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35331(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super C35331> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23137f = challengesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35331 c35331 = new C35331(this.f23137f, interfaceC9968c);
            c35331.f23136e = obj;
            return c35331;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C5537a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35331) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23136e;
            ChallengesViewModel challengesViewModel = this.f23137f;
            challengesViewModel.f23102i.setValue(Boolean.valueOf(list.isEmpty()));
            challengesViewModel.f23093I.setValue(list);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$observePastChallenges$1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super ChallengesViewModel$observePastChallenges$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23135f = challengesViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesViewModel$observePastChallenges$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesViewModel$observePastChallenges$1(this.f23135f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23134e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengesViewModel challengesViewModel = this.f23135f;
            InterfaceC7116c<List<C5537a>> interfaceC7116cMo5984k = challengesViewModel.f23097d.mo5984k(challengesViewModel.mo498E1());
            C35331 c35331 = new C35331(challengesViewModel, null);
            this.f23134e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5984k, c35331, this) == coroutineSingletons) {
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
