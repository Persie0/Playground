package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.rv3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.HoverableNode", m4291f = "Hoverable.kt", m4292l = {106}, m4293m = "emitEnter", m4294v = 1)
final class HoverableNode$emitEnter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public rv3 f1677a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0123j f1679c;

    /* JADX INFO: renamed from: d */
    public int f1680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(C0123j c0123j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1679c = c0123j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1678b = obj;
        this.f1680d |= Integer.MIN_VALUE;
        return C0123j.m958Z0(this.f1679c, this);
    }
}
