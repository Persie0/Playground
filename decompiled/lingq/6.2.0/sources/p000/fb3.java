package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fb3 {

    /* JADX INFO: renamed from: a */
    public String f38766a;

    /* JADX INFO: renamed from: b */
    public String f38767b;

    /* JADX INFO: renamed from: c */
    public List f38768c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb3)) {
            return false;
        }
        fb3 fb3Var = (fb3) obj;
        return Objects.equals(this.f38766a, fb3Var.f38766a) && Objects.equals(this.f38767b, fb3Var.f38767b) && Objects.equals(this.f38768c, fb3Var.f38768c);
    }

    public final int hashCode() {
        return Objects.hash(this.f38766a, this.f38767b, this.f38768c);
    }
}
