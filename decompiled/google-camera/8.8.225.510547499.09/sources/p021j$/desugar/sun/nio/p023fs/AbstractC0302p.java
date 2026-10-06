package p021j$.desugar.sun.nio.p023fs;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.p */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0302p {

    /* JADX INFO: renamed from: a */
    private static final long f32803a;

    /* JADX INFO: renamed from: b */
    private static final long f32804b;

    /* JADX INFO: renamed from: c */
    private static final char[] f32805c;

    static {
        long j = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j |= 1 << iMax;
        }
        long jM12044c = m12044c('A', 'Z') | m12044c('a', 'z') | 0;
        long jM12046e = m12046e("-_.!~*'()");
        long jM12045d = jM12044c | m12045d("-_.!~*'()");
        long jM12046e2 = j | 0 | jM12046e | m12046e(":@&=+$,");
        long jM12045d2 = jM12045d | m12045d(":@&=+$,");
        f32803a = jM12046e2 | m12046e(";/");
        f32804b = jM12045d2 | m12045d(";/");
        f32805c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX INFO: renamed from: a */
    private static int m12042a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new AssertionError();
            }
        }
        return (c - c2) + 10;
    }

    /* JADX INFO: renamed from: b */
    static C0301o m12043b(C0295i c0295i, URI uri, String str, String str2) {
        byte bM12042a;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i3 + 1;
                char cCharAt2 = rawPath.charAt(i3);
                int i5 = i4 + 1;
                bM12042a = (byte) (m12042a(rawPath.charAt(i4)) | (m12042a(cCharAt2) << 4));
                if (bM12042a == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
                i3 = i5;
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bM12042a = (byte) cCharAt;
            }
            bArrCopyOf[i2] = bM12042a;
            i = i3;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new C0301o(c0295i, new String(bArrCopyOf, AbstractC0303q.m12048a()), str, str2);
    }

    /* JADX INFO: renamed from: c */
    private static long m12044c(char c, char c2) {
        long j = 0;
        for (int iMax = Math.max(Math.min((int) c, 127), 64) - 64; iMax <= Math.max(Math.min((int) c2, 127), 64) - 64; iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    private static long m12045d(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '@' && cCharAt < 128) {
                j |= 1 << (cCharAt - '@');
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    private static long m12046e(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '@') {
                j |= 1 << cCharAt;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: f */
    static URI m12047f(C0301o c0301o) {
        byte[] bArrM12027a = c0301o.toAbsolutePath().m12027a();
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArrM12027a.length; i++) {
            char c = (char) (bArrM12027a[i] & 255);
            boolean z = false;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & f32804b) == 0) : ((1 << c) & f32803a) != 0) {
                z = true;
            }
            if (!z) {
                sb.append('%');
                char[] cArr = f32805c;
                sb.append(cArr[(c >> 4) & 15]);
                c = cArr[c & 15];
            }
            sb.append(c);
        }
        if (sb.charAt(sb.length() - 1) != '/' && c0301o.toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }
}
