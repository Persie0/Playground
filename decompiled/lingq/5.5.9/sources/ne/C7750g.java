package ne;

import java.util.Arrays;

/* JADX INFO: renamed from: ne.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7750g extends AbstractC7743b0.d.a {

    /* JADX INFO: renamed from: a */
    public final String f42549a;

    /* JADX INFO: renamed from: b */
    public final byte[] f42550b;

    public C7750g(String str, byte[] bArr) {
        this.f42549a = str;
        this.f42550b = bArr;
    }

    @Override // ne.AbstractC7743b0.d.a
    /* JADX INFO: renamed from: a */
    public final byte[] mo15366a() {
        return this.f42550b;
    }

    @Override // ne.AbstractC7743b0.d.a
    /* JADX INFO: renamed from: b */
    public final String mo15367b() {
        return this.f42549a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.d.a)) {
            return false;
        }
        AbstractC7743b0.d.a aVar = (AbstractC7743b0.d.a) obj;
        if (this.f42549a.equals(aVar.mo15367b())) {
            if (Arrays.equals(this.f42550b, aVar instanceof C7750g ? ((C7750g) aVar).f42550b : aVar.mo15366a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f42549a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f42550b);
    }

    public final String toString() {
        return "File{filename=" + this.f42549a + ", contents=" + Arrays.toString(this.f42550b) + "}";
    }
}
