package com.lingq.core.player.tts;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {314, 316, 322}, m4293m = "localSpeak", m4294v = 2)
final class TtsControllerImpl$localSpeak$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22063a;

    /* JADX INFO: renamed from: b */
    public String f22064b;

    /* JADX INFO: renamed from: c */
    public C1819c f22065c;

    /* JADX INFO: renamed from: d */
    public float f22066d;

    /* JADX INFO: renamed from: e */
    public boolean f22067e;

    /* JADX INFO: renamed from: f */
    public boolean f22068f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f22069g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1819c f22070h;

    /* JADX INFO: renamed from: i */
    public int f22071i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$localSpeak$1(C1819c c1819c, Continuation continuation) {
        super(continuation);
        this.f22070h = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22069g = obj;
        this.f22071i |= Integer.MIN_VALUE;
        return this.f22070h.m8489j(null, 0.0f, false, this);
    }
}
