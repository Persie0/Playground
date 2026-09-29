package p393t6;

import android.graphics.Bitmap;
import android.util.Log;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p332q5.C8496c;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9211a {

    /* JADX INFO: renamed from: a */
    public int[] f47782a;

    /* JADX INFO: renamed from: b */
    public final a f47783b;

    /* JADX INFO: renamed from: c */
    public byte[] f47784c;

    /* JADX INFO: renamed from: d */
    public int f47785d;

    /* JADX INFO: renamed from: e */
    public int f47786e;

    /* JADX INFO: renamed from: f */
    public int f47787f;

    /* JADX INFO: renamed from: g */
    public C8496c f47788g;

    /* JADX INFO: renamed from: h */
    public boolean f47789h;

    /* JADX INFO: renamed from: i */
    public int f47790i;

    /* JADX INFO: renamed from: j */
    public byte[] f47791j;

    /* JADX INFO: renamed from: k */
    public int[] f47792k;

    /* JADX INFO: renamed from: l */
    public C9213c f47793l;

    /* JADX INFO: renamed from: m */
    public final int[] f47794m;

    /* JADX INFO: renamed from: n */
    public byte[] f47795n;

    /* JADX INFO: renamed from: o */
    public short[] f47796o;

    /* JADX INFO: renamed from: p */
    public Bitmap f47797p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f47798q;

    /* JADX INFO: renamed from: r */
    public int f47799r;

    /* JADX INFO: renamed from: s */
    public boolean f47800s;

    /* JADX INFO: renamed from: t */
    public int f47801t;

    /* JADX INFO: renamed from: u */
    public byte[] f47802u;

    /* JADX INFO: renamed from: v */
    public byte[] f47803v;

    /* JADX INFO: renamed from: w */
    public int f47804w;

    /* JADX INFO: renamed from: x */
    public int f47805x;

    /* JADX INFO: renamed from: t6.a$a */
    public interface a {
    }

    public C9211a() {
        C9214d c9214d = new C9214d();
        this.f47794m = new int[256];
        this.f47804w = 0;
        this.f47805x = 0;
        this.f47783b = c9214d;
        this.f47788g = new C8496c(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m17548a(int[] iArr, C9212b c9212b, int i10) {
        int i11 = c9212b.f47813h;
        int i12 = this.f47799r;
        int i13 = i11 / i12;
        int i14 = c9212b.f47811f / i12;
        int i15 = c9212b.f47812g / i12;
        int i16 = c9212b.f47810e / i12;
        int i17 = this.f47786e;
        int i18 = (i14 * i17) + i16;
        int i19 = (i13 * i17) + i18;
        while (i18 < i19) {
            int i20 = i18 + i15;
            for (int i21 = i18; i21 < i20; i21++) {
                iArr[i21] = i10;
            }
            i18 += this.f47786e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m17549b() {
        Bitmap.Config config = this.f47789h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        int i10 = this.f47786e;
        int i11 = this.f47785d;
        ((C9214d) this.f47783b).getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        bitmapCreateBitmap.setHasAlpha(true);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized Bitmap m17550c() {
        if (this.f47788g.f45706c <= 0 || this.f47787f < 0) {
            C2181a.m6450b("a", "unable to decode frame, frameCount=" + this.f47788g.f45706c + " framePointer=" + this.f47787f);
            this.f47801t = 1;
        }
        int i10 = this.f47801t;
        if (i10 == 1 || i10 == 2) {
            C2181a.m6450b("a", "Unable to decode frame, status=" + this.f47801t);
            return null;
        }
        this.f47801t = 0;
        C9212b c9212b = (C9212b) this.f47788g.f45707d.get(this.f47787f);
        int i11 = this.f47787f - 1;
        C9212b c9212b2 = i11 >= 0 ? (C9212b) this.f47788g.f45707d.get(i11) : null;
        int[] iArr = c9212b.f47814i;
        if (iArr == null) {
            iArr = this.f47788g.f45708e;
        }
        this.f47782a = iArr;
        if (iArr == null) {
            C2181a.m6450b("a", "No Valid Color Table for frame #" + this.f47787f);
            this.f47801t = 1;
            return null;
        }
        if (c9212b.f47816k) {
            System.arraycopy(iArr, 0, this.f47794m, 0, iArr.length);
            int[] iArr2 = this.f47794m;
            this.f47782a = iArr2;
            iArr2[c9212b.f47815j] = 0;
        }
        return m17554g(c9212b, c9212b2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m17551d(byte[] bArr) {
        if (this.f47793l == null) {
            this.f47793l = new C9213c();
        }
        C9213c c9213c = this.f47793l;
        c9213c.m17561g(bArr);
        C8496c c8496cM17556b = c9213c.m17556b();
        this.f47788g = c8496cM17556b;
        if (bArr != null) {
            synchronized (this) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                synchronized (this) {
                    m17553f(c8496cM17556b, byteBufferWrap);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17552e() {
        if (this.f47805x > this.f47804w) {
            return;
        }
        if (this.f47803v == null) {
            ((C9214d) this.f47783b).getClass();
            this.f47803v = new byte[16384];
        }
        this.f47804w = 0;
        int iMin = Math.min(this.f47798q.remaining(), 16384);
        this.f47805x = iMin;
        this.f47798q.get(this.f47803v, 0, iMin);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m17553f(C8496c c8496c, ByteBuffer byteBuffer) {
        try {
            int iHighestOneBit = Integer.highestOneBit(1);
            this.f47801t = 0;
            this.f47788g = c8496c;
            this.f47789h = false;
            this.f47787f = -1;
            this.f47790i = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f47798q = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f47798q.order(ByteOrder.LITTLE_ENDIAN);
            this.f47800s = false;
            Iterator it = c8496c.f45707d.iterator();
            while (it.hasNext()) {
                if (((C9212b) it.next()).f47808c == 3) {
                    this.f47800s = true;
                    break;
                }
            }
            this.f47799r = iHighestOneBit;
            int i10 = c8496c.f45714k;
            this.f47786e = i10 / iHighestOneBit;
            int i11 = c8496c.f45711h;
            this.f47785d = i11 / iHighestOneBit;
            ((C9214d) this.f47783b).getClass();
            this.f47791j = new byte[i10 * i11];
            a aVar = this.f47783b;
            int i12 = this.f47786e * this.f47785d;
            ((C9214d) aVar).getClass();
            this.f47792k = new int[i12];
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v35, types: [short] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX INFO: renamed from: g */
    public final Bitmap m17554g(C9212b c9212b, C9212b c9212b2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        a aVar;
        int i19;
        short s10;
        int i20;
        int i21;
        int[] iArr = this.f47792k;
        if (c9212b2 == null) {
            Arrays.fill(iArr, 0);
        }
        int i22 = 1;
        if (c9212b2 != null && (i20 = c9212b2.f47808c) > 0) {
            if (i20 == 2) {
                if (!c9212b.f47816k) {
                    C8496c c8496c = this.f47788g;
                    i21 = c8496c.f45704a;
                    if (c9212b.f47814i != null && c8496c.f45705b == c9212b.f47815j) {
                    }
                    m17548a(iArr, c9212b2, i21);
                } else if (this.f47787f == 0) {
                    this.f47789h = true;
                }
                i21 = 0;
                m17548a(iArr, c9212b2, i21);
            } else if (i20 == 3) {
                Bitmap bitmap = this.f47797p;
                if (bitmap == null) {
                    m17548a(iArr, c9212b2, 0);
                } else {
                    int i23 = c9212b2.f47813h;
                    int i24 = this.f47799r;
                    int i25 = c9212b2.f47811f / i24;
                    int i26 = c9212b2.f47812g / i24;
                    int i27 = c9212b2.f47810e / i24;
                    int i28 = this.f47786e;
                    bitmap.getPixels(iArr, (i25 * i28) + i27, i28, i27, i25, i26, i23 / i24);
                }
            }
        }
        this.f47805x = 0;
        this.f47804w = 0;
        this.f47798q.position(c9212b.f47806a);
        int i29 = c9212b.f47813h * c9212b.f47812g;
        byte[] bArr = this.f47791j;
        a aVar2 = this.f47783b;
        if (bArr == null || bArr.length < i29) {
            ((C9214d) aVar2).getClass();
            this.f47791j = new byte[i29];
        }
        if (this.f47796o == null) {
            this.f47796o = new short[4096];
        }
        if (this.f47802u == null) {
            this.f47802u = new byte[4096];
        }
        if (this.f47795n == null) {
            this.f47795n = new byte[4097];
        }
        int i30 = 255;
        try {
            m17552e();
            byte[] bArr2 = this.f47803v;
            int i31 = this.f47804w;
            this.f47804w = i31 + 1;
            i10 = bArr2[i31] & 255;
        } catch (Exception unused) {
            this.f47801t = 1;
            i10 = 0;
        }
        int i32 = 1 << i10;
        int i33 = i32 + 1;
        int i34 = i32 + 2;
        int i35 = i10 + 1;
        int i36 = (1 << i35) - 1;
        for (int i37 = 0; i37 < i32; i37++) {
            this.f47796o[i37] = 0;
            this.f47802u[i37] = (byte) i37;
        }
        int i38 = i34;
        int i39 = i35;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = i36;
        int i49 = -1;
        while (i41 < i29) {
            if (i40 == 0) {
                try {
                    m17552e();
                    byte[] bArr3 = this.f47803v;
                    int i50 = this.f47804w;
                    this.f47804w = i50 + 1;
                    i18 = bArr3[i50] & i30;
                } catch (Exception unused2) {
                    this.f47801t = i22;
                    i18 = 0;
                }
                if (i18 > 0) {
                    try {
                        if (this.f47784c == null) {
                            ((C9214d) aVar2).getClass();
                            this.f47784c = new byte[i30];
                        }
                        int i51 = this.f47805x;
                        int i52 = this.f47804w;
                        int i53 = i51 - i52;
                        if (i53 >= i18) {
                            System.arraycopy(this.f47803v, i52, this.f47784c, 0, i18);
                            this.f47804w += i18;
                            aVar = aVar2;
                        } else if (this.f47798q.remaining() + i53 >= i18) {
                            aVar = aVar2;
                            try {
                                System.arraycopy(this.f47803v, this.f47804w, this.f47784c, 0, i53);
                                this.f47804w = this.f47805x;
                                m17552e();
                                int i54 = i18 - i53;
                                System.arraycopy(this.f47803v, 0, this.f47784c, i53, i54);
                                this.f47804w += i54;
                            } catch (Exception e10) {
                                e = e10;
                                if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
                                    Log.d("CleverTap:".concat("a"), "Error Reading Block", e);
                                }
                                this.f47801t = 1;
                            }
                        } else {
                            aVar = aVar2;
                            this.f47801t = 1;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        aVar = aVar2;
                    }
                } else {
                    aVar = aVar2;
                }
                if (i18 <= 0) {
                    this.f47801t = 3;
                    break;
                }
                i40 = i18;
                i43 = 0;
            } else {
                aVar = aVar2;
            }
            i45 += (this.f47784c[i43] & 255) << i44;
            i43++;
            int i55 = i40 - 1;
            int i56 = i39;
            int i57 = i49;
            int i58 = i42;
            int i59 = i44 + 8;
            while (true) {
                if (i59 < i56) {
                    i19 = i41;
                    break;
                }
                int i60 = i45 & i48;
                i45 >>= i56;
                i59 -= i56;
                if (i60 != i32) {
                    if (i60 > i38) {
                        i19 = i41;
                        this.f47801t = 3;
                    } else {
                        i19 = i41;
                        if (i60 != i33) {
                            if (i57 == -1) {
                                this.f47795n[i47] = this.f47802u[i60];
                                i47++;
                                i57 = i60;
                                i58 = i57;
                                i41 = i19;
                            } else {
                                if (i60 >= i38) {
                                    this.f47795n[i47] = (byte) i58;
                                    s10 = i57;
                                    i47++;
                                } else {
                                    s10 = i60;
                                }
                                while (s10 >= i32) {
                                    this.f47795n[i47] = this.f47802u[s10];
                                    s10 = this.f47796o[s10];
                                    i47++;
                                    i55 = i55;
                                }
                                int i61 = i55;
                                byte[] bArr4 = this.f47802u;
                                int i62 = bArr4[s10] & 255;
                                int i63 = i47 + 1;
                                int i64 = i32;
                                byte b10 = (byte) i62;
                                this.f47795n[i47] = b10;
                                if (i38 < 4096) {
                                    this.f47796o[i38] = (short) i57;
                                    bArr4[i38] = b10;
                                    i38++;
                                    if ((i38 & i48) == 0 && i38 < 4096) {
                                        i56++;
                                        i48 += i38;
                                    }
                                }
                                i47 = i63;
                                while (i47 > 0) {
                                    i47--;
                                    this.f47791j[i46] = this.f47795n[i47];
                                    i19++;
                                    i46++;
                                }
                                i58 = i62;
                                i57 = i60;
                                i41 = i19;
                                i55 = i61;
                                i32 = i64;
                            }
                        }
                    }
                    break;
                }
                i38 = i34;
                i56 = i35;
                i48 = i36;
                i57 = -1;
            }
            i49 = i57;
            i41 = i19;
            i40 = i55;
            i32 = i32;
            i30 = 255;
            i22 = 1;
            i39 = i56;
            i42 = i58;
            i44 = i59;
            aVar2 = aVar;
        }
        for (int i65 = i46; i65 < i29; i65++) {
            this.f47791j[i65] = 0;
        }
        int i66 = c9212b.f47813h;
        int i67 = this.f47799r;
        int i68 = i66 / i67;
        int i69 = c9212b.f47811f / i67;
        int i70 = c9212b.f47812g / i67;
        int i71 = c9212b.f47810e / i67;
        boolean z10 = this.f47787f == 0;
        int i72 = 0;
        int i73 = 0;
        int i74 = 8;
        int i75 = 1;
        while (i72 < i68) {
            if (c9212b.f47809d) {
                if (i73 >= i68) {
                    i75++;
                    if (i75 == 2) {
                        i73 = 4;
                    } else if (i75 == 3) {
                        i74 = 4;
                        i73 = 2;
                    } else if (i75 == 4) {
                        i74 = 2;
                        i73 = 1;
                    }
                }
                i12 = i73 + i74;
            } else {
                i12 = i73;
                i73 = i72;
            }
            int i76 = i73 + i69;
            if (i76 < this.f47785d) {
                int i77 = this.f47786e;
                int i78 = i76 * i77;
                int i79 = i78 + i71;
                int i80 = i79 + i70;
                int i81 = i78 + i77;
                if (i81 < i80) {
                    i80 = i81;
                }
                int i82 = this.f47799r;
                int i83 = i72 * i82 * c9212b.f47812g;
                int i84 = ((i80 - i79) * i82) + i83;
                int i85 = i79;
                while (i85 < i80) {
                    int i86 = i68;
                    int i87 = i69;
                    if (this.f47799r == 1) {
                        i17 = this.f47782a[this.f47791j[i83] & 255];
                        i13 = i70;
                        i14 = i71;
                        i15 = i75;
                        i16 = i74;
                    } else {
                        int i88 = c9212b.f47812g;
                        i13 = i70;
                        i14 = i71;
                        int i89 = i83;
                        int i90 = 0;
                        int i91 = 0;
                        int i92 = 0;
                        int i93 = 0;
                        int i94 = 0;
                        while (true) {
                            if (i89 >= this.f47799r + i83) {
                                i15 = i75;
                                break;
                            }
                            byte[] bArr5 = this.f47791j;
                            i15 = i75;
                            if (i89 >= bArr5.length || i89 >= i84) {
                                break;
                            }
                            int i95 = this.f47782a[bArr5[i89] & 255];
                            if (i95 != 0) {
                                i90 += (i95 >> 24) & 255;
                                i91 += (i95 >> 16) & 255;
                                i92 += (i95 >> 8) & 255;
                                i93 += i95 & 255;
                                i94++;
                            }
                            i89++;
                            i75 = i15;
                            i74 = i74;
                        }
                        i16 = i74;
                        int i96 = i88 + i83;
                        for (int i97 = i96; i97 < this.f47799r + i96; i97++) {
                            byte[] bArr6 = this.f47791j;
                            if (i97 >= bArr6.length || i97 >= i84) {
                                break;
                            }
                            int i98 = this.f47782a[bArr6[i97] & 255];
                            if (i98 != 0) {
                                i90 += (i98 >> 24) & 255;
                                i91 += (i98 >> 16) & 255;
                                i92 += (i98 >> 8) & 255;
                                i93 += i98 & 255;
                                i94++;
                            }
                        }
                        i17 = i94 == 0 ? 0 : ((i90 / i94) << 24) | ((i91 / i94) << 16) | ((i92 / i94) << 8) | (i93 / i94);
                    }
                    if (i17 != 0) {
                        iArr[i85] = i17;
                    } else if (!this.f47789h && z10) {
                        this.f47789h = true;
                    }
                    i83 += this.f47799r;
                    i85++;
                    i68 = i86;
                    i69 = i87;
                    i70 = i13;
                    i71 = i14;
                    i75 = i15;
                    i74 = i16;
                }
            }
            i72++;
            i68 = i68;
            i73 = i12;
            i69 = i69;
            i70 = i70;
            i71 = i71;
            i75 = i75;
            i74 = i74;
        }
        if (this.f47800s && ((i11 = c9212b.f47808c) == 0 || i11 == 1)) {
            if (this.f47797p == null) {
                this.f47797p = m17549b();
            }
            Bitmap bitmap2 = this.f47797p;
            int i99 = this.f47786e;
            bitmap2.setPixels(iArr, 0, i99, 0, 0, i99, this.f47785d);
        }
        Bitmap bitmapM17549b = m17549b();
        int i100 = this.f47786e;
        bitmapM17549b.setPixels(iArr, 0, i100, 0, 0, i100, this.f47785d);
        return bitmapM17549b;
    }
}
