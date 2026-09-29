package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ch7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker", m4291f = "InvalidationTracker.kt", m4292l = {347}, m4293m = "stopTrackingTable")
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ch7 f6791a;

    /* JADX INFO: renamed from: b */
    public String f6792b;

    /* JADX INFO: renamed from: c */
    public String[] f6793c;

    /* JADX INFO: renamed from: d */
    public int f6794d;

    /* JADX INFO: renamed from: e */
    public int f6795e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f6796f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0750h f6797g;

    /* JADX INFO: renamed from: h */
    public int f6798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$stopTrackingTable$1(C0750h c0750h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6797g = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6796f = obj;
        this.f6798h |= Integer.MIN_VALUE;
        return C0750h.m2855d(this.f6797g, null, 0, this);
    }
}
