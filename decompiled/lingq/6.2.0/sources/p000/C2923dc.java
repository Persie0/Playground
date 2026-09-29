package p000;

import java.util.Objects;

/* JADX INFO: renamed from: dc */
/* JADX INFO: loaded from: classes.dex */
public final class C2923dc extends AbstractC3489q9 {

    /* JADX INFO: renamed from: C */
    public final int f35369C;

    /* JADX INFO: renamed from: D */
    public final int f35370D;

    /* JADX INFO: renamed from: E */
    public final int f35371E;

    /* JADX INFO: renamed from: F */
    public final C0842cc f35372F;

    public C2923dc(int i, int i2, int i3, C0842cc c0842cc) {
        this.f35369C = i;
        this.f35370D = i2;
        this.f35371E = i3;
        this.f35372F = c0842cc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2923dc)) {
            return false;
        }
        C2923dc c2923dc = (C2923dc) obj;
        return c2923dc.f35369C == this.f35369C && c2923dc.f35370D == this.f35370D && c2923dc.f35371E == this.f35371E && c2923dc.f35372F == this.f35372F;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f35369C), Integer.valueOf(this.f35370D), Integer.valueOf(this.f35371E), this.f35372F);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f35372F);
        sb.append(", ");
        sb.append(this.f35370D);
        sb.append("-byte IV, ");
        sb.append(this.f35371E);
        sb.append("-byte tag, and ");
        return wq1.m24123s(sb, this.f35369C, "-byte key)");
    }
}
