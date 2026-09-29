package p000;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes.dex */
public class r12 extends q12 {

    /* JADX INFO: renamed from: d */
    public final int f58482d;

    public r12(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
        super(dateTimeFieldType, i, z);
        this.f58482d = i2;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f57124b;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        LocalDateTime localDateTime = (LocalDateTime) ir7Var;
        DateTimeFieldType dateTimeFieldType = this.f57123a;
        boolean zM18371e = localDateTime.m18371e(dateTimeFieldType);
        int i = this.f58482d;
        if (!zM18371e) {
            y12.m24827n(i, (StringBuilder) appendable);
            return;
        }
        try {
            nc3.m17345a(appendable, localDateTime.m18368b(dateTimeFieldType), i);
        } catch (RuntimeException unused) {
            y12.m24827n(i, (StringBuilder) appendable);
        }
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        int i2 = this.f58482d;
        try {
            nc3.m17345a(appendable, this.f57123a.mo18335b(s11Var).mo3734b(j), i2);
        } catch (RuntimeException unused) {
            y12.m24827n(i2, (StringBuilder) appendable);
        }
    }
}
