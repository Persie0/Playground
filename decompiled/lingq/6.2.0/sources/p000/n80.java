package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class n80 extends m80 {

    /* JADX INFO: renamed from: f */
    public static final int[] f52471f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    public int f52472c;

    /* JADX INFO: renamed from: d */
    public final int f52473d;

    /* JADX INFO: renamed from: e */
    public final int[] f52474e;

    public n80(byte[] bArr) {
        this.f50744b = bArr;
        this.f52474e = f52471f;
        this.f52472c = 0;
        this.f52473d = 0;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX INFO: renamed from: G */
    public final boolean m17278G(int i, byte[] bArr) {
        int i2 = this.f52472c;
        if (i2 == 6) {
            return false;
        }
        byte[] bArr2 = (byte[]) this.f50744b;
        int i3 = this.f52473d;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr = this.f52474e;
            if (i2 == 0) {
                while (true) {
                    int i6 = i4 + 4;
                    if (i6 > i || (i3 = (iArr[bArr[i4] & 255] << 18) | (iArr[bArr[i4 + 1] & 255] << 12) | (iArr[bArr[i4 + 2] & 255] << 6) | iArr[bArr[i4 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr2[i5 + 2] = (byte) i3;
                    bArr2[i5 + 1] = (byte) (i3 >> 8);
                    bArr2[i5] = (byte) (i3 >> 16);
                    i5 += 3;
                    i4 = i6;
                }
                if (i4 >= i) {
                    break;
                }
            }
            int i7 = i4 + 1;
            int i8 = iArr[bArr[i4] & 255];
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5 && i8 != -1) {
                                    this.f52472c = 6;
                                    return false;
                                }
                            } else if (i8 == -2) {
                                i2++;
                            } else if (i8 != -1) {
                                this.f52472c = 6;
                                return false;
                            }
                        } else if (i8 >= 0) {
                            int i9 = (i3 << 6) | i8;
                            bArr2[i5 + 2] = (byte) i9;
                            bArr2[i5 + 1] = (byte) (i9 >> 8);
                            bArr2[i5] = (byte) (i9 >> 16);
                            i5 += 3;
                            i3 = i9;
                            i2 = 0;
                        } else if (i8 == -2) {
                            bArr2[i5 + 1] = (byte) (i3 >> 2);
                            bArr2[i5] = (byte) (i3 >> 10);
                            i5 += 2;
                            i2 = 5;
                        } else if (i8 != -1) {
                            this.f52472c = 6;
                            return false;
                        }
                    } else if (i8 >= 0) {
                        i3 = (i3 << 6) | i8;
                        i2++;
                    } else if (i8 == -2) {
                        bArr2[i5] = (byte) (i3 >> 4);
                        i5++;
                        i2 = 4;
                    } else if (i8 != -1) {
                        this.f52472c = 6;
                        return false;
                    }
                } else if (i8 >= 0) {
                    i3 = (i3 << 6) | i8;
                    i2++;
                } else if (i8 != -1) {
                    this.f52472c = 6;
                    return false;
                }
            } else if (i8 >= 0) {
                i2++;
                i3 = i8;
            } else if (i8 != -1) {
                this.f52472c = 6;
                return false;
            }
            i4 = i7;
        }
        if (i2 == 1) {
            this.f52472c = 6;
            return false;
        }
        if (i2 == 2) {
            bArr2[i5] = (byte) (i3 >> 4);
            i5++;
        } else if (i2 == 3) {
            int i10 = i5 + 1;
            bArr2[i5] = (byte) (i3 >> 10);
            i5 += 2;
            bArr2[i10] = (byte) (i3 >> 2);
        } else if (i2 == 4) {
            this.f52472c = 6;
            return false;
        }
        this.f52472c = i2;
        this.f50743a = i5;
        return true;
    }
}
