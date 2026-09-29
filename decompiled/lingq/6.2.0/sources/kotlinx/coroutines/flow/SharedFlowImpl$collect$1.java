package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c59;
import p000.cd4;
import p000.e83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.SharedFlowImpl", m4291f = "SharedFlow.kt", m4292l = {387, 394, 397}, m4293m = "collect$suspendImpl", m4294v = 1)
final class SharedFlowImpl$collect$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C3229i f48019a;

    /* JADX INFO: renamed from: b */
    public e83 f48020b;

    /* JADX INFO: renamed from: c */
    public c59 f48021c;

    /* JADX INFO: renamed from: d */
    public cd4 f48022d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f48023e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3229i f48024f;

    /* JADX INFO: renamed from: g */
    public int f48025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(C3229i c3229i, Continuation continuation) {
        super(continuation);
        this.f48024f = c3229i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48023e = obj;
        this.f48025g |= Integer.MIN_VALUE;
        return C3229i.m15548j(this.f48024f, null, this);
    }
}
