package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oh5 {

    /* JADX INFO: renamed from: a */
    public final long f54350a;

    /* JADX INFO: renamed from: b */
    public final float f54351b;

    /* JADX INFO: renamed from: c */
    public final long f54352c;

    public oh5(nh5 nh5Var) {
        this.f54350a = nh5Var.f52734a;
        this.f54351b = nh5Var.f52735b;
        this.f54352c = nh5Var.f52736c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5)) {
            return false;
        }
        oh5 oh5Var = (oh5) obj;
        return this.f54350a == oh5Var.f54350a && this.f54351b == oh5Var.f54351b && this.f54352c == oh5Var.f54352c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f54350a), Float.valueOf(this.f54351b), Long.valueOf(this.f54352c));
    }
}
