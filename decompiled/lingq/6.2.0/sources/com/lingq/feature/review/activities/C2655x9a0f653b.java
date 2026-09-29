package com.lingq.feature.review.activities;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$1$invokeSuspend$$inlined$filterNot$1$2", m4291f = "ReviewActivityMatchingFragment.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2655x9a0f653b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31986a;

    /* JADX INFO: renamed from: b */
    public int f31987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f31988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2655x9a0f653b(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f31988c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31986a = obj;
        this.f31987b |= Integer.MIN_VALUE;
        return this.f31988c.emit(null, this);
    }
}
