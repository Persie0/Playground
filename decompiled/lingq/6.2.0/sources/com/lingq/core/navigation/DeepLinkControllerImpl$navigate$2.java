package com.lingq.core.navigation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.hf6;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.navigation.DeepLinkControllerImpl", m4291f = "DeepLinkController.kt", m4292l = {310}, m4293m = "navigate", m4294v = 2)
final class DeepLinkControllerImpl$navigate$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public hf6 f20253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1552a f20255c;

    /* JADX INFO: renamed from: d */
    public int f20256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$navigate$2(C1552a c1552a, Continuation continuation) {
        super(continuation);
        this.f20255c = c1552a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20254b = obj;
        this.f20256d |= Integer.MIN_VALUE;
        return this.f20255c.mo8242M2(null, 0L, this);
    }
}
