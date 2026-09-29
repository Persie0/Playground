package p000;

import com.lingq.feature.imports.data.UserImportSourceType;

/* JADX INFO: loaded from: classes3.dex */
public final class vka {

    /* JADX INFO: renamed from: a */
    public final g24 f65547a;

    /* JADX INFO: renamed from: b */
    public final UserImportSourceType f65548b;

    public vka(g24 g24Var, UserImportSourceType userImportSourceType) {
        g24Var.getClass();
        userImportSourceType.getClass();
        this.f65547a = g24Var;
        this.f65548b = userImportSourceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        return fa4.m11650l(this.f65547a, vkaVar.f65547a) && this.f65548b == vkaVar.f65548b;
    }

    public final int hashCode() {
        return this.f65548b.hashCode() + (this.f65547a.hashCode() * 31);
    }

    public final String toString() {
        return "UserImportScreenState(importUiState=" + this.f65547a + ", type=" + this.f65548b + ")";
    }
}
