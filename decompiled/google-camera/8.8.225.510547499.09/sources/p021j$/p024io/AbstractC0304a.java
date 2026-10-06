package p021j$.p024io;

import p021j$.nio.file.attribute.AbstractC0379t;
import p021j$.nio.file.attribute.FileAttribute;
import p021j$.time.C0417b;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.io.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0304a {
    /* JADX INFO: renamed from: a */
    public static int m12049a(TemporalAccessor temporalAccessor, InterfaceC0483l interfaceC0483l) {
        C0488q c0488qMo12250j = temporalAccessor.mo12250j(interfaceC0483l);
        if (!c0488qMo12250j.m12455g()) {
            throw new C0487p("Invalid field " + String.valueOf(interfaceC0483l) + " for get() method, use getLong() instead");
        }
        long jMo12251k = temporalAccessor.mo12251k(interfaceC0483l);
        if (c0488qMo12250j.m12456h(jMo12251k)) {
            return (int) jMo12251k;
        }
        throw new C0417b("Invalid value for " + String.valueOf(interfaceC0483l) + " (valid values " + String.valueOf(c0488qMo12250j) + "): " + jMo12251k);
    }

    /* JADX INFO: renamed from: b */
    public static Object m12050b(TemporalAccessor temporalAccessor, InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12445g() || interfaceC0486o == AbstractC0485n.m12439a() || interfaceC0486o == AbstractC0485n.m12443e()) {
            return null;
        }
        return interfaceC0486o.mo12274a(temporalAccessor);
    }

    /* JADX INFO: renamed from: c */
    public static C0488q m12051c(TemporalAccessor temporalAccessor, InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            if (temporalAccessor.mo12248h(interfaceC0483l)) {
                return interfaceC0483l.mo12424f();
            }
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        if (interfaceC0483l != null) {
            return interfaceC0483l.mo12427j(temporalAccessor);
        }
        throw new NullPointerException("field");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m12052d(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ FileAttribute[] m12053e(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        FileAttribute[] fileAttributeArr2 = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr2[i] = AbstractC0379t.m12179a(fileAttributeArr[i]);
        }
        return fileAttributeArr2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ java.nio.file.attribute.FileAttribute[] m12054f(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr2[i] = AbstractC0379t.m12181c(fileAttributeArr[i]);
        }
        return fileAttributeArr2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m12055g(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros((-1) ^ j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m12056h(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
