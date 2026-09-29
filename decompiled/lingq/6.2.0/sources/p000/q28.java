package p000;

import android.database.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class q28 extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m19617a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m19618b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2797a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19619c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2800d(i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19620d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2798b(i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19621e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2799c(i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19622f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2801e(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19623g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((r28) ((Observable) this).mObservers.get(size)).mo2802f();
        }
    }
}
