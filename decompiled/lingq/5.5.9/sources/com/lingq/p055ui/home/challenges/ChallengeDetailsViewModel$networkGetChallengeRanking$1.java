package com.lingq.p055ui.home.challenges;

import ci.InterfaceC2009b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$networkGetChallengeRanking$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {383}, m19208m = "invokeSuspend")
public final class ChallengeDetailsViewModel$networkGetChallengeRanking$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22950e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsViewModel f22951f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22952g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LeaderboardMetric f22953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$networkGetChallengeRanking$1(ChallengeDetailsViewModel challengeDetailsViewModel, String str, LeaderboardMetric leaderboardMetric, InterfaceC9968c<? super ChallengeDetailsViewModel$networkGetChallengeRanking$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f22951f = challengeDetailsViewModel;
        this.f22952g = str;
        this.f22953h = leaderboardMetric;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$networkGetChallengeRanking$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$networkGetChallengeRanking$1(this.f22951f, this.f22952g, this.f22953h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22950e;
        ChallengeDetailsViewModel challengeDetailsViewModel = this.f22951f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2009b interfaceC2009b = challengeDetailsViewModel.f22905d;
                String strMo498E1 = challengeDetailsViewModel.mo498E1();
                String str = this.f22952g;
                String str2 = challengeDetailsViewModel.f22912k.f47250a;
                String key = this.f22953h.getKey();
                this.f22950e = 1;
                if (interfaceC2009b.mo5985l(strMo498E1, str, str2, key, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        challengeDetailsViewModel.f22894K.setValue(Boolean.FALSE);
        return C9072e.f47360a;
    }
}
