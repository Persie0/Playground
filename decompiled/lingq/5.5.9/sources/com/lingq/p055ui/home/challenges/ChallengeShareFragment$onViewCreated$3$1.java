package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.widget.ImageView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8267d;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$1", m19206f = "ChallengeShareFragment.kt", m19207l = {83}, m19208m = "invokeSuspend")
public final class ChallengeShareFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22998e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeShareFragment f22999f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "detail", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$1$1", m19206f = "ChallengeShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35061 extends SuspendLambda implements InterfaceC2056p<ChallengeDetail, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23000e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeShareFragment f23001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35061(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super C35061> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23001f = challengeShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35061 c35061 = new C35061(this.f23001f, interfaceC9968c);
            c35061.f23000e = obj;
            return c35061;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ChallengeDetail challengeDetail, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35061) mo1336a(challengeDetail, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ChallengeDetail challengeDetail = (ChallengeDetail) this.f23000e;
            if (challengeDetail != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
                ChallengeShareFragment challengeShareFragment = this.f23001f;
                challengeShareFragment.getClass();
                ImageView imageView = ((C8267d) challengeShareFragment.f22988Q0.m10489a(challengeShareFragment, ChallengeShareFragment.f22987T0[0])).f44655a;
                C5207g.m11110e(imageView, "binding.ivBadge");
                C4924a.m10438Q(imageView, challengeDetail.f21642j, 0.0f, 0, 0, 14);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareFragment$onViewCreated$3$1(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super ChallengeShareFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22999f = challengeShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeShareFragment$onViewCreated$3$1(this.f22999f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeShareFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22998e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
            ChallengeShareFragment challengeShareFragment = this.f22999f;
            ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
            C35061 c35061 = new C35061(challengeShareFragment, null);
            this.f22998e = 1;
            if (C0062b.m369m0(challengeShareViewModelM9790u0.f23028K, c35061, this) == coroutineSingletons) {
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
