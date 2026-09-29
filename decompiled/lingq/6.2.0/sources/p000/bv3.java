package p000;

import com.lingq.core.domain.model.user.ImportData;

/* JADX INFO: loaded from: classes2.dex */
public final class bv3 extends fv3 {

    /* JADX INFO: renamed from: a */
    public final ImportData f9048a;

    public bv3(ImportData importData) {
        this.f9048a = importData;
    }

    /* JADX INFO: renamed from: a */
    public final ImportData m4193a() {
        return this.f9048a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv3) && fa4.m11650l(this.f9048a, ((bv3) obj).f9048a);
    }

    public final int hashCode() {
        ImportData importData = this.f9048a;
        if (importData == null) {
            return 0;
        }
        return importData.hashCode();
    }

    public final String toString() {
        return "NavigateImport(importData=" + this.f9048a + ")";
    }
}
