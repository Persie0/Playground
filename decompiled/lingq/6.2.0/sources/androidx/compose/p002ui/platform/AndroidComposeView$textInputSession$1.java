package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.AndroidComposeView", m4291f = "AndroidComposeView.android.kt", m4292l = {792}, m4293m = "textInputSession", m4294v = 1)
final class AndroidComposeView$textInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f4488b;

    /* JADX INFO: renamed from: c */
    public int f4489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4488b = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4487a = obj;
        this.f4489c |= Integer.MIN_VALUE;
        return this.f4488b.m1741Q(null, this);
    }
}
