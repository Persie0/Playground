package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.o83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m4291f = "Transform.kt", m4292l = {217, 218}, m4293m = "emit", m4294v = 1)
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47943a;

    /* JADX INFO: renamed from: b */
    public int f47944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o83 f47945c;

    /* JADX INFO: renamed from: d */
    public Object f47946d;

    /* JADX INFO: renamed from: e */
    public e83 f47947e;

    /* JADX INFO: renamed from: f */
    public int f47948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(o83 o83Var, Continuation continuation) {
        super(continuation);
        this.f47945c = o83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47943a = obj;
        this.f47944b |= Integer.MIN_VALUE;
        return this.f47945c.emit(null, this);
    }
}
