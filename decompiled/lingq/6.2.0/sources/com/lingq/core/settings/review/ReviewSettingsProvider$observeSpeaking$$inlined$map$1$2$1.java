package com.lingq.core.settings.review;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2", m4291f = "ReviewSettingsProvider.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23138a;

    /* JADX INFO: renamed from: b */
    public int f23139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f23140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f23140c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23138a = obj;
        this.f23139b |= Integer.MIN_VALUE;
        return this.f23140c.emit(null, this);
    }
}
