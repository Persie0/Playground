package p000;

import android.app.Activity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awk implements avs {

    /* JADX INFO: renamed from: b */
    public final avs f2589b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f2590c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final Map f2591d = new LinkedHashMap();

    public awk(avs avsVar) {
        this.f2589b = avsVar;
    }

    @Override // p000.avs
    /* JADX INFO: renamed from: a */
    public final our mo2061a() {
        return this.f2589b.mo2061a();
    }

    @Override // p000.avs
    /* JADX INFO: renamed from: b */
    public final void mo2062b(Activity activity, Executor executor, eno enoVar) {
        this.f2589b.mo2062b(activity, executor, enoVar);
    }
}
