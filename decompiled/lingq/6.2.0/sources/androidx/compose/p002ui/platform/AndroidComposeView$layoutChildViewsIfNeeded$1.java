package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import kotlin.jvm.internal.Lambda;
import p000.C3464pl;
import p000.ui3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeView$layoutChildViewsIfNeeded$1 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f4480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$layoutChildViewsIfNeeded$1(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        super(0);
        this.f4480b = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        C3464pl c3464pl = this.f4480b.f4705k0;
        if (c3464pl != null) {
            int childCount = c3464pl.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c3464pl.getChildAt(i);
                AbstractC0442b abstractC0442b = childAt instanceof AbstractC0442b ? (AbstractC0442b) childAt : null;
                if (abstractC0442b != null && abstractC0442b.isLayoutRequested()) {
                    abstractC0442b.layout(abstractC0442b.getLeft(), abstractC0442b.getTop(), abstractC0442b.getRight(), abstractC0442b.getBottom());
                }
            }
        }
        return xfa.f68157a;
    }
}
