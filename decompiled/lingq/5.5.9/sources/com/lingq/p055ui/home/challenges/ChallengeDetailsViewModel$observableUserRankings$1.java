package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeUserRanking;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableUserRankings$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {318}, m19208m = "invokeSuspend")
public final class ChallengeDetailsViewModel$observableUserRankings$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22971e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsViewModel f22972f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LeaderboardMetric f22973g;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableUserRankings$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/challenge/ChallengeUserRanking;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableUserRankings$1$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35031 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends ChallengeUserRanking>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ChallengeDetailsViewModel f22974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35031(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super C35031> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22974e = challengeDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C35031(this.f22974e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends ChallengeUserRanking>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35031) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f22974e.f22894K.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableUserRankings$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/challenge/ChallengeUserRanking;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$observableUserRankings$1$2", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35042 extends SuspendLambda implements InterfaceC2056p<List<? extends ChallengeUserRanking>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22975e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeDetailsViewModel f22976f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35042(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super C35042> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22976f = challengeDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35042 c35042 = new C35042(this.f22976f, interfaceC9968c);
            c35042.f22975e = obj;
            return c35042;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends ChallengeUserRanking> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35042) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            boolean zIsEmpty;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f22975e;
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22976f;
            StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22894K;
            StateFlowImpl stateFlowImpl2 = challengeDetailsViewModel.f22897N;
            if (stateFlowImpl2.getValue() != null) {
                Object value = stateFlowImpl2.getValue();
                C5207g.m11108c(value);
                if (((ChallengeDetail) value).f21640h == 0) {
                    zIsEmpty = false;
                } else {
                    zIsEmpty = list.isEmpty();
                }
            } else {
                zIsEmpty = list.isEmpty();
            }
            stateFlowImpl.setValue(Boolean.valueOf(zIsEmpty));
            challengeDetailsViewModel.f22902S.setValue(C6752c.m13421O(list));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableUserRankings$1(ChallengeDetailsViewModel challengeDetailsViewModel, LeaderboardMetric leaderboardMetric, InterfaceC9968c<? super ChallengeDetailsViewModel$observableUserRankings$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f22972f = challengeDetailsViewModel;
        this.f22973g = leaderboardMetric;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$observableUserRankings$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$observableUserRankings$1(this.f22972f, this.f22973g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22971e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22972f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C35031(challengeDetailsViewModel, null), challengeDetailsViewModel.f22905d.mo5974a(challengeDetailsViewModel.mo498E1(), challengeDetailsViewModel.f22912k.f47250a, this.f22973g.getKey()));
            C35042 c35042 = new C35042(challengeDetailsViewModel, null);
            this.f22971e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c35042, this) == coroutineSingletons) {
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
