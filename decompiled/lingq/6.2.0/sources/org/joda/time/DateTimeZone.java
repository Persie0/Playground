package org.joda.time;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.p022tz.FixedDateTimeZone;
import p000.C3386nv;
import p000.b22;
import p000.bfa;
import p000.dcb;
import p000.hn1;
import p000.k12;
import p000.k72;
import p000.nc3;
import p000.s94;
import p000.to7;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeZone implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final DateTimeZone f54829a = UTCDateTimeZone.f54846e;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f54830b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f54831c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f54832d = new AtomicReference();
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* JADX INFO: renamed from: a */
        public transient String f54833a;

        public Stub(String str) {
            this.f54833a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.f54833a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.m18337c(this.f54833a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f54833a);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
        } else {
            C3386nv.m17626m("Id must not be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static DateTimeZone m18337c(String str) {
        String strSubstring;
        if (str == null) {
            return m18340f();
        }
        boolean zEquals = str.equals("UTC");
        DateTimeZone dateTimeZone = f54829a;
        if (zEquals) {
            return dateTimeZone;
        }
        DateTimeZone dateTimeZoneMo3686a = m18342m().mo3686a(str);
        if (dateTimeZoneMo3686a != null) {
            return dateTimeZoneMo3686a;
        }
        if (str.equals("UT") || str.equals("GMT") || str.equals("Z")) {
            return dateTimeZone;
        }
        if (str.startsWith("UTC+") || str.startsWith("UTC-") || str.startsWith("GMT+") || str.startsWith("GMT-")) {
            strSubstring = str.substring(3);
        } else {
            strSubstring = (str.startsWith("UT+") || str.startsWith("UT-")) ? str.substring(2) : str;
        }
        if (!strSubstring.startsWith("+") && !strSubstring.startsWith("-")) {
            C3386nv.m17626m(wq1.m24118n("The datetime zone id '", str, "' is not recognised"));
            return null;
        }
        int iM18343r = m18343r(strSubstring);
        if (iM18343r == 0) {
            return dateTimeZone;
        }
        return iM18343r == 0 ? dateTimeZone : new FixedDateTimeZone(m18344t(iM18343r), iM18343r, iM18343r, null);
    }

    /* JADX INFO: renamed from: d */
    public static DateTimeZone m18338d(int i) {
        if (i >= -86399999 && i <= 86399999) {
            return i == 0 ? f54829a : new FixedDateTimeZone(m18344t(i), i, i, null);
        }
        C3386nv.m17626m(ux5.m22988k(i, "Millis out of range: "));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static DateTimeZone m18339e(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return m18340f();
        }
        String id = timeZone.getID();
        if (id == null) {
            C3386nv.m17626m("The TimeZone id must not be null");
            return null;
        }
        boolean zEquals = id.equals("UTC");
        DateTimeZone dateTimeZone = f54829a;
        if (!zEquals) {
            String str = (String) AbstractC3424a.f54847a.get(id);
            to7 to7VarM18342m = m18342m();
            DateTimeZone dateTimeZoneMo3686a = str != null ? to7VarM18342m.mo3686a(str) : null;
            if (dateTimeZoneMo3686a == null) {
                dateTimeZoneMo3686a = to7VarM18342m.mo3686a(id);
            }
            if (dateTimeZoneMo3686a != null) {
                return dateTimeZoneMo3686a;
            }
            if (str != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                C3386nv.m17626m(wq1.m24118n("The datetime zone id '", id, "' is not recognised"));
                return null;
            }
            String strSubstring = id.substring(3);
            if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
                StringBuilder sb = new StringBuilder(strSubstring);
                for (int i = 0; i < sb.length(); i++) {
                    int iDigit = Character.digit(sb.charAt(i), 10);
                    if (iDigit >= 0) {
                        sb.setCharAt(i, (char) (iDigit + 48));
                    }
                }
                strSubstring = sb.toString();
            }
            int iM18343r = m18343r(strSubstring);
            if (iM18343r != 0) {
                return iM18343r == 0 ? dateTimeZone : new FixedDateTimeZone(m18344t(iM18343r), iM18343r, iM18343r, null);
            }
        }
        return dateTimeZone;
    }

    /* JADX INFO: renamed from: f */
    public static DateTimeZone m18340f() {
        AtomicReference atomicReference = f54832d;
        DateTimeZone dateTimeZoneM18339e = (DateTimeZone) atomicReference.get();
        if (dateTimeZoneM18339e != null) {
            return dateTimeZoneM18339e;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZoneM18339e = m18337c(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZoneM18339e == null) {
            try {
                dateTimeZoneM18339e = m18339e(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZoneM18339e == null) {
            dateTimeZoneM18339e = f54829a;
        }
        DateTimeZone dateTimeZone = dateTimeZoneM18339e;
        while (!atomicReference.compareAndSet(null, dateTimeZone)) {
            if (atomicReference.get() != null) {
                return (DateTimeZone) atomicReference.get();
            }
        }
        return dateTimeZone;
    }

    /* JADX INFO: renamed from: j */
    public static k72 m18341j() {
        AtomicReference atomicReference = f54831c;
        k72 k72Var = (k72) atomicReference.get();
        if (k72Var != null) {
            return k72Var;
        }
        k72 k72Var2 = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!k72.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + k72.class);
                    }
                    k72Var2 = (k72) cls.asSubclass(k72.class).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException unused) {
        }
        if (k72Var2 == null) {
            k72Var2 = new k72();
        }
        return !hn1.m13375y(atomicReference, k72Var2) ? (k72) atomicReference.get() : k72Var2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:28:0x0085->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static to7 m18342m() {
        to7 dcbVar;
        to7 bfaVar;
        AtomicReference atomicReference = f54830b;
        to7 to7Var = (to7) atomicReference.get();
        if (to7Var != null) {
            return to7Var;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property == null) {
                try {
                    String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
                    if (property2 != null) {
                        try {
                            dcbVar = new dcb(new File(property2));
                            m18345u(dcbVar);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        try {
                            bfaVar = new dcb();
                            m18345u(bfaVar);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            bfaVar = new bfa();
                        }
                    }
                } catch (SecurityException unused) {
                }
                while (!atomicReference.compareAndSet(null, dcbVar)) {
                    if (atomicReference.get() != null) {
                        return (to7) atomicReference.get();
                    }
                }
                return dcbVar;
            }
            try {
                Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (!to7.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + to7.class);
                }
                bfaVar = (to7) cls.asSubclass(to7.class).getConstructor(null).newInstance(null);
                m18345u(bfaVar);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } catch (SecurityException unused2) {
        }
        dcbVar = bfaVar;
        while (!atomicReference.compareAndSet(null, dcbVar)) {
            if (atomicReference.get() != null) {
                return (to7) atomicReference.get();
            }
        }
        return dcbVar;
    }

    /* JADX INFO: renamed from: r */
    public static int m18343r(String str) {
        k12 k12Var = AbstractC3424a.f54848b;
        s94 s94Var = k12Var.f46545b;
        if (s94Var != null) {
            return -((int) new b22(k12Var.m14768c(k12Var.f46548e), k12Var.f46546c).m3183d(s94Var, str));
        }
        C3386nv.m17636w("Parsing not supported");
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public static String m18344t(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        try {
            nc3.m17345a(stringBuffer, i2, 2);
        } catch (IOException unused) {
        }
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(':');
        try {
            nc3.m17345a(stringBuffer, i4, 2);
        } catch (IOException unused2) {
        }
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / DescriptorProtos.Edition.EDITION_2023_VALUE;
        stringBuffer.append(':');
        try {
            nc3.m17345a(stringBuffer, i6, 2);
        } catch (IOException unused3) {
        }
        int i7 = i5 - (i6 * DescriptorProtos.Edition.EDITION_2023_VALUE);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        try {
            nc3.m17345a(stringBuffer, i7, 3);
        } catch (IOException unused4) {
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: u */
    public static void m18345u(to7 to7Var) {
        Set setMo3687b = to7Var.mo3687b();
        if (setMo3687b == null || setMo3687b.size() == 0) {
            C3386nv.m17626m("The provider doesn't have any available ids");
            return;
        }
        if (!setMo3687b.contains("UTC")) {
            C3386nv.m17626m("The provider doesn't support UTC");
            return;
        }
        DateTimeZone dateTimeZoneMo3686a = to7Var.mo3686a("UTC");
        ((UTCDateTimeZone) f54829a).getClass();
        if (dateTimeZoneMo3686a instanceof UTCDateTimeZone) {
            return;
        }
        C3386nv.m17626m("Invalid UTC zone provided");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX INFO: renamed from: a */
    public final long m18346a(long j, long j2) {
        int iMo18351k = mo18351k(j2);
        long j3 = j - ((long) iMo18351k);
        if (mo18351k(j3) == iMo18351k) {
            return j3;
        }
        int iMo18351k2 = mo18351k(j);
        long j4 = j - ((long) iMo18351k2);
        int iMo18351k3 = mo18351k(j4);
        if (iMo18351k2 == iMo18351k3 || iMo18351k2 >= 0) {
            iMo18351k2 = iMo18351k3;
        } else {
            long jMo18356q = mo18356q(j4);
            if (jMo18356q == j4) {
                jMo18356q = Long.MAX_VALUE;
            }
            long j5 = j - ((long) iMo18351k3);
            long jMo18356q2 = mo18356q(j5);
            if (jMo18356q == (jMo18356q2 != j5 ? jMo18356q2 : Long.MAX_VALUE)) {
                iMo18351k2 = iMo18351k3;
            }
        }
        long j6 = iMo18351k2;
        long j7 = j - j6;
        if ((j ^ j7) >= 0 || (j ^ j6) >= 0) {
            return j7;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    /* JADX INFO: renamed from: b */
    public final long m18347b(long j) {
        long jMo18351k = mo18351k(j);
        long j2 = j + jMo18351k;
        if ((j ^ j2) >= 0 || (j ^ jMo18351k) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    public final String m18348g() {
        return this.iID;
    }

    /* JADX INFO: renamed from: h */
    public final String m18349h(long j, Locale locale) {
        String strM14931b;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String strMo18350i = mo18350i(j);
        if (strMo18350i == null) {
            return this.iID;
        }
        k72 k72VarM18341j = m18341j();
        String str = this.iID;
        if (k72VarM18341j != null) {
            strM14931b = k72VarM18341j.m14932c(locale, str, strMo18350i, mo18351k(j) == mo18354o(j));
        } else {
            strM14931b = k72VarM18341j.m14931b(str, strMo18350i, locale);
        }
        return strM14931b != null ? strM14931b : m18344t(mo18351k(j));
    }

    public abstract int hashCode();

    /* JADX INFO: renamed from: i */
    public abstract String mo18350i(long j);

    /* JADX INFO: renamed from: k */
    public abstract int mo18351k(long j);

    /* JADX INFO: renamed from: l */
    public int mo18352l(long j) {
        int iMo18351k = mo18351k(j);
        long j2 = j - ((long) iMo18351k);
        int iMo18351k2 = mo18351k(j2);
        if (iMo18351k != iMo18351k2) {
            if (iMo18351k - iMo18351k2 < 0) {
                long jMo18356q = mo18356q(j2);
                if (jMo18356q == j2) {
                    jMo18356q = Long.MAX_VALUE;
                }
                long j3 = j - ((long) iMo18351k2);
                long jMo18356q2 = mo18356q(j3);
                if (jMo18356q != (jMo18356q2 != j3 ? jMo18356q2 : Long.MAX_VALUE)) {
                    return iMo18351k;
                }
            }
        } else if (iMo18351k >= 0) {
            long jMo18357s = mo18357s(j2);
            if (jMo18357s < j2) {
                int iMo18351k3 = mo18351k(jMo18357s);
                if (j2 - jMo18357s <= iMo18351k3 - iMo18351k) {
                    return iMo18351k3;
                }
            }
        }
        return iMo18351k2;
    }

    /* JADX INFO: renamed from: n */
    public final String m18353n(long j, Locale locale) {
        String strM14935f;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String strMo18350i = mo18350i(j);
        if (strMo18350i == null) {
            return this.iID;
        }
        k72 k72VarM18341j = m18341j();
        String str = this.iID;
        if (k72VarM18341j != null) {
            strM14935f = k72VarM18341j.m14936g(locale, str, strMo18350i, mo18351k(j) == mo18354o(j));
        } else {
            strM14935f = k72VarM18341j.m14935f(str, strMo18350i, locale);
        }
        return strM14935f != null ? strM14935f : m18344t(mo18351k(j));
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo18354o(long j);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo18355p();

    /* JADX INFO: renamed from: q */
    public abstract long mo18356q(long j);

    /* JADX INFO: renamed from: s */
    public abstract long mo18357s(long j);

    public final String toString() {
        return this.iID;
    }

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }
}
