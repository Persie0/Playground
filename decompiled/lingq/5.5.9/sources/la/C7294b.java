package la;

import android.graphics.Color;
import android.support.v4.media.C0141b;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.kochava.tracker.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p357r6.C8739a;
import p404u2.C9384d;
import p479xa.C10129a;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: la.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7294b extends AbstractC7295c {

    /* JADX INFO: renamed from: g */
    public final C10151t f40848g = new C10151t();

    /* JADX INFO: renamed from: h */
    public final C8739a f40849h = new C8739a();

    /* JADX INFO: renamed from: i */
    public int f40850i = -1;

    /* JADX INFO: renamed from: j */
    public final int f40851j;

    /* JADX INFO: renamed from: k */
    public final b[] f40852k;

    /* JADX INFO: renamed from: l */
    public b f40853l;

    /* JADX INFO: renamed from: m */
    public List<C6640a> f40854m;

    /* JADX INFO: renamed from: n */
    public List<C6640a> f40855n;

    /* JADX INFO: renamed from: o */
    public c f40856o;

    /* JADX INFO: renamed from: p */
    public int f40857p;

    /* JADX INFO: renamed from: la.b$a */
    public static final class a {

        /* JADX INFO: renamed from: c */
        public static final C9384d f40858c = new C9384d(1);

        /* JADX INFO: renamed from: a */
        public final C6640a f40859a;

        /* JADX INFO: renamed from: b */
        public final int f40860b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f3, int i10, float f10, int i11, boolean z10, int i12, int i13) {
            C6640a.a aVar = new C6640a.a();
            aVar.f37671a = spannableStringBuilder;
            aVar.f37673c = alignment;
            aVar.f37675e = f3;
            aVar.f37676f = 0;
            aVar.f37677g = i10;
            aVar.f37678h = f10;
            aVar.f37679i = i11;
            aVar.f37682l = -3.4028235E38f;
            if (z10) {
                aVar.f37685o = i12;
                aVar.f37684n = true;
            }
            this.f40859a = aVar.m13277a();
            this.f40860b = i13;
        }
    }

    /* JADX INFO: renamed from: la.b$b */
    public static final class b {

        /* JADX INFO: renamed from: A */
        public static final int[] f40861A;

        /* JADX INFO: renamed from: B */
        public static final boolean[] f40862B;

        /* JADX INFO: renamed from: C */
        public static final int[] f40863C;

        /* JADX INFO: renamed from: D */
        public static final int[] f40864D;

        /* JADX INFO: renamed from: E */
        public static final int[] f40865E;

        /* JADX INFO: renamed from: F */
        public static final int[] f40866F;

        /* JADX INFO: renamed from: w */
        public static final int f40867w = m14682c(2, 2, 2, 0);

        /* JADX INFO: renamed from: x */
        public static final int f40868x;

        /* JADX INFO: renamed from: y */
        public static final int[] f40869y;

        /* JADX INFO: renamed from: z */
        public static final int[] f40870z;

        /* JADX INFO: renamed from: a */
        public final ArrayList f40871a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f40872b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f40873c;

        /* JADX INFO: renamed from: d */
        public boolean f40874d;

        /* JADX INFO: renamed from: e */
        public int f40875e;

        /* JADX INFO: renamed from: f */
        public boolean f40876f;

        /* JADX INFO: renamed from: g */
        public int f40877g;

        /* JADX INFO: renamed from: h */
        public int f40878h;

        /* JADX INFO: renamed from: i */
        public int f40879i;

        /* JADX INFO: renamed from: j */
        public int f40880j;

        /* JADX INFO: renamed from: k */
        public boolean f40881k;

        /* JADX INFO: renamed from: l */
        public int f40882l;

        /* JADX INFO: renamed from: m */
        public int f40883m;

        /* JADX INFO: renamed from: n */
        public int f40884n;

        /* JADX INFO: renamed from: o */
        public int f40885o;

        /* JADX INFO: renamed from: p */
        public int f40886p;

        /* JADX INFO: renamed from: q */
        public int f40887q;

        /* JADX INFO: renamed from: r */
        public int f40888r;

        /* JADX INFO: renamed from: s */
        public int f40889s;

        /* JADX INFO: renamed from: t */
        public int f40890t;

        /* JADX INFO: renamed from: u */
        public int f40891u;

        /* JADX INFO: renamed from: v */
        public int f40892v;

        static {
            int iM14682c = m14682c(0, 0, 0, 0);
            f40868x = iM14682c;
            int iM14682c2 = m14682c(0, 0, 0, 3);
            f40869y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f40870z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f40861A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f40862B = new boolean[]{false, false, false, true, true, true, false};
            f40863C = new int[]{iM14682c, iM14682c2, iM14682c, iM14682c, iM14682c2, iM14682c, iM14682c};
            f40864D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f40865E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f40866F = new int[]{iM14682c, iM14682c, iM14682c, iM14682c, iM14682c, iM14682c2, iM14682c2};
        }

        public b() {
            m14685d();
        }

        /* JADX INFO: renamed from: c */
        public static int m14682c(int i10, int i11, int i12, int i13) {
            int i14;
            C10129a.m18991c(i10, 4);
            C10129a.m18991c(i11, 4);
            C10129a.m18991c(i12, 4);
            C10129a.m18991c(i13, 4);
            if (i13 != 0 && i13 != 1) {
                if (i13 != 2) {
                    i14 = i13 != 3 ? 255 : 0;
                } else {
                    i14 = 127;
                }
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m14683a(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f40872b;
            if (c10 == '\n') {
                ArrayList arrayList = this.f40871a;
                arrayList.add(m14684b());
                spannableStringBuilder.clear();
                if (this.f40886p != -1) {
                    this.f40886p = 0;
                }
                if (this.f40887q != -1) {
                    this.f40887q = 0;
                }
                if (this.f40888r != -1) {
                    this.f40888r = 0;
                }
                if (this.f40890t != -1) {
                    this.f40890t = 0;
                }
                while (true) {
                    if (!this.f40881k || arrayList.size() < this.f40880j) {
                        if (arrayList.size() < 15) {
                            break;
                        }
                    }
                    arrayList.remove(0);
                }
            } else {
                spannableStringBuilder.append(c10);
            }
        }

        /* JADX INFO: renamed from: b */
        public final SpannableString m14684b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40872b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f40886p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f40886p, length, 33);
                }
                if (this.f40887q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f40887q, length, 33);
                }
                if (this.f40888r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f40889s), this.f40888r, length, 33);
                }
                if (this.f40890t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f40891u), this.f40890t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: d */
        public final void m14685d() {
            this.f40871a.clear();
            this.f40872b.clear();
            this.f40886p = -1;
            this.f40887q = -1;
            this.f40888r = -1;
            this.f40890t = -1;
            this.f40892v = 0;
            this.f40873c = false;
            this.f40874d = false;
            this.f40875e = 4;
            this.f40876f = false;
            this.f40877g = 0;
            this.f40878h = 0;
            this.f40879i = 0;
            this.f40880j = 15;
            this.f40881k = true;
            this.f40882l = 0;
            this.f40883m = 0;
            this.f40884n = 0;
            int i10 = f40868x;
            this.f40885o = i10;
            this.f40889s = f40867w;
            this.f40891u = i10;
        }

        /* JADX INFO: renamed from: e */
        public final void m14686e(boolean z10, boolean z11) {
            int i10 = this.f40886p;
            SpannableStringBuilder spannableStringBuilder = this.f40872b;
            if (i10 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f40886p, spannableStringBuilder.length(), 33);
                    this.f40886p = -1;
                }
            } else if (z10) {
                this.f40886p = spannableStringBuilder.length();
            }
            if (this.f40887q != -1) {
                if (!z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f40887q, spannableStringBuilder.length(), 33);
                    this.f40887q = -1;
                }
            } else if (z11) {
                this.f40887q = spannableStringBuilder.length();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m14687f(int i10, int i11) {
            int i12 = this.f40888r;
            SpannableStringBuilder spannableStringBuilder = this.f40872b;
            if (i12 != -1 && this.f40889s != i10) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f40889s), this.f40888r, spannableStringBuilder.length(), 33);
            }
            if (i10 != f40867w) {
                this.f40888r = spannableStringBuilder.length();
                this.f40889s = i10;
            }
            if (this.f40890t != -1 && this.f40891u != i11) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f40891u), this.f40890t, spannableStringBuilder.length(), 33);
            }
            if (i11 != f40868x) {
                this.f40890t = spannableStringBuilder.length();
                this.f40891u = i11;
            }
        }
    }

    /* JADX INFO: renamed from: la.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f40893a;

        /* JADX INFO: renamed from: b */
        public final int f40894b;

        /* JADX INFO: renamed from: c */
        public final byte[] f40895c;

        /* JADX INFO: renamed from: d */
        public int f40896d = 0;

        public c(int i10, int i11) {
            this.f40893a = i10;
            this.f40894b = i11;
            this.f40895c = new byte[(i11 * 2) - 1];
        }
    }

    public C7294b(int i10, List<byte[]> list) {
        this.f40851j = i10 == -1 ? 1 : i10;
        if (list != null) {
            if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            }
        }
        this.f40852k = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f40852k[i11] = new b();
        }
        this.f40853l = this.f40852k[0];
    }

    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: e */
    public final C7296d mo14667e() {
        List<C6640a> list = this.f40854m;
        this.f40855n = list;
        list.getClass();
        return new C7296d(list);
    }

    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: f */
    public final void mo14668f(AbstractC7295c.a aVar) {
        ByteBuffer byteBuffer = aVar.f12116c;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C10151t c10151t = this.f40848g;
        c10151t.m19122C(bArrArray, iLimit);
        while (c10151t.f51440c - c10151t.f51439b >= 3) {
            int iM19145t = c10151t.m19145t() & 7;
            int i10 = iM19145t & 3;
            boolean z10 = (iM19145t & 4) == 4;
            byte bM19145t = (byte) c10151t.m19145t();
            byte bM19145t2 = (byte) c10151t.m19145t();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        m14679i();
                        int i11 = (bM19145t & 192) >> 6;
                        int i12 = this.f40850i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m14681k();
                            C10145n.m19099g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f40850i + " current=" + i11);
                        }
                        this.f40850i = i11;
                        int i13 = bM19145t & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f40856o = cVar;
                        int i14 = cVar.f40896d;
                        cVar.f40896d = i14 + 1;
                        cVar.f40895c[i14] = bM19145t2;
                    } else {
                        C10129a.m18990b(i10 == 2);
                        c cVar2 = this.f40856o;
                        if (cVar2 == null) {
                            C10145n.m19095c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i15 = cVar2.f40896d;
                            int i16 = i15 + 1;
                            byte[] bArr = cVar2.f40895c;
                            bArr[i15] = bM19145t;
                            cVar2.f40896d = i16 + 1;
                            bArr[i16] = bM19145t2;
                        }
                    }
                    c cVar3 = this.f40856o;
                    if (cVar3.f40896d == (cVar3.f40894b * 2) - 1) {
                        m14679i();
                    }
                }
            }
        }
    }

    @Override // la.AbstractC7295c, p218k9.InterfaceC6634d
    public final void flush() {
        super.flush();
        this.f40854m = null;
        this.f40855n = null;
        this.f40857p = 0;
        this.f40853l = this.f40852k[0];
        m14681k();
        this.f40856o = null;
    }

    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: h */
    public final boolean mo14670h() {
        return this.f40854m != this.f40855n;
    }

    /* JADX WARN: Code duplicated, block: B:225:0x05ad  */
    /* JADX INFO: renamed from: i */
    public final void m14679i() {
        int i10;
        String str;
        c cVar = this.f40856o;
        if (cVar == null) {
            return;
        }
        int i11 = 2;
        String str2 = "Cea708Decoder";
        if (cVar.f40896d != (cVar.f40894b * 2) - 1) {
            StringBuilder sb2 = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.f40856o.f40894b * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.f40856o.f40896d);
            sb2.append(" (sequence number ");
            sb2.append(this.f40856o.f40893a);
            sb2.append(");");
            C10145n.m19094b("Cea708Decoder", sb2.toString());
        }
        c cVar2 = this.f40856o;
        byte[] bArr = cVar2.f40895c;
        int i12 = cVar2.f40896d;
        C8739a c8739a = this.f40849h;
        c8739a.m16973j(bArr, i12);
        boolean z10 = false;
        while (c8739a.m16965b() > 0) {
            int i13 = 3;
            int iM16970g = c8739a.m16970g(3);
            int iM16970g2 = c8739a.m16970g(5);
            if (iM16970g == 7) {
                c8739a.m16976m(i11);
                iM16970g = c8739a.m16970g(6);
                if (iM16970g < 7) {
                    C0141b.m620p("Invalid extended service number: ", iM16970g, str2);
                }
            }
            if (iM16970g2 == 0) {
                if (iM16970g != 0) {
                    C10145n.m19099g(str2, "serviceNumber is non-zero (" + iM16970g + ") when blockSize is 0");
                }
                if (z10) {
                    this.f40854m = m14680j();
                }
                this.f40856o = null;
            }
            if (iM16970g != this.f40851j) {
                c8739a.m16977n(iM16970g2);
            } else {
                int iM16968e = (iM16970g2 * 8) + c8739a.m16968e();
                while (c8739a.m16968e() < iM16968e) {
                    int iM16970g3 = c8739a.m16970g(8);
                    if (iM16970g3 != 16) {
                        if (iM16970g3 <= 31) {
                            if (iM16970g3 != 0) {
                                if (iM16970g3 == i13) {
                                    this.f40854m = m14680j();
                                } else if (iM16970g3 != 8) {
                                    switch (iM16970g3) {
                                        case 12:
                                            m14681k();
                                            break;
                                        case 13:
                                            this.f40853l.m14683a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iM16970g3 >= 17 && iM16970g3 <= 23) {
                                                C10145n.m19099g(str2, "Currently unsupported COMMAND_EXT1 Command: " + iM16970g3);
                                                c8739a.m16976m(8);
                                            } else if (iM16970g3 < 24 || iM16970g3 > 31) {
                                                C0141b.m620p("Invalid C0 command: ", iM16970g3, str2);
                                            } else {
                                                C10145n.m19099g(str2, "Currently unsupported COMMAND_P16 Command: " + iM16970g3);
                                                c8739a.m16976m(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f40853l.f40872b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iM16970g3 <= 127) {
                            if (iM16970g3 == 127) {
                                this.f40853l.m14683a((char) 9835);
                            } else {
                                this.f40853l.m14683a((char) (iM16970g3 & 255));
                            }
                            z10 = true;
                        } else {
                            if (iM16970g3 <= 159) {
                                b[] bVarArr = this.f40852k;
                                switch (iM16970g3) {
                                    case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        str = str2;
                                        i10 = iM16968e;
                                        z10 = true;
                                        int i14 = iM16970g3 - 128;
                                        if (this.f40857p != i14) {
                                            this.f40857p = i14;
                                            this.f40853l = bVarArr[i14];
                                        }
                                        str2 = str;
                                        break;
                                    case 136:
                                        str = str2;
                                        i10 = iM16968e;
                                        z10 = true;
                                        for (int i15 = 1; i15 <= 8; i15++) {
                                            if (c8739a.m16969f()) {
                                                b bVar = bVarArr[8 - i15];
                                                bVar.f40871a.clear();
                                                bVar.f40872b.clear();
                                                bVar.f40886p = -1;
                                                bVar.f40887q = -1;
                                                bVar.f40888r = -1;
                                                bVar.f40890t = -1;
                                                bVar.f40892v = 0;
                                            }
                                        }
                                        str2 = str;
                                        break;
                                    case 137:
                                        str = str2;
                                        i10 = iM16968e;
                                        for (int i16 = 1; i16 <= 8; i16++) {
                                            if (c8739a.m16969f()) {
                                                bVarArr[8 - i16].f40874d = true;
                                            }
                                        }
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 138:
                                        str = str2;
                                        i10 = iM16968e;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (c8739a.m16969f()) {
                                                bVarArr[8 - i17].f40874d = false;
                                            }
                                        }
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 139:
                                        str = str2;
                                        i10 = iM16968e;
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (c8739a.m16969f()) {
                                                b bVar2 = bVarArr[8 - i18];
                                                bVar2.f40874d = !bVar2.f40874d;
                                            }
                                        }
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 140:
                                        str = str2;
                                        i10 = iM16968e;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (c8739a.m16969f()) {
                                                bVarArr[8 - i19].m14685d();
                                            }
                                        }
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 141:
                                        str = str2;
                                        i10 = iM16968e;
                                        c8739a.m16976m(8);
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 142:
                                        str = str2;
                                        i10 = iM16968e;
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 143:
                                        str = str2;
                                        i10 = iM16968e;
                                        m14681k();
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 144:
                                        str = str2;
                                        i10 = iM16968e;
                                        if (this.f40853l.f40873c) {
                                            c8739a.m16970g(4);
                                            c8739a.m16970g(2);
                                            c8739a.m16970g(2);
                                            boolean zM16969f = c8739a.m16969f();
                                            boolean zM16969f2 = c8739a.m16969f();
                                            c8739a.m16970g(3);
                                            c8739a.m16970g(3);
                                            this.f40853l.m14686e(zM16969f, zM16969f2);
                                            i13 = 3;
                                        } else {
                                            c8739a.m16976m(16);
                                            i13 = 3;
                                        }
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 145:
                                        str = str2;
                                        i10 = iM16968e;
                                        if (this.f40853l.f40873c) {
                                            int iM14682c = b.m14682c(c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2));
                                            int iM14682c2 = b.m14682c(c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2));
                                            c8739a.m16976m(2);
                                            b.m14682c(c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2), 0);
                                            this.f40853l.m14687f(iM14682c, iM14682c2);
                                        } else {
                                            c8739a.m16976m(24);
                                        }
                                        i13 = 3;
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 146:
                                        str = str2;
                                        i10 = iM16968e;
                                        if (this.f40853l.f40873c) {
                                            c8739a.m16976m(4);
                                            int iM16970g4 = c8739a.m16970g(4);
                                            c8739a.m16976m(2);
                                            c8739a.m16970g(6);
                                            b bVar3 = this.f40853l;
                                            if (bVar3.f40892v != iM16970g4) {
                                                bVar3.m14683a('\n');
                                            }
                                            bVar3.f40892v = iM16970g4;
                                        } else {
                                            c8739a.m16976m(16);
                                        }
                                        i13 = 3;
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        i10 = iM16968e;
                                        z10 = true;
                                        C0141b.m620p("Invalid C1 command: ", iM16970g3, str2);
                                        break;
                                    case 151:
                                        str = str2;
                                        i10 = iM16968e;
                                        if (this.f40853l.f40873c) {
                                            int iM14682c3 = b.m14682c(c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2));
                                            c8739a.m16970g(2);
                                            b.m14682c(c8739a.m16970g(2), c8739a.m16970g(2), c8739a.m16970g(2), 0);
                                            c8739a.m16969f();
                                            c8739a.m16969f();
                                            c8739a.m16970g(2);
                                            c8739a.m16970g(2);
                                            int iM16970g5 = c8739a.m16970g(2);
                                            c8739a.m16976m(8);
                                            b bVar4 = this.f40853l;
                                            bVar4.f40885o = iM14682c3;
                                            bVar4.f40882l = iM16970g5;
                                        } else {
                                            c8739a.m16976m(32);
                                        }
                                        i13 = 3;
                                        z10 = true;
                                        str2 = str;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i20 = iM16970g3 - 152;
                                        b bVar5 = bVarArr[i20];
                                        c8739a.m16976m(i11);
                                        boolean zM16969f3 = c8739a.m16969f();
                                        boolean zM16969f4 = c8739a.m16969f();
                                        c8739a.m16969f();
                                        int iM16970g6 = c8739a.m16970g(i13);
                                        boolean zM16969f5 = c8739a.m16969f();
                                        int iM16970g7 = c8739a.m16970g(7);
                                        int iM16970g8 = c8739a.m16970g(8);
                                        int iM16970g9 = c8739a.m16970g(4);
                                        int iM16970g10 = c8739a.m16970g(4);
                                        c8739a.m16976m(i11);
                                        i10 = iM16968e;
                                        c8739a.m16970g(6);
                                        c8739a.m16976m(i11);
                                        int iM16970g11 = c8739a.m16970g(3);
                                        int iM16970g12 = c8739a.m16970g(3);
                                        str = str2;
                                        bVar5.f40873c = true;
                                        bVar5.f40874d = zM16969f3;
                                        bVar5.f40881k = zM16969f4;
                                        bVar5.f40875e = iM16970g6;
                                        bVar5.f40876f = zM16969f5;
                                        bVar5.f40877g = iM16970g7;
                                        bVar5.f40878h = iM16970g8;
                                        bVar5.f40879i = iM16970g9;
                                        int i21 = iM16970g10 + 1;
                                        if (bVar5.f40880j != i21) {
                                            bVar5.f40880j = i21;
                                            while (true) {
                                                ArrayList arrayList = bVar5.f40871a;
                                                if ((zM16969f4 && arrayList.size() >= bVar5.f40880j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iM16970g11 != 0 && bVar5.f40883m != iM16970g11) {
                                            bVar5.f40883m = iM16970g11;
                                            int i22 = iM16970g11 - 1;
                                            int i23 = b.f40863C[i22];
                                            boolean z11 = b.f40862B[i22];
                                            int i24 = b.f40870z[i22];
                                            int i25 = b.f40861A[i22];
                                            int i26 = b.f40869y[i22];
                                            bVar5.f40885o = i23;
                                            bVar5.f40882l = i26;
                                        }
                                        if (iM16970g12 != 0 && bVar5.f40884n != iM16970g12) {
                                            bVar5.f40884n = iM16970g12;
                                            int i27 = iM16970g12 - 1;
                                            int i28 = b.f40865E[i27];
                                            int i29 = b.f40864D[i27];
                                            bVar5.m14686e(false, false);
                                            bVar5.m14687f(b.f40867w, b.f40866F[i27]);
                                        }
                                        if (this.f40857p != i20) {
                                            this.f40857p = i20;
                                            this.f40853l = bVarArr[i20];
                                        }
                                        i13 = 3;
                                        z10 = true;
                                        str2 = str;
                                        break;
                                }
                            } else {
                                i10 = iM16968e;
                                if (iM16970g3 <= 255) {
                                    this.f40853l.m14683a((char) (iM16970g3 & 255));
                                    z10 = true;
                                } else {
                                    C0141b.m620p("Invalid base command: ", iM16970g3, str2);
                                }
                            }
                            i11 = 2;
                        }
                        i10 = iM16968e;
                    } else {
                        i10 = iM16968e;
                        int iM16970g13 = c8739a.m16970g(8);
                        if (iM16970g13 <= 31) {
                            if (iM16970g13 > 7) {
                                if (iM16970g13 <= 15) {
                                    c8739a.m16976m(8);
                                } else if (iM16970g13 <= 23) {
                                    c8739a.m16976m(16);
                                } else if (iM16970g13 <= 31) {
                                    c8739a.m16976m(24);
                                }
                            }
                        } else if (iM16970g13 <= 127) {
                            if (iM16970g13 == 32) {
                                this.f40853l.m14683a(' ');
                            } else if (iM16970g13 == 33) {
                                this.f40853l.m14683a((char) 160);
                            } else if (iM16970g13 == 37) {
                                this.f40853l.m14683a((char) 8230);
                            } else if (iM16970g13 == 42) {
                                this.f40853l.m14683a((char) 352);
                            } else if (iM16970g13 == 44) {
                                this.f40853l.m14683a((char) 338);
                            } else if (iM16970g13 == 63) {
                                this.f40853l.m14683a((char) 376);
                            } else if (iM16970g13 == 57) {
                                this.f40853l.m14683a((char) 8482);
                            } else if (iM16970g13 == 58) {
                                this.f40853l.m14683a((char) 353);
                            } else if (iM16970g13 == 60) {
                                this.f40853l.m14683a((char) 339);
                            } else if (iM16970g13 != 61) {
                                switch (iM16970g13) {
                                    case 48:
                                        this.f40853l.m14683a((char) 9608);
                                        break;
                                    case 49:
                                        this.f40853l.m14683a((char) 8216);
                                        break;
                                    case 50:
                                        this.f40853l.m14683a((char) 8217);
                                        break;
                                    case 51:
                                        this.f40853l.m14683a((char) 8220);
                                        break;
                                    case 52:
                                        this.f40853l.m14683a((char) 8221);
                                        break;
                                    case 53:
                                        this.f40853l.m14683a((char) 8226);
                                        break;
                                    default:
                                        switch (iM16970g13) {
                                            case 118:
                                                this.f40853l.m14683a((char) 8539);
                                                break;
                                            case 119:
                                                this.f40853l.m14683a((char) 8540);
                                                break;
                                            case 120:
                                                this.f40853l.m14683a((char) 8541);
                                                break;
                                            case 121:
                                                this.f40853l.m14683a((char) 8542);
                                                break;
                                            case 122:
                                                this.f40853l.m14683a((char) 9474);
                                                break;
                                            case 123:
                                                this.f40853l.m14683a((char) 9488);
                                                break;
                                            case 124:
                                                this.f40853l.m14683a((char) 9492);
                                                break;
                                            case 125:
                                                this.f40853l.m14683a((char) 9472);
                                                break;
                                            case 126:
                                                this.f40853l.m14683a((char) 9496);
                                                break;
                                            case 127:
                                                this.f40853l.m14683a((char) 9484);
                                                break;
                                            default:
                                                C0141b.m620p("Invalid G2 character: ", iM16970g13, str2);
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                this.f40853l.m14683a((char) 8480);
                            }
                            z10 = true;
                        } else if (iM16970g13 > 159) {
                            if (iM16970g13 <= 255) {
                                if (iM16970g13 == 160) {
                                    this.f40853l.m14683a((char) 13252);
                                } else {
                                    C0141b.m620p("Invalid G3 character: ", iM16970g13, str2);
                                    this.f40853l.m14683a('_');
                                }
                                z10 = true;
                            } else {
                                C0141b.m620p("Invalid extended command: ", iM16970g13, str2);
                            }
                            i11 = 2;
                        } else if (iM16970g13 <= 135) {
                            c8739a.m16976m(32);
                        } else if (iM16970g13 <= 143) {
                            c8739a.m16976m(40);
                        } else if (iM16970g13 <= 159) {
                            i11 = 2;
                            c8739a.m16976m(2);
                            c8739a.m16976m(c8739a.m16970g(6) * 8);
                        }
                        i11 = 2;
                    }
                    iM16968e = i10;
                }
            }
        }
        if (z10) {
            this.f40854m = m14680j();
        }
        this.f40856o = null;
    }

    /* JADX INFO: renamed from: j */
    public final List<C6640a> m14680j() {
        Layout.Alignment alignment;
        float f3;
        float f10;
        a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            b[] bVarArr = this.f40852k;
            b bVar = bVarArr[i10];
            if (!(!bVar.f40873c || (bVar.f40871a.isEmpty() && bVar.f40872b.length() == 0))) {
                b bVar2 = bVarArr[i10];
                if (bVar2.f40874d) {
                    boolean z10 = bVar2.f40873c;
                    ArrayList arrayList2 = bVar2.f40871a;
                    if (!z10 || (arrayList2.isEmpty() && bVar2.f40872b.length() == 0)) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) bVar2.m14684b());
                        int i12 = bVar2.f40882l;
                        if (i12 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i12 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + bVar2.f40882l);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (bVar2.f40876f) {
                            f3 = bVar2.f40878h / 99.0f;
                            f10 = bVar2.f40877g / 99.0f;
                        } else {
                            f3 = bVar2.f40878h / 209.0f;
                            f10 = bVar2.f40877g / 74.0f;
                        }
                        float f11 = (f3 * 0.9f) + 0.05f;
                        float f12 = (f10 * 0.9f) + 0.05f;
                        int i13 = bVar2.f40879i;
                        int i14 = i13 / 3;
                        int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                        int i16 = i13 % 3;
                        int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                        int i18 = bVar2.f40885o;
                        aVar = new a(spannableStringBuilder, alignment2, f12, i15, f11, i17, i18 != b.f40868x, i18, bVar2.f40875e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.f40858c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((a) arrayList.get(i19)).f40859a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: k */
    public final void m14681k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f40852k[i10].m14685d();
        }
    }
}
