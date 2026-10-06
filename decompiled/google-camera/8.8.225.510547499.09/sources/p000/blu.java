package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.lens.sdk.LensApi;
import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class blu extends blt {

    /* JADX INFO: renamed from: f */
    private static final pax f3712f = pax.m19278d("'\\");

    /* JADX INFO: renamed from: g */
    private static final pax f3713g = pax.m19278d("\"\\");

    /* JADX INFO: renamed from: h */
    private static final pax f3714h = pax.m19278d("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: i */
    private static final pax f3715i = pax.m19278d("\n\r");

    /* JADX INFO: renamed from: j */
    private static final pax f3716j = pax.m19278d(YmzeHXaMYOLk.exPpDMtjEFRTxj);

    /* JADX INFO: renamed from: k */
    private final paw f3717k;

    /* JADX INFO: renamed from: l */
    private final pau f3718l;

    /* JADX INFO: renamed from: m */
    private int f3719m = 0;

    /* JADX INFO: renamed from: n */
    private long f3720n;

    /* JADX INFO: renamed from: o */
    private int f3721o;

    /* JADX INFO: renamed from: p */
    private String f3722p;

    public blu(paw pawVar) {
        this.f3717k = pawVar;
        this.f3718l = ((pbc) pawVar).f47312b;
        m2660l(6);
    }

    /* JADX INFO: renamed from: A */
    private final void m2667A() {
        long jMo19262e = this.f3717k.mo19262e(f3714h);
        pau pauVar = this.f3718l;
        if (jMo19262e == -1) {
            jMo19262e = pauVar.f47299b;
        }
        pauVar.m19269l(jMo19262e);
    }

    /* JADX INFO: renamed from: B */
    private final boolean m2668B(int i) throws bls {
        switch (i) {
            case 9:
            case 10:
            case 12:
            case 13:
            case 32:
            case 44:
            case 58:
            case 91:
            case 93:
            case 123:
            case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return false;
            case 35:
            case 47:
            case 59:
            case 61:
            case 92:
                m2675x();
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: C */
    private final int m2669C(String str, dsx dsxVar) {
        int length = ((String[]) dsxVar.f12522b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) dsxVar.f12522b)[i])) {
                this.f3719m = 0;
                this.f3710d[this.f3708b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    private final char m2670s() throws bls, EOFException {
        int i;
        if (!this.f3717k.mo19270m(1L)) {
            throw m2652c(WIxTIdUIdfb.VMzSz);
        }
        byte bM19259b = this.f3718l.m19259b();
        switch (bM19259b) {
            case 10:
            case 34:
            case 39:
            case 47:
            case 92:
                return (char) bM19259b;
            case 98:
                return '\b';
            case 102:
                return '\f';
            case 110:
                return '\n';
            case 114:
                return '\r';
            case 116:
                return '\t';
            case 117:
                if (!this.f3717k.mo19270m(4L)) {
                    throw new EOFException("Unterminated escape sequence at path ".concat(m2653e()));
                }
                char c = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    byte bM19258a = this.f3718l.m19258a(i2);
                    char c2 = (char) (c << 4);
                    if (bM19258a >= 48 && bM19258a <= 57) {
                        i = bM19258a - 48;
                    } else if (bM19258a >= 97 && bM19258a <= 102) {
                        i = bM19258a - 87;
                    } else {
                        if (bM19258a < 65 || bM19258a > 70) {
                            throw m2652c("\\u".concat(this.f3718l.m19265h(4L)));
                        }
                        i = bM19258a - 55;
                    }
                    c = (char) (c2 + i);
                }
                this.f3718l.m19269l(4L);
                return c;
            default:
                throw m2652c("Invalid escape sequence: \\" + ((char) bM19259b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x0183  */
    /* JADX WARN: Code duplicated, block: B:109:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:111:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:161:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x021a A[DONT_INVERT, PHI: r2
      0x021a: PHI (r2v15 char) = (r2v14 char), (r2v16 char) binds: [B:152:0x01f1, B:167:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x021c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0225  */
    /* JADX WARN: Code duplicated, block: B:177:0x022d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x022e  */
    /* JADX WARN: Code duplicated, block: B:180:0x023c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0244  */
    /* JADX WARN: Code duplicated, block: B:184:0x024b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:0x016f  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0205, code lost:
    
        if (r15 == false) goto L165;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x0176. Please report as an issue. */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m2671t() throws bls, EOFException {
        String str;
        String str2;
        int i;
        long j;
        int i2;
        char c;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        byte bM19258a;
        int[] iArr = this.f3709c;
        int i5 = this.f3708b - 1;
        int i6 = iArr[i5];
        char c2 = 4;
        boolean z3 = true;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM2672u = m2672u(true);
            this.f3718l.m19259b();
            switch (iM2672u) {
                case 44:
                    break;
                case 59:
                    m2675x();
                    break;
                case 93:
                    this.f3719m = 4;
                    return 4;
                default:
                    throw m2652c("Unterminated array");
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int iM2672u2 = m2672u(true);
                    this.f3718l.m19259b();
                    switch (iM2672u2) {
                        case 44:
                            break;
                        case 59:
                            m2675x();
                            break;
                        case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                            this.f3719m = 2;
                            return 2;
                        default:
                            throw m2652c("Unterminated object");
                    }
                }
                int iM2672u3 = m2672u(true);
                switch (iM2672u3) {
                    case 34:
                        this.f3718l.m19259b();
                        this.f3719m = 13;
                        return 13;
                    case 39:
                        this.f3718l.m19259b();
                        m2675x();
                        this.f3719m = 12;
                        return 12;
                    case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        if (i6 == 5) {
                            throw m2652c("Expected name");
                        }
                        this.f3718l.m19259b();
                        this.f3719m = 2;
                        return 2;
                    default:
                        m2675x();
                        if (!m2668B((char) iM2672u3)) {
                            throw m2652c("Expected name");
                        }
                        this.f3719m = 14;
                        return 14;
                }
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM2672u4 = m2672u(true);
                this.f3718l.m19259b();
                switch (iM2672u4) {
                    case 58:
                        break;
                    case 61:
                        m2675x();
                        if (this.f3717k.mo19270m(1L) && this.f3718l.m19258a(0L) == 62) {
                            this.f3718l.m19259b();
                        }
                        break;
                    default:
                        throw m2652c("Expected ':'");
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else if (i6 == 7) {
                if (m2672u(false) == -1) {
                    this.f3719m = 18;
                    return 18;
                }
                m2675x();
            } else if (i6 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        switch (m2672u(true)) {
            case 34:
                this.f3718l.m19259b();
                this.f3719m = 9;
                return 9;
            case 39:
                m2675x();
                this.f3718l.m19259b();
                this.f3719m = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.f3718l.m19259b();
                this.f3719m = 3;
                return 3;
            case 93:
                if (i6 == 1) {
                    this.f3718l.m19259b();
                    this.f3719m = 4;
                    return 4;
                }
                break;
            case 123:
                this.f3718l.m19259b();
                this.f3719m = 1;
                return 1;
            default:
                byte bM19258a2 = this.f3718l.m19258a(0L);
                if (bM19258a2 == 116 || bM19258a2 == 84) {
                    str = "TRUE";
                    str2 = "true";
                    i = 5;
                } else {
                    if (bM19258a2 != 102 && bM19258a2 != 70) {
                        if (bM19258a2 == 110 || bM19258a2 == 78) {
                            str = "NULL";
                            str2 = "null";
                            i = 7;
                        } else {
                            i = 0;
                        }
                        if (i == 0) {
                            return i;
                        }
                        j = 0;
                        i2 = 0;
                        c = 0;
                        z = false;
                        z2 = true;
                        while (true) {
                            i3 = i2 + 1;
                            if (!this.f3717k.mo19270m(i3)) {
                                bM19258a = this.f3718l.m19258a(i2);
                                switch (bM19258a) {
                                    case 43:
                                        if (c != 5) {
                                            i4 = 0;
                                        }
                                        c = 6;
                                        i2 = i3;
                                        c2 = 4;
                                        break;
                                    case 45:
                                        if (c == 0) {
                                            c = 1;
                                            z = true;
                                        } else {
                                            if (c != 5) {
                                                i4 = 0;
                                            }
                                            c = 6;
                                        }
                                        i2 = i3;
                                        c2 = 4;
                                        break;
                                    case 46:
                                        if (c == 2) {
                                            i4 = 0;
                                        } else {
                                            c = 3;
                                            i2 = i3;
                                            c2 = 4;
                                        }
                                        break;
                                    case 69:
                                    case 101:
                                        if (c == 2 && c != c2) {
                                            i4 = 0;
                                        } else {
                                            c = 5;
                                            i2 = i3;
                                            c2 = 4;
                                        }
                                        break;
                                    default:
                                        if (bM19258a < 48 && bM19258a <= 57) {
                                            if (c == 1 || c == 0) {
                                                j = -(bM19258a - 48);
                                                c = 2;
                                            } else if (c == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (bM19258a - 48));
                                                    z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                            } else if (c == 3) {
                                                c = 4;
                                            } else if (c == 5 || c == 6) {
                                                c = 7;
                                            }
                                            i2 = i3;
                                            c2 = 4;
                                            break;
                                        } else if (m2668B(bM19258a)) {
                                        }
                                        i4 = 0;
                                        break;
                                }
                                if (i4 != 0) {
                                    return i4;
                                }
                                if (m2668B(this.f3718l.m19258a(0L))) {
                                    throw m2652c("Expected value");
                                }
                                m2675x();
                                this.f3719m = 10;
                                return 10;
                            }
                            if (c != 2) {
                                if (z2) {
                                    if (j == Long.MIN_VALUE) {
                                        z3 = z;
                                    } else if (z) {
                                    }
                                    if (j == 0) {
                                        if (!z3) {
                                        }
                                        this.f3720n = j;
                                        this.f3718l.m19269l(i2);
                                        i4 = 16;
                                        this.f3719m = 16;
                                    }
                                    j = -j;
                                    this.f3720n = j;
                                    this.f3718l.m19269l(i2);
                                    i4 = 16;
                                    this.f3719m = 16;
                                }
                                c = 2;
                                if (c != 2) {
                                    this.f3721o = i2;
                                    i4 = 17;
                                    this.f3719m = 17;
                                } else {
                                    this.f3721o = i2;
                                    i4 = 17;
                                    this.f3719m = 17;
                                }
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.f3721o = i2;
                                i4 = 17;
                                this.f3719m = 17;
                            } else {
                                i4 = 0;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m2668B(this.f3718l.m19258a(0L))) {
                                throw m2652c("Expected value");
                            }
                            m2675x();
                            this.f3719m = 10;
                            return 10;
                        }
                    }
                    str = "FALSE";
                    str2 = "false";
                    i = 6;
                }
                int i7 = 1;
                while (true) {
                    int length = str2.length();
                    if (i7 < length) {
                        int i8 = i7 + 1;
                        if (this.f3717k.mo19270m(i8)) {
                            byte bM19258a3 = this.f3718l.m19258a(i7);
                            if (bM19258a3 == str2.charAt(i7) || bM19258a3 == str.charAt(i7)) {
                                i7 = i8;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                    } else if (this.f3717k.mo19270m(length + 1) && m2668B(this.f3718l.m19258a(length))) {
                        i = 0;
                    } else {
                        this.f3718l.m19269l(length);
                        this.f3719m = i;
                    }
                }
                if (i == 0) {
                    return i;
                }
                j = 0;
                i2 = 0;
                c = 0;
                z = false;
                z2 = true;
                while (true) {
                    i3 = i2 + 1;
                    if (!this.f3717k.mo19270m(i3)) {
                        bM19258a = this.f3718l.m19258a(i2);
                        switch (bM19258a) {
                            case 43:
                                if (c != 5) {
                                    i4 = 0;
                                }
                                c = 6;
                                i2 = i3;
                                c2 = 4;
                                break;
                            case 45:
                                if (c == 0) {
                                    c = 1;
                                    z = true;
                                } else {
                                    if (c != 5) {
                                        i4 = 0;
                                    }
                                    c = 6;
                                }
                                i2 = i3;
                                c2 = 4;
                                break;
                            case 46:
                                if (c == 2) {
                                    i4 = 0;
                                } else {
                                    c = 3;
                                    i2 = i3;
                                    c2 = 4;
                                }
                                break;
                            case 69:
                            case 101:
                                if (c == 2) {
                                }
                                c = 5;
                                i2 = i3;
                                c2 = 4;
                                break;
                            default:
                                if (bM19258a < 48) {
                                }
                                if (m2668B(bM19258a)) {
                                    i4 = 0;
                                }
                                break;
                        }
                        if (i4 != 0) {
                            return i4;
                        }
                        if (m2668B(this.f3718l.m19258a(0L))) {
                            throw m2652c("Expected value");
                        }
                        m2675x();
                        this.f3719m = 10;
                        return 10;
                    }
                    if (c != 2) {
                        if (z2) {
                            if (j == Long.MIN_VALUE) {
                                z3 = z;
                            } else if (z) {
                            }
                            if (j == 0) {
                                if (!z3) {
                                }
                                this.f3720n = j;
                                this.f3718l.m19269l(i2);
                                i4 = 16;
                                this.f3719m = 16;
                            }
                            j = -j;
                            this.f3720n = j;
                            this.f3718l.m19269l(i2);
                            i4 = 16;
                            this.f3719m = 16;
                        }
                        c = 2;
                        if (c != 2) {
                            this.f3721o = i2;
                            i4 = 17;
                            this.f3719m = 17;
                        } else {
                            this.f3721o = i2;
                            i4 = 17;
                            this.f3719m = 17;
                        }
                    } else if (c != 2) {
                        this.f3721o = i2;
                        i4 = 17;
                        this.f3719m = 17;
                    } else {
                        this.f3721o = i2;
                        i4 = 17;
                        this.f3719m = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (m2668B(this.f3718l.m19258a(0L))) {
                        throw m2652c("Expected value");
                    }
                    m2675x();
                    this.f3719m = 10;
                    return 10;
                }
        }
        if (i6 != 1 && i6 != 2) {
            throw m2652c("Unexpected value");
        }
        m2675x();
        this.f3719m = 7;
        return 7;
    }

    /* JADX INFO: renamed from: u */
    private final int m2672u(boolean z) throws bls, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!this.f3717k.mo19270m(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte bM19258a = this.f3718l.m19258a(i);
            if (bM19258a == 10 || bM19258a == 32 || bM19258a == 13 || bM19258a == 9) {
                i = i2;
            } else {
                this.f3718l.m19269l(i2 - 1);
                if (bM19258a == 47) {
                    if (!this.f3717k.mo19270m(2L)) {
                        return 47;
                    }
                    m2675x();
                    switch (this.f3718l.m19258a(1L)) {
                        case 42:
                            this.f3718l.m19259b();
                            this.f3718l.m19259b();
                            paw pawVar = this.f3717k;
                            pax paxVar = f3716j;
                            long jMo19261d = pawVar.mo19261d(paxVar);
                            pau pauVar = this.f3718l;
                            boolean z2 = jMo19261d != -1;
                            pauVar.m19269l(z2 ? jMo19261d + ((long) paxVar.mo19280b()) : pauVar.f47299b);
                            if (!z2) {
                                throw m2652c("Unterminated comment");
                            }
                            i = 0;
                            break;
                            break;
                        case 47:
                            this.f3718l.m19259b();
                            this.f3718l.m19259b();
                            m2677z();
                            i = 0;
                            break;
                        default:
                            return 47;
                    }
                } else {
                    if (bM19258a != 35) {
                        return bM19258a;
                    }
                    m2675x();
                    m2677z();
                    i = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private final String m2673v(pax paxVar) throws bls {
        StringBuilder sb = null;
        while (true) {
            long jMo19262e = this.f3717k.mo19262e(paxVar);
            if (jMo19262e == -1) {
                throw m2652c("Unterminated string");
            }
            if (this.f3718l.m19258a(jMo19262e) != 92) {
                if (sb == null) {
                    String strM19265h = this.f3718l.m19265h(jMo19262e);
                    this.f3718l.m19259b();
                    return strM19265h;
                }
                sb.append(this.f3718l.m19265h(jMo19262e));
                this.f3718l.m19259b();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f3718l.m19265h(jMo19262e));
            this.f3718l.m19259b();
            sb.append(m2670s());
        }
    }

    /* JADX INFO: renamed from: w */
    private final String m2674w() {
        long jMo19262e = this.f3717k.mo19262e(f3714h);
        if (jMo19262e != -1) {
            return this.f3718l.m19265h(jMo19262e);
        }
        pau pauVar = this.f3718l;
        return pauVar.m19264g(pauVar.f47299b, oph.f46377a);
    }

    /* JADX INFO: renamed from: x */
    private final void m2675x() throws bls {
        throw m2652c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* JADX INFO: renamed from: y */
    private final void m2676y(pax paxVar) throws bls, EOFException {
        while (true) {
            long jMo19262e = this.f3717k.mo19262e(paxVar);
            if (jMo19262e == -1) {
                throw m2652c("Unterminated string");
            }
            if (this.f3718l.m19258a(jMo19262e) != 92) {
                this.f3718l.m19269l(jMo19262e + 1);
                return;
            } else {
                this.f3718l.m19269l(jMo19262e + 1);
                m2670s();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m2677z() {
        long jMo19262e = this.f3717k.mo19262e(f3715i);
        pau pauVar = this.f3718l;
        pauVar.m19269l(jMo19262e != -1 ? jMo19262e + 1 : pauVar.f47299b);
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: a */
    public final double mo2650a() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 16) {
            this.f3719m = 0;
            int[] iArr = this.f3711e;
            int i = this.f3708b - 1;
            iArr[i] = iArr[i] + 1;
            return this.f3720n;
        }
        if (iM2671t == 17) {
            this.f3722p = this.f3718l.m19265h(this.f3721o);
        } else if (iM2671t == 9) {
            this.f3722p = m2673v(f3713g);
        } else if (iM2671t == 8) {
            this.f3722p = m2673v(f3712f);
        } else if (iM2671t == 10) {
            this.f3722p = m2674w();
        } else if (iM2671t != 11) {
            throw new blr("Expected a double but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
        }
        this.f3719m = 11;
        try {
            double d = Double.parseDouble(this.f3722p);
            if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                this.f3722p = null;
                this.f3719m = 0;
                int[] iArr2 = this.f3711e;
                int i2 = this.f3708b - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new bls("JSON forbids NaN and infinities: " + d + " at path " + m2653e());
        } catch (NumberFormatException e) {
            throw new blr("Expected a double but was " + this.f3722p + " at path " + m2653e());
        }
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: b */
    public final int mo2651b() throws bls, EOFException {
        String strM2673v;
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 16) {
            long j = this.f3720n;
            int i = (int) j;
            if (j == i) {
                this.f3719m = 0;
                int[] iArr = this.f3711e;
                int i2 = this.f3708b - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new blr("Expected an int but was " + j + " at path " + m2653e());
        }
        if (iM2671t == 17) {
            this.f3722p = this.f3718l.m19265h(this.f3721o);
        } else {
            if (iM2671t == 9) {
                strM2673v = m2673v(f3713g);
            } else if (iM2671t == 8) {
                strM2673v = m2673v(f3712f);
            } else if (iM2671t != 11) {
                throw new blr("Expected an int but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
            }
            this.f3722p = strM2673v;
            try {
                int i3 = Integer.parseInt(strM2673v);
                this.f3719m = 0;
                int[] iArr2 = this.f3711e;
                int i4 = this.f3708b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException e) {
            }
        }
        this.f3719m = 11;
        try {
            double d = Double.parseDouble(this.f3722p);
            int i5 = (int) d;
            if (i5 == d) {
                this.f3722p = null;
                this.f3719m = 0;
                int[] iArr3 = this.f3711e;
                int i6 = this.f3708b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new blr("Expected an int but was " + this.f3722p + " at path " + m2653e());
        } catch (NumberFormatException e2) {
            throw new blr("Expected an int but was " + this.f3722p + " at path " + m2653e());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3719m = 0;
        this.f3709c[0] = 8;
        this.f3708b = 1;
        this.f3718l.m19268k();
        this.f3717k.close();
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: f */
    public final String mo2654f() throws bls, EOFException {
        String strM2673v;
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 14) {
            strM2673v = m2674w();
        } else if (iM2671t == 13) {
            strM2673v = m2673v(f3713g);
        } else if (iM2671t == 12) {
            strM2673v = m2673v(f3712f);
        } else {
            if (iM2671t != 15) {
                throw new blr("Expected a name but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
            }
            strM2673v = this.f3722p;
        }
        this.f3719m = 0;
        this.f3710d[this.f3708b - 1] = strM2673v;
        return strM2673v;
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: g */
    public final String mo2655g() throws bls, EOFException {
        String strM19265h;
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 10) {
            strM19265h = m2674w();
        } else if (iM2671t == 9) {
            strM19265h = m2673v(f3713g);
        } else if (iM2671t == 8) {
            strM19265h = m2673v(f3712f);
        } else if (iM2671t == 11) {
            strM19265h = this.f3722p;
            this.f3722p = null;
        } else if (iM2671t == 16) {
            strM19265h = Long.toString(this.f3720n);
        } else {
            if (iM2671t != 17) {
                throw new blr("Expected a string but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
            }
            strM19265h = this.f3718l.m19265h(this.f3721o);
        }
        this.f3719m = 0;
        int[] iArr = this.f3711e;
        int i = this.f3708b - 1;
        iArr[i] = iArr[i] + 1;
        return strM19265h;
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: h */
    public final void mo2656h() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 3) {
            m2660l(1);
            this.f3711e[this.f3708b - 1] = 0;
            this.f3719m = 0;
            return;
        }
        throw new blr("Expected BEGIN_ARRAY but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: i */
    public final void mo2657i() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 1) {
            m2660l(3);
            this.f3719m = 0;
            return;
        }
        throw new blr("Expected BEGIN_OBJECT but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: j */
    public final void mo2658j() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 4) {
            int i = this.f3708b - 1;
            this.f3708b = i;
            int[] iArr = this.f3711e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f3719m = 0;
            return;
        }
        throw new blr("Expected END_ARRAY but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: k */
    public final void mo2659k() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 2) {
            int i = this.f3708b - 1;
            this.f3708b = i;
            this.f3710d[i] = null;
            int[] iArr = this.f3711e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f3719m = 0;
            return;
        }
        throw new blr("Expected END_OBJECT but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: m */
    public final void mo2661m() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 14) {
            m2667A();
        } else if (iM2671t == 13) {
            m2676y(f3713g);
        } else if (iM2671t == 12) {
            m2676y(f3712f);
        } else if (iM2671t != 15) {
            throw new blr("Expected a name but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
        }
        this.f3719m = 0;
        this.f3710d[this.f3708b - 1] = "null";
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: n */
    public final void mo2662n() throws bls, EOFException {
        int i = 0;
        do {
            int iM2671t = this.f3719m;
            if (iM2671t == 0) {
                iM2671t = m2671t();
            }
            if (iM2671t == 3) {
                m2660l(1);
                i++;
            } else if (iM2671t == 1) {
                m2660l(3);
                i++;
            } else if (iM2671t == 4) {
                i--;
                if (i < 0) {
                    throw new blr("Expected a value but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
                }
                this.f3708b--;
            } else if (iM2671t == 2) {
                i--;
                if (i < 0) {
                    throw new blr("Expected a value but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
                }
                this.f3708b--;
            } else if (iM2671t == 14 || iM2671t == 10) {
                m2667A();
            } else if (iM2671t == 9 || iM2671t == 13) {
                m2676y(f3713g);
            } else if (iM2671t == 8 || iM2671t == 12) {
                m2676y(f3712f);
            } else if (iM2671t == 17) {
                this.f3718l.m19269l(this.f3721o);
            } else if (iM2671t == 18) {
                throw new blr("Expected a value but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
            }
            this.f3719m = 0;
        } while (i != 0);
        int[] iArr = this.f3711e;
        int i2 = this.f3708b - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f3710d[i2] = "null";
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: o */
    public final boolean mo2663o() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        return (iM2671t == 2 || iM2671t == 4 || iM2671t == 18) ? false : true;
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: p */
    public final boolean mo2664p() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        if (iM2671t == 5) {
            this.f3719m = 0;
            int[] iArr = this.f3711e;
            int i = this.f3708b - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM2671t == 6) {
            this.f3719m = 0;
            int[] iArr2 = this.f3711e;
            int i2 = this.f3708b - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new blr("Expected a boolean but was " + bzq.m3237J(mo2665q()) + " at path " + m2653e());
    }

    @Override // p000.blt
    /* JADX INFO: renamed from: q */
    public final int mo2665q() throws bls, EOFException {
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        switch (iM2671t) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x011f A[LOOP:1: B:19:0x0043->B:72:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c0 A[SYNTHETIC] */
    @Override // p000.blt
    /* JADX INFO: renamed from: r */
    public final int mo2666r(dsx dsxVar) throws bls, EOFException {
        int i;
        int iM2671t = this.f3719m;
        if (iM2671t == 0) {
            iM2671t = m2671t();
        }
        int i2 = -1;
        if (iM2671t < 12 || iM2671t > 15) {
            return -1;
        }
        if (iM2671t == 15) {
            return m2669C(this.f3722p, dsxVar);
        }
        paw pawVar = this.f3717k;
        Object obj = dsxVar.f12521a;
        pbc pbcVar = (pbc) pawVar;
        if (pbcVar.f47313c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            pau pauVar = pbcVar.f47312b;
            int i3 = pbh.f47326a;
            pbd pbdVar = pauVar.f47298a;
            if (pbdVar == null) {
                i = -2;
            } else {
                byte[] bArr = pbdVar.f47314a;
                int i4 = pbdVar.f47315b;
                int i5 = pbdVar.f47316c;
                int[] iArr = ((pba) obj).f47309b;
                pbd pbdVar2 = pbdVar;
                int i6 = 0;
                int i7 = -1;
                while (true) {
                    int i8 = iArr[i6];
                    int i9 = i6 + 1;
                    int i10 = iArr[i9];
                    if (i10 != i2) {
                        i7 = i10;
                    }
                    if (pbdVar2 == null) {
                        i = -2;
                    } else {
                        int i11 = i9 + 1;
                        if (i8 < 0) {
                            int i12 = (-i8) + i11;
                            while (true) {
                                int i13 = i4 + 1;
                                int i14 = i11 + 1;
                                if ((bArr[i4] & 255) != iArr[i11]) {
                                    i = i7;
                                } else {
                                    boolean z = i14 == i12;
                                    if (i13 == i5) {
                                        pbdVar2.getClass();
                                        pbd pbdVar3 = pbdVar2.f47319f;
                                        pbdVar3.getClass();
                                        int i15 = pbdVar3.f47315b;
                                        byte[] bArr2 = pbdVar3.f47314a;
                                        int i16 = pbdVar3.f47316c;
                                        if (pbdVar3 != pbdVar) {
                                            pbdVar2 = pbdVar3;
                                            i13 = i15;
                                            bArr = bArr2;
                                            i5 = i16;
                                        } else if (z) {
                                            i13 = i15;
                                            bArr = bArr2;
                                            i5 = i16;
                                            z = true;
                                            pbdVar2 = null;
                                        } else {
                                            i = -2;
                                        }
                                    }
                                    if (z) {
                                        i = iArr[i14];
                                        i4 = i13;
                                        if (i >= 0) {
                                            i6 = -i;
                                            i2 = -1;
                                        }
                                    } else {
                                        i4 = i13;
                                        i11 = i14;
                                    }
                                }
                            }
                        } else {
                            int i17 = i4 + 1;
                            int i18 = bArr[i4] & 255;
                            int i19 = i11 + i8;
                            while (true) {
                                if (i11 == i19) {
                                    i = i7;
                                } else if (i18 == iArr[i11]) {
                                    i = iArr[i11 + i8];
                                    if (i17 == i5) {
                                        pbdVar2 = pbdVar2.f47319f;
                                        pbdVar2.getClass();
                                        i4 = pbdVar2.f47315b;
                                        bArr = pbdVar2.f47314a;
                                        i5 = pbdVar2.f47316c;
                                        if (pbdVar2 == pbdVar) {
                                            pbdVar2 = null;
                                        }
                                    } else {
                                        i4 = i17;
                                    }
                                    if (i >= 0) {
                                        i6 = -i;
                                        i2 = -1;
                                    }
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                }
            }
            switch (i) {
                case -2:
                    if (pbcVar.f47311a.mo19277t(pbcVar.f47312b) != -1) {
                        i2 = -1;
                    } else {
                        i = -1;
                    }
                    break;
                case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                    i = -1;
                    break;
                default:
                    pbcVar.f47312b.m19269l(((pba) obj).f47308a[i].mo19280b());
                    break;
            }
        }
        if (i != -1) {
            this.f3719m = 0;
            this.f3710d[this.f3708b - 1] = ((String[]) dsxVar.f12522b)[i];
            return i;
        }
        String str = this.f3710d[this.f3708b - 1];
        String strMo2654f = mo2654f();
        int iM2669C = m2669C(strMo2654f, dsxVar);
        if (iM2669C != -1) {
            return iM2669C;
        }
        this.f3719m = 15;
        this.f3722p = strMo2654f;
        this.f3710d[this.f3708b - 1] = str;
        return -1;
    }

    public final String toString() {
        return "JsonReader(" + this.f3717k.toString() + ")";
    }
}
