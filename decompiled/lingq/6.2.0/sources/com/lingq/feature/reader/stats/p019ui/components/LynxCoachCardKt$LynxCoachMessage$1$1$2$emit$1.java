package com.lingq.feature.reader.stats.p019ui.components;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.components.LynxCoachCardKt$LynxCoachMessage$1$1$2", m4291f = "LynxCoachCard.kt", m4292l = {389, 393}, m4293m = "emit", m4294v = 2)
final class LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f30984a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2557a f30986c;

    /* JADX INFO: renamed from: d */
    public int f30987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1(C2557a c2557a, Continuation continuation) {
        super(continuation);
        this.f30986c = c2557a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30985b = obj;
        this.f30987d |= Integer.MIN_VALUE;
        return this.f30986c.m9467a(0, this);
    }
}
