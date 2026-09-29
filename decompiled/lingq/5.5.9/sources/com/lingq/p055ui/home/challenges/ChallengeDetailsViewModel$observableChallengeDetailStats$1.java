package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import fi.C5538b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {287}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$observableChallengeDetailStats$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22962e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsViewModel f22963f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/b;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetailStats$1$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35001 extends SuspendLambda implements InterfaceC2056p<List<? extends C5538b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22964e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeDetailsViewModel f22965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35001(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super C35001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22965f = challengeDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35001 c35001 = new C35001(this.f22965f, interfaceC9968c);
            c35001.f22964e = obj;
            return c35001;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C5538b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35001) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f22965f.f22899P.setValue(C6752c.m13421O((List) this.f22964e));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableChallengeDetailStats$1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super ChallengeDetailsViewModel$observableChallengeDetailStats$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22963f = challengeDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$observableChallengeDetailStats$1(this.f22963f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$observableChallengeDetailStats$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22962e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22963f;
            InterfaceC7116c<List<C5538b>> interfaceC7116cMo5980g = challengeDetailsViewModel.f22905d.mo5980g(challengeDetailsViewModel.mo498E1(), challengeDetailsViewModel.f22912k.f47250a);
            C35001 c35001 = new C35001(challengeDetailsViewModel, null);
            this.f22962e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5980g, c35001, this) == coroutineSingletons) {
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
