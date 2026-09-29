package p000;

import com.lingq.core.domain.model.user.ImportData;

/* JADX INFO: loaded from: classes2.dex */
public final class le6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final ImportData f49546a;

    public le6(ImportData importData) {
        this.f49546a = importData;
    }

    /* JADX INFO: renamed from: a */
    public final ImportData m16145a() {
        return this.f49546a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le6) && this.f49546a.equals(((le6) obj).f49546a);
    }

    public final int hashCode() {
        return this.f49546a.hashCode();
    }

    public final String toString() {
        return "Import(importData=" + this.f49546a + ")";
    }
}
