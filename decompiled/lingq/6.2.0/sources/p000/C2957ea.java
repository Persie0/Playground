package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ea */
/* JADX INFO: loaded from: classes.dex */
public final class C2957ea extends AbstractC3489q9 {

    /* JADX INFO: renamed from: C */
    public final int f36892C;

    /* JADX INFO: renamed from: D */
    public final int f36893D;

    /* JADX INFO: renamed from: E */
    public final C2920da f36894E;

    public C2957ea(int i, int i2, C2920da c2920da) {
        this.f36892C = i;
        this.f36893D = i2;
        this.f36894E = c2920da;
    }

    /* JADX INFO: renamed from: H */
    public final int m10951H() {
        C2920da c2920da = C2920da.f35227f;
        int i = this.f36893D;
        C2920da c2920da2 = this.f36894E;
        if (c2920da2 == c2920da) {
            return i;
        }
        if (c2920da2 != C2920da.f35224c && c2920da2 != C2920da.f35225d && c2920da2 != C2920da.f35226e) {
            C3386nv.m17633t("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2957ea)) {
            return false;
        }
        C2957ea c2957ea = (C2957ea) obj;
        return c2957ea.f36892C == this.f36892C && c2957ea.m10951H() == m10951H() && c2957ea.f36894E == this.f36894E;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36892C), Integer.valueOf(this.f36893D), this.f36894E);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f36894E);
        sb.append(", ");
        sb.append(this.f36893D);
        sb.append("-byte tags, and ");
        return wq1.m24123s(sb, this.f36892C, "-byte key)");
    }
}
