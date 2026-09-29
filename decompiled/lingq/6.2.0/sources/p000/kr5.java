package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class kr5 {

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback f48363a;

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback mo15651a(jr5 jr5Var) {
        Objects.requireNonNull(jr5Var);
        return new C0854co(jr5Var, 2);
    }

    /* JADX INFO: renamed from: b */
    public void m15652b(jr5 jr5Var, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f48363a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackMo15651a = mo15651a(jr5Var);
            this.f48363a = onBackInvokedCallbackMo15651a;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackMo15651a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15653c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f48363a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f48363a);
        this.f48363a = null;
    }
}
