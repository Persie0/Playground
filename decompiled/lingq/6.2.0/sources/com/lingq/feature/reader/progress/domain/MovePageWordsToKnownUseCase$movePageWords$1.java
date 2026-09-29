package com.lingq.feature.reader.progress.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase", m4291f = "MovePageWordsToKnownUseCase.kt", m4292l = {90}, m4293m = "movePageWords", m4294v = 2)
final class MovePageWordsToKnownUseCase$movePageWords$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f29893a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2472b f29895c;

    /* JADX INFO: renamed from: d */
    public int f29896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovePageWordsToKnownUseCase$movePageWords$1(C2472b c2472b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29895c = c2472b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29894b = obj;
        this.f29896d |= Integer.MIN_VALUE;
        return this.f29895c.m9380d(null, 0, null, null, this);
    }
}
