package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zqa extends qra {

    /* JADX INFO: renamed from: a */
    public final int f71988a;

    public zqa(int i) {
        this.f71988a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqa) && this.f71988a == ((zqa) obj).f71988a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71988a);
    }

    public final String toString() {
        return ux5.m22989l("ProgressBarChanged(sentencePosition=", this.f71988a, ")");
    }
}
