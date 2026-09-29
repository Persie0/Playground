package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g4b {

    /* JADX INFO: renamed from: a */
    public final String f40214a;

    /* JADX INFO: renamed from: b */
    public final int f40215b;

    public g4b(String str, int i) {
        this.f40214a = str;
        this.f40215b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b)) {
            return false;
        }
        g4b g4bVar = (g4b) obj;
        return this.f40214a.equals(g4bVar.f40214a) && this.f40215b == g4bVar.f40215b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40215b) + (this.f40214a.hashCode() * 31);
    }

    public final String toString() {
        return "WhatYouGetTileData(emoji=" + this.f40214a + ", labelRes=" + this.f40215b + ")";
    }
}
