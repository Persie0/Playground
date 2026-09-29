package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class eu4 implements dh9 {

    /* JADX INFO: renamed from: a */
    public final int f37863a;

    /* JADX INFO: renamed from: b */
    public final int f37864b;

    /* JADX INFO: renamed from: c */
    public final t66 f37865c;

    /* JADX INFO: renamed from: d */
    public int f37866d;

    public eu4(int i, int i2, int i3) {
        this.f37863a = i2;
        this.f37864b = i3;
        int i4 = (i / i2) * i2;
        this.f37865c = AbstractC0278f.m1259i(l70.m15922M(Math.max(i4 - i3, 0), i4 + i2 + i3), tr3.f62761g);
        this.f37866d = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m11342c(int i) {
        if (i != this.f37866d) {
            this.f37866d = i;
            int i2 = this.f37863a;
            int i3 = (i / i2) * i2;
            int i4 = this.f37864b;
            ((xc9) this.f37865c).setValue(l70.m15922M(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // p000.dh9
    public final Object getValue() {
        return (i84) ((xc9) this.f37865c).getValue();
    }
}
