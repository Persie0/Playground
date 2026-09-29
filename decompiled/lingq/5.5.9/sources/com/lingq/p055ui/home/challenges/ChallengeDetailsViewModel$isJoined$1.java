package com.lingq.p055ui.home.challenges;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "detail", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$isJoined$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {67}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$isJoined$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, ChallengeDetail, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22943e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f22944f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ChallengeDetail f22945g;

    public ChallengeDetailsViewModel$isJoined$1(InterfaceC9968c<? super ChallengeDetailsViewModel$isJoined$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, ChallengeDetail challengeDetail, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        ChallengeDetailsViewModel$isJoined$1 challengeDetailsViewModel$isJoined$1 = new ChallengeDetailsViewModel$isJoined$1(interfaceC9968c);
        challengeDetailsViewModel$isJoined$1.f22944f = interfaceC7117d;
        challengeDetailsViewModel$isJoined$1.f22945g = challengeDetail;
        return challengeDetailsViewModel$isJoined$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22943e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f22944f;
            ChallengeDetail challengeDetail = this.f22945g;
            if ((challengeDetail == null || challengeDetail.f21641i) ? false : true) {
                Boolean boolValueOf = Boolean.valueOf(challengeDetail.f21643k);
                this.f22944f = null;
                this.f22943e = 1;
                if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
