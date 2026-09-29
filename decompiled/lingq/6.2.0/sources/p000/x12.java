package p000;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes.dex */
public final class x12 extends q12 {
    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f57124b;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        LocalDateTime localDateTime = (LocalDateTime) ir7Var;
        DateTimeFieldType dateTimeFieldType = this.f57123a;
        if (!localDateTime.m18371e(dateTimeFieldType)) {
            ((StringBuilder) appendable).append((char) 65533);
            return;
        }
        try {
            nc3.m17346b(localDateTime.m18368b(dateTimeFieldType), (StringBuilder) appendable);
        } catch (RuntimeException unused) {
            ((StringBuilder) appendable).append((char) 65533);
        }
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        try {
            nc3.m17346b(this.f57123a.mo18335b(s11Var).mo3734b(j), (StringBuilder) appendable);
        } catch (RuntimeException unused) {
            ((StringBuilder) appendable).append((char) 65533);
        }
    }
}
