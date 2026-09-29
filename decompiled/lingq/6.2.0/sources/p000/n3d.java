package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class n3d {

    /* JADX INFO: renamed from: a */
    public final String f52305a;

    /* JADX INFO: renamed from: b */
    public final String f52306b;

    /* JADX INFO: renamed from: c */
    public final boolean f52307c;

    public n3d(String str, String str2, boolean z) {
        lda.m16127m(str);
        this.f52305a = str;
        lda.m16127m(str2);
        this.f52306b = str2;
        this.f52307c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m17205a() {
        return this.f52306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3d)) {
            return false;
        }
        n3d n3dVar = (n3d) obj;
        return x74.m24360q(this.f52305a, n3dVar.f52305a) && x74.m24360q(this.f52306b, n3dVar.f52306b) && x74.m24360q(null, null) && this.f52307c == n3dVar.f52307c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52305a, this.f52306b, null, 4225, Boolean.valueOf(this.f52307c)});
    }

    public final String toString() {
        String str = this.f52305a;
        if (str != null) {
            return str;
        }
        lda.m16130p(null);
        throw null;
    }
}
