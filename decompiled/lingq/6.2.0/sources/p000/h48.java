package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h48 {

    /* JADX INFO: renamed from: a */
    public final boolean f41783a;

    /* JADX INFO: renamed from: b */
    public final ym5 f41784b;

    /* JADX INFO: renamed from: c */
    public final ym5 f41785c;

    public h48(boolean z, ym5 ym5Var, ym5 ym5Var2) {
        this.f41783a = z;
        this.f41784b = ym5Var;
        this.f41785c = ym5Var2;
    }

    /* JADX INFO: renamed from: a */
    public static h48 m13043a(h48 h48Var, boolean z, ym5 ym5Var, ym5 ym5Var2, int i) {
        if ((i & 1) != 0) {
            z = h48Var.f41783a;
        }
        if ((i & 2) != 0) {
            ym5Var = h48Var.f41784b;
        }
        if ((i & 4) != 0) {
            ym5Var2 = h48Var.f41785c;
        }
        h48Var.getClass();
        ym5Var.getClass();
        ym5Var2.getClass();
        return new h48(z, ym5Var, ym5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h48)) {
            return false;
        }
        h48 h48Var = (h48) obj;
        return this.f41783a == h48Var.f41783a && fa4.m11650l(this.f41784b, h48Var.f41784b) && fa4.m11650l(this.f41785c, h48Var.f41785c);
    }

    public final int hashCode() {
        return this.f41785c.hashCode() + ((this.f41784b.hashCode() + (Boolean.hashCode(this.f41783a) * 31)) * 31);
    }

    public final String toString() {
        return "RegistrationUiState(isLoading=" + this.f41783a + ", registrationResult=" + this.f41784b + ", registrationValidationResult=" + this.f41785c + ")";
    }
}
