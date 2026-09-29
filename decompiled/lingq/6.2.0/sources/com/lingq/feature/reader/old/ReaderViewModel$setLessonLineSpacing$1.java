package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setLessonLineSpacing$1", m4291f = "ReaderViewModel.kt", m4292l = {2838}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setLessonLineSpacing$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f29034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f29035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setLessonLineSpacing$1(double d, C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29034b = d;
        this.f29035c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setLessonLineSpacing$1(this.f29034b, this.f29035c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$setLessonLineSpacing$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29033a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f29035c.f29271E;
            this.f29033a = 1;
            if (((C1368a) si7Var).m7856O(this.f29034b, this) == coroutineSingletons) {
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
