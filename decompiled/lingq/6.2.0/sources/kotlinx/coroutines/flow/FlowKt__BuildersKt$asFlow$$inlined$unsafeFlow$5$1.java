package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.yz0;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m4291f = "Builders.kt", m4292l = {114}, m4293m = "collect", m4294v = 1)
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47811a;

    /* JADX INFO: renamed from: b */
    public int f47812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yz0 f47813c;

    /* JADX INFO: renamed from: d */
    public e83 f47814d;

    /* JADX INFO: renamed from: e */
    public Iterator f47815e;

    /* JADX INFO: renamed from: f */
    public int f47816f;

    /* JADX INFO: renamed from: g */
    public int f47817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1(yz0 yz0Var, Continuation continuation) {
        super(continuation);
        this.f47813c = yz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47811a = obj;
        this.f47812b |= Integer.MIN_VALUE;
        return this.f47813c.collect(null, this);
    }
}
