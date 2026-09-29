package androidx.compose.p002ui.contentcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ej0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", m4291f = "AndroidContentCaptureManager.android.kt", m4292l = {205, 215}, m4293m = "boundsUpdatesEventLoop$ui", m4294v = 1)
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ej0 f3818a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0291c f3820c;

    /* JADX INFO: renamed from: d */
    public int f3821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3820c = viewOnAttachStateChangeListenerC0291c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3819b = obj;
        this.f3821d |= Integer.MIN_VALUE;
        return this.f3820c.m1324a(this);
    }
}
