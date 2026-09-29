package com.lingq.feature.review.activities;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Translation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.lda;
import p000.nn1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleViewModel$loadTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2749d f32267b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27391 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32268a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2749d f32269b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f32270c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f32271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27391(C2749d c2749d, int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f32269b = c2749d;
            this.f32270c = i;
            this.f32271d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27391 c27391 = new C27391(this.f32269b, this.f32270c, this.f32271d, continuation);
            c27391.f32268a = obj;
            return c27391;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27391 c27391 = (C27391) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27391.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            Translation translation;
            String str;
            String lowerCase;
            C2749d c2749d = this.f32269b;
            nn1 nn1Var = c2749d.f32354f;
            int i = c2749d.f32355g;
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f32268a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int i2 = this.f32270c;
            if (lessonTranslationSentence != null) {
                HashSet hashSetM19788r = AbstractC3489q9.m19788r("zh-cn", "zh-t", "zh-tw", "zh");
                Iterator it = lessonTranslationSentence.f19297f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    translation = (Translation) next;
                    Locale locale = Locale.ROOT;
                    str = this.f32271d;
                    lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                } while (!(hashSetM19788r.contains(lowerCase) ? hashSetM19788r.contains(translation.f19335b) : fa4.m11650l(translation.f19335b, str)));
                Translation translation2 = (Translation) next;
                if (translation2 != null) {
                    String str2 = translation2.f19334a;
                    if (str2.length() > 0) {
                        C3244l c3244l = c2749d.f32359k;
                        c3244l.getClass();
                        c3244l.m15572j(null, str2);
                    } else {
                        AbstractC1263a.m7047b(lda.m16103C(c2749d), nn1Var, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(c2749d, i, i2, null));
                    }
                } else {
                    AbstractC1263a.m7047b(lda.m16103C(c2749d), nn1Var, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(c2749d, i, i2, null));
                }
            } else {
                AbstractC1263a.m7047b(lda.m16103C(c2749d), nn1Var, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(c2749d, i, i2, null));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$loadTranslation$1(C2749d c2749d, Continuation continuation) {
        super(2, continuation);
        this.f32267b = c2749d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleViewModel$loadTranslation$1(this.f32267b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleViewModel$loadTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32266a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2749d c2749d = this.f32267b;
            int i2 = c2749d.f32356h - 1;
            String strMo4580K1 = c2749d.f32350b.mo4580K1();
            c83 c83VarM7253K = ((C1295k) c2749d.f32351c).m7253K(c2749d.f32355g, i2);
            C27391 c27391 = new C27391(c2749d, i2, strMo4580K1, null);
            this.f32266a = 1;
            if (AbstractC3224d.m15529h(c83VarM7253K, c27391, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
