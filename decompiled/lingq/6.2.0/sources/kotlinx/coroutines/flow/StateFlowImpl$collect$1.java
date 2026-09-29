package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cd4;
import p000.e83;
import p000.fh9;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.StateFlowImpl", m4291f = "StateFlow.kt", m4292l = {389, 401, 406}, m4293m = "collect", m4294v = 1)
final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public e83 f48037a;

    /* JADX INFO: renamed from: b */
    public fh9 f48038b;

    /* JADX INFO: renamed from: c */
    public cd4 f48039c;

    /* JADX INFO: renamed from: d */
    public Object f48040d;

    /* JADX INFO: renamed from: e */
    public Object f48041e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f48042f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3244l f48043g;

    /* JADX INFO: renamed from: h */
    public int f48044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(C3244l c3244l, Continuation continuation) {
        super(continuation);
        this.f48043g = c3244l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48042f = obj;
        this.f48044h |= Integer.MIN_VALUE;
        return this.f48043g.collect(null, this);
    }
}
