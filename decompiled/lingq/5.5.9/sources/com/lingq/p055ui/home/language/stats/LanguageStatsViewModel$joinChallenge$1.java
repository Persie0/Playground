package com.lingq.p055ui.home.language.stats;

import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.challenges.ChallengeType;
import com.lingq.p055ui.home.challenges.LeaderboardMetric;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$joinChallenge$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {719}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$joinChallenge$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24357e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24358f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ChallengeDetail f24359g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$joinChallenge$1(LanguageStatsViewModel languageStatsViewModel, ChallengeDetail challengeDetail, InterfaceC9968c<? super LanguageStatsViewModel$joinChallenge$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24358f = languageStatsViewModel;
        this.f24359g = challengeDetail;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$joinChallenge$1(this.f24358f, this.f24359g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$joinChallenge$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String key;
        LeaderboardMetric defaultFilter;
        ChallengeType[] enumConstants;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24357e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24358f;
            InterfaceC2009b interfaceC2009b = languageStatsViewModel.f24303e;
            String strMo498E1 = languageStatsViewModel.mo498E1();
            ChallengeDetail challengeDetail = this.f24359g;
            String str = challengeDetail.f21634b;
            String str2 = challengeDetail.f21639g;
            ChallengeType.Companion companion = ChallengeType.INSTANCE;
            ChallengeType challengeType = null;
            Class cls = ChallengeType.class.isEnum() ? ChallengeType.class : null;
            if (cls != null && (enumConstants = cls.getEnumConstants()) != null) {
                for (ChallengeType challengeType2 : enumConstants) {
                    if (C5207g.m11106a(challengeType2.getValue(), str2)) {
                        challengeType = challengeType2;
                        break;
                    }
                }
            }
            if (challengeType == null || (defaultFilter = challengeType.getDefaultFilter()) == null || (key = defaultFilter.getKey()) == null) {
                key = "";
            }
            this.f24357e = 1;
            if (interfaceC2009b.mo5978e(strMo498E1, str, str2, key, this) == coroutineSingletons) {
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
