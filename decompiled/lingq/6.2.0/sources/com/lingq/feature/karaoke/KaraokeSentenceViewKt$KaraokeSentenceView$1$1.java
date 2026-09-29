package com.lingq.feature.karaoke;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.lazy.C0127b;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.fs6;
import p000.iv4;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeSentenceViewKt$KaraokeSentenceView$1$1", m4291f = "KaraokeSentenceView.kt", m4292l = {53, 59, 68}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeSentenceViewKt$KaraokeSentenceView$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26216a;

    /* JADX INFO: renamed from: b */
    public int f26217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f26218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonTranslationSentence f26219d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0127b f26220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeSentenceViewKt$KaraokeSentenceView$1$1(List list, LessonTranslationSentence lessonTranslationSentence, C0127b c0127b, Continuation continuation) {
        super(2, continuation);
        this.f26218c = list;
        this.f26219d = lessonTranslationSentence;
        this.f26220e = c0127b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeSentenceViewKt$KaraokeSentenceView$1$1(this.f26218c, this.f26219d, this.f26220e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeSentenceViewKt$KaraokeSentenceView$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonTranslationSentence lessonTranslationSentence;
        int iIndexOf;
        Object next;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26217b;
        C0127b c0127b = this.f26220e;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = this.f26218c;
            if (!list.isEmpty() && (lessonTranslationSentence = this.f26219d) != null && (iIndexOf = list.indexOf(lessonTranslationSentence)) >= 0) {
                if (iIndexOf == 0 || iIndexOf == list.size() - 1) {
                    this.f26216a = iIndexOf;
                    this.f26217b = 1;
                    fs6 fs6Var = C0127b.f2435y;
                    if (c0127b.m976f(iIndexOf, 0, this) == coroutineSingletons) {
                    }
                } else {
                    Iterator it = c0127b.m980j().f42985k.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((iv4) next).f44648a != iIndexOf);
                    if (((iv4) next) == null) {
                        this.f26216a = iIndexOf;
                        this.f26217b = 2;
                        if (C0127b.m973l(c0127b, iIndexOf, this) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        if (i != 2) {
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iIndexOf = this.f26216a;
        AbstractC3193b.m15359b(obj);
        Iterator it2 = c0127b.m980j().f42985k.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((iv4) next2).f44648a != iIndexOf);
        iv4 iv4Var = (iv4) next2;
        if (iv4Var != null) {
            float fM13486g = ((iv4Var.f44663p / 2.0f) + iv4Var.f44662o) - (((int) (c0127b.m980j().m13486g() & 4294967295L)) / 2.0f);
            if (!c0127b.f2445j.mo863a()) {
                bg9 bg9VarM21698Y = ss5.m21698Y(0.75f, 200.0f, null, 4);
                this.f26216a = iIndexOf;
                this.f26217b = 3;
                if (AbstractC0095c.m831f(c0127b, fM13486g, bg9VarM21698Y, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }
}
