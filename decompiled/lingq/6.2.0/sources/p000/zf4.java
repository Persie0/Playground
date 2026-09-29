package p000;

import kotlinx.serialization.json.AbstractC3264d;

/* JADX INFO: loaded from: classes3.dex */
public final class zf4 extends AbstractC3264d {

    /* JADX INFO: renamed from: a */
    public final boolean f71489a;

    /* JADX INFO: renamed from: b */
    public final String f71490b;

    public zf4(Object obj, boolean z) {
        obj.getClass();
        this.f71489a = z;
        this.f71490b = obj.toString();
    }

    @Override // kotlinx.serialization.json.AbstractC3264d
    /* JADX INFO: renamed from: d */
    public final String mo15621d() {
        return this.f71490b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zf4.class != obj.getClass()) {
            return false;
        }
        zf4 zf4Var = (zf4) obj;
        return this.f71489a == zf4Var.f71489a && fa4.m11650l(this.f71490b, zf4Var.f71490b);
    }

    public final int hashCode() {
        return this.f71490b.hashCode() + (Boolean.hashCode(this.f71489a) * 31);
    }

    @Override // kotlinx.serialization.json.AbstractC3264d
    public final String toString() {
        boolean z = this.f71489a;
        String str = this.f71490b;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        rk9.m20682a(str, sb);
        return sb.toString();
    }
}
