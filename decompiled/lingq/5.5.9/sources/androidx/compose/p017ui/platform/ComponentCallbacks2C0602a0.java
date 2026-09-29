package androidx.compose.p017ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p187j1.C6402b;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0602a0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Configuration f4277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6402b f4278b;

    public ComponentCallbacks2C0602a0(Configuration configuration, C6402b c6402b) {
        this.f4277a = configuration;
        this.f4278b = c6402b;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C5207g.m11111f(configuration, "configuration");
        Configuration configuration2 = this.f4277a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<C6402b.b, WeakReference<C6402b.a>>> it = this.f4278b.f36862a.entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    configuration2.setTo(configuration);
                    return;
                }
                Map.Entry<C6402b.b, WeakReference<C6402b.a>> next = it.next();
                C5207g.m11110e(next, "it.next()");
                C6402b.a aVar = next.getValue().get();
                if (aVar != null && !Configuration.needNewResources(iUpdateFrom, aVar.f36864b)) {
                    break;
                }
                it.remove();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4278b.f36862a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f4278b.f36862a.clear();
    }
}
