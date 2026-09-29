package com.lingq.feature.reader.vocabulary;

import com.lingq.core.data.repository.C1287c;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.on0;
import p000.un0;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchCards$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {289}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$fetchCards$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f31603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31605c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchCards$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchCards$1$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26061 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31606a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26061(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31607b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26061 c26061 = new C26061(this.f31607b, continuation);
            c26061.f31606a = obj;
            return c26061;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26061 c26061 = (C26061) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26061.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31606a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31607b.f31671q.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$fetchCards$1(C2610a c2610a, int i, Continuation continuation) {
        super(1, continuation);
        this.f31604b = c2610a;
        this.f31605c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonVocabularyViewModel$fetchCards$1(this.f31604b, this.f31605c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonVocabularyViewModel$fetchCards$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31603a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31604b;
            un0 un0Var = ((C1287c) c2610a.f31658d).f16453b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity", "LessonsAndCardsJoin"}, new on0(this.f31605c, un0Var, 1)));
            C26061 c26061 = new C26061(c2610a, null);
            this.f31603a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c26061, this) == coroutineSingletons) {
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
