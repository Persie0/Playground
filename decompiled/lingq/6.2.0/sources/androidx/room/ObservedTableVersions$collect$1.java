package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.ObservedTableVersions", m4291f = "InvalidationTracker.kt", m4292l = {638}, m4293m = "collect")
final class ObservedTableVersions$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0737b f6728b;

    /* JADX INFO: renamed from: c */
    public int f6729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservedTableVersions$collect$1(C0737b c0737b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6728b = c0737b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6727a = obj;
        this.f6729c |= Integer.MIN_VALUE;
        return this.f6728b.m2810a(null, this);
    }
}
