package p000;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final int f2439a;

    /* JADX INFO: renamed from: b */
    private final RecyclerView f2440b;

    public auu(int i, RecyclerView recyclerView) {
        this.f2439a = i;
        this.f2440b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2440b.m1231ad(this.f2439a);
    }
}
