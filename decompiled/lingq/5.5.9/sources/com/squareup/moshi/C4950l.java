package com.squareup.moshi;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.InterfaceC5610g;

/* JADX INFO: renamed from: com.squareup.moshi.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C4950l extends JsonReader {

    /* JADX INFO: renamed from: H */
    public static final ByteString f32247H;

    /* JADX INFO: renamed from: I */
    public static final ByteString f32248I;

    /* JADX INFO: renamed from: J */
    public static final ByteString f32249J;

    /* JADX INFO: renamed from: K */
    public static final ByteString f32250K;

    /* JADX INFO: renamed from: L */
    public static final ByteString f32251L;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5610g f32252g;

    /* JADX INFO: renamed from: h */
    public final C5608e f32253h;

    /* JADX INFO: renamed from: i */
    public int f32254i = 0;

    /* JADX INFO: renamed from: j */
    public long f32255j;

    /* JADX INFO: renamed from: k */
    public int f32256k;

    /* JADX INFO: renamed from: l */
    public String f32257l;

    static {
        ByteString byteString = ByteString.f43897d;
        f32247H = ByteString.C8082a.m16001c("'\\");
        f32248I = ByteString.C8082a.m16001c("\"\\");
        f32249J = ByteString.C8082a.m16001c("{}[]:, \n\t\r\f/\\;#=");
        f32250K = ByteString.C8082a.m16001c("\n\r");
        f32251L = ByteString.C8082a.m16001c("*/");
    }

    public C4950l(InterfaceC5610g interfaceC5610g) {
        this.f32252g = interfaceC5610g;
        this.f32253h = interfaceC5610g.mo11956f();
        m10510s0(6);
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: B0 */
    public final int mo10492B0(JsonReader.C4932a c4932a) throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 >= 8 && iM10537W0 <= 11) {
            if (iM10537W0 == 11) {
                return m10539c1(this.f32257l, c4932a);
            }
            int iMo11926C0 = this.f32252g.mo11926C0(c4932a.f32182b);
            if (iMo11926C0 != -1) {
                this.f32254i = 0;
                int[] iArr = this.f32178d;
                int i10 = this.f32175a - 1;
                iArr[i10] = iArr[i10] + 1;
                return iMo11926C0;
            }
            String strMo10502U = mo10502U();
            int iM10539c1 = m10539c1(strMo10502U, c4932a);
            if (iM10539c1 == -1) {
                this.f32254i = 11;
                this.f32257l = strMo10502U;
                int[] iArr2 = this.f32178d;
                int i11 = this.f32175a - 1;
                iArr2[i11] = iArr2[i11] - 1;
            }
            return iM10539c1;
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: C */
    public final boolean mo10493C() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 5) {
            this.f32254i = 0;
            int[] iArr = this.f32178d;
            int i10 = this.f32175a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM10537W0 == 6) {
            this.f32254i = 0;
            int[] iArr2 = this.f32178d;
            int i11 = this.f32175a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + mo10505d0() + " at path " + m10509r());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: E */
    public final double mo10494E() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 16) {
            this.f32254i = 0;
            int[] iArr = this.f32178d;
            int i10 = this.f32175a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32255j;
        }
        if (iM10537W0 == 17) {
            this.f32257l = this.f32253h.m11939N0(this.f32256k);
        } else if (iM10537W0 == 9) {
            this.f32257l = m10543q1(f32248I);
        } else if (iM10537W0 == 8) {
            this.f32257l = m10543q1(f32247H);
        } else if (iM10537W0 == 10) {
            this.f32257l = m10544r1();
        } else if (iM10537W0 != 11) {
            throw new JsonDataException("Expected a double but was " + mo10505d0() + " at path " + m10509r());
        }
        this.f32254i = 11;
        try {
            double d10 = Double.parseDouble(this.f32257l);
            if (!this.f32179e && (Double.isNaN(d10) || Double.isInfinite(d10))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + m10509r());
            }
            this.f32257l = null;
            this.f32254i = 0;
            int[] iArr2 = this.f32178d;
            int i11 = this.f32175a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f32257l + " at path " + m10509r());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: G */
    public final int mo10495G() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 16) {
            long j10 = this.f32255j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f32254i = 0;
                int[] iArr = this.f32178d;
                int i11 = this.f32175a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f32255j + " at path " + m10509r());
        }
        if (iM10537W0 == 17) {
            this.f32257l = this.f32253h.m11939N0(this.f32256k);
        } else if (iM10537W0 == 9 || iM10537W0 == 8) {
            String strM10543q1 = iM10537W0 == 9 ? m10543q1(f32248I) : m10543q1(f32247H);
            this.f32257l = strM10543q1;
            try {
                int i12 = Integer.parseInt(strM10543q1);
                this.f32254i = 0;
                int[] iArr2 = this.f32178d;
                int i13 = this.f32175a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM10537W0 != 11) {
            throw new JsonDataException("Expected an int but was " + mo10505d0() + " at path " + m10509r());
        }
        this.f32254i = 11;
        try {
            double d10 = Double.parseDouble(this.f32257l);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new JsonDataException("Expected an int but was " + this.f32257l + " at path " + m10509r());
            }
            this.f32257l = null;
            this.f32254i = 0;
            int[] iArr3 = this.f32178d;
            int i15 = this.f32175a - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f32257l + " at path " + m10509r());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: G0 */
    public final void mo10496G0() throws IOException {
        if (this.f32180f) {
            JsonReader.Token tokenMo10505d0 = mo10505d0();
            m10541l1();
            throw new JsonDataException("Cannot skip unexpected " + tokenMo10505d0 + " at " + m10509r());
        }
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 14) {
            long jMo11943R = this.f32252g.mo11943R(f32249J);
            C5608e c5608e = this.f32253h;
            if (jMo11943R == -1) {
                jMo11943R = c5608e.f34435b;
            }
            c5608e.skip(jMo11943R);
        } else if (iM10537W0 == 13) {
            m10546y1(f32248I);
        } else if (iM10537W0 == 12) {
            m10546y1(f32247H);
        } else if (iM10537W0 != 15) {
            throw new JsonDataException("Expected a name but was " + mo10505d0() + " at path " + m10509r());
        }
        this.f32254i = 0;
        this.f32177c[this.f32175a - 1] = "null";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: H */
    public final long mo10497H() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 16) {
            this.f32254i = 0;
            int[] iArr = this.f32178d;
            int i10 = this.f32175a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32255j;
        }
        if (iM10537W0 == 17) {
            this.f32257l = this.f32253h.m11939N0(this.f32256k);
        } else if (iM10537W0 == 9 || iM10537W0 == 8) {
            String strM10543q1 = iM10537W0 == 9 ? m10543q1(f32248I) : m10543q1(f32247H);
            this.f32257l = strM10543q1;
            try {
                long j10 = Long.parseLong(strM10543q1);
                this.f32254i = 0;
                int[] iArr2 = this.f32178d;
                int i11 = this.f32175a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iM10537W0 != 11) {
            throw new JsonDataException("Expected a long but was " + mo10505d0() + " at path " + m10509r());
        }
        this.f32254i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f32257l).longValueExact();
            this.f32257l = null;
            this.f32254i = 0;
            int[] iArr3 = this.f32178d;
            int i12 = this.f32175a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f32257l + " at path " + m10509r());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: I0 */
    public final void mo10498I0() throws IOException {
        if (this.f32180f) {
            throw new JsonDataException("Cannot skip unexpected " + mo10505d0() + " at " + m10509r());
        }
        int i10 = 0;
        do {
            int iM10537W0 = this.f32254i;
            if (iM10537W0 == 0) {
                iM10537W0 = m10537W0();
            }
            if (iM10537W0 == 3) {
                m10510s0(1);
            } else {
                if (iM10537W0 == 1) {
                    m10510s0(3);
                } else if (iM10537W0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo10505d0() + " at path " + m10509r());
                    }
                    this.f32175a--;
                } else if (iM10537W0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo10505d0() + " at path " + m10509r());
                    }
                    this.f32175a--;
                } else {
                    C5608e c5608e = this.f32253h;
                    if (iM10537W0 == 14 || iM10537W0 == 10) {
                        long jMo11943R = this.f32252g.mo11943R(f32249J);
                        if (jMo11943R == -1) {
                            jMo11943R = c5608e.f34435b;
                        }
                        c5608e.skip(jMo11943R);
                    } else if (iM10537W0 == 9 || iM10537W0 == 13) {
                        m10546y1(f32248I);
                    } else if (iM10537W0 == 8 || iM10537W0 == 12) {
                        m10546y1(f32247H);
                    } else if (iM10537W0 == 17) {
                        c5608e.skip(this.f32256k);
                    } else if (iM10537W0 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo10505d0() + " at path " + m10509r());
                    }
                }
                this.f32254i = 0;
            }
            i10++;
            this.f32254i = 0;
        } while (i10 != 0);
        int[] iArr = this.f32178d;
        int i11 = this.f32175a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f32177c[i11 - 1] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: Q */
    public final void mo10501Q() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 7) {
            this.f32254i = 0;
            int[] iArr = this.f32178d;
            int i10 = this.f32175a - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + mo10505d0() + " at path " + m10509r());
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10536Q0() throws IOException {
        if (this.f32179e) {
            return;
        }
        m10499N0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: U */
    public final String mo10502U() throws IOException {
        String strM11939N0;
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 10) {
            strM11939N0 = m10544r1();
        } else if (iM10537W0 == 9) {
            strM11939N0 = m10543q1(f32248I);
        } else if (iM10537W0 == 8) {
            strM11939N0 = m10543q1(f32247H);
        } else if (iM10537W0 == 11) {
            strM11939N0 = this.f32257l;
            this.f32257l = null;
        } else if (iM10537W0 == 16) {
            strM11939N0 = Long.toString(this.f32255j);
        } else {
            if (iM10537W0 != 17) {
                throw new JsonDataException("Expected a string but was " + mo10505d0() + " at path " + m10509r());
            }
            strM11939N0 = this.f32253h.m11939N0(this.f32256k);
        }
        this.f32254i = 0;
        int[] iArr = this.f32178d;
        int i10 = this.f32175a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strM11939N0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0217  */
    /* JADX WARN: Code duplicated, block: B:171:0x021d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0223  */
    /* JADX WARN: Code duplicated, block: B:180:0x0232 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:181:0x0233  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0249  */
    /* JADX WARN: Code duplicated, block: B:187:0x024f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0255 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0257  */
    /* JADX WARN: Code duplicated, block: B:192:0x025e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0277  */
    /* JADX WARN: Code duplicated, block: B:204:0x0284  */
    /* JADX WARN: Code duplicated, block: B:245:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0132 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x013d  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    /* JADX INFO: renamed from: W0 */
    public final int m10537W0() throws IOException {
        int i10;
        int iM10542p1;
        byte bM11930G;
        int i11;
        String str;
        String str2;
        int length;
        int i12;
        int i13;
        char cM11930G;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte bM11930G2;
        int i20;
        int[] iArr = this.f32176b;
        int i21 = this.f32175a;
        int i22 = iArr[i21 - 1];
        InterfaceC5610g interfaceC5610g = this.f32252g;
        C5608e c5608e = this.f32253h;
        if (i22 == 1) {
            iArr[i21 - 1] = 2;
        } else {
            if (i22 != 2) {
                if (i22 == 3 || i22 == 5) {
                    iArr[i21 - 1] = 4;
                    if (i22 == 5) {
                        int iM10542p2 = m10542p1(true);
                        c5608e.readByte();
                        if (iM10542p2 != 44) {
                            if (iM10542p2 != 59) {
                                if (iM10542p2 == 125) {
                                    this.f32254i = 2;
                                    return 2;
                                }
                                m10499N0("Unterminated object");
                                throw null;
                            }
                            m10536Q0();
                        }
                    }
                    int iM10542p3 = m10542p1(true);
                    if (iM10542p3 == 34) {
                        c5608e.readByte();
                        this.f32254i = 13;
                        return 13;
                    }
                    if (iM10542p3 == 39) {
                        c5608e.readByte();
                        m10536Q0();
                        this.f32254i = 12;
                        return 12;
                    }
                    if (iM10542p3 != 125) {
                        m10536Q0();
                        if (m10540d1((char) iM10542p3)) {
                            this.f32254i = 14;
                            return 14;
                        }
                        m10499N0("Expected name");
                        throw null;
                    }
                    if (i22 == 5) {
                        m10499N0("Expected name");
                        throw null;
                    }
                    c5608e.readByte();
                    this.f32254i = 2;
                    return 2;
                }
                if (i22 == 4) {
                    iArr[i21 - 1] = 5;
                    int iM10542p4 = m10542p1(true);
                    c5608e.readByte();
                    if (iM10542p4 != 58) {
                        if (iM10542p4 != 61) {
                            m10499N0("Expected ':'");
                            throw null;
                        }
                        m10536Q0();
                        if (interfaceC5610g.mo11929E0(1L) && c5608e.m11930G(0L) == 62) {
                            c5608e.readByte();
                        }
                    }
                } else if (i22 == 6) {
                    iArr[i21 - 1] = 7;
                    i10 = 0;
                } else if (i22 == 7) {
                    i10 = 0;
                    if (m10542p1(false) == -1) {
                        this.f32254i = 18;
                        return 18;
                    }
                    m10536Q0();
                } else {
                    i10 = 0;
                    if (i22 == 9) {
                        throw null;
                    }
                    if (i22 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM10542p1 = m10542p1(true);
                if (iM10542p1 != 34) {
                    c5608e.readByte();
                    this.f32254i = 9;
                    return 9;
                }
                if (iM10542p1 != 39) {
                    m10536Q0();
                    c5608e.readByte();
                    this.f32254i = 8;
                    return 8;
                }
                if (iM10542p1 != 44 && iM10542p1 != 59) {
                    if (iM10542p1 != 91) {
                        c5608e.readByte();
                        this.f32254i = 3;
                        return 3;
                    }
                    if (iM10542p1 != 93) {
                        if (iM10542p1 != 123) {
                            c5608e.readByte();
                            this.f32254i = 1;
                            return 1;
                        }
                        bM11930G = c5608e.m11930G(0L);
                        if (bM11930G != 116 || bM11930G == 84) {
                            i11 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bM11930G != 102 && bM11930G != 70) {
                                if (bM11930G != 110 && bM11930G != 78) {
                                    i11 = i10;
                                    break;
                                }
                                i11 = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i11 != 0) {
                                    return i11;
                                }
                                i14 = i10;
                                i15 = i14;
                                int i23 = i15;
                                i16 = 1;
                                long j10 = 0;
                                while (true) {
                                    i17 = i14 + 1;
                                    if (interfaceC5610g.mo11929E0(i17)) {
                                        bM11930G2 = c5608e.m11930G(i14);
                                        if (bM11930G2 != 43) {
                                            if (bM11930G2 != 69 || bM11930G2 == 101) {
                                                if (i15 != 2 || i15 == 4) {
                                                    i15 = 5;
                                                    i14 = i17;
                                                } else {
                                                    i19 = i10;
                                                }
                                            } else if (bM11930G2 == 45) {
                                                i20 = 6;
                                                if (i15 == 0) {
                                                    i15 = 1;
                                                    i23 = 1;
                                                } else {
                                                    if (i15 != 5) {
                                                        i19 = i10;
                                                    }
                                                    i15 = i20;
                                                }
                                                i14 = i17;
                                            } else if (bM11930G2 != 46) {
                                                if (bM11930G2 >= 48 && bM11930G2 <= 57) {
                                                    if (i15 == 1 || i15 == 0) {
                                                        j10 = -(bM11930G2 - 48);
                                                        i15 = 2;
                                                    } else if (i15 == 2) {
                                                        if (j10 != 0) {
                                                            long j11 = (10 * j10) - ((long) (bM11930G2 - 48));
                                                            i16 = ((j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10) & i16;
                                                            j10 = j11;
                                                        }
                                                    } else if (i15 == 3) {
                                                        i15 = 4;
                                                    } else if (i15 == 5 || i15 == 6) {
                                                        i15 = 7;
                                                    }
                                                    i14 = i17;
                                                } else if (!m10540d1(bM11930G2)) {
                                                }
                                                i19 = i10;
                                            } else if (i15 == 2) {
                                                i15 = 3;
                                                i14 = i17;
                                            } else {
                                                i19 = i10;
                                            }
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (m10540d1(c5608e.m11930G(0L))) {
                                                m10499N0("Expected value");
                                                throw null;
                                            }
                                            m10536Q0();
                                            this.f32254i = 10;
                                            return 10;
                                        }
                                        i20 = 6;
                                        if (i15 != 5) {
                                            i19 = i10;
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (m10540d1(c5608e.m11930G(0L))) {
                                                m10499N0("Expected value");
                                                throw null;
                                            }
                                            m10536Q0();
                                            this.f32254i = 10;
                                            return 10;
                                        }
                                        i15 = i20;
                                        i14 = i17;
                                    }
                                    if (i15 == 2) {
                                        if (i16 != 0 || ((j10 == Long.MIN_VALUE && i23 == 0) || (j10 == 0 && i23 != 0))) {
                                            i18 = 2;
                                        } else {
                                            if (i23 == 0) {
                                                j10 = -j10;
                                            }
                                            this.f32255j = j10;
                                            c5608e.skip(i14);
                                            i19 = 16;
                                            this.f32254i = 16;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (m10540d1(c5608e.m11930G(0L))) {
                                            m10499N0("Expected value");
                                            throw null;
                                        }
                                        m10536Q0();
                                        this.f32254i = 10;
                                        return 10;
                                    }
                                    i18 = 2;
                                    if (i15 != i18 || i15 == 4 || i15 == 7) {
                                        this.f32256k = i14;
                                        i19 = 17;
                                        this.f32254i = 17;
                                    } else {
                                        i19 = i10;
                                    }
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m10540d1(c5608e.m11930G(0L))) {
                                        m10499N0("Expected value");
                                        throw null;
                                    }
                                    m10536Q0();
                                    this.f32254i = 10;
                                    return 10;
                                }
                            }
                            i11 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i12 = 1;
                        while (true) {
                            if (i12 >= length) {
                                if (interfaceC5610g.mo11929E0(length + 1) || !m10540d1(c5608e.m11930G(length))) {
                                    c5608e.skip(length);
                                    this.f32254i = i11;
                                    break;
                                }
                            } else {
                                i13 = i12 + 1;
                                if (!interfaceC5610g.mo11929E0(i13) && ((cM11930G = c5608e.m11930G(i12)) == str2.charAt(i12) || cM11930G == str.charAt(i12))) {
                                    i12 = i13;
                                }
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        i14 = i10;
                        i15 = i14;
                        int i24 = i15;
                        i16 = 1;
                        long j12 = 0;
                        while (true) {
                            i17 = i14 + 1;
                            if (interfaceC5610g.mo11929E0(i17)) {
                                bM11930G2 = c5608e.m11930G(i14);
                                if (bM11930G2 != 43) {
                                    if (bM11930G2 != 69) {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i14 = i17;
                                    } else {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i14 = i17;
                                    }
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m10540d1(c5608e.m11930G(0L))) {
                                        m10499N0("Expected value");
                                        throw null;
                                    }
                                    m10536Q0();
                                    this.f32254i = 10;
                                    return 10;
                                }
                                i20 = 6;
                                if (i15 != 5) {
                                    i19 = i10;
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (m10540d1(c5608e.m11930G(0L))) {
                                        m10499N0("Expected value");
                                        throw null;
                                    }
                                    m10536Q0();
                                    this.f32254i = 10;
                                    return 10;
                                }
                                i15 = i20;
                                i14 = i17;
                            }
                            if (i15 == 2) {
                                if (i16 != 0) {
                                }
                                i18 = 2;
                            } else {
                                i18 = 2;
                            }
                            if (i15 != i18) {
                            }
                            this.f32256k = i14;
                            i19 = 17;
                            this.f32254i = 17;
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m10540d1(c5608e.m11930G(0L))) {
                                m10499N0("Expected value");
                                throw null;
                            }
                            m10536Q0();
                            this.f32254i = 10;
                            return 10;
                        }
                    }
                    if (i22 == 1) {
                        c5608e.readByte();
                        this.f32254i = 4;
                        return 4;
                    }
                }
                if (i22 == 1 && i22 != 2) {
                    m10499N0("Unexpected value");
                    throw null;
                }
                m10536Q0();
                this.f32254i = 7;
                return 7;
            }
            int iM10542p5 = m10542p1(true);
            c5608e.readByte();
            if (iM10542p5 != 44) {
                if (iM10542p5 != 59) {
                    if (iM10542p5 == 93) {
                        this.f32254i = 4;
                        return 4;
                    }
                    m10499N0("Unterminated array");
                    throw null;
                }
                m10536Q0();
            }
        }
        i10 = 0;
        iM10542p1 = m10542p1(true);
        if (iM10542p1 != 34) {
            c5608e.readByte();
            this.f32254i = 9;
            return 9;
        }
        if (iM10542p1 != 39) {
            m10536Q0();
            c5608e.readByte();
            this.f32254i = 8;
            return 8;
        }
        if (iM10542p1 != 44) {
            if (iM10542p1 != 91) {
                c5608e.readByte();
                this.f32254i = 3;
                return 3;
            }
            if (iM10542p1 != 93) {
                if (iM10542p1 != 123) {
                    c5608e.readByte();
                    this.f32254i = 1;
                    return 1;
                }
                bM11930G = c5608e.m11930G(0L);
                if (bM11930G != 116) {
                    i11 = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i12 = 1;
                    while (true) {
                        if (i12 >= length) {
                            if (interfaceC5610g.mo11929E0(length + 1)) {
                            }
                            c5608e.skip(length);
                            this.f32254i = i11;
                            break;
                        }
                        i13 = i12 + 1;
                        if (!interfaceC5610g.mo11929E0(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    i14 = i10;
                    i15 = i14;
                    int i25 = i15;
                    i16 = 1;
                    long j13 = 0;
                    while (true) {
                        i17 = i14 + 1;
                        if (interfaceC5610g.mo11929E0(i17)) {
                            bM11930G2 = c5608e.m11930G(i14);
                            if (bM11930G2 != 43) {
                                if (bM11930G2 != 69) {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i14 = i17;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i14 = i17;
                                }
                                if (i19 != 0) {
                                    return i19;
                                }
                                if (m10540d1(c5608e.m11930G(0L))) {
                                    m10499N0("Expected value");
                                    throw null;
                                }
                                m10536Q0();
                                this.f32254i = 10;
                                return 10;
                            }
                            i20 = 6;
                            if (i15 != 5) {
                                i19 = i10;
                                if (i19 != 0) {
                                    return i19;
                                }
                                if (m10540d1(c5608e.m11930G(0L))) {
                                    m10499N0("Expected value");
                                    throw null;
                                }
                                m10536Q0();
                                this.f32254i = 10;
                                return 10;
                            }
                            i15 = i20;
                            i14 = i17;
                        }
                        if (i15 == 2) {
                            if (i16 != 0) {
                            }
                            i18 = 2;
                        } else {
                            i18 = 2;
                        }
                        if (i15 != i18) {
                        }
                        this.f32256k = i14;
                        i19 = 17;
                        this.f32254i = 17;
                        if (i19 != 0) {
                            return i19;
                        }
                        if (m10540d1(c5608e.m11930G(0L))) {
                            m10499N0("Expected value");
                            throw null;
                        }
                        m10536Q0();
                        this.f32254i = 10;
                        return 10;
                    }
                }
                i11 = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (interfaceC5610g.mo11929E0(length + 1)) {
                        }
                        c5608e.skip(length);
                        this.f32254i = i11;
                        break;
                    }
                    i13 = i12 + 1;
                    if (!interfaceC5610g.mo11929E0(i13)) {
                        i12 = i13;
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                i14 = i10;
                i15 = i14;
                int i26 = i15;
                i16 = 1;
                long j14 = 0;
                while (true) {
                    i17 = i14 + 1;
                    if (interfaceC5610g.mo11929E0(i17)) {
                        bM11930G2 = c5608e.m11930G(i14);
                        if (bM11930G2 != 43) {
                            if (bM11930G2 != 69) {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i14 = i17;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i14 = i17;
                            }
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m10540d1(c5608e.m11930G(0L))) {
                                m10499N0("Expected value");
                                throw null;
                            }
                            m10536Q0();
                            this.f32254i = 10;
                            return 10;
                        }
                        i20 = 6;
                        if (i15 != 5) {
                            i19 = i10;
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m10540d1(c5608e.m11930G(0L))) {
                                m10499N0("Expected value");
                                throw null;
                            }
                            m10536Q0();
                            this.f32254i = 10;
                            return 10;
                        }
                        i15 = i20;
                        i14 = i17;
                    }
                    if (i15 == 2) {
                        if (i16 != 0) {
                        }
                        i18 = 2;
                    } else {
                        i18 = 2;
                    }
                    if (i15 != i18) {
                    }
                    this.f32256k = i14;
                    i19 = 17;
                    this.f32254i = 17;
                    if (i19 != 0) {
                        return i19;
                    }
                    if (m10540d1(c5608e.m11930G(0L))) {
                        m10499N0("Expected value");
                        throw null;
                    }
                    m10536Q0();
                    this.f32254i = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                i14 = i10;
                i15 = i14;
                int i27 = i15;
                i16 = 1;
                long j15 = 0;
                while (true) {
                    i17 = i14 + 1;
                    if (interfaceC5610g.mo11929E0(i17)) {
                        bM11930G2 = c5608e.m11930G(i14);
                        if (bM11930G2 != 43) {
                            if (bM11930G2 != 69) {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i14 = i17;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i14 = i17;
                            }
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m10540d1(c5608e.m11930G(0L))) {
                                m10499N0("Expected value");
                                throw null;
                            }
                            m10536Q0();
                            this.f32254i = 10;
                            return 10;
                        }
                        i20 = 6;
                        if (i15 != 5) {
                            i19 = i10;
                            if (i19 != 0) {
                                return i19;
                            }
                            if (m10540d1(c5608e.m11930G(0L))) {
                                m10499N0("Expected value");
                                throw null;
                            }
                            m10536Q0();
                            this.f32254i = 10;
                            return 10;
                        }
                        i15 = i20;
                        i14 = i17;
                    }
                    if (i15 == 2) {
                        if (i16 != 0) {
                        }
                        i18 = 2;
                    } else {
                        i18 = 2;
                    }
                    if (i15 != i18) {
                    }
                    this.f32256k = i14;
                    i19 = 17;
                    this.f32254i = 17;
                    if (i19 != 0) {
                        return i19;
                    }
                    if (m10540d1(c5608e.m11930G(0L))) {
                        m10499N0("Expected value");
                        throw null;
                    }
                    m10536Q0();
                    this.f32254i = 10;
                    return 10;
                }
            }
            if (i22 == 1) {
                c5608e.readByte();
                this.f32254i = 4;
                return 4;
            }
        }
        if (i22 == 1) {
        }
        m10536Q0();
        this.f32254i = 7;
        return 7;
    }

    /* JADX INFO: renamed from: X0 */
    public final int m10538X0(String str, JsonReader.C4932a c4932a) {
        int length = c4932a.f32181a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(c4932a.f32181a[i10])) {
                this.f32254i = 0;
                this.f32177c[this.f32175a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: a */
    public final void mo10503a() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 3) {
            m10510s0(1);
            this.f32178d[this.f32175a - 1] = 0;
            this.f32254i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo10505d0() + " at path " + m10509r());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: b */
    public final void mo10504b() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 1) {
            m10510s0(3);
            this.f32254i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo10505d0() + " at path " + m10509r());
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final int m10539c1(String str, JsonReader.C4932a c4932a) {
        int length = c4932a.f32181a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(c4932a.f32181a[i10])) {
                this.f32254i = 0;
                int[] iArr = this.f32178d;
                int i11 = this.f32175a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32254i = 0;
        this.f32176b[0] = 8;
        this.f32175a = 1;
        this.f32253h.m11951b();
        this.f32252g.close();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: d0 */
    public final JsonReader.Token mo10505d0() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        switch (iM10537W0) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return JsonReader.Token.BOOLEAN;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Switch 'out' block B:32:0x004e for B:28:0x0042 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: d1 */
    public final boolean m10540d1(int i10) throws IOException {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 == 35) {
                m10536Q0();
            } else if (i10 != 44) {
                if (i10 == 47 || i10 == 61) {
                    m10536Q0();
                } else if (i10 != 123 && i10 != 125 && i10 != 58) {
                    if (i10 != 59) {
                        switch (i10) {
                            case 91:
                            case 93:
                                break;
                            case 92:
                                break;
                            default:
                                return true;
                        }
                    }
                    m10536Q0();
                }
            }
        }
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: l */
    public final void mo10506l() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + mo10505d0() + " at path " + m10509r());
        }
        int i10 = this.f32175a - 1;
        this.f32175a = i10;
        int[] iArr = this.f32178d;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f32254i = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l1 */
    public final String m10541l1() throws IOException {
        String strM10543q1;
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 == 14) {
            strM10543q1 = m10544r1();
        } else if (iM10537W0 == 13) {
            strM10543q1 = m10543q1(f32248I);
        } else if (iM10537W0 == 12) {
            strM10543q1 = m10543q1(f32247H);
        } else {
            if (iM10537W0 != 15) {
                throw new JsonDataException("Expected a name but was " + mo10505d0() + " at path " + m10509r());
            }
            strM10543q1 = this.f32257l;
            this.f32257l = null;
        }
        this.f32254i = 0;
        this.f32177c[this.f32175a - 1] = strM10543q1;
        return strM10543q1;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: m0 */
    public final void mo10507m0() throws IOException {
        if (mo10511w()) {
            this.f32257l = m10541l1();
            this.f32254i = 11;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p1 */
    public final int m10542p1(boolean z10) throws IOException {
        int i10;
        InterfaceC5610g interfaceC5610g;
        C5608e c5608e;
        byte bM11930G;
        while (true) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                i10 = i11 + 1;
                interfaceC5610g = this.f32252g;
                if (!interfaceC5610g.mo11929E0(i10)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                long j10 = i11;
                c5608e = this.f32253h;
                bM11930G = c5608e.m11930G(j10);
                if (bM11930G != 10 && bM11930G != 32 && bM11930G != 13) {
                    if (bM11930G == 9) {
                    }
                }
                i11 = i10;
            }
            c5608e.skip(i10 - 1);
            ByteString byteString = f32250K;
            if (bM11930G == 47) {
                if (!interfaceC5610g.mo11929E0(2L)) {
                    return bM11930G;
                }
                m10536Q0();
                byte bM11930G2 = c5608e.m11930G(1L);
                if (bM11930G2 == 42) {
                    c5608e.readByte();
                    c5608e.readByte();
                    ByteString byteString2 = f32251L;
                    long jMo11935J = interfaceC5610g.mo11935J(byteString2);
                    if (jMo11935J != -1) {
                        z11 = true;
                    }
                    c5608e.skip(z11 ? jMo11935J + ((long) byteString2.data.length) : c5608e.f34435b);
                    if (!z11) {
                        m10499N0("Unterminated comment");
                        throw null;
                    }
                } else {
                    if (bM11930G2 != 47) {
                        return bM11930G;
                    }
                    c5608e.readByte();
                    c5608e.readByte();
                    long jMo11943R = interfaceC5610g.mo11943R(byteString);
                    c5608e.skip(jMo11943R != -1 ? jMo11943R + 1 : c5608e.f34435b);
                }
            } else {
                if (bM11930G != 35) {
                    return bM11930G;
                }
                m10536Q0();
                long jMo11943R2 = interfaceC5610g.mo11943R(byteString);
                c5608e.skip(jMo11943R2 != -1 ? jMo11943R2 + 1 : c5608e.f34435b);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: q */
    public final void mo10508q() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + mo10505d0() + " at path " + m10509r());
        }
        int i10 = this.f32175a - 1;
        this.f32175a = i10;
        this.f32177c[i10] = null;
        int[] iArr = this.f32178d;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f32254i = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q1 */
    public final String m10543q1(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jMo11943R = this.f32252g.mo11943R(byteString);
            if (jMo11943R == -1) {
                m10499N0("Unterminated string");
                throw null;
            }
            C5608e c5608e = this.f32253h;
            if (c5608e.m11930G(jMo11943R) != 92) {
                if (sb2 == null) {
                    String strM11939N0 = c5608e.m11939N0(jMo11943R);
                    c5608e.readByte();
                    return strM11939N0;
                }
                sb2.append(c5608e.m11939N0(jMo11943R));
                c5608e.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c5608e.m11939N0(jMo11943R));
            c5608e.readByte();
            sb2.append(m10545t1());
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final String m10544r1() throws IOException {
        long jMo11943R = this.f32252g.mo11943R(f32249J);
        C5608e c5608e = this.f32253h;
        return jMo11943R != -1 ? c5608e.m11939N0(jMo11943R) : c5608e.m11934I0();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t1 */
    public final char m10545t1() throws IOException {
        int i10;
        int i11;
        InterfaceC5610g interfaceC5610g = this.f32252g;
        if (!interfaceC5610g.mo11929E0(1L)) {
            m10499N0("Unterminated escape sequence");
            throw null;
        }
        C5608e c5608e = this.f32253h;
        byte b10 = c5608e.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f32179e) {
                return (char) b10;
            }
            m10499N0("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!interfaceC5610g.mo11929E0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m10509r());
        }
        char c10 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bM11930G = c5608e.m11930G(i12);
            char c11 = (char) (c10 << 4);
            if (bM11930G < 48 || bM11930G > 57) {
                if (bM11930G >= 97 && bM11930G <= 102) {
                    i10 = bM11930G - 97;
                } else {
                    if (bM11930G < 65 || bM11930G > 70) {
                        m10499N0("\\u".concat(c5608e.m11939N0(4L)));
                        throw null;
                    }
                    i10 = bM11930G - 65;
                }
                i11 = i10 + 10;
            } else {
                i11 = bM11930G - 48;
            }
            c10 = (char) (i11 + c11);
        }
        c5608e.skip(4L);
        return c10;
    }

    public final String toString() {
        return "JsonReader(" + this.f32252g + ")";
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: w */
    public final boolean mo10511w() throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        return (iM10537W0 == 2 || iM10537W0 == 4 || iM10537W0 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: y0 */
    public final int mo10512y0(JsonReader.C4932a c4932a) throws IOException {
        int iM10537W0 = this.f32254i;
        if (iM10537W0 == 0) {
            iM10537W0 = m10537W0();
        }
        if (iM10537W0 >= 12 && iM10537W0 <= 15) {
            if (iM10537W0 == 15) {
                return m10538X0(this.f32257l, c4932a);
            }
            int iMo11926C0 = this.f32252g.mo11926C0(c4932a.f32182b);
            if (iMo11926C0 != -1) {
                this.f32254i = 0;
                this.f32177c[this.f32175a - 1] = c4932a.f32181a[iMo11926C0];
                return iMo11926C0;
            }
            String str = this.f32177c[this.f32175a - 1];
            String strM10541l1 = m10541l1();
            int iM10538X0 = m10538X0(strM10541l1, c4932a);
            if (iM10538X0 == -1) {
                this.f32254i = 15;
                this.f32257l = strM10541l1;
                this.f32177c[this.f32175a - 1] = str;
            }
            return iM10538X0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m10546y1(ByteString byteString) throws IOException {
        while (true) {
            long jMo11943R = this.f32252g.mo11943R(byteString);
            if (jMo11943R == -1) {
                m10499N0("Unterminated string");
                throw null;
            }
            C5608e c5608e = this.f32253h;
            if (c5608e.m11930G(jMo11943R) != 92) {
                c5608e.skip(jMo11943R + 1);
                return;
            } else {
                c5608e.skip(jMo11943R + 1);
                m10545t1();
            }
        }
    }
}
