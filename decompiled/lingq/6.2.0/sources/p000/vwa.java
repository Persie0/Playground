package p000;

import com.lingq.core.domain.model.ExportType;

/* JADX INFO: loaded from: classes3.dex */
public final class vwa extends fxa {

    /* JADX INFO: renamed from: a */
    public final ExportType f66033a;

    /* JADX INFO: renamed from: b */
    public final boolean f66034b;

    public vwa(ExportType exportType, boolean z) {
        exportType.getClass();
        this.f66033a = exportType;
        this.f66034b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwa)) {
            return false;
        }
        vwa vwaVar = (vwa) obj;
        return this.f66033a == vwaVar.f66033a && this.f66034b == vwaVar.f66034b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66034b) + (this.f66033a.hashCode() * 31);
    }

    public final String toString() {
        return "OnExportRequested(exportType=" + this.f66033a + ", isExportAll=" + this.f66034b + ")";
    }
}
