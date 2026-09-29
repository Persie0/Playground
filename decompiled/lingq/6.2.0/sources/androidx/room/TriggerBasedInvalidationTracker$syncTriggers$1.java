package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b64;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker", m4291f = "InvalidationTracker.kt", m4292l = {306}, m4293m = "syncTriggers$room_runtime")
final class TriggerBasedInvalidationTracker$syncTriggers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public b64 f6799a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0750h f6801c;

    /* JADX INFO: renamed from: d */
    public int f6802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$1(C0750h c0750h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6801c = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6800b = obj;
        this.f6802d |= Integer.MIN_VALUE;
        return this.f6801c.m2857f(this);
    }
}
