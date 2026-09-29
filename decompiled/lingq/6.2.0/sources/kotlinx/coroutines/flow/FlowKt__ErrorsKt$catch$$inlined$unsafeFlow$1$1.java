package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.l83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m4291f = "Errors.kt", m4292l = {112, 113}, m4293m = "collect", m4294v = 1)
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47863a;

    /* JADX INFO: renamed from: b */
    public int f47864b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l83 f47865c;

    /* JADX INFO: renamed from: d */
    public e83 f47866d;

    /* JADX INFO: renamed from: e */
    public int f47867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(l83 l83Var, Continuation continuation) {
        super(continuation);
        this.f47865c = l83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47863a = obj;
        this.f47864b |= Integer.MIN_VALUE;
        return this.f47865c.collect(null, this);
    }
}
