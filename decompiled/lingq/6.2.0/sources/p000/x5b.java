package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class x5b extends w5b {

    /* JADX INFO: renamed from: t */
    public l64 f67801t;

    /* JADX INFO: renamed from: u */
    public l64 f67802u;

    /* JADX INFO: renamed from: v */
    public l64 f67803v;

    public x5b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
        this.f67801t = null;
        this.f67802u = null;
        this.f67803v = null;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: k */
    public l64 mo4366k() {
        if (this.f67802u == null) {
            this.f67802u = l64.m15831d(this.f63458c.getMandatorySystemGestureInsets());
        }
        return this.f67802u;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: m */
    public l64 mo4368m() {
        if (this.f67801t == null) {
            this.f67801t = l64.m15831d(this.f63458c.getSystemGestureInsets());
        }
        return this.f67801t;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: o */
    public l64 mo4370o() {
        if (this.f67803v == null) {
            this.f67803v = l64.m15831d(this.f63458c.getTappableElementInsets());
        }
        return this.f67803v;
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: r */
    public f6b mo4371r(int i, int i2, int i3, int i4) {
        return f6b.m11570g(null, this.f63458c.inset(i, i2, i3, i4));
    }

    public x5b(f6b f6bVar, x5b x5bVar) {
        super(f6bVar, x5bVar);
        this.f67801t = null;
        this.f67802u = null;
        this.f67803v = null;
    }
}
