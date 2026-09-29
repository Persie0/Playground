package p200jf;

import p003a2.C0009a;

/* JADX INFO: renamed from: jf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6469a extends AbstractC6472d {

    /* JADX INFO: renamed from: a */
    public final String f37041a;

    /* JADX INFO: renamed from: b */
    public final String f37042b;

    public C6469a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f37041a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f37042b = str2;
    }

    @Override // p200jf.AbstractC6472d
    /* JADX INFO: renamed from: a */
    public final String mo13077a() {
        return this.f37041a;
    }

    @Override // p200jf.AbstractC6472d
    /* JADX INFO: renamed from: b */
    public final String mo13078b() {
        return this.f37042b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6472d)) {
            return false;
        }
        AbstractC6472d abstractC6472d = (AbstractC6472d) obj;
        return this.f37041a.equals(abstractC6472d.mo13077a()) && this.f37042b.equals(abstractC6472d.mo13078b());
    }

    public final int hashCode() {
        return ((this.f37041a.hashCode() ^ 1000003) * 1000003) ^ this.f37042b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f37041a);
        sb2.append(", version=");
        return C0009a.m23l(sb2, this.f37042b, "}");
    }
}
