package p000;

import java.io.EOFException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2909d {

    /* JADX INFO: renamed from: a */
    public static final ByteString f34749a;

    /* JADX INFO: renamed from: b */
    public static final ByteString f34750b;

    /* JADX INFO: renamed from: c */
    public static final ByteString f34751c;

    /* JADX INFO: renamed from: d */
    public static final ByteString f34752d;

    /* JADX INFO: renamed from: e */
    public static final ByteString f34753e;

    static {
        ByteString byteString = ByteString.f54513d;
        f34749a = iy5.m14193h("/");
        f34750b = iy5.m14193h("\\");
        f34751c = iy5.m14193h("/\\");
        f34752d = iy5.m14193h(".");
        f34753e = iy5.m14193h("..");
    }

    /* JADX INFO: renamed from: a */
    public static final int m9949a(d57 d57Var) {
        ByteString byteString = d57Var.f35014a;
        if (byteString.mo18078d() != 0) {
            if (byteString.mo18082i(0) != 47) {
                if (byteString.mo18082i(0) == 92) {
                    if (byteString.mo18078d() > 2 && byteString.mo18082i(1) == 92) {
                        ByteString byteString2 = f34750b;
                        byteString2.getClass();
                        int iMo18080f = byteString.mo18080f(2, byteString2.mo18081h());
                        return iMo18080f == -1 ? byteString.mo18078d() : iMo18080f;
                    }
                } else if (byteString.mo18078d() > 2 && byteString.mo18082i(1) == 58 && byteString.mo18082i(2) == 92) {
                    char cMo18082i = (char) byteString.mo18082i(0);
                    if ('a' <= cMo18082i && cMo18082i < '{') {
                        return 3;
                    }
                    if ('A' <= cMo18082i && cMo18082i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final d57 m9950b(d57 d57Var, d57 d57Var2, boolean z) {
        d57Var2.getClass();
        if (m9949a(d57Var2) != -1 || d57Var2.m10108f() != null) {
            return d57Var2;
        }
        ByteString byteStringM9951c = m9951c(d57Var);
        if (byteStringM9951c == null && (byteStringM9951c = m9951c(d57Var2)) == null) {
            byteStringM9951c = m9954f(d57.f35013b);
        }
        aj0 aj0Var = new aj0();
        aj0Var.m486j0(d57Var.f35014a);
        if (aj0Var.f723b > 0) {
            aj0Var.m486j0(byteStringM9951c);
        }
        aj0Var.m486j0(d57Var2.f35014a);
        return m9952d(aj0Var, z);
    }

    /* JADX INFO: renamed from: c */
    public static final ByteString m9951c(d57 d57Var) {
        ByteString byteString = d57Var.f35014a;
        ByteString byteString2 = f34749a;
        if (ByteString.m18072g(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = d57Var.f35014a;
        ByteString byteString4 = f34750b;
        if (ByteString.m18072g(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e A[EDGE_INSN: B:98:0x011e->B:81:0x011e BREAK  A[LOOP:1: B:53:0x00b9->B:112:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x010c A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final d57 m9952d(aj0 aj0Var, boolean z) throws EOFException {
        ByteString byteString;
        long j;
        char cM494q;
        boolean z2;
        ArrayList arrayList;
        boolean zM492p;
        ByteString byteString2;
        int size;
        int i;
        long jM500x;
        ByteString byteStringMo497s;
        ByteString byteString3;
        aj0 aj0Var2 = new aj0();
        ByteString byteStringM9953e = null;
        int i2 = 0;
        while (true) {
            ByteString byteString4 = f34749a;
            byteString4.getClass();
            if (!aj0Var.m455A(0L, byteString4, byteString4.mo18078d())) {
                byteString = f34750b;
                byteString.getClass();
                if (!aj0Var.m455A(0L, byteString, byteString.mo18078d())) {
                    break;
                }
            }
            byte b = aj0Var.readByte();
            if (byteStringM9953e == null) {
                byteStringM9953e = m9953e(b);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && fa4.m11650l(byteStringM9953e, byteString);
        ByteString byteString5 = f34751c;
        if (z3) {
            byteStringM9953e.getClass();
            aj0Var2.m486j0(byteStringM9953e);
            aj0Var2.m486j0(byteStringM9953e);
        } else {
            if (i2 <= 0) {
                long jM500x2 = aj0Var.m500x(byteString5);
                if (byteStringM9953e == null) {
                    byteStringM9953e = jM500x2 == -1 ? m9954f(d57.f35013b) : m9953e(aj0Var.m494q(jM500x2));
                }
                if (fa4.m11650l(byteStringM9953e, byteString) && aj0Var.f723b >= 2) {
                    j = -1;
                    if (aj0Var.m494q(1L) == 58 && (('a' <= (cM494q = (char) aj0Var.m494q(0L)) && cM494q < '{') || ('A' <= cM494q && cM494q < '['))) {
                        if (jM500x2 == 2) {
                            aj0Var2.mo471X(aj0Var, 3L);
                        } else {
                            aj0Var2.mo471X(aj0Var, 2L);
                        }
                    }
                }
                if (aj0Var2.f723b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zM492p = aj0Var.m492p();
                    byteString2 = f34752d;
                    if (!zM492p) {
                        break;
                    }
                    jM500x = aj0Var.m500x(byteString5);
                    if (jM500x == j) {
                        byteStringMo497s = aj0Var.mo497s(aj0Var.f723b);
                    } else {
                        byteStringMo497s = aj0Var.mo497s(jM500x);
                        aj0Var.readByte();
                    }
                    byteString3 = f34753e;
                    if (fa4.m11650l(byteStringMo497s, byteString3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || fa4.m11650l(u91.m22597O0(arrayList), byteString3)))) {
                                arrayList.add(byteStringMo497s);
                            } else if (!z3 || arrayList.size() != 1) {
                                u91.m22609a1(arrayList);
                            }
                        }
                    } else if (fa4.m11650l(byteStringMo497s, byteString2) && !fa4.m11650l(byteStringMo497s, ByteString.f54513d)) {
                        arrayList.add(byteStringMo497s);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        aj0Var2.m486j0(byteStringM9953e);
                    }
                    aj0Var2.m486j0((ByteString) arrayList.get(i));
                }
                if (aj0Var2.f723b == 0) {
                    aj0Var2.m486j0(byteString2);
                }
                return new d57(aj0Var2.mo497s(aj0Var2.f723b));
            }
            byteStringM9953e.getClass();
            aj0Var2.m486j0(byteStringM9953e);
        }
        j = -1;
        if (aj0Var2.f723b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zM492p = aj0Var.m492p();
            byteString2 = f34752d;
            if (!zM492p) {
                break;
                break;
            }
            jM500x = aj0Var.m500x(byteString5);
            if (jM500x == j) {
                byteStringMo497s = aj0Var.mo497s(aj0Var.f723b);
            } else {
                byteStringMo497s = aj0Var.mo497s(jM500x);
                aj0Var.readByte();
            }
            byteString3 = f34753e;
            if (fa4.m11650l(byteStringMo497s, byteString3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(byteStringMo497s);
            } else if (fa4.m11650l(byteStringMo497s, byteString2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                aj0Var2.m486j0(byteStringM9953e);
            }
            aj0Var2.m486j0((ByteString) arrayList.get(i));
        }
        if (aj0Var2.f723b == 0) {
            aj0Var2.m486j0(byteString2);
        }
        return new d57(aj0Var2.mo497s(aj0Var2.f723b));
    }

    /* JADX INFO: renamed from: e */
    public static final ByteString m9953e(byte b) {
        if (b == 47) {
            return f34749a;
        }
        if (b == 92) {
            return f34750b;
        }
        C3386nv.m17626m(ux5.m22988k(b, "not a directory separator: "));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final ByteString m9954f(String str) {
        if (fa4.m11650l(str, "/")) {
            return f34749a;
        }
        if (fa4.m11650l(str, "\\")) {
            return f34750b;
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("not a directory separator: ", str));
        return null;
    }
}
