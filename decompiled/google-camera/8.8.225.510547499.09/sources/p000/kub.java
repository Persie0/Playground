package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kub {

    /* JADX INFO: renamed from: a */
    private final Long f37205a;

    /* JADX INFO: renamed from: b */
    private final int f37206b;

    public kub() {
    }

    public kub(Long l, int i) {
        this.f37205a = l;
        this.f37206b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kub) {
            kub kubVar = (kub) obj;
            if (this.f37205a.equals(kubVar.f37205a) && this.f37206b == kubVar.f37206b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37205a.hashCode() ^ 1000003) * 1000003) ^ this.f37206b;
    }

    public final String toString() {
        return "VerificationFailureKey{protoId=" + this.f37205a + ", verificationFailure=" + Integer.toString(lij.m15407P(this.f37206b)) + "}";
    }
}
