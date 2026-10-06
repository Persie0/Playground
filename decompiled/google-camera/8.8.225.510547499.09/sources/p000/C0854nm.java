package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: nm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0854nm {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedCallback m17506a(Runnable runnable) {
        runnable.getClass();
        return new C0853nl(runnable, 0);
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedDispatcher m17507b(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: c */
    public static void m17508c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m17509d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m17510e(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
