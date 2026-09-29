package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$7", m19206f = "LessonReviewMenuFragment.kt", m19207l = {166}, m19208m = "invokeSuspend")
public final class LessonReviewMenuFragment$onViewCreated$7$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28311e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonReviewMenuFragment f28312f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$7$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "streak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$7$1", m19206f = "LessonReviewMenuFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43341 extends SuspendLambda implements InterfaceC2056p<UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28313e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonReviewMenuFragment f28314f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43341(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super C43341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28314f = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43341 c43341 = new C43341(this.f28314f, interfaceC9968c);
            c43341.f28313e = obj;
            return c43341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43341) mo1336a(userLanguageStudyStats, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            List<UserStudyStatsScore> list;
            UserStudyStatsScore userStudyStatsScore;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) this.f28313e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            StreakActivityLevelView streakActivityLevelView = this.f28314f.m10184n0().f45130i;
            C5207g.m11110e(streakActivityLevelView, "binding.viewCurrentStreak");
            int i10 = (userLanguageStudyStats == null || (list = userLanguageStudyStats.f21791f) == null || (userStudyStatsScore = (UserStudyStatsScore) C6752c.m13433a0(list)) == null) ? 0 : userStudyStatsScore.f21800c;
            int i11 = userLanguageStudyStats != null ? userLanguageStudyStats.f21787b : 0;
            int i12 = userLanguageStudyStats != null ? userLanguageStudyStats.f21792g : 0;
            int i13 = StreakActivityLevelView.f16812e;
            streakActivityLevelView.m9375a(i10, i11, i12, true);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$7$7(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super LessonReviewMenuFragment$onViewCreated$7$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28312f = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonReviewMenuFragment$onViewCreated$7$7(this.f28312f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonReviewMenuFragment$onViewCreated$7$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28311e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f28312f;
            LessonViewModel lessonViewModelM10185o0 = lessonReviewMenuFragment.m10185o0();
            C43341 c43341 = new C43341(lessonReviewMenuFragment, null);
            this.f28311e = 1;
            if (C0062b.m369m0(lessonViewModelM10185o0.f27498n1, c43341, this) == coroutineSingletons) {
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
