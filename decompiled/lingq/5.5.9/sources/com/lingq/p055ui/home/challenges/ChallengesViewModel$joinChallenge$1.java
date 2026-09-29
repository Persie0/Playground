package com.lingq.p055ui.home.challenges;

import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import fi.C5537a;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$joinChallenge$1", m19206f = "ChallengesViewModel.kt", m19207l = {228}, m19208m = "invokeSuspend")
final class ChallengesViewModel$joinChallenge$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23122e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesViewModel f23123f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5537a f23124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$joinChallenge$1(ChallengesViewModel challengesViewModel, C5537a c5537a, InterfaceC9968c<? super ChallengesViewModel$joinChallenge$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23123f = challengesViewModel;
        this.f23124g = c5537a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesViewModel$joinChallenge$1(this.f23123f, this.f23124g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesViewModel$joinChallenge$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LeaderboardMetric defaultFilter;
        String key;
        ChallengeType[] enumConstants;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23122e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengesViewModel challengesViewModel = this.f23123f;
            InterfaceC2009b interfaceC2009b = challengesViewModel.f23097d;
            String strMo498E1 = challengesViewModel.mo498E1();
            C5537a c5537a = this.f23124g;
            String str = c5537a.f34236b;
            String str2 = c5537a.f34245k;
            String str3 = str2 == null ? "" : str2;
            ChallengeType.Companion companion = ChallengeType.INSTANCE;
            if (str2 == null) {
                str2 = "";
            }
            Class<ChallengeType> cls = ChallengeType.class;
            ChallengeType challengeType = null;
            if (!cls.isEnum()) {
                cls = null;
            }
            if (cls != null && (enumConstants = cls.getEnumConstants()) != null) {
                for (ChallengeType challengeType2 : enumConstants) {
                    if (C5207g.m11106a(challengeType2.getValue(), str2)) {
                        challengeType = challengeType2;
                        break;
                    }
                }
            }
            String str4 = (challengeType == null || (defaultFilter = challengeType.getDefaultFilter()) == null || (key = defaultFilter.getKey()) == null) ? "" : key;
            this.f23122e = 1;
            if (interfaceC2009b.mo5978e(strMo498E1, str, str3, str4, this) == coroutineSingletons) {
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
