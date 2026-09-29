package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.yz0;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1", m4291f = "SharingStarted.kt", m4292l = {113}, m4293m = "collect", m4294v = 1)
public final class StartedLazily$command$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48026a;

    /* JADX INFO: renamed from: b */
    public int f48027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yz0 f48028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$$inlined$unsafeFlow$1$1(yz0 yz0Var, Continuation continuation) {
        super(continuation);
        this.f48028c = yz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48026a = obj;
        this.f48027b |= Integer.MIN_VALUE;
        return this.f48028c.collect(null, this);
    }
}
