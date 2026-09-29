package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.widget.Button;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$2", m19206f = "ChallengeDetailsFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class ChallengeDetailsFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22876e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsFragment f22877f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "isJoined", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$2$1", m19206f = "ChallengeDetailsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34881 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22878e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeDetailsFragment f22879f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34881(ChallengeDetailsFragment challengeDetailsFragment, InterfaceC9968c<? super C34881> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22879f = challengeDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34881 c34881 = new C34881(this.f22879f, interfaceC9968c);
            c34881.f22878e = obj;
            return c34881;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34881) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f22878e;
            if (bool != null) {
                bool.booleanValue();
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
                ChallengeDetailsFragment challengeDetailsFragment = this.f22879f;
                Button button = challengeDetailsFragment.m9784p0().f44748a;
                C5207g.m11110e(button, "binding.btnJoinOrLeave");
                C4924a.m10457e0(button);
                if (bool.booleanValue()) {
                    challengeDetailsFragment.m9784p0().f44748a.setText(challengeDetailsFragment.m3600t(R.string.challenges_leave_challenge));
                } else {
                    challengeDetailsFragment.m9784p0().f44748a.setText(challengeDetailsFragment.m3600t(R.string.challenges_join));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsFragment$onViewCreated$5$2(ChallengeDetailsFragment challengeDetailsFragment, InterfaceC9968c<? super ChallengeDetailsFragment$onViewCreated$5$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22877f = challengeDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsFragment$onViewCreated$5$2(this.f22877f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22876e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
            ChallengeDetailsFragment challengeDetailsFragment = this.f22877f;
            ChallengeDetailsViewModel challengeDetailsViewModelM9785q0 = challengeDetailsFragment.m9785q0();
            C34881 c34881 = new C34881(challengeDetailsFragment, null);
            this.f22876e = 1;
            if (C0062b.m369m0(challengeDetailsViewModelM9785q0.f22898O, c34881, this) == coroutineSingletons) {
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
