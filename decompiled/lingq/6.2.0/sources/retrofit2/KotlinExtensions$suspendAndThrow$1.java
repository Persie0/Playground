package retrofit2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "retrofit2.KotlinExtensions", m4291f = "KotlinExtensions.kt", m4292l = {119}, m4293m = "suspendAndThrow")
final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59171a;

    /* JADX INFO: renamed from: b */
    public int f59172b;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f59171a = obj;
        this.f59172b |= Integer.MIN_VALUE;
        return AbstractC3533a.m20601c(null, this);
    }
}
