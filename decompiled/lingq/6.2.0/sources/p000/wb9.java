package p000;

import androidx.compose.material3.SnackbarDuration;

/* JADX INFO: loaded from: classes2.dex */
public final class wb9 {

    /* JADX INFO: renamed from: a */
    public final String f66595a;

    /* JADX INFO: renamed from: b */
    public final String f66596b;

    /* JADX INFO: renamed from: c */
    public final SnackbarDuration f66597c;

    public wb9(String str, String str2, SnackbarDuration snackbarDuration) {
        this.f66595a = str;
        this.f66596b = str2;
        this.f66597c = snackbarDuration;
    }

    /* JADX INFO: renamed from: a */
    public final String m23837a() {
        return this.f66596b;
    }

    /* JADX INFO: renamed from: b */
    public final SnackbarDuration m23838b() {
        return this.f66597c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wb9.class != obj.getClass()) {
            return false;
        }
        wb9 wb9Var = (wb9) obj;
        return fa4.m11650l(this.f66595a, wb9Var.f66595a) && fa4.m11650l(this.f66596b, wb9Var.f66596b) && this.f66597c == wb9Var.f66597c;
    }

    public final int hashCode() {
        int iHashCode = this.f66595a.hashCode() * 31;
        String str = this.f66596b;
        return this.f66597c.hashCode() + g9a.m12428e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, false);
    }
}
