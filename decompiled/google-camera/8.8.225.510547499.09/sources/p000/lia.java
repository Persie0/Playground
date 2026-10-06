package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lia implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f38278c = 0;

    /* JADX INFO: renamed from: i */
    private Boolean f38286i;

    /* JADX INFO: renamed from: j */
    private volatile String f38287j;

    /* JADX INFO: renamed from: k */
    private volatile Activity f38288k;

    /* JADX INFO: renamed from: m */
    private final lhz f38290m;

    /* JADX INFO: renamed from: a */
    public final List f38279a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f38281d = new AtomicInteger();

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f38282e = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f38280b = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f38283f = new AtomicInteger();

    /* JADX INFO: renamed from: g */
    private final AtomicInteger f38284g = new AtomicInteger();

    /* JADX INFO: renamed from: h */
    private final AtomicInteger f38285h = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    private boolean f38289l = false;

    public lia(lhz lhzVar, byte[] bArr, byte[] bArr2) {
        this.f38290m = lhzVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m15373a(Activity activity) {
        m15375c(lib.m15377b(activity.getApplicationContext()), activity);
    }

    /* JADX INFO: renamed from: b */
    private final void m15374b() {
        if (!this.f38289l && this.f38281d.get() == 0) {
            if (!this.f38290m.m15362c()) {
                throw new IllegalStateException(PMZiHihxLGEy.UbyYWiw);
            }
            this.f38289l = true;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m15375c(boolean z, Activity activity) {
        Boolean bool = this.f38286i;
        if (bool == null || bool.booleanValue() != z) {
            this.f38286i = Boolean.valueOf(z);
            if (z) {
                for (lhy lhyVar : this.f38279a) {
                    if (lhyVar instanceof lhw) {
                        ((lhw) lhyVar).mo15357a(activity);
                    }
                }
                return;
            }
            for (lhy lhyVar2 : this.f38279a) {
                if (lhyVar2 instanceof lhv) {
                    ((lhv) lhyVar2).mo15356d(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f38281d.incrementAndGet();
        this.f38288k = null;
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lho) {
                ((lho) lhyVar).mo15350b(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f38285h.getAndIncrement() == 0) {
            m15374b();
        }
        this.f38288k = null;
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhp) {
                ((lhp) lhyVar).mo15351a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f38283f.getAndIncrement() == 0) {
            m15374b();
        }
        this.f38287j = null;
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhq) {
                ((lhq) lhyVar).mo15352b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f38280b.getAndIncrement() == 0) {
            m15374b();
        }
        this.f38288k = null;
        this.f38287j = activity.getClass().getSimpleName();
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhr) {
                ((lhr) lhyVar).mo15318a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhs) {
                ((lhs) lhyVar).m15353a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f38282e.getAndIncrement() == 0) {
            m15374b();
        }
        this.f38288k = null;
        m15373a(activity);
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lht) {
                ((lht) lhyVar).mo15354c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.f38284g.getAndIncrement() == 0) {
            m15374b();
        }
        this.f38288k = activity;
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhu) {
                ((lhu) lhyVar).m15355a();
            }
        }
        m15373a(activity);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (lhy lhyVar : this.f38279a) {
            if (lhyVar instanceof lhx) {
                ((lhx) lhyVar).m15358a();
            }
        }
        if (i >= 20 && this.f38288k != null) {
            m15375c(false, this.f38288k);
        }
        this.f38288k = null;
    }
}
