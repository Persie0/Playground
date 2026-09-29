package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.focus.C0301c;
import kotlin.jvm.internal.Lambda;
import p000.o93;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeView$indirectPointerNavigationGestureDetector$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f4479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$indirectPointerNavigationGestureDetector$1(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        super(1);
        this.f4479b = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        ((C0301c) this.f4479b.getFocusOwner()).m1363i(((o93) obj).f54076a, false);
        return xfa.f68157a;
    }
}
