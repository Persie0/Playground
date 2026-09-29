package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: hi */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3076hi implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3148ji f42391a;

    public ComponentCallbacks2C3076hi(C3148ji c3148ji) {
        this.f42391a = c3148ji;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            C3148ji.m14484d(this.f42391a);
        }
    }
}
