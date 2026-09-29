package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n12 extends r12 {
    @Override // p000.q12, p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        int i2;
        char cCharAt;
        int into = super.parseInto(b22Var, charSequence, i);
        if (into >= 0 && into != (i2 = this.f57124b + i)) {
            if (this.f57125c && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
                i2++;
            }
            if (into > i2) {
                return ~(i2 + 1);
            }
            if (into < i2) {
                return ~into;
            }
        }
        return into;
    }
}
