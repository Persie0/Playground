package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1271x270a5a0;
import com.lingq.core.data.repository.C1272x9d9d5afa;
import com.lingq.core.data.repository.C1273xfea39cee;
import com.lingq.core.data.repository.C1275x3e668dfa;
import com.lingq.core.data.repository.C1277xa6a8b187;
import com.lingq.core.data.repository.C1278xfe13d285;
import com.lingq.core.data.repository.C1280x78e3bf7d;
import com.lingq.core.data.repository.LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1;
import com.lingq.core.data.repository.LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageStats;
import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.milestones.AbstractC1479h;
import com.lingq.core.domain.model.milestones.LessonAchievement;
import com.lingq.core.domain.model.milestones.LessonAchievementData$DailyGoal;
import com.lingq.core.domain.model.milestones.LessonAchievementData$KnownWords;
import com.lingq.core.domain.model.milestones.LessonAchievementData$Level;
import com.lingq.core.domain.model.milestones.LessonAchievementData$StreakMilestone;
import com.lingq.core.domain.model.milestones.LessonAchievementType;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.token.GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.chat.settings.LynxSettingsViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.karaoke.KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1;
import com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.domain.ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.domain.ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.reader.stats.LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1;
import com.lingq.feature.reader.stats.LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1;
import com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.stats.domain.ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.reader.stats.p019ui.all.C2552x86e6a9fb;
import com.lingq.feature.reader.stats.p019ui.words.C2569x4ca3bdfe;
import com.lingq.feature.reader.stats.p019ui.words.C2570x16fd3b17;
import com.lingq.feature.statistics.C2802xf3de9c0e;
import com.lingq.feature.statistics.LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1;
import com.lingq.feature.statistics.LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class bn3 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f8714b;

    public bn3(e83 e83Var, web webVar) {
        this.f8713a = 28;
        this.f8714b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:129:0x0212  */
    /* JADX WARN: Code duplicated, block: B:144:0x025e  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:200:0x0355  */
    /* JADX WARN: Code duplicated, block: B:218:0x0394  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0417  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:291:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:309:0x0521  */
    /* JADX WARN: Code duplicated, block: B:328:0x0567  */
    /* JADX WARN: Code duplicated, block: B:346:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:369:0x060b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0647  */
    /* JADX WARN: Code duplicated, block: B:405:0x068f  */
    /* JADX WARN: Code duplicated, block: B:420:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:442:0x0730  */
    /* JADX WARN: Code duplicated, block: B:457:0x0775  */
    /* JADX WARN: Code duplicated, block: B:479:0x07da  */
    /* JADX WARN: Code duplicated, block: B:494:0x0816  */
    /* JADX WARN: Code duplicated, block: B:515:0x0858  */
    /* JADX WARN: Code duplicated, block: B:534:0x090a  */
    /* JADX WARN: Code duplicated, block: B:551:0x094a  */
    /* JADX WARN: Code duplicated, block: B:571:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:587:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1 getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1;
        KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1 karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1;
        C1271x270a5a0 c1271x270a5a0;
        LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1 languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1;
        C1272x9d9d5afa c1272x9d9d5afa;
        C2802xf3de9c0e c2802xf3de9c0e;
        LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1 languageStatsUpdateViewModel$special$$inlined$map$1$2$1;
        C2552x86e6a9fb c2552x86e6a9fb;
        C2569x4ca3bdfe c2569x4ca3bdfe;
        C2570x16fd3b17 c2570x16fd3b17;
        LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1 lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1;
        LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1 lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1;
        LessonCompleteViewModel$special$$inlined$map$1$2$1 lessonCompleteViewModel$special$$inlined$map$1$2$1;
        LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1 lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1;
        C1273xfea39cee c1273xfea39cee;
        LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1 lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1;
        LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1 lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1;
        LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1;
        C1275x3e668dfa c1275x3e668dfa;
        int i;
        LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1 lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1;
        C1277xa6a8b187 c1277xa6a8b187;
        LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1 libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1;
        C1278xfe13d285 c1278xfe13d285;
        LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1;
        C1280x78e3bf7d c1280x78e3bf7d;
        LynxSettingsViewModel$special$$inlined$map$1$2$1 lynxSettingsViewModel$special$$inlined$map$1$2$1;
        ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1 observeCourseImageUseCase$invoke$$inlined$map$1$2$1;
        ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1 observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1;
        ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1 observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1;
        AbstractC2952e5 c0007a5;
        AbstractC2952e5 c0835c5;
        wy5 wy5Var;
        PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1 playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1;
        int i2 = this.f8713a;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f8714b;
        Object languageStats = null;
        switch (i2) {
            case 0:
                if (continuation instanceof GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1) {
                    getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1 = (GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i3 = getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1.f20074b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1.f20074b = i3 - Integer.MIN_VALUE;
                    } else {
                        getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1 = new GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1 = new GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1.f20073a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1.f20074b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1.f20074b = 1;
                    return e83Var.emit(boolValueOf, getTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
                }
                if (i4 == 1) {
                    AbstractC3193b.m15359b(obj2);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (continuation instanceof KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1) {
                    karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1 = (KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i5 = karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1.f26235b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1.f26235b = i5 - Integer.MIN_VALUE;
                    } else {
                        karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1 = new KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1 = new KaraokeViewModel$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                }
                Object obj3 = karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1.f26234a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1.f26235b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                u45 u45Var = (u45) obj;
                Pair pair = new Pair(new Integer(u45Var.f63394a), u45Var.f63399f);
                karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1.f26235b = 1;
                return e83Var.emit(pair, karaokeViewModel$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof C1271x270a5a0) {
                    c1271x270a5a0 = (C1271x270a5a0) continuation;
                    int i7 = c1271x270a5a0.f15217b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c1271x270a5a0.f15217b = i7 - Integer.MIN_VALUE;
                    } else {
                        c1271x270a5a0 = new C1271x270a5a0(this, continuation);
                    }
                } else {
                    c1271x270a5a0 = new C1271x270a5a0(this, continuation);
                }
                Object obj4 = c1271x270a5a0.f15216a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = c1271x270a5a0.f15217b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC3423or.m18265l0((LanguageContextEntity) it.next()));
                }
                c1271x270a5a0.f15217b = 1;
                return e83Var.emit(arrayList, c1271x270a5a0) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            case 3:
                if (continuation instanceof LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1) {
                    languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1 = (LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i9 = languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1.f33213b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1.f33213b = i9 - Integer.MIN_VALUE;
                    } else {
                        languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1 = new LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1 = new LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj5 = languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1.f33212a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1.f33213b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                if (((List) obj).isEmpty()) {
                    return xfaVar;
                }
                languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1.f33213b = 1;
                return e83Var.emit(obj, languageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                if (continuation instanceof C1272x9d9d5afa) {
                    c1272x9d9d5afa = (C1272x9d9d5afa) continuation;
                    int i11 = c1272x9d9d5afa.f15305b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1272x9d9d5afa.f15305b = i11 - Integer.MIN_VALUE;
                    } else {
                        c1272x9d9d5afa = new C1272x9d9d5afa(this, continuation);
                    }
                } else {
                    c1272x9d9d5afa = new C1272x9d9d5afa(this, continuation);
                }
                Object obj6 = c1272x9d9d5afa.f15304a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = c1272x9d9d5afa.f15305b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                LanguageStatsEntity languageStatsEntity = (LanguageStatsEntity) obj;
                languageStats = languageStatsEntity != null ? new LanguageStats(languageStatsEntity.f17203b, languageStatsEntity.f17204c, languageStatsEntity.f17205d, languageStatsEntity.f17206e, languageStatsEntity.f17207f, languageStatsEntity.f17208g, languageStatsEntity.f17209h, languageStatsEntity.f17210i, languageStatsEntity.f17211j, languageStatsEntity.f17212k, languageStatsEntity.f17213l, languageStatsEntity.f17214m, languageStatsEntity.f17215n, languageStatsEntity.f17216o, languageStatsEntity.f17217p, languageStatsEntity.f17218q, languageStatsEntity.f17219r, languageStatsEntity.f17220s, languageStatsEntity.f17221t, languageStatsEntity.f17222u, languageStatsEntity.f17223v, languageStatsEntity.f17224w, languageStatsEntity.f17225x, languageStatsEntity.f17226y, languageStatsEntity.f17227z, languageStatsEntity.f17200A, languageStatsEntity.f17201B) : null;
                c1272x9d9d5afa.f15305b = 1;
                return e83Var.emit(languageStats, c1272x9d9d5afa) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
            case 5:
                if (continuation instanceof C2802xf3de9c0e) {
                    c2802xf3de9c0e = (C2802xf3de9c0e) continuation;
                    int i13 = c2802xf3de9c0e.f33248b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2802xf3de9c0e.f33248b = i13 - Integer.MIN_VALUE;
                    } else {
                        c2802xf3de9c0e = new C2802xf3de9c0e(this, continuation);
                    }
                } else {
                    c2802xf3de9c0e = new C2802xf3de9c0e(this, continuation);
                }
                Object obj7 = c2802xf3de9c0e.f33247a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = c2802xf3de9c0e.f33248b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                ws1 ws1Var = (ws1) obj;
                if (ws1Var != null && !ws1Var.f67227c) {
                    languageStats = ws1Var;
                }
                c2802xf3de9c0e.f33248b = 1;
                return e83Var.emit(languageStats, c2802xf3de9c0e) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
            case 6:
                if (continuation instanceof LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1) {
                    languageStatsUpdateViewModel$special$$inlined$map$1$2$1 = (LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1) continuation;
                    int i15 = languageStatsUpdateViewModel$special$$inlined$map$1$2$1.f33290b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        languageStatsUpdateViewModel$special$$inlined$map$1$2$1.f33290b = i15 - Integer.MIN_VALUE;
                    } else {
                        languageStatsUpdateViewModel$special$$inlined$map$1$2$1 = new LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    languageStatsUpdateViewModel$special$$inlined$map$1$2$1 = new LanguageStatsUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj8 = languageStatsUpdateViewModel$special$$inlined$map$1$2$1.f33289a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = languageStatsUpdateViewModel$special$$inlined$map$1$2$1.f33290b;
                if (i16 == 0) {
                    AbstractC3193b.m15359b(obj8);
                    String str = ((Language) obj).f19024a;
                    languageStatsUpdateViewModel$special$$inlined$map$1$2$1.f33290b = 1;
                    return e83Var.emit(str, languageStatsUpdateViewModel$special$$inlined$map$1$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
                }
                if (i16 == 1) {
                    AbstractC3193b.m15359b(obj8);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (continuation instanceof C2552x86e6a9fb) {
                    c2552x86e6a9fb = (C2552x86e6a9fb) continuation;
                    int i17 = c2552x86e6a9fb.f30922b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c2552x86e6a9fb.f30922b = i17 - Integer.MIN_VALUE;
                    } else {
                        c2552x86e6a9fb = new C2552x86e6a9fb(this, continuation);
                    }
                } else {
                    c2552x86e6a9fb = new C2552x86e6a9fb(this, continuation);
                }
                Object obj9 = c2552x86e6a9fb.f30921a;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = c2552x86e6a9fb.f30922b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC3193b.m15359b(obj9);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj9);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj10 : (List) obj) {
                    if (fa4.m11650l(((LessonWord) obj10).f19322i, WordStatus.Known.getValue())) {
                        arrayList2.add(obj10);
                    }
                }
                c2552x86e6a9fb.f30922b = 1;
                return e83Var.emit(arrayList2, c2552x86e6a9fb) == coroutineSingletons8 ? coroutineSingletons8 : xfaVar;
            case 8:
                if (continuation instanceof C2569x4ca3bdfe) {
                    c2569x4ca3bdfe = (C2569x4ca3bdfe) continuation;
                    int i19 = c2569x4ca3bdfe.f31093b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        c2569x4ca3bdfe.f31093b = i19 - Integer.MIN_VALUE;
                    } else {
                        c2569x4ca3bdfe = new C2569x4ca3bdfe(this, continuation);
                    }
                } else {
                    c2569x4ca3bdfe = new C2569x4ca3bdfe(this, continuation);
                }
                Object obj11 = c2569x4ca3bdfe.f31092a;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = c2569x4ca3bdfe.f31093b;
                if (i20 == 0) {
                    AbstractC3193b.m15359b(obj11);
                    Boolean boolValueOf2 = Boolean.valueOf(!((List) obj).isEmpty());
                    c2569x4ca3bdfe.f31093b = 1;
                    return e83Var.emit(boolValueOf2, c2569x4ca3bdfe) == coroutineSingletons9 ? coroutineSingletons9 : xfaVar;
                }
                if (i20 == 1) {
                    AbstractC3193b.m15359b(obj11);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (continuation instanceof C2570x16fd3b17) {
                    c2570x16fd3b17 = (C2570x16fd3b17) continuation;
                    int i21 = c2570x16fd3b17.f31110b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c2570x16fd3b17.f31110b = i21 - Integer.MIN_VALUE;
                    } else {
                        c2570x16fd3b17 = new C2570x16fd3b17(this, continuation);
                    }
                } else {
                    c2570x16fd3b17 = new C2570x16fd3b17(this, continuation);
                }
                Object obj12 = c2570x16fd3b17.f31109a;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = c2570x16fd3b17.f31110b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        AbstractC3193b.m15359b(obj12);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj12);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj13 : (List) obj) {
                    if (fa4.m11650l(((LessonWord) obj13).f19322i, WordStatus.Known.getValue())) {
                        arrayList3.add(obj13);
                    }
                }
                c2570x16fd3b17.f31110b = 1;
                return e83Var.emit(arrayList3, c2570x16fd3b17) == coroutineSingletons10 ? coroutineSingletons10 : xfaVar;
            case 10:
                if (continuation instanceof LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1) {
                    lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1 = (LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i23 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1.f30544b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1.f30544b = i23 - Integer.MIN_VALUE;
                    } else {
                        lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1 = new LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1 = new LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                }
                Object obj14 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1.f30543a;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1.f30544b;
                if (i24 == 0) {
                    AbstractC3193b.m15359b(obj14);
                    LessonReference lessonReference = ((LessonCompleteData) obj).f19220q;
                    lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1.f30544b = 1;
                    return e83Var.emit(lessonReference, lessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons11 ? coroutineSingletons11 : xfaVar;
                }
                if (i24 == 1) {
                    AbstractC3193b.m15359b(obj14);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (continuation instanceof LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1) {
                    lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1 = (LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i25 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1.f30547b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1.f30547b = i25 - Integer.MIN_VALUE;
                    } else {
                        lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1 = new LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1 = new LessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                }
                Object obj15 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1.f30546a;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1.f30547b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        AbstractC3193b.m15359b(obj15);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj15);
                LessonReference lessonReference2 = (LessonReference) obj;
                if (!lessonReference2.f19244d && lessonReference2.f19242b > 0) {
                    z = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1.f30547b = 1;
                return e83Var.emit(boolValueOf3, lessonCompleteViewModel$12$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons12 ? coroutineSingletons12 : xfaVar;
            case 12:
                if (continuation instanceof LessonCompleteViewModel$special$$inlined$map$1$2$1) {
                    lessonCompleteViewModel$special$$inlined$map$1$2$1 = (LessonCompleteViewModel$special$$inlined$map$1$2$1) continuation;
                    int i27 = lessonCompleteViewModel$special$$inlined$map$1$2$1.f30700b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        lessonCompleteViewModel$special$$inlined$map$1$2$1.f30700b = i27 - Integer.MIN_VALUE;
                    } else {
                        lessonCompleteViewModel$special$$inlined$map$1$2$1 = new LessonCompleteViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonCompleteViewModel$special$$inlined$map$1$2$1 = new LessonCompleteViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj16 = lessonCompleteViewModel$special$$inlined$map$1$2$1.f30699a;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = lessonCompleteViewModel$special$$inlined$map$1$2$1.f30700b;
                if (i28 == 0) {
                    AbstractC3193b.m15359b(obj16);
                    Integer num = ((LessonCompleteData) obj).f19205b;
                    lessonCompleteViewModel$special$$inlined$map$1$2$1.f30700b = 1;
                    return e83Var.emit(num, lessonCompleteViewModel$special$$inlined$map$1$2$1) == coroutineSingletons13 ? coroutineSingletons13 : xfaVar;
                }
                if (i28 == 1) {
                    AbstractC3193b.m15359b(obj16);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (continuation instanceof LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1) {
                    lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1 = (LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1) continuation;
                    int i29 = lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1.f15414b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1.f15414b = i29 - Integer.MIN_VALUE;
                    } else {
                        lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1 = new LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1 = new LessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1(this, continuation);
                }
                Object obj17 = lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1.f15413a;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1.f15414b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        AbstractC3193b.m15359b(obj17);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj17);
                LessonEntity lessonEntity = (LessonEntity) obj;
                if (lessonEntity != null) {
                    int i31 = lessonEntity.f17274a;
                    String str2 = lessonEntity.f17282e;
                    languageStats = new u45(i31, str2 == null ? "" : str2, lessonEntity.f17288h, lessonEntity.f17312t, lessonEntity.f17268U, lessonEntity.f17290i, lessonEntity.f17244C, lessonEntity.f17298m);
                }
                lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1.f15414b = 1;
                return e83Var.emit(languageStats, lessonRepositoryImpl$getLessonForListening$$inlined$map$1$2$1) == coroutineSingletons14 ? coroutineSingletons14 : xfaVar;
            case 14:
                if (continuation instanceof C1273xfea39cee) {
                    c1273xfea39cee = (C1273xfea39cee) continuation;
                    int i32 = c1273xfea39cee.f15417b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        c1273xfea39cee.f15417b = i32 - Integer.MIN_VALUE;
                    } else {
                        c1273xfea39cee = new C1273xfea39cee(this, continuation);
                    }
                } else {
                    c1273xfea39cee = new C1273xfea39cee(this, continuation);
                }
                Object obj18 = c1273xfea39cee.f15416a;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = c1273xfea39cee.f15417b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        AbstractC3193b.m15359b(obj18);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj18);
                u85 u85Var = (u85) obj;
                languageStats = u85Var != null ? AbstractC3423or.m18271o0(u85Var) : null;
                c1273xfea39cee.f15417b = 1;
                return e83Var.emit(languageStats, c1273xfea39cee) == coroutineSingletons15 ? coroutineSingletons15 : xfaVar;
            case 15:
                if (continuation instanceof LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1) {
                    lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1 = (LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1) continuation;
                    int i34 = lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1.f15448b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1.f15448b = i34 - Integer.MIN_VALUE;
                    } else {
                        lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1 = new LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1 = new LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1(this, continuation);
                }
                Object obj19 = lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1.f15447a;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1.f15448b;
                if (i35 == 0) {
                    AbstractC3193b.m15359b(obj19);
                    Boolean boolValueOf4 = Boolean.valueOf(((Number) obj).intValue() > 0);
                    lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1.f15448b = 1;
                    return e83Var.emit(boolValueOf4, lessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1) == coroutineSingletons16 ? coroutineSingletons16 : xfaVar;
                }
                if (i35 == 1) {
                    AbstractC3193b.m15359b(obj19);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (continuation instanceof LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1) {
                    lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1 = (LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1) continuation;
                    int i36 = lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1.f15451b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1.f15451b = i36 - Integer.MIN_VALUE;
                    } else {
                        lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1 = new LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1 = new LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1(this, continuation);
                }
                Object obj20 = lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1.f15450a;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1.f15451b;
                if (i37 == 0) {
                    AbstractC3193b.m15359b(obj20);
                    Boolean boolValueOf5 = Boolean.valueOf(((Integer) obj) != null);
                    lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1.f15451b = 1;
                    return e83Var.emit(boolValueOf5, lessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1) == coroutineSingletons17 ? coroutineSingletons17 : xfaVar;
                }
                if (i37 == 1) {
                    AbstractC3193b.m15359b(obj20);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (continuation instanceof LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) {
                    lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = (LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) continuation;
                    int i38 = lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15464b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15464b = i38 - Integer.MIN_VALUE;
                    } else {
                        lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = new LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = new LessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1(this, continuation);
                }
                Object obj21 = lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15463a;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15464b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        AbstractC3193b.m15359b(obj21);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj21);
                LessonEntity lessonEntity2 = (LessonEntity) obj;
                languageStats = lessonEntity2 != null ? AbstractC3423or.m18269n0(lessonEntity2) : null;
                lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15464b = 1;
                return e83Var.emit(languageStats, lessonRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) == coroutineSingletons18 ? coroutineSingletons18 : xfaVar;
            case 18:
                if (continuation instanceof C1275x3e668dfa) {
                    c1275x3e668dfa = (C1275x3e668dfa) continuation;
                    int i40 = c1275x3e668dfa.f15470b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        c1275x3e668dfa.f15470b = i40 - Integer.MIN_VALUE;
                    } else {
                        c1275x3e668dfa = new C1275x3e668dfa(this, continuation);
                    }
                } else {
                    c1275x3e668dfa = new C1275x3e668dfa(this, continuation);
                }
                Object obj22 = c1275x3e668dfa.f15469a;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = c1275x3e668dfa.f15470b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        AbstractC3193b.m15359b(obj22);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj22);
                LessonEntity lessonEntity3 = (LessonEntity) obj;
                if (lessonEntity3 != null) {
                    languageStats = new LessonCompleteData(lessonEntity3.f17274a, lessonEntity3.f17248E, lessonEntity3.f17310s, lessonEntity3.f17312t, lessonEntity3.f17254H, lessonEntity3.f17256I, lessonEntity3.f17292j, lessonEntity3.f17300n, lessonEntity3.f17266S, lessonEntity3.f17260M, lessonEntity3.f17278c, lessonEntity3.f17290i, lessonEntity3.f17277b0, lessonEntity3.f17257J, lessonEntity3.f17294k, lessonEntity3.f17262O, lessonEntity3.f17250F, lessonEntity3.f17252G);
                    i = 1;
                } else {
                    i = 1;
                }
                c1275x3e668dfa.f15470b = i;
                return e83Var.emit(languageStats, c1275x3e668dfa) == coroutineSingletons19 ? coroutineSingletons19 : xfaVar;
            case 19:
                if (continuation instanceof LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1) {
                    lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1 = (LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1) continuation;
                    int i42 = lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1.f15473b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1.f15473b = i42 - Integer.MIN_VALUE;
                    } else {
                        lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1 = new LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1 = new LessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1(this, continuation);
                }
                Object obj23 = lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1.f15472a;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1.f15473b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        AbstractC3193b.m15359b(obj23);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj23);
                LessonEntity lessonEntity4 = (LessonEntity) obj;
                languageStats = lessonEntity4 != null ? AbstractC3423or.m18269n0(lessonEntity4) : null;
                lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1.f15473b = 1;
                return e83Var.emit(languageStats, lessonRepositoryImpl$observeLessonInfo$$inlined$map$1$2$1) == coroutineSingletons20 ? coroutineSingletons20 : xfaVar;
            case 20:
                if (continuation instanceof C1277xa6a8b187) {
                    c1277xa6a8b187 = (C1277xa6a8b187) continuation;
                    int i44 = c1277xa6a8b187.f15747b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c1277xa6a8b187.f15747b = i44 - Integer.MIN_VALUE;
                    } else {
                        c1277xa6a8b187 = new C1277xa6a8b187(this, continuation);
                    }
                } else {
                    c1277xa6a8b187 = new C1277xa6a8b187(this, continuation);
                }
                Object obj24 = c1277xa6a8b187.f15746a;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i45 = c1277xa6a8b187.f15747b;
                if (i45 == 0) {
                    AbstractC3193b.m15359b(obj24);
                    Boolean boolValueOf6 = Boolean.valueOf(((Number) obj).intValue() > 0);
                    c1277xa6a8b187.f15747b = 1;
                    return e83Var.emit(boolValueOf6, c1277xa6a8b187) == coroutineSingletons21 ? coroutineSingletons21 : xfaVar;
                }
                if (i45 == 1) {
                    AbstractC3193b.m15359b(obj24);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (continuation instanceof LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1) {
                    libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1 = (LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1) continuation;
                    int i46 = libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1.f15750b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1.f15750b = i46 - Integer.MIN_VALUE;
                    } else {
                        libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1 = new LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1 = new LibraryRepositoryImpl$observableCourse$$inlined$map$1$2$1(this, continuation);
                }
                Object obj25 = libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1.f15749a;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i47 = libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1.f15750b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        AbstractC3193b.m15359b(obj25);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj25);
                u85 u85Var2 = (u85) obj;
                languageStats = u85Var2 != null ? AbstractC3423or.m18273p0(u85Var2) : null;
                libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1.f15750b = 1;
                return e83Var.emit(languageStats, libraryRepositoryImpl$observableCourse$$inlined$map$1$2$1) == coroutineSingletons22 ? coroutineSingletons22 : xfaVar;
            case 22:
                if (continuation instanceof C1278xfe13d285) {
                    c1278xfe13d285 = (C1278xfe13d285) continuation;
                    int i48 = c1278xfe13d285.f15753b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c1278xfe13d285.f15753b = i48 - Integer.MIN_VALUE;
                    } else {
                        c1278xfe13d285 = new C1278xfe13d285(this, continuation);
                    }
                } else {
                    c1278xfe13d285 = new C1278xfe13d285(this, continuation);
                }
                Object obj26 = c1278xfe13d285.f15752a;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i49 = c1278xfe13d285.f15753b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        AbstractC3193b.m15359b(obj26);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj26);
                List list2 = (List) obj;
                ArrayList arrayList4 = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(AbstractC3423or.m18273p0((u85) it2.next()));
                }
                c1278xfe13d285.f15753b = 1;
                return e83Var.emit(arrayList4, c1278xfe13d285) == coroutineSingletons23 ? coroutineSingletons23 : xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                if (continuation instanceof LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) {
                    libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = (LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) continuation;
                    int i50 = libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15756b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15756b = i50 - Integer.MIN_VALUE;
                    } else {
                        libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = new LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1 = new LibraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1(this, continuation);
                }
                Object obj27 = libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15755a;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i51 = libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15756b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        AbstractC3193b.m15359b(obj27);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj27);
                u85 u85Var3 = (u85) obj;
                languageStats = u85Var3 != null ? AbstractC3423or.m18267m0(u85Var3) : null;
                libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1.f15756b = 1;
                return e83Var.emit(languageStats, libraryRepositoryImpl$observableLessonInfo$$inlined$map$1$2$1) == coroutineSingletons24 ? coroutineSingletons24 : xfaVar;
            case 24:
                if (continuation instanceof C1280x78e3bf7d) {
                    c1280x78e3bf7d = (C1280x78e3bf7d) continuation;
                    int i52 = c1280x78e3bf7d.f15762b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        c1280x78e3bf7d.f15762b = i52 - Integer.MIN_VALUE;
                    } else {
                        c1280x78e3bf7d = new C1280x78e3bf7d(this, continuation);
                    }
                } else {
                    c1280x78e3bf7d = new C1280x78e3bf7d(this, continuation);
                }
                Object obj28 = c1280x78e3bf7d.f15761a;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i53 = c1280x78e3bf7d.f15762b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        AbstractC3193b.m15359b(obj28);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj28);
                List list3 = (List) obj;
                ArrayList arrayList5 = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(AbstractC3423or.m18273p0((u85) it3.next()));
                }
                c1280x78e3bf7d.f15762b = 1;
                return e83Var.emit(arrayList5, c1280x78e3bf7d) == coroutineSingletons25 ? coroutineSingletons25 : xfaVar;
            case 25:
                if (continuation instanceof LynxSettingsViewModel$special$$inlined$map$1$2$1) {
                    lynxSettingsViewModel$special$$inlined$map$1$2$1 = (LynxSettingsViewModel$special$$inlined$map$1$2$1) continuation;
                    int i54 = lynxSettingsViewModel$special$$inlined$map$1$2$1.f25318b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        lynxSettingsViewModel$special$$inlined$map$1$2$1.f25318b = i54 - Integer.MIN_VALUE;
                    } else {
                        lynxSettingsViewModel$special$$inlined$map$1$2$1 = new LynxSettingsViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    lynxSettingsViewModel$special$$inlined$map$1$2$1 = new LynxSettingsViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj29 = lynxSettingsViewModel$special$$inlined$map$1$2$1.f25317a;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i55 = lynxSettingsViewModel$special$$inlined$map$1$2$1.f25318b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        AbstractC3193b.m15359b(obj29);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj29);
                vn5 vn5Var = (vn5) obj;
                eo5 eo5Var = new eo5(vn5Var.f65660a, vn5Var.f65661b, vn5Var.f65662c, vn5Var.f65663d, vn5Var.f65664e);
                lynxSettingsViewModel$special$$inlined$map$1$2$1.f25318b = 1;
                return e83Var.emit(eo5Var, lynxSettingsViewModel$special$$inlined$map$1$2$1) == coroutineSingletons26 ? coroutineSingletons26 : xfaVar;
            case 26:
                if (continuation instanceof ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1) {
                    observeCourseImageUseCase$invoke$$inlined$map$1$2$1 = (ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i56 = observeCourseImageUseCase$invoke$$inlined$map$1$2$1.f30266b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        observeCourseImageUseCase$invoke$$inlined$map$1$2$1.f30266b = i56 - Integer.MIN_VALUE;
                    } else {
                        observeCourseImageUseCase$invoke$$inlined$map$1$2$1 = new ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    observeCourseImageUseCase$invoke$$inlined$map$1$2$1 = new ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj30 = observeCourseImageUseCase$invoke$$inlined$map$1$2$1.f30265a;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i57 = observeCourseImageUseCase$invoke$$inlined$map$1$2$1.f30266b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        AbstractC3193b.m15359b(obj30);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj30);
                LibraryItem libraryItem = (LibraryItem) obj;
                languageStats = libraryItem != null ? libraryItem.f19436h : null;
                observeCourseImageUseCase$invoke$$inlined$map$1$2$1.f30266b = 1;
                return e83Var.emit(languageStats, observeCourseImageUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons27 ? coroutineSingletons27 : xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (continuation instanceof ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1) {
                    observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1 = (ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i58 = observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1.f30269b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1.f30269b = i58 - Integer.MIN_VALUE;
                    } else {
                        observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1 = new ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1 = new ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj31 = observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1.f30268a;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i59 = observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1.f30269b;
                if (i59 == 0) {
                    AbstractC3193b.m15359b(obj31);
                    String str3 = ((Profile) obj).f19654c;
                    observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1.f30269b = 1;
                    return e83Var.emit(str3, observeCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons28 ? coroutineSingletons28 : xfaVar;
                }
                if (i59 == 1) {
                    AbstractC3193b.m15359b(obj31);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (continuation instanceof ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1) {
                    observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1 = (ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i60 = observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1.f30775b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1.f30775b = i60 - Integer.MIN_VALUE;
                    } else {
                        observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1 = new ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1 = new ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj32 = observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1.f30774a;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i61 = observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1.f30775b;
                if (i61 == 0) {
                    AbstractC3193b.m15359b(obj32);
                    ArrayList arrayList6 = new ArrayList();
                    for (LessonAchievement lessonAchievement : (List) obj) {
                        LessonAchievementType lessonAchievementType = lessonAchievement.f19524c;
                        AbstractC1479h abstractC1479h = lessonAchievement.f19525d;
                        int i62 = mp6.f51702a[lessonAchievementType.ordinal()];
                        if (i62 == 1) {
                            LessonAchievementData$DailyGoal lessonAchievementData$DailyGoal = abstractC1479h instanceof LessonAchievementData$DailyGoal ? (LessonAchievementData$DailyGoal) abstractC1479h : null;
                            if (lessonAchievementData$DailyGoal != null) {
                                c0007a5 = new C0007a5(lessonAchievementData$DailyGoal.f19526b);
                                c0835c5 = c0007a5;
                            } else {
                                c0835c5 = null;
                            }
                        } else if (i62 != 2) {
                            if (i62 == 3) {
                                LessonAchievementData$KnownWords lessonAchievementData$KnownWords = abstractC1479h instanceof LessonAchievementData$KnownWords ? (LessonAchievementData$KnownWords) abstractC1479h : null;
                                if (lessonAchievementData$KnownWords != null) {
                                    c0007a5 = new C0798b5(lessonAchievementData$KnownWords.f19527b, lessonAchievementData$KnownWords.f19528c);
                                    c0835c5 = c0007a5;
                                }
                            } else if (i62 == 4) {
                                LessonAchievementData$Level lessonAchievementData$Level = abstractC1479h instanceof LessonAchievementData$Level ? (LessonAchievementData$Level) abstractC1479h : null;
                                if (lessonAchievementData$Level != null) {
                                    vy5 vy5Var = wy5.Companion;
                                    String str4 = lessonAchievementData$Level.f19530c;
                                    String strM23592a = lessonAchievementData$Level.f19529b;
                                    vy5Var.getClass();
                                    str4.getClass();
                                    strM23592a.getClass();
                                    if (vk9.m23391n0(str4)) {
                                        String lowerCase = cl9.m4839V(new Regex("([a-z])([A-Z])").m15428g(strM23592a, "$1_$2"), "_", "").toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        if (!wy5.f67519e.contains(lowerCase) && !wy5.f67518d.m15427f(lowerCase)) {
                                            lowerCase = null;
                                        }
                                        wy5Var = lowerCase != null ? new wy5("level.".concat(lowerCase), vy5.m23592a(lowerCase)) : null;
                                    } else {
                                        if (vk9.m23391n0(strM23592a)) {
                                            strM23592a = vy5.m23592a(vk9.m23368D0(str4, "level.", str4));
                                        }
                                        wy5Var = new wy5(str4, strM23592a);
                                    }
                                    if (wy5Var != null) {
                                        c0835c5 = new C0835c5(wy5Var);
                                    }
                                }
                            } else {
                                gm5.m12750e();
                            }
                            c0835c5 = null;
                        } else {
                            LessonAchievementData$StreakMilestone lessonAchievementData$StreakMilestone = abstractC1479h instanceof LessonAchievementData$StreakMilestone ? (LessonAchievementData$StreakMilestone) abstractC1479h : null;
                            if (lessonAchievementData$StreakMilestone != null) {
                                c0007a5 = new C2915d5(lessonAchievementData$StreakMilestone.f19531b);
                                c0835c5 = c0007a5;
                            } else {
                                c0835c5 = null;
                            }
                        }
                        if (c0835c5 != null) {
                            arrayList6.add(c0835c5);
                        }
                    }
                    C3026g5 c3026g5 = new C3026g5(arrayList6);
                    observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1.f30775b = 1;
                    return e83Var.emit(c3026g5, observeLessonAchievementsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons29 ? coroutineSingletons29 : xfaVar;
                }
                if (i61 == 1) {
                    AbstractC3193b.m15359b(obj32);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (continuation instanceof PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1) {
                    playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1 = (PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1) continuation;
                    int i63 = playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1.f29758b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1.f29758b = i63 - Integer.MIN_VALUE;
                    } else {
                        playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1 = new PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1 = new PlayerStateHolder$startObservingAudioWave$$inlined$map$1$2$1(this, continuation);
                }
                Object obj33 = playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1.f29757a;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i64 = playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1.f29758b;
                if (i64 == 0) {
                    AbstractC3193b.m15359b(obj33);
                    Boolean boolValueOf7 = Boolean.valueOf(((jy7) obj).f46393a);
                    playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1.f29758b = 1;
                    return e83Var.emit(boolValueOf7, playerStateHolder$startObservingAudioWave$$inlined$map$1$2$1) == coroutineSingletons30 ? coroutineSingletons30 : xfaVar;
                }
                if (i64 == 1) {
                    AbstractC3193b.m15359b(obj33);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ bn3(e83 e83Var, int i) {
        this.f8713a = i;
        this.f8714b = e83Var;
    }
}
