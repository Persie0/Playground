package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gx8 {

    /* JADX INFO: renamed from: a */
    public final boolean f41505a;

    /* JADX INFO: renamed from: b */
    public final boolean f41506b;

    public gx8(boolean z, boolean z2) {
        this.f41505a = z;
        this.f41506b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx8)) {
            return false;
        }
        gx8 gx8Var = (gx8) obj;
        return this.f41505a == gx8Var.f41505a && this.f41506b == gx8Var.f41506b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41506b) + (Boolean.hashCode(this.f41505a) * 31);
    }

    public final String toString() {
        return "SentenceModePreferences(sentenceAutoPlayTts=" + this.f41505a + ", sentenceAutoShowTranslation=" + this.f41506b + ")";
    }
}
