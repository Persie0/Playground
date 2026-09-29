package com.lingq.core.settings.review;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.ag8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$4$2", m4291f = "ReviewSettingsViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23150a;

    /* JADX INFO: renamed from: b */
    public int f23151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ag8 f23152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1(ag8 ag8Var, Continuation continuation) {
        super(continuation);
        this.f23152c = ag8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23150a = obj;
        this.f23151b |= Integer.MIN_VALUE;
        return this.f23152c.emit(null, this);
    }
}
