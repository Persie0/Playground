package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lz8 {

    /* JADX INFO: renamed from: a */
    public final String f50355a;

    public lz8(String str) {
        str.getClass();
        this.f50355a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz8) && fa4.m11650l(this.f50355a, ((lz8) obj).f50355a);
    }

    public final int hashCode() {
        return this.f50355a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("SessionDetails(sessionId="), this.f50355a, ')');
    }
}
