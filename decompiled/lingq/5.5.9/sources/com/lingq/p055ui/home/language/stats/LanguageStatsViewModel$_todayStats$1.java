package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$o;", "Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "", "streak", "Lcom/lingq/shared/uimodel/language/UserLanguageProgress;", "userLanguage", "Lcom/lingq/shared/domain/Profile;", "<anonymous parameter 2>", "isToday", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$_todayStats$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {165}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$_todayStats$1 extends SuspendLambda implements InterfaceC2060t<InterfaceC7117d<? super AbstractC7791r.o>, Pair<? extends UserLanguageStudyStats, ? extends Boolean>, UserLanguageProgress, Profile, Boolean, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24333e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24334f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Pair f24335g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ UserLanguageProgress f24336h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ boolean f24337i;

    public LanguageStatsViewModel$_todayStats$1(InterfaceC9968c<? super LanguageStatsViewModel$_todayStats$1> interfaceC9968c) {
        super(6, interfaceC9968c);
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(InterfaceC7117d<? super AbstractC7791r.o> interfaceC7117d, Pair<? extends UserLanguageStudyStats, ? extends Boolean> pair, UserLanguageProgress userLanguageProgress, Profile profile, Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        LanguageStatsViewModel$_todayStats$1 languageStatsViewModel$_todayStats$1 = new LanguageStatsViewModel$_todayStats$1(interfaceC9968c);
        languageStatsViewModel$_todayStats$1.f24334f = interfaceC7117d;
        languageStatsViewModel$_todayStats$1.f24335g = pair;
        languageStatsViewModel$_todayStats$1.f24336h = userLanguageProgress;
        languageStatsViewModel$_todayStats$1.f24337i = zBooleanValue;
        return languageStatsViewModel$_todayStats$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        AbstractC7791r.o oVar;
        int i10;
        int i11;
        int i12;
        int i13;
        UserLanguageStudyStats userLanguageStudyStats;
        int i14;
        List<UserStudyStatsScore> list;
        UserStudyStatsScore userStudyStatsScore;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = this.f24333e;
        if (i15 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24334f;
            Pair pair = this.f24335g;
            UserLanguageProgress userLanguageProgress = this.f24336h;
            boolean z10 = this.f24337i;
            int i16 = userLanguageProgress != null ? userLanguageProgress.f21766o : 0;
            int i17 = userLanguageProgress != null ? userLanguageProgress.f21764m : 0;
            int i18 = userLanguageProgress != null ? (int) userLanguageProgress.f21757f : 0;
            double d10 = userLanguageProgress != null ? userLanguageProgress.f21768q : 0.0d;
            if (z10) {
                UserLanguageStudyStats userLanguageStudyStats2 = (UserLanguageStudyStats) pair.f38012a;
                if (userLanguageStudyStats2 == null || (list = userLanguageStudyStats2.f21791f) == null || (userStudyStatsScore = (UserStudyStatsScore) C6752c.m13433a0(list)) == null) {
                    i11 = 0;
                } else {
                    i10 = userStudyStatsScore.f21800c;
                    i11 = i10;
                }
            } else {
                UserLanguageStudyStats userLanguageStudyStats3 = (UserLanguageStudyStats) pair.f38012a;
                if (userLanguageStudyStats3 != null) {
                    i10 = userLanguageStudyStats3.f21789d;
                    i11 = i10;
                } else {
                    i11 = 0;
                }
            }
            if (z10) {
                UserLanguageStudyStats userLanguageStudyStats4 = (UserLanguageStudyStats) pair.f38012a;
                if (userLanguageStudyStats4 != null) {
                    i12 = userLanguageStudyStats4.f21787b;
                } else {
                    i13 = 0;
                }
                userLanguageStudyStats = (UserLanguageStudyStats) pair.f38012a;
                if (userLanguageStudyStats != null) {
                    i14 = userLanguageStudyStats.f21792g;
                } else {
                    i14 = 0;
                }
                oVar = new AbstractC7791r.o(d10, i16, i17, i18, i11, i13, i14);
                this.f24334f = null;
                this.f24335g = null;
                this.f24333e = 1;
                if (interfaceC7117d.mo1339r(oVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i12 = -1;
            }
            i13 = i12;
            userLanguageStudyStats = (UserLanguageStudyStats) pair.f38012a;
            if (userLanguageStudyStats != null) {
                i14 = userLanguageStudyStats.f21792g;
            } else {
                i14 = 0;
            }
            oVar = new AbstractC7791r.o(d10, i16, i17, i18, i11, i13, i14);
            this.f24334f = null;
            this.f24335g = null;
            this.f24333e = 1;
            if (interfaceC7117d.mo1339r(oVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
