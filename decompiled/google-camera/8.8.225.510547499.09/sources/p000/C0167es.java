package p000;

import android.os.PowerManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: renamed from: es */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0167es {
    /* JADX INFO: renamed from: a */
    static String m7752a(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: b */
    static boolean m7753b(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: e */
    public static String m7754e(bfl bflVar) {
        TimeZone timeZone;
        StringBuffer stringBuffer = new StringBuffer();
        DecimalFormat decimalFormat = new DecimalFormat(BcwGDRhrTsnlj.VnAvXx, new DecimalFormatSymbols(Locale.ENGLISH));
        stringBuffer.append(decimalFormat.format(bflVar.f3098a));
        if (bflVar.f3099b == 0) {
            return stringBuffer.toString();
        }
        decimalFormat.applyPattern("'-'00");
        stringBuffer.append(decimalFormat.format(bflVar.f3099b));
        int i = bflVar.f3100c;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(decimalFormat.format(i));
        if (bflVar.f3101d != 0 || bflVar.f3102e != 0 || bflVar.f3103f != 0 || bflVar.f3105h != 0 || ((timeZone = bflVar.f3104g) != null && timeZone.getRawOffset() != 0)) {
            stringBuffer.append('T');
            decimalFormat.applyPattern("00");
            stringBuffer.append(decimalFormat.format(bflVar.f3101d));
            stringBuffer.append(':');
            stringBuffer.append(decimalFormat.format(bflVar.f3102e));
            int i2 = bflVar.f3103f;
            if (i2 != 0) {
                double d = bflVar.f3105h;
                decimalFormat.applyPattern(":00.#########");
                double d2 = i2;
                Double.isNaN(d);
                Double.isNaN(d2);
                stringBuffer.append(decimalFormat.format(d2 + (d / 1.0E9d)));
            } else if (bflVar.f3105h != 0) {
                i2 = 0;
                double d3 = bflVar.f3105h;
                decimalFormat.applyPattern(":00.#########");
                double d4 = i2;
                Double.isNaN(d3);
                Double.isNaN(d4);
                stringBuffer.append(decimalFormat.format(d4 + (d3 / 1.0E9d)));
            }
            if (bflVar.f3104g != null) {
                int offset = bflVar.f3104g.getOffset(bflVar.m2315a().getTimeInMillis());
                if (offset == 0) {
                    stringBuffer.append('Z');
                } else {
                    int i3 = offset / 3600000;
                    int iAbs = Math.abs((offset % 3600000) / 60000);
                    decimalFormat.applyPattern("+00;-00");
                    stringBuffer.append(decimalFormat.format(i3));
                    decimalFormat.applyPattern(":00");
                    stringBuffer.append(decimalFormat.format(iAbs));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: f */
    public static bfl m7755f(String str) throws bfc {
        boolean z;
        int i;
        int iM7574f;
        int i2;
        if (str == null || str.length() == 0) {
            throw new bfc("Empty convert-string", 5);
        }
        bfl bflVar = new bfl();
        C0168et.m7840i(str);
        ent entVar = new ent(str);
        int i3 = 0;
        if (entVar.m7573e(0) == 'T') {
            z = true;
        } else if (entVar.m7575g() < 2 || entVar.m7573e(1) != ':') {
            z = entVar.m7575g() >= 3 && entVar.m7573e(2) == ':';
        } else {
            z = true;
        }
        if (!z) {
            if (entVar.m7573e(0) == '-') {
                entVar.m7576h();
            }
            int iM7574f2 = entVar.m7574f("Invalid year in date string", 9999);
            if (entVar.m7577i() && entVar.m7572d() != '-') {
                throw new bfc("Invalid date string, after year", 5);
            }
            if (entVar.m7573e(0) == '-') {
                iM7574f2 = -iM7574f2;
            }
            bflVar.f3098a = Math.min(Math.abs(iM7574f2), 9999);
            if (entVar.m7577i()) {
                entVar.m7576h();
                int iM7574f3 = entVar.m7574f("Invalid month in date string", 12);
                if (entVar.m7577i() && entVar.m7572d() != '-') {
                    throw new bfc("Invalid date string, after month", 5);
                }
                bflVar.m2317c(iM7574f3);
                if (entVar.m7577i()) {
                    entVar.m7576h();
                    int iM7574f4 = entVar.m7574f("Invalid day in date string", 31);
                    if (entVar.m7577i() && entVar.m7572d() != 'T') {
                        throw new bfc("Invalid date string, after day", 5);
                    }
                    bflVar.m2316b(iM7574f4);
                    if (entVar.m7577i()) {
                    }
                }
            }
            return bflVar;
        }
        bflVar.m2317c(1);
        bflVar.m2316b(1);
        if (entVar.m7572d() == 'T') {
            entVar.m7576h();
        } else if (!z) {
            throw new bfc("Invalid date string, missing 'T' after date", 5);
        }
        int iM7574f5 = entVar.m7574f("Invalid hour in date string", 23);
        if (entVar.m7572d() != ':') {
            throw new bfc("Invalid date string, after hour", 5);
        }
        bflVar.f3101d = Math.min(Math.abs(iM7574f5), 23);
        entVar.m7576h();
        int iM7574f6 = entVar.m7574f("Invalid minute in date string", 59);
        if (entVar.m7577i() && entVar.m7572d() != ':' && entVar.m7572d() != 'Z' && entVar.m7572d() != '+' && entVar.m7572d() != '-') {
            throw new bfc("Invalid date string, after minute", 5);
        }
        bflVar.f3102e = Math.min(Math.abs(iM7574f6), 59);
        if (entVar.m7572d() == ':') {
            entVar.m7576h();
            int iM7574f7 = entVar.m7574f("Invalid whole seconds in date string", 59);
            if (entVar.m7577i() && entVar.m7572d() != '.' && entVar.m7572d() != 'Z' && entVar.m7572d() != '+' && entVar.m7572d() != '-') {
                throw new bfc("Invalid date string, after whole seconds", 5);
            }
            bflVar.f3103f = Math.min(Math.abs(iM7574f7), 59);
            if (entVar.m7572d() == '.') {
                entVar.m7576h();
                int i4 = entVar.f14790a;
                int iM7574f8 = entVar.m7574f("Invalid fractional seconds in date string", 999999999);
                if (entVar.m7572d() != 'Z' && entVar.m7572d() != '+' && entVar.m7572d() != '-') {
                    throw new bfc("Invalid date string, after fractional second", 5);
                }
                int i5 = entVar.f14790a - i4;
                while (i5 > 9) {
                    iM7574f8 /= 10;
                    i5--;
                }
                while (i5 < 9) {
                    iM7574f8 *= 10;
                    i5++;
                }
                bflVar.f3105h = iM7574f8;
            }
        }
        if (entVar.m7572d() == 'Z') {
            entVar.m7576h();
            i = 0;
            iM7574f = 0;
        } else if (entVar.m7577i()) {
            if (entVar.m7572d() == '+') {
                i2 = 1;
            } else {
                if (entVar.m7572d() != '-') {
                    throw new bfc("Time zone must begin with 'Z', '+', or '-'", 5);
                }
                i2 = -1;
            }
            entVar.m7576h();
            int iM7574f9 = entVar.m7574f("Invalid time zone hour in date string", 23);
            if (entVar.m7572d() != ':') {
                throw new bfc("Invalid date string, after time zone hour", 5);
            }
            entVar.m7576h();
            iM7574f = entVar.m7574f("Invalid time zone minute in date string", 59);
            i = i2;
            i3 = iM7574f9;
        } else {
            i = 0;
            iM7574f = 0;
        }
        bflVar.f3104g = new SimpleTimeZone(((i3 * 3600000) + (iM7574f * 60000)) * i, xRFdVyfdeve.lOHQBE);
        if (entVar.m7577i()) {
            throw new bfc("Invalid date string, extra chars at end", 5);
        }
        return bflVar;
    }

    /* JADX INFO: renamed from: c */
    public void mo2034c(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX INFO: renamed from: d */
    public void mo2035d(int i) {
    }
}
