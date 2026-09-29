package com.lingq.p055ui.home.challenges;

import android.os.Bundle;
import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import ni.C7796d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$updateJoin$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {403, 404, 415}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$updateJoin$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ChallengeDetailsViewModel f22977e;

    /* JADX INFO: renamed from: f */
    public ChallengeDetail f22978f;

    /* JADX INFO: renamed from: g */
    public int f22979g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ChallengeDetailsViewModel f22980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$updateJoin$1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super ChallengeDetailsViewModel$updateJoin$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22980h = challengeDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsViewModel$updateJoin$1(this.f22980h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsViewModel$updateJoin$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ChallengeDetailsViewModel challengeDetailsViewModel;
        String key;
        ChallengeDetail challengeDetail;
        InterfaceC2009b interfaceC2009b;
        String strMo498E1;
        String str;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f22979g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            challengeDetailsViewModel = this.f22980h;
            ChallengeDetail challengeDetail2 = (ChallengeDetail) challengeDetailsViewModel.f22897N.getValue();
            if (challengeDetail2 != null) {
                boolean z10 = challengeDetail2.f21643k;
                C7796d c7796d = challengeDetailsViewModel.f22907f;
                String str2 = challengeDetail2.f21635c;
                if (z10) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Challenge", str2);
                    c7796d.m15505b(bundle, "challenge_left");
                    ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = challengeDetailsViewModel.f22908g.mo9619h();
                    this.f22977e = challengeDetailsViewModel;
                    this.f22979g = 1;
                    obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2009b = challengeDetailsViewModel.f22905d;
                    strMo498E1 = challengeDetailsViewModel.mo498E1();
                    str = challengeDetailsViewModel.f22912k.f47250a;
                    i10 = ((Profile) obj).f17781a;
                    this.f22977e = null;
                    this.f22979g = 2;
                    if (interfaceC2009b.mo5983j(i10, strMo498E1, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("Challenge", str2);
                    c7796d.m15505b(bundle2, "challenge_signup");
                    InterfaceC2009b interfaceC2009b2 = challengeDetailsViewModel.f22905d;
                    String strMo498E2 = challengeDetailsViewModel.mo498E1();
                    String str3 = challengeDetailsViewModel.f22912k.f47250a;
                    String str4 = challengeDetail2.f21639g;
                    LeaderboardMetric leaderboardMetric = (LeaderboardMetric) challengeDetailsViewModel.f22896M.getValue();
                    if (leaderboardMetric == null || (key = leaderboardMetric.getKey()) == null) {
                        key = "";
                    }
                    this.f22977e = challengeDetailsViewModel;
                    this.f22978f = challengeDetail2;
                    this.f22979g = 3;
                    if (interfaceC2009b2.mo5978e(strMo498E2, str3, str4, key, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    challengeDetail = challengeDetail2;
                    if (challengeDetailsViewModel.mo502f0()) {
                        challengeDetailsViewModel.f22913l.mo14371k(new Pair(challengeDetail.f21634b, challengeDetail.f21635c));
                    } else {
                        challengeDetailsViewModel.mo9771A(UpgradeReason.CHALLENGES);
                    }
                }
            }
        } else if (i11 == 1) {
            challengeDetailsViewModel = this.f22977e;
            C7499b.m14977z0(obj);
            interfaceC2009b = challengeDetailsViewModel.f22905d;
            strMo498E1 = challengeDetailsViewModel.mo498E1();
            str = challengeDetailsViewModel.f22912k.f47250a;
            i10 = ((Profile) obj).f17781a;
            this.f22977e = null;
            this.f22979g = 2;
            if (interfaceC2009b.mo5983j(i10, strMo498E1, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i11 == 2) {
            C7499b.m14977z0(obj);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            challengeDetail = this.f22978f;
            challengeDetailsViewModel = this.f22977e;
            C7499b.m14977z0(obj);
            if (challengeDetailsViewModel.mo502f0()) {
                challengeDetailsViewModel.f22913l.mo14371k(new Pair(challengeDetail.f21634b, challengeDetail.f21635c));
            } else {
                challengeDetailsViewModel.mo9771A(UpgradeReason.CHALLENGES);
            }
        }
        return C9072e.f47360a;
    }
}
