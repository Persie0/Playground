package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p000.c32;
import p000.e83;
import p000.m83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m4291f = "Emitters.kt", m4292l = {115, 119}, m4293m = "collect", m4294v = 1)
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47857a;

    /* JADX INFO: renamed from: b */
    public int f47858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m83 f47859c;

    /* JADX INFO: renamed from: d */
    public e83 f47860d;

    /* JADX INFO: renamed from: e */
    public SafeCollector f47861e;

    /* JADX INFO: renamed from: f */
    public int f47862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(m83 m83Var, Continuation continuation) {
        super(continuation);
        this.f47859c = m83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47857a = obj;
        this.f47858b |= Integer.MIN_VALUE;
        return this.f47859c.collect(null, this);
    }
}
