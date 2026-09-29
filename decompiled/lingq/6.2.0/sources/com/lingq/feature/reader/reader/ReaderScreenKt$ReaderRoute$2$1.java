package com.lingq.feature.reader.reader;

import com.lingq.core.token.C1909e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.as7;
import p000.c32;
import p000.n2a;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderRoute$2$1", m4291f = "ReaderScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderRoute$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f30145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f30147c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f30148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderRoute$2$1(C1909e c1909e, C2493a c2493a, boolean z, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f30145a = c1909e;
        this.f30146b = c2493a;
        this.f30147c = z;
        this.f30148d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderRoute$2$1(this.f30145a, this.f30146b, this.f30147c, this.f30148d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderScreenKt$ReaderRoute$2$1 readerScreenKt$ReaderRoute$2$1 = (ReaderScreenKt$ReaderRoute$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerScreenKt$ReaderRoute$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30145a.m8760d3(n2a.f52243a);
        this.f30146b.m9389V2(as7.f7429a);
        if (this.f30147c) {
            this.f30148d.setValue(SidePanelContent.Vocabulary);
        }
        return xfa.f68157a;
    }
}
