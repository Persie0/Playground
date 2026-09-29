package com.lingq.feature.reader.content;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.o23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$loadLesson$4", m4291f = "LessonContentStateHolder.kt", m4292l = {181}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$loadLesson$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27883c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$loadLesson$4(C2260a c2260a, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f27882b = c2260a;
        this.f27883c = str;
        this.f27884d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonContentStateHolder$loadLesson$4(this.f27882b, this.f27883c, this.f27884d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonContentStateHolder$loadLesson$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27881a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            o23 o23Var = this.f27882b.f27936b;
            this.f27881a = 1;
            if (((C1295k) o23Var.f53649a).m7303w(this.f27884d, this.f27883c, this) == coroutineSingletons) {
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
