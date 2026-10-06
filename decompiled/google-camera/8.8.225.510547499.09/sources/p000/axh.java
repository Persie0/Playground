package p000;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axh implements axd {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f2649a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f2650b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    private final axd f2651c;

    public axh(axd axdVar) {
        this.f2651c = axdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m2083a(Activity activity, awx awxVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.f2649a;
        reentrantLock.lock();
        try {
            if (ooc.m18737c(awxVar, (awx) this.f2650b.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (axl axlVar : ((axk) this.f2651c).f2659a.f2666c) {
                if (ooc.m18737c(axlVar.f2660a, activity)) {
                    axlVar.m2086a(awxVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
