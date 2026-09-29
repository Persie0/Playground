package com.lingq.p055ui.home.challenges;

import ci.InterfaceC2017j;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeMonthlyPromptViewModel$hideNotice$1", m19206f = "ChallengeMonthlyPromptViewModel.kt", m19207l = {30}, m19208m = "invokeSuspend")
final class ChallengeMonthlyPromptViewModel$hideNotice$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22985e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeMonthlyPromptViewModel f22986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeMonthlyPromptViewModel$hideNotice$1(ChallengeMonthlyPromptViewModel challengeMonthlyPromptViewModel, InterfaceC9968c<? super ChallengeMonthlyPromptViewModel$hideNotice$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22986f = challengeMonthlyPromptViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeMonthlyPromptViewModel$hideNotice$1(this.f22986f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeMonthlyPromptViewModel$hideNotice$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22985e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengeMonthlyPromptViewModel challengeMonthlyPromptViewModel = this.f22986f;
            InterfaceC2017j interfaceC2017j = challengeMonthlyPromptViewModel.f22981d;
            String strMo498E1 = challengeMonthlyPromptViewModel.mo498E1();
            List<Integer> listM17251q = C9000b.m17251q(new Integer(challengeMonthlyPromptViewModel.f22984g.f47275a.f22072a));
            this.f22985e = 1;
            if (interfaceC2017j.mo6087b(strMo498E1, listM17251q, this) == coroutineSingletons) {
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
