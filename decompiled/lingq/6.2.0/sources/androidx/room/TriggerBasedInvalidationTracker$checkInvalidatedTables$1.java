package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker", m4291f = "InvalidationTracker.kt", m4292l = {445, 453}, m4293m = "checkInvalidatedTables")
final class TriggerBasedInvalidationTracker$checkInvalidatedTables$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f6754a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0750h f6756c;

    /* JADX INFO: renamed from: d */
    public int f6757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$checkInvalidatedTables$1(C0750h c0750h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6756c = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6755b = obj;
        this.f6757d |= Integer.MIN_VALUE;
        return C0750h.m2852a(this.f6756c, null, this);
    }
}
