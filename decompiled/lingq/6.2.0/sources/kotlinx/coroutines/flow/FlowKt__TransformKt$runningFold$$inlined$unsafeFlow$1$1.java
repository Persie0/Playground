package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.e83;
import p000.t83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m4291f = "Transform.kt", m4292l = {113, 114}, m4293m = "collect", m4294v = 1)
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47949a;

    /* JADX INFO: renamed from: b */
    public int f47950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t83 f47951c;

    /* JADX INFO: renamed from: d */
    public e83 f47952d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f47953e;

    /* JADX INFO: renamed from: f */
    public int f47954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(t83 t83Var, Continuation continuation) {
        super(continuation);
        this.f47951c = t83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47949a = obj;
        this.f47950b |= Integer.MIN_VALUE;
        return this.f47951c.collect(null, this);
    }
}
