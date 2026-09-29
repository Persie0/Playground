package to;

import android.support.v4.media.C0141b;
import dm.C5201a;
import dm.C5207g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7653a;
import mo.C7661i;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.C5619p;
import p124fp.InterfaceC5610g;
import p124fp.InterfaceC5627x;
import p260m8.C7499b;
import p349qo.C8656b;
import p385sf.C9000b;
import p542zo.C10559a;
import so.C9095m;
import so.C9096n;
import so.C9100r;
import so.C9104v;
import so.C9106x;
import so.C9108z;

/* JADX INFO: renamed from: to.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9347b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f48082a;

    /* JADX INFO: renamed from: b */
    public static final C9095m f48083b = C9095m.b.m17319c(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final C9108z f48084c;

    /* JADX INFO: renamed from: d */
    public static final C5619p f48085d;

    /* JADX INFO: renamed from: e */
    public static final TimeZone f48086e;

    /* JADX INFO: renamed from: f */
    public static final Regex f48087f;

    /* JADX INFO: renamed from: g */
    public static final String f48088g;

    static {
        byte[] bArr = new byte[0];
        f48082a = bArr;
        C5608e c5608e = new C5608e();
        c5608e.m11952c1(bArr, 0, 0);
        long j10 = 0;
        f48084c = new C9108z(null, j10, c5608e);
        m17696c(j10, j10, j10);
        new C9104v(null, bArr, 0, 0);
        ByteString byteString = ByteString.f43897d;
        f48085d = C5619p.a.m11998b(ByteString.C8082a.m16000b("efbbbf"), ByteString.C8082a.m16000b("feff"), ByteString.C8082a.m16000b("fffe"), ByteString.C8082a.m16000b("0000ffff"), ByteString.C8082a.m16000b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C5207g.m11108c(timeZone);
        f48086e = timeZone;
        f48087f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f48088g = C7076b.m14294n3("Client", C7076b.m14292l3("okhttp3.", C9100r.class.getName()));
    }

    /* JADX INFO: renamed from: A */
    public static final void m17693A(IOException iOException, List list) {
        C5207g.m11111f(iOException, "<this>");
        C5207g.m11111f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8656b.m16899g(iOException, (Exception) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17694a(C9096n c9096n, C9096n c9096n2) {
        C5207g.m11111f(c9096n, "<this>");
        C5207g.m11111f(c9096n2, "other");
        return C5207g.m11106a(c9096n.f47458d, c9096n2.f47458d) && c9096n.f47459e == c9096n2.f47459e && C5207g.m11106a(c9096n.f47455a, c9096n2.f47455a);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public static final int m17695b(long j10, TimeUnit timeUnit) {
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(C5207g.m11116k(" < 0", "timeout").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(C5207g.m11116k(" too large.", "timeout").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(C5207g.m11116k(" too small.", "timeout").toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static final void m17696c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m17697d(Closeable closeable) {
        C5207g.m11111f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static final void m17698e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C5207g.m11106a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m17699f(String str, char c10, int i10, int i11) {
        C5207g.m11111f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public static final int m17700g(String str, int i10, int i11, String str2) {
        C5207g.m11111f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (C7076b.m14279Y2(str2, str.charAt(i10))) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m17701h(InterfaceC5627x interfaceC5627x, TimeUnit timeUnit) {
        C5207g.m11111f(interfaceC5627x, "<this>");
        C5207g.m11111f(timeUnit, "timeUnit");
        try {
            return m17714u(interfaceC5627x, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final String m17702i(String str, Object... objArr) {
        C5207g.m11111f(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return C0141b.m613i(objArrCopyOf, objArrCopyOf.length, locale, str, "format(locale, format, *args)");
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m17703j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C5207g.m11111f(strArr, "<this>");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    C5201a c5201aM14931b0 = C7499b.m14931b0(strArr2);
                    while (c5201aM14931b0.hasNext()) {
                        if (comparator.compare(str, (String) c5201aM14931b0.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final long m17704k(C9106x c9106x) {
        String strM17305a = c9106x.f47568f.m17305a("Content-Length");
        if (strM17305a != null) {
            try {
                return Long.parseLong(strM17305a);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: l */
    public static final <T> List<T> m17705l(T... tArr) {
        C5207g.m11111f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C9000b.m17252r(Arrays.copyOf(objArr, objArr.length)));
        C5207g.m11110e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: m */
    public static final int m17706m(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (C5207g.m11113h(cCharAt, 31) > 0 && C5207g.m11113h(cCharAt, 127) < 0) {
                i10 = i11;
            }
            return i10;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static final int m17707n(String str, int i10, int i11) {
        C5207g.m11111f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    /* JADX INFO: renamed from: o */
    public static final int m17708o(String str, int i10, int i11) {
        C5207g.m11111f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12 = i13;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public static final String[] m17709p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C5207g.m11111f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        loop0: while (true) {
            while (true) {
                if (i10 >= length) {
                    break loop0;
                }
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        String str2 = strArr2[i11];
                        i11++;
                        if (comparator.compare(str, str2) == 0) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m17710q(String str) {
        C5207g.m11111f(str, "name");
        if (!C7661i.m15249O2(str, "Authorization") && !C7661i.m15249O2(str, "Cookie") && !C7661i.m15249O2(str, "Proxy-Authorization")) {
            if (!C7661i.m15249O2(str, "Set-Cookie")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final int m17711r(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* JADX INFO: renamed from: s */
    public static final Charset m17712s(InterfaceC5610g interfaceC5610g, Charset charset) throws IOException {
        Charset charsetForName;
        C5207g.m11111f(interfaceC5610g, "<this>");
        C5207g.m11111f(charset, "default");
        int iMo11926C0 = interfaceC5610g.mo11926C0(f48085d);
        if (iMo11926C0 == -1) {
            return charset;
        }
        if (iMo11926C0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C5207g.m11110e(charset2, "UTF_8");
            return charset2;
        }
        if (iMo11926C0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C5207g.m11110e(charset3, "UTF_16BE");
            return charset3;
        }
        if (iMo11926C0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C5207g.m11110e(charset4, "UTF_16LE");
            return charset4;
        }
        if (iMo11926C0 == 3) {
            C7653a.f42115a.getClass();
            charsetForName = C7653a.f42119e;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                C5207g.m11110e(charsetForName, "forName(\"UTF-32BE\")");
                C7653a.f42119e = charsetForName;
            }
        } else {
            if (iMo11926C0 != 4) {
                throw new AssertionError();
            }
            C7653a.f42115a.getClass();
            charsetForName = C7653a.f42118d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                C5207g.m11110e(charsetForName, "forName(\"UTF-32LE\")");
                C7653a.f42118d = charsetForName;
            }
        }
        return charsetForName;
    }

    /* JADX INFO: renamed from: t */
    public static final int m17713t(InterfaceC5610g interfaceC5610g) throws IOException {
        C5207g.m11111f(interfaceC5610g, "<this>");
        return (interfaceC5610g.readByte() & 255) | ((interfaceC5610g.readByte() & 255) << 16) | ((interfaceC5610g.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m17714u(InterfaceC5627x interfaceC5627x, int i10, TimeUnit timeUnit) throws IOException {
        C5207g.m11111f(interfaceC5627x, "<this>");
        C5207g.m11111f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo11982c = interfaceC5627x.mo11923g().mo11984e() ? interfaceC5627x.mo11923g().mo11982c() - jNanoTime : Long.MAX_VALUE;
        interfaceC5627x.mo11923g().mo11983d(Math.min(jMo11982c, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C5608e c5608e = new C5608e();
            while (interfaceC5627x.mo11924j0(c5608e, 8192L) != -1) {
                c5608e.m11951b();
            }
            if (jMo11982c == Long.MAX_VALUE) {
                interfaceC5627x.mo11923g().mo11980a();
            } else {
                interfaceC5627x.mo11923g().mo11983d(jNanoTime + jMo11982c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo11982c == Long.MAX_VALUE) {
                interfaceC5627x.mo11923g().mo11980a();
            } else {
                interfaceC5627x.mo11923g().mo11983d(jNanoTime + jMo11982c);
            }
            return false;
        } catch (Throwable th2) {
            if (jMo11982c == Long.MAX_VALUE) {
                interfaceC5627x.mo11923g().mo11980a();
            } else {
                interfaceC5627x.mo11923g().mo11983d(jNanoTime + jMo11982c);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final C9095m m17715v(List<C10559a> list) {
        C5207g.m11111f(list, "<this>");
        C9095m.a aVar = new C9095m.a();
        for (C10559a c10559a : list) {
            aVar.m17313c(c10559a.f52635a.m15988A(), c10559a.f52636b.m15988A());
        }
        return aVar.m17314d();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x005a, please report this as an issue */
    /* JADX INFO: renamed from: w */
    public static final String m17716w(C9096n c9096n, boolean z10) {
        int i10;
        C5207g.m11111f(c9096n, "<this>");
        String str = c9096n.f47458d;
        if (C7076b.m14278X2(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i11 = c9096n.f47459e;
        if (z10) {
            str = str + ':' + i11;
        } else {
            String str2 = c9096n.f47455a;
            C5207g.m11111f(str2, "scheme");
            if (C5207g.m11106a(str2, "http")) {
                i10 = 80;
            } else {
                i10 = C5207g.m11106a(str2, "https") ? 443 : -1;
            }
            if (i11 != i10) {
                str = str + ':' + i11;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static final <T> List<T> m17717x(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(C6752c.m13454v0(list));
        C5207g.m11110e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: y */
    public static final int m17718y(String str, int i10) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    /* JADX INFO: renamed from: z */
    public static final String m17719z(String str, int i10, int i11) {
        C5207g.m11111f(str, "<this>");
        int iM17707n = m17707n(str, i10, i11);
        String strSubstring = str.substring(iM17707n, m17708o(str, iM17707n, i11));
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
