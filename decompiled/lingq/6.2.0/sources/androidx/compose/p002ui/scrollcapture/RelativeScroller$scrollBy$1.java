package androidx.compose.p002ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.scrollcapture.RelativeScroller", m4291f = "ComposeScrollCaptureCallback.android.kt", m4292l = {296}, m4293m = "scrollBy", m4294v = 1)
final class RelativeScroller$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0419c f4903b;

    /* JADX INFO: renamed from: c */
    public int f4904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(C0419c c0419c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4903b = c0419c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4902a = obj;
        this.f4904c |= Integer.MIN_VALUE;
        return this.f4903b.m1835d(0.0f, this);
    }
}
