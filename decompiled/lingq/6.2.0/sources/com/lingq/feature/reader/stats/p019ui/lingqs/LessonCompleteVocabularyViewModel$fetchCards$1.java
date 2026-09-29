package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.data.repository.C1295k;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchCards$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {211}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$fetchCards$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f31020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31022c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchCards$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchCards$1$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25651 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31023a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2568b f31024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25651(C2568b c2568b, Continuation continuation) {
            super(2, continuation);
            this.f31024b = c2568b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25651 c25651 = new C25651(this.f31024b, continuation);
            c25651.f31023a = obj;
            return c25651;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25651 c25651 = (C25651) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25651.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31023a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31024b.f31071r.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$fetchCards$1(C2568b c2568b, int i, Continuation continuation) {
        super(1, continuation);
        this.f31021b = c2568b;
        this.f31022c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$fetchCards$1(this.f31021b, this.f31022c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonCompleteVocabularyViewModel$fetchCards$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31020a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31021b;
            c83 c83VarM7252J = ((C1295k) c2568b.f31058e).m7252J(this.f31022c);
            C25651 c25651 = new C25651(c2568b, null);
            this.f31020a = 1;
            if (AbstractC3224d.m15529h(c83VarM7252J, c25651, this) == coroutineSingletons) {
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
