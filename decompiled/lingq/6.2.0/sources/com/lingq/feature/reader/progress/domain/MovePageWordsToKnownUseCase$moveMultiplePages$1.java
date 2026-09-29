package com.lingq.feature.reader.progress.domain;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase", m4291f = "MovePageWordsToKnownUseCase.kt", m4292l = {74, 77}, m4293m = "moveMultiplePages", m4294v = 2)
final class MovePageWordsToKnownUseCase$moveMultiplePages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f29884a;

    /* JADX INFO: renamed from: b */
    public String f29885b;

    /* JADX INFO: renamed from: c */
    public Iterator f29886c;

    /* JADX INFO: renamed from: d */
    public int f29887d;

    /* JADX INFO: renamed from: e */
    public int f29888e;

    /* JADX INFO: renamed from: f */
    public int f29889f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f29890g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2472b f29891h;

    /* JADX INFO: renamed from: i */
    public int f29892i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovePageWordsToKnownUseCase$moveMultiplePages$1(C2472b c2472b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29891h = c2472b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29890g = obj;
        this.f29892i |= Integer.MIN_VALUE;
        return this.f29891h.m9379c(0, null, null, null, this);
    }
}
