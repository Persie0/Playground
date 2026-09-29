package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fc4 {

    /* JADX INFO: renamed from: a */
    public final String f38844a;

    /* JADX INFO: renamed from: b */
    public final String f38845b;

    /* JADX INFO: renamed from: c */
    public final String f38846c;

    public fc4(String str, String str2, String str3) {
        this.f38844a = str;
        this.f38845b = str2;
        this.f38846c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc4)) {
            return false;
        }
        fc4 fc4Var = (fc4) obj;
        return Objects.equals(this.f38844a, fc4Var.f38844a) && Objects.equals(this.f38845b, fc4Var.f38845b) && Objects.equals(this.f38846c, fc4Var.f38846c);
    }

    public final int hashCode() {
        return Objects.hash(this.f38844a, this.f38845b, this.f38846c);
    }
}
