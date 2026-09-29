package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.ho8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", m4291f = "TrackpadScrollingLogic.kt", m4292l = {171}, m4293m = "invokeSuspend", m4294v = 1)
final class TrackpadScrollingLogic$dispatchTrackpadScroll$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f2200a;

    /* JADX INFO: renamed from: b */
    public int f2201b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2202c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0118x f2203d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0116v f2204e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Ref$ObjectRef f2205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$dispatchTrackpadScroll$3(C0118x c0118x, C0116v c0116v, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.f2203d = c0118x;
        this.f2204e = c0116v;
        this.f2205f = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(this.f2203d, this.f2204e, this.f2205f, continuation);
        trackpadScrollingLogic$dispatchTrackpadScroll$3.f2202c = obj;
        return trackpadScrollingLogic$dispatchTrackpadScroll$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackpadScrollingLogic$dispatchTrackpadScroll$3) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    /* JADX WARN: Code duplicated, block: B:13:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006d -> B:15:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
