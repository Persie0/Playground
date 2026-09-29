package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.p002ui.platform.C0401m;

/* JADX INFO: loaded from: classes.dex */
public final class ue1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0401m f63807a;

    public ue1(C0401m c0401m) {
        this.f63807a = c0401m;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f63807a.m1803d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0401m c0401m = this.f63807a;
        c0401m.f4791f.f60130a.clear();
        y78 y78Var = c0401m.f4792g;
        synchronized (y78Var) {
            y78Var.f69418a.m21844c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C0401m c0401m = this.f63807a;
        c0401m.f4791f.f60130a.clear();
        y78 y78Var = c0401m.f4792g;
        synchronized (y78Var) {
            y78Var.f69418a.m21844c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((xc9) this.f63807a.f4804s.f53325c).setValue(Boolean.valueOf(z));
    }
}
