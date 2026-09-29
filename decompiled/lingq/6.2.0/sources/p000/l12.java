package p000;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class l12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final char f48894a;

    public l12(char c) {
        this.f48894a = c;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return 1;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return 1;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.f48894a;
        return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        ((StringBuilder) appendable).append(this.f48894a);
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        ((StringBuilder) appendable).append(this.f48894a);
    }
}
