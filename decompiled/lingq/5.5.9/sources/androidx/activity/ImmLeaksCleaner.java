package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public static int f459a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ImmLeaksCleaner() {
        throw null;
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f459a == 0) {
            try {
                f459a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f459a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f459a == 1) {
            throw null;
        }
    }
}
