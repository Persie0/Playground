package androidx.room;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m4291f = "InvalidationTracker.kt", m4292l = {247, 256}, m4293m = "emit")
final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int[] f6765a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0749g f6767c;

    /* JADX INFO: renamed from: d */
    public int f6768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(C0749g c0749g, Continuation continuation) {
        super(continuation);
        this.f6767c = c0749g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6766b = obj;
        this.f6768d |= Integer.MIN_VALUE;
        return this.f6767c.emit(null, this);
    }
}
