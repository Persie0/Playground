package p021j$.time.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p021j$.time.chrono.AbstractC0422d;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.k */
/* JADX INFO: loaded from: classes3.dex */
final class C0443k implements InterfaceC0439g {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f32942c = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a */
    private final FormatStyle f32943a;

    /* JADX INFO: renamed from: b */
    private final FormatStyle f32944b;

    C0443k(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.f32943a = formatStyle;
        this.f32944b = formatStyle2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        DateFormat timeInstance;
        AbstractC0422d.m12266b(c0455w.m12312d());
        Locale localeM12311c = c0455w.m12311c();
        String string = localeM12311c.toString();
        FormatStyle formatStyle = this.f32943a;
        String strValueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.f32944b;
        String str = "ISO|" + string + "|" + strValueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = f32942c;
        DateTimeFormatter dateTimeFormatterM12308w = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatterM12308w == null) {
            if (formatStyle == null && formatStyle2 == null) {
                throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
            }
            if (formatStyle2 == null) {
                timeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), localeM12311c);
            } else {
                timeInstance = formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), localeM12311c) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), localeM12311c);
            }
            if (!(timeInstance instanceof SimpleDateFormat)) {
                throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(timeInstance)));
            }
            String pattern = ((SimpleDateFormat) timeInstance).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                int i = 0;
                boolean z = pattern.indexOf(66) != -1;
                boolean z2 = pattern.indexOf(98) != -1;
                if (z || z2) {
                    StringBuilder sb2 = new StringBuilder(pattern.length());
                    char c = ' ';
                    while (i < pattern.length()) {
                        char cCharAt = pattern.charAt(i);
                        if (cCharAt != ' ') {
                            if (cCharAt != 'B' && cCharAt != 'b') {
                                sb2.append(cCharAt);
                            }
                        } else if (i == 0 || (c != 'B' && c != 'b')) {
                            sb2.append(cCharAt);
                        }
                        i++;
                        c = cCharAt;
                    }
                    int length = sb2.length() - 1;
                    if (length >= 0 && sb2.charAt(length) == ' ') {
                        sb2.deleteCharAt(length);
                    }
                    pattern = sb2.toString();
                }
            }
            C0453u c0453u = new C0453u();
            c0453u.m12296j(pattern);
            dateTimeFormatterM12308w = c0453u.m12308w(localeM12311c);
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, dateTimeFormatterM12308w);
            if (dateTimeFormatter != null) {
                dateTimeFormatterM12308w = dateTimeFormatter;
            }
        }
        dateTimeFormatterM12308w.m12273e().mo12277a(c0455w, sb);
        return true;
    }

    public final String toString() {
        Object obj = this.f32943a;
        if (obj == null) {
            obj = "";
        }
        String strValueOf = String.valueOf(obj);
        FormatStyle formatStyle = this.f32944b;
        return "Localized(" + strValueOf + "," + String.valueOf(formatStyle != null ? formatStyle : "") + ")";
    }
}
