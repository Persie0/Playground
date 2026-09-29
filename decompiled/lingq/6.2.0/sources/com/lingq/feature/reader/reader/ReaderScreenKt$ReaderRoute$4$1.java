package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.token.C1909e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bs7;
import p000.c32;
import p000.dh9;
import p000.f2a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderRoute$4$1", m4291f = "ReaderScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderRoute$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TokenRelatedPhrase f30162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f30164c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dh9 f30165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderRoute$4$1(TokenRelatedPhrase tokenRelatedPhrase, C2493a c2493a, C1909e c1909e, dh9 dh9Var, Continuation continuation) {
        super(2, continuation);
        this.f30162a = tokenRelatedPhrase;
        this.f30163b = c2493a;
        this.f30164c = c1909e;
        this.f30165d = dh9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderRoute$4$1(this.f30162a, this.f30163b, this.f30164c, this.f30165d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderScreenKt$ReaderRoute$4$1 readerScreenKt$ReaderRoute$4$1 = (ReaderScreenKt$ReaderRoute$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerScreenKt$ReaderRoute$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        TokenRelatedPhrase tokenRelatedPhrase = this.f30162a;
        if (tokenRelatedPhrase != null) {
            if (((Boolean) this.f30165d.getValue()).booleanValue()) {
                this.f30163b.m9389V2(new bs7(tokenRelatedPhrase, false));
            }
            this.f30164c.m8760d3(f2a.f38314a);
        }
        return xfa.f68157a;
    }
}
