package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import dm.C5207g;
import gi.C5804b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "", "userLanguageStats", "Lgi/b;", "", "userStreak", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$_showRepairStreak$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$_showRepairStreak$1 extends SuspendLambda implements InterfaceC2057q<Pair<? extends UserLanguageStudyStats, ? extends Boolean>, Pair<? extends C5804b, ? extends String>, InterfaceC9968c<? super Pair<? extends C5804b, ? extends UserLanguageStudyStats>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Pair f29018e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Pair f29019f;

    public LessonCompleteViewModel$_showRepairStreak$1(InterfaceC9968c<? super LessonCompleteViewModel$_showRepairStreak$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Pair<? extends UserLanguageStudyStats, ? extends Boolean> pair, Pair<? extends C5804b, ? extends String> pair2, InterfaceC9968c<? super Pair<? extends C5804b, ? extends UserLanguageStudyStats>> interfaceC9968c) {
        LessonCompleteViewModel$_showRepairStreak$1 lessonCompleteViewModel$_showRepairStreak$1 = new LessonCompleteViewModel$_showRepairStreak$1(interfaceC9968c);
        lessonCompleteViewModel$_showRepairStreak$1.f29018e = pair;
        lessonCompleteViewModel$_showRepairStreak$1.f29019f = pair2;
        return lessonCompleteViewModel$_showRepairStreak$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Pair pair = this.f29018e;
        Pair pair2 = this.f29019f;
        UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) pair.f38012a;
        if (userLanguageStudyStats == null || pair2 == null || !C5207g.m11106a(userLanguageStudyStats.f21786a, pair2.f38013b)) {
            return null;
        }
        return new Pair(pair2.f38012a, userLanguageStudyStats);
    }
}
