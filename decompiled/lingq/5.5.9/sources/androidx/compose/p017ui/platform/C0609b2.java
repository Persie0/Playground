package androidx.compose.p017ui.platform;

import android.view.ViewParent;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609b2 {

    /* JADX INFO: renamed from: a */
    public static final C0609b2 f4286a = new C0609b2();

    /* JADX INFO: renamed from: a */
    public final void m2339a(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
