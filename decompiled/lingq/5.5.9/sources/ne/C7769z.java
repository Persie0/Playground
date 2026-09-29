package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.z */
/* JADX INFO: loaded from: classes.dex */
public final class C7769z extends AbstractC7747d0.b {

    /* JADX INFO: renamed from: a */
    public final int f42683a;

    /* JADX INFO: renamed from: b */
    public final String f42684b;

    /* JADX INFO: renamed from: c */
    public final int f42685c;

    /* JADX INFO: renamed from: d */
    public final long f42686d;

    /* JADX INFO: renamed from: e */
    public final long f42687e;

    /* JADX INFO: renamed from: f */
    public final boolean f42688f;

    /* JADX INFO: renamed from: g */
    public final int f42689g;

    /* JADX INFO: renamed from: h */
    public final String f42690h;

    /* JADX INFO: renamed from: i */
    public final String f42691i;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C7769z(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f42683a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f42684b = str;
        this.f42685c = i11;
        this.f42686d = j10;
        this.f42687e = j11;
        this.f42688f = z10;
        this.f42689g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f42690h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f42691i = str3;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: a */
    public final int mo15455a() {
        return this.f42683a;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: b */
    public final int mo15456b() {
        return this.f42685c;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: c */
    public final long mo15457c() {
        return this.f42687e;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: d */
    public final boolean mo15458d() {
        return this.f42688f;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: e */
    public final String mo15459e() {
        return this.f42690h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7747d0.b)) {
            return false;
        }
        AbstractC7747d0.b bVar = (AbstractC7747d0.b) obj;
        return this.f42683a == bVar.mo15455a() && this.f42684b.equals(bVar.mo15460f()) && this.f42685c == bVar.mo15456b() && this.f42686d == bVar.mo15463i() && this.f42687e == bVar.mo15457c() && this.f42688f == bVar.mo15458d() && this.f42689g == bVar.mo15462h() && this.f42690h.equals(bVar.mo15459e()) && this.f42691i.equals(bVar.mo15461g());
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: f */
    public final String mo15460f() {
        return this.f42684b;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: g */
    public final String mo15461g() {
        return this.f42691i;
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: h */
    public final int mo15462h() {
        return this.f42689g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f42683a ^ 1000003) * 1000003) ^ this.f42684b.hashCode()) * 1000003) ^ this.f42685c) * 1000003;
        long j10 = this.f42686d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f42687e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f42688f ? 1231 : 1237)) * 1000003) ^ this.f42689g) * 1000003) ^ this.f42690h.hashCode()) * 1000003) ^ this.f42691i.hashCode();
    }

    @Override // ne.AbstractC7747d0.b
    /* JADX INFO: renamed from: i */
    public final long mo15463i() {
        return this.f42686d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f42683a);
        sb2.append(", model=");
        sb2.append(this.f42684b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f42685c);
        sb2.append(", totalRam=");
        sb2.append(this.f42686d);
        sb2.append(", diskSpace=");
        sb2.append(this.f42687e);
        sb2.append(", isEmulator=");
        sb2.append(this.f42688f);
        sb2.append(", state=");
        sb2.append(this.f42689g);
        sb2.append(", manufacturer=");
        sb2.append(this.f42690h);
        sb2.append(", modelClass=");
        return C0009a.m23l(sb2, this.f42691i, "}");
    }
}
