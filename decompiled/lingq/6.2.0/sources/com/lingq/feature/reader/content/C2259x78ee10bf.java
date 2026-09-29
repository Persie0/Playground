package com.lingq.feature.reader.content;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.LessonContentStateHolder$startStoredReaderModeObserver$1$invokeSuspend$$inlined$filter$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$startStoredReaderModeObserver$1$invokeSuspend$$inlined$filter$1$2", m4291f = "LessonContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2259x78ee10bf extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27932a;

    /* JADX INFO: renamed from: b */
    public int f27933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f27934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259x78ee10bf(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f27934c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27932a = obj;
        this.f27933b |= Integer.MIN_VALUE;
        return this.f27934c.emit(null, this);
    }
}
