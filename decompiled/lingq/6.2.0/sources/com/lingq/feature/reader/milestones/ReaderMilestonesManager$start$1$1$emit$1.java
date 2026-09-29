package com.lingq.feature.reader.milestones;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.go3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.ReaderMilestonesManager$start$1$1", m4291f = "ReaderMilestonesManager.kt", m4292l = {42, 49}, m4293m = "emit", m4294v = 2)
final class ReaderMilestonesManager$start$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public go3 f28158a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2267a f28160c;

    /* JADX INFO: renamed from: d */
    public int f28161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderMilestonesManager$start$1$1$emit$1(C2267a c2267a, Continuation continuation) {
        super(continuation);
        this.f28160c = c2267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28159b = obj;
        this.f28161d |= Integer.MIN_VALUE;
        return this.f28160c.emit(null, this);
    }
}
