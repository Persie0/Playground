package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ls */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0806ls {

    /* JADX INFO: renamed from: a */
    public final C0807lt f39114a = new C0807lt();

    /* JADX INFO: renamed from: b */
    public boolean f39115b = false;

    /* JADX INFO: renamed from: c */
    public final int f39116c = 1;

    /* JADX INFO: renamed from: a */
    public abstract int mo1762a();

    /* JADX INFO: renamed from: aU */
    public void mo10719aU(C0829mo c0829mo) {
    }

    /* JADX INFO: renamed from: b */
    public int mo1763b(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public long mo1764c(int i) {
        return -1L;
    }

    /* JADX INFO: renamed from: d */
    public abstract C0829mo mo1765d(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo1766e(C0829mo c0829mo, int i);

    /* JADX INFO: renamed from: g */
    public final void m15925g(boolean z) {
        if (this.f39114a.m15953b()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f39115b = z;
    }

    /* JADX INFO: renamed from: h */
    public final void m15926h(C0158ej c0158ej) {
        this.f39114a.registerObserver(c0158ej);
    }

    /* JADX INFO: renamed from: i */
    public final void m15927i(C0158ej c0158ej) {
        this.f39114a.unregisterObserver(c0158ej);
    }
}
