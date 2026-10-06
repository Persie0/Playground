package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqd implements bpz {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f4161a;

    /* JADX INFO: renamed from: b */
    public byte[] f4162b;

    /* JADX INFO: renamed from: c */
    public byte[] f4163c;

    /* JADX INFO: renamed from: d */
    public int[] f4164d;

    /* JADX INFO: renamed from: e */
    public int f4165e;

    /* JADX INFO: renamed from: g */
    public Bitmap f4167g;

    /* JADX INFO: renamed from: h */
    public Boolean f4168h;

    /* JADX INFO: renamed from: j */
    public final dsx f4170j;

    /* JADX INFO: renamed from: k */
    private int[] f4171k;

    /* JADX INFO: renamed from: m */
    private short[] f4173m;

    /* JADX INFO: renamed from: n */
    private byte[] f4174n;

    /* JADX INFO: renamed from: o */
    private byte[] f4175o;

    /* JADX INFO: renamed from: p */
    private boolean f4176p;

    /* JADX INFO: renamed from: q */
    private int f4177q;

    /* JADX INFO: renamed from: r */
    private int f4178r;

    /* JADX INFO: renamed from: s */
    private int f4179s;

    /* JADX INFO: renamed from: t */
    private int f4180t;

    /* JADX INFO: renamed from: l */
    private final int[] f4172l = new int[256];

    /* JADX INFO: renamed from: i */
    public Bitmap.Config f4169i = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: f */
    public bqb f4166f = new bqb();

    static {
        bqd.class.getSimpleName();
    }

    public bqd(dsx dsxVar, bqb bqbVar, ByteBuffer byteBuffer, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f4170j = dsxVar;
        m2914c(bqbVar, byteBuffer, i);
    }

    /* JADX INFO: renamed from: d */
    private final int m2912d() {
        return this.f4161a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bti, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    private final Bitmap m2913e() {
        Boolean bool = this.f4168h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4169i;
        Bitmap bitmapMo3043b = this.f4170j.f12522b.mo3043b(this.f4180t, this.f4179s, config);
        bitmapMo3043b.setHasAlpha(true);
        return bitmapMo3043b;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x042e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0430 A[Catch: all -> 0x04e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:62:0x00b8, B:63:0x00ce, B:65:0x00d2, B:67:0x00d7, B:68:0x00dc, B:70:0x00e2, B:72:0x00e6, B:74:0x00f8, B:76:0x0101, B:78:0x0110, B:80:0x0114, B:83:0x011f, B:85:0x0127, B:86:0x012b, B:88:0x0131, B:89:0x0135, B:91:0x013b, B:92:0x0141, B:94:0x014f, B:95:0x0159, B:99:0x017c, B:104:0x019d, B:107:0x01a9, B:109:0x01c7, B:112:0x01d9, B:117:0x01f7, B:119:0x0208, B:122:0x0212, B:123:0x021b, B:125:0x0229, B:128:0x023a, B:132:0x0249, B:102:0x0187, B:137:0x0276, B:139:0x0281, B:142:0x0288, B:144:0x029e, B:149:0x02be, B:151:0x02c6, B:153:0x02ca, B:155:0x02ce, B:156:0x02d7, B:157:0x02e1, B:159:0x02e5, B:170:0x02f9, B:246:0x049e, B:248:0x04a2, B:252:0x04a9, B:254:0x04ad, B:255:0x04b3, B:256:0x04c6, B:163:0x02ee, B:171:0x0303, B:173:0x032a, B:176:0x0332, B:177:0x0335, B:182:0x0342, B:184:0x0347, B:186:0x034a, B:193:0x0365, B:195:0x0370, B:199:0x037e, B:198:0x0377, B:239:0x0477, B:201:0x0391, B:203:0x039d, B:204:0x03ad, B:206:0x03b5, B:209:0x03be, B:211:0x03c9, B:213:0x03e5, B:216:0x03f5, B:217:0x03f8, B:219:0x03fd, B:222:0x0404, B:224:0x040f, B:225:0x0424, B:232:0x0444, B:236:0x0452, B:235:0x044b, B:230:0x0430, B:240:0x048a, B:245:0x0498, B:244:0x0494, B:82:0x0117, B:77:0x010a, B:8:0x000e), top: B:266:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0444 A[Catch: all -> 0x04e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:62:0x00b8, B:63:0x00ce, B:65:0x00d2, B:67:0x00d7, B:68:0x00dc, B:70:0x00e2, B:72:0x00e6, B:74:0x00f8, B:76:0x0101, B:78:0x0110, B:80:0x0114, B:83:0x011f, B:85:0x0127, B:86:0x012b, B:88:0x0131, B:89:0x0135, B:91:0x013b, B:92:0x0141, B:94:0x014f, B:95:0x0159, B:99:0x017c, B:104:0x019d, B:107:0x01a9, B:109:0x01c7, B:112:0x01d9, B:117:0x01f7, B:119:0x0208, B:122:0x0212, B:123:0x021b, B:125:0x0229, B:128:0x023a, B:132:0x0249, B:102:0x0187, B:137:0x0276, B:139:0x0281, B:142:0x0288, B:144:0x029e, B:149:0x02be, B:151:0x02c6, B:153:0x02ca, B:155:0x02ce, B:156:0x02d7, B:157:0x02e1, B:159:0x02e5, B:170:0x02f9, B:246:0x049e, B:248:0x04a2, B:252:0x04a9, B:254:0x04ad, B:255:0x04b3, B:256:0x04c6, B:163:0x02ee, B:171:0x0303, B:173:0x032a, B:176:0x0332, B:177:0x0335, B:182:0x0342, B:184:0x0347, B:186:0x034a, B:193:0x0365, B:195:0x0370, B:199:0x037e, B:198:0x0377, B:239:0x0477, B:201:0x0391, B:203:0x039d, B:204:0x03ad, B:206:0x03b5, B:209:0x03be, B:211:0x03c9, B:213:0x03e5, B:216:0x03f5, B:217:0x03f8, B:219:0x03fd, B:222:0x0404, B:224:0x040f, B:225:0x0424, B:232:0x0444, B:236:0x0452, B:235:0x044b, B:230:0x0430, B:240:0x048a, B:245:0x0498, B:244:0x0494, B:82:0x0117, B:77:0x010a, B:8:0x000e), top: B:266:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x0447  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v27, types: [short] */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // p000.bpz
    /* JADX INFO: renamed from: a */
    public final synchronized Bitmap mo2903a() {
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        short s;
        int i13;
        Bitmap bitmap;
        int i14;
        if (this.f4166f.f4146c <= 0 || this.f4165e < 0) {
            this.f4177q = 1;
        }
        int i15 = this.f4177q;
        if (i15 != 1 && i15 != 2) {
            this.f4177q = 0;
            if (this.f4162b == null) {
                this.f4162b = this.f4170j.m6710y(255);
            }
            bqa bqaVar = (bqa) this.f4166f.f4148e.get(this.f4165e);
            int i16 = this.f4165e - 1;
            bqa bqaVar2 = i16 >= 0 ? (bqa) this.f4166f.f4148e.get(i16) : null;
            int[] iArr2 = bqaVar.f4143k;
            if (iArr2 == null) {
                iArr2 = this.f4166f.f4144a;
            }
            this.f4171k = iArr2;
            if (iArr2 == null) {
                this.f4177q = 1;
                return null;
            }
            if (bqaVar.f4138f) {
                System.arraycopy(iArr2, 0, this.f4172l, 0, 256);
                int[] iArr3 = this.f4172l;
                this.f4171k = iArr3;
                iArr3[bqaVar.f4140h] = 0;
                if (bqaVar.f4139g == 2 && this.f4165e == 0) {
                    this.f4168h = true;
                }
            }
            int[] iArr4 = this.f4164d;
            if (bqaVar2 == null) {
                Bitmap bitmap2 = this.f4167g;
                if (bitmap2 != null) {
                    this.f4170j.m6708w(bitmap2);
                }
                this.f4167g = null;
                Arrays.fill(iArr4, 0);
            }
            if (bqaVar2 != null && bqaVar2.f4139g == 3 && this.f4167g == null) {
                Arrays.fill(iArr4, 0);
            }
            if (bqaVar2 != null && (i13 = bqaVar2.f4139g) > 0) {
                if (i13 == 2) {
                    if (bqaVar.f4138f) {
                        i14 = 0;
                    } else {
                        bqb bqbVar = this.f4166f;
                        i14 = bqbVar.f4155l;
                        if (bqaVar.f4143k != null && bqbVar.f4153j == bqaVar.f4140h) {
                            i14 = 0;
                        }
                    }
                    int i17 = bqaVar2.f4136d;
                    int i18 = this.f4178r;
                    int i19 = i17 / i18;
                    int i20 = bqaVar2.f4134b / i18;
                    int i21 = bqaVar2.f4135c / i18;
                    int i22 = bqaVar2.f4133a / i18;
                    int i23 = this.f4180t;
                    int i24 = (i20 * i23) + i22;
                    int i25 = i19 * i23;
                    int i26 = i24;
                    while (i26 < i24 + i25) {
                        int i27 = i26 + i21;
                        for (int i28 = i26; i28 < i27; i28++) {
                            iArr4[i28] = i14;
                        }
                        i26 += this.f4180t;
                    }
                } else if (i13 == 3 && (bitmap = this.f4167g) != null) {
                    int i29 = this.f4180t;
                    bitmap.getPixels(iArr4, 0, i29, 0, 0, i29, this.f4179s);
                }
            }
            if (bqaVar != null) {
                this.f4161a.position(bqaVar.f4142j);
            }
            if (bqaVar == null) {
                bqb bqbVar2 = this.f4166f;
                i = bqbVar2.f4149f * bqbVar2.f4150g;
            } else {
                i = bqaVar.f4136d * bqaVar.f4135c;
            }
            byte[] bArr = this.f4163c;
            if (bArr == null || bArr.length < i) {
                this.f4163c = this.f4170j.m6710y(i);
            }
            byte[] bArr2 = this.f4163c;
            if (this.f4173m == null) {
                this.f4173m = new short[4096];
            }
            short[] sArr = this.f4173m;
            if (this.f4174n == null) {
                this.f4174n = new byte[4096];
            }
            byte[] bArr3 = this.f4174n;
            if (this.f4175o == null) {
                this.f4175o = new byte[4097];
            }
            byte[] bArr4 = this.f4175o;
            int iM2912d = m2912d();
            int i30 = 1 << iM2912d;
            int i31 = iM2912d + 1;
            int i32 = 1 << i31;
            for (int i33 = 0; i33 < i30; i33++) {
                sArr[i33] = 0;
                bArr3[i33] = (byte) i33;
            }
            int i34 = i32 - 1;
            int i35 = i30 + 2;
            byte[] bArr5 = this.f4162b;
            int i36 = i35;
            int i37 = i31;
            int i38 = i34;
            int i39 = 0;
            int i40 = -1;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            while (i39 < i) {
                if (i41 == 0) {
                    int iM2912d2 = m2912d();
                    if (iM2912d2 <= 0) {
                        i41 = 0;
                    } else {
                        ByteBuffer byteBuffer = this.f4161a;
                        i41 = iM2912d2;
                        byteBuffer.get(this.f4162b, 0, Math.min(iM2912d2, byteBuffer.remaining()));
                    }
                    if (i41 <= 0) {
                        this.f4177q = 3;
                        break;
                    }
                    i44 = 0;
                } else {
                    i35 = i35;
                }
                i43 += (bArr5[i44] & 255) << i42;
                i44++;
                i41--;
                i40 = i40;
                int i48 = i42 + 8;
                i36 = i36;
                i37 = i37;
                bArr5 = bArr5;
                i46 = i46;
                while (true) {
                    if (i48 < i37) {
                        i31 = i31;
                        i42 = i48;
                        break;
                    }
                    int i49 = i31;
                    int i50 = i43 & i38;
                    i43 >>= i37;
                    i48 -= i37;
                    if (i50 == i30) {
                        i38 = i34;
                        i37 = i49;
                        i31 = i37;
                        i36 = i35;
                        i40 = -1;
                    } else {
                        if (i50 == i30 + 1) {
                            i31 = i49;
                            i42 = i48;
                            break;
                        }
                        if (i40 == -1) {
                            bArr2[i45] = bArr3[i50];
                            i39++;
                            i45++;
                            i40 = i50;
                            i46 = i40;
                            i31 = i49;
                            i48 = i48;
                        } else {
                            if (i50 >= i36) {
                                bArr4[i47] = (byte) i46;
                                i47++;
                                s = i40;
                            } else {
                                s = i50;
                            }
                            while (s >= i30) {
                                bArr4[i47] = bArr3[s];
                                s = sArr[s];
                                i47++;
                            }
                            int i51 = bArr3[s] & 255;
                            byte b = (byte) i51;
                            bArr2[i45] = b;
                            i39++;
                            i45++;
                            while (i47 > 0) {
                                i47--;
                                bArr2[i45] = bArr4[i47];
                                i39++;
                                i45++;
                            }
                            if (i36 < 4096) {
                                sArr[i36] = (short) i40;
                                bArr3[i36] = b;
                                i36++;
                                if ((i36 & i38) == 0 && i36 < 4096) {
                                    i38 += i36;
                                    i37++;
                                }
                            }
                            i40 = i50;
                            i31 = i49;
                            i48 = i48;
                            i46 = i51;
                        }
                    }
                }
            }
            Arrays.fill(bArr2, i45, i, (byte) 0);
            if (bqaVar.f4137e || this.f4178r != 1) {
                int[] iArr5 = this.f4164d;
                int i52 = bqaVar.f4136d;
                int i53 = this.f4178r;
                int i54 = i52 / i53;
                int i55 = bqaVar.f4134b / i53;
                int i56 = bqaVar.f4135c / i53;
                int i57 = bqaVar.f4133a / i53;
                int i58 = this.f4165e;
                int i59 = this.f4180t;
                int i60 = this.f4179s;
                byte[] bArr6 = this.f4163c;
                int[] iArr6 = this.f4171k;
                iArr = iArr4;
                Boolean bool = this.f4168h;
                int i61 = 0;
                int i62 = 0;
                int i63 = 1;
                int i64 = 8;
                while (i62 < i54) {
                    Boolean bool2 = bool;
                    if (bqaVar.f4137e) {
                        if (i61 >= i54) {
                            i63++;
                            switch (i63) {
                                case 2:
                                    i61 = 4;
                                    break;
                                case 3:
                                    i61 = 2;
                                    i64 = 4;
                                    break;
                                case 4:
                                    i61 = 1;
                                    i64 = 2;
                                    break;
                            }
                        }
                        i2 = i61 + i64;
                    } else {
                        i2 = i61;
                        i61 = i62;
                    }
                    int i65 = i61 + i55;
                    if (i65 < i60) {
                        int i66 = i65 * i59;
                        int i67 = i66 + i57;
                        i3 = i54;
                        int i68 = i67 + i56;
                        int i69 = i66 + i59;
                        i4 = i55;
                        int i70 = i62 * i53 * bqaVar.f4135c;
                        if (i69 < i68) {
                            i68 = i69;
                        }
                        if (i53 == 1) {
                            int i71 = i67;
                            while (i71 < i68) {
                                int i72 = i56;
                                int i73 = iArr6[bArr6[i70] & 255];
                                if (i73 != 0) {
                                    iArr5[i71] = i73;
                                } else if (i58 == 0 && bool2 == null) {
                                    bool2 = true;
                                }
                                i71++;
                                i70++;
                                i56 = i72;
                            }
                            i5 = i56;
                            i6 = i57;
                            i7 = i59;
                            i8 = i60;
                        } else {
                            i5 = i56;
                            int i74 = i70 + ((i68 - i67) * i53);
                            int i75 = i67;
                            while (i75 < i68) {
                                int i76 = bqaVar.f4135c;
                                int i77 = i68;
                                int i78 = i70;
                                int i79 = 0;
                                int i80 = 0;
                                int i81 = 0;
                                int i82 = 0;
                                int i83 = 0;
                                while (true) {
                                    i9 = i57;
                                    if (i78 < i70 + this.f4178r) {
                                        byte[] bArr7 = this.f4163c;
                                        i10 = i59;
                                        if (i78 < bArr7.length && i78 < i74) {
                                            int i84 = this.f4171k[bArr7[i78] & 255];
                                            if (i84 != 0) {
                                                i79 += (i84 >> 24) & 255;
                                                i80 += (i84 >> 16) & 255;
                                                i81 += (i84 >> 8) & 255;
                                                i82 += i84 & 255;
                                                i83++;
                                            }
                                            i78++;
                                            i57 = i9;
                                            i59 = i10;
                                            i60 = i60;
                                        }
                                    } else {
                                        i10 = i59;
                                    }
                                }
                                int i85 = i70 + i76;
                                for (int i86 = i85; i86 < this.f4178r + i85; i86++) {
                                    byte[] bArr8 = this.f4163c;
                                    if (i86 >= bArr8.length || i86 >= i74) {
                                        if (i83 == 0) {
                                            i11 = 0;
                                        } else {
                                            i11 = ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                                        }
                                        if (i11 != 0) {
                                            iArr5[i75] = i11;
                                        } else if (i58 != 0 && bool2 == null) {
                                            bool2 = true;
                                        }
                                        i70 += i53;
                                        i75++;
                                        i68 = i77;
                                        i57 = i9;
                                        i59 = i10;
                                        i60 = i60;
                                    } else {
                                        int i87 = this.f4171k[bArr8[i86] & 255];
                                        if (i87 != 0) {
                                            i79 += (i87 >> 24) & 255;
                                            i80 += (i87 >> 16) & 255;
                                            i81 += (i87 >> 8) & 255;
                                            i82 += i87 & 255;
                                            i83++;
                                        }
                                    }
                                }
                                if (i83 == 0) {
                                    i11 = 0;
                                } else {
                                    i11 = ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                                }
                                if (i11 != 0) {
                                    iArr5[i75] = i11;
                                } else if (i58 != 0) {
                                }
                                i70 += i53;
                                i75++;
                                i68 = i77;
                                i57 = i9;
                                i59 = i10;
                                i60 = i60;
                            }
                            i6 = i57;
                            i7 = i59;
                            i8 = i60;
                        }
                    } else {
                        i3 = i54;
                        i4 = i55;
                        i5 = i56;
                        i6 = i57;
                        i7 = i59;
                        i8 = i60;
                    }
                    i62++;
                    i61 = i2;
                    bool = bool2;
                    i54 = i3;
                    i55 = i4;
                    i56 = i5;
                    i57 = i6;
                    i59 = i7;
                    i60 = i8;
                }
                Boolean bool3 = bool;
                if (this.f4168h == null) {
                    this.f4168h = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
                }
            } else {
                int[] iArr7 = this.f4164d;
                int i88 = bqaVar.f4136d;
                int i89 = bqaVar.f4134b;
                int i90 = bqaVar.f4135c;
                int i91 = bqaVar.f4133a;
                int i92 = this.f4165e;
                int i93 = this.f4180t;
                byte[] bArr9 = this.f4163c;
                int[] iArr8 = this.f4171k;
                byte b2 = -1;
                int i94 = 0;
                while (i94 < i88) {
                    int i95 = (i94 + i89) * i93;
                    int i96 = i95 + i91;
                    int i97 = i96 + i90;
                    int i98 = i95 + i93;
                    int i99 = i88;
                    int i100 = bqaVar.f4135c * i94;
                    int i101 = i89;
                    int i102 = i96;
                    while (true) {
                        if (i102 < (i98 < i97 ? i98 : i97)) {
                            byte b3 = bArr9[i100];
                            int i103 = i97;
                            int i104 = b3 & 255;
                            if (i104 != b2) {
                                int i105 = iArr8[i104];
                                if (i105 != 0) {
                                    iArr7[i102] = i105;
                                } else {
                                    b2 = b3;
                                }
                            }
                            i102++;
                            i100++;
                            i90 = i90;
                            i97 = i103;
                        }
                    }
                    i94++;
                    i89 = i101;
                    i88 = i99;
                    i90 = i90;
                }
                Boolean bool4 = this.f4168h;
                if (bool4 == null || !bool4.booleanValue()) {
                    z = this.f4168h == null && i92 == 0 && b2 != -1;
                }
                this.f4168h = Boolean.valueOf(z);
                iArr = iArr4;
            }
            if (this.f4176p && ((i12 = bqaVar.f4139g) == 0 || i12 == 1)) {
                if (this.f4167g == null) {
                    this.f4167g = m2913e();
                }
                Bitmap bitmap3 = this.f4167g;
                int i106 = this.f4180t;
                bitmap3.setPixels(iArr, 0, i106, 0, 0, i106, this.f4179s);
            }
            Bitmap bitmapM2913e = m2913e();
            int i107 = this.f4180t;
            bitmapM2913e.setPixels(iArr, 0, i107, 0, 0, i107, this.f4179s);
            return bitmapM2913e;
        }
        return null;
    }

    @Override // p000.bpz
    /* JADX INFO: renamed from: b */
    public final void mo2904b() {
        this.f4165e = (this.f4165e + 1) % this.f4166f.f4146c;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [btg, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m2914c(bqb bqbVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f4177q = 0;
            this.f4166f = bqbVar;
            this.f4165e = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4161a = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f4161a.order(ByteOrder.LITTLE_ENDIAN);
            this.f4176p = false;
            Iterator it = bqbVar.f4148e.iterator();
            while (it.hasNext()) {
                if (((bqa) it.next()).f4139g == 3) {
                    this.f4176p = true;
                    break;
                }
            }
            this.f4178r = iHighestOneBit;
            int i2 = bqbVar.f4149f;
            this.f4180t = i2 / iHighestOneBit;
            int i3 = bqbVar.f4150g;
            this.f4179s = i3 / iHighestOneBit;
            this.f4163c = this.f4170j.m6710y(i2 * i3);
            this.f4164d = (int[]) this.f4170j.f12521a.mo3034a(this.f4180t * this.f4179s, int[].class);
        } catch (Throwable th) {
            throw th;
        }
    }
}
