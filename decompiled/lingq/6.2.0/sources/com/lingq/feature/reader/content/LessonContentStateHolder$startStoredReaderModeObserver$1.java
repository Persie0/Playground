package com.lingq.feature.reader.content;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3226f;
import p000.C3386nv;
import p000.C3502ql;
import p000.C3602t8;
import p000.c32;
import p000.c83;
import p000.jj2;
import p000.kr1;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startStoredReaderModeObserver$1", m4291f = "LessonContentStateHolder.kt", m4292l = {455}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$startStoredReaderModeObserver$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderBookmarkMode f27931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$startStoredReaderModeObserver$1(C2260a c2260a, int i, ReaderBookmarkMode readerBookmarkMode, Continuation continuation) {
        super(2, continuation);
        this.f27929b = c2260a;
        this.f27930c = i;
        this.f27931d = readerBookmarkMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonContentStateHolder$startStoredReaderModeObserver$1(this.f27929b, this.f27930c, this.f27931d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonContentStateHolder$startStoredReaderModeObserver$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27928a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2260a c2260a = this.f27929b;
        c83 c83Var = ((C1371d) ((vma) c2260a.f27945k.f65802b)).f18584u;
        int i3 = this.f27930c;
        c83 c83VarM15536o = AbstractC3224d.m15536o(new jj2(c83Var, i3, 3));
        ReaderBookmarkMode readerBookmarkMode = this.f27931d;
        kr1 kr1Var = new kr1(c2260a, i3, readerBookmarkMode, i2);
        this.f27928a = 1;
        Object objCollect = c83VarM15536o.collect(new C3226f(new Ref$IntRef(), new C3502ql(new C3602t8(7, kr1Var, readerBookmarkMode), 7)), this);
        if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
