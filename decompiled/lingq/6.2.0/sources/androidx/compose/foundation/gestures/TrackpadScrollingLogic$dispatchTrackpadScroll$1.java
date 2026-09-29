package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic", m4291f = "TrackpadScrollingLogic.kt", m4292l = {166, 183}, m4293m = "dispatchTrackpadScroll", m4294v = 1)
final class TrackpadScrollingLogic$dispatchTrackpadScroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0118x f2198b;

    /* JADX INFO: renamed from: c */
    public int f2199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$dispatchTrackpadScroll$1(C0118x c0118x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2198b = c0118x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2197a = obj;
        this.f2199c |= Integer.MIN_VALUE;
        return C0118x.m948c(this.f2198b, null, null, this);
    }
}
