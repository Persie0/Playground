package p000;

import com.lingq.core.domain.model.ExportType;

/* JADX INFO: loaded from: classes3.dex */
public final class twa extends fxa {

    /* JADX INFO: renamed from: a */
    public final ExportType f63024a;

    /* JADX INFO: renamed from: b */
    public final boolean f63025b;

    public twa(ExportType exportType, boolean z) {
        exportType.getClass();
        this.f63024a = exportType;
        this.f63025b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa)) {
            return false;
        }
        twa twaVar = (twa) obj;
        return this.f63024a == twaVar.f63024a && this.f63025b == twaVar.f63025b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63025b) + (this.f63024a.hashCode() * 31);
    }

    public final String toString() {
        return "OnExportConfirmed(exportType=" + this.f63024a + ", isExportAll=" + this.f63025b + ")";
    }
}
