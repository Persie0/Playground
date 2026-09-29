package p000;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class s12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final String f60146a;

    public s12(String str) {
        this.f60146a = str;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f60146a.length();
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f60146a.length();
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        String str = this.f60146a;
        return y12.m24829p(str, charSequence, i) ? str.length() + i : ~i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        ((StringBuilder) appendable).append((CharSequence) this.f60146a);
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        ((StringBuilder) appendable).append((CharSequence) this.f60146a);
    }
}
