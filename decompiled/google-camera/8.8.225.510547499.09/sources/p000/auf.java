package p000;

import androidx.wear.ambient.AmbientLifecycleObserverInterface;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auf extends AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC {

    /* JADX INFO: renamed from: a */
    private final List f2407a = new ArrayList(3);

    /* JADX INFO: renamed from: e */
    private static final void m2028e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: a */
    public final void mo1625a(int i) {
        try {
            Iterator it = this.f2407a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC) it.next()).mo1625a(i);
            }
        } catch (ConcurrentModificationException e) {
            m2028e(e);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: b */
    public final void mo1626b(int i, float f, int i2) {
        try {
            Iterator it = this.f2407a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC) it.next()).mo1626b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m2028e(e);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: c */
    public final void mo1627c(int i) {
        try {
            Iterator it = this.f2407a.iterator();
            while (it.hasNext()) {
                ((AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC) it.next()).mo1627c(i);
            }
        } catch (ConcurrentModificationException e) {
            m2028e(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2029d(AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC cc) {
        this.f2407a.add(cc);
    }
}
