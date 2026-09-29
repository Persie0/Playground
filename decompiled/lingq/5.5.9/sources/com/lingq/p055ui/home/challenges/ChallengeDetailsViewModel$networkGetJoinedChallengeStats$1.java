package com.lingq.p055ui.home.challenges;

import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {362}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22954e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsViewModel f22955f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1(ChallengeDetailsViewModel challengeDetailsViewModel, String str, InterfaceC9968c<? super ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22955f = challengeDetailsViewModel;
        this.f22956g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1(this.f22955f, this.f22956g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ChallengeDetailsViewModel challengeDetailsViewModel = this.f22955f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22954e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2009b interfaceC2009b = challengeDetailsViewModel.f22905d;
                String strMo498E1 = challengeDetailsViewModel.mo498E1();
                String str = challengeDetailsViewModel.f22912k.f47250a;
                String str2 = this.f22956g;
                this.f22954e = 1;
                if (interfaceC2009b.mo5979f(strMo498E1, str, str2, this) == coroutineSingletons) {
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
        return C9072e.f47360a;
    }
}
