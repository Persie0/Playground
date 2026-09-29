package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoProgressForSaving$$inlined$filter$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoProgressForSaving$$inlined$filter$1$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2580xf215e7d6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31249a;

    /* JADX INFO: renamed from: b */
    public int f31250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f31251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2580xf215e7d6(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f31251c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31249a = obj;
        this.f31250b |= Integer.MIN_VALUE;
        return this.f31251c.emit(null, this);
    }
}
