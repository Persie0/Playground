package p000;

import android.database.Observable;

/* JADX INFO: renamed from: lt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0807lt extends Observable {
    /* JADX INFO: renamed from: a */
    public final void m15952a() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C0158ej) this.mObservers.get(size)).mo2040b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15953b() {
        return !this.mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final void m15954c(int i, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C0158ej) this.mObservers.get(size)).mo2042d(i, obj);
        }
    }
}
