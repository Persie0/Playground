package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ej0;
import p000.u56;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m4291f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m4292l = {2370, 2406}, m4293m = "boundsUpdatesEventLoop$ui", m4294v = 1)
final class C0368x3d3eeeed extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public u56 f4491a;

    /* JADX INFO: renamed from: b */
    public ej0 f4492b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f4493c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0393e f4494d;

    /* JADX INFO: renamed from: e */
    public int f4495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368x3d3eeeed(ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4494d = viewOnAttachStateChangeListenerC0393e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4493c = obj;
        this.f4495e |= Integer.MIN_VALUE;
        return this.f4494d.m1785l(this);
    }
}
