package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: z */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1165z implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final int[] f48317e;

    /* JADX INFO: renamed from: h */
    private static final int f48318h;

    /* JADX INFO: renamed from: a */
    public String f48319a;

    /* JADX INFO: renamed from: b */
    public ArrayList f48320b;

    /* JADX INFO: renamed from: c */
    public ArrayList f48321c;

    /* JADX INFO: renamed from: d */
    public boolean f48322d;

    /* JADX INFO: renamed from: f */
    public final int f48323f;

    /* JADX INFO: renamed from: g */
    private boolean f48324g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    static {
        int i = 1;
        switch (C0054b.m2150a()) {
            case "DOUBLE_OPTIONAL":
                break;
            case "DOUBLE_REQUIRED":
                i = 2;
                break;
            default:
                throw new IllegalArgumentException();
        }
        f48318h = i;
        f48317e = new int[]{1, 2, 3, 4, 5, 6};
    }

    public C1165z() {
        this.f48320b = new ArrayList();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    private final int m19741j(int i) {
        char cCharAt;
        while (i < this.f48319a.length() && (((cCharAt = this.f48319a.charAt(i)) >= '0' || "+-.".indexOf(cCharAt) >= 0) && (cCharAt <= '9' || cCharAt == 'e' || cCharAt == 'E' || cCharAt == 8734))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    private final int m19742k(int i) {
        String str = this.f48319a;
        byte[] bArr = C0148e.f13030a;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255) {
                if (cCharAt >= 8206) {
                    if (cCharAt > 12336) {
                        if (cCharAt >= 64830 && cCharAt <= 65094 && (cCharAt <= 64831 || cCharAt >= 65093)) {
                            break;
                        }
                    } else if (((C0148e.f13032c[C0148e.f13031b[(cCharAt - 8192) >> 5]] >> (cCharAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (C0148e.f13030a[cCharAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    private final int m19743l(int i) {
        String str = this.f48319a;
        byte[] bArr = C0148e.f13030a;
        while (i < str.length() && C0148e.m6978a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    private final String m19744m() {
        return m19746o(this.f48319a, 0);
    }

    /* JADX INFO: renamed from: n */
    private final String m19745n(int i) {
        return m19746o(this.f48319a, i);
    }

    /* JADX INFO: renamed from: o */
    private static String m19746o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    private final void m19747p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.f48321c;
        if (arrayList == null) {
            this.f48321c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.f48321c.add(Double.valueOf(d));
        m19753v(14, i, i2, size);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[LOOP:0: B:24:0x0058->B:38:0x0079, LOOP_START, PHI: r0 r1 r3
      0x0058: PHI (r0v7 char) = (r0v6 char), (r0v11 char) binds: [B:13:0x002f, B:38:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:13:0x002f, B:38:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:13:0x002f, B:38:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:25:0x005a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: q */
    private final void m19748q(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f48319a
            char r0 = r0.charAt(r7)
            int r1 = r7 + 1
            r2 = 45
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L1b
            if (r1 == r8) goto L41
            java.lang.String r0 = r6.f48319a
            int r2 = r1 + 1
            char r0 = r0.charAt(r1)
            r1 = r2
            r2 = 1
            goto L2d
        L1b:
            r2 = 43
            if (r0 != r2) goto L2b
            if (r1 == r8) goto L41
            java.lang.String r0 = r6.f48319a
            int r2 = r1 + 1
            char r0 = r0.charAt(r1)
            r1 = r2
            goto L2c
        L2b:
        L2c:
            r2 = 0
        L2d:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r0 != r5) goto L57
            if (r9 == 0) goto L41
            if (r1 != r8) goto L41
            if (r4 == r2) goto L3a
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L3c
        L3a:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L3c:
            int r8 = r8 - r7
            r6.m19747p(r0, r7, r8)
            return
        L41:
            java.lang.NumberFormatException r9 = new java.lang.NumberFormatException
            java.lang.String r0 = r6.f48319a
            java.lang.String r7 = r0.substring(r7, r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Bad syntax for numeric value: "
            java.lang.String r7 = r8.concat(r7)
            r9.<init>(r7)
            throw r9
        L57:
        L58:
            r9 = 48
            if (r0 < r9) goto L84
            r9 = 57
            if (r0 > r9) goto L84
            int r3 = r3 * 10
            int r0 = r0 + (-48)
            int r9 = r2 + 32767
            int r3 = r3 + r0
            if (r3 <= r9) goto L6a
            goto L84
        L6a:
            if (r1 != r8) goto L79
            int r8 = r8 - r7
            if (r2 == 0) goto L71
            int r3 = -r3
            goto L72
        L71:
        L72:
            r9 = 13
            r6.m19753v(r9, r7, r8, r3)
            return
        L79:
            java.lang.String r9 = r6.f48319a
            int r0 = r1 + 1
            char r9 = r9.charAt(r1)
            r1 = r0
            r0 = r9
            goto L58
        L84:
            java.lang.String r9 = r6.f48319a
            java.lang.String r9 = r9.substring(r7, r8)
            double r0 = java.lang.Double.parseDouble(r9)
            int r8 = r8 - r7
            r6.m19747p(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1165z.m19748q(int, int, boolean):void");
    }

    /* JADX INFO: renamed from: r */
    private final boolean m19749r(int i) {
        return i > 0 || ((C1138y) this.f48320b.get(0)).f48045e == 1;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m19750s(int i) {
        char cCharAt = this.f48319a.charAt(i);
        if (cCharAt != 's' && cCharAt != 'S') {
            return false;
        }
        int i2 = i + 1;
        char cCharAt2 = this.f48319a.charAt(i2);
        if (cCharAt2 != 'e' && cCharAt2 != 'E') {
            return false;
        }
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        char cCharAt3 = this.f48319a.charAt(i3);
        if (cCharAt3 != 'l' && cCharAt3 != 'L') {
            return false;
        }
        int i5 = i4 + 1;
        char cCharAt4 = this.f48319a.charAt(i4);
        if (cCharAt4 != 'e' && cCharAt4 != 'E') {
            return false;
        }
        int i6 = i5 + 1;
        char cCharAt5 = this.f48319a.charAt(i5);
        if (cCharAt5 != 'c' && cCharAt5 != 'C') {
            return false;
        }
        char cCharAt6 = this.f48319a.charAt(i6);
        return cCharAt6 == 't' || cCharAt6 == 'T';
    }

    /* JADX WARN: Code duplicated, block: B:140:0x022c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0236  */
    /* JADX WARN: Code duplicated, block: B:144:0x023a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0244  */
    /* JADX WARN: Code duplicated, block: B:148:0x0248  */
    /* JADX WARN: Code duplicated, block: B:150:0x0254  */
    /* JADX WARN: Code duplicated, block: B:152:0x0258  */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:156:0x0268  */
    /* JADX WARN: Code duplicated, block: B:158:0x0274  */
    /* JADX WARN: Code duplicated, block: B:160:0x0278  */
    /* JADX WARN: Code duplicated, block: B:165:0x0285  */
    /* JADX WARN: Code duplicated, block: B:167:0x028b  */
    /* JADX WARN: Code duplicated, block: B:168:0x028e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0311  */
    /* JADX INFO: renamed from: t */
    private final int m19751t(int i, int i2, int i3, int i4) {
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM19743l;
        int i11;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        char cCharAt4;
        int iM19743l2;
        boolean z;
        int iM19742k;
        int iM19751t;
        char cCharAt5;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        char cCharAt9;
        char cCharAt10;
        char cCharAt11;
        char cCharAt12;
        int i17 = i4;
        if (i3 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f48320b.size();
        boolean z2 = true;
        m19753v(1, i, i2, i3);
        int i18 = i + i2;
        while (true) {
            if (i18 >= this.f48319a.length()) {
                if (i3 > 0 && (i3 != 1 || i17 != 3 || ((C1138y) this.f48320b.get(0)).f48045e == 1)) {
                    throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m19744m()));
                }
                m19752u(size, 2, i18, 0, i3);
                return i18;
            }
            i5 = i18 + 1;
            cCharAt = this.f48319a.charAt(i18);
            if (cCharAt == '\'') {
                if (i5 != this.f48319a.length()) {
                    char cCharAt13 = this.f48319a.charAt(i5);
                    if (cCharAt13 != '\'') {
                        if (this.f48323f != 2 && cCharAt13 != '{' && cCharAt13 != '}') {
                            if (i17 != 3) {
                                i6 = i17;
                            } else if (cCharAt13 != '|') {
                                i6 = 3;
                            }
                            if (!C0121d.m5780b(i6) || cCharAt13 != '#') {
                                m19753v(4, i5, 0, 39);
                            }
                        }
                        m19753v(3, i5 - 1, z2 ? 1 : 0, 0);
                        while (true) {
                            int iIndexOf = this.f48319a.indexOf(39, i5 + (z2 ? 1 : 0));
                            if (iIndexOf < 0) {
                                int length = this.f48319a.length();
                                m19753v(4, length, 0, 39);
                                i18 = length;
                                break;
                            }
                            i5 = iIndexOf + 1;
                            if (i5 >= this.f48319a.length() || this.f48319a.charAt(i5) != '\'') {
                                m19753v(3, iIndexOf, z2 ? 1 : 0, 0);
                                i18 = i5;
                                break;
                            }
                            m19753v(3, i5, z2 ? 1 : 0, 0);
                        }
                    } else {
                        i18 = i5 + 1;
                        m19753v(3, i5, z2 ? 1 : 0, 0);
                    }
                } else {
                    m19753v(4, i5, 0, 39);
                }
                i18 = i5;
                z2 = true;
            } else {
                if (!C0121d.m5780b(i4) || cCharAt != '#') {
                    if (cCharAt != '{') {
                        if (i3 > 0 && cCharAt == '}') {
                            cCharAt = '}';
                            i7 = 3;
                            break;
                        }
                        i7 = 3;
                        if (i17 == 3 && cCharAt == '|') {
                            i17 = 3;
                            break;
                        }
                    } else {
                        int i19 = i5 - 1;
                        int size2 = this.f48320b.size();
                        m19753v(6, i19, z2 ? 1 : 0, 0);
                        int iM19743l3 = m19743l(i19 + (z2 ? 1 : 0));
                        if (iM19743l3 == this.f48319a.length()) {
                            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m19744m()));
                        }
                        int iM19742k2 = m19742k(iM19743l3);
                        String str = this.f48319a;
                        if (iM19743l3 < iM19742k2) {
                            int i20 = iM19743l3 + 1;
                            char cCharAt14 = str.charAt(iM19743l3);
                            if (cCharAt14 == '0') {
                                if (i20 == iM19742k2) {
                                    i10 = 0;
                                } else {
                                    i9 = 1;
                                    i8 = 0;
                                }
                            } else {
                                if (cCharAt14 < '1' || cCharAt14 > '9') {
                                    i10 = -1;
                                    break;
                                }
                                i8 = cCharAt14 - '0';
                                i9 = 0;
                            }
                            while (true) {
                                if (i20 >= iM19742k2) {
                                    if (i9 == 0) {
                                        i10 = i8;
                                        break;
                                    }
                                    i10 = -2;
                                    break;
                                }
                                int i21 = i20 + 1;
                                char cCharAt15 = str.charAt(i20);
                                if (cCharAt15 < '0' || cCharAt15 > '9') {
                                    i10 = -1;
                                    break;
                                }
                                i9 |= (i8 >= 214748364 ? 0 : 1) ^ (z2 ? 1 : 0);
                                i8 = (i8 * 10) + (cCharAt15 - '0');
                                i20 = i21;
                            }
                        } else {
                            i10 = -2;
                        }
                        if (i10 >= 0) {
                            int i22 = iM19742k2 - iM19743l3;
                            if (i22 > 65535 || i10 > 32767) {
                                throw new IndexOutOfBoundsException("Argument number too large: ".concat(m19745n(iM19743l3)));
                            }
                            m19753v(8, iM19743l3, i22, i10);
                        } else {
                            if (i10 != -1) {
                                throw new IllegalArgumentException("Bad argument syntax: ".concat(m19745n(iM19743l3)));
                            }
                            int i23 = iM19742k2 - iM19743l3;
                            if (i23 > 65535) {
                                throw new IndexOutOfBoundsException("Argument name too long: ".concat(m19745n(iM19743l3)));
                            }
                            this.f48322d = z2;
                            m19753v(9, iM19743l3, i23, 0);
                        }
                        int iM19743l4 = m19743l(iM19742k2);
                        if (iM19743l4 == this.f48319a.length()) {
                            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m19744m()));
                        }
                        char cCharAt16 = this.f48319a.charAt(iM19743l4);
                        if (cCharAt16 != '}') {
                            if (cCharAt16 != ',') {
                                throw new IllegalArgumentException("Bad argument syntax: ".concat(m19745n(iM19743l3)));
                            }
                            int iM19743l5 = m19743l(iM19743l4 + 1);
                            int i24 = iM19743l5;
                            while (i24 < this.f48319a.length() && (((cCharAt12 = this.f48319a.charAt(i24)) >= 'a' && cCharAt12 <= 'z') || (cCharAt12 >= 'A' && cCharAt12 <= 'Z'))) {
                                i24++;
                            }
                            int i25 = i24 - iM19743l5;
                            iM19743l = m19743l(i24);
                            if (iM19743l == this.f48319a.length()) {
                                throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m19744m()));
                            }
                            if (i25 != 0) {
                                char cCharAt17 = this.f48319a.charAt(iM19743l);
                                if (cCharAt17 != ',') {
                                    if (cCharAt17 == '}') {
                                        cCharAt17 = '}';
                                    }
                                }
                                if (i25 > 65535) {
                                    throw new IndexOutOfBoundsException("Argument type name too long: ".concat(m19745n(iM19743l3)));
                                }
                                if (i25 == 6) {
                                    int i26 = iM19743l5 + 1;
                                    char cCharAt18 = this.f48319a.charAt(iM19743l5);
                                    if (cCharAt18 == 'c' || cCharAt18 == 'C') {
                                        int i27 = i26 + 1;
                                        char cCharAt19 = this.f48319a.charAt(i26);
                                        if (cCharAt19 == 'h' || cCharAt19 == 'H') {
                                            int i28 = i27 + 1;
                                            char cCharAt20 = this.f48319a.charAt(i27);
                                            if (cCharAt20 == 'o' || cCharAt20 == 'O') {
                                                int i29 = i28 + 1;
                                                char cCharAt21 = this.f48319a.charAt(i28);
                                                if (cCharAt21 == 'i' || cCharAt21 == 'I') {
                                                    int i30 = i29 + 1;
                                                    char cCharAt22 = this.f48319a.charAt(i29);
                                                    if ((cCharAt22 == 'c' || cCharAt22 == 'C') && ((cCharAt5 = this.f48319a.charAt(i30)) == 'e' || cCharAt5 == 'E')) {
                                                        i11 = 3;
                                                    } else {
                                                        cCharAt6 = this.f48319a.charAt(iM19743l5);
                                                        if (cCharAt6 != 'p' || cCharAt6 == 'P') {
                                                            i14 = i26 + 1;
                                                            cCharAt7 = this.f48319a.charAt(i26);
                                                            if (cCharAt7 != 'l' || cCharAt7 == 'L') {
                                                                i15 = i14 + 1;
                                                                cCharAt8 = this.f48319a.charAt(i14);
                                                                if (cCharAt8 != 'u' || cCharAt8 == 'U') {
                                                                    i16 = i15 + 1;
                                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                                    if (cCharAt9 != 'r' || cCharAt9 == 'R') {
                                                                        int i31 = i16 + 1;
                                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                                        if ((cCharAt10 == 'a' && cCharAt10 != 'A') || ((cCharAt11 = this.f48319a.charAt(i31)) != 'l' && cCharAt11 != 'L')) {
                                                                            if (m19750s(iM19743l5)) {
                                                                                i11 = 5;
                                                                            } else {
                                                                                i11 = 2;
                                                                            }
                                                                        }
                                                                    } else if (m19750s(iM19743l5)) {
                                                                        i11 = 5;
                                                                    } else {
                                                                        i11 = 2;
                                                                    }
                                                                } else if (m19750s(iM19743l5)) {
                                                                    i11 = 5;
                                                                } else {
                                                                    i11 = 2;
                                                                }
                                                            } else if (m19750s(iM19743l5)) {
                                                                i11 = 5;
                                                            } else {
                                                                i11 = 2;
                                                            }
                                                        } else if (m19750s(iM19743l5)) {
                                                            i11 = 5;
                                                        } else {
                                                            i11 = 2;
                                                        }
                                                    }
                                                } else {
                                                    cCharAt6 = this.f48319a.charAt(iM19743l5);
                                                    if (cCharAt6 != 'p') {
                                                        i14 = i26 + 1;
                                                        cCharAt7 = this.f48319a.charAt(i26);
                                                        if (cCharAt7 != 'l') {
                                                            i15 = i14 + 1;
                                                            cCharAt8 = this.f48319a.charAt(i14);
                                                            if (cCharAt8 != 'u') {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i32 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    i11 = cCharAt10 == 'a' ? 4 : 4;
                                                                } else {
                                                                    int i33 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            } else {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i34 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i35 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i15 = i14 + 1;
                                                            cCharAt8 = this.f48319a.charAt(i14);
                                                            if (cCharAt8 != 'u') {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i36 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i37 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            } else {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i38 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i39 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i26 + 1;
                                                        cCharAt7 = this.f48319a.charAt(i26);
                                                        if (cCharAt7 != 'l') {
                                                            i15 = i14 + 1;
                                                            cCharAt8 = this.f48319a.charAt(i14);
                                                            if (cCharAt8 != 'u') {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i310 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i311 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            } else {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i312 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i313 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i15 = i14 + 1;
                                                            cCharAt8 = this.f48319a.charAt(i14);
                                                            if (cCharAt8 != 'u') {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i314 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i315 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            } else {
                                                                i16 = i15 + 1;
                                                                cCharAt9 = this.f48319a.charAt(i15);
                                                                if (cCharAt9 != 'r') {
                                                                    int i316 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                } else {
                                                                    int i317 = i16 + 1;
                                                                    cCharAt10 = this.f48319a.charAt(i16);
                                                                    if (cCharAt10 == 'a') {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                cCharAt6 = this.f48319a.charAt(iM19743l5);
                                                if (cCharAt6 != 'p') {
                                                    i14 = i26 + 1;
                                                    cCharAt7 = this.f48319a.charAt(i26);
                                                    if (cCharAt7 != 'l') {
                                                        i15 = i14 + 1;
                                                        cCharAt8 = this.f48319a.charAt(i14);
                                                        if (cCharAt8 != 'u') {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i318 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i319 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i3110 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i3111 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i15 = i14 + 1;
                                                        cCharAt8 = this.f48319a.charAt(i14);
                                                        if (cCharAt8 != 'u') {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i3112 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i3113 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i3114 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i3115 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i14 = i26 + 1;
                                                    cCharAt7 = this.f48319a.charAt(i26);
                                                    if (cCharAt7 != 'l') {
                                                        i15 = i14 + 1;
                                                        cCharAt8 = this.f48319a.charAt(i14);
                                                        if (cCharAt8 != 'u') {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i3116 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i3117 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i3118 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i3119 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i15 = i14 + 1;
                                                        cCharAt8 = this.f48319a.charAt(i14);
                                                        if (cCharAt8 != 'u') {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i31110 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i31111 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i16 = i15 + 1;
                                                            cCharAt9 = this.f48319a.charAt(i15);
                                                            if (cCharAt9 != 'r') {
                                                                int i31112 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            } else {
                                                                int i31113 = i16 + 1;
                                                                cCharAt10 = this.f48319a.charAt(i16);
                                                                if (cCharAt10 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cCharAt6 = this.f48319a.charAt(iM19743l5);
                                            if (cCharAt6 != 'p') {
                                                i14 = i26 + 1;
                                                cCharAt7 = this.f48319a.charAt(i26);
                                                if (cCharAt7 != 'l') {
                                                    i15 = i14 + 1;
                                                    cCharAt8 = this.f48319a.charAt(i14);
                                                    if (cCharAt8 != 'u') {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i31114 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i31115 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i31116 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i31117 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i15 = i14 + 1;
                                                    cCharAt8 = this.f48319a.charAt(i14);
                                                    if (cCharAt8 != 'u') {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i31118 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i31119 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i311110 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i311111 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i14 = i26 + 1;
                                                cCharAt7 = this.f48319a.charAt(i26);
                                                if (cCharAt7 != 'l') {
                                                    i15 = i14 + 1;
                                                    cCharAt8 = this.f48319a.charAt(i14);
                                                    if (cCharAt8 != 'u') {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i311112 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i311113 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i311114 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i311115 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i15 = i14 + 1;
                                                    cCharAt8 = this.f48319a.charAt(i14);
                                                    if (cCharAt8 != 'u') {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i311116 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i311117 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i16 = i15 + 1;
                                                        cCharAt9 = this.f48319a.charAt(i15);
                                                        if (cCharAt9 != 'r') {
                                                            int i311118 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        } else {
                                                            int i311119 = i16 + 1;
                                                            cCharAt10 = this.f48319a.charAt(i16);
                                                            if (cCharAt10 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cCharAt6 = this.f48319a.charAt(iM19743l5);
                                        if (cCharAt6 != 'p') {
                                            i14 = i26 + 1;
                                            cCharAt7 = this.f48319a.charAt(i26);
                                            if (cCharAt7 != 'l') {
                                                i15 = i14 + 1;
                                                cCharAt8 = this.f48319a.charAt(i14);
                                                if (cCharAt8 != 'u') {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i3111110 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i3111111 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i3111112 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i3111113 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i15 = i14 + 1;
                                                cCharAt8 = this.f48319a.charAt(i14);
                                                if (cCharAt8 != 'u') {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i3111114 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i3111115 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i3111116 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i3111117 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i14 = i26 + 1;
                                            cCharAt7 = this.f48319a.charAt(i26);
                                            if (cCharAt7 != 'l') {
                                                i15 = i14 + 1;
                                                cCharAt8 = this.f48319a.charAt(i14);
                                                if (cCharAt8 != 'u') {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i3111118 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i3111119 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i31111110 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i31111111 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i15 = i14 + 1;
                                                cCharAt8 = this.f48319a.charAt(i14);
                                                if (cCharAt8 != 'u') {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i31111112 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i31111113 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i16 = i15 + 1;
                                                    cCharAt9 = this.f48319a.charAt(i15);
                                                    if (cCharAt9 != 'r') {
                                                        int i31111114 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    } else {
                                                        int i31111115 = i16 + 1;
                                                        cCharAt10 = this.f48319a.charAt(i16);
                                                        if (cCharAt10 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (i25 == 13) {
                                    if (m19750s(iM19743l5) && (((cCharAt2 = this.f48319a.charAt((i12 = iM19743l5 + 6))) == 'o' || cCharAt2 == 'O') && ((cCharAt3 = this.f48319a.charAt((i13 = i12 + 1))) == 'r' || cCharAt3 == 'R'))) {
                                        int i40 = i13 + 1;
                                        int i41 = i40 + 1;
                                        char cCharAt23 = this.f48319a.charAt(i40);
                                        if (cCharAt23 == 'd' || cCharAt23 == 'D') {
                                            int i42 = i41 + 1;
                                            char cCharAt24 = this.f48319a.charAt(i41);
                                            if (cCharAt24 == 'i' || cCharAt24 == 'I') {
                                                int i43 = i42 + 1;
                                                char cCharAt25 = this.f48319a.charAt(i42);
                                                if (cCharAt25 == 'n' || cCharAt25 == 'N') {
                                                    int i44 = i43 + 1;
                                                    char cCharAt26 = this.f48319a.charAt(i43);
                                                    if ((cCharAt26 == 'a' || cCharAt26 == 'A') && ((cCharAt4 = this.f48319a.charAt(i44)) == 'l' || cCharAt4 == 'L')) {
                                                        i11 = 6;
                                                    } else {
                                                        i11 = 2;
                                                    }
                                                } else {
                                                    i11 = 2;
                                                }
                                            } else {
                                                i11 = 2;
                                            }
                                        } else {
                                            i11 = 2;
                                        }
                                    } else {
                                        i11 = 2;
                                    }
                                    i25 = 13;
                                } else {
                                    i11 = 2;
                                }
                                ((C1138y) this.f48320b.get(size2)).f48043c = (short) (i11 - 1);
                                if (i11 == 2) {
                                    m19753v(10, iM19743l5, i25, 0);
                                }
                                if (cCharAt17 != '}') {
                                    int i45 = iM19743l + 1;
                                    if (i11 == 2) {
                                        int i46 = i45;
                                        int i47 = 0;
                                        while (true) {
                                            if (i46 >= this.f48319a.length()) {
                                                throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m19744m()));
                                            }
                                            int i48 = i46 + 1;
                                            char cCharAt27 = this.f48319a.charAt(i46);
                                            if (cCharAt27 == '\'') {
                                                int iIndexOf2 = this.f48319a.indexOf(39, i48);
                                                if (iIndexOf2 < 0) {
                                                    throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: ".concat(m19745n(i45)));
                                                }
                                                i46 = iIndexOf2 + 1;
                                            } else {
                                                if (cCharAt27 == '{') {
                                                    i47++;
                                                } else if (cCharAt27 != '}') {
                                                    i46 = i48;
                                                } else {
                                                    if (i47 <= 0) {
                                                        int i49 = i48 - 1;
                                                        int i50 = i49 - i45;
                                                        if (i50 > 65535) {
                                                            throw new IndexOutOfBoundsException("Argument style text too long: ".concat(m19745n(i45)));
                                                        }
                                                        m19753v(11, i45, i50, 0);
                                                        iM19743l = i49;
                                                        break;
                                                    }
                                                    i47--;
                                                }
                                                i46 = i48;
                                            }
                                        }
                                    } else if (i11 == 3) {
                                        int iM19743l6 = m19743l(i45);
                                        if (iM19743l6 == this.f48319a.length() || this.f48319a.charAt(iM19743l6) == '}') {
                                            throw new IllegalArgumentException("Missing choice argument pattern in ".concat(m19744m()));
                                        }
                                        while (true) {
                                            int iM19741j = m19741j(iM19743l6);
                                            int i51 = iM19741j - iM19743l6;
                                            if (i51 == 0) {
                                                throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(m19745n(i45)));
                                            }
                                            if (i51 > 65535) {
                                                throw new IndexOutOfBoundsException(xPAWq.VyJAMfHltRFaJ.concat(m19745n(iM19743l6)));
                                            }
                                            m19748q(iM19743l6, iM19741j, true);
                                            int iM19743l7 = m19743l(iM19741j);
                                            if (iM19743l7 == this.f48319a.length()) {
                                                throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(m19745n(i45)));
                                            }
                                            char cCharAt28 = this.f48319a.charAt(iM19743l7);
                                            if (cCharAt28 != '#' && cCharAt28 != '<' && cCharAt28 != 8804) {
                                                throw new IllegalArgumentException("Expected choice separator (#<≤) instead of '" + cCharAt28 + "' in choice pattern " + m19745n(i45));
                                            }
                                            m19753v(12, iM19743l7, 1, 0);
                                            iM19751t = m19751t(iM19743l7 + 1, 0, i3 + 1, 3);
                                            if (iM19751t == this.f48319a.length()) {
                                                break;
                                            }
                                            if (this.f48319a.charAt(iM19751t) == '}') {
                                                if (m19749r(i3)) {
                                                    break;
                                                }
                                                throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(m19745n(i45)));
                                            }
                                            iM19743l6 = m19743l(iM19751t + 1);
                                        }
                                        iM19743l = iM19751t;
                                    } else {
                                        int iM19741j2 = i45;
                                        boolean z3 = false;
                                        boolean z4 = true;
                                        while (true) {
                                            iM19743l2 = m19743l(iM19741j2);
                                            z = iM19743l2 == this.f48319a.length();
                                            if (z || this.f48319a.charAt(iM19743l2) == '}') {
                                                break;
                                            }
                                            if (C0121d.m5780b(i11) && this.f48319a.charAt(iM19743l2) == '=') {
                                                int i52 = iM19743l2 + 1;
                                                iM19742k = m19741j(i52);
                                                int i53 = iM19742k - iM19743l2;
                                                if (i53 == 1) {
                                                    throw new IllegalArgumentException("Bad " + C0121d.m5779a(i11).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + m19745n(i45));
                                                }
                                                if (i53 > 65535) {
                                                    throw new IndexOutOfBoundsException("Argument selector too long: ".concat(m19745n(iM19743l2)));
                                                }
                                                m19753v(12, iM19743l2, i53, 0);
                                                m19748q(i52, iM19742k, false);
                                            } else {
                                                iM19742k = m19742k(iM19743l2);
                                                int i54 = iM19742k - iM19743l2;
                                                if (i54 == 0) {
                                                    throw new IllegalArgumentException("Bad " + C0121d.m5779a(i11).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + m19745n(i45));
                                                }
                                                if (C0121d.m5780b(i11) && i54 == 6) {
                                                    if (iM19742k >= this.f48319a.length()) {
                                                        i54 = 6;
                                                    } else if (!this.f48319a.regionMatches(iM19743l2, "offset:", 0, 7)) {
                                                        i54 = 6;
                                                    } else {
                                                        if (!z4) {
                                                            throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(m19745n(i45)));
                                                        }
                                                        int iM19743l8 = m19743l(iM19742k + 1);
                                                        iM19741j2 = m19741j(iM19743l8);
                                                        if (iM19741j2 == iM19743l8) {
                                                            throw new IllegalArgumentException("Missing value for plural 'offset:' ".concat(m19745n(i45)));
                                                        }
                                                        if (iM19741j2 - iM19743l8 > 65535) {
                                                            throw new IndexOutOfBoundsException("Plural offset value too long: ".concat(m19745n(iM19743l8)));
                                                        }
                                                        m19748q(iM19743l8, iM19741j2, false);
                                                        z4 = false;
                                                    }
                                                }
                                                if (i54 > 65535) {
                                                    throw new IndexOutOfBoundsException("Argument selector too long: ".concat(m19745n(iM19743l2)));
                                                }
                                                m19753v(12, iM19743l2, i54, 0);
                                                if (this.f48319a.regionMatches(iM19743l2, "other", 0, i54)) {
                                                    z3 = true;
                                                }
                                            }
                                            int iM19743l9 = m19743l(iM19742k);
                                            if (iM19743l9 == this.f48319a.length() || this.f48319a.charAt(iM19743l9) != '{') {
                                                throw new IllegalArgumentException("No message fragment after " + C0121d.m5779a(i11).toLowerCase(Locale.ENGLISH) + " selector: " + m19745n(iM19743l2));
                                            }
                                            iM19741j2 = m19751t(iM19743l9, 1, i3 + 1, i11);
                                            z4 = false;
                                        }
                                        if (z == m19749r(i3)) {
                                            throw new IllegalArgumentException("Bad " + C0121d.m5779a(i11).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + m19745n(i45));
                                        }
                                        if (!z3) {
                                            throw new IllegalArgumentException("Missing 'other' keyword in " + C0121d.m5779a(i11).toLowerCase(Locale.ENGLISH) + " pattern in " + m19744m());
                                        }
                                        iM19743l = iM19743l2;
                                    }
                                } else if (i11 != 2) {
                                    throw new IllegalArgumentException("No style field for complex argument: ".concat(m19745n(iM19743l3)));
                                }
                            }
                            throw new IllegalArgumentException("Bad argument syntax: ".concat(m19745n(iM19743l3)));
                        }
                        iM19743l = iM19743l4;
                        i11 = 1;
                        m19752u(size2, 7, iM19743l, 1, i11 - 1);
                        i18 = iM19743l + 1;
                        z2 = true;
                    }
                } else {
                    m19753v(5, i5 - 1, z2 ? 1 : 0, 0);
                }
                i18 = i5;
                z2 = true;
            }
        }
        int i55 = i5 - 1;
        m19752u(size, 2, i55, (i17 == i7 && cCharAt == '}') ? 0 : 1, i3);
        return i17 == 3 ? i55 : i5;
    }

    /* JADX INFO: renamed from: u */
    private final void m19752u(int i, int i2, int i3, int i4, int i5) {
        ((C1138y) this.f48320b.get(i)).f48044d = this.f48320b.size();
        m19753v(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: v */
    private final void m19753v(int i, int i2, int i3, int i4) {
        this.f48320b.add(new C1138y(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: a */
    public final double m19754a(C1138y c1138y) {
        int i = c1138y.f48045e;
        if (i == 13) {
            return c1138y.f48043c;
        }
        if (i == 14) {
            return ((Double) this.f48321c.get(c1138y.f48043c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    /* JADX INFO: renamed from: b */
    public final int m19755b() {
        return this.f48320b.size();
    }

    /* JADX INFO: renamed from: c */
    public final int m19756c(int i) {
        int i2 = ((C1138y) this.f48320b.get(i)).f48044d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return m19758e();
    }

    /* JADX INFO: renamed from: d */
    public final C1138y m19757d(int i) {
        return (C1138y) this.f48320b.get(i);
    }

    /* JADX INFO: renamed from: e */
    public final C1165z m19758e() {
        try {
            C1165z c1165z = (C1165z) super.clone();
            c1165z.f48320b = (ArrayList) this.f48320b.clone();
            ArrayList arrayList = this.f48321c;
            if (arrayList != null) {
                c1165z.f48321c = (ArrayList) arrayList.clone();
            }
            c1165z.f48324g = false;
            return c1165z;
        } catch (CloneNotSupportedException e) {
            throw new C0001aa(e);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1165z c1165z = (C1165z) obj;
        int i = this.f48323f;
        int i2 = c1165z.f48323f;
        if (i != 0) {
            return i == i2 && ((str = this.f48319a) != null ? str.equals(c1165z.f48319a) : c1165z.f48319a == null) && this.f48320b.equals(c1165z.f48320b);
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final String m19759f(C1138y c1138y) {
        int i = c1138y.f48041a;
        return this.f48319a.substring(i, c1138y.f48042b + i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19760g(C1138y c1138y, String str) {
        return this.f48319a.regionMatches(c1138y.f48041a, str, 0, c1138y.f48042b);
    }

    /* JADX INFO: renamed from: h */
    public final int m19761h(int i) {
        return ((C1138y) this.f48320b.get(i)).f48045e;
    }

    public final int hashCode() {
        int i = this.f48323f;
        if (i == 0) {
            throw null;
        }
        int i2 = i * 37;
        String str = this.f48319a;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.f48320b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m19762i(String str) {
        this.f48319a = str;
        this.f48322d = false;
        this.f48320b.clear();
        ArrayList arrayList = this.f48321c;
        if (arrayList != null) {
            arrayList.clear();
        }
        m19751t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.f48319a;
    }

    public C1165z(String str) {
        this.f48320b = new ArrayList();
        this.f48323f = f48318h;
        m19762i(str);
    }
}
