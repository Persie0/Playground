package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ch7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker", m4291f = "InvalidationTracker.kt", m4292l = {328, 333}, m4293m = "startTrackingTable")
final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ch7 f6782a;

    /* JADX INFO: renamed from: b */
    public String f6783b;

    /* JADX INFO: renamed from: c */
    public String[] f6784c;

    /* JADX INFO: renamed from: d */
    public int f6785d;

    /* JADX INFO: renamed from: e */
    public int f6786e;

    /* JADX INFO: renamed from: f */
    public int f6787f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f6788g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0750h f6789h;

    /* JADX INFO: renamed from: i */
    public int f6790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$startTrackingTable$1(C0750h c0750h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6789h = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6788g = obj;
        this.f6790i |= Integer.MIN_VALUE;
        return C0750h.m2854c(this.f6789h, null, 0, this);
    }
}
