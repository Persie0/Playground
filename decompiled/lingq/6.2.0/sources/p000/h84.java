package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h84 extends a84 {

    /* JADX INFO: renamed from: a */
    public final int f41939a;

    /* JADX INFO: renamed from: b */
    public final int f41940b;

    /* JADX INFO: renamed from: c */
    public boolean f41941c;

    /* JADX INFO: renamed from: d */
    public int f41942d;

    public h84(int i, int i2, int i3) {
        this.f41939a = i3;
        this.f41940b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f41941c = z;
        this.f41942d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41941c;
    }

    @Override // p000.a84
    public final int nextInt() {
        int i = this.f41942d;
        if (i != this.f41940b) {
            this.f41942d = this.f41939a + i;
            return i;
        }
        if (this.f41941c) {
            this.f41941c = false;
            return i;
        }
        uk9.m22784s();
        return 0;
    }
}
