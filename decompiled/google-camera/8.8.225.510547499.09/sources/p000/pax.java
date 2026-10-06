package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class pax implements Serializable, Comparable {

    /* JADX INFO: renamed from: a */
    public static final pax f47300a = new pax(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b */
    public final byte[] f47301b;

    /* JADX INFO: renamed from: c */
    public transient int f47302c;

    /* JADX INFO: renamed from: d */
    public transient String f47303d;

    public pax(byte[] bArr) {
        bArr.getClass();
        this.f47301b = bArr;
    }

    /* JADX INFO: renamed from: d */
    public static final pax m19278d(String str) {
        pax paxVar = new pax(lku.m15626U(str));
        paxVar.f47303d = str;
        return paxVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i);
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
        pax paxVar = new pax(bArr);
        Field declaredField = pax.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, paxVar.f47301b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f47301b.length);
        objectOutputStream.write(this.f47301b);
    }

    /* JADX INFO: renamed from: a */
    public byte mo19279a(int i) {
        return this.f47301b[i];
    }

    /* JADX INFO: renamed from: b */
    public int mo19280b() {
        return this.f47301b.length;
    }

    /* JADX INFO: renamed from: c */
    public String mo19281c() {
        byte[] bArr = this.f47301b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr[i] = pbi.f47327a[(b >> 4) & 15];
            cArr[i2] = pbi.f47327a[b & 15];
            i = i2 + 1;
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pax paxVar = (pax) obj;
        paxVar.getClass();
        int iMo19280b = mo19280b();
        int iMo19280b2 = paxVar.mo19280b();
        int iMin = Math.min(iMo19280b, iMo19280b2);
        for (int i = 0; i < iMin; i++) {
            int iMo19279a = mo19279a(i) & 255;
            int iMo19279a2 = paxVar.mo19279a(i) & 255;
            if (iMo19279a != iMo19279a2) {
                if (iMo19279a >= iMo19279a2) {
                    return 1;
                }
                return -1;
            }
        }
        if (iMo19280b == iMo19280b2) {
            return 0;
        }
        if (iMo19280b >= iMo19280b2) {
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo19282e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f47301b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && lku.m15625T(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pax) {
            pax paxVar = (pax) obj;
            int iMo19280b = paxVar.mo19280b();
            byte[] bArr = this.f47301b;
            int length = bArr.length;
            if (iMo19280b == length && paxVar.mo19282e(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo19283f() {
        return this.f47301b;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo19284g(pax paxVar, int i) {
        return paxVar.mo19282e(0, this.f47301b, 0, i);
    }

    public int hashCode() {
        int i = this.f47302c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f47301b);
        this.f47302c = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0140 A[EDGE_INSN: B:124:0x0140->B:125:0x0141 BREAK  A[LOOP:0: B:6:0x0010->B:174:0x0010]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a0 A[EDGE_INSN: B:64:0x00a0->B:125:0x0141 BREAK  A[LOOP:0: B:6:0x0010->B:174:0x0010]] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ee A[EDGE_INSN: B:95:0x00ee->B:125:0x0141 BREAK  A[LOOP:0: B:6:0x0010->B:174:0x0010]] */
    public String toString() {
        byte[] bArr = this.f47301b;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        char[] cArr = pbi.f47327a;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i < length) {
            byte b = bArr[i];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i2 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i4 = i + 3;
                        if (length > i4) {
                            byte b2 = bArr[i + 1];
                            if ((b2 & 192) != 128) {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b3 = bArr[i + 2];
                            if ((b3 & 192) != 128) {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i4];
                            if ((b4 & 192) != 128) {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i5 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                            if (i5 <= 1114111) {
                                if (i5 >= 55296 && i5 < 57344) {
                                    if (i2 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i5 >= 65536) {
                                    int i6 = i2 + 1;
                                    if (i2 == 64) {
                                        break;
                                    }
                                    i3 += 2;
                                    i += 4;
                                    i2 = i6;
                                } else {
                                    if (i2 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i2 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i + 2;
                        if (length > i7) {
                            byte b5 = bArr[i + 1];
                            if ((b5 & 192) != 128) {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b6 = bArr[i7];
                            if ((b6 & 192) != 128) {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b << 12);
                            if (i8 >= 2048) {
                                if (i8 >= 55296 && i8 < 57344) {
                                    if (i2 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                int i9 = i2 + 1;
                                if (i2 == 64) {
                                    break;
                                }
                                if (i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i += 3;
                                i2 = i9;
                            } else {
                                if (i2 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i2 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i10 = i + 1;
                    if (length > i10) {
                        byte b7 = bArr[i10];
                        if ((b7 & 192) != 128) {
                            if (i2 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i11 = (b << 6) ^ (b7 ^ 3968);
                        if (i11 >= 128) {
                            int i12 = i2 + 1;
                            if (i2 != 64) {
                                if (i11 < 160 || i11 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i11 < 65536 ? 1 : 2;
                                i += 2;
                                i2 = i12;
                            } else {
                                break;
                            }
                        } else {
                            if (i2 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i2 == 64) {
                            break;
                        }
                        i3 = -1;
                        break loop0;
                    }
                }
            } else {
                int i13 = i2 + 1;
                if (i2 == 64) {
                    break;
                }
                if (b != 10 && b != 13 && (b < 32 || b >= 127)) {
                    i3 = -1;
                    break;
                }
                i3++;
                i++;
                while (true) {
                    if (i < length) {
                        byte b8 = bArr[i];
                        if (b8 >= 0) {
                            i++;
                            int i14 = i13 + 1;
                            if (i13 != 64) {
                                if (b8 != 10 && b8 != 13 && (b8 < 32 || b8 >= 127)) {
                                    i3 = -1;
                                    break loop0;
                                }
                                i3++;
                                i13 = i14;
                            } else {
                                break loop0;
                            }
                        }
                    }
                    i2 = i13;
                }
            }
        }
        if (i3 == -1) {
            byte[] bArr2 = this.f47301b;
            int length2 = bArr2.length;
            if (length2 <= 64) {
                return "[hex=" + mo19281c() + "]";
            }
            bArr2.getClass();
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, 64);
            bArrCopyOfRange.getClass();
            return "[size=" + length2 + " hex=" + new pax(bArrCopyOfRange).mo19281c() + "…]";
        }
        String str = this.f47303d;
        if (str == null) {
            byte[] bArrMo19283f = mo19283f();
            bArrMo19283f.getClass();
            String str2 = new String(bArrMo19283f, oph.f46377a);
            this.f47303d = str2;
            str = str2;
        }
        String strSubstring = str.substring(0, i3);
        strSubstring.getClass();
        String strM18763A = ook.m18763A(ook.m18763A(ook.m18763A(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i3 >= str.length()) {
            return "[text=" + strM18763A + "]";
        }
        return "[size=" + this.f47301b.length + " text=" + strM18763A + "…]";
    }
}
