package p000;

import com.lingq.feature.imports.data.UserImportDetailType;

/* JADX INFO: loaded from: classes3.dex */
public final class s14 extends t14 {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f60147a;

    public s14(UserImportDetailType userImportDetailType) {
        userImportDetailType.getClass();
        this.f60147a = userImportDetailType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s14) && this.f60147a == ((s14) obj).f60147a;
    }

    public final int hashCode() {
        return this.f60147a.hashCode();
    }

    public final String toString() {
        return "OnSectionSelected(userImportDetailType=" + this.f60147a + ")";
    }
}
