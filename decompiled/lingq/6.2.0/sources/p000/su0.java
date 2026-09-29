package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class su0 extends ru0 {

    /* JADX INFO: renamed from: a */
    public final char f61406a;

    public su0(char c) {
        this.f61406a = c;
    }

    @Override // p000.ru0
    /* JADX INFO: renamed from: a */
    public final boolean mo20819a(char c) {
        return c == this.f61406a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f61406a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
