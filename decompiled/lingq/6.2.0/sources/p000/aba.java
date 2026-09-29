package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class aba {

    /* JADX INFO: renamed from: a */
    public final int f475a;

    /* JADX INFO: renamed from: b */
    public final String f476b;

    public aba(int i, String str) {
        this.f475a = i;
        this.f476b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba abaVar = (aba) obj;
        return this.f475a == abaVar.f475a && this.f476b.equals(abaVar.f476b);
    }

    public final int hashCode() {
        return this.f476b.hashCode() + (Integer.hashCode(this.f475a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f475a, "TransliterationOption(labelRes=", ", value=", this.f476b, ")");
    }
}
