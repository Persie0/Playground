package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.AbstractFlow", m4291f = "Flow.kt", m4292l = {226}, m4293m = "collect", m4294v = 1)
final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SafeCollector f47800a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3221a f47802c;

    /* JADX INFO: renamed from: d */
    public int f47803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractC3221a abstractC3221a, Continuation continuation) {
        super(continuation);
        this.f47802c = abstractC3221a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47801b = obj;
        this.f47803d |= Integer.MIN_VALUE;
        return this.f47802c.collect(null, this);
    }
}
