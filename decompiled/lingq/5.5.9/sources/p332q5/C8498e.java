package p332q5;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p087e6.C5373b;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: q5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8498e implements InterfaceC8494a {

    /* JADX INFO: renamed from: a */
    public int[] f45720a;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8494a.a f45722c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f45723d;

    /* JADX INFO: renamed from: e */
    public byte[] f45724e;

    /* JADX INFO: renamed from: f */
    public short[] f45725f;

    /* JADX INFO: renamed from: g */
    public byte[] f45726g;

    /* JADX INFO: renamed from: h */
    public byte[] f45727h;

    /* JADX INFO: renamed from: i */
    public byte[] f45728i;

    /* JADX INFO: renamed from: j */
    public int[] f45729j;

    /* JADX INFO: renamed from: k */
    public int f45730k;

    /* JADX INFO: renamed from: l */
    public C8496c f45731l;

    /* JADX INFO: renamed from: m */
    public Bitmap f45732m;

    /* JADX INFO: renamed from: n */
    public boolean f45733n;

    /* JADX INFO: renamed from: o */
    public int f45734o;

    /* JADX INFO: renamed from: p */
    public int f45735p;

    /* JADX INFO: renamed from: q */
    public int f45736q;

    /* JADX INFO: renamed from: r */
    public int f45737r;

    /* JADX INFO: renamed from: s */
    public Boolean f45738s;

    /* JADX INFO: renamed from: b */
    public final int[] f45721b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f45739t = Bitmap.Config.ARGB_8888;

    public C8498e(C5373b c5373b, C8496c c8496c, ByteBuffer byteBuffer, int i10) {
        this.f45722c = c5373b;
        this.f45731l = new C8496c(0);
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f45734o = 0;
                this.f45731l = c8496c;
                this.f45730k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f45723d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f45723d.order(ByteOrder.LITTLE_ENDIAN);
                this.f45733n = false;
                Iterator it = c8496c.f45707d.iterator();
                while (it.hasNext()) {
                    if (((C8495b) it.next()).f45699g == 3) {
                        this.f45733n = true;
                        break;
                    }
                }
                this.f45735p = iHighestOneBit;
                int i11 = c8496c.f45706c;
                this.f45737r = i11 / iHighestOneBit;
                int i12 = c8496c.f45710g;
                this.f45736q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                InterfaceC9451b interfaceC9451b = ((C5373b) this.f45722c).f33756b;
                this.f45728i = interfaceC9451b == null ? new byte[i13] : (byte[]) interfaceC9451b.mo17852d(i13, byte[].class);
                InterfaceC8494a.a aVar = this.f45722c;
                int i14 = this.f45737r * this.f45736q;
                InterfaceC9451b interfaceC9451b2 = ((C5373b) aVar).f33756b;
                this.f45729j = interfaceC9451b2 == null ? new int[i14] : (int[]) interfaceC9451b2.mo17852d(i14, int[].class);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo16581a() {
        return this.f45723d;
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap mo16582b() {
        if (this.f45731l.f45705b <= 0 || this.f45730k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f45731l.f45705b + ", framePointer=" + this.f45730k);
            }
            this.f45734o = 1;
        }
        int i10 = this.f45734o;
        if (i10 == 1 || i10 == 2) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, status=" + this.f45734o);
            }
            return null;
        }
        this.f45734o = 0;
        if (this.f45724e == null) {
            InterfaceC9451b interfaceC9451b = ((C5373b) this.f45722c).f33756b;
            this.f45724e = interfaceC9451b == null ? new byte[255] : (byte[]) interfaceC9451b.mo17852d(255, byte[].class);
        }
        C8495b c8495b = (C8495b) this.f45731l.f45707d.get(this.f45730k);
        int i11 = this.f45730k - 1;
        C8495b c8495b2 = i11 >= 0 ? (C8495b) this.f45731l.f45707d.get(i11) : null;
        int[] iArr = c8495b.f45703k;
        if (iArr == null) {
            iArr = this.f45731l.f45708e;
        }
        this.f45720a = iArr;
        if (iArr == null) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "No valid color table found for frame #" + this.f45730k);
            }
            this.f45734o = 1;
            return null;
        }
        if (c8495b.f45698f) {
            System.arraycopy(iArr, 0, this.f45721b, 0, iArr.length);
            int[] iArr2 = this.f45721b;
            this.f45720a = iArr2;
            iArr2[c8495b.f45700h] = 0;
            if (c8495b.f45699g == 2 && this.f45730k == 0) {
                this.f45738s = Boolean.TRUE;
            }
        }
        return m16597j(c8495b, c8495b2);
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: c */
    public final void mo16583c() {
        this.f45730k = (this.f45730k + 1) % this.f45731l.f45705b;
    }

    @Override // p332q5.InterfaceC8494a
    public final void clear() {
        InterfaceC9451b interfaceC9451b;
        this.f45731l = null;
        byte[] bArr = this.f45728i;
        InterfaceC8494a.a aVar = this.f45722c;
        if (bArr != null) {
            InterfaceC9451b interfaceC9451b2 = ((C5373b) aVar).f33756b;
            if (interfaceC9451b2 != null) {
                interfaceC9451b2.mo17851c(bArr);
            }
        }
        int[] iArr = this.f45729j;
        if (iArr != null) {
            InterfaceC9451b interfaceC9451b3 = ((C5373b) aVar).f33756b;
            if (interfaceC9451b3 != null) {
                interfaceC9451b3.mo17851c(iArr);
            }
        }
        Bitmap bitmap = this.f45732m;
        if (bitmap != null) {
            ((C5373b) aVar).f33755a.mo164d(bitmap);
        }
        this.f45732m = null;
        this.f45723d = null;
        this.f45738s = null;
        byte[] bArr2 = this.f45724e;
        if (bArr2 != null && (interfaceC9451b = ((C5373b) aVar).f33756b) != null) {
            interfaceC9451b.mo17851c(bArr2);
        }
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: d */
    public final int mo16584d() {
        return this.f45731l.f45705b;
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: e */
    public final int mo16585e() {
        int i10;
        C8496c c8496c = this.f45731l;
        int i11 = c8496c.f45705b;
        if (i11 > 0 && (i10 = this.f45730k) >= 0) {
            if (i10 < 0 || i10 >= i11) {
                return -1;
            }
            return ((C8495b) c8496c.f45707d.get(i10)).f45701i;
        }
        return 0;
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: f */
    public final int mo16586f() {
        return this.f45730k;
    }

    @Override // p332q5.InterfaceC8494a
    /* JADX INFO: renamed from: g */
    public final int mo16587g() {
        return (this.f45729j.length * 4) + this.f45723d.limit() + this.f45728i.length;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m16595h() {
        Boolean bool = this.f45738s;
        Bitmap bitmapMo17856c = ((C5373b) this.f45722c).f33755a.mo17856c(this.f45737r, this.f45736q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f45739t);
        bitmapMo17856c.setHasAlpha(true);
        return bitmapMo17856c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m16596i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f45739t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v34, types: [short] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX INFO: renamed from: j */
    public final Bitmap m16597j(C8495b c8495b, C8495b c8495b2) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        short s10;
        int i20;
        Bitmap bitmap;
        int i21;
        int[] iArr = this.f45729j;
        InterfaceC8494a.a aVar = this.f45722c;
        byte b11 = 0;
        if (c8495b2 == null) {
            Bitmap bitmap2 = this.f45732m;
            if (bitmap2 != null) {
                ((C5373b) aVar).f33755a.mo164d(bitmap2);
            }
            this.f45732m = null;
            Arrays.fill(iArr, 0);
        }
        if (c8495b2 != null && c8495b2.f45699g == 3 && this.f45732m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c8495b2 != null && (i20 = c8495b2.f45699g) > 0) {
            if (i20 == 2) {
                if (c8495b.f45698f) {
                    i21 = 0;
                } else {
                    C8496c c8496c = this.f45731l;
                    i21 = c8496c.f45713j;
                    if (c8495b.f45703k != null && c8496c.f45712i == c8495b.f45700h) {
                        i21 = 0;
                    }
                }
                int i22 = c8495b2.f45696d;
                int i23 = this.f45735p;
                int i24 = i22 / i23;
                int i25 = c8495b2.f45694b / i23;
                int i26 = c8495b2.f45695c / i23;
                int i27 = c8495b2.f45693a / i23;
                int i28 = this.f45737r;
                int i29 = (i25 * i28) + i27;
                int i30 = (i24 * i28) + i29;
                while (i29 < i30) {
                    int i31 = i29 + i26;
                    for (int i32 = i29; i32 < i31; i32++) {
                        iArr[i32] = i21;
                    }
                    i29 += this.f45737r;
                }
            } else if (i20 == 3 && (bitmap = this.f45732m) != null) {
                int i33 = this.f45737r;
                bitmap.getPixels(iArr, 0, i33, 0, 0, i33, this.f45736q);
            }
        }
        this.f45723d.position(c8495b.f45702j);
        int i34 = c8495b.f45695c * c8495b.f45696d;
        byte[] bArr = this.f45728i;
        if (bArr == null || bArr.length < i34) {
            InterfaceC9451b interfaceC9451b = ((C5373b) aVar).f33756b;
            this.f45728i = interfaceC9451b == null ? new byte[i34] : (byte[]) interfaceC9451b.mo17852d(i34, byte[].class);
        }
        byte[] bArr2 = this.f45728i;
        if (this.f45725f == null) {
            this.f45725f = new short[4096];
        }
        short[] sArr = this.f45725f;
        if (this.f45726g == null) {
            this.f45726g = new byte[4096];
        }
        byte[] bArr3 = this.f45726g;
        if (this.f45727h == null) {
            this.f45727h = new byte[4097];
        }
        byte[] bArr4 = this.f45727h;
        int i35 = this.f45723d.get() & 255;
        int i36 = 1 << i35;
        int i37 = i36 + 1;
        int i38 = i36 + 2;
        int i39 = i35 + 1;
        int i40 = (1 << i39) - 1;
        for (int i41 = 0; i41 < i36; i41++) {
            sArr[i41] = 0;
            bArr3[i41] = (byte) i41;
        }
        byte[] bArr5 = this.f45724e;
        C8498e c8498e = this;
        int i42 = i39;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = i38;
        int i52 = i40;
        int i53 = -1;
        while (true) {
            if (i43 >= i34) {
                iArr = iArr;
                b10 = b11;
                break;
            }
            if (i45 == 0) {
                int i54 = this.f45723d.get() & 255;
                if (i54 > 0) {
                    ByteBuffer byteBuffer = c8498e.f45723d;
                    byteBuffer.get(c8498e.f45724e, 0, Math.min(i54, byteBuffer.remaining()));
                }
                if (i54 <= 0) {
                    c8498e.f45734o = 3;
                    b10 = 0;
                    break;
                }
                i45 = i54;
                i46 = 0;
            } else {
                i39 = i39;
                i43 = i43;
                iArr = iArr;
                i53 = i53;
            }
            i48 += (bArr5[i46] & 255) << i47;
            i46++;
            i45--;
            int i55 = i47 + 8;
            int i56 = i51;
            int i57 = i42;
            i43 = i43;
            i53 = i53;
            byte[] bArr6 = bArr5;
            i49 = i49;
            while (true) {
                if (i55 < i57) {
                    c8498e = this;
                    break;
                }
                C8498e c8498e2 = c8498e;
                int i58 = i48 & i52;
                i48 >>= i57;
                i55 -= i57;
                if (i58 == i36) {
                    i18 = i55;
                    i56 = i38;
                    i52 = i40;
                    c8498e = c8498e2;
                    i57 = i39;
                    i53 = -1;
                    i19 = i49;
                } else {
                    if (i58 == i37) {
                        c8498e = c8498e2;
                        break;
                    }
                    i18 = i55;
                    if (i53 == -1) {
                        bArr2[i44] = bArr3[i58];
                        i44++;
                        i43++;
                        i49 = i58;
                        i53 = i49;
                        i55 = i18;
                        c8498e = this;
                    } else {
                        if (i58 >= i56) {
                            bArr4[i50] = (byte) i49;
                            i50++;
                            s10 = i53;
                        } else {
                            s10 = i58;
                        }
                        while (s10 >= i36) {
                            bArr4[i50] = bArr3[s10];
                            i50++;
                            s10 = sArr[s10];
                        }
                        int i59 = bArr3[s10] & 255;
                        byte b12 = (byte) i59;
                        bArr2[i44] = b12;
                        while (true) {
                            i44++;
                            i43++;
                            if (i50 <= 0) {
                                break;
                            }
                            i50--;
                            bArr2[i44] = bArr4[i50];
                        }
                        i19 = i59;
                        if (i56 < 4096) {
                            sArr[i56] = (short) i53;
                            bArr3[i56] = b12;
                            i56++;
                            if ((i56 & i52) == 0 && i56 < 4096) {
                                i57++;
                                i52 += i56;
                            }
                        }
                        i53 = i58;
                        c8498e = this;
                    }
                }
                i49 = i19;
                i55 = i18;
            }
            i42 = i57;
            i51 = i56;
            bArr5 = bArr6;
            i39 = i39;
            b11 = 0;
            i47 = i55;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i44, i34, b10);
        if (c8495b.f45697e || this.f45735p != 1) {
            int[] iArr2 = this.f45729j;
            int i60 = c8495b.f45696d;
            int i61 = this.f45735p;
            int i62 = i60 / i61;
            int i63 = c8495b.f45694b / i61;
            int i64 = c8495b.f45695c / i61;
            int i65 = c8495b.f45693a / i61;
            boolean z10 = this.f45730k == 0;
            int i66 = this.f45737r;
            int i67 = this.f45736q;
            byte[] bArr7 = this.f45728i;
            int[] iArr3 = this.f45720a;
            Boolean bool = this.f45738s;
            int i68 = 8;
            int i69 = 0;
            int i70 = 0;
            int i71 = 1;
            while (i69 < i62) {
                Boolean bool2 = bool;
                if (c8495b.f45697e) {
                    if (i70 >= i62) {
                        int i72 = i71 + 1;
                        i10 = i62;
                        if (i72 == 2) {
                            i70 = 4;
                        } else if (i72 == 3) {
                            i68 = 4;
                            i71 = i72;
                            i70 = 2;
                        } else if (i72 == 4) {
                            i71 = i72;
                            i70 = 1;
                            i68 = 2;
                        }
                        i71 = i72;
                    } else {
                        i10 = i62;
                    }
                    i11 = i70 + i68;
                } else {
                    i10 = i62;
                    i11 = i70;
                    i70 = i69;
                }
                int i73 = i70 + i63;
                boolean z11 = i61 == 1;
                if (i73 < i67) {
                    int i74 = i73 * i66;
                    int i75 = i74 + i65;
                    int i76 = i75 + i64;
                    int i77 = i74 + i66;
                    if (i77 < i76) {
                        i76 = i77;
                    }
                    int i78 = i69 * i61 * c8495b.f45695c;
                    if (z11) {
                        bool = bool2;
                        int i79 = i75;
                        while (true) {
                            i12 = i64;
                            if (i79 >= i76) {
                                break;
                            }
                            int i80 = iArr3[bArr7[i78] & 255];
                            if (i80 != 0) {
                                iArr2[i79] = i80;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i78 += i61;
                            i79++;
                            i64 = i12;
                        }
                    } else {
                        i12 = i64;
                        int i81 = ((i76 - i75) * i61) + i78;
                        bool = bool2;
                        int i82 = i75;
                        while (i82 < i76) {
                            int i83 = i76;
                            int i84 = c8495b.f45695c;
                            int i85 = i65;
                            int i86 = i66;
                            int i87 = i78;
                            int i88 = 0;
                            int i89 = 0;
                            int i90 = 0;
                            int i91 = 0;
                            int i92 = 0;
                            while (true) {
                                if (i87 >= this.f45735p + i78) {
                                    i16 = i67;
                                    break;
                                }
                                byte[] bArr8 = this.f45728i;
                                i16 = i67;
                                if (i87 >= bArr8.length || i87 >= i81) {
                                    break;
                                }
                                int i93 = this.f45720a[bArr8[i87] & 255];
                                if (i93 != 0) {
                                    i88 += (i93 >> 24) & 255;
                                    i89 += (i93 >> 16) & 255;
                                    i90 += (i93 >> 8) & 255;
                                    i91 += i93 & 255;
                                    i92++;
                                }
                                i87++;
                                i67 = i16;
                            }
                            int i94 = i84 + i78;
                            for (int i95 = i94; i95 < this.f45735p + i94; i95++) {
                                byte[] bArr9 = this.f45728i;
                                if (i95 >= bArr9.length || i95 >= i81) {
                                    break;
                                }
                                int i96 = this.f45720a[bArr9[i95] & 255];
                                if (i96 != 0) {
                                    i88 += (i96 >> 24) & 255;
                                    i89 += (i96 >> 16) & 255;
                                    i90 += (i96 >> 8) & 255;
                                    i91 += i96 & 255;
                                    i92++;
                                }
                            }
                            int i97 = i92 == 0 ? 0 : ((i88 / i92) << 24) | ((i89 / i92) << 16) | ((i90 / i92) << 8) | (i91 / i92);
                            if (i97 != 0) {
                                iArr2[i82] = i97;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i78 += i61;
                            i82++;
                            i76 = i83;
                            i65 = i85;
                            i66 = i86;
                            i67 = i16;
                        }
                    }
                    i13 = i65;
                    i14 = i66;
                    i15 = i67;
                } else {
                    i12 = i64;
                    i13 = i65;
                    i14 = i66;
                    i15 = i67;
                    bool = bool2;
                }
                i69++;
                i62 = i10;
                i70 = i11;
                i63 = i63;
                i64 = i12;
                i65 = i13;
                i66 = i14;
                i67 = i15;
            }
            Boolean bool3 = bool;
            if (this.f45738s == null) {
                this.f45738s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.f45729j;
            int i98 = c8495b.f45696d;
            int i99 = c8495b.f45694b;
            int i100 = c8495b.f45695c;
            int i101 = c8495b.f45693a;
            byte b13 = this.f45730k == 0 ? (byte) 1 : b10;
            int i102 = this.f45737r;
            byte[] bArr10 = this.f45728i;
            int[] iArr5 = this.f45720a;
            byte b14 = -1;
            for (int i103 = b10; i103 < i98; i103++) {
                int i104 = (i103 + i99) * i102;
                int i105 = i104 + i101;
                int i106 = i105 + i100;
                int i107 = i104 + i102;
                if (i107 < i106) {
                    i106 = i107;
                }
                int i108 = c8495b.f45695c * i103;
                while (i105 < i106) {
                    int i109 = i98;
                    byte b15 = bArr10[i108];
                    int i110 = i99;
                    int i111 = b15 & 255;
                    if (i111 != b14) {
                        int i112 = iArr5[i111];
                        if (i112 != 0) {
                            iArr4[i105] = i112;
                        } else {
                            b14 = b15;
                        }
                    }
                    i108++;
                    i105++;
                    i98 = i109;
                    i99 = i110;
                }
            }
            Boolean bool4 = this.f45738s;
            this.f45738s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.f45738s != null || b13 == 0 || b14 == -1));
        }
        if (this.f45733n && ((i17 = c8495b.f45699g) == 0 || i17 == 1)) {
            if (this.f45732m == null) {
                this.f45732m = m16595h();
            }
            Bitmap bitmap3 = this.f45732m;
            int i113 = this.f45737r;
            bitmap3.setPixels(iArr, 0, i113, 0, 0, i113, this.f45736q);
        }
        Bitmap bitmapM16595h = m16595h();
        int i114 = this.f45737r;
        bitmapM16595h.setPixels(iArr, 0, i114, 0, 0, i114, this.f45736q);
        return bitmapM16595h;
    }
}
