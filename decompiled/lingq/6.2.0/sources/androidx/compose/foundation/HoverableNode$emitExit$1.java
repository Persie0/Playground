package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.HoverableNode", m4291f = "Hoverable.kt", m4292l = {114}, m4293m = "emitExit", m4294v = 1)
final class HoverableNode$emitExit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f1681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0123j f1682b;

    /* JADX INFO: renamed from: c */
    public int f1683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(C0123j c0123j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1682b = c0123j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1681a = obj;
        this.f1683c |= Integer.MIN_VALUE;
        return C0123j.m959a1(this.f1682b, this);
    }
}
