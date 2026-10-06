package p000;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ayb {

    /* JADX INFO: renamed from: c */
    public Context f2705c;

    /* JADX INFO: renamed from: d */
    public WorkerParameters f2706d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f2707e;

    /* JADX INFO: renamed from: f */
    public boolean f2708f;

    public ayb(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f2705c = context;
        this.f2706d = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public abstract nps mo1695a();

    /* JADX INFO: renamed from: aV */
    public final axt m2094aV() {
        return this.f2706d.f1797b;
    }

    /* JADX INFO: renamed from: aW */
    public final UUID m2095aW() {
        return this.f2706d.f1796a;
    }

    /* JADX INFO: renamed from: c */
    public void mo1697c() {
    }

    /* JADX INFO: renamed from: d */
    public final int m2096d() {
        return this.f2706d.f1798c;
    }

    /* JADX INFO: renamed from: g */
    public final Executor m2097g() {
        return this.f2706d.f1799d;
    }

    /* JADX INFO: renamed from: h */
    public final void m2098h() {
        this.f2707e = true;
        mo1697c();
    }
}
