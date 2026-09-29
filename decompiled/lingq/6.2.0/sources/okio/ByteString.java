package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p000.AbstractC0001a;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj0;
import p000.cl9;
import p000.pb1;
import p000.te1;
import p000.ux5;
import p000.wq1;
import p000.yu0;

/* JADX INFO: loaded from: classes.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: d */
    public static final ByteString f54513d = new ByteString(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final byte[] f54514a;

    /* JADX INFO: renamed from: b */
    public transient int f54515b;

    /* JADX INFO: renamed from: c */
    public transient String f54516c;

    public ByteString(byte[] bArr) {
        bArr.getClass();
        this.f54514a = bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int m18072g(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.mo18080f(0, byteString2.mo18081h());
    }

    /* JADX INFO: renamed from: k */
    public static int m18073k(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.mo18083j(byteString2.mo18081h());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ByteString m18074p(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return byteString.mo18087o(i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.f54514a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f54514a.length);
        objectOutputStream.write(this.f54514a);
    }

    /* JADX INFO: renamed from: a */
    public String mo18075a() {
        byte[] bArr = this.f54514a;
        byte[] bArr2 = AbstractC0001a.f1a;
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, yu0.f70463a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString byteString) {
        byteString.getClass();
        int iMo18078d = mo18078d();
        int iMo18078d2 = byteString.mo18078d();
        int iMin = Math.min(iMo18078d, iMo18078d2);
        for (int i = 0; i < iMin; i++) {
            int iMo18082i = mo18082i(i) & 255;
            int iMo18082i2 = byteString.mo18082i(i) & 255;
            if (iMo18082i != iMo18082i2) {
                return iMo18082i < iMo18082i2 ? -1 : 1;
            }
        }
        if (iMo18078d == iMo18078d2) {
            return 0;
        }
        return iMo18078d < iMo18078d2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: c */
    public ByteString mo18077c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f54514a, 0, mo18078d());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    /* JADX INFO: renamed from: d */
    public int mo18078d() {
        return this.f54514a.length;
    }

    /* JADX INFO: renamed from: e */
    public String mo18079e() {
        byte[] bArr = this.f54514a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = pb1.f55914b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iMo18078d = byteString.mo18078d();
            byte[] bArr = this.f54514a;
            if (iMo18078d == bArr.length && byteString.mo18085m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int mo18080f(int i, byte[] bArr) {
        bArr.getClass();
        int length = this.f54514a.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!te1.m21993g(this.f54514a, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo18081h() {
        return this.f54514a;
    }

    public int hashCode() {
        int i = this.f54515b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f54514a);
        this.f54515b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public byte mo18082i(int i) {
        return this.f54514a[i];
    }

    /* JADX INFO: renamed from: j */
    public int mo18083j(byte[] bArr) {
        bArr.getClass();
        for (int iMin = Math.min(mo18078d(), this.f54514a.length - bArr.length); -1 < iMin; iMin--) {
            if (te1.m21993g(this.f54514a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo18084l(int i, ByteString byteString, int i2) {
        byteString.getClass();
        return byteString.mo18085m(0, this.f54514a, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public boolean mo18085m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f54514a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && te1.m21993g(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: n */
    public String mo18086n(Charset charset) {
        charset.getClass();
        return new String(this.f54514a, charset);
    }

    /* JADX INFO: renamed from: o */
    public ByteString mo18087o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo18078d();
        }
        if (i < 0) {
            C3386nv.m17626m("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f54514a;
        if (i2 > bArr.length) {
            C3386nv.m17624j(wq1.m24122r(new StringBuilder("endIndex > length("), this.f54514a.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(AbstractC3550rv.m20831Y(bArr, i, i2));
        }
        C3386nv.m17626m("endIndex < beginIndex");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public ByteString mo18088q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f54514a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m18089r() {
        String str = this.f54516c;
        if (str != null) {
            return str;
        }
        byte[] bArrMo18081h = mo18081h();
        bArrMo18081h.getClass();
        String str2 = new String(bArrMo18081h, yu0.f70463a);
        this.f54516c = str2;
        return str2;
    }

    /* JADX INFO: renamed from: s */
    public void mo18090s(aj0 aj0Var, int i) {
        aj0Var.write(this.f54514a, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        ByteString byteString = this;
        byte[] bArr = byteString.f54514a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM18089r = byteString.m18089r();
            String strM4839V = cl9.m4839V(cl9.m4839V(cl9.m4839V(strM18089r.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM18089r.length()) {
                return ux5.m22986i(']', "[text=", strM4839V);
            }
            return "[size=" + byteString.f54514a.length + " text=" + strM4839V + "…]";
        }
        if (byteString.f54514a.length <= 64) {
            return "[hex=" + byteString.mo18079e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(byteString.f54514a.length);
        sb.append(" hex=");
        byte[] bArr2 = byteString.f54514a;
        if (64 > bArr2.length) {
            C3386nv.m17624j(wq1.m24122r(new StringBuilder("endIndex > length("), byteString.f54514a.length, ')'));
            return null;
        }
        if (64 != bArr2.length) {
            byteString = new ByteString(AbstractC3550rv.m20831Y(bArr2, 0, 64));
        }
        sb.append(byteString.mo18079e());
        sb.append("…]");
        return sb.toString();
    }
}
