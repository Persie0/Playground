package kotlinx.coroutines.flow;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.l83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m4291f = "Emitters.kt", m4292l = {113, 120, 127}, m4293m = "collect", m4294v = 1)
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47851a;

    /* JADX INFO: renamed from: b */
    public int f47852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l83 f47853c;

    /* JADX INFO: renamed from: d */
    public e83 f47854d;

    /* JADX INFO: renamed from: e */
    public Serializable f47855e;

    /* JADX INFO: renamed from: f */
    public int f47856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(l83 l83Var, Continuation continuation) {
        super(continuation);
        this.f47853c = l83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47851a = obj;
        this.f47852b |= Integer.MIN_VALUE;
        return this.f47853c.collect(null, this);
    }
}
