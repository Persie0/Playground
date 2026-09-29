package org.joda.time.format;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.field.C8122e;
import org.joda.time.field.MillisDurationField;
import org.joda.time.format.C8142d.b;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.C6096c;
import p163hp.InterfaceC6099f;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Object> f44123a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Object f44124b;

    public enum TimeZoneId implements InterfaceC8148j, InterfaceC8146h {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.m16018r().mo16177b());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i10);
            int i11 = i10;
            while (true) {
                if (i11 >= iMin) {
                    string = "";
                    length = i10;
                    break;
                }
                if (charSequence.charAt(i11) == '/') {
                    int i12 = i11 + 1;
                    string = charSequence.subSequence(i10, i12).toString();
                    length = string.length() + i10;
                    if (i11 < length2 - 1) {
                        StringBuilder sbM771r = C0166e.m771r(string);
                        sbM771r.append(charSequence.charAt(i12));
                        string2 = sbM771r.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list != null) {
                        break;
                    }
                    return ~i10;
                }
                i11++;
            }
            String str = null;
            for (int i13 = 0; i13 < list.size(); i13++) {
                String str2 = list.get(i13);
                if (DateTimeFormatterBuilder.m16093n(str2, charSequence, length) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i10;
            }
            DateTimeZone dateTimeZoneM16014c = DateTimeZone.m16014c(string.concat(str));
            c8142d.f44171k = null;
            c8142d.f44165e = dateTimeZoneM16014c;
            return str.length() + length;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.m16022h() : "");
        }

        public void printTo(Appendable appendable, InterfaceC6099f interfaceC6099f, Locale locale) throws IOException {
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$a */
    public static class C8126a implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final char f44125a;

        public C8126a(char c10) {
            this.f44125a = c10;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            char upperCase;
            char upperCase2;
            if (i10 >= charSequence.length()) {
                return ~i10;
            }
            char cCharAt = charSequence.charAt(i10);
            char c10 = this.f44125a;
            return (cCharAt == c10 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c10)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i10 + 1 : ~i10;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            ((StringBuilder) appendable).append(this.f44125a);
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$b */
    public static class C8127b implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8148j[] f44126a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8146h[] f44127b;

        /* JADX INFO: renamed from: c */
        public final int f44128c;

        /* JADX INFO: renamed from: d */
        public final int f44129d;

        public C8127b(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10 += 2) {
                Object obj = arrayList.get(i10);
                if (obj instanceof C8127b) {
                    InterfaceC8148j[] interfaceC8148jArr = ((C8127b) obj).f44126a;
                    if (interfaceC8148jArr != null) {
                        for (InterfaceC8148j interfaceC8148j : interfaceC8148jArr) {
                            arrayList2.add(interfaceC8148j);
                        }
                    }
                } else {
                    arrayList2.add(obj);
                }
                Object obj2 = arrayList.get(i10 + 1);
                if (obj2 instanceof C8127b) {
                    InterfaceC8146h[] interfaceC8146hArr = ((C8127b) obj2).f44127b;
                    if (interfaceC8146hArr != null) {
                        for (InterfaceC8146h interfaceC8146h : interfaceC8146hArr) {
                            arrayList3.add(interfaceC8146h);
                        }
                    }
                } else {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.f44126a = null;
                this.f44128c = 0;
            } else {
                int size2 = arrayList2.size();
                this.f44126a = new InterfaceC8148j[size2];
                int iEstimatePrintedLength = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    InterfaceC8148j interfaceC8148j2 = (InterfaceC8148j) arrayList2.get(i11);
                    iEstimatePrintedLength += interfaceC8148j2.estimatePrintedLength();
                    this.f44126a[i11] = interfaceC8148j2;
                }
                this.f44128c = iEstimatePrintedLength;
            }
            if (!arrayList3.contains(null) && !arrayList3.isEmpty()) {
                int size3 = arrayList3.size();
                this.f44127b = new InterfaceC8146h[size3];
                int iEstimateParsedLength = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    InterfaceC8146h interfaceC8146h2 = (InterfaceC8146h) arrayList3.get(i12);
                    iEstimateParsedLength += interfaceC8146h2.estimateParsedLength();
                    this.f44127b[i12] = interfaceC8146h2;
                }
                this.f44129d = iEstimateParsedLength;
                return;
            }
            this.f44127b = null;
            this.f44129d = 0;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44129d;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44128c;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            InterfaceC8146h[] interfaceC8146hArr = this.f44127b;
            if (interfaceC8146hArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = interfaceC8146hArr.length;
            for (int i11 = 0; i11 < length && i10 >= 0; i11++) {
                i10 = interfaceC8146hArr[i11].parseInto(c8142d, charSequence, i10);
            }
            return i10;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InterfaceC8148j[] interfaceC8148jArr = this.f44126a;
            if (interfaceC8148jArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InterfaceC8148j interfaceC8148j : interfaceC8148jArr) {
                interfaceC8148j.printTo(appendable, j10, abstractC6094a, i10, dateTimeZone, locale2);
            }
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$c */
    public static class C8128c extends C8132g {
        public C8128c(DateTimeFieldType dateTimeFieldType, int i10) {
            super(dateTimeFieldType, i10, false, i10);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.AbstractC8131f, org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            char cCharAt;
            int into = super.parseInto(c8142d, charSequence, i10);
            if (into < 0) {
                return into;
            }
            int i11 = this.f44136b + i10;
            if (into != i11) {
                if (this.f44137c && ((cCharAt = charSequence.charAt(i10)) == '-' || cCharAt == '+')) {
                    i11++;
                }
                if (into > i11) {
                    return ~(i11 + 1);
                }
                if (into < i11) {
                    into = ~into;
                }
            }
            return into;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$d */
    public static class C8129d implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final DateTimeFieldType f44130a;

        /* JADX INFO: renamed from: b */
        public final int f44131b;

        /* JADX INFO: renamed from: c */
        public final int f44132c;

        public C8129d(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
            this.f44130a = dateTimeFieldType;
            i11 = i11 > 18 ? 18 : i11;
            this.f44131b = i10;
            this.f44132c = i11;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44132c;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44132c;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            AbstractC6095b abstractC6095bMo16010b = this.f44130a.mo16010b(c8142d.f44161a);
            int iMin = Math.min(this.f44132c, charSequence.length() - i10);
            long jMo12594s = abstractC6095bMo16010b.mo12577j().mo12594s() * 10;
            long j10 = 0;
            int i11 = 0;
            while (i11 < iMin) {
                char cCharAt = charSequence.charAt(i10 + i11);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                    break;
                }
                i11++;
                jMo12594s /= 10;
                j10 += ((long) (cCharAt - '0')) * jMo12594s;
            }
            long j11 = j10 / 10;
            if (i11 != 0 && j11 <= 2147483647L) {
                C8122e c8122e = new C8122e(DateTimeFieldType.f43935R, MillisDurationField.f44103a, abstractC6095bMo16010b.mo12577j());
                C8142d.a aVarM16121c = c8142d.m16121c();
                aVarM16121c.f44172a = c8122e;
                aVarM16121c.f44173b = (int) j11;
                aVarM16121c.f44174c = null;
                aVarM16121c.f44175d = null;
                return i10 + i11;
            }
            return ~i10;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:52:0x0100 A[LOOP:4: B:51:0x00fe->B:52:0x0100, LOOP_END] */
        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            long j11;
            int i11;
            AbstractC6095b abstractC6095bMo16010b = this.f44130a.mo16010b(abstractC6094a);
            int i12 = this.f44131b;
            try {
                long jMo12562A = abstractC6095bMo16010b.mo12562A(j10);
                if (jMo12562A == 0) {
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        } else {
                            ((StringBuilder) appendable).append('0');
                        }
                    }
                } else {
                    long jMo12594s = abstractC6095bMo16010b.mo12577j().mo12594s();
                    int i13 = this.f44132c;
                    while (true) {
                        switch (i13) {
                            case 1:
                                j11 = 10;
                                break;
                            case 2:
                                j11 = 100;
                                break;
                            case 3:
                                j11 = 1000;
                                break;
                            case 4:
                                j11 = 10000;
                                break;
                            case 5:
                                j11 = 100000;
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                j11 = 1000000;
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                j11 = 10000000;
                                break;
                            case 8:
                                j11 = 100000000;
                                break;
                            case 9:
                                j11 = 1000000000;
                                break;
                            case 10:
                                j11 = 10000000000L;
                                break;
                            case 11:
                                j11 = 100000000000L;
                                break;
                            case 12:
                                j11 = 1000000000000L;
                                break;
                            case 13:
                                j11 = 10000000000000L;
                                break;
                            case 14:
                                j11 = 100000000000000L;
                                break;
                            case 15:
                                j11 = 1000000000000000L;
                                break;
                            case 16:
                                j11 = 10000000000000000L;
                                break;
                            case 17:
                                j11 = 100000000000000000L;
                                break;
                            case 18:
                                j11 = 1000000000000000000L;
                                break;
                            default:
                                j11 = 1;
                                break;
                        }
                        if ((jMo12594s * j11) / j11 == jMo12594s) {
                            long j12 = (jMo12562A * j11) / jMo12594s;
                            int i14 = i13;
                            String string = (2147483647L & j12) == j12 ? Integer.toString((int) j12) : Long.toString(j12);
                            int length = string.length();
                            while (length < i14) {
                                ((StringBuilder) appendable).append('0');
                                i12--;
                                i14--;
                            }
                            if (i12 < i14) {
                                while (i12 < i14 && length > 1) {
                                    int i15 = length - 1;
                                    if (string.charAt(i15) == '0') {
                                        i14--;
                                        length = i15;
                                    } else if (length < string.length()) {
                                        for (i11 = 0; i11 < length; i11++) {
                                            ((StringBuilder) appendable).append(string.charAt(i11));
                                        }
                                    }
                                }
                                if (length < string.length()) {
                                    while (i11 < length) {
                                        ((StringBuilder) appendable).append(string.charAt(i11));
                                    }
                                }
                            }
                            ((StringBuilder) appendable).append((CharSequence) string);
                            return;
                        }
                        i13--;
                    }
                }
            } catch (RuntimeException unused) {
                StringBuilder sb2 = (StringBuilder) appendable;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        break;
                    } else {
                        sb2.append((char) 65533);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$e */
    public static class C8130e implements InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8146h[] f44133a;

        /* JADX INFO: renamed from: b */
        public final int f44134b;

        public C8130e(InterfaceC8146h[] interfaceC8146hArr) {
            int iEstimateParsedLength;
            this.f44133a = interfaceC8146hArr;
            int length = interfaceC8146hArr.length;
            int i10 = 0;
            while (true) {
                while (true) {
                    length--;
                    if (length < 0) {
                        this.f44134b = i10;
                        return;
                    }
                    InterfaceC8146h interfaceC8146h = interfaceC8146hArr[length];
                    if (interfaceC8146h == null || (iEstimateParsedLength = interfaceC8146h.estimateParsedLength()) <= i10) {
                        break;
                    } else {
                        i10 = iEstimateParsedLength;
                    }
                }
            }
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44134b;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            InterfaceC8146h[] interfaceC8146hArr = this.f44133a;
            int length = interfaceC8146hArr.length;
            if (c8142d.f44171k == null) {
                c8142d.f44171k = c8142d.new b();
            }
            Object obj = c8142d.f44171k;
            boolean z10 = false;
            Object obj2 = null;
            int i13 = i10;
            int i14 = i13;
            for (int i15 = 0; i15 < length; i15++) {
                InterfaceC8146h interfaceC8146h = interfaceC8146hArr[i15];
                if (interfaceC8146h == null) {
                    if (i13 > i10) {
                        z10 = true;
                        break;
                    }
                    return i10;
                }
                int into = interfaceC8146h.parseInto(c8142d, charSequence, i10);
                if (into >= i10) {
                    if (into > i13) {
                        if (into < charSequence.length() && (i12 = i15 + 1) < length) {
                            if (interfaceC8146hArr[i12] != null) {
                                if (c8142d.f44171k == null) {
                                    c8142d.f44171k = c8142d.new b();
                                }
                                obj2 = c8142d.f44171k;
                                i13 = into;
                            }
                        }
                        return into;
                    }
                    c8142d.m16122d(obj);
                } else if (into < 0 && (i11 = ~into) > i14) {
                    i14 = i11;
                }
                c8142d.m16122d(obj);
            }
            if (i13 <= i10 && (i13 != i10 || !z10)) {
                return ~i14;
            }
            if (obj2 != null) {
                c8142d.m16122d(obj2);
            }
            return i13;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$f */
    public static abstract class AbstractC8131f implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final DateTimeFieldType f44135a;

        /* JADX INFO: renamed from: b */
        public final int f44136b;

        /* JADX INFO: renamed from: c */
        public final boolean f44137c;

        public AbstractC8131f(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.f44135a = dateTimeFieldType;
            this.f44136b = i10;
            this.f44137c = z10;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44136b;
        }

        public int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int iMin = Math.min(this.f44136b, charSequence.length() - i10);
            int i13 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i13 < iMin) {
                int i14 = i10 + i13;
                char cCharAt2 = charSequence.charAt(i14);
                if (i13 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.f44137c)) {
                    boolean z12 = cCharAt2 == '-';
                    boolean z13 = cCharAt2 == '+';
                    int i15 = i13 + 1;
                    if (i15 >= iMin || (cCharAt = charSequence.charAt(i14 + 1)) < '0' || cCharAt > '9') {
                        boolean z14 = z12;
                        z11 = z13;
                        z10 = z14;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i10);
                    i13 = i15;
                    boolean z15 = z12;
                    z11 = z13;
                    z10 = z15;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i13++;
                }
            }
            if (i13 == 0) {
                return ~i10;
            }
            if (i13 < 9) {
                int i16 = (z10 || z11) ? i10 + 1 : i10;
                int i17 = i16 + 1;
                try {
                    int iCharAt = charSequence.charAt(i16) - '0';
                    i11 = i10 + i13;
                    while (i17 < i11) {
                        int i18 = (iCharAt << 3) + (iCharAt << 1);
                        int i19 = i17 + 1;
                        int iCharAt2 = (charSequence.charAt(i17) + i18) - 48;
                        i17 = i19;
                        iCharAt = iCharAt2;
                    }
                    i12 = z10 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i10;
                }
            } else if (z11) {
                i11 = i10 + i13;
                i12 = Integer.parseInt(charSequence.subSequence(i10 + 1, i11).toString());
            } else {
                int i20 = i10 + i13;
                i12 = Integer.parseInt(charSequence.subSequence(i10, i20).toString());
                i11 = i20;
            }
            c8142d.m16123e(this.f44135a, i12);
            return i11;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$g */
    public static class C8132g extends AbstractC8131f {

        /* JADX INFO: renamed from: d */
        public final int f44138d;

        public C8132g(DateTimeFieldType dateTimeFieldType, int i10, boolean z10, int i11) {
            super(dateTimeFieldType, i10, z10);
            this.f44138d = i11;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44136b;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int i11 = this.f44138d;
            try {
                C8144f.m16127a(appendable, this.f44135a.mo16010b(abstractC6094a).mo12572b(j10), i11);
            } catch (RuntimeException unused) {
                StringBuilder sb2 = (StringBuilder) appendable;
                while (true) {
                    i11--;
                    if (i11 < 0) {
                        return;
                    } else {
                        sb2.append((char) 65533);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$h */
    public static class C8133h implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final String f44139a;

        public C8133h(String str) {
            this.f44139a = str;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44139a.length();
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44139a.length();
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            String str = this.f44139a;
            return DateTimeFormatterBuilder.m16094o(str, charSequence, i10) ? str.length() + i10 : ~i10;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            ((StringBuilder) appendable).append((CharSequence) this.f44139a);
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$i */
    public static class C8134i implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: c */
        public static final ConcurrentHashMap f44140c = new ConcurrentHashMap();

        /* JADX INFO: renamed from: a */
        public final DateTimeFieldType f44141a;

        /* JADX INFO: renamed from: b */
        public final boolean f44142b;

        public C8134i(DateTimeFieldType dateTimeFieldType, boolean z10) {
            this.f44141a = dateTimeFieldType;
            this.f44142b = z10;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44142b ? 6 : 20;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            int iIntValue;
            Map map;
            ConcurrentHashMap concurrentHashMap = f44140c;
            Locale locale = c8142d.f44163c;
            Map concurrentHashMap2 = (Map) concurrentHashMap.get(locale);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
                concurrentHashMap.put(locale, concurrentHashMap2);
            }
            DateTimeFieldType dateTimeFieldType = this.f44141a;
            Object[] objArr = (Object[]) concurrentHashMap2.get(dateTimeFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(32);
                MutableDateTime mutableDateTime = new MutableDateTime(DateTimeZone.f43949a);
                if (dateTimeFieldType == null) {
                    throw new IllegalArgumentException("The DateTimeFieldType must not be null");
                }
                AbstractC6095b abstractC6095bMo16010b = dateTimeFieldType.mo16010b(mutableDateTime.mo12598n());
                if (!abstractC6095bMo16010b.mo12588z()) {
                    throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
                }
                MutableDateTime.Property property = new MutableDateTime.Property(mutableDateTime, abstractC6095bMo16010b);
                int iMo12582r = property.mo16038c().mo12582r();
                int iMo12580n = property.mo16038c().mo12580n();
                if (iMo12580n - iMo12582r > 32) {
                    return ~i10;
                }
                int iMo12579l = property.mo16038c().mo12579l(locale);
                while (iMo12582r <= iMo12580n) {
                    property.m16041h(iMo12582r);
                    String strM16087a = property.m16087a(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap3.put(strM16087a, bool);
                    concurrentHashMap3.put(property.m16087a(locale).toLowerCase(locale), bool);
                    concurrentHashMap3.put(property.m16087a(locale).toUpperCase(locale), bool);
                    concurrentHashMap3.put(property.mo16038c().mo12576h(property.mo16039d(), locale), bool);
                    concurrentHashMap3.put(property.mo16038c().mo12576h(property.mo16039d(), locale).toLowerCase(locale), bool);
                    concurrentHashMap3.put(property.mo16038c().mo12576h(property.mo16039d(), locale).toUpperCase(locale), bool);
                    iMo12582r++;
                    iMo12579l = iMo12579l;
                }
                int i11 = iMo12579l;
                if ("en".equals(locale.getLanguage()) && dateTimeFieldType == DateTimeFieldType.f43936a) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap3.put("BCE", bool2);
                    concurrentHashMap3.put("bce", bool2);
                    concurrentHashMap3.put("CE", bool2);
                    concurrentHashMap3.put("ce", bool2);
                    iIntValue = 3;
                } else {
                    iIntValue = i11;
                }
                concurrentHashMap2.put(dateTimeFieldType, new Object[]{concurrentHashMap3, Integer.valueOf(iIntValue)});
                map = concurrentHashMap3;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i10); iMin > i10; iMin--) {
                String string = charSequence.subSequence(i10, iMin).toString();
                if (map.containsKey(string)) {
                    C8142d.a aVarM16121c = c8142d.m16121c();
                    aVarM16121c.f44172a = dateTimeFieldType.mo16010b(c8142d.f44161a);
                    aVarM16121c.f44173b = 0;
                    aVarM16121c.f44174c = string;
                    aVarM16121c.f44175d = locale;
                    return iMin;
                }
            }
            return ~i10;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                AbstractC6095b abstractC6095bMo16010b = this.f44141a.mo16010b(abstractC6094a);
                ((StringBuilder) appendable).append((CharSequence) (this.f44142b ? abstractC6095bMo16010b.mo12574d(j10, locale) : abstractC6095bMo16010b.mo12576h(j10, locale)));
            } catch (RuntimeException unused) {
                ((StringBuilder) appendable).append((char) 65533);
            }
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$j */
    public static class C8135j implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final Map<String, DateTimeZone> f44143a = null;

        /* JADX INFO: renamed from: b */
        public final int f44144b;

        public C8135j(int i10) {
            this.f44144b = i10;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44144b == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44144b == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            boolean z10;
            Map<String, DateTimeZone> map = this.f44143a;
            if (map == null) {
                AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
                Map<String, DateTimeZone> map2 = atomicReference.get();
                if (map2 == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DateTimeZone dateTimeZone = DateTimeZone.f43949a;
                    linkedHashMap.put("UT", dateTimeZone);
                    linkedHashMap.put("UTC", dateTimeZone);
                    linkedHashMap.put("GMT", dateTimeZone);
                    C6096c.m12590b("EST", "America/New_York", linkedHashMap);
                    C6096c.m12590b("EDT", "America/New_York", linkedHashMap);
                    C6096c.m12590b("CST", "America/Chicago", linkedHashMap);
                    C6096c.m12590b("CDT", "America/Chicago", linkedHashMap);
                    C6096c.m12590b("MST", "America/Denver", linkedHashMap);
                    C6096c.m12590b("MDT", "America/Denver", linkedHashMap);
                    C6096c.m12590b("PST", "America/Los_Angeles", linkedHashMap);
                    C6096c.m12590b("PDT", "America/Los_Angeles", linkedHashMap);
                    Map<String, DateTimeZone> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                    while (true) {
                        if (atomicReference.compareAndSet(null, mapUnmodifiableMap)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    }
                    map = !z10 ? atomicReference.get() : mapUnmodifiableMap;
                } else {
                    map = map2;
                }
            }
            String str = null;
            loop0: while (true) {
                for (String str2 : map.keySet()) {
                    if (DateTimeFormatterBuilder.m16093n(str2, charSequence, i10) && (str == null || str2.length() > str.length())) {
                        str = str2;
                    }
                }
                break loop0;
            }
            if (str == null) {
                return ~i10;
            }
            DateTimeZone dateTimeZone2 = map.get(str);
            c8142d.f44171k = null;
            c8142d.f44165e = dateTimeZone2;
            return str.length() + i10;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String strM16027s;
            long j11 = j10 - ((long) i10);
            if (dateTimeZone != null) {
                int i11 = this.f44144b;
                if (i11 != 0) {
                    strM16027s = i11 != 1 ? "" : dateTimeZone.m16027s(j11, locale);
                } else {
                    strM16027s = dateTimeZone.m16023j(j11, locale);
                }
            }
            ((StringBuilder) appendable).append((CharSequence) strM16027s);
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$k */
    public static class C8136k implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final String f44145a;

        /* JADX INFO: renamed from: b */
        public final String f44146b;

        /* JADX INFO: renamed from: c */
        public final boolean f44147c;

        /* JADX INFO: renamed from: d */
        public final int f44148d;

        /* JADX INFO: renamed from: e */
        public final int f44149e;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C8136k(int i10, String str, String str2, boolean z10) {
            this.f44145a = str;
            this.f44146b = str2;
            this.f44147c = z10;
            if (i10 < 2) {
                throw new IllegalArgumentException();
            }
            this.f44148d = 2;
            this.f44149e = i10;
        }

        /* JADX INFO: renamed from: a */
        public static int m16111a(CharSequence charSequence, int i10, int i11) {
            int i12 = 0;
            for (int iMin = Math.min(charSequence.length() - i10, i11); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i10 + i12);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i12++;
            }
            return i12;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            int i10 = this.f44148d;
            int i11 = (i10 + 1) << 1;
            if (this.f44147c) {
                i11 += i10 - 1;
            }
            String str = this.f44145a;
            return (str == null || str.length() <= i11) ? i11 : str.length();
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00c5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:76:0x00db  */
        /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:83:0x00f2 A[PHI: r15
          0x00f2: PHI (r15v8 int) = (r15v7 int), (r15v15 int) binds: [B:76:0x00db, B:82:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:87:0x00fc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:90:0x0100  */
        /* JADX WARN: Code duplicated, block: B:92:0x010c  */
        /* JADX WARN: Code duplicated, block: B:94:0x0118  */
        /* JADX WARN: Code duplicated, block: B:95:0x0122  */
        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            boolean z10;
            int iM16128b;
            int iM16128b2;
            int iM16111a;
            int iM16128b3;
            int iM16111a2;
            int i11;
            char cCharAt;
            int length = charSequence.length() - i10;
            boolean z11 = false;
            String str = this.f44146b;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i10)) != '-' && cCharAt != '+')) {
                        c8142d.f44171k = null;
                        c8142d.f44166f = 0;
                        return i10;
                    }
                } else if (DateTimeFormatterBuilder.m16094o(str, charSequence, i10)) {
                    c8142d.f44171k = null;
                    c8142d.f44166f = 0;
                    return str.length() + i10;
                }
            }
            if (length <= 1) {
                return ~i10;
            }
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 == '-') {
                z10 = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i10;
                }
                z10 = false;
            }
            int i12 = length - 1;
            int i13 = i10 + 1;
            if (m16111a(charSequence, i13, 2) >= 2 && (iM16128b = C8144f.m16128b(i13, charSequence)) <= 23) {
                int iCharAt = iM16128b * 3600000;
                int i14 = i12 - 2;
                int i15 = i13 + 2;
                if (i14 > 0) {
                    char cCharAt3 = charSequence.charAt(i15);
                    if (cCharAt3 == ':') {
                        i14--;
                        i15++;
                        z11 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iM16111a3 = m16111a(charSequence, i15, 2);
                    if (iM16111a3 != 0 || z11) {
                        if (iM16111a3 >= 2 && (iM16128b2 = C8144f.m16128b(i15, charSequence)) <= 59) {
                            iCharAt += iM16128b2 * 60000;
                            int i16 = i14 - 2;
                            i15 += 2;
                            if (i16 > 0) {
                                if (!z11) {
                                    iM16111a = m16111a(charSequence, i15, 2);
                                    if (iM16111a == 0 || z11) {
                                        if (iM16111a < 2 && (iM16128b3 = C8144f.m16128b(i15, charSequence)) <= 59) {
                                            iCharAt += iM16128b3 * 1000;
                                            i15 += 2;
                                            if (i16 - 2 > 0) {
                                                if (!z11) {
                                                    iM16111a2 = m16111a(charSequence, i15, 3);
                                                    if (iM16111a2 == 0 || z11) {
                                                        if (iM16111a2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iM16111a2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iM16111a2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    }
                                                } else if (charSequence.charAt(i15) != '.' || charSequence.charAt(i15) == ',') {
                                                    i15++;
                                                    iM16111a2 = m16111a(charSequence, i15, 3);
                                                    if (iM16111a2 == 0) {
                                                        if (iM16111a2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iM16111a2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iM16111a2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    } else {
                                                        if (iM16111a2 < 1) {
                                                            return ~i15;
                                                        }
                                                        i11 = i15 + 1;
                                                        iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                        if (iM16111a2 > 1) {
                                                            i15 = i11 + 1;
                                                            iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                            if (iM16111a2 > 2) {
                                                                iCharAt += charSequence.charAt(i15) - '0';
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = i11;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return ~i15;
                                    }
                                } else if (charSequence.charAt(i15) == ':') {
                                    i16--;
                                    i15++;
                                    iM16111a = m16111a(charSequence, i15, 2);
                                    if (iM16111a == 0) {
                                        if (iM16111a < 2) {
                                            return ~i15;
                                        }
                                        iCharAt += iM16128b3 * 1000;
                                        i15 += 2;
                                        if (i16 - 2 > 0) {
                                            if (!z11) {
                                                iM16111a2 = m16111a(charSequence, i15, 3);
                                                if (iM16111a2 == 0) {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            } else {
                                                if (charSequence.charAt(i15) != '.') {
                                                }
                                                i15++;
                                                iM16111a2 = m16111a(charSequence, i15, 3);
                                                if (iM16111a2 == 0) {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (iM16111a < 2) {
                                            return ~i15;
                                        }
                                        iCharAt += iM16128b3 * 1000;
                                        i15 += 2;
                                        if (i16 - 2 > 0) {
                                            if (!z11) {
                                                iM16111a2 = m16111a(charSequence, i15, 3);
                                                if (iM16111a2 == 0) {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            } else {
                                                if (charSequence.charAt(i15) != '.') {
                                                }
                                                i15++;
                                                iM16111a2 = m16111a(charSequence, i15, 3);
                                                if (iM16111a2 == 0) {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                } else {
                                                    if (iM16111a2 < 1) {
                                                        return ~i15;
                                                    }
                                                    i11 = i15 + 1;
                                                    iCharAt += (charSequence.charAt(i15) - '0') * 100;
                                                    if (iM16111a2 > 1) {
                                                        i15 = i11 + 1;
                                                        iCharAt += (charSequence.charAt(i11) - '0') * 10;
                                                        if (iM16111a2 > 2) {
                                                            iCharAt += charSequence.charAt(i15) - '0';
                                                            i15++;
                                                        }
                                                    } else {
                                                        i15 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return ~i15;
                    }
                }
                if (z10) {
                    iCharAt = -iCharAt;
                }
                Integer numValueOf = Integer.valueOf(iCharAt);
                c8142d.f44171k = null;
                c8142d.f44166f = numValueOf;
                return i15;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i10 == 0 && (str = this.f44145a) != null) {
                ((StringBuilder) appendable).append((CharSequence) str);
                return;
            }
            if (i10 >= 0) {
                ((StringBuilder) appendable).append('+');
            } else {
                ((StringBuilder) appendable).append('-');
                i10 = -i10;
            }
            int i11 = i10 / 3600000;
            C8144f.m16127a(appendable, i11, 2);
            int i12 = this.f44149e;
            if (i12 == 1) {
                return;
            }
            int i13 = i10 - (i11 * 3600000);
            int i14 = this.f44148d;
            if (i13 != 0 || i14 > 1) {
                int i15 = i13 / 60000;
                boolean z10 = this.f44147c;
                if (z10) {
                    ((StringBuilder) appendable).append(':');
                }
                C8144f.m16127a(appendable, i15, 2);
                if (i12 == 2) {
                    return;
                }
                int i16 = i13 - (i15 * 60000);
                if (i16 != 0 || i14 > 2) {
                    int i17 = i16 / 1000;
                    if (z10) {
                        ((StringBuilder) appendable).append(':');
                    }
                    C8144f.m16127a(appendable, i17, 2);
                    if (i12 == 3) {
                        return;
                    }
                    int i18 = i16 - (i17 * 1000);
                    if (i18 != 0 || i14 > 3) {
                        if (z10) {
                            ((StringBuilder) appendable).append('.');
                        }
                        C8144f.m16127a(appendable, i18, 3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$l */
    public static class C8137l implements InterfaceC8148j, InterfaceC8146h {

        /* JADX INFO: renamed from: a */
        public final DateTimeFieldType f44150a;

        /* JADX INFO: renamed from: b */
        public final int f44151b;

        /* JADX INFO: renamed from: c */
        public final boolean f44152c;

        public C8137l(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.f44150a = dateTimeFieldType;
            this.f44151b = i10;
            this.f44152c = z10;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int estimateParsedLength() {
            return this.f44152c ? 4 : 2;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InterfaceC8146h
        public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int i13 = i10;
            int length = charSequence.length() - i13;
            boolean z10 = this.f44152c;
            DateTimeFieldType dateTimeFieldType = this.f44150a;
            if (z10) {
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i14 < length) {
                    char cCharAt = charSequence.charAt(i13 + i14);
                    if (i14 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z12 = cCharAt == '-';
                        if (z12) {
                            i14++;
                        } else {
                            i13++;
                            length--;
                        }
                        z11 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 == 0) {
                    return ~i13;
                }
                if (z11 || i14 != 2) {
                    if (i14 >= 9) {
                        i11 = i14 + i13;
                        i12 = Integer.parseInt(charSequence.subSequence(i13, i11).toString());
                    } else {
                        int i15 = z12 ? i13 + 1 : i13;
                        int i16 = i15 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i15) - '0';
                            i11 = i14 + i13;
                            while (i16 < i11) {
                                int iCharAt2 = (charSequence.charAt(i16) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i16++;
                                iCharAt = iCharAt2;
                            }
                            i12 = z12 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i13;
                        }
                    }
                    c8142d.m16123e(dateTimeFieldType, i12);
                    return i11;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i13;
            }
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i13;
            }
            int i17 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i13 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i13;
            }
            int i18 = (((i17 << 3) + (i17 << 1)) + cCharAt3) - 48;
            Integer num = c8142d.f44167g;
            int iIntValue = (num != null ? num.intValue() : this.f44151b) - 50;
            int i19 = iIntValue >= 0 ? iIntValue % 100 : ((iIntValue + 1) % 100) + 99;
            c8142d.m16123e(dateTimeFieldType, ((iIntValue + (i18 < i19 ? 100 : 0)) - i19) + i18);
            return i13 + 2;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int i11;
            try {
                int iMo12572b = this.f44150a.mo16010b(abstractC6094a).mo12572b(j10);
                if (iMo12572b < 0) {
                    iMo12572b = -iMo12572b;
                }
                i11 = iMo12572b % 100;
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            if (i11 >= 0) {
                C8144f.m16127a(appendable, i11, 2);
                return;
            }
            StringBuilder sb2 = (StringBuilder) appendable;
            sb2.append((char) 65533);
            sb2.append((char) 65533);
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.DateTimeFormatterBuilder$m */
    public static class C8138m extends AbstractC8131f {
        public C8138m(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            super(dateTimeFieldType, i10, z10);
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final int estimatePrintedLength() {
            return this.f44136b;
        }

        @Override // org.joda.time.format.InterfaceC8148j
        public final void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                int iMo12572b = this.f44135a.mo16010b(abstractC6094a).mo12572b(j10);
                int i11 = C8144f.f44183b;
                if (iMo12572b < 0) {
                    ((StringBuilder) appendable).append('-');
                    if (iMo12572b != Integer.MIN_VALUE) {
                        iMo12572b = -iMo12572b;
                    } else {
                        ((StringBuilder) appendable).append((CharSequence) "2147483648");
                    }
                }
                if (iMo12572b < 10) {
                    ((StringBuilder) appendable).append((char) (iMo12572b + 48));
                } else if (iMo12572b < 100) {
                    int i12 = ((iMo12572b + 1) * 13421772) >> 27;
                    ((StringBuilder) appendable).append((char) (i12 + 48));
                    ((StringBuilder) appendable).append((char) (((iMo12572b - (i12 << 3)) - (i12 << 1)) + 48));
                } else {
                    ((StringBuilder) appendable).append((CharSequence) Integer.toString(iMo12572b));
                }
            } catch (RuntimeException unused) {
                ((StringBuilder) appendable).append((char) 65533);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m16093n(String str, CharSequence charSequence, int i10) {
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i10 + i11) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m16094o(String str, CharSequence charSequence, int i10) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i10 + i11);
            char cCharAt2 = str.charAt(i11);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final DateTimeFormatterBuilder m16095a(InterfaceC8141c[] interfaceC8141cArr) {
        int length = interfaceC8141cArr.length;
        int i10 = 0;
        if (length == 1) {
            InterfaceC8141c interfaceC8141c = interfaceC8141cArr[0];
            if (interfaceC8141c == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            m16098d(null, C8143e.m16126a(interfaceC8141c));
            return this;
        }
        InterfaceC8146h[] interfaceC8146hArr = new InterfaceC8146h[length];
        while (i10 < length - 1) {
            InterfaceC8146h interfaceC8146hM16126a = C8143e.m16126a(interfaceC8141cArr[i10]);
            interfaceC8146hArr[i10] = interfaceC8146hM16126a;
            if (interfaceC8146hM16126a == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i10++;
        }
        interfaceC8146hArr[i10] = C8143e.m16126a(interfaceC8141cArr[i10]);
        m16098d(null, new C8130e(interfaceC8146hArr));
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m16096b(C8140b c8140b) {
        if (c8140b == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        m16098d(c8140b.f44154a, c8140b.f44155b);
    }

    /* JADX INFO: renamed from: c */
    public final void m16097c(Object obj) {
        this.f44124b = null;
        ArrayList<Object> arrayList = this.f44123a;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m16098d(InterfaceC8148j interfaceC8148j, InterfaceC8146h interfaceC8146h) {
        this.f44124b = null;
        ArrayList<Object> arrayList = this.f44123a;
        arrayList.add(interfaceC8148j);
        arrayList.add(interfaceC8146h);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final DateTimeFormatterBuilder m16099e(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i10 <= 1) {
            m16097c(new C8138m(dateTimeFieldType, i11, false));
            return this;
        }
        m16097c(new C8132g(dateTimeFieldType, i11, false, i10));
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m16100f(DateTimeFieldType dateTimeFieldType, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(C0166e.m761g("Illegal number of digits: ", i10));
        }
        m16097c(new C8128c(dateTimeFieldType, i10));
    }

    /* JADX INFO: renamed from: g */
    public final void m16101g(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        m16097c(new C8129d(dateTimeFieldType, i10, i11));
    }

    /* JADX INFO: renamed from: h */
    public final DateTimeFormatterBuilder m16102h(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                m16097c(new C8133h(str));
                return this;
            }
            m16097c(new C8126a(str.charAt(0)));
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m16103i(char c10) {
        m16097c(new C8126a(c10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m16104j(InterfaceC8141c interfaceC8141c) {
        if (interfaceC8141c == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
        m16098d(null, new C8130e(new InterfaceC8146h[]{C8143e.m16126a(interfaceC8141c), null}));
    }

    /* JADX INFO: renamed from: k */
    public final DateTimeFormatterBuilder m16105k(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (i11 < i10) {
            i11 = i10;
        }
        if (i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i10 <= 1) {
            m16097c(new C8138m(dateTimeFieldType, i11, true));
            return this;
        }
        m16097c(new C8132g(dateTimeFieldType, i11, true, i10));
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final void m16106l(DateTimeFieldType dateTimeFieldType) {
        m16097c(new C8134i(dateTimeFieldType, false));
    }

    /* JADX INFO: renamed from: m */
    public final void m16107m(int i10, String str, boolean z10) {
        m16097c(new C8136k(i10, str, str, z10));
    }

    /* JADX INFO: renamed from: p */
    public final Object m16108p() {
        Object c8127b = this.f44124b;
        if (c8127b == null) {
            ArrayList<Object> arrayList = this.f44123a;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    c8127b = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    c8127b = obj;
                }
            }
            if (c8127b == null) {
                c8127b = new C8127b(arrayList);
            }
            this.f44124b = c8127b;
        }
        return c8127b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final C8140b m16109q() {
        Object objM16108p = m16108p();
        boolean z10 = true;
        InterfaceC8146h interfaceC8146h = null;
        InterfaceC8148j interfaceC8148j = (objM16108p instanceof InterfaceC8148j) && (!(objM16108p instanceof C8127b) || ((C8127b) objM16108p).f44126a != null) ? (InterfaceC8148j) objM16108p : null;
        if (!(objM16108p instanceof InterfaceC8146h) || ((objM16108p instanceof C8127b) && ((C8127b) objM16108p).f44127b == null)) {
            z10 = false;
        }
        if (z10) {
            interfaceC8146h = (InterfaceC8146h) objM16108p;
        }
        if (interfaceC8148j == null && interfaceC8146h == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new C8140b(interfaceC8148j, interfaceC8146h);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC8141c m16110r() {
        Object objM16108p = m16108p();
        boolean z10 = false;
        if ((objM16108p instanceof InterfaceC8146h) && (!(objM16108p instanceof C8127b) || ((C8127b) objM16108p).f44127b != null)) {
            z10 = true;
        }
        if (!z10) {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
        InterfaceC8146h interfaceC8146h = (InterfaceC8146h) objM16108p;
        if (interfaceC8146h instanceof C8143e) {
            return ((C8143e) interfaceC8146h).f44181a;
        }
        return interfaceC8146h instanceof InterfaceC8141c ? (InterfaceC8141c) interfaceC8146h : new C8147i(interfaceC8146h);
    }
}
