package com.lingq.core.player.tts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {656}, m4293m = "startTimer", m4294v = 2)
final class TtsControllerImpl$startTimer$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22137a;

    /* JADX INFO: renamed from: b */
    public boolean f22138b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22139c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1819c f22140d;

    /* JADX INFO: renamed from: e */
    public int f22141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$startTimer$1(C1819c c1819c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22140d = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22139c = obj;
        this.f22141e |= Integer.MIN_VALUE;
        return C1819c.m8481g(this.f22140d, null, false, this);
    }
}
