package p000;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.MillisDurationField;

/* JADX INFO: loaded from: classes.dex */
public final class o12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f53581a;

    /* JADX INFO: renamed from: b */
    public final int f53582b;

    /* JADX INFO: renamed from: c */
    public final int f53583c;

    public o12(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        this.f53581a = dateTimeFieldType;
        i2 = i2 > 18 ? 18 : i2;
        this.f53582b = i;
        this.f53583c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m17752a(StringBuilder sb, long j, s11 s11Var) {
        long j2;
        f12 f12VarMo18335b = this.f53581a.mo18335b(s11Var);
        int i = this.f53582b;
        try {
            long jMo4685v = f12VarMo18335b.mo4685v(j);
            if (jMo4685v == 0) {
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    } else {
                        sb.append('0');
                    }
                }
            } else {
                long jMo11271d = f12VarMo18335b.mo4682i().mo11271d();
                int i2 = this.f53583c;
                while (true) {
                    switch (i2) {
                        case 1:
                            j2 = 10;
                            break;
                        case 2:
                            j2 = 100;
                            break;
                        case 3:
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            j2 = 10000000;
                            break;
                        case 8:
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            j2 = 10000000000000L;
                            break;
                        case 14:
                            j2 = 100000000000000L;
                            break;
                        case 15:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case 17:
                            j2 = 100000000000000000L;
                            break;
                        case 18:
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            j2 = 1;
                            break;
                    }
                    if ((jMo11271d * j2) / j2 == jMo11271d) {
                        long[] jArr = {(jMo4685v * j2) / jMo11271d, i2};
                        long j3 = jArr[0];
                        int i3 = (int) jArr[1];
                        String string = (2147483647L & j3) == j3 ? Integer.toString((int) j3) : Long.toString(j3);
                        int length = string.length();
                        while (length < i3) {
                            sb.append('0');
                            i--;
                            i3--;
                        }
                        if (i < i3) {
                            while (i < i3 && length > 1 && string.charAt(length - 1) == '0') {
                                i3--;
                                length--;
                            }
                            if (length < string.length()) {
                                for (int i4 = 0; i4 < length; i4++) {
                                    sb.append(string.charAt(i4));
                                }
                                return;
                            }
                        }
                        sb.append((CharSequence) string);
                        return;
                    }
                    i2--;
                }
            }
        } catch (RuntimeException unused) {
            y12.m24827n(i, sb);
        }
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f53583c;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f53583c;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        f12 f12VarMo18335b = this.f53581a.mo18335b(b22Var.m3184e());
        int iMin = Math.min(this.f53583c, charSequence.length() - i);
        long jMo11271d = f12VarMo18335b.mo4682i().mo11271d() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < iMin) {
            char cCharAt = charSequence.charAt(i + i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i2++;
            jMo11271d /= 10;
            j += ((long) (cCharAt - '0')) * jMo11271d;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            b22Var.m3189j(new bi7(DateTimeFieldType.f54815R, MillisDurationField.f54920a, f12VarMo18335b.mo4682i()), (int) j2);
            return i + i2;
        }
        return ~i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        LocalDateTime localDateTime = (LocalDateTime) ir7Var;
        BaseChronology baseChronology = (BaseChronology) localDateTime.m18369c();
        baseChronology.getClass();
        long jMo3733B = 0;
        for (int i = 0; i < 4; i++) {
            jMo3733B = localDateTime.m18991a(i).mo18335b(baseChronology).mo3733B(localDateTime.m18370d(i), jMo3733B);
        }
        m17752a((StringBuilder) appendable, jMo3733B, localDateTime.m18369c());
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        m17752a((StringBuilder) appendable, j, s11Var);
    }
}
