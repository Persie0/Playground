package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b64;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker", m4291f = "InvalidationTracker.kt", m4292l = {417}, m4293m = "notifyInvalidation")
final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public b64 f6769a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0750h f6771c;

    /* JADX INFO: renamed from: d */
    public int f6772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$notifyInvalidation$1(C0750h c0750h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6771c = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6770b = obj;
        this.f6772d |= Integer.MIN_VALUE;
        return C0750h.m2853b(this.f6771c, this);
    }
}
