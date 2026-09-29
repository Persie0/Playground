package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.DelayKt", m4291f = "Delay.kt", m4292l = {160}, m4293m = "awaitCancellation", m4294v = 1)
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47746a;

    /* JADX INFO: renamed from: b */
    public int f47747b;

    public DelayKt$awaitCancellation$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47746a = obj;
        this.f47747b |= Integer.MIN_VALUE;
        return AbstractC3208a.m15435b(this);
    }
}
