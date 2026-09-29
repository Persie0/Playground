package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m4291f = "Combine.kt", m4292l = {29, 30}, m4293m = "emit", m4294v = 1)
final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3237g f48118b;

    /* JADX INFO: renamed from: c */
    public int f48119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(C3237g c3237g, Continuation continuation) {
        super(continuation);
        this.f48118b = c3237g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48117a = obj;
        this.f48119c |= Integer.MIN_VALUE;
        return this.f48118b.emit(null, this);
    }
}
