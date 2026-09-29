package com.lingq.core.player.tts;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$fetchUtterance$3", m4291f = "TtsController.kt", m4292l = {417, 432}, m4293m = "emit", m4294v = 2)
final class TtsControllerImpl$fetchUtterance$3$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1818b f22056b;

    /* JADX INFO: renamed from: c */
    public int f22057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchUtterance$3$emit$1(C1818b c1818b, Continuation continuation) {
        super(continuation);
        this.f22056b = c1818b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22055a = obj;
        this.f22057c |= Integer.MIN_VALUE;
        return this.f22056b.emit(null, this);
    }
}
