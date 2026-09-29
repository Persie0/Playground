package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonFurigana;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenFurigana;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentenceTokens$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {135}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$fetchSentenceTokens$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32200b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(this.f32200b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$fetchSentenceTokens$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7298r;
        List list;
        LessonFurigana lessonFurigana;
        LessonFurigana lessonFurigana2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32199a;
        C2748c c2748c = this.f32200b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = c2748c.f32331d;
            int i2 = c2748c.f32338k;
            int i3 = c2748c.f32339l;
            this.f32199a = 1;
            objM7298r = ((C1295k) d65Var).m7298r(i2, i3, this);
            if (objM7298r == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7298r = obj;
        }
        LessonSentence lessonSentence = (LessonSentence) objM7298r;
        if (lessonSentence != null && (list = lessonSentence.f19253a) != null) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i4 = 0;
            int i5 = 0;
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                LessonTextToken lessonTextToken = (LessonTextToken) it.next();
                String str = lessonTextToken.f19277a;
                if (str != null) {
                    int length = str.length() + i4;
                    sb.append(lessonTextToken.f19277a);
                    i4 = length;
                } else if (lessonTextToken.f19278b != null) {
                    i4++;
                    i5++;
                    sb.append(" ");
                    sb2.append(" ");
                } else {
                    String str2 = lessonTextToken.f19286j;
                    if (str2 != null) {
                        int length2 = str2.length() + i4;
                        int length3 = str2.length() + i5;
                        int i6 = lessonTextToken.f19283g;
                        int i7 = c2748c.f32339l;
                        int i8 = lessonTextToken.f19284h;
                        LessonTransliteration lessonTransliteration = lessonTextToken.f19282f;
                        int i9 = i4;
                        arrayList.add(new xz7(i9, length2, i5, length3, str2, i6, i7, i8, "", new TokenTransliteration(lessonTransliteration != null ? lessonTransliteration.f19299a : null, lessonTransliteration != null ? lessonTransliteration.f19300b : null, lessonTransliteration != null ? lessonTransliteration.f19301c : null, lessonTransliteration != null ? lessonTransliteration.f19302d : null, lessonTransliteration != null ? lessonTransliteration.f19303e : null, lessonTransliteration != null ? lessonTransliteration.f19304f : null, new TokenFurigana((lessonTransliteration == null || (lessonFurigana2 = lessonTransliteration.f19305g) == null) ? null : lessonFurigana2.f19229a, (lessonTransliteration == null || (lessonFurigana = lessonTransliteration.f19305g) == null) ? null : lessonFurigana.f19230b), lessonTransliteration != null ? lessonTransliteration.f19306h : null), TextTokenType.WORD, lessonTextToken.f19289m, (Map) null, (String) null, (String) null, (String) null, 258048));
                        int length4 = str2.length() + i9;
                        int length5 = str2.length() + i5;
                        sb.append(str2);
                        sb2.append(str2);
                        i4 = length4;
                        i5 = length5;
                    }
                }
            }
            c2748c.f32347t = sb2.toString();
            C3244l c3244l = c2748c.f32342o;
            String string = sb.toString();
            c3244l.getClass();
            c3244l.m15572j(null, string);
            C3244l c3244l2 = c2748c.f32341n;
            List listM22622n1 = u91.m22622n1(arrayList);
            c3244l2.getClass();
            c3244l2.m15572j(null, listM22622n1);
        }
        return xfa.f68157a;
    }
}
