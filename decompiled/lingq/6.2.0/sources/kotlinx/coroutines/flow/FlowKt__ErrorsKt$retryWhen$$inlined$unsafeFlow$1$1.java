package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.n83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m4291f = "Errors.kt", m4292l = {116, 118}, m4293m = "collect", m4294v = 1)
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47874a;

    /* JADX INFO: renamed from: b */
    public int f47875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n83 f47876c;

    /* JADX INFO: renamed from: d */
    public e83 f47877d;

    /* JADX INFO: renamed from: e */
    public Throwable f47878e;

    /* JADX INFO: renamed from: f */
    public int f47879f;

    /* JADX INFO: renamed from: g */
    public int f47880g;

    /* JADX INFO: renamed from: h */
    public long f47881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1(n83 n83Var, Continuation continuation) {
        super(continuation);
        this.f47876c = n83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47874a = obj;
        this.f47875b |= Integer.MIN_VALUE;
        return this.f47876c.collect(null, this);
    }
}
