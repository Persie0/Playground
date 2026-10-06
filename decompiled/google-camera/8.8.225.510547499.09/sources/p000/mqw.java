package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mqw extends mrc {

    /* JADX INFO: renamed from: a */
    private final char[] f41457a;

    public mqw(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.f41457a = charArray;
        Arrays.sort(charArray);
    }

    @Override // p000.mrc
    /* JADX INFO: renamed from: b */
    public final boolean mo16816b(char c) {
        return Arrays.binarySearch(this.f41457a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.f41457a) {
            sb.append(mrc.m16817c(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
