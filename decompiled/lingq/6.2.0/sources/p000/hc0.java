package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hc0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f42148e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f42149a;

    /* JADX INFO: renamed from: b */
    public final int f42150b;

    /* JADX INFO: renamed from: c */
    public int f42151c;

    /* JADX INFO: renamed from: d */
    public char f42152d;

    static {
        for (int i = 0; i < 1792; i++) {
            f42148e[i] = Character.getDirectionality(i);
        }
    }

    public hc0(CharSequence charSequence) {
        this.f42149a = charSequence;
        this.f42150b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m13187a() {
        int i = this.f42151c - 1;
        CharSequence charSequence = this.f42149a;
        char cCharAt = charSequence.charAt(i);
        this.f42152d = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.f42151c;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.f42151c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f42151c = i2 - 1;
        char c = this.f42152d;
        return c < 1792 ? f42148e[c] : Character.getDirectionality(c);
    }
}
