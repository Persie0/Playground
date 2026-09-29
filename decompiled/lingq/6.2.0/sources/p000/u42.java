package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u42 {

    /* JADX INFO: renamed from: c */
    public int f63381c;

    /* JADX INFO: renamed from: d */
    public int f63382d;

    /* JADX INFO: renamed from: a */
    public final boolean f63379a = true;

    /* JADX INFO: renamed from: b */
    public final int f63380b = 65536;

    /* JADX INFO: renamed from: e */
    public int f63383e = 0;

    /* JADX INFO: renamed from: f */
    public C3830ze[] f63384f = new C3830ze[100];

    /* JADX INFO: renamed from: a */
    public final synchronized C3830ze m22446a() {
        C3830ze c3830ze;
        try {
            int i = this.f63382d + 1;
            this.f63382d = i;
            int i2 = this.f63383e;
            if (i2 > 0) {
                C3830ze[] c3830zeArr = this.f63384f;
                int i3 = i2 - 1;
                this.f63383e = i3;
                c3830ze = c3830zeArr[i3];
                c3830ze.getClass();
                this.f63384f[this.f63383e] = null;
            } else {
                C3830ze c3830ze2 = new C3830ze(0, new byte[this.f63380b]);
                C3830ze[] c3830zeArr2 = this.f63384f;
                if (i > c3830zeArr2.length) {
                    this.f63384f = (C3830ze[]) Arrays.copyOf(c3830zeArr2, c3830zeArr2.length * 2);
                }
                c3830ze = c3830ze2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3830ze;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m22447b(int i) {
        boolean z = i < this.f63381c;
        this.f63381c = i;
        if (z) {
            m22448c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m22448c() {
        int iMax = Math.max(0, uma.m22810e(this.f63381c, this.f63380b) - this.f63382d);
        int i = this.f63383e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f63384f, iMax, i, (Object) null);
        this.f63383e = iMax;
    }
}
