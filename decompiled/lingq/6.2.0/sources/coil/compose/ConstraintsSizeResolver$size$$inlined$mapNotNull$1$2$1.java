package coil.compose;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", m4291f = "ConstraintsSizeResolver.kt", m4292l = {221}, m4293m = "emit")
public final class ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f10421a;

    /* JADX INFO: renamed from: b */
    public int f10422b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f10423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f10423c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10421a = obj;
        this.f10422b |= Integer.MIN_VALUE;
        return this.f10423c.emit(null, this);
    }
}
