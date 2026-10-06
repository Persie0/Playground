package p000;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kov {

    /* JADX INFO: renamed from: d */
    public final OrientationEventListener f36717d;

    /* JADX INFO: renamed from: e */
    public final Executor f36718e;

    /* JADX INFO: renamed from: f */
    public final kbo f36719f;

    /* JADX INFO: renamed from: h */
    public int f36721h;

    /* JADX INFO: renamed from: a */
    public final List f36714a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f36715b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Object f36716c = new Object();

    /* JADX INFO: renamed from: g */
    public kay f36720g = kay.CLOCKWISE_0;

    public kov(Context context, Executor executor, kbo kboVar) {
        this.f36718e = executor;
        this.f36717d = new kou(this, context);
        this.f36719f = kboVar.mo6314a("DeviceOrientation");
    }

    /* JADX INFO: renamed from: a */
    public final kay m14647a() {
        kay kayVar;
        synchronized (this.f36716c) {
            kayVar = this.f36720g;
        }
        return kayVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14648b(kos kosVar) {
        synchronized (this.f36716c) {
            if (this.f36714a.contains(kosVar)) {
                return;
            }
            this.f36714a.add(kosVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14649c(kos kosVar) {
        synchronized (this.f36716c) {
            if (!this.f36714a.remove(kosVar)) {
                this.f36719f.mo13946h("Removing non-existing listener.");
            }
        }
    }
}
