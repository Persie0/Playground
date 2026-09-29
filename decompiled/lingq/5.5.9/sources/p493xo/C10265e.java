package p493xo;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;
import so.C9090h;
import so.C9095m;
import so.C9096n;
import so.C9106x;
import so.InterfaceC9091i;
import to.C9347b;

/* JADX INFO: renamed from: xo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10265e {
    static {
        ByteString byteString = ByteString.f43897d;
        ByteString.C8082a.m16001c("\"\\");
        ByteString.C8082a.m16001c("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m19231a(C9106x c9106x) {
        if (C5207g.m11106a(c9106x.f47563a.f47543b, "HEAD")) {
            return false;
        }
        int i10 = c9106x.f47566d;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && C9347b.m17704k(c9106x) == -1 && !C7661i.m15249O2("chunked", C9106x.m17348b(c9106x, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX INFO: renamed from: b */
    public static final void m19232b(InterfaceC9091i interfaceC9091i, C9096n c9096n, C9095m c9095m) {
        List<C9090h> listUnmodifiableList;
        List<String> list;
        String str;
        String str2;
        C9090h c9090h;
        List<String> list2;
        C5207g.m11111f(interfaceC9091i, "<this>");
        C5207g.m11111f(c9096n, "url");
        C5207g.m11111f(c9095m, "headers");
        if (interfaceC9091i == InterfaceC9091i.f47443a) {
            return;
        }
        Pattern pattern = C9090h.f47430j;
        List<String> listM17310m = c9095m.m17310m("Set-Cookie");
        int size = listM17310m.size();
        int i10 = 0;
        int i11 = 0;
        ArrayList arrayList = null;
        while (i11 < size) {
            int i12 = i11 + 1;
            String str3 = listM17310m.get(i11);
            C5207g.m11111f(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = C9347b.f48082a;
            char c10 = ';';
            int iM17699f = C9347b.m17699f(str3, ';', i10, str3.length());
            char c11 = '=';
            int iM17699f2 = C9347b.m17699f(str3, '=', i10, iM17699f);
            if (iM17699f2 != iM17699f) {
                String strM17719z = C9347b.m17719z(str3, i10, iM17699f2);
                boolean z10 = true;
                if ((strM17719z.length() == 0 ? 1 : i10) != 0 || C9347b.m17706m(strM17719z) != -1) {
                    list = listM17310m;
                    c9090h = null;
                    break;
                }
                String strM17719z2 = C9347b.m17719z(str3, iM17699f2 + 1, iM17699f);
                if (C9347b.m17706m(strM17719z2) != -1) {
                    list = listM17310m;
                } else {
                    int i13 = iM17699f + 1;
                    int length = str3.length();
                    long j10 = 253402300799999L;
                    int i14 = i10;
                    boolean z11 = i14 == true ? 1 : 0;
                    boolean z12 = z11 ? 1 : 0;
                    boolean z13 = true;
                    long jM17303b = 253402300799999L;
                    long j11 = -1;
                    String str4 = null;
                    String str5 = null;
                    boolean z14 = i14;
                    while (true) {
                        if (i13 < length) {
                            int iM17699f3 = C9347b.m17699f(str3, c10, i13, length);
                            int iM17699f4 = C9347b.m17699f(str3, c11, i13, iM17699f3);
                            String strM17719z3 = C9347b.m17719z(str3, i13, iM17699f4);
                            String strM17719z4 = iM17699f4 < iM17699f3 ? C9347b.m17719z(str3, iM17699f4 + 1, iM17699f3) : "";
                            if (C7661i.m15249O2(strM17719z3, "expires")) {
                                try {
                                    list2 = listM17310m;
                                    jM17303b = C9090h.a.m17303b(strM17719z4, strM17719z4.length());
                                    z12 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                    list2 = listM17310m;
                                }
                            } else if (C7661i.m15249O2(strM17719z3, "max-age")) {
                                try {
                                    long j12 = Long.parseLong(strM17719z4);
                                    list2 = listM17310m;
                                    j11 = j12 > 0 ? j12 : Long.MIN_VALUE;
                                } catch (NumberFormatException e10) {
                                    list2 = listM17310m;
                                    try {
                                        if (!new Regex("-?\\d+").m14271b(strM17719z4)) {
                                            throw e10;
                                        }
                                        j11 = C7661i.m15256V2(strM17719z4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        continue;
                                    }
                                }
                                z12 = true;
                            } else {
                                list2 = listM17310m;
                                if (C7661i.m15249O2(strM17719z3, "domain")) {
                                    if (!(!C7661i.m15248N2(strM17719z4, "."))) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    String strM375n2 = C0062b.m375n2(C7076b.m14292l3(".", strM17719z4));
                                    if (strM375n2 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = strM375n2;
                                    z13 = false;
                                } else if (C7661i.m15249O2(strM17719z3, "path")) {
                                    str5 = strM17719z4;
                                } else if (C7661i.m15249O2(strM17719z3, "secure")) {
                                    z14 = 1;
                                } else if (C7661i.m15249O2(strM17719z3, "httponly")) {
                                    z11 = true;
                                }
                            }
                            i13 = iM17699f3 + 1;
                            listM17310m = list2;
                            c10 = ';';
                            c11 = '=';
                            z14 = z14;
                        } else {
                            list = listM17310m;
                            if (j11 == Long.MIN_VALUE) {
                                j10 = Long.MIN_VALUE;
                            } else if (j11 != -1) {
                                long j13 = jCurrentTimeMillis + (j11 <= 9223372036854775L ? j11 * ((long) 1000) : Long.MAX_VALUE);
                                if (j13 >= jCurrentTimeMillis && j13 <= 253402300799999L) {
                                    j10 = j13;
                                }
                            } else {
                                j10 = jM17303b;
                            }
                            String str6 = c9096n.f47458d;
                            if (str4 == null) {
                                str = str6;
                            } else {
                                if (!C5207g.m11106a(str6, str4) && (!C7661i.m15248N2(str6, str4) || str6.charAt((str6.length() - str4.length()) - 1) != '.' || C9347b.f48087f.m14271b(str6))) {
                                    z10 = false;
                                }
                                if (z10) {
                                    str = str4;
                                }
                                i10 = 0;
                            }
                            if (str6.length() == str.length() || PublicSuffixDatabase.f43888g.m15982a(str) != null) {
                                String strSubstring = "/";
                                String str7 = str5;
                                i10 = 0;
                                if (str7 == null || !C7661i.m15256V2(str7, "/", false)) {
                                    String strM17321b = c9096n.m17321b();
                                    int iM14287g3 = C7076b.m14287g3(strM17321b, '/', 0, 6);
                                    if (iM14287g3 != 0) {
                                        strSubstring = strM17321b.substring(0, iM14287g3);
                                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    str2 = strSubstring;
                                } else {
                                    str2 = str7;
                                }
                                c9090h = new C9090h(strM17719z, strM17719z2, j10, str, str2, z14, z11, z12, z13);
                                break;
                            }
                            i10 = 0;
                        }
                    }
                }
                c9090h = null;
                break;
            } else {
                list = listM17310m;
                c9090h = null;
                break;
            }
            if (c9090h != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c9090h);
            }
            i11 = i12;
            listM17310m = list;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            C5207g.m11110e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = EmptyList.f38032a;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        interfaceC9091i.mo16922d(c9096n, listUnmodifiableList);
    }
}
