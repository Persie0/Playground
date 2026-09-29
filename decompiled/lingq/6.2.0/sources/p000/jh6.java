package p000;

import com.lingq.feature.imports.data.UserImportDetailType;

/* JADX INFO: loaded from: classes3.dex */
public final class jh6 implements vg6 {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f45548a;

    public jh6(UserImportDetailType userImportDetailType) {
        this.f45548a = userImportDetailType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh6) && this.f45548a == ((jh6) obj).f45548a;
    }

    public final int hashCode() {
        return this.f45548a.hashCode();
    }

    public final String toString() {
        return "OnAdd(userImportDetailType=" + this.f45548a + ")";
    }
}
