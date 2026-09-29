package com.lingq.feature.reader.playback.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.domain.PlaySentenceUseCase", m4291f = "PlaySentenceUseCase.kt", m4292l = {18}, m4293m = "invoke", m4294v = 2)
final class PlaySentenceUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f29796a;

    /* JADX INFO: renamed from: b */
    public String f29797b;

    /* JADX INFO: renamed from: c */
    public float f29798c;

    /* JADX INFO: renamed from: d */
    public boolean f29799d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29800e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2467b f29801f;

    /* JADX INFO: renamed from: g */
    public int f29802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySentenceUseCase$invoke$1(C2467b c2467b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29801f = c2467b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29800e = obj;
        this.f29802g |= Integer.MIN_VALUE;
        return this.f29801f.m9369a(0, 0, null, 0.0f, false, this);
    }
}
