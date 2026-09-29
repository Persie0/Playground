package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lu3 extends AbstractC3489q9 {

    /* JADX INFO: renamed from: C */
    public final int f50135C;

    /* JADX INFO: renamed from: D */
    public final int f50136D;

    /* JADX INFO: renamed from: E */
    public final C2920da f50137E;

    /* JADX INFO: renamed from: F */
    public final fo2 f50138F;

    public lu3(int i, int i2, C2920da c2920da, fo2 fo2Var) {
        this.f50135C = i;
        this.f50136D = i2;
        this.f50137E = c2920da;
        this.f50138F = fo2Var;
    }

    /* JADX INFO: renamed from: H */
    public final int m16544H() {
        C2920da c2920da = C2920da.f35233l;
        int i = this.f50136D;
        C2920da c2920da2 = this.f50137E;
        if (c2920da2 == c2920da) {
            return i;
        }
        if (c2920da2 != C2920da.f35230i && c2920da2 != C2920da.f35231j && c2920da2 != C2920da.f35232k) {
            C3386nv.m17633t("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lu3)) {
            return false;
        }
        lu3 lu3Var = (lu3) obj;
        return lu3Var.f50135C == this.f50135C && lu3Var.m16544H() == m16544H() && lu3Var.f50137E == this.f50137E && lu3Var.f50138F == this.f50138F;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f50135C), Integer.valueOf(this.f50136D), this.f50137E, this.f50138F);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f50137E);
        sb.append(", hashType: ");
        sb.append(this.f50138F);
        sb.append(", ");
        sb.append(this.f50136D);
        sb.append("-byte tags, and ");
        return wq1.m24123s(sb, this.f50135C, "-byte key)");
    }
}
