package org.joda.time;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C8140b;
import org.joda.time.format.C8142d;
import org.joda.time.format.C8144f;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.InterfaceC8146h;
import org.joda.time.p308tz.C8152a;
import org.joda.time.p308tz.C8155d;
import org.joda.time.p308tz.C8156e;
import org.joda.time.p308tz.FixedDateTimeZone;
import org.joda.time.p308tz.InterfaceC8153b;
import org.joda.time.p308tz.InterfaceC8154c;
import p163hp.AbstractC6094a;
import p163hp.C6096c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DateTimeZone implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final DateTimeZone f43949a = UTCDateTimeZone.f43968e;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<InterfaceC8154c> f43950b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<InterfaceC8153b> f43951c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference<DateTimeZone> f43952d = new AtomicReference<>();
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* JADX INFO: renamed from: a */
        public transient String f43953a;

        public Stub(String str) {
            this.f43953a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.f43953a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.m16014c(this.f43953a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f43953a);
        }
    }

    /* JADX INFO: renamed from: org.joda.time.DateTimeZone$a */
    public static final class C8103a {

        /* JADX INFO: renamed from: a */
        public static final Map<String, String> f43954a;

        /* JADX INFO: renamed from: b */
        public static final C8140b f43955b;

        static {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            f43954a = Collections.unmodifiableMap(map);
            BaseChronology baseChronology = new BaseChronology() { // from class: org.joda.time.DateTimeZone$LazyInit$1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // p163hp.AbstractC6094a
                /* JADX INFO: renamed from: a0 */
                public final AbstractC6094a mo12539a0() {
                    return this;
                }

                @Override // p163hp.AbstractC6094a
                /* JADX INFO: renamed from: b0 */
                public final AbstractC6094a mo12541b0(DateTimeZone dateTimeZone) {
                    return this;
                }

                @Override // p163hp.AbstractC6094a
                /* JADX INFO: renamed from: q */
                public final DateTimeZone mo12554q() {
                    return null;
                }

                public final String toString() {
                    return DateTimeZone$LazyInit$1.class.getName();
                }
            };
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            dateTimeFormatterBuilder.m16107m(4, null, true);
            C8140b c8140bM16109q = dateTimeFormatterBuilder.m16109q();
            f43955b = new C8140b(c8140bM16109q.f44154a, c8140bM16109q.f44155b, null, false, baseChronology, null, null, 2000);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    /* JADX INFO: renamed from: A */
    public static String m16012A(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i10 = -i10;
        }
        int i11 = i10 / 3600000;
        try {
            C8144f.m16127a(stringBuffer, i11, 2);
        } catch (IOException unused) {
        }
        int i12 = i10 - (i11 * 3600000);
        int i13 = i12 / 60000;
        stringBuffer.append(':');
        try {
            C8144f.m16127a(stringBuffer, i13, 2);
        } catch (IOException unused2) {
        }
        int i14 = i12 - (i13 * 60000);
        if (i14 == 0) {
            return stringBuffer.toString();
        }
        int i15 = i14 / 1000;
        stringBuffer.append(':');
        try {
            C8144f.m16127a(stringBuffer, i15, 2);
        } catch (IOException unused3) {
        }
        int i16 = i14 - (i15 * 1000);
        if (i16 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        try {
            C8144f.m16127a(stringBuffer, i16, 3);
        } catch (IOException unused4) {
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: C */
    public static void m16013C(InterfaceC8154c interfaceC8154c) {
        Set<String> setMo16177b = interfaceC8154c.mo16177b();
        if (setMo16177b == null || setMo16177b.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setMo16177b.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        DateTimeZone dateTimeZone = f43949a;
        DateTimeZone dateTimeZoneMo16176a = interfaceC8154c.mo16176a("UTC");
        ((UTCDateTimeZone) dateTimeZone).getClass();
        if (!(dateTimeZoneMo16176a instanceof UTCDateTimeZone)) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    @FromString
    /* JADX INFO: renamed from: c */
    public static DateTimeZone m16014c(String str) {
        if (str == null) {
            return m16016e();
        }
        boolean zEquals = str.equals("UTC");
        DateTimeZone dateTimeZone = f43949a;
        if (zEquals) {
            return dateTimeZone;
        }
        DateTimeZone dateTimeZoneMo16176a = m16018r().mo16176a(str);
        if (dateTimeZoneMo16176a != null) {
            return dateTimeZoneMo16176a;
        }
        if (!str.startsWith("+") && !str.startsWith("-")) {
            throw new IllegalArgumentException(C0141b.m611g("The datetime zone id '", str, "' is not recognised"));
        }
        int iM16019y = m16019y(str);
        if (iM16019y == 0) {
            return dateTimeZone;
        }
        return iM16019y == 0 ? dateTimeZone : new FixedDateTimeZone(m16012A(iM16019y), iM16019y, iM16019y, null);
    }

    /* JADX INFO: renamed from: d */
    public static DateTimeZone m16015d(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return m16016e();
        }
        String id2 = timeZone.getID();
        if (id2 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        boolean zEquals = id2.equals("UTC");
        DateTimeZone dateTimeZone = f43949a;
        if (zEquals) {
            return dateTimeZone;
        }
        String str = C8103a.f43954a.get(id2);
        InterfaceC8154c interfaceC8154cM16018r = m16018r();
        DateTimeZone dateTimeZoneMo16176a = str != null ? interfaceC8154cM16018r.mo16176a(str) : null;
        if (dateTimeZoneMo16176a == null) {
            dateTimeZoneMo16176a = interfaceC8154cM16018r.mo16176a(id2);
        }
        if (dateTimeZoneMo16176a != null) {
            return dateTimeZoneMo16176a;
        }
        if (str != null || (!id2.startsWith("GMT+") && !id2.startsWith("GMT-"))) {
            throw new IllegalArgumentException(C0141b.m611g("The datetime zone id '", id2, "' is not recognised"));
        }
        String strSubstring = id2.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            StringBuilder sb2 = new StringBuilder(strSubstring);
            for (int i10 = 0; i10 < sb2.length(); i10++) {
                int iDigit = Character.digit(sb2.charAt(i10), 10);
                if (iDigit >= 0) {
                    sb2.setCharAt(i10, (char) (iDigit + 48));
                }
            }
            strSubstring = sb2.toString();
        }
        int iM16019y = m16019y(strSubstring);
        if (iM16019y == 0) {
            return dateTimeZone;
        }
        return iM16019y == 0 ? dateTimeZone : new FixedDateTimeZone(m16012A(iM16019y), iM16019y, iM16019y, null);
    }

    /* JADX INFO: renamed from: e */
    public static DateTimeZone m16016e() {
        DateTimeZone dateTimeZone;
        boolean z10;
        AtomicReference<DateTimeZone> atomicReference = f43952d;
        DateTimeZone dateTimeZoneM16015d = atomicReference.get();
        if (dateTimeZoneM16015d == null) {
            try {
                String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
                if (property != null) {
                    dateTimeZoneM16015d = m16014c(property);
                }
                while (true) {
                    if (atomicReference.compareAndSet(null, dateTimeZone)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
            } catch (RuntimeException unused) {
            }
            if (dateTimeZoneM16015d == null) {
                try {
                    dateTimeZoneM16015d = m16015d(TimeZone.getDefault());
                } catch (IllegalArgumentException unused2) {
                }
            }
            if (dateTimeZoneM16015d == null) {
                dateTimeZoneM16015d = f43949a;
            }
            dateTimeZone = dateTimeZoneM16015d;
            if (!z10) {
                return atomicReference.get();
            }
            dateTimeZoneM16015d = dateTimeZone;
        }
        return dateTimeZoneM16015d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX INFO: renamed from: l */
    public static InterfaceC8153b m16017l() {
        InterfaceC8153b c8152a;
        AtomicReference<InterfaceC8153b> atomicReference = f43951c;
        InterfaceC8153b interfaceC8153b = atomicReference.get();
        if (interfaceC8153b != null) {
            return interfaceC8153b;
        }
        boolean z10 = false;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!InterfaceC8153b.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + InterfaceC8153b.class);
                    }
                    c8152a = (InterfaceC8153b) cls.asSubclass(InterfaceC8153b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                c8152a = null;
            }
        } catch (SecurityException unused) {
            c8152a = null;
        }
        if (c8152a == null) {
            c8152a = new C8152a();
        }
        InterfaceC8153b interfaceC8153b2 = c8152a;
        while (!atomicReference.compareAndSet(null, interfaceC8153b2)) {
            if (atomicReference.get() != null) {
                return !z10 ? atomicReference.get() : interfaceC8153b2;
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:28:0x00a2->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static InterfaceC8154c m16018r() {
        InterfaceC8154c c8155d;
        String property;
        InterfaceC8154c c8156e;
        AtomicReference<InterfaceC8154c> atomicReference = f43950b;
        InterfaceC8154c interfaceC8154c = atomicReference.get();
        if (interfaceC8154c != null) {
            return interfaceC8154c;
        }
        boolean z10 = false;
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property2 == null) {
                try {
                    property = System.getProperty("org.joda.time.DateTimeZone.Folder");
                    if (property != null) {
                        try {
                            c8156e = new C8156e(new File(property));
                            m16013C(c8156e);
                        } catch (Exception e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        try {
                            c8155d = new C8156e();
                            m16013C(c8155d);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            c8155d = new C8155d();
                        }
                    }
                } catch (SecurityException unused) {
                }
                while (!atomicReference.compareAndSet(null, c8156e)) {
                    if (atomicReference.get() != null) {
                        return !z10 ? atomicReference.get() : c8156e;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            try {
                Class<?> cls = Class.forName(property2, false, DateTimeZone.class.getClassLoader());
                if (!InterfaceC8154c.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + InterfaceC8154c.class);
                }
                c8155d = (InterfaceC8154c) cls.asSubclass(InterfaceC8154c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                m16013C(c8155d);
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        } catch (SecurityException unused2) {
            property = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property != null) {
                c8156e = new C8156e(new File(property));
                m16013C(c8156e);
            } else {
                c8155d = new C8156e();
                m16013C(c8155d);
            }
            while (!atomicReference.compareAndSet(null, c8156e)) {
                if (atomicReference.get() != null) {
                    if (!z10) {
                    }
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        c8156e = c8155d;
        while (!atomicReference.compareAndSet(null, c8156e)) {
            if (atomicReference.get() != null) {
                if (!z10) {
                }
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y */
    public static int m16019y(String str) {
        AbstractC6094a abstractC6094aM16074k0;
        String string;
        C8140b c8140b = C8103a.f43955b;
        InterfaceC8146h interfaceC8146h = c8140b.f44155b;
        if (interfaceC8146h == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
        AbstractC6094a abstractC6094aMo12541b0 = c8140b.f44157d;
        if (abstractC6094aMo12541b0 == null) {
            ISOChronology iSOChronology = ISOChronology.f44066e0;
            abstractC6094aM16074k0 = ISOChronology.m16074k0(m16016e());
        } else {
            abstractC6094aM16074k0 = abstractC6094aMo12541b0;
        }
        if (abstractC6094aMo12541b0 == null) {
            abstractC6094aMo12541b0 = abstractC6094aM16074k0;
        }
        DateTimeZone dateTimeZone = c8140b.f44158e;
        if (dateTimeZone != null) {
            abstractC6094aMo12541b0 = abstractC6094aMo12541b0.mo12541b0(dateTimeZone);
        }
        C8142d c8142d = new C8142d(abstractC6094aMo12541b0, c8140b.f44156c, c8140b.f44159f, c8140b.f44160g);
        int into = interfaceC8146h.parseInto(c8142d, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            return -((int) c8142d.m16120b(str));
        }
        String string2 = str.toString();
        int i10 = C8144f.f44183b;
        int i11 = into + 32;
        String strConcat = string2.length() <= i11 + 3 ? string2 : string2.substring(0, i11).concat("...");
        if (into <= 0) {
            string = "Invalid format: \"" + strConcat + '\"';
        } else if (into >= string2.length()) {
            string = C0141b.m611g("Invalid format: \"", strConcat, "\" is too short");
        } else {
            StringBuilder sbM854m = C0204c.m854m("Invalid format: \"", strConcat, "\" is malformed at \"");
            sbM854m.append(strConcat.substring(into));
            sbM854m.append('\"');
            string = sbM854m.toString();
        }
        throw new IllegalArgumentException(string);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final long m16020a(long j10, long j11) {
        int iMo16025n = mo16025n(j11);
        long j12 = j10 - ((long) iMo16025n);
        if (mo16025n(j12) == iMo16025n) {
            return j12;
        }
        int iMo16025n2 = mo16025n(j10);
        long j13 = j10 - ((long) iMo16025n2);
        int iMo16025n3 = mo16025n(j13);
        if (iMo16025n2 == iMo16025n3 || iMo16025n2 >= 0) {
            iMo16025n2 = iMo16025n3;
        } else {
            long jMo16030x = mo16030x(j13);
            if (jMo16030x == j13) {
                jMo16030x = Long.MAX_VALUE;
            }
            long j14 = j10 - ((long) iMo16025n3);
            long jMo16030x2 = mo16030x(j14);
            if (jMo16030x == (jMo16030x2 != j14 ? jMo16030x2 : Long.MAX_VALUE)) {
                iMo16025n2 = iMo16025n3;
            }
        }
        long j15 = iMo16025n2;
        long j16 = j10 - j15;
        if ((j10 ^ j16) >= 0 || (j10 ^ j15) >= 0) {
            return j16;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final long m16021b(long j10) {
        long jMo16025n = mo16025n(j10);
        long j11 = j10 + jMo16025n;
        if ((j10 ^ j11) >= 0 || (j10 ^ jMo16025n) < 0) {
            return j11;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    /* JADX INFO: renamed from: h */
    public final String m16022h() {
        return this.iID;
    }

    public int hashCode() {
        return this.iID.hashCode() + 57;
    }

    /* JADX INFO: renamed from: j */
    public final String m16023j(long j10, Locale locale) {
        String strMo16172a;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String strMo16024k = mo16024k(j10);
        if (strMo16024k == null) {
            return this.iID;
        }
        InterfaceC8153b interfaceC8153bM16017l = m16017l();
        if (interfaceC8153bM16017l instanceof C8152a) {
            String[] strArrM16175e = ((C8152a) interfaceC8153bM16017l).m16175e(locale, this.iID, strMo16024k, mo16025n(j10) == mo16028t(j10));
            strMo16172a = strArrM16175e == null ? null : strArrM16175e[1];
        } else {
            strMo16172a = interfaceC8153bM16017l.mo16172a(locale, this.iID, strMo16024k);
        }
        return strMo16172a != null ? strMo16172a : m16012A(mo16025n(j10));
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo16024k(long j10);

    /* JADX INFO: renamed from: n */
    public abstract int mo16025n(long j10);

    /* JADX INFO: renamed from: q */
    public int mo16026q(long j10) {
        int iMo16025n = mo16025n(j10);
        long j11 = j10 - ((long) iMo16025n);
        int iMo16025n2 = mo16025n(j11);
        if (iMo16025n != iMo16025n2) {
            if (iMo16025n - iMo16025n2 < 0) {
                long jMo16030x = mo16030x(j11);
                long j12 = Long.MAX_VALUE;
                if (jMo16030x == j11) {
                    jMo16030x = Long.MAX_VALUE;
                }
                long j13 = j10 - ((long) iMo16025n2);
                long jMo16030x2 = mo16030x(j13);
                if (jMo16030x2 != j13) {
                    j12 = jMo16030x2;
                }
                if (jMo16030x != j12) {
                    return iMo16025n;
                }
            }
        } else if (iMo16025n >= 0) {
            long jMo16031z = mo16031z(j11);
            if (jMo16031z < j11) {
                int iMo16025n3 = mo16025n(jMo16031z);
                if (j11 - jMo16031z <= iMo16025n3 - iMo16025n) {
                    return iMo16025n3;
                }
            }
        }
        return iMo16025n2;
    }

    /* JADX INFO: renamed from: s */
    public final String m16027s(long j10, Locale locale) {
        String strMo16173b;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String strMo16024k = mo16024k(j10);
        if (strMo16024k == null) {
            return this.iID;
        }
        InterfaceC8153b interfaceC8153bM16017l = m16017l();
        if (interfaceC8153bM16017l instanceof C8152a) {
            String[] strArrM16175e = ((C8152a) interfaceC8153bM16017l).m16175e(locale, this.iID, strMo16024k, mo16025n(j10) == mo16028t(j10));
            strMo16173b = strArrM16175e == null ? null : strArrM16175e[0];
        } else {
            strMo16173b = interfaceC8153bM16017l.mo16173b(locale, this.iID, strMo16024k);
        }
        return strMo16173b != null ? strMo16173b : m16012A(mo16025n(j10));
    }

    /* JADX INFO: renamed from: t */
    public abstract int mo16028t(long j10);

    public final String toString() {
        return this.iID;
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo16029w();

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    /* JADX INFO: renamed from: x */
    public abstract long mo16030x(long j10);

    /* JADX INFO: renamed from: z */
    public abstract long mo16031z(long j10);
}
