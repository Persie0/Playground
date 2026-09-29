package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1", m4291f = "Limit.kt", m4292l = {142, 143}, m4293m = "emit", m4294v = 1)
public final class FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47903a;

    /* JADX INFO: renamed from: b */
    public int f47904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o83 f47905c;

    /* JADX INFO: renamed from: d */
    public Object f47906d;

    /* JADX INFO: renamed from: e */
    public int f47907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(o83 o83Var, Continuation continuation) {
        super(continuation);
        this.f47905c = o83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47903a = obj;
        this.f47904b |= Integer.MIN_VALUE;
        return this.f47905c.emit(null, this);
    }
}
