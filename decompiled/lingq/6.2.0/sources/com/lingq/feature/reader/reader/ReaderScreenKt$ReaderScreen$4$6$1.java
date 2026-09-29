package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.hl7;
import p000.mr7;
import p000.nu7;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderScreen$4$6$1", m4291f = "ReaderScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderScreen$4$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hl7 f30176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f30177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f30178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderScreen$4$6$1(hl7 hl7Var, vi3 vi3Var, vi3 vi3Var2, Continuation continuation) {
        super(2, continuation);
        this.f30176a = hl7Var;
        this.f30177b = vi3Var;
        this.f30178c = vi3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderScreen$4$6$1(this.f30176a, this.f30177b, this.f30178c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderScreenKt$ReaderScreen$4$6$1 readerScreenKt$ReaderScreen$4$6$1 = (ReaderScreenKt$ReaderScreen$4$6$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerScreenKt$ReaderScreen$4$6$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f30176a.f42582c) {
            this.f30177b.invoke(mr7.f51769a);
            this.f30178c.invoke(nu7.f53260a);
        }
        return xfa.f68157a;
    }
}
