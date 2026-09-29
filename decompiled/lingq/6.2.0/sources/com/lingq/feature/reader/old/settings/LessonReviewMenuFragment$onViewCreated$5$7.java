package com.lingq.feature.reader.old.settings;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingq.core.achievements.R$string;
import com.lingq.core.achievements.views.StreakActivityLevelView;
import com.lingq.core.achievements.views.StreakCircularProgressIndicator;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.d32;
import p000.hva;
import p000.jfa;
import p000.ss5;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$7", m4291f = "LessonReviewMenuFragment.kt", m4292l = {220}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$5$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29468b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$7$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$7$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24211 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29469a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonReviewMenuFragment f29470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24211(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29470b = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24211 c24211 = new C24211(this.f29470b, continuation);
            c24211.f29469a = obj;
            return c24211;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24211 c24211 = (C24211) create((LanguageStudyStats) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24211.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            List list;
            StudyStatsScores studyStatsScores;
            LanguageStudyStats languageStudyStats = (LanguageStudyStats) this.f29469a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            StreakActivityLevelView streakActivityLevelView = this.f29470b.m9344R0().f71452i;
            int i = (languageStudyStats == null || (list = languageStudyStats.f19111f) == null || (studyStatsScores = (StudyStatsScores) u91.m22598P0(list)) == null) ? 0 : studyStatsScores.f19128c;
            int i2 = languageStudyStats != null ? languageStudyStats.f19107b : 0;
            int i3 = languageStudyStats != null ? languageStudyStats.f19112g : 0;
            if (i3 < 1) {
                i3 = 1;
            }
            streakActivityLevelView.f14283P = i3;
            if (i2 > 0) {
                streakActivityLevelView.f14281N = i2;
                streakActivityLevelView.f14282O = i / i2;
            }
            if (i2 == -1) {
                streakActivityLevelView.f14281N = i;
            }
            hva hvaVar = streakActivityLevelView.f14279L;
            TextView textView = hvaVar.f43011h;
            ImageView imageView = hvaVar.f43009f;
            ConstraintLayout constraintLayout = hvaVar.f43013j;
            ConstraintLayout constraintLayout2 = hvaVar.f43010g;
            TextView textView2 = hvaVar.f43012i;
            StreakCircularProgressIndicator streakCircularProgressIndicator = hvaVar.f43005b;
            if (i2 == -1) {
                str = String.format(Locale.getDefault(), "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), streakActivityLevelView.getContext().getString(R$string.lesson_coins)}, 2));
            } else {
                Locale locale = Locale.getDefault();
                String string = streakActivityLevelView.getContext().getString(R$string.stats_coins_goal);
                string.getClass();
                str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
            }
            textView.setText(str);
            int i4 = streakActivityLevelView.f14282O;
            if (i4 < 1) {
                jfa.m14429l(constraintLayout2);
                jfa.m14425h(constraintLayout);
                streakCircularProgressIndicator.setMaxProgress(streakActivityLevelView.f14281N);
                hvaVar.f43008e.setColorFilter(d32.m10042h0(ss5.m21677B(streakActivityLevelView.f14283P)));
                hvaVar.f43007d.setImageResource(ss5.m21727y(streakActivityLevelView.f14283P, true));
                if (i != streakActivityLevelView.f14280M) {
                    int iMax = Math.max(0, i);
                    streakActivityLevelView.f14280M = iMax;
                    int i5 = streakActivityLevelView.f14281N;
                    if (iMax > i5) {
                        iMax = i5;
                    }
                    streakCircularProgressIndicator.setProgressWithAnimation(iMax);
                }
                streakCircularProgressIndicator.setTrackColor(streakActivityLevelView.getContext().getColor(R$color.grey_light));
                int i6 = streakActivityLevelView.f14283P;
                if (i6 == 7) {
                    streakCircularProgressIndicator.setIsGoldGradient(false);
                } else if (i6 != 8) {
                    streakCircularProgressIndicator.setIsGradient(false);
                    streakCircularProgressIndicator.setIndicatorColor(d32.m10042h0(ss5.m21678C(streakActivityLevelView.f14283P)));
                    streakCircularProgressIndicator.setInnerCircleColor(0);
                } else {
                    streakCircularProgressIndicator.setIsGoldGradient(true);
                }
            } else {
                if (i4 == 1) {
                    jfa.m14429l(imageView);
                    jfa.m14425h(textView2);
                    imageView.setColorFilter(d32.m10042h0(ss5.m21677B(streakActivityLevelView.f14283P)));
                } else {
                    jfa.m14425h(imageView);
                    jfa.m14429l(textView2);
                    textView2.setText(String.format("%dx", Arrays.copyOf(new Object[]{Integer.valueOf(streakActivityLevelView.f14282O)}, 1)));
                    textView2.setTextColor(d32.m10042h0(ss5.m21677B(streakActivityLevelView.f14283P)));
                }
                hvaVar.f43006c.setImageResource(ss5.m21727y(streakActivityLevelView.f14283P, true));
                jfa.m14429l(constraintLayout);
                jfa.m14425h(constraintLayout2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$5$7(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29468b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuFragment$onViewCreated$5$7(this.f29468b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuFragment$onViewCreated$5$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29467a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29468b;
            c18 c18Var = lessonReviewMenuFragment.m9345S0().f29378k1;
            C24211 c24211 = new C24211(lessonReviewMenuFragment, null);
            c18Var.getClass();
            this.f29467a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24211, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
