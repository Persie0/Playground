package p000;

/* JADX INFO: renamed from: ed */
/* JADX INFO: loaded from: classes2.dex */
public final class C2960ed {

    /* JADX INFO: renamed from: a */
    public final String f37027a;

    /* JADX INFO: renamed from: b */
    public final String f37028b;

    /* JADX INFO: renamed from: c */
    public final String f37029c;

    public C2960ed(String str, String str2, String str3) {
        this.f37027a = str;
        this.f37028b = str2;
        this.f37029c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2960ed)) {
            return false;
        }
        C2960ed c2960ed = (C2960ed) obj;
        return this.f37027a.equals(c2960ed.f37027a) && this.f37028b.equals(c2960ed.f37028b) && this.f37029c.equals(c2960ed.f37029c);
    }

    public final int hashCode() {
        return this.f37029c.hashCode() + ux5.m22980c(this.f37027a.hashCode() * 31, this.f37028b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("AiVoiceSample(audioUrl=", this.f37027a, ", standardAudioUrl=", this.f37028b, ", text="), this.f37029c, ")");
    }
}
