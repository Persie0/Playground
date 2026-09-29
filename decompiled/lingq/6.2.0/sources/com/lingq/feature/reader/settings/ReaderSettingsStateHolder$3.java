package com.lingq.feature.reader.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.nz9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.settings.ReaderSettingsStateHolder$3", m4291f = "ReaderSettingsStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsStateHolder$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2507a f30369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsStateHolder$3(C2507a c2507a, Continuation continuation) {
        super(2, continuation);
        this.f30369b = c2507a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderSettingsStateHolder$3 readerSettingsStateHolder$3 = new ReaderSettingsStateHolder$3(this.f30369b, continuation);
        readerSettingsStateHolder$3.f30368a = obj;
        return readerSettingsStateHolder$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderSettingsStateHolder$3 readerSettingsStateHolder$3 = (ReaderSettingsStateHolder$3) create((nz9) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerSettingsStateHolder$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nz9 nz9Var = (nz9) this.f30368a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30369b.f30379c.m15571i(nz9Var);
        return xfa.f68157a;
    }
}
