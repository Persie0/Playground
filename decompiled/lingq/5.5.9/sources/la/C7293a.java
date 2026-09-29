package la;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.AbstractC6650k;
import p219ka.C6640a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: la.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7293a extends AbstractC7295c {

    /* JADX INFO: renamed from: h */
    public final int f40820h;

    /* JADX INFO: renamed from: i */
    public final int f40821i;

    /* JADX INFO: renamed from: j */
    public final int f40822j;

    /* JADX INFO: renamed from: n */
    public List<C6640a> f40826n;

    /* JADX INFO: renamed from: o */
    public List<C6640a> f40827o;

    /* JADX INFO: renamed from: p */
    public int f40828p;

    /* JADX INFO: renamed from: q */
    public int f40829q;

    /* JADX INFO: renamed from: r */
    public boolean f40830r;

    /* JADX INFO: renamed from: s */
    public boolean f40831s;

    /* JADX INFO: renamed from: t */
    public byte f40832t;

    /* JADX INFO: renamed from: u */
    public byte f40833u;

    /* JADX INFO: renamed from: w */
    public boolean f40835w;

    /* JADX INFO: renamed from: x */
    public long f40836x;

    /* JADX INFO: renamed from: y */
    public static final int[] f40817y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z */
    public static final int[] f40818z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A */
    public static final int[] f40811A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B */
    public static final int[] f40812B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: C */
    public static final int[] f40813C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: D */
    public static final int[] f40814D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: E */
    public static final int[] f40815E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F */
    public static final boolean[] f40816F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g */
    public final C10151t f40819g = new C10151t();

    /* JADX INFO: renamed from: l */
    public final ArrayList<a> f40824l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public a f40825m = new a(0, 4);

    /* JADX INFO: renamed from: v */
    public int f40834v = 0;

    /* JADX INFO: renamed from: k */
    public final long f40823k = 16000000;

    /* JADX INFO: renamed from: la.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ArrayList f40837a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f40838b;

        /* JADX INFO: renamed from: c */
        public final StringBuilder f40839c;

        /* JADX INFO: renamed from: d */
        public int f40840d;

        /* JADX INFO: renamed from: e */
        public int f40841e;

        /* JADX INFO: renamed from: f */
        public int f40842f;

        /* JADX INFO: renamed from: g */
        public int f40843g;

        /* JADX INFO: renamed from: h */
        public int f40844h;

        /* JADX INFO: renamed from: la.a$a$a, reason: collision with other inner class name */
        public static class C10649a {

            /* JADX INFO: renamed from: a */
            public final int f40845a;

            /* JADX INFO: renamed from: b */
            public final boolean f40846b;

            /* JADX INFO: renamed from: c */
            public int f40847c;

            public C10649a(int i10, int i11, boolean z10) {
                this.f40845a = i10;
                this.f40846b = z10;
                this.f40847c = i11;
            }
        }

        public a(int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            this.f40837a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f40838b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f40839c = sb2;
            this.f40843g = i10;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f40840d = 15;
            this.f40841e = 0;
            this.f40842f = 0;
            this.f40844h = i11;
        }

        /* JADX INFO: renamed from: a */
        public final void m14674a(char c10) {
            StringBuilder sb2 = this.f40839c;
            if (sb2.length() < 32) {
                sb2.append(c10);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m14675b() {
            C10649a c10649a;
            int i10;
            StringBuilder sb2 = this.f40839c;
            int length = sb2.length();
            if (length <= 0) {
                return;
            }
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f40837a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0 || (i10 = (c10649a = (C10649a) arrayList.get(size)).f40847c) != length) {
                    return;
                } else {
                    c10649a.f40847c = i10 - 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final C6640a m14676c(int i10) {
            float f3;
            int i11 = this.f40841e + this.f40842f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f40838b;
                if (i13 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i13);
                int i14 = C10134c0.f51354a;
                if (charSequenceSubSequence.length() > i12) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i12);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
                i13++;
            }
            SpannableString spannableStringM14677d = m14677d();
            int i15 = C10134c0.f51354a;
            int length = spannableStringM14677d.length();
            SpannableString spannableStringSubSequence = spannableStringM14677d;
            if (length > i12) {
                spannableStringSubSequence = spannableStringM14677d.subSequence(0, i12);
            }
            spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i12 - spannableStringBuilder.length();
            int i16 = i11 - length2;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f40843g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) {
                    i10 = (this.f40843g != 2 || i16 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length2;
                }
                f3 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f3 = 0.5f;
            }
            int i17 = this.f40840d;
            if (i17 > 7) {
                i17 = (i17 - 15) - 2;
            } else if (this.f40843g == 1) {
                i17 -= this.f40844h - 1;
            }
            C6640a.a aVar = new C6640a.a();
            aVar.f37671a = spannableStringBuilder;
            aVar.f37673c = Layout.Alignment.ALIGN_NORMAL;
            aVar.f37675e = i17;
            aVar.f37676f = 1;
            aVar.f37678h = f3;
            aVar.f37679i = i10;
            return aVar.m13277a();
        }

        /* JADX INFO: renamed from: d */
        public final SpannableString m14677d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40839c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList arrayList = this.f40837a;
                if (i14 >= arrayList.size()) {
                    break;
                }
                C10649a c10649a = (C10649a) arrayList.get(i14);
                boolean z11 = c10649a.f40846b;
                int i16 = c10649a.f40845a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = C7293a.f40811A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c10649a.f40847c;
                i14++;
                if (i17 != (i14 < arrayList.size() ? ((C10649a) arrayList.get(i14)).f40847c : length)) {
                    if (i10 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        if (i12 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                        }
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
            }
            if (i15 != length && i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m14678e() {
            return this.f40837a.isEmpty() && this.f40838b.isEmpty() && this.f40839c.length() == 0;
        }
    }

    public C7293a(String str, int i10) {
        this.f40820h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f40822j = 0;
            this.f40821i = 0;
        } else if (i10 == 2) {
            this.f40822j = 1;
            this.f40821i = 0;
        } else if (i10 == 3) {
            this.f40822j = 0;
            this.f40821i = 1;
        } else if (i10 != 4) {
            C10145n.m19099g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f40822j = 0;
            this.f40821i = 0;
        } else {
            this.f40822j = 1;
            this.f40821i = 1;
        }
        m14673k(0);
        m14672j();
        this.f40835w = true;
        this.f40836x = -9223372036854775807L;
    }

    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: e */
    public final C7296d mo14667e() {
        List<C6640a> list = this.f40826n;
        this.f40827o = list;
        list.getClass();
        return new C7296d(list);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6 A[FALL_THROUGH] */
    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: f */
    public final void mo14668f(AbstractC7295c.a aVar) {
        boolean z10;
        boolean z11;
        ByteBuffer byteBuffer = aVar.f12116c;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C10151t c10151t = this.f40819g;
        c10151t.m19122C(bArrArray, iLimit);
        boolean z12 = false;
        while (true) {
            int i10 = c10151t.f51440c - c10151t.f51439b;
            int i11 = this.f40820h;
            if (i10 < i11) {
                if (z12) {
                    int i12 = this.f40828p;
                    if (i12 == 1 || i12 == 3) {
                        this.f40826n = m14671i();
                        this.f40836x = this.f40901e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM19145t = i11 == 2 ? -4 : c10151t.m19145t();
            int iM19145t2 = c10151t.m19145t();
            int iM19145t3 = c10151t.m19145t();
            if ((iM19145t & 2) == 0 && (iM19145t & 1) == this.f40821i) {
                byte b10 = (byte) (iM19145t2 & 127);
                byte b11 = (byte) (iM19145t3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z13 = this.f40830r;
                    if ((iM19145t & 4) == 4) {
                        boolean[] zArr = f40816F;
                        if (zArr[iM19145t2] && zArr[iM19145t3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f40830r = z10;
                    if (z10) {
                        if (!((b10 & 240) == 16)) {
                            this.f40831s = false;
                        } else if (this.f40831s && this.f40832t == b10 && this.f40833u == b11) {
                            this.f40831s = false;
                            z11 = true;
                        } else {
                            this.f40831s = true;
                            this.f40832t = b10;
                            this.f40833u = b11;
                        }
                        z11 = false;
                    } else {
                        this.f40831s = false;
                        z11 = false;
                    }
                    if (!z11) {
                        if (z10) {
                            if (1 <= b10 && b10 <= 15) {
                                this.f40835w = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 != 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f40835w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f40835w = true;
                                            break;
                                    }
                                } else {
                                    this.f40835w = true;
                                }
                            }
                            if (this.f40835w) {
                                int i13 = b10 & 224;
                                if (i13 == 0) {
                                    this.f40834v = (b10 >> 3) & 1;
                                }
                                if (this.f40834v == this.f40822j) {
                                    if (i13 == 0) {
                                        int i14 = b10 & 247;
                                        if (i14 == 17 && (b11 & 240) == 48) {
                                            this.f40825m.m14674a((char) f40813C[b11 & 15]);
                                        } else {
                                            int i15 = b10 & 246;
                                            if (i15 == 18 && (b11 & 224) == 32) {
                                                this.f40825m.m14675b();
                                                this.f40825m.m14674a((char) ((b10 & 1) == 0 ? f40814D[b11 & 31] : f40815E[b11 & 31]));
                                            } else if (i14 == 17 && (b11 & 240) == 32) {
                                                this.f40825m.m14674a(' ');
                                                boolean z14 = (b11 & 1) == 1;
                                                a aVar2 = this.f40825m;
                                                aVar2.f40837a.add(new a.C10649a((b11 >> 1) & 7, aVar2.f40839c.length(), z14));
                                            } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                int i16 = f40817y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i16++;
                                                }
                                                a aVar3 = this.f40825m;
                                                if (i16 != aVar3.f40840d) {
                                                    if (this.f40828p != 1 && !aVar3.m14678e()) {
                                                        a aVar4 = new a(this.f40828p, this.f40829q);
                                                        this.f40825m = aVar4;
                                                        this.f40824l.add(aVar4);
                                                    }
                                                    this.f40825m.f40840d = i16;
                                                }
                                                boolean z15 = (b11 & 16) == 16;
                                                boolean z16 = (b11 & 1) == 1;
                                                int i17 = (b11 >> 1) & 7;
                                                a aVar5 = this.f40825m;
                                                aVar5.f40837a.add(new a.C10649a(z15 ? 8 : i17, aVar5.f40839c.length(), z16));
                                                if (z15) {
                                                    this.f40825m.f40841e = f40818z[i17];
                                                }
                                            } else if (i14 == 23 && b11 >= 33 && b11 <= 35) {
                                                this.f40825m.f40842f = b11 - 32;
                                            } else if (i15 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    m14673k(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            m14673k(1);
                                                            this.f40829q = 2;
                                                            this.f40825m.f40844h = 2;
                                                            break;
                                                        case 38:
                                                            m14673k(1);
                                                            this.f40829q = 3;
                                                            this.f40825m.f40844h = 3;
                                                            break;
                                                        case 39:
                                                            m14673k(1);
                                                            this.f40829q = 4;
                                                            this.f40825m.f40844h = 4;
                                                            break;
                                                        default:
                                                            int i18 = this.f40828p;
                                                            if (i18 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f40826n = Collections.emptyList();
                                                                            int i19 = this.f40828p;
                                                                            if (i19 == 1 || i19 == 3) {
                                                                                m14672j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i18 == 1 && !this.f40825m.m14678e()) {
                                                                                a aVar6 = this.f40825m;
                                                                                ArrayList arrayList = aVar6.f40838b;
                                                                                arrayList.add(aVar6.m14677d());
                                                                                aVar6.f40839c.setLength(0);
                                                                                aVar6.f40837a.clear();
                                                                                int iMin = Math.min(aVar6.f40844h, aVar6.f40840d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m14672j();
                                                                            break;
                                                                        case 47:
                                                                            this.f40826n = m14671i();
                                                                            m14672j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f40825m.m14675b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m14673k(3);
                                                }
                                            }
                                        }
                                    } else {
                                        a aVar7 = this.f40825m;
                                        int[] iArr = f40812B;
                                        aVar7.m14674a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f40825m.m14674a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z12 = true;
                                }
                            }
                        } else if (z13) {
                            m14672j();
                            z12 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // la.AbstractC7295c, p218k9.InterfaceC6634d
    public final void flush() {
        super.flush();
        this.f40826n = null;
        this.f40827o = null;
        m14673k(0);
        this.f40829q = 4;
        this.f40825m.f40844h = 4;
        m14672j();
        this.f40830r = false;
        this.f40831s = false;
        this.f40832t = (byte) 0;
        this.f40833u = (byte) 0;
        this.f40834v = 0;
        this.f40835w = true;
        this.f40836x = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    @Override // la.AbstractC7295c, p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: g */
    public final AbstractC6650k mo13272c() throws SubtitleDecoderException {
        boolean z10;
        AbstractC6650k abstractC6650kPollFirst;
        AbstractC6650k abstractC6650kMo13272c = super.mo13272c();
        if (abstractC6650kMo13272c != null) {
            return abstractC6650kMo13272c;
        }
        long j10 = this.f40823k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f40836x;
            if (j11 != -9223372036854775807L) {
                z10 = this.f40901e - j11 >= j10;
            }
        }
        if (!z10 || (abstractC6650kPollFirst = this.f40898b.pollFirst()) == null) {
            return null;
        }
        this.f40826n = Collections.emptyList();
        this.f40836x = -9223372036854775807L;
        abstractC6650kPollFirst.m13282q(this.f40901e, mo14667e(), Long.MAX_VALUE);
        return abstractC6650kPollFirst;
    }

    @Override // la.AbstractC7295c
    /* JADX INFO: renamed from: h */
    public final boolean mo14670h() {
        return this.f40826n != this.f40827o;
    }

    /* JADX INFO: renamed from: i */
    public final List<C6640a> m14671i() {
        ArrayList<a> arrayList = this.f40824l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C6640a c6640aM14676c = arrayList.get(i10).m14676c(Integer.MIN_VALUE);
            arrayList2.add(c6640aM14676c);
            if (c6640aM14676c != null) {
                iMin = Math.min(iMin, c6640aM14676c.f37667i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C6640a c6640aM14676c2 = (C6640a) arrayList2.get(i11);
            if (c6640aM14676c2 != null) {
                if (c6640aM14676c2.f37667i != iMin) {
                    c6640aM14676c2 = arrayList.get(i11).m14676c(iMin);
                    c6640aM14676c2.getClass();
                }
                arrayList3.add(c6640aM14676c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: j */
    public final void m14672j() {
        a aVar = this.f40825m;
        aVar.f40843g = this.f40828p;
        aVar.f40837a.clear();
        aVar.f40838b.clear();
        aVar.f40839c.setLength(0);
        aVar.f40840d = 15;
        aVar.f40841e = 0;
        aVar.f40842f = 0;
        ArrayList<a> arrayList = this.f40824l;
        arrayList.clear();
        arrayList.add(this.f40825m);
    }

    /* JADX INFO: renamed from: k */
    public final void m14673k(int i10) {
        int i11 = this.f40828p;
        if (i11 == i10) {
            return;
        }
        this.f40828p = i10;
        if (i10 != 3) {
            m14672j();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f40826n = Collections.emptyList();
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f40824l;
            if (i12 >= arrayList.size()) {
                return;
            }
            arrayList.get(i12).f40843g = i10;
            i12++;
        }
    }

    @Override // la.AbstractC7295c, p218k9.InterfaceC6634d
    public final void release() {
    }
}
