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
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p301oh.C8048g;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$j;", "Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$_streakItem$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {66, 72, 84}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$_streakItem$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super AbstractC7791r.j>, Pair<? extends UserLanguageStudyStats, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f24327e;

    /* JADX INFO: renamed from: f */
    public int f24328f;

    /* JADX INFO: renamed from: g */
    public int f24329g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ InterfaceC7117d f24330h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f24331i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LanguageStatsViewModel f24332j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$_streakItem$1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super LanguageStatsViewModel$_streakItem$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f24332j = languageStatsViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super AbstractC7791r.j> interfaceC7117d, Pair<? extends UserLanguageStudyStats, ? extends Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LanguageStatsViewModel$_streakItem$1 languageStatsViewModel$_streakItem$1 = new LanguageStatsViewModel$_streakItem$1(this.f24332j, interfaceC9968c);
        languageStatsViewModel$_streakItem$1.f24330h = interfaceC7117d;
        languageStatsViewModel$_streakItem$1.f24331i = pair;
        return languageStatsViewModel$_streakItem$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        UserLanguageStudyStats userLanguageStudyStats;
        int i10;
        Object objM14360a;
        List<UserStudyStatsScore> list;
        ArrayList arrayList;
        int i11;
        AbstractC7791r.j jVar;
        int i12;
        UserStudyStatsScore userStudyStatsScore;
        Object obj2;
        UserActivityLevel userActivityLevel;
        int i13;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.f24329g;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    int i15 = this.f24328f;
                    list = this.f24327e;
                    userLanguageStudyStats = (UserLanguageStudyStats) this.f24331i;
                    interfaceC7117d = this.f24330h;
                    C7499b.m14977z0(obj);
                    i10 = i15;
                    objM14360a = obj;
                    ArrayList arrayListM10458f = C4924a.m10458f((String) objM14360a);
                    arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    i11 = 0;
                    for (Object obj3 : list) {
                        i12 = i11 + 1;
                        if (i11 >= 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        userStudyStatsScore = (UserStudyStatsScore) obj3;
                        if (i11 >= 0 || i11 > C9000b.m17249o(arrayListM10458f)) {
                            obj2 = userStudyStatsScore.f21799b;
                        } else {
                            obj2 = arrayListM10458f.get(i11);
                        }
                        String str = (String) obj2;
                        int i16 = userStudyStatsScore.f21800c;
                        int i17 = userLanguageStudyStats.f21787b;
                        userActivityLevel = userStudyStatsScore.f21801d;
                        if (userActivityLevel != null) {
                            i13 = userActivityLevel.f21693a;
                        } else {
                            i13 = 1;
                        }
                        arrayList.add(new C8048g(str, i16, i17, i13));
                        i11 = i12;
                    }
                    jVar = new AbstractC7791r.j(i10, arrayList, true, false);
                    this.f24330h = null;
                    this.f24331i = null;
                    this.f24327e = null;
                    this.f24329g = 3;
                    if (interfaceC7117d.mo1339r(jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C7499b.m14977z0(obj);
        } else {
            C7499b.m14977z0(obj);
            interfaceC7117d = this.f24330h;
            Pair pair = (Pair) this.f24331i;
            if (((Boolean) pair.f38013b).booleanValue()) {
                AbstractC7791r.j jVar2 = new AbstractC7791r.j(0, EmptyList.f38032a, false, ((Boolean) pair.f38013b).booleanValue());
                this.f24330h = null;
                this.f24329g = 1;
                if (interfaceC7117d.mo1339r(jVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                userLanguageStudyStats = (UserLanguageStudyStats) pair.f38012a;
                if (userLanguageStudyStats != null) {
                    PreferenceStoreImpl$special$$inlined$map$4 preferenceStoreImpl$special$$inlined$map$4Mo9587d0 = this.f24332j.f24304f.mo9587d0();
                    this.f24330h = interfaceC7117d;
                    this.f24331i = userLanguageStudyStats;
                    List<UserStudyStatsScore> list2 = userLanguageStudyStats.f21791f;
                    this.f24327e = list2;
                    i10 = userLanguageStudyStats.f21788c;
                    this.f24328f = i10;
                    this.f24329g = 2;
                    objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$4Mo9587d0, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = list2;
                    ArrayList arrayListM10458f2 = C4924a.m10458f((String) objM14360a);
                    arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    i11 = 0;
                    while (r4.hasNext()) {
                        i12 = i11 + 1;
                        if (i11 >= 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        userStudyStatsScore = (UserStudyStatsScore) obj3;
                        if (i11 >= 0) {
                            obj2 = userStudyStatsScore.f21799b;
                        } else {
                            obj2 = userStudyStatsScore.f21799b;
                        }
                        String str2 = (String) obj2;
                        int i18 = userStudyStatsScore.f21800c;
                        int i19 = userLanguageStudyStats.f21787b;
                        userActivityLevel = userStudyStatsScore.f21801d;
                        if (userActivityLevel != null) {
                            i13 = userActivityLevel.f21693a;
                        } else {
                            i13 = 1;
                        }
                        arrayList.add(new C8048g(str2, i18, i19, i13));
                        i11 = i12;
                    }
                    jVar = new AbstractC7791r.j(i10, arrayList, true, false);
                    this.f24330h = null;
                    this.f24331i = null;
                    this.f24327e = null;
                    this.f24329g = 3;
                    if (interfaceC7117d.mo1339r(jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return C9072e.f47360a;
    }
}
