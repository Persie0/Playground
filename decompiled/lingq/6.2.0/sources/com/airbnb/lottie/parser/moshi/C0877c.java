package com.airbnb.lottie.parser.moshi;

import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import p000.C3386nv;
import p000.aj0;
import p000.e18;
import p000.iy5;
import p000.p33;
import p000.rz6;
import p000.uk9;
import p000.yu0;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0877c extends AbstractC0875a {

    /* JADX INFO: renamed from: H */
    public static final ByteString f10740H;

    /* JADX INFO: renamed from: I */
    public static final ByteString f10741I;

    /* JADX INFO: renamed from: l */
    public static final ByteString f10742l;

    /* JADX INFO: renamed from: f */
    public final e18 f10743f;

    /* JADX INFO: renamed from: g */
    public final aj0 f10744g;

    /* JADX INFO: renamed from: h */
    public int f10745h;

    /* JADX INFO: renamed from: i */
    public long f10746i;

    /* JADX INFO: renamed from: j */
    public int f10747j;

    /* JADX INFO: renamed from: k */
    public String f10748k;

    static {
        ByteString byteString = ByteString.f54513d;
        f10742l = iy5.m14193h("'\\");
        f10740H = iy5.m14193h("\"\\");
        f10741I = iy5.m14193h("{}[]:, \n\t\r\f/\\;#=");
        iy5.m14193h("\n\r");
        iy5.m14193h("*/");
    }

    public C0877c(e18 e18Var) {
        this.f10737b = new int[32];
        this.f10738c = new String[32];
        this.f10739d = new int[32];
        this.f10745h = 0;
        this.f10743f = e18Var;
        this.f10744g = e18Var.f36575b;
        m5032A(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: J */
    public final int mo5033J(p33 p33Var) {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y < 12 || iM5050Y > 15) {
            return -1;
        }
        if (iM5050Y == 15) {
            return m5051Z(this.f10748k, p33Var);
        }
        int iMo501y = this.f10743f.mo501y((rz6) p33Var.f55514c);
        if (iMo501y != -1) {
            this.f10745h = 0;
            this.f10738c[this.f10736a - 1] = ((String[]) p33Var.f55513b)[iMo501y];
            return iMo501y;
        }
        String str = this.f10738c[this.f10736a - 1];
        String strM5053h0 = m5053h0();
        int iM5051Z = m5051Z(strM5053h0, p33Var);
        if (iM5051Z == -1) {
            this.f10745h = 15;
            this.f10748k = strM5053h0;
            this.f10738c[this.f10736a - 1] = str;
        }
        return iM5051Z;
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: N */
    public final void mo5034N() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 14) {
            long jM10789c = this.f10743f.m10789c(f10741I);
            aj0 aj0Var = this.f10744g;
            if (jM10789c == -1) {
                jM10789c = aj0Var.f723b;
            }
            aj0Var.skip(jM10789c);
        } else if (iM5050Y == 13) {
            m5058m0(f10740H);
        } else if (iM5050Y == 12) {
            m5058m0(f10742l);
        } else if (iM5050Y != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
            return;
        }
        this.f10745h = 0;
        this.f10738c[this.f10736a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: R */
    public final void mo5035R() {
        int i = 0;
        do {
            int iM5050Y = this.f10745h;
            if (iM5050Y == 0) {
                iM5050Y = m5050Y();
            }
            if (iM5050Y == 3) {
                m5032A(1);
            } else {
                if (iM5050Y == 1) {
                    m5032A(3);
                } else if (iM5050Y == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(mo5047z());
                        C0876b.m5048a(sb, m5041n());
                        return;
                    }
                    this.f10736a--;
                } else if (iM5050Y == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(mo5047z());
                        C0876b.m5048a(sb2, m5041n());
                        return;
                    }
                    this.f10736a--;
                } else {
                    aj0 aj0Var = this.f10744g;
                    if (iM5050Y == 14 || iM5050Y == 10) {
                        long jM10789c = this.f10743f.m10789c(f10741I);
                        if (jM10789c == -1) {
                            jM10789c = aj0Var.f723b;
                        }
                        aj0Var.skip(jM10789c);
                    } else if (iM5050Y == 9 || iM5050Y == 13) {
                        m5058m0(f10740H);
                    } else if (iM5050Y == 8 || iM5050Y == 12) {
                        m5058m0(f10742l);
                    } else if (iM5050Y == 17) {
                        aj0Var.skip(this.f10747j);
                    } else if (iM5050Y == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(mo5047z());
                        C0876b.m5048a(sb3, m5041n());
                        return;
                    }
                }
                this.f10745h = 0;
            }
            i++;
            this.f10745h = 0;
        } while (i != 0);
        int[] iArr = this.f10739d;
        int i2 = this.f10736a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f10738c[i2] = "null";
    }

    /* JADX INFO: renamed from: W */
    public final void m5049W() throws JsonEncodingException {
        m5036T("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX INFO: renamed from: Y */
    public final int m5050Y() throws JsonEncodingException, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cM494q;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bM494q;
        int i6;
        int[] iArr = this.f10737b;
        int i7 = this.f10736a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        aj0 aj0Var = this.f10744g;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM5054i0 = m5054i0(true);
            aj0Var.readByte();
            if (iM5054i0 != 44) {
                if (iM5054i0 == 59) {
                    m5049W();
                    throw null;
                }
                if (iM5054i0 == 93) {
                    this.f10745h = 4;
                    return 4;
                }
                m5036T("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iM5054i1 = m5054i0(true);
                    aj0Var.readByte();
                    if (iM5054i1 != 44) {
                        if (iM5054i1 == 59) {
                            m5049W();
                            throw null;
                        }
                        if (iM5054i1 == 125) {
                            this.f10745h = 2;
                            return 2;
                        }
                        m5036T("Unterminated object");
                        throw null;
                    }
                }
                int iM5054i2 = m5054i0(true);
                if (iM5054i2 == 34) {
                    aj0Var.readByte();
                    this.f10745h = 13;
                    return 13;
                }
                if (iM5054i2 == 39) {
                    aj0Var.readByte();
                    m5049W();
                    throw null;
                }
                if (iM5054i2 != 125) {
                    m5049W();
                    throw null;
                }
                if (i8 == 5) {
                    m5036T("Expected name");
                    throw null;
                }
                aj0Var.readByte();
                this.f10745h = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM5054i3 = m5054i0(true);
                aj0Var.readByte();
                if (iM5054i3 != 58) {
                    if (iM5054i3 != 61) {
                        m5036T("Expected ':'");
                        throw null;
                    }
                    m5049W();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (m5054i0(false) == -1) {
                        this.f10745h = 18;
                        return 18;
                    }
                    m5049W();
                    throw null;
                }
                if (i8 == 8) {
                    C3386nv.m17633t("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iM5054i4 = m5054i0(true);
        if (iM5054i4 == 34) {
            aj0Var.readByte();
            this.f10745h = 9;
            return 9;
        }
        if (iM5054i4 == 39) {
            m5049W();
            throw null;
        }
        if (iM5054i4 != 44 && iM5054i4 != 59) {
            if (iM5054i4 == 91) {
                aj0Var.readByte();
                this.f10745h = 3;
                return 3;
            }
            if (iM5054i4 != 93) {
                if (iM5054i4 == 123) {
                    aj0Var.readByte();
                    this.f10745h = 1;
                    return 1;
                }
                byte bM494q2 = aj0Var.m494q(0L);
                e18 e18Var = this.f10743f;
                if (bM494q2 == 116 || bM494q2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bM494q2 != 102 && bM494q2 != 70) {
                        if (bM494q2 == 110 || bM494q2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (e18Var.mo464P(i4)) {
                                bM494q = aj0Var.m494q(i3);
                                if (bM494q != 43) {
                                    if (bM494q != 69 || bM494q == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bM494q == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bM494q != 46) {
                                        if (bM494q >= 48 && bM494q <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bM494q - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bM494q - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!m5052g0(bM494q)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m5052g0(aj0Var.m494q(j))) {
                                        m5049W();
                                        throw null;
                                    }
                                    m5036T("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m5052g0(aj0Var.m494q(j))) {
                                        m5036T("Expected value");
                                        throw null;
                                    }
                                    m5049W();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.f10746i = j2;
                                aj0Var.skip(i3);
                                i5 = 16;
                                this.f10745h = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.f10747j = i3;
                                i5 = 17;
                                this.f10745h = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m5052g0(aj0Var.m494q(j))) {
                                m5036T("Expected value");
                                throw null;
                            }
                            m5049W();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!e18Var.mo464P(length + 1) || !m5052g0(aj0Var.m494q(length))) {
                            aj0Var.skip(length);
                            this.f10745h = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (e18Var.mo464P(i13) && ((cM494q = aj0Var.m494q(i12)) == str2.charAt(i12) || cM494q == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (e18Var.mo464P(i4)) {
                        bM494q = aj0Var.m494q(i3);
                        if (bM494q != 43) {
                            if (bM494q != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m5052g0(aj0Var.m494q(j))) {
                                m5036T("Expected value");
                                throw null;
                            }
                            m5049W();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m5052g0(aj0Var.m494q(j))) {
                                m5036T("Expected value");
                                throw null;
                            }
                            m5049W();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.f10747j = i3;
                        i5 = 17;
                        this.f10745h = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.f10747j = i3;
                        i5 = 17;
                        this.f10745h = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (m5052g0(aj0Var.m494q(j))) {
                        m5036T("Expected value");
                        throw null;
                    }
                    m5049W();
                    throw null;
                }
            }
            if (i8 == 1) {
                aj0Var.readByte();
                this.f10745h = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            m5049W();
            throw null;
        }
        m5036T("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: Z */
    public final int m5051Z(String str, p33 p33Var) {
        int length = ((String[]) p33Var.f55513b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) p33Var.f55513b)[i])) {
                this.f10745h = 0;
                this.f10738c[this.f10736a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: a */
    public final void mo5037a() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 3) {
            m5032A(1);
            this.f10739d[this.f10736a - 1] = 0;
            this.f10745h = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: b */
    public final void mo5038b() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 1) {
            m5032A(3);
            this.f10745h = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: c */
    public final void mo5039c() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
        } else {
            int i = this.f10736a;
            this.f10736a = i - 1;
            int[] iArr = this.f10739d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.f10745h = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10745h = 0;
        this.f10737b[0] = 8;
        this.f10736a = 1;
        this.f10744g.m473a();
        this.f10743f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: e */
    public final void mo5040e() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
            return;
        }
        int i = this.f10736a;
        int i2 = i - 1;
        this.f10736a = i2;
        this.f10738c[i2] = null;
        int[] iArr = this.f10739d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f10745h = 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m5052g0(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m5049W();
        throw null;
    }

    /* JADX INFO: renamed from: h0 */
    public final String m5053h0() {
        String strM5055j0;
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 14) {
            strM5055j0 = m5056k0();
        } else if (iM5050Y == 13) {
            strM5055j0 = m5055j0(f10740H);
        } else if (iM5050Y == 12) {
            strM5055j0 = m5055j0(f10742l);
        } else {
            if (iM5050Y != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(mo5047z());
                C0876b.m5048a(sb, m5041n());
                return null;
            }
            strM5055j0 = this.f10748k;
        }
        this.f10745h = 0;
        this.f10738c[this.f10736a - 1] = strM5055j0;
        return strM5055j0;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m5054i0(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            e18 e18Var = this.f10743f;
            if (!e18Var.mo464P(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            aj0 aj0Var = this.f10744g;
            byte bM494q = aj0Var.m494q(j);
            if (bM494q != 10 && bM494q != 32 && bM494q != 13 && bM494q != 9) {
                aj0Var.skip(j);
                if (bM494q == 47) {
                    if (e18Var.mo464P(2L)) {
                        m5049W();
                        throw null;
                    }
                } else if (bM494q == 35) {
                    m5049W();
                    throw null;
                }
                return bM494q;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final String m5055j0(ByteString byteString) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jM10789c = this.f10743f.m10789c(byteString);
            if (jM10789c == -1) {
                m5036T("Unterminated string");
                throw null;
            }
            aj0 aj0Var = this.f10744g;
            if (aj0Var.m494q(jM10789c) != 92) {
                if (sb == null) {
                    String strM470W = aj0Var.m470W(jM10789c, yu0.f70463a);
                    aj0Var.readByte();
                    return strM470W;
                }
                sb.append(aj0Var.m470W(jM10789c, yu0.f70463a));
                aj0Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(aj0Var.m470W(jM10789c, yu0.f70463a));
            aj0Var.readByte();
            sb.append(m5057l0());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final String m5056k0() {
        long jM10789c = this.f10743f.m10789c(f10741I);
        aj0 aj0Var = this.f10744g;
        if (jM10789c == -1) {
            return aj0Var.m472Y();
        }
        aj0Var.getClass();
        return aj0Var.m470W(jM10789c, yu0.f70463a);
    }

    /* JADX INFO: renamed from: l0 */
    public final char m5057l0() throws JsonEncodingException, EOFException {
        int i;
        e18 e18Var = this.f10743f;
        if (!e18Var.mo464P(1L)) {
            m5036T("Unterminated escape sequence");
            throw null;
        }
        aj0 aj0Var = this.f10744g;
        byte b = aj0Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m5036T("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!e18Var.mo464P(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(m5041n()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bM494q = aj0Var.m494q(i2);
            char c2 = (char) (c << 4);
            if (bM494q >= 48 && bM494q <= 57) {
                i = bM494q - 48;
            } else if (bM494q >= 97 && bM494q <= 102) {
                i = bM494q - 87;
            } else {
                if (bM494q < 65 || bM494q > 70) {
                    m5036T("\\u".concat(aj0Var.m470W(4L, yu0.f70463a)));
                    throw null;
                }
                i = bM494q - 55;
            }
            c = (char) (i + c2);
        }
        aj0Var.skip(4L);
        return c;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5058m0(ByteString byteString) throws JsonEncodingException, EOFException {
        while (true) {
            long jM10789c = this.f10743f.m10789c(byteString);
            if (jM10789c == -1) {
                m5036T("Unterminated string");
                throw null;
            }
            aj0 aj0Var = this.f10744g;
            if (aj0Var.m494q(jM10789c) != 92) {
                aj0Var.skip(jM10789c + 1);
                return;
            } else {
                aj0Var.skip(jM10789c + 1);
                m5057l0();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: p */
    public final boolean mo5042p() throws JsonEncodingException, EOFException {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        return (iM5050Y == 2 || iM5050Y == 4 || iM5050Y == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: q */
    public final boolean mo5043q() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 5) {
            this.f10745h = 0;
            int[] iArr = this.f10739d;
            int i = this.f10736a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM5050Y != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
            return false;
        }
        this.f10745h = 0;
        int[] iArr2 = this.f10739d;
        int i2 = this.f10736a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: r */
    public final double mo5044r() throws JsonEncodingException, EOFException {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 16) {
            this.f10745h = 0;
            int[] iArr = this.f10739d;
            int i = this.f10736a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f10746i;
        }
        if (iM5050Y == 17) {
            long j = this.f10747j;
            aj0 aj0Var = this.f10744g;
            aj0Var.getClass();
            this.f10748k = aj0Var.m470W(j, yu0.f70463a);
        } else if (iM5050Y == 9) {
            this.f10748k = m5055j0(f10740H);
        } else if (iM5050Y == 8) {
            this.f10748k = m5055j0(f10742l);
        } else if (iM5050Y == 10) {
            this.f10748k = m5056k0();
        } else if (iM5050Y != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
            return 0.0d;
        }
        this.f10745h = 11;
        try {
            double d = Double.parseDouble(this.f10748k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + m5041n());
            }
            this.f10748k = null;
            this.f10745h = 0;
            int[] iArr2 = this.f10739d;
            int i2 = this.f10736a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f10748k + " at path " + m5041n());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f10743f + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: u */
    public final int mo5045u() {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 16) {
            long j = this.f10746i;
            int i = (int) j;
            if (j == i) {
                this.f10745h = 0;
                int[] iArr = this.f10739d;
                int i2 = this.f10736a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.f10746i + " at path " + m5041n());
        }
        if (iM5050Y == 17) {
            long j2 = this.f10747j;
            aj0 aj0Var = this.f10744g;
            aj0Var.getClass();
            this.f10748k = aj0Var.m470W(j2, yu0.f70463a);
        } else if (iM5050Y == 9 || iM5050Y == 8) {
            String strM5055j0 = iM5050Y == 9 ? m5055j0(f10740H) : m5055j0(f10742l);
            this.f10748k = strM5055j0;
            try {
                int i3 = Integer.parseInt(strM5055j0);
                this.f10745h = 0;
                int[] iArr2 = this.f10739d;
                int i4 = this.f10736a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM5050Y != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(mo5047z());
            C0876b.m5048a(sb, m5041n());
            return 0;
        }
        this.f10745h = 11;
        try {
            double d = Double.parseDouble(this.f10748k);
            int i5 = (int) d;
            if (i5 == d) {
                this.f10748k = null;
                this.f10745h = 0;
                int[] iArr3 = this.f10739d;
                int i6 = this.f10736a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f10748k + " at path " + m5041n());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f10748k + " at path " + m5041n());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: x */
    public final String mo5046x() {
        String strM470W;
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        if (iM5050Y == 10) {
            strM470W = m5056k0();
        } else if (iM5050Y == 9) {
            strM470W = m5055j0(f10740H);
        } else if (iM5050Y == 8) {
            strM470W = m5055j0(f10742l);
        } else if (iM5050Y == 11) {
            strM470W = this.f10748k;
            this.f10748k = null;
        } else if (iM5050Y == 16) {
            strM470W = Long.toString(this.f10746i);
        } else {
            if (iM5050Y != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(mo5047z());
                C0876b.m5048a(sb, m5041n());
                return null;
            }
            long j = this.f10747j;
            aj0 aj0Var = this.f10744g;
            aj0Var.getClass();
            strM470W = aj0Var.m470W(j, yu0.f70463a);
        }
        this.f10745h = 0;
        int[] iArr = this.f10739d;
        int i = this.f10736a - 1;
        iArr[i] = iArr[i] + 1;
        return strM470W;
    }

    @Override // com.airbnb.lottie.parser.moshi.AbstractC0875a
    /* JADX INFO: renamed from: z */
    public final JsonReader$Token mo5047z() throws JsonEncodingException, EOFException {
        int iM5050Y = this.f10745h;
        if (iM5050Y == 0) {
            iM5050Y = m5050Y();
        }
        switch (iM5050Y) {
            case 1:
                return JsonReader$Token.BEGIN_OBJECT;
            case 2:
                return JsonReader$Token.END_OBJECT;
            case 3:
                return JsonReader$Token.BEGIN_ARRAY;
            case 4:
                return JsonReader$Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader$Token.BOOLEAN;
            case 7:
                return JsonReader$Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader$Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader$Token.NAME;
            case 16:
            case 17:
                return JsonReader$Token.NUMBER;
            case 18:
                return JsonReader$Token.END_DOCUMENT;
            default:
                uk9.m22780o();
                return null;
        }
    }
}
