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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$networkActiveChallenges$1", m19206f = "ChallengesViewModel.kt", m19207l = {199}, m19208m = "invokeSuspend")
final class ChallengesViewModel$networkActiveChallenges$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23125e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesViewModel f23126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$networkActiveChallenges$1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super ChallengesViewModel$networkActiveChallenges$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23126f = challengesViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesViewModel$networkActiveChallenges$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesViewModel$networkActiveChallenges$1(this.f23126f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23125e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = this.f23126f;
                InterfaceC2009b interfaceC2009b = challengesViewModel.f23097d;
                String strMo498E1 = challengesViewModel.mo498E1();
                this.f23125e = 1;
                if (interfaceC2009b.mo5975b(strMo498E1, this) == coroutineSingletons) {
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
