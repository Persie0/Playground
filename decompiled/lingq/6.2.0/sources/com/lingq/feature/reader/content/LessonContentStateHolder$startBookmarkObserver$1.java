package com.lingq.feature.reader.content;

import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.d51;
import p000.fi2;
import p000.lda;
import p000.un1;
import p000.xfa;
import p000.yu4;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startBookmarkObserver$1", m4291f = "LessonContentStateHolder.kt", m4292l = {417}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$startBookmarkObserver$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27918c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.content.LessonContentStateHolder$startBookmarkObserver$1$2 */
    @c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startBookmarkObserver$1$2", m4291f = "LessonContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22572 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ LessonBookmark f27919a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2260a f27920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22572(C2260a c2260a, Continuation continuation) {
            super(3, continuation);
            this.f27920b = c2260a;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            ((Boolean) obj2).getClass();
            C22572 c22572 = new C22572(this.f27920b, (Continuation) obj3);
            c22572.f27919a = (LessonBookmark) obj;
            xfa xfaVar = xfa.f68157a;
            c22572.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonBookmark lessonBookmark = this.f27919a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2260a c2260a = this.f27920b;
            c2260a.f27955u = true;
            C3244l c3244l = c2260a.f27949o;
            List list = c2260a.f27954t;
            if (list == null) {
                list = ((yz4) c3244l.getValue()).f70670d;
            }
            if (list.isEmpty()) {
                while (true) {
                    Object value = c3244l.getValue();
                    C3244l c3244l2 = c3244l;
                    if (c3244l2.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, lessonBookmark, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388591))) {
                        break;
                    }
                    c3244l = c3244l2;
                }
            } else {
                c2260a.m9249b(list, lessonBookmark);
                c2260a.f27954t = null;
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.content.LessonContentStateHolder$startBookmarkObserver$1$3 */
    @c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startBookmarkObserver$1$3", m4291f = "LessonContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22583 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27921a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2260a f27922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22583(C2260a c2260a, Continuation continuation) {
            super(2, continuation);
            this.f27922b = c2260a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22583 c22583 = new C22583(this.f27922b, continuation);
            c22583.f27921a = obj;
            return c22583;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22583 c22583 = (C22583) create((LessonBookmark) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22583.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            LessonBookmark lessonBookmark = (LessonBookmark) this.f27921a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f27922b.f27949o;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, lessonBookmark, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388591)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$startBookmarkObserver$1(C2260a c2260a, int i, Continuation continuation) {
        super(2, continuation);
        this.f27917b = c2260a;
        this.f27918c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonContentStateHolder$startBookmarkObserver$1(this.f27917b, this.f27918c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonContentStateHolder$startBookmarkObserver$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fi2 fi2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27916a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2260a c2260a = this.f27917b;
            c83 c83VarM4513n = c2260a.f27944j.m4513n(this.f27918c);
            yu4 yu4Var = new yu4(10);
            lda.m16119e(2, yu4Var);
            if (c83VarM4513n instanceof fi2) {
                fi2Var = (fi2) c83VarM4513n;
                if (fi2Var.f39138b != yu4Var) {
                    fi2Var = new fi2(c83VarM4513n, yu4Var);
                }
            } else {
                fi2Var = new fi2(c83VarM4513n, yu4Var);
            }
            C22572 c22572 = new C22572(c2260a, null);
            C22583 c22583 = new C22583(c2260a, null);
            this.f27916a = 1;
            Object objCollect = fi2Var.collect(new d51(new Ref$BooleanRef(), c22583, c22572, 0), this);
            if (objCollect != coroutineSingletons) {
                objCollect = xfaVar;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
