package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4;
import com.lingq.shared.uimodel.language.UserActivityLevel;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import com.lingq.util.C4924a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p301oh.C8048g;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "", "", "Loh/g;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "studyStats", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareViewModel$streak$1", m19206f = "StatsShareViewModel.kt", m19207l = {67, 79}, m19208m = "invokeSuspend")
final class StatsShareViewModel$streak$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Pair<? extends Integer, ? extends List<? extends C8048g>>>, UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f24466e;

    /* JADX INFO: renamed from: f */
    public int f24467f;

    /* JADX INFO: renamed from: g */
    public int f24468g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ InterfaceC7117d f24469h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ UserLanguageStudyStats f24470i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ StatsShareViewModel f24471j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$streak$1(StatsShareViewModel statsShareViewModel, InterfaceC9968c<? super StatsShareViewModel$streak$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f24471j = statsShareViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Pair<? extends Integer, ? extends List<? extends C8048g>>> interfaceC7117d, UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        StatsShareViewModel$streak$1 statsShareViewModel$streak$1 = new StatsShareViewModel$streak$1(this.f24471j, interfaceC9968c);
        statsShareViewModel$streak$1.f24469h = interfaceC7117d;
        statsShareViewModel$streak$1.f24470i = userLanguageStudyStats;
        return statsShareViewModel$streak$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        UserLanguageStudyStats userLanguageStudyStats;
        int i10;
        List<UserStudyStatsScore> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f24468g;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f24467f;
                list = this.f24466e;
                userLanguageStudyStats = this.f24470i;
                interfaceC7117d = this.f24469h;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        interfaceC7117d = this.f24469h;
        userLanguageStudyStats = this.f24470i;
        i10 = userLanguageStudyStats.f21788c;
        PreferenceStoreImpl$special$$inlined$map$4 preferenceStoreImpl$special$$inlined$map$4Mo9587d0 = this.f24471j.f24440e.mo9587d0();
        this.f24469h = interfaceC7117d;
        this.f24470i = userLanguageStudyStats;
        list = userLanguageStudyStats.f21791f;
        this.f24466e = list;
        this.f24467f = i10;
        this.f24468g = 1;
        obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$4Mo9587d0, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ArrayList arrayListM10458f = C4924a.m10458f((String) obj);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        int i12 = 0;
        for (Object obj2 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C9000b.m17257w();
                throw null;
            }
            UserStudyStatsScore userStudyStatsScore = (UserStudyStatsScore) obj2;
            String str = (String) ((i12 < 0 || i12 > C9000b.m17249o(arrayListM10458f)) ? userStudyStatsScore.f21799b : arrayListM10458f.get(i12));
            int i14 = userStudyStatsScore.f21800c;
            int i15 = userLanguageStudyStats.f21787b;
            UserActivityLevel userActivityLevel = userStudyStatsScore.f21801d;
            arrayList.add(new C8048g(str, i14, i15, userActivityLevel != null ? userActivityLevel.f21693a : 1));
            i12 = i13;
        }
        Pair pair = new Pair(new Integer(i10), arrayList);
        this.f24469h = null;
        this.f24470i = null;
        this.f24466e = null;
        this.f24468g = 2;
        if (interfaceC7117d.mo1339r(pair, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
