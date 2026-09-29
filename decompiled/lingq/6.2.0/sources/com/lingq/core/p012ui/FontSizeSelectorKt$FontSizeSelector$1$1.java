package com.lingq.core.p012ui;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.qc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.FontSizeSelectorKt$FontSizeSelector$1$1", m4291f = "FontSizeSelector.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FontSizeSelectorKt$FontSizeSelector$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f23942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f23943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qc9 f23944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontSizeSelectorKt$FontSizeSelector$1$1(List list, int i, qc9 qc9Var, Continuation continuation) {
        super(2, continuation);
        this.f23942a = list;
        this.f23943b = i;
        this.f23944c = qc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FontSizeSelectorKt$FontSizeSelector$1$1(this.f23942a, this.f23943b, this.f23944c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FontSizeSelectorKt$FontSizeSelector$1$1 fontSizeSelectorKt$FontSizeSelector$1$1 = (FontSizeSelectorKt$FontSizeSelector$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fontSizeSelectorKt$FontSizeSelector$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f23944c.m19862i(this.f23942a.indexOf(new Integer(this.f23943b)));
        return xfa.f68157a;
    }
}
