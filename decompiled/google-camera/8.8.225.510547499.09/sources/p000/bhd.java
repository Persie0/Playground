package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhd {

    /* JADX INFO: renamed from: a */
    public static final Executor f3266a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b */
    public volatile bhb f3267b;

    /* JADX INFO: renamed from: c */
    private final Set f3268c;

    /* JADX INFO: renamed from: d */
    private final Set f3269d;

    /* JADX INFO: renamed from: e */
    private final Handler f3270e;

    public bhd(Callable callable) {
        this(callable, false);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2456a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f3269d);
        if (arrayList.isEmpty()) {
            blx.m2681b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bgx) arrayList.get(i)).mo2414a(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2457b(Object obj) {
        ArrayList arrayList = new ArrayList(this.f3268c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bgx) arrayList.get(i)).mo2414a(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2458c(bhb bhbVar) {
        if (this.f3267b != null) {
            throw new IllegalStateException(yTyWiTtGtnBhy.xqcr);
        }
        this.f3267b = bhbVar;
        this.f3270e.post(new baa(this, 4));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m2459d(bgx bgxVar) {
        if (this.f3267b != null && this.f3267b.f3264b != null) {
            bgxVar.mo2414a(this.f3267b.f3264b);
        }
        this.f3269d.add(bgxVar);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m2460e(bgx bgxVar) {
        if (this.f3267b != null && this.f3267b.f3263a != null) {
            bgxVar.mo2414a(this.f3267b.f3263a);
        }
        this.f3268c.add(bgxVar);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m2461f(bgx bgxVar) {
        this.f3269d.remove(bgxVar);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2462g(bgx bgxVar) {
        this.f3268c.remove(bgxVar);
    }

    public bhd(Callable callable, boolean z) {
        this.f3268c = new LinkedHashSet(1);
        this.f3269d = new LinkedHashSet(1);
        this.f3270e = new Handler(Looper.getMainLooper());
        this.f3267b = null;
        if (!z) {
            f3266a.execute(new bhc(this, callable));
            return;
        }
        try {
            m2458c((bhb) callable.call());
        } catch (Throwable th) {
            m2458c(new bhb(th));
        }
    }
}
