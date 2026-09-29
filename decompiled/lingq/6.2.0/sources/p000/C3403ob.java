package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ob */
/* JADX INFO: loaded from: classes.dex */
public final class C3403ob extends AbstractC3489q9 {

    /* JADX INFO: renamed from: C */
    public final int f54121C;

    /* JADX INFO: renamed from: D */
    public final int f54122D;

    /* JADX INFO: renamed from: E */
    public final int f54123E;

    /* JADX INFO: renamed from: F */
    public final C3366nb f54124F;

    public C3403ob(int i, int i2, int i3, C3366nb c3366nb) {
        this.f54121C = i;
        this.f54122D = i2;
        this.f54123E = i3;
        this.f54124F = c3366nb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3403ob)) {
            return false;
        }
        C3403ob c3403ob = (C3403ob) obj;
        return c3403ob.f54121C == this.f54121C && c3403ob.f54122D == this.f54122D && c3403ob.f54123E == this.f54123E && c3403ob.f54124F == this.f54124F;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f54121C), Integer.valueOf(this.f54122D), Integer.valueOf(this.f54123E), this.f54124F);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f54124F);
        sb.append(", ");
        sb.append(this.f54122D);
        sb.append("-byte IV, ");
        sb.append(this.f54123E);
        sb.append("-byte tag, and ");
        return wq1.m24123s(sb, this.f54121C, "-byte key)");
    }
}
