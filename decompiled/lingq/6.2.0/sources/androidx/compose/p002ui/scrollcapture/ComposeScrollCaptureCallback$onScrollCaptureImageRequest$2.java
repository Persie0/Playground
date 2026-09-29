package androidx.compose.p002ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.j84;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", m4291f = "ComposeScrollCaptureCallback.android.kt", m4292l = {134, 137}, m4293m = "onScrollCaptureImageRequest", m4294v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f4889a;

    /* JADX INFO: renamed from: b */
    public j84 f4890b;

    /* JADX INFO: renamed from: c */
    public int f4891c;

    /* JADX INFO: renamed from: d */
    public int f4892d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f4893e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ScrollCaptureCallbackC0417a f4894f;

    /* JADX INFO: renamed from: g */
    public int f4895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4894f = scrollCaptureCallbackC0417a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4893e = obj;
        this.f4895g |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0417a.m1828a(this.f4894f, null, null, this);
    }
}
