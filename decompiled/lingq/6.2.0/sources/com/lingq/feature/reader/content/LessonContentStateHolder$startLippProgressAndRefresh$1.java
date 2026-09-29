package com.lingq.feature.reader.content;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.jq7;
import p000.qe5;
import p000.un1;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startLippProgressAndRefresh$1", m4291f = "LessonContentStateHolder.kt", m4292l = {296, 297}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$startLippProgressAndRefresh$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public float f27923a;

    /* JADX INFO: renamed from: b */
    public int f27924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2260a f27925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27926d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f27927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$startLippProgressAndRefresh$1(C2260a c2260a, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f27925c = c2260a;
        this.f27926d = str;
        this.f27927e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonContentStateHolder$startLippProgressAndRefresh$1(this.f27925c, this.f27926d, this.f27927e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonContentStateHolder$startLippProgressAndRefresh$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (com.lingq.feature.reader.content.C2260a.m9248a(r1, r33.f27926d, r33.f27927e, r33) == r3) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        Object value;
        float f2;
        C2260a c2260a = this.f27925c;
        C3244l c3244l = c2260a.f27949o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27924b;
        if (i != 0) {
            if (i == 1) {
                f2 = this.f27923a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        qe5 qe5Var = ((yz4) c3244l.getValue()).f70678l;
        float f3 = qe5Var.f57650b;
        if (f3 != 0.0f || qe5Var.f57649a) {
            int iMo14353c = jq7.f46011b.mo14353c(5, 10) + ((int) f3);
            f = iMo14353c < 95 ? iMo14353c : qe5Var.f57650b;
        } else {
            f = 5.0f;
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, new qe5(f, true), null, 0, 0, false, null, null, false, false, null, 0, false, 8386559)));
        long jMo14353c = jq7.f46011b.mo14353c(500, 1500);
        this.f27923a = f;
        this.f27924b = 1;
        if (AbstractC3208a.m15437d(jMo14353c, this) != coroutineSingletons) {
            f2 = f;
        }
        return coroutineSingletons;
        this.f27923a = f2;
        this.f27924b = 2;
    }
}
