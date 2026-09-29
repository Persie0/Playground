package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Translation;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.fa4;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$fetchTranslation$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1309}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$fetchTranslation$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28655c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$fetchTranslation$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$fetchTranslation$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23661 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28656a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2411m f28657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23661(C2411m c2411m, Continuation continuation) {
            super(2, continuation);
            this.f28657b = c2411m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23661 c23661 = new C23661(this.f28657b, continuation);
            c23661.f28656a = obj;
            return c23661;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23661 c23661 = (C23661) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23661.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2411m c2411m;
            Object next;
            Object value;
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f28656a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (lessonTranslationSentence != null) {
                Iterator it = lessonTranslationSentence.f19297f.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    c2411m = this.f28657b;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fa4.m11650l(((Translation) next).f19335b, c2411m.f29223b.mo4580K1()));
                Translation translation = (Translation) next;
                if (translation != null) {
                    C3244l c3244l = c2411m.f29224b0;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, translation.f19334a));
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$fetchTranslation$1(C2411m c2411m, int i, Continuation continuation) {
        super(1, continuation);
        this.f28654b = c2411m;
        this.f28655c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderPageViewModel$fetchTranslation$1(this.f28654b, this.f28655c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderPageViewModel$fetchTranslation$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28653a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28654b;
            d65 d65Var = c2411m.f29233g;
            c83 c83VarM7253K = ((C1295k) d65Var).m7253K(this.f28655c, c2411m.f29249q);
            C23661 c23661 = new C23661(c2411m, null);
            this.f28653a = 1;
            if (AbstractC3224d.m15529h(c83VarM7253K, c23661, this) == coroutineSingletons) {
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
