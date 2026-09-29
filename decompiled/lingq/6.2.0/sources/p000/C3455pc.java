package p000;

import java.util.Objects;

/* JADX INFO: renamed from: pc */
/* JADX INFO: loaded from: classes.dex */
public final class C3455pc extends AbstractC3489q9 {

    /* JADX INFO: renamed from: C */
    public final int f55935C;

    /* JADX INFO: renamed from: D */
    public final C3404oc f55936D;

    public C3455pc(int i, C3404oc c3404oc) {
        this.f55935C = i;
        this.f55936D = c3404oc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3455pc)) {
            return false;
        }
        C3455pc c3455pc = (C3455pc) obj;
        return c3455pc.f55935C == this.f55935C && c3455pc.f55936D == this.f55936D;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55935C), this.f55936D);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f55936D);
        sb.append(", ");
        return wq1.m24123s(sb, this.f55935C, "-byte key)");
    }
}
