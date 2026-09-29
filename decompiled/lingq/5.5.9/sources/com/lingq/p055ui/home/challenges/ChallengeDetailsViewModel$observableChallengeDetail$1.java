package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {254}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$observableChallengeDetail$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22957e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsViewModel f22958f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34981 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super ChallengeDetail>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ChallengeDetailsViewModel f22959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34981(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super C34981> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22959e = challengeDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C34981(this.f22959e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super ChallengeDetail> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34981) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f22959e.f22892I.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "detail", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$2", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34992 extends SuspendLambda implements InterfaceC2056p<ChallengeDetail, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22960e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeDetailsViewModel f22961f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34992(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super C34992> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22961f = challengeDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34992 c34992 = new C34992(this.f22961f, interfaceC9968c);
            c34992.f22960e = obj;
            return c34992;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ChallengeDetail challengeDetail, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34992) mo1336a(challengeDetail, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            ChallengeType challengeType;
            ChallengeType[] enumConstants;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ChallengeDetail challengeDetail = (ChallengeDetail) this.f22960e;
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22961f;
            int i10 = 0;
            challengeDetailsViewModel.f22892I.setValue(Boolean.valueOf(challengeDetail == null));
            if (challengeDetail != null) {
                challengeDetailsViewModel.f22897N.setValue(challengeDetail);
                boolean z10 = challengeDetailsViewModel.f22912k.f47251b;
                String str = challengeDetail.f21639g;
                if (z10 || !challengeDetail.f21643k) {
                    challengeDetailsViewModel.f22900Q.setValue(EmptyList.f38032a);
                    challengeDetailsViewModel.f22893J.setValue(Boolean.FALSE);
                } else {
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(challengeDetailsViewModel);
                    ChallengeDetailsViewModel$observableChallengeStats$1 challengeDetailsViewModel$observableChallengeStats$1 = new ChallengeDetailsViewModel$observableChallengeStats$1(challengeDetailsViewModel, null);
                    CoroutineDispatcher coroutineDispatcher = challengeDetailsViewModel.f22909h;
                    C7828f.m15570d(interfaceC7882zM16767w0, coroutineDispatcher, null, challengeDetailsViewModel$observableChallengeStats$1, 2);
                    C7828f.m15570d(C8573r0.m16767w0(challengeDetailsViewModel), coroutineDispatcher, null, new ChallengeDetailsViewModel$networkGetJoinedChallengeStats$1(challengeDetailsViewModel, str, null), 2);
                }
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22896M;
                if (stateFlowImpl.getValue() == null) {
                    ChallengeType.Companion companion = ChallengeType.INSTANCE;
                    Class cls = ChallengeType.class.isEnum() ? ChallengeType.class : null;
                    if (cls != null && (enumConstants = cls.getEnumConstants()) != null) {
                        int length = enumConstants.length;
                        while (true) {
                            if (i10 >= length) {
                                challengeType = null;
                                break;
                            }
                            challengeType = enumConstants[i10];
                            if (C5207g.m11106a(challengeType.getValue(), str)) {
                                break;
                            }
                            i10++;
                        }
                    } else {
                        challengeType = null;
                        break;
                    }
                    stateFlowImpl.setValue(challengeType != null ? challengeType.getDefaultFilter() : null);
                    LeaderboardMetric leaderboardMetric = (LeaderboardMetric) stateFlowImpl.getValue();
                    if (leaderboardMetric != null && !C5207g.m11106a(str, ChallengeType.ThousandWords.getValue())) {
                        challengeDetailsViewModel.m9789o2(leaderboardMetric);
                        challengeDetailsViewModel.m9788n2(leaderboardMetric, str);
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableChallengeDetail$1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super ChallengeDetailsViewModel$observableChallengeDetail$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22958f = challengeDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$observableChallengeDetail$1(this.f22958f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$observableChallengeDetail$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22957e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22958f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C34981(challengeDetailsViewModel, null), challengeDetailsViewModel.f22905d.mo5981h(challengeDetailsViewModel.mo498E1(), challengeDetailsViewModel.f22912k.f47250a));
            C34992 c34992 = new C34992(challengeDetailsViewModel, null);
            this.f22957e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c34992, this) == coroutineSingletons) {
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
