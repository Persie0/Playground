package p000;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class to0 extends wo0 {

    /* JADX INFO: renamed from: h */
    public final k47 f62620h = new k47();

    /* JADX INFO: renamed from: i */
    public final so0 f62621i = new so0();

    /* JADX INFO: renamed from: j */
    public int f62622j = -1;

    /* JADX INFO: renamed from: k */
    public final int f62623k;

    /* JADX INFO: renamed from: l */
    public final ro0[] f62624l;

    /* JADX INFO: renamed from: m */
    public ro0 f62625m;

    /* JADX INFO: renamed from: n */
    public List f62626n;

    /* JADX INFO: renamed from: o */
    public List f62627o;

    /* JADX INFO: renamed from: p */
    public so0 f62628p;

    /* JADX INFO: renamed from: q */
    public int f62629q;

    public to0(int i, List list) {
        this.f62623k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = m41.f50559a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f62624l = new ro0[8];
        int i2 = 0;
        while (true) {
            ro0[] ro0VarArr = this.f62624l;
            if (i2 >= 8) {
                this.f62625m = ro0VarArr[0];
                return;
            } else {
                ro0VarArr[i2] = new ro0();
                i2++;
            }
        }
    }

    @Override // p000.wo0, p000.k32
    public final void flush() {
        super.flush();
        this.f62626n = null;
        this.f62627o = null;
        this.f62629q = 0;
        this.f62625m = this.f62624l[0];
        m22253m();
        this.f62628p = null;
    }

    @Override // p000.wo0
    /* JADX INFO: renamed from: g */
    public final vj6 mo19423g() {
        List list = this.f62626n;
        this.f62627o = list;
        list.getClass();
        return new vj6(list, 7);
    }

    @Override // p000.wo0
    /* JADX INFO: renamed from: h */
    public final void mo19424h(uo0 uo0Var) {
        ByteBuffer byteBuffer = uo0Var.f50500e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        k47 k47Var = this.f62620h;
        k47Var.m14816K(iLimit, bArrArray);
        while (k47Var.m14820a() >= 3) {
            int iM14842z = k47Var.m14842z();
            int i = iM14842z & 3;
            boolean z = (iM14842z & 4) == 4;
            byte bM14842z = (byte) k47Var.m14842z();
            byte bM14842z2 = (byte) k47Var.m14842z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m22251k();
                        int i2 = (bM14842z & 192) >> 6;
                        int i3 = this.f62622j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m22253m();
                            ss5.m21707d0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f62622j + " current=" + i2);
                        }
                        this.f62622j = i2;
                        int i4 = bM14842z & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        so0 so0Var = new so0(i2, i4);
                        this.f62628p = so0Var;
                        byte[] bArr = so0Var.f61083b;
                        so0Var.f61086e = 1;
                        bArr[0] = bM14842z2;
                    } else {
                        bna.m3969q(i == 2);
                        so0 so0Var2 = this.f62628p;
                        if (so0Var2 == null) {
                            ss5.m21723u("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = so0Var2.f61083b;
                            int i5 = so0Var2.f61086e;
                            int i6 = i5 + 1;
                            so0Var2.f61086e = i6;
                            bArr2[i5] = bM14842z;
                            so0Var2.f61086e = i5 + 2;
                            bArr2[i6] = bM14842z2;
                        }
                    }
                    so0 so0Var3 = this.f62628p;
                    if (so0Var3.f61086e == (so0Var3.f61085d * 2) - 1) {
                        m22251k();
                    }
                }
            }
        }
    }

    @Override // p000.wo0
    /* JADX INFO: renamed from: j */
    public final boolean mo19426j() {
        return this.f62626n != this.f62627o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    /* JADX INFO: renamed from: k */
    public final void m22251k() {
        char c;
        boolean z;
        so0 so0Var = this.f62628p;
        if (so0Var == null) {
            return;
        }
        int i = 2;
        if (so0Var.f61086e != (so0Var.f61085d * 2) - 1) {
            ss5.m21722t("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f62628p.f61085d * 2) - 1) + ", but current index is " + this.f62628p.f61086e + " (sequence number " + this.f62628p.f61084c + ");");
        }
        so0 so0Var2 = this.f62628p;
        byte[] bArr = so0Var2.f61083b;
        int i2 = so0Var2.f61086e;
        so0 so0Var3 = this.f62621i;
        so0Var3.m21507k(i2, bArr);
        boolean z2 = false;
        while (so0Var3.m21498b() > 0) {
            int i3 = 3;
            int iM21503g = so0Var3.m21503g(3);
            int iM21503g2 = so0Var3.m21503g(5);
            if (iM21503g == 7) {
                so0Var3.m21511o(i);
                iM21503g = so0Var3.m21503g(6);
                if (iM21503g < 7) {
                    hn1.m13364n("Invalid extended service number: ", iM21503g, "Cea708Decoder");
                }
            }
            if (iM21503g2 == 0) {
                if (iM21503g != 0) {
                    ss5.m21707d0("Cea708Decoder", "serviceNumber is non-zero (" + iM21503g + ") when blockSize is 0");
                }
                if (z2) {
                    this.f62626n = m22252l();
                }
                this.f62628p = null;
            }
            if (iM21503g != this.f62623k) {
                so0Var3.m21512p(iM21503g2);
            } else {
                int iM21501e = (iM21503g2 * 8) + so0Var3.m21501e();
                while (so0Var3.m21501e() < iM21501e) {
                    int iM21503g3 = so0Var3.m21503g(8);
                    if (iM21503g3 != 16) {
                        if (iM21503g3 <= 31) {
                            if (iM21503g3 != 0) {
                                if (iM21503g3 == i3) {
                                    this.f62626n = m22252l();
                                } else if (iM21503g3 != 8) {
                                    switch (iM21503g3) {
                                        case 12:
                                            m22253m();
                                            break;
                                        case 13:
                                            this.f62625m.m20730a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iM21503g3 >= 17 && iM21503g3 <= 23) {
                                                ss5.m21707d0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM21503g3);
                                                so0Var3.m21511o(8);
                                            } else if (iM21503g3 < 24 || iM21503g3 > 31) {
                                                hn1.m13364n("Invalid C0 command: ", iM21503g3, "Cea708Decoder");
                                            } else {
                                                ss5.m21707d0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM21503g3);
                                                so0Var3.m21511o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f62625m.f59628b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iM21503g3 <= 127) {
                            ro0 ro0Var = this.f62625m;
                            if (iM21503g3 == 127) {
                                ro0Var.m20730a((char) 9835);
                            } else {
                                ro0Var.m20730a((char) (iM21503g3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iM21503g3 <= 159) {
                                ro0[] ro0VarArr = this.f62624l;
                                switch (iM21503g3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iM21503g3 - 128;
                                        if (this.f62629q != i4) {
                                            this.f62629q = i4;
                                            this.f62625m = ro0VarArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (so0Var3.m21502f()) {
                                                ro0 ro0Var2 = ro0VarArr[8 - i5];
                                                ro0Var2.f59627a.clear();
                                                ro0Var2.f59628b.clear();
                                                ro0Var2.f59641o = -1;
                                                ro0Var2.f59642p = -1;
                                                ro0Var2.f59643q = -1;
                                                ro0Var2.f59645s = -1;
                                                ro0Var2.f59647u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (so0Var3.m21502f()) {
                                                ro0VarArr[8 - i6].f59630d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (so0Var3.m21502f()) {
                                                ro0VarArr[8 - i7].f59630d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (so0Var3.m21502f()) {
                                                ro0 ro0Var3 = ro0VarArr[8 - i8];
                                                ro0Var3.f59630d = !ro0Var3.f59630d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (so0Var3.m21502f()) {
                                                ro0VarArr[8 - i9].m20732d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        so0Var3.m21511o(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        m22253m();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.f62625m.f59629c) {
                                            so0Var3.m21503g(4);
                                            so0Var3.m21503g(i10);
                                            so0Var3.m21503g(i10);
                                            boolean zM21502f = so0Var3.m21502f();
                                            boolean zM21502f2 = so0Var3.m21502f();
                                            i3 = 3;
                                            so0Var3.m21503g(3);
                                            so0Var3.m21503g(3);
                                            this.f62625m.m20733e(zM21502f, zM21502f2);
                                            z = true;
                                        } else {
                                            so0Var3.m21511o(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.f62625m.f59629c) {
                                            int iM20729c = ro0.m20729c(so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2));
                                            int iM20729c2 = ro0.m20729c(so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2));
                                            so0Var3.m21511o(2);
                                            ro0.m20729c(so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2), 0);
                                            this.f62625m.m20734f(iM20729c, iM20729c2);
                                        } else {
                                            so0Var3.m21511o(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.f62625m.f59629c) {
                                            so0Var3.m21511o(4);
                                            int iM21503g4 = so0Var3.m21503g(4);
                                            so0Var3.m21511o(2);
                                            so0Var3.m21503g(6);
                                            ro0 ro0Var4 = this.f62625m;
                                            if (ro0Var4.f59647u != iM21503g4) {
                                                ro0Var4.m20730a('\n');
                                            }
                                            ro0Var4.f59647u = iM21503g4;
                                        } else {
                                            so0Var3.m21511o(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        hn1.m13364n("Invalid C1 command: ", iM21503g3, "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.f62625m.f59629c) {
                                            int iM20729c3 = ro0.m20729c(so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2));
                                            so0Var3.m21503g(2);
                                            ro0.m20729c(so0Var3.m21503g(2), so0Var3.m21503g(2), so0Var3.m21503g(2), 0);
                                            so0Var3.m21502f();
                                            so0Var3.m21502f();
                                            so0Var3.m21503g(2);
                                            so0Var3.m21503g(2);
                                            int iM21503g5 = so0Var3.m21503g(2);
                                            so0Var3.m21511o(8);
                                            ro0 ro0Var5 = this.f62625m;
                                            ro0Var5.f59640n = iM20729c3;
                                            ro0Var5.f59637k = iM21503g5;
                                        } else {
                                            so0Var3.m21511o(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iM21503g3 - 152;
                                        ro0 ro0Var6 = ro0VarArr[i11];
                                        so0Var3.m21511o(i);
                                        boolean zM21502f3 = so0Var3.m21502f();
                                        so0Var3.m21511o(i);
                                        int iM21503g6 = so0Var3.m21503g(i3);
                                        boolean zM21502f4 = so0Var3.m21502f();
                                        int iM21503g7 = so0Var3.m21503g(7);
                                        int iM21503g8 = so0Var3.m21503g(8);
                                        int iM21503g9 = so0Var3.m21503g(4);
                                        int iM21503g10 = so0Var3.m21503g(4);
                                        so0Var3.m21511o(i);
                                        so0Var3.m21511o(6);
                                        so0Var3.m21511o(i);
                                        int iM21503g11 = so0Var3.m21503g(3);
                                        int iM21503g12 = so0Var3.m21503g(3);
                                        ArrayList arrayList = ro0Var6.f59627a;
                                        ro0Var6.f59629c = true;
                                        ro0Var6.f59630d = zM21502f3;
                                        ro0Var6.f59631e = iM21503g6;
                                        ro0Var6.f59632f = zM21502f4;
                                        ro0Var6.f59633g = iM21503g7;
                                        ro0Var6.f59634h = iM21503g8;
                                        ro0Var6.f59635i = iM21503g9;
                                        int i12 = iM21503g10 + 1;
                                        if (ro0Var6.f59636j != i12) {
                                            ro0Var6.f59636j = i12;
                                            while (true) {
                                                if (arrayList.size() >= ro0Var6.f59636j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iM21503g11 != 0 && ro0Var6.f59638l != iM21503g11) {
                                            ro0Var6.f59638l = iM21503g11;
                                            int i13 = iM21503g11 - 1;
                                            int i14 = ro0.f59618B[i13];
                                            boolean z3 = ro0.f59617A[i13];
                                            int i15 = ro0.f59625y[i13];
                                            int i16 = ro0.f59626z[i13];
                                            int i17 = ro0.f59624x[i13];
                                            ro0Var6.f59640n = i14;
                                            ro0Var6.f59637k = i17;
                                        }
                                        if (iM21503g12 != 0 && ro0Var6.f59639m != iM21503g12) {
                                            ro0Var6.f59639m = iM21503g12;
                                            int i18 = iM21503g12 - 1;
                                            int i19 = ro0.f59620D[i18];
                                            int i20 = ro0.f59619C[i18];
                                            ro0Var6.m20733e(false, false);
                                            ro0Var6.m20734f(ro0.f59622v, ro0.f59621E[i18]);
                                        }
                                        if (this.f62629q != i11) {
                                            this.f62629q = i11;
                                            this.f62625m = ro0VarArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iM21503g3 <= 255) {
                                    this.f62625m.m20730a((char) (iM21503g3 & 255));
                                } else {
                                    hn1.m13364n("Invalid base command: ", iM21503g3, "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iM21503g13 = so0Var3.m21503g(8);
                        if (iM21503g13 <= 31) {
                            c = 7;
                            if (iM21503g13 > 7) {
                                if (iM21503g13 <= 15) {
                                    so0Var3.m21511o(8);
                                } else if (iM21503g13 <= 23) {
                                    so0Var3.m21511o(16);
                                } else if (iM21503g13 <= 31) {
                                    so0Var3.m21511o(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iM21503g13 <= 127) {
                                if (iM21503g13 == 32) {
                                    this.f62625m.m20730a(' ');
                                } else if (iM21503g13 == 33) {
                                    this.f62625m.m20730a((char) 160);
                                } else if (iM21503g13 == 37) {
                                    this.f62625m.m20730a((char) 8230);
                                } else if (iM21503g13 == 42) {
                                    this.f62625m.m20730a((char) 352);
                                } else if (iM21503g13 == 44) {
                                    this.f62625m.m20730a((char) 338);
                                } else if (iM21503g13 == 63) {
                                    this.f62625m.m20730a((char) 376);
                                } else if (iM21503g13 == 57) {
                                    this.f62625m.m20730a((char) 8482);
                                } else if (iM21503g13 == 58) {
                                    this.f62625m.m20730a((char) 353);
                                } else if (iM21503g13 == 60) {
                                    this.f62625m.m20730a((char) 339);
                                } else if (iM21503g13 != 61) {
                                    switch (iM21503g13) {
                                        case eda.f37086g /* 48 */:
                                            this.f62625m.m20730a((char) 9608);
                                            break;
                                        case 49:
                                            this.f62625m.m20730a((char) 8216);
                                            break;
                                        case 50:
                                            this.f62625m.m20730a((char) 8217);
                                            break;
                                        case 51:
                                            this.f62625m.m20730a((char) 8220);
                                            break;
                                        case 52:
                                            this.f62625m.m20730a((char) 8221);
                                            break;
                                        case 53:
                                            this.f62625m.m20730a((char) 8226);
                                            break;
                                        default:
                                            switch (iM21503g13) {
                                                case 118:
                                                    this.f62625m.m20730a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f62625m.m20730a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f62625m.m20730a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f62625m.m20730a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f62625m.m20730a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f62625m.m20730a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f62625m.m20730a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f62625m.m20730a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f62625m.m20730a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f62625m.m20730a((char) 9484);
                                                    break;
                                                default:
                                                    hn1.m13364n("Invalid G2 character: ", iM21503g13, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f62625m.m20730a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iM21503g13 > 159) {
                                i = 2;
                                if (iM21503g13 <= 255) {
                                    if (iM21503g13 == 160) {
                                        this.f62625m.m20730a((char) 13252);
                                    } else {
                                        hn1.m13364n("Invalid G3 character: ", iM21503g13, "Cea708Decoder");
                                        this.f62625m.m20730a('_');
                                    }
                                    z2 = true;
                                } else {
                                    hn1.m13364n("Invalid extended command: ", iM21503g13, "Cea708Decoder");
                                }
                            } else if (iM21503g13 <= 135) {
                                so0Var3.m21511o(32);
                            } else if (iM21503g13 <= 143) {
                                so0Var3.m21511o(40);
                            } else if (iM21503g13 <= 159) {
                                i = 2;
                                so0Var3.m21511o(2);
                                so0Var3.m21511o(so0Var3.m21503g(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.f62626n = m22252l();
        }
        this.f62628p = null;
    }

    /* JADX INFO: renamed from: l */
    public final List m22252l() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            ro0[] ro0VarArr = this.f62624l;
            ro0 ro0Var = ro0VarArr[i];
            if (ro0Var.f59629c && (!ro0Var.f59627a.isEmpty() || ro0Var.f59628b.length() != 0)) {
                ro0 ro0Var2 = ro0VarArr[i];
                if (ro0Var2.f59630d) {
                    ArrayList arrayList2 = ro0Var2.f59627a;
                    qo0 qo0Var = null;
                    if (ro0Var2.f59629c && (!arrayList2.isEmpty() || ro0Var2.f59628b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) ro0Var2.m20731b());
                        int i3 = ro0Var2.f59637k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                v63.m23130h(ro0Var2.f59637k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = ro0Var2.f59632f;
                        int i4 = ro0Var2.f59634h;
                        int i5 = ro0Var2.f59633g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = ro0Var2.f59635i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = ro0Var2.f59640n;
                        qo0Var = new qo0(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != ro0.f59623w, i11, ro0Var2.f59631e);
                    }
                    if (qo0Var != null) {
                        arrayList.add(qo0Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, qo0.f58009c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((qo0) arrayList.get(i12)).f58010a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: m */
    public final void m22253m() {
        for (int i = 0; i < 8; i++) {
            this.f62624l[i].m20732d();
        }
    }
}
