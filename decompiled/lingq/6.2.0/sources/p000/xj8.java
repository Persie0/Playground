package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xj8 {

    /* JADX INFO: renamed from: a */
    public int f68294a;

    /* JADX INFO: renamed from: b */
    public int f68295b;

    /* JADX INFO: renamed from: c */
    public int f68296c;

    /* JADX INFO: renamed from: d */
    public int f68297d;

    /* JADX INFO: renamed from: e */
    public int f68298e;

    /* JADX INFO: renamed from: f */
    public int f68299f;

    /* JADX INFO: renamed from: g */
    public boolean f68300g;

    /* JADX INFO: renamed from: h */
    public boolean f68301h;

    /* JADX INFO: renamed from: a */
    public final void m24572a(int i, int i2) {
        this.f68296c = i;
        this.f68297d = i2;
        this.f68301h = true;
        if (this.f68300g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f68294a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f68295b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f68294a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f68295b = i2;
        }
    }
}
