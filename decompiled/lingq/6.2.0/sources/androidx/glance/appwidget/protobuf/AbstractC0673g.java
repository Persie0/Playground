package androidx.glance.appwidget.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p000.aha;
import p000.q94;
import p000.vj6;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0673g {

    /* JADX INFO: renamed from: b */
    public static final Logger f6073b = Logger.getLogger(AbstractC0673g.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f6074c = aha.f679e;

    /* JADX INFO: renamed from: a */
    public vj6 f6075a;

    /* JADX INFO: renamed from: a */
    public static int m2370a(int i, ByteString byteString) {
        int iM2374e = m2374e(i);
        int size = byteString.size();
        return m2375f(size) + size + iM2374e;
    }

    /* JADX INFO: renamed from: b */
    public static int m2371b(int i) {
        return m2375f((i >> 31) ^ (i << 1));
    }

    /* JADX INFO: renamed from: c */
    public static int m2372c(long j) {
        return m2376g((j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: d */
    public static int m2373d(String str) {
        int length;
        try {
            length = AbstractC0684r.m2481b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(q94.f57449a).length;
        }
        return m2375f(length) + length;
    }

    /* JADX INFO: renamed from: e */
    public static int m2374e(int i) {
        return m2375f(i << 3);
    }

    /* JADX INFO: renamed from: f */
    public static int m2375f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m2376g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: h */
    public final void m2377h(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) throws CodedOutputStream$OutOfSpaceException {
        f6073b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(q94.f57449a);
        try {
            mo2358w(bytes.length);
            mo2353r(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo2344i(byte b);

    /* JADX INFO: renamed from: j */
    public abstract void mo2345j(int i, boolean z);

    /* JADX INFO: renamed from: k */
    public abstract void mo2346k(int i, ByteString byteString);

    /* JADX INFO: renamed from: l */
    public abstract void mo2347l(int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract void mo2348m(int i);

    /* JADX INFO: renamed from: n */
    public abstract void mo2349n(int i, long j);

    /* JADX INFO: renamed from: o */
    public abstract void mo2350o(long j);

    /* JADX INFO: renamed from: p */
    public abstract void mo2351p(int i, int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo2352q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo2353r(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: s */
    public abstract void mo2354s(int i, AbstractC0667a abstractC0667a, ym8 ym8Var);

    /* JADX INFO: renamed from: t */
    public abstract void mo2355t(int i, String str);

    /* JADX INFO: renamed from: u */
    public abstract void mo2356u(int i, int i2);

    /* JADX INFO: renamed from: v */
    public abstract void mo2357v(int i, int i2);

    /* JADX INFO: renamed from: w */
    public abstract void mo2358w(int i);

    /* JADX INFO: renamed from: x */
    public abstract void mo2359x(int i, long j);

    /* JADX INFO: renamed from: y */
    public abstract void mo2360y(long j);
}
