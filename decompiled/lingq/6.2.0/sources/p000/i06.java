package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i06 extends az3 {

    /* JADX INFO: renamed from: b */
    public final int f43283b;

    /* JADX INFO: renamed from: c */
    public final int f43284c;

    /* JADX INFO: renamed from: d */
    public final int f43285d;

    /* JADX INFO: renamed from: e */
    public final int[] f43286e;

    /* JADX INFO: renamed from: f */
    public final int[] f43287f;

    public i06(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f43283b = i;
        this.f43284c = i2;
        this.f43285d = i3;
        this.f43286e = iArr;
        this.f43287f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i06.class != obj.getClass()) {
            return false;
        }
        i06 i06Var = (i06) obj;
        return this.f43283b == i06Var.f43283b && this.f43284c == i06Var.f43284c && this.f43285d == i06Var.f43285d && Arrays.equals(this.f43286e, i06Var.f43286e) && Arrays.equals(this.f43287f, i06Var.f43287f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43287f) + ((Arrays.hashCode(this.f43286e) + ((((((527 + this.f43283b) * 31) + this.f43284c) * 31) + this.f43285d) * 31)) * 31);
    }
}
