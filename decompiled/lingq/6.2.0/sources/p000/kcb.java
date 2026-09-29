package p000;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcb {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f47051a;

    /* JADX INFO: renamed from: b */
    public static final String f47052b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f47051a = timeZone;
        String strM23398u0 = vk9.m23398u0(dr6.class.getName(), "okhttp3.");
        if (vk9.m23383f0(strM23398u0, "Client")) {
            strM23398u0 = strM23398u0.substring(0, strM23398u0.length() - "Client".length());
        }
        f47052b = strM23398u0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m15110a(ex3 ex3Var, ex3 ex3Var2) {
        ex3Var.getClass();
        ex3Var2.getClass();
        return fa4.m11650l(ex3Var.f38027d, ex3Var2.f38027d) && ex3Var.f38028e == ex3Var2.f38028e && fa4.m11650l(ex3Var.f38024a, ex3Var2.f38024a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m15111b() {
        TimeUnit.SECONDS.getClass();
        return 60000;
    }

    /* JADX INFO: renamed from: c */
    public static final void m15112c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!fa4.m11650l(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m15113d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: e */
    public static final long m15114e(j88 j88Var) {
        String strM20121d = j88Var.f45206f.m20121d("Content-Length");
        if (strM20121d == null) {
            return -1L;
        }
        byte[] bArr = icb.f43946a;
        try {
            return Long.parseLong(strM20121d);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Charset m15115f(hj0 hj0Var, Charset charset) {
        hj0Var.getClass();
        charset.getClass();
        int iMo501y = hj0Var.mo501y(icb.f43947b);
        if (iMo501y == -1) {
            return charset;
        }
        if (iMo501y == 0) {
            return yu0.f70463a;
        }
        if (iMo501y == 1) {
            return yu0.f70464b;
        }
        if (iMo501y == 2) {
            Charset charset2 = yu0.f70463a;
            Charset charset3 = yu0.f70467e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            yu0.f70467e = charsetForName;
            return charsetForName;
        }
        if (iMo501y == 3) {
            return yu0.f70465c;
        }
        if (iMo501y != 4) {
            uk9.m22780o();
            return null;
        }
        Charset charset4 = yu0.f70463a;
        Charset charset5 = yu0.f70468f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        yu0.f70468f = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m15116g(yd9 yd9Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jMo4283c = yd9Var.mo484i().mo4284e() ? yd9Var.mo484i().mo4283c() - jNanoTime : Long.MAX_VALUE;
        yd9Var.mo484i().mo3171d(Math.min(jMo4283c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            aj0 aj0Var = new aj0();
            while (yd9Var.mo459F(aj0Var, 8192L) != -1) {
                aj0Var.m473a();
            }
            if (jMo4283c == Long.MAX_VALUE) {
                yd9Var.mo484i().mo4281a();
                return true;
            }
            yd9Var.mo484i().mo3171d(jNanoTime + jMo4283c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo4283c == Long.MAX_VALUE) {
                yd9Var.mo484i().mo4281a();
                return false;
            }
            yd9Var.mo484i().mo3171d(jNanoTime + jMo4283c);
            return false;
        } catch (Throwable th) {
            if (jMo4283c == Long.MAX_VALUE) {
                yd9Var.mo484i().mo4281a();
            } else {
                yd9Var.mo484i().mo3171d(jNanoTime + jMo4283c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final qr3 m15117h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jr3 jr3Var = (jr3) it.next();
            ByteString byteString = jr3Var.f46037a;
            ByteString byteString2 = jr3Var.f46038b;
            String strM18089r = byteString.m18089r();
            String strM18089r2 = byteString2.m18089r();
            arrayList.add(strM18089r);
            arrayList.add(vk9.m23376L0(strM18089r2).toString());
        }
        return new qr3((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: i */
    public static final String m15118i(ex3 ex3Var, boolean z) {
        int i;
        ex3Var.getClass();
        int i2 = ex3Var.f38028e;
        String strM22986i = ex3Var.f38027d;
        if (vk9.m23380c0(strM22986i, ":", false)) {
            strM22986i = ux5.m22986i(']', "[", strM22986i);
        }
        if (!z) {
            String str = ex3Var.f38024a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strM22986i;
            }
        }
        return strM22986i + ':' + i2;
    }

    /* JADX INFO: renamed from: j */
    public static final List m15119j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return EmptyList.f47638a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: k */
    public static final List m15120k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return EmptyList.f47638a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
