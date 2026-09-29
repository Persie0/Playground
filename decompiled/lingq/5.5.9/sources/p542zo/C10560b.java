package p542zo;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.C5617n;
import p124fp.C5622s;
import tl.C9322j;
import to.C9347b;

/* JADX INFO: renamed from: zo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10560b {

    /* JADX INFO: renamed from: a */
    public static final C10559a[] f52638a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString, Integer> f52639b;

    /* JADX INFO: renamed from: zo.b$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public final C5622s f52643d;

        /* JADX INFO: renamed from: g */
        public int f52646g;

        /* JADX INFO: renamed from: h */
        public int f52647h;

        /* JADX INFO: renamed from: a */
        public final int f52640a = 4096;

        /* JADX INFO: renamed from: b */
        public int f52641b = 4096;

        /* JADX INFO: renamed from: c */
        public final ArrayList f52642c = new ArrayList();

        /* JADX INFO: renamed from: e */
        public C10559a[] f52644e = new C10559a[8];

        /* JADX INFO: renamed from: f */
        public int f52645f = 7;

        public a(C10573o.b bVar) {
            this.f52643d = C5617n.m11991c(bVar);
        }

        /* JADX INFO: renamed from: a */
        public final int m19529a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f52644e.length - 1;
                while (true) {
                    i11 = this.f52645f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C10559a c10559a = this.f52644e[length];
                    C5207g.m11108c(c10559a);
                    int i13 = c10559a.f52637c;
                    i10 -= i13;
                    this.f52647h -= i13;
                    this.f52646g--;
                    i12++;
                    length--;
                }
                C10559a[] c10559aArr = this.f52644e;
                System.arraycopy(c10559aArr, i11 + 1, c10559aArr, i11 + 1 + i12, this.f52646g);
                this.f52645f += i12;
            }
            return i12;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final ByteString m19530b(int i10) throws IOException {
            if (i10 >= 0 && i10 <= C10560b.f52638a.length - 1) {
                return C10560b.f52638a[i10].f52635a;
            }
            int length = this.f52645f + 1 + (i10 - C10560b.f52638a.length);
            if (length >= 0) {
                C10559a[] c10559aArr = this.f52644e;
                if (length < c10559aArr.length) {
                    C10559a c10559a = c10559aArr[length];
                    C5207g.m11108c(c10559a);
                    return c10559a.f52635a;
                }
            }
            throw new IOException(C5207g.m11116k(Integer.valueOf(i10 + 1), "Header index too large "));
        }

        /* JADX INFO: renamed from: c */
        public final void m19531c(C10559a c10559a) {
            this.f52642c.add(c10559a);
            int i10 = this.f52641b;
            int i11 = c10559a.f52637c;
            if (i11 > i10) {
                C9322j.m17679g0(this.f52644e, null);
                this.f52645f = this.f52644e.length - 1;
                this.f52646g = 0;
                this.f52647h = 0;
                return;
            }
            m19529a((this.f52647h + i11) - i10);
            int i12 = this.f52646g + 1;
            C10559a[] c10559aArr = this.f52644e;
            if (i12 > c10559aArr.length) {
                C10559a[] c10559aArr2 = new C10559a[c10559aArr.length * 2];
                System.arraycopy(c10559aArr, 0, c10559aArr2, c10559aArr.length, c10559aArr.length);
                this.f52645f = this.f52644e.length - 1;
                this.f52644e = c10559aArr2;
            }
            int i13 = this.f52645f;
            this.f52645f = i13 - 1;
            this.f52644e[i13] = c10559a;
            this.f52646g++;
            this.f52647h += i11;
        }

        /* JADX INFO: renamed from: d */
        public final ByteString m19532d() throws IOException {
            C5622s c5622s = this.f52643d;
            byte b10 = c5622s.readByte();
            byte[] bArr = C9347b.f48082a;
            int i10 = b10 & 255;
            int i11 = 0;
            boolean z10 = (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128;
            long jM19533e = m19533e(i10, 127);
            if (!z10) {
                return c5622s.mo11968t(jM19533e);
            }
            C5608e c5608e = new C5608e();
            int[] iArr = C10576r.f52785a;
            C5207g.m11111f(c5622s, "source");
            C10576r.a aVar = C10576r.f52787c;
            long j10 = 0;
            C10576r.a aVar2 = aVar;
            int i12 = 0;
            while (j10 < jM19533e) {
                j10++;
                byte b11 = c5622s.readByte();
                byte[] bArr2 = C9347b.f48082a;
                i11 = (i11 << 8) | (b11 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    int i13 = i12 - 8;
                    C10576r.a[] aVarArr = aVar2.f52788a;
                    C5207g.m11108c(aVarArr);
                    aVar2 = aVarArr[(i11 >>> i13) & 255];
                    C5207g.m11108c(aVar2);
                    if (aVar2.f52788a == null) {
                        c5608e.m11954d1(aVar2.f52789b);
                        i12 -= aVar2.f52790c;
                        aVar2 = aVar;
                    } else {
                        i12 = i13;
                    }
                }
            }
            while (i12 > 0) {
                C10576r.a[] aVarArr2 = aVar2.f52788a;
                C5207g.m11108c(aVarArr2);
                C10576r.a aVar3 = aVarArr2[(i11 << (8 - i12)) & 255];
                C5207g.m11108c(aVar3);
                if (aVar3.f52788a != null) {
                    break;
                }
                int i14 = aVar3.f52790c;
                if (i14 <= i12) {
                    c5608e.m11954d1(aVar3.f52789b);
                    i12 -= i14;
                    aVar2 = aVar;
                }
                return c5608e.m11976y0();
            }
            return c5608e.m11976y0();
        }

        /* JADX INFO: renamed from: e */
        public final int m19533e(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte b10 = this.f52643d.readByte();
                byte[] bArr = C9347b.f48082a;
                int i14 = b10 & 255;
                if ((i14 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: zo.b$b */
    public static final class b {

        /* JADX INFO: renamed from: b */
        public final C5608e f52649b;

        /* JADX INFO: renamed from: d */
        public boolean f52651d;

        /* JADX INFO: renamed from: h */
        public int f52655h;

        /* JADX INFO: renamed from: i */
        public int f52656i;

        /* JADX INFO: renamed from: a */
        public final boolean f52648a = true;

        /* JADX INFO: renamed from: c */
        public int f52650c = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: e */
        public int f52652e = 4096;

        /* JADX INFO: renamed from: f */
        public C10559a[] f52653f = new C10559a[8];

        /* JADX INFO: renamed from: g */
        public int f52654g = 7;

        public b(C5608e c5608e) {
            this.f52649b = c5608e;
        }

        /* JADX INFO: renamed from: a */
        public final void m19534a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f52653f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f52654g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C10559a c10559a = this.f52653f[length];
                    C5207g.m11108c(c10559a);
                    i10 -= c10559a.f52637c;
                    int i13 = this.f52656i;
                    C10559a c10559a2 = this.f52653f[length];
                    C5207g.m11108c(c10559a2);
                    this.f52656i = i13 - c10559a2.f52637c;
                    this.f52655h--;
                    i12++;
                    length--;
                }
                C10559a[] c10559aArr = this.f52653f;
                int i14 = i11 + 1;
                System.arraycopy(c10559aArr, i14, c10559aArr, i14 + i12, this.f52655h);
                C10559a[] c10559aArr2 = this.f52653f;
                int i15 = this.f52654g + 1;
                Arrays.fill(c10559aArr2, i15, i15 + i12, (Object) null);
                this.f52654g += i12;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m19535b(C10559a c10559a) {
            int i10 = this.f52652e;
            int i11 = c10559a.f52637c;
            if (i11 > i10) {
                C9322j.m17679g0(this.f52653f, null);
                this.f52654g = this.f52653f.length - 1;
                this.f52655h = 0;
                this.f52656i = 0;
                return;
            }
            m19534a((this.f52656i + i11) - i10);
            int i12 = this.f52655h + 1;
            C10559a[] c10559aArr = this.f52653f;
            if (i12 > c10559aArr.length) {
                C10559a[] c10559aArr2 = new C10559a[c10559aArr.length * 2];
                System.arraycopy(c10559aArr, 0, c10559aArr2, c10559aArr.length, c10559aArr.length);
                this.f52654g = this.f52653f.length - 1;
                this.f52653f = c10559aArr2;
            }
            int i13 = this.f52654g;
            this.f52654g = i13 - 1;
            this.f52653f[i13] = c10559a;
            this.f52655h++;
            this.f52656i += i11;
        }

        /* JADX INFO: renamed from: c */
        public final void m19536c(ByteString byteString) throws IOException {
            C5207g.m11111f(byteString, "data");
            boolean z10 = this.f52648a;
            C5608e c5608e = this.f52649b;
            int i10 = 0;
            if (z10) {
                int[] iArr = C10576r.f52785a;
                int iMo15992q = byteString.mo15992q();
                int i11 = 0;
                long j10 = 0;
                while (i11 < iMo15992q) {
                    int i12 = i11 + 1;
                    byte bMo15995w = byteString.mo15995w(i11);
                    byte[] bArr = C9347b.f48082a;
                    j10 += (long) C10576r.f52786b[bMo15995w & 255];
                    i11 = i12;
                }
                if (((int) ((j10 + ((long) 7)) >> 3)) < byteString.mo15992q()) {
                    C5608e c5608e2 = new C5608e();
                    int[] iArr2 = C10576r.f52785a;
                    int iMo15992q2 = byteString.mo15992q();
                    long j11 = 0;
                    int i13 = 0;
                    while (i10 < iMo15992q2) {
                        int i14 = i10 + 1;
                        byte bMo15995w2 = byteString.mo15995w(i10);
                        byte[] bArr2 = C9347b.f48082a;
                        int i15 = bMo15995w2 & 255;
                        int i16 = C10576r.f52785a[i15];
                        byte b10 = C10576r.f52786b[i15];
                        j11 = (j11 << b10) | ((long) i16);
                        i13 += b10;
                        while (i13 >= 8) {
                            i13 -= 8;
                            c5608e2.m11954d1((int) (j11 >> i13));
                        }
                        i10 = i14;
                    }
                    if (i13 > 0) {
                        c5608e2.m11954d1((int) ((255 >>> i13) | (j11 << (8 - i13))));
                    }
                    ByteString byteStringM11976y0 = c5608e2.m11976y0();
                    m19538e(byteStringM11976y0.mo15992q(), 127, BuildConfig.SDK_TRUNCATE_LENGTH);
                    c5608e.m11949X0(byteStringM11976y0);
                    return;
                }
            }
            m19538e(byteString.mo15992q(), 127, 0);
            c5608e.m11949X0(byteString);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0085  */
        /* JADX WARN: Code duplicated, block: B:29:0x008b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[EDGE_INSN: B:39:0x00d8->B:40:0x00d9 BREAK  A[LOOP:1: B:30:0x0094->B:38:0x00d5], PHI: r5
          0x00d8: PHI (r5v5 int) = (r5v4 int), (r5v8 int) binds: [B:28:0x0089, B:59:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:50:0x012a  */
        /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x00d5 A[SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        public final void m19537d(ArrayList arrayList) throws IOException {
            int length;
            int length2;
            ByteString byteString;
            int i10;
            int length3;
            C10559a c10559a;
            C10559a c10559a2;
            if (this.f52651d) {
                int i11 = this.f52650c;
                if (i11 < this.f52652e) {
                    m19538e(i11, 31, 32);
                }
                this.f52651d = false;
                this.f52650c = Integer.MAX_VALUE;
                m19538e(this.f52652e, 31, 32);
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                C10559a c10559a3 = (C10559a) arrayList.get(i12);
                ByteString byteStringMo15998z = c10559a3.f52635a.mo15998z();
                Integer num = C10560b.f52639b.get(byteStringMo15998z);
                ByteString byteString2 = c10559a3.f52636b;
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && length < 8) {
                        C10559a[] c10559aArr = C10560b.f52638a;
                        if (!C5207g.m11106a(c10559aArr[length - 1].f52636b, byteString2)) {
                            if (C5207g.m11106a(c10559aArr[length].f52636b, byteString2)) {
                                length2 = length + 1;
                            } else {
                                length2 = -1;
                            }
                        }
                    } else {
                        length2 = -1;
                    }
                    if (length2 == -1) {
                        break;
                        break;
                    }
                    i10 = this.f52654g + 1;
                    length3 = this.f52653f.length;
                    while (true) {
                        if (i10 < length3) {
                            break;
                        }
                        int i14 = i10 + 1;
                        c10559a = this.f52653f[i10];
                        C5207g.m11108c(c10559a);
                        if (C5207g.m11106a(c10559a.f52635a, byteStringMo15998z)) {
                            c10559a2 = this.f52653f[i10];
                            C5207g.m11108c(c10559a2);
                            if (C5207g.m11106a(c10559a2.f52636b, byteString2)) {
                                length2 = C10560b.f52638a.length + (i10 - this.f52654g);
                                break;
                            } else if (length == -1) {
                                length = C10560b.f52638a.length + (i10 - this.f52654g);
                            }
                        }
                        i10 = i14;
                    }
                    if (length2 != -1) {
                        m19538e(length2, 127, BuildConfig.SDK_TRUNCATE_LENGTH);
                    } else if (length == -1) {
                        this.f52649b.m11954d1(64);
                        m19536c(byteStringMo15998z);
                        m19536c(byteString2);
                        m19535b(c10559a3);
                    } else {
                        byteString = C10559a.f52629d;
                        byteStringMo15998z.getClass();
                        C5207g.m11111f(byteString, "prefix");
                        if (byteStringMo15998z.mo15997y(byteString, byteString.mo15992q()) || C5207g.m11106a(C10559a.f52634i, byteStringMo15998z)) {
                            m19538e(length, 63, 64);
                            m19536c(byteString2);
                            m19535b(c10559a3);
                        } else {
                            m19538e(length, 15, 0);
                            m19536c(byteString2);
                        }
                    }
                    i12 = i13;
                } else {
                    length = -1;
                }
                length2 = length;
                if (length2 == -1) {
                    break;
                    break;
                }
                i10 = this.f52654g + 1;
                length3 = this.f52653f.length;
                while (true) {
                    if (i10 < length3) {
                        break;
                        break;
                    }
                    int i15 = i10 + 1;
                    c10559a = this.f52653f[i10];
                    C5207g.m11108c(c10559a);
                    if (C5207g.m11106a(c10559a.f52635a, byteStringMo15998z)) {
                        c10559a2 = this.f52653f[i10];
                        C5207g.m11108c(c10559a2);
                        if (C5207g.m11106a(c10559a2.f52636b, byteString2)) {
                            length2 = C10560b.f52638a.length + (i10 - this.f52654g);
                            break;
                        } else if (length == -1) {
                            length = C10560b.f52638a.length + (i10 - this.f52654g);
                        }
                    }
                    i10 = i15;
                }
                if (length2 != -1) {
                    m19538e(length2, 127, BuildConfig.SDK_TRUNCATE_LENGTH);
                } else if (length == -1) {
                    this.f52649b.m11954d1(64);
                    m19536c(byteStringMo15998z);
                    m19536c(byteString2);
                    m19535b(c10559a3);
                } else {
                    byteString = C10559a.f52629d;
                    byteStringMo15998z.getClass();
                    C5207g.m11111f(byteString, "prefix");
                    if (byteStringMo15998z.mo15997y(byteString, byteString.mo15992q())) {
                        m19538e(length, 63, 64);
                        m19536c(byteString2);
                        m19535b(c10559a3);
                    } else {
                        m19538e(length, 63, 64);
                        m19536c(byteString2);
                        m19535b(c10559a3);
                    }
                }
                i12 = i13;
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m19538e(int i10, int i11, int i12) {
            C5608e c5608e = this.f52649b;
            if (i10 < i11) {
                c5608e.m11954d1(i10 | i12);
                return;
            }
            c5608e.m11954d1(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                c5608e.m11954d1(128 | (i13 & 127));
                i13 >>>= 7;
            }
            c5608e.m11954d1(i13);
        }
    }

    static {
        C10559a c10559a = new C10559a(C10559a.f52634i, "");
        int i10 = 0;
        ByteString byteString = C10559a.f52631f;
        ByteString byteString2 = C10559a.f52632g;
        ByteString byteString3 = C10559a.f52633h;
        ByteString byteString4 = C10559a.f52630e;
        C10559a[] c10559aArr = {c10559a, new C10559a(byteString, "GET"), new C10559a(byteString, "POST"), new C10559a(byteString2, "/"), new C10559a(byteString2, "/index.html"), new C10559a(byteString3, "http"), new C10559a(byteString3, "https"), new C10559a(byteString4, "200"), new C10559a(byteString4, "204"), new C10559a(byteString4, "206"), new C10559a(byteString4, "304"), new C10559a(byteString4, "400"), new C10559a(byteString4, "404"), new C10559a(byteString4, "500"), new C10559a("accept-charset", ""), new C10559a("accept-encoding", "gzip, deflate"), new C10559a("accept-language", ""), new C10559a("accept-ranges", ""), new C10559a("accept", ""), new C10559a("access-control-allow-origin", ""), new C10559a("age", ""), new C10559a("allow", ""), new C10559a("authorization", ""), new C10559a("cache-control", ""), new C10559a("content-disposition", ""), new C10559a("content-encoding", ""), new C10559a("content-language", ""), new C10559a("content-length", ""), new C10559a("content-location", ""), new C10559a("content-range", ""), new C10559a("content-type", ""), new C10559a("cookie", ""), new C10559a("date", ""), new C10559a("etag", ""), new C10559a("expect", ""), new C10559a("expires", ""), new C10559a("from", ""), new C10559a("host", ""), new C10559a("if-match", ""), new C10559a("if-modified-since", ""), new C10559a("if-none-match", ""), new C10559a("if-range", ""), new C10559a("if-unmodified-since", ""), new C10559a("last-modified", ""), new C10559a("link", ""), new C10559a("location", ""), new C10559a("max-forwards", ""), new C10559a("proxy-authenticate", ""), new C10559a("proxy-authorization", ""), new C10559a("range", ""), new C10559a("referer", ""), new C10559a("refresh", ""), new C10559a("retry-after", ""), new C10559a("server", ""), new C10559a("set-cookie", ""), new C10559a("strict-transport-security", ""), new C10559a("transfer-encoding", ""), new C10559a("user-agent", ""), new C10559a("vary", ""), new C10559a("via", ""), new C10559a("www-authenticate", "")};
        f52638a = c10559aArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i10 < 61) {
            int i11 = i10 + 1;
            if (!linkedHashMap.containsKey(c10559aArr[i10].f52635a)) {
                linkedHashMap.put(c10559aArr[i10].f52635a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C5207g.m11110e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f52639b = mapUnmodifiableMap;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m19528a(ByteString byteString) throws IOException {
        C5207g.m11111f(byteString, "name");
        int iMo15992q = byteString.mo15992q();
        int i10 = 0;
        while (i10 < iMo15992q) {
            int i11 = i10 + 1;
            byte bMo15995w = byteString.mo15995w(i10);
            if (65 <= bMo15995w && bMo15995w <= 90) {
                throw new IOException(C5207g.m11116k(byteString.m15988A(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i10 = i11;
        }
    }
}
