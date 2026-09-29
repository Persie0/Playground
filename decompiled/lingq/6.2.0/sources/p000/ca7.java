package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ca7 {

    /* JADX INFO: renamed from: a */
    public final Object f9792a;

    /* JADX INFO: renamed from: b */
    public final int f9793b;

    /* JADX INFO: renamed from: c */
    public final pu5 f9794c;

    /* JADX INFO: renamed from: d */
    public final Object f9795d;

    /* JADX INFO: renamed from: e */
    public final int f9796e;

    /* JADX INFO: renamed from: f */
    public final long f9797f;

    /* JADX INFO: renamed from: g */
    public final long f9798g;

    /* JADX INFO: renamed from: h */
    public final int f9799h;

    /* JADX INFO: renamed from: i */
    public final int f9800i;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        uma.m22828w(5);
        uma.m22828w(6);
    }

    public ca7(Object obj, int i, pu5 pu5Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        bna.m3969q(i >= 0);
        bna.m3969q(i2 >= 0);
        this.f9792a = obj;
        this.f9793b = i;
        this.f9794c = pu5Var;
        this.f9795d = obj2;
        this.f9796e = i2;
        this.f9797f = j;
        this.f9798g = j2;
        this.f9799h = i3;
        this.f9800i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ca7.class == obj.getClass()) {
            ca7 ca7Var = (ca7) obj;
            if (this.f9793b == ca7Var.f9793b && this.f9796e == ca7Var.f9796e && this.f9797f == ca7Var.f9797f && this.f9798g == ca7Var.f9798g && this.f9799h == ca7Var.f9799h && this.f9800i == ca7Var.f9800i && Objects.equals(this.f9794c, ca7Var.f9794c) && Objects.equals(this.f9792a, ca7Var.f9792a) && Objects.equals(this.f9795d, ca7Var.f9795d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9792a, Integer.valueOf(this.f9793b), this.f9794c, this.f9795d, Integer.valueOf(this.f9796e), Long.valueOf(this.f9797f), Long.valueOf(this.f9798g), Integer.valueOf(this.f9799h), Integer.valueOf(this.f9800i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f9793b + ", period=" + this.f9796e + ", pos=" + this.f9797f;
        int i = this.f9799h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM22999v = ux5.m22999v(str, ", contentPos=");
        sbM22999v.append(this.f9798g);
        sbM22999v.append(", adGroup=");
        sbM22999v.append(i);
        sbM22999v.append(", ad=");
        sbM22999v.append(this.f9800i);
        return sbM22999v.toString();
    }
}
