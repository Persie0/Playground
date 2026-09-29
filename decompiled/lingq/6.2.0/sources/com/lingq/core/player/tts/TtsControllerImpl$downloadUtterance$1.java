package com.lingq.core.player.tts;

import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl", m4291f = "TtsController.kt", m4292l = {251}, m4293m = "downloadUtterance", m4294v = 2)
final class TtsControllerImpl$downloadUtterance$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public File f22029a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1819c f22031c;

    /* JADX INFO: renamed from: d */
    public int f22032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$downloadUtterance$1(C1819c c1819c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22031c = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22030b = obj;
        this.f22032d |= Integer.MIN_VALUE;
        return C1819c.m8476a(this.f22031c, null, this);
    }
}
