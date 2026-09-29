package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.cl9;
import p000.e65;
import p000.fa4;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$3", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {348}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityFlashcardFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31936b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$3$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26401(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31938b = reviewActivityFlashcardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26401 c26401 = new C26401(this.f31938b, continuation);
            c26401.f31937a = obj;
            return c26401;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26401 c26401 = (C26401) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26401.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Pair pair = (Pair) this.f31937a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str2 = (String) pair.f47623a;
            LessonCard lessonCard = (LessonCard) pair.f47624b;
            if (lessonCard != null) {
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31938b;
                String strMo4589b2 = reviewActivityFlashcardFragment.m9537S0().f32506b.mo4589b2();
                String str3 = "";
                if (fa4.m11650l(strMo4589b2, LanguageLearn.Mandarin.getCode())) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = "Pinyin".toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase.equals(lowerCase2)) {
                        LessonTransliteration lessonTransliterationM8041i = lessonCard.m8041i();
                        if (lessonTransliterationM8041i != null) {
                            str = lessonTransliterationM8041i.f19301c;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else if (e65.m10891w("Traditional", lowerCase, locale)) {
                        LessonTransliteration lessonTransliterationM8041i2 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i2 != null) {
                            str = lessonTransliterationM8041i2.f19302d;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else {
                        e65.m10891w("Off", lowerCase, locale);
                    }
                } else if (fa4.m11650l(strMo4589b2, LanguageLearn.ChineseTraditional.getCode())) {
                    Locale locale2 = Locale.ROOT;
                    String lowerCase3 = str2.toLowerCase(locale2);
                    lowerCase3.getClass();
                    String lowerCase4 = "Pinyin".toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (lowerCase3.equals(lowerCase4)) {
                        LessonTransliteration lessonTransliterationM8041i3 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i3 != null) {
                            str = lessonTransliterationM8041i3.f19301c;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else if (e65.m10891w("Simplified", lowerCase3, locale2)) {
                        LessonTransliteration lessonTransliterationM8041i4 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i4 != null) {
                            str = lessonTransliterationM8041i4.f19303e;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else {
                        e65.m10891w("Off", lowerCase3, locale2);
                    }
                } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Japanese.getCode())) {
                    Locale locale3 = Locale.ROOT;
                    String lowerCase5 = str2.toLowerCase(locale3);
                    lowerCase5.getClass();
                    String lowerCase6 = "Romaji".toLowerCase(locale3);
                    lowerCase6.getClass();
                    if (lowerCase5.equals(lowerCase6)) {
                        LessonTransliteration lessonTransliterationM8041i5 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i5 != null) {
                            str = lessonTransliterationM8041i5.f19300b;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else if (e65.m10891w("Hiragana", lowerCase5, locale3) || e65.m10891w("Furigana", lowerCase5, locale3)) {
                        LessonTransliteration lessonTransliterationM8041i6 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i6 != null) {
                            str = lessonTransliterationM8041i6.f19299a;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else {
                        e65.m10891w("Off", lowerCase5, locale3);
                    }
                } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Cantonese.getCode())) {
                    Locale locale4 = Locale.ROOT;
                    String lowerCase7 = str2.toLowerCase(locale4);
                    lowerCase7.getClass();
                    String lowerCase8 = "Jyutping".toLowerCase(locale4);
                    lowerCase8.getClass();
                    if (lowerCase7.equals(lowerCase8)) {
                        LessonTransliteration lessonTransliterationM8041i7 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i7 != null) {
                            str = lessonTransliterationM8041i7.f19304f;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else if (e65.m10891w("Simplified", lowerCase7, locale4)) {
                        LessonTransliteration lessonTransliterationM8041i8 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i8 != null) {
                            str = lessonTransliterationM8041i8.f19303e;
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                    } else {
                        e65.m10891w("Off", lowerCase7, locale4);
                    }
                } else if (AbstractC3184kh.m15230y(reviewActivityFlashcardFragment.m9539U0().f32369b.mo4589b2()) && !cl9.m4834Q(str2, "off", true)) {
                    LessonTransliteration lessonTransliterationM8041i9 = lessonCard.m8041i();
                    if (lessonTransliterationM8041i9 != null) {
                        str3 = lessonTransliterationM8041i9.f19306h;
                    } else {
                        str3 = null;
                    }
                }
                reviewActivityFlashcardFragment.m9536R0().f8455c.setText(str3);
                if (str3 == null || str3.length() == 0) {
                    jfa.m14425h(reviewActivityFlashcardFragment.m9536R0().f8455c);
                } else {
                    jfa.m14429l(reviewActivityFlashcardFragment.m9536R0().f8455c);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$3(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
        super(2, continuation);
        this.f31936b = reviewActivityFlashcardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$3(this.f31936b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31935a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31936b;
            c18 c18Var = reviewActivityFlashcardFragment.m9539U0().f32363A;
            C26401 c26401 = new C26401(reviewActivityFlashcardFragment, null);
            c18Var.getClass();
            this.f31935a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26401, this) == coroutineSingletons) {
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
