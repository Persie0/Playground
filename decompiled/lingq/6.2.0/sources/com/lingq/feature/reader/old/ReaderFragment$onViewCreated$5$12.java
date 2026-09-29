package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.reader.R$string;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.fr5;
import p000.gm5;
import p000.iw7;
import p000.jw7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$12", m4291f = "ReaderFragment.kt", m4292l = {915}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28264b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$12$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$12$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22791 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28265a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22791(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28266b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22791 c22791 = new C22791(this.f28266b, continuation);
            c22791.f28265a = obj;
            return c22791;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22791 c22791 = (C22791) create((LessonProcessingStatus) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22791.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair;
            LessonProcessingStatus lessonProcessingStatus = (LessonProcessingStatus) this.f28265a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            switch (jw7.f46319a[lessonProcessingStatus.ordinal()]) {
                case 1:
                    pair = new Pair(new Integer(R$string.lesson_simplify), new Integer(R$string.lesson_simplify_not_simplified));
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    pair = new Pair(new Integer(R$string.lesson_import_progress), new Integer(R$string.lesson_import_progress_desc));
                    break;
                case 8:
                    pair = new Pair(new Integer(R$string.lesson_import_error), new Integer(R$string.lesson_import_error_desc));
                    break;
                case 9:
                    pair = new Pair(new Integer(R$string.lesson_import_progress), new Integer(R$string.lesson_import_progress_desc));
                    break;
                case 10:
                    pair = new Pair(new Integer(R$string.lesson_import_error), new Integer(R$string.lesson_import_error));
                    break;
                case 11:
                    pair = new Pair(new Integer(R$string.lesson_generating), new Integer(R$string.lesson_generating_message));
                    break;
                default:
                    gm5.m12750e();
                    return null;
            }
            int iIntValue = ((Number) pair.f47623a).intValue();
            int iIntValue2 = ((Number) pair.f47624b).intValue();
            ReaderFragment readerFragment = this.f28266b;
            fr5 fr5Var = new fr5(readerFragment.m2090R(), 0);
            fr5Var.m12028k(iIntValue);
            fr5Var.f71376a.f65205c = lessonProcessingStatus == LessonProcessingStatus.ERROR ? R$drawable.ic_error : com.lingq.feature.reader.R$drawable.ic_lesson_generating;
            fr5Var.m12020c(iIntValue2);
            fr5 fr5VarM12025h = fr5Var.m12025h(R$string.complete_back_library, new iw7(0, readerFragment));
            fr5VarM12025h.f71376a.f65216n = false;
            fr5VarM12025h.m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$12(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28264b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$12(this.f28264b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28263a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28264b;
            du0 du0Var = readerFragment.m9290W0().f29329X0;
            C22791 c22791 = new C22791(readerFragment, null);
            this.f28263a = 1;
            if (AbstractC3224d.m15529h(du0Var, c22791, this) == coroutineSingletons) {
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
