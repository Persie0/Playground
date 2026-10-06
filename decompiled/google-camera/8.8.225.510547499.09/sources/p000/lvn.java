package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lvn {

    /* JADX INFO: renamed from: a */
    private final ojy f39404a;

    /* JADX INFO: renamed from: b */
    private final ojy f39405b;

    public lvn(byte[] bArr, int i) {
        this.f39404a = lkm.m15593t(new C0910po(bArr, 14));
        this.f39405b = lkm.m15593t(new C0910po(bArr, 15));
        int length = bArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("Decoded id is empty");
        }
        if (length <= i) {
            return;
        }
        throw new IllegalArgumentException("Decoded " + m16093a() + " (encoded " + m16094b() + ") is longer than " + i + "-byte maximum");
    }

    /* JADX INFO: renamed from: a */
    public final String m16093a() {
        return (String) this.f39404a.mo18586a();
    }

    /* JADX INFO: renamed from: b */
    public final String m16094b() {
        Object objMo18586a = this.f39405b.mo18586a();
        objMo18586a.getClass();
        return (String) objMo18586a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lvn) && ooc.m18737c(((lvn) obj).m16093a(), m16093a());
    }

    public final int hashCode() {
        return m16094b().hashCode() * 31;
    }

    public final String toString() {
        return "F250Id(decodedId=" + m16093a() + ", encodedId=" + m16094b() + ")";
    }

    public lvn(byte[] bArr) {
        this(bArr, 24);
    }
}
