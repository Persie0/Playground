package okhttp3.internal.publicsuffix;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.sequences.C7073a;
import kotlin.text.C7076b;
import p034bp.C1640h;
import p124fp.C5614k;
import p124fp.C5616m;
import p124fp.C5617n;
import p124fp.C5618o;
import p124fp.C5622s;
import p124fp.C5628y;
import p249lo.InterfaceC7415h;
import p385sf.C9000b;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "okhttp"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final byte[] f43886e;

    /* JADX INFO: renamed from: f */
    public static final List<String> f43887f;

    /* JADX INFO: renamed from: g */
    public static final PublicSuffixDatabase f43888g;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f43889a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f43890b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f43891c;

    /* JADX INFO: renamed from: d */
    public byte[] f43892d;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C8079a {
        /* JADX INFO: renamed from: a */
        public static final String m15984a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            byte[] bArr3 = PublicSuffixDatabase.f43886e;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > -1 && bArr[i15] != 10) {
                    i15--;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i11 = i16 + i17;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i11 - i16;
                int i19 = i10;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr4 = C9347b.f48082a;
                        int i22 = b10 & 255;
                        z10 = z11;
                        i12 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr5 = C9347b.f48082a;
                    i13 = i12 - (b11 & 255);
                    if (i13 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset charset = StandardCharsets.UTF_8;
                                C5207g.m11110e(charset, "UTF_8");
                                return new String(bArr, i16, i18, charset);
                            }
                        }
                    }
                    i14 = i11 + 1;
                }
                length = i16 - 1;
            }
            return null;
        }
    }

    static {
        new C8079a();
        f43886e = new byte[]{42};
        f43887f = C9000b.m17251q("*");
        f43888g = new PublicSuffixDatabase();
    }

    /* JADX INFO: renamed from: c */
    public static List m15981c(String str) {
        List listM14298r3 = C7076b.m14298r3(str, new char[]{'.'});
        return C5207g.m11106a(C6752c.m13432Z(listM14298r3), "") ? C6752c.m13418L(listM14298r3) : listM14298r3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final String m15982a(String str) throws IOException {
        String strM15984a;
        String strM15984a2;
        String strM15984a3;
        List<String> listM14298r3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        C5207g.m11110e(unicode, "unicodeDomain");
        List listM15981c = m15981c(unicode);
        int i10 = 0;
        if (this.f43889a.get() || !this.f43889a.compareAndSet(false, true)) {
            try {
                this.f43890b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        try {
                            m15983b();
                            break;
                        } catch (IOException e10) {
                            C1640h c1640h = C1640h.f9199a;
                            C1640h.f9199a.getClass();
                            C1640h.m5333i(5, "Failed to read public suffix list", e10);
                            if (z10) {
                            }
                        }
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.f43891c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listM15981c.size();
        byte[][] bArr = new byte[size3][];
        for (int i11 = 0; i11 < size3; i11++) {
            String str2 = (String) listM15981c.get(i11);
            Charset charset = StandardCharsets.UTF_8;
            C5207g.m11110e(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            C5207g.m11110e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strM15984a = null;
                break;
            }
            int i13 = i12 + 1;
            byte[] bArr2 = this.f43891c;
            if (bArr2 == null) {
                C5207g.m11117l("publicSuffixListBytes");
                throw null;
            }
            strM15984a = C8079a.m15984a(bArr2, bArr, i12);
            if (strM15984a != null) {
                break;
            }
            i12 = i13;
        }
        if (size3 <= 1) {
            strM15984a2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                strM15984a2 = null;
                break;
            }
            int i15 = i14 + 1;
            bArr3[i14] = f43886e;
            byte[] bArr4 = this.f43891c;
            if (bArr4 == null) {
                C5207g.m11117l("publicSuffixListBytes");
                throw null;
            }
            strM15984a2 = C8079a.m15984a(bArr4, bArr3, i14);
            if (strM15984a2 != null) {
                break;
            }
            i14 = i15;
        }
        if (strM15984a2 == null) {
            strM15984a3 = null;
            break;
        }
        int i16 = size3 - 1;
        int i17 = 0;
        while (true) {
            if (i17 >= i16) {
                strM15984a3 = null;
                break;
            }
            int i18 = i17 + 1;
            byte[] bArr5 = this.f43892d;
            if (bArr5 == null) {
                C5207g.m11117l("publicSuffixExceptionListBytes");
                throw null;
            }
            strM15984a3 = C8079a.m15984a(bArr5, bArr, i17);
            if (strM15984a3 != null) {
                break;
            }
            i17 = i18;
        }
        if (strM15984a3 != null) {
            listM14298r3 = C7076b.m14298r3(C5207g.m11116k(strM15984a3, "!"), new char[]{'.'});
        } else if (strM15984a == null && strM15984a2 == null) {
            listM14298r3 = f43887f;
        } else {
            List<String> listM14298r4 = strM15984a == null ? null : C7076b.m14298r3(strM15984a, new char[]{'.'});
            if (listM14298r4 == null) {
                listM14298r4 = EmptyList.f38032a;
            }
            listM14298r3 = strM15984a2 == null ? null : C7076b.m14298r3(strM15984a2, new char[]{'.'});
            if (listM14298r3 == null) {
                listM14298r3 = EmptyList.f38032a;
            }
            if (listM14298r4.size() > listM14298r3.size()) {
                listM14298r3 = listM14298r4;
            }
        }
        if (listM15981c.size() == listM14298r3.size() && listM14298r3.get(0).charAt(0) != '!') {
            return null;
        }
        if (listM14298r3.get(0).charAt(0) == '!') {
            size = listM15981c.size();
            size2 = listM14298r3.size();
        } else {
            size = listM15981c.size();
            size2 = listM14298r3.size() + 1;
        }
        InterfaceC7415h interfaceC7415hM14254O2 = C7073a.m14254O2(C6752c.m13413G(m15981c(str)), size - size2);
        C5207g.m11111f(interfaceC7415hM14254O2, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : interfaceC7415hM14254O2) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ".");
            }
            C0062b.m288M(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        C5207g.m11110e(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m15983b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = C5618o.f34451a;
        C5622s c5622sM11991c = C5617n.m11991c(new C5614k(new C5616m(resourceAsStream, new C5628y())));
        try {
            long j10 = c5622sM11991c.readInt();
            c5622sM11991c.mo11960o1(j10);
            byte[] bArrM11966s0 = c5622sM11991c.f34460b.m11966s0(j10);
            long j11 = c5622sM11991c.readInt();
            c5622sM11991c.mo11960o1(j11);
            byte[] bArrM11966s1 = c5622sM11991c.f34460b.m11966s0(j11);
            C9072e c9072e = C9072e.f47360a;
            C5206f.m11032z0(c5622sM11991c, null);
            synchronized (this) {
                try {
                    this.f43891c = bArrM11966s0;
                    this.f43892d = bArrM11966s1;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f43890b.countDown();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C5206f.m11032z0(c5622sM11991c, th3);
                throw th4;
            }
        }
    }
}
