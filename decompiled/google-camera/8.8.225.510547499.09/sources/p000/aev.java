package p000;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aev {

    /* JADX INFO: renamed from: a */
    public int f263a;

    /* JADX INFO: renamed from: b */
    public int f264b;

    /* JADX INFO: renamed from: a */
    public final int m398a() {
        return this.f263a | this.f264b;
    }

    /* JADX INFO: renamed from: b */
    public final void m399b(int i, int i2) {
        if (i2 == 1) {
            this.f264b = i;
        } else {
            this.f263a = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m400c(int i) {
        if (i == 1) {
            this.f264b = 0;
        } else {
            this.f263a = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m401d(C0829mo c0829mo) {
        View view = c0829mo.f41155a;
        this.f264b = view.getLeft();
        this.f263a = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
