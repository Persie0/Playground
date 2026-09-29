package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class exa extends fxa {

    /* JADX INFO: renamed from: a */
    public final sxa f38056a;

    public exa(sxa sxaVar) {
        sxaVar.getClass();
        this.f38056a = sxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exa) && fa4.m11650l(this.f38056a, ((exa) obj).f38056a);
    }

    public final int hashCode() {
        return this.f38056a.hashCode();
    }

    public final String toString() {
        return "OnTtsClicked(card=" + this.f38056a + ")";
    }
}
