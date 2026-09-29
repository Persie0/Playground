package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareViewModel$observableChallengeDetail$1", m19206f = "ChallengeShareViewModel.kt", m19207l = {58}, m19208m = "invokeSuspend")
final class ChallengeShareViewModel$observableChallengeDetail$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23038e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeShareViewModel f23039f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeShareViewModel$observableChallengeDetail$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "detail", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareViewModel$observableChallengeDetail$1$1", m19206f = "ChallengeShareViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35111 extends SuspendLambda implements InterfaceC2056p<ChallengeDetail, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23040e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeShareViewModel f23041f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35111(ChallengeShareViewModel challengeShareViewModel, InterfaceC9968c<? super C35111> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23041f = challengeShareViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35111 c35111 = new C35111(this.f23041f, interfaceC9968c);
            c35111.f23040e = obj;
            return c35111;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ChallengeDetail challengeDetail, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35111) mo1336a(challengeDetail, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ChallengeDetail challengeDetail = (ChallengeDetail) this.f23040e;
            if (challengeDetail != null) {
                this.f23041f.f23027J.setValue(challengeDetail);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareViewModel$observableChallengeDetail$1(ChallengeShareViewModel challengeShareViewModel, InterfaceC9968c<? super ChallengeShareViewModel$observableChallengeDetail$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23039f = challengeShareViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeShareViewModel$observableChallengeDetail$1(this.f23039f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeShareViewModel$observableChallengeDetail$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23038e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengeShareViewModel challengeShareViewModel = this.f23039f;
            InterfaceC7116c<ChallengeDetail> interfaceC7116cMo5981h = challengeShareViewModel.f23029d.mo5981h(challengeShareViewModel.mo498E1(), challengeShareViewModel.f23031f.f47261a);
            C35111 c35111 = new C35111(challengeShareViewModel, null);
            this.f23038e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5981h, c35111, this) == coroutineSingletons) {
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
