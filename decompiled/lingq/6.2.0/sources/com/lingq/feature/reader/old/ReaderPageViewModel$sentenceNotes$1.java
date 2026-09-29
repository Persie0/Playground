package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Note;
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
import p000.u91;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$sentenceNotes$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1354}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$sentenceNotes$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28692b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28693c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$sentenceNotes$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$sentenceNotes$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23681 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2411m f28695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23681(C2411m c2411m, Continuation continuation) {
            super(2, continuation);
            this.f28695b = c2411m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23681 c23681 = new C23681(this.f28695b, continuation);
            c23681.f28694a = obj;
            return c23681;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23681 c23681 = (C23681) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23681.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f28694a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (lessonTranslationSentence != null) {
                C3244l c3244l = this.f28695b.f29228d0;
                Note note = (Note) u91.m22591I0(lessonTranslationSentence.f19298g);
                if (note == null || (str = note.f19333b) == null) {
                    str = "";
                }
                c3244l.getClass();
                c3244l.m15572j(null, str);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$sentenceNotes$1(C2411m c2411m, int i, Continuation continuation) {
        super(1, continuation);
        this.f28692b = c2411m;
        this.f28693c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderPageViewModel$sentenceNotes$1(this.f28692b, this.f28693c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderPageViewModel$sentenceNotes$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28691a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28692b;
            d65 d65Var = c2411m.f29233g;
            c83 c83VarM7253K = ((C1295k) d65Var).m7253K(this.f28693c, c2411m.f29249q);
            C23681 c23681 = new C23681(c2411m, null);
            this.f28691a = 1;
            if (AbstractC3224d.m15529h(c83VarM7253K, c23681, this) == coroutineSingletons) {
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
