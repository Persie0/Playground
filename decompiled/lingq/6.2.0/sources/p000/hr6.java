package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class hr6 extends dj6 {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f42838c;

    /* JADX INFO: renamed from: d */
    public final int f42839d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f42840e;

    /* JADX INFO: renamed from: f */
    public boolean f42841f;

    public hr6(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f42838c = onBackInvokedDispatcher;
        this.f42839d = i;
        this.f42840e = Build.VERSION.SDK_INT == 33 ? new C0854co(this, 3) : new ir6(this);
    }

    @Override // p000.dj6
    /* JADX INFO: renamed from: b */
    public final void mo10415b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f42840e;
        if (z && !this.f42841f) {
            this.f42838c.registerOnBackInvokedCallback(this.f42839d, onBackInvokedCallback);
            this.f42841f = true;
        } else {
            if (z || !this.f42841f) {
                return;
            }
            this.f42838c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f42841f = false;
        }
    }
}
