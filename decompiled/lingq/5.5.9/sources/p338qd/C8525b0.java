package p338qd;

/* JADX INFO: renamed from: qd.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8525b0 extends AbstractC8559m1 {

    /* JADX INFO: renamed from: a */
    public final int f45791a;

    /* JADX INFO: renamed from: b */
    public final String f45792b;

    /* JADX INFO: renamed from: c */
    public final long f45793c;

    /* JADX INFO: renamed from: d */
    public final long f45794d;

    /* JADX INFO: renamed from: e */
    public final int f45795e;

    public C8525b0(int i10, String str, long j10, long j11, int i11) {
        this.f45791a = i10;
        this.f45792b = str;
        this.f45793c = j10;
        this.f45794d = j11;
        this.f45795e = i11;
    }

    @Override // p338qd.AbstractC8559m1
    /* JADX INFO: renamed from: a */
    public final int mo16634a() {
        return this.f45791a;
    }

    @Override // p338qd.AbstractC8559m1
    /* JADX INFO: renamed from: b */
    public final int mo16635b() {
        return this.f45795e;
    }

    @Override // p338qd.AbstractC8559m1
    /* JADX INFO: renamed from: c */
    public final long mo16636c() {
        return this.f45793c;
    }

    @Override // p338qd.AbstractC8559m1
    /* JADX INFO: renamed from: d */
    public final long mo16637d() {
        return this.f45794d;
    }

    @Override // p338qd.AbstractC8559m1
    /* JADX INFO: renamed from: e */
    public final String mo16638e() {
        return this.f45792b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8559m1) {
            AbstractC8559m1 abstractC8559m1 = (AbstractC8559m1) obj;
            if (this.f45791a == abstractC8559m1.mo16634a() && ((str = this.f45792b) != null ? str.equals(abstractC8559m1.mo16638e()) : abstractC8559m1.mo16638e() == null) && this.f45793c == abstractC8559m1.mo16636c() && this.f45794d == abstractC8559m1.mo16637d() && this.f45795e == abstractC8559m1.mo16635b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f45791a ^ 1000003) * 1000003;
        String str = this.f45792b;
        int iHashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f45793c;
        int i11 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f45794d;
        return ((i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45795e;
    }

    public final String toString() {
        String str = this.f45792b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(this.f45791a);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(this.f45793c);
        sb2.append(", remainingBytes=");
        sb2.append(this.f45794d);
        sb2.append(", previousChunk=");
        sb2.append(this.f45795e);
        sb2.append("}");
        return sb2.toString();
    }
}
