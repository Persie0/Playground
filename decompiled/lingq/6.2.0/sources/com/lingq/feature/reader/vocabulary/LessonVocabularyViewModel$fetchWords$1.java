package com.lingq.feature.reader.vocabulary;

import com.lingq.core.data.repository.C1310z;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.eo1;
import p000.i93;
import p000.o7b;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchWords$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {300}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$fetchWords$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f31622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31623b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31624c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchWords$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchWords$1$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26091 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31625a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31626b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26091(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31626b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26091 c26091 = new C26091(this.f31626b, continuation);
            c26091.f31625a = obj;
            return c26091;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26091 c26091 = (C26091) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26091.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31625a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31626b.f31672r.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$fetchWords$1(C2610a c2610a, int i, Continuation continuation) {
        super(1, continuation);
        this.f31623b = c2610a;
        this.f31624c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonVocabularyViewModel$fetchWords$1(this.f31623b, this.f31624c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonVocabularyViewModel$fetchWords$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31622a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31623b;
            o7b o7bVar = ((C1310z) c2610a.f31659e).f16576a;
            i93 i93VarM21590A = AbstractC3584sr.m21590A(o7bVar.f53957K, true, new String[]{"WordEntity", "LessonsAndWordsJoin"}, new eo1(this.f31624c, o7bVar, 3));
            C26091 c26091 = new C26091(c2610a, null);
            this.f31622a = 1;
            if (AbstractC3224d.m15529h(i93VarM21590A, c26091, this) == coroutineSingletons) {
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
