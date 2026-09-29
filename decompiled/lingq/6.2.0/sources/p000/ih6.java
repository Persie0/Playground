package p000;

import com.lingq.feature.imports.data.UserImportDetailType;

/* JADX INFO: loaded from: classes3.dex */
public final class ih6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f44112a;

    public ih6(UserImportDetailType userImportDetailType) {
        userImportDetailType.getClass();
        this.f44112a = userImportDetailType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih6) && this.f44112a == ((ih6) obj).f44112a;
    }

    public final int hashCode() {
        return this.f44112a.hashCode();
    }

    public final String toString() {
        return "OnSelection(userImportDetailType=" + this.f44112a + ")";
    }
}
