package okio;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import mo.C7653a;
import mo.C7661i;
import p124fp.C5608e;
import p124fp.C5617n;
import p124fp.C5629z;
import p349qo.C8656b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m13365d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lsl/e;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "a", "[B", "getData$okio", "()[B", "data", "okio"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: d */
    public static final ByteString f43897d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final byte[] data;

    /* JADX INFO: renamed from: b */
    public transient int f43899b;

    /* JADX INFO: renamed from: c */
    public transient String f43900c;

    /* JADX INFO: renamed from: okio.ByteString$a */
    public static final class C8082a {
        /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public static ByteString m15999a(String str) {
            int i10;
            int i11;
            char cCharAt;
            C5207g.m11111f(str, "<this>");
            byte[] bArr = C5629z.f34478a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt((i11 = length - 1))) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length = i11;
            }
            int i12 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i13 >= length) {
                    int i17 = i14 % 4;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            bArrCopyOf[i16] = (byte) ((i15 << 12) >> 16);
                            i16++;
                        } else if (i17 == 3) {
                            int i18 = i15 << 6;
                            int i19 = i16 + 1;
                            bArrCopyOf[i16] = (byte) (i18 >> 16);
                            i16 = i19 + 1;
                            bArrCopyOf[i19] = (byte) (i18 >> 8);
                        }
                        if (i16 != i12) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                            C5207g.m11110e(bArrCopyOf, "copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i13);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i10 = cCharAt2 - 'A';
                } else {
                    if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i10 = cCharAt2 - 'G';
                    } else {
                        if ('0' <= cCharAt2 && cCharAt2 < ':') {
                            i10 = cCharAt2 + 4;
                        } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                            i10 = 62;
                        } else {
                            if (cCharAt2 != '/' && cCharAt2 != '_') {
                                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                    break;
                                }
                            } else {
                                i10 = 63;
                            }
                            i13++;
                        }
                    }
                }
                i15 = (i15 << 6) | i10;
                i14++;
                if (i14 % 4 == 0) {
                    int i20 = i16 + 1;
                    bArrCopyOf[i16] = (byte) (i15 >> 16);
                    int i21 = i20 + 1;
                    bArrCopyOf[i20] = (byte) (i15 >> 8);
                    bArrCopyOf[i21] = (byte) i15;
                    i16 = i21 + 1;
                }
                i13++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString(bArrCopyOf);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public static ByteString m16000b(String str) {
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (C5206f.m11018q0(str.charAt(i11 + 1)) + (C5206f.m11018q0(str.charAt(i11)) << 4));
            }
            return new ByteString(bArr);
        }

        /* JADX INFO: renamed from: c */
        public static ByteString m16001c(String str) {
            C5207g.m11111f(str, "<this>");
            byte[] bytes = str.getBytes(C7653a.f42116b);
            C5207g.m11110e(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f43900c = str;
            return byteString;
        }

        /* JADX INFO: renamed from: d */
        public static ByteString m16002d(byte[] bArr) {
            ByteString byteString = ByteString.f43897d;
            int length = bArr.length;
            C5617n.m11992d(bArr.length, 0, length);
            int i10 = length + 0;
            C8656b.m16906n(i10, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            C5207g.m11110e(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return new ByteString(bArrCopyOfRange);
        }
    }

    static {
        new C8082a();
        f43897d = new ByteString(new byte[0]);
    }

    public ByteString(byte[] bArr) {
        C5207g.m11111f(bArr, "data");
        this.data = bArr;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i10 = objectInputStream.readInt();
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("byteCount < 0: ", i10).toString());
        }
        byte[] bArr = new byte[i10];
        while (i11 < i10) {
            int i12 = objectInputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX INFO: renamed from: A */
    public final String m15988A() {
        String str = this.f43900c;
        if (str != null) {
            return str;
        }
        byte[] bArrMo15994t = mo15994t();
        C5207g.m11111f(bArrMo15994t, "<this>");
        String str2 = new String(bArrMo15994t, C7653a.f42116b);
        this.f43900c = str2;
        return str2;
    }

    /* JADX INFO: renamed from: C */
    public void mo15989C(C5608e c5608e, int i10) {
        C5207g.m11111f(c5608e, "buffer");
        c5608e.m11952c1(this.data, 0, i10);
    }

    /* JADX INFO: renamed from: a */
    public String mo15990a() {
        byte[] bArr = this.data;
        byte[] bArr2 = C5629z.f34478a;
        C5207g.m11111f(bArr, "<this>");
        C5207g.m11111f(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i19] = b14;
            bArr3[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i22] = bArr2[(b16 & 15) << 2];
            bArr3[i22 + 1] = (byte) 61;
        }
        return new String(bArr3, C7653a.f42116b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r7 < r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r5 < r6) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(ByteString byteString) {
        ByteString byteString2 = byteString;
        C5207g.m11111f(byteString2, "other");
        int iMo15992q = mo15992q();
        int iMo15992q2 = byteString2.mo15992q();
        int iMin = Math.min(iMo15992q, iMo15992q2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iMo15995w = mo15995w(i10) & 255;
            int iMo15995w2 = byteString2.mo15995w(i10) & 255;
            if (iMo15995w == iMo15995w2) {
            }
        }
        if (iMo15992q == iMo15992q2) {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iMo15992q = byteString.mo15992q();
            byte[] bArr = this.data;
            if (iMo15992q == bArr.length && byteString.mo15996x(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f43899b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f43899b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: l */
    public ByteString mo15991l(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, mo15992q());
        byte[] bArrDigest = messageDigest.digest();
        C5207g.m11110e(bArrDigest, "digestBytes");
        return new ByteString(bArrDigest);
    }

    /* JADX INFO: renamed from: q */
    public int mo15992q() {
        return this.data.length;
    }

    /* JADX INFO: renamed from: s */
    public String mo15993s() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = C5206f.f33269d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: t */
    public byte[] mo15994t() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:103:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:106:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:109:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x017f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0183  */
    /* JADX WARN: Code duplicated, block: B:167:0x018a  */
    /* JADX WARN: Code duplicated, block: B:169:0x018e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0191  */
    /* JADX WARN: Code duplicated, block: B:235:0x0230  */
    /* JADX WARN: Code duplicated, block: B:237:0x0233  */
    /* JADX WARN: Code duplicated, block: B:240:0x0239  */
    /* JADX WARN: Code duplicated, block: B:242:0x023d  */
    /* JADX WARN: Code duplicated, block: B:243:0x023f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0249 A[EDGE_INSN: B:247:0x0249->B:248:0x024a BREAK  A[LOOP:0: B:9:0x0017->B:308:0x0017]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:59:0x0090  */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0099  */
    /* JADX WARN: Code duplicated, block: B:65:0x009c  */
    public String toString() {
        ByteString byteString;
        int i10;
        byte b10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        loop0: while (i15 < length) {
            byte b11 = bArr[i15];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i16 == 64) {
                                break;
                            }
                            i17 = -1;
                            break;
                        }
                        int i18 = i15 + 3;
                        if (length > i18) {
                            byte b12 = bArr[i15 + 1];
                            if (!((b12 & 192) == 128)) {
                                if (i16 == 64) {
                                    break;
                                }
                                i17 = -1;
                                break;
                            }
                            byte b13 = bArr[i15 + 2];
                            if (!((b13 & 192) == 128)) {
                                if (i16 == 64) {
                                    break;
                                }
                                i17 = -1;
                                break;
                            }
                            byte b14 = bArr[i18];
                            if (!((b14 & 192) == 128)) {
                                if (i16 == 64) {
                                    break;
                                }
                                i17 = -1;
                                break;
                            }
                            int i19 = (b11 << 18) ^ (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12));
                            if (i19 <= 1114111) {
                                if (!(55296 <= i19 && i19 < 57344)) {
                                    if (i19 >= 65536) {
                                        int i20 = i16 + 1;
                                        if (i16 == 64) {
                                            break;
                                        }
                                        if (i19 != 10 && i19 != 13) {
                                            if (i19 >= 0 && i19 < 32) {
                                                z14 = true;
                                            } else {
                                                if (127 <= i19 && i19 < 160) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                            }
                                            if (!z14) {
                                                if (i19 == 65533) {
                                                    if (i19 < 65536) {
                                                        i14 = 1;
                                                    } else {
                                                        i14 = 2;
                                                    }
                                                    i17 += i14;
                                                    i15 += 4;
                                                    i16 = i20;
                                                }
                                            }
                                        } else if (i19 == 65533) {
                                            if (i19 < 65536) {
                                                i14 = 1;
                                            } else {
                                                i14 = 2;
                                            }
                                            i17 += i14;
                                            i15 += 4;
                                            i16 = i20;
                                        }
                                        i17 = -1;
                                        break;
                                    }
                                    if (i16 == 64) {
                                        break;
                                    }
                                    i17 = -1;
                                    break;
                                }
                                if (i16 == 64) {
                                    break;
                                }
                                i17 = -1;
                                break;
                            }
                            if (i16 == 64) {
                                break;
                            }
                            i17 = -1;
                            break;
                        }
                        if (i16 == 64) {
                            break;
                        }
                        i17 = -1;
                        break;
                    }
                    int i21 = i15 + 2;
                    if (length > i21) {
                        byte b15 = bArr[i15 + 1];
                        if (!((b15 & 192) == 128)) {
                            if (i16 == 64) {
                                break;
                            }
                            i17 = -1;
                            break;
                        }
                        byte b16 = bArr[i21];
                        if (!((b16 & 192) == 128)) {
                            if (i16 == 64) {
                                break;
                            }
                            i17 = -1;
                            break;
                        }
                        int i22 = (b11 << 12) ^ ((b16 ^ (-123008)) ^ (b15 << 6));
                        if (i22 >= 2048) {
                            if (!(55296 <= i22 && i22 < 57344)) {
                                int i23 = i16 + 1;
                                if (i16 == 64) {
                                    break;
                                }
                                if (i22 != 10 && i22 != 13) {
                                    if (i22 >= 0 && i22 < 32) {
                                        z13 = true;
                                    } else {
                                        if (127 <= i22 && i22 < 160) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        if (i22 == 65533) {
                                            if (i22 < 65536) {
                                                i13 = 1;
                                            } else {
                                                i13 = 2;
                                            }
                                            i17 += i13;
                                            i15 += 3;
                                            i16 = i23;
                                        }
                                    }
                                } else if (i22 == 65533) {
                                    if (i22 < 65536) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    i17 += i13;
                                    i15 += 3;
                                    i16 = i23;
                                }
                                i17 = -1;
                                break;
                            }
                            if (i16 == 64) {
                                break;
                            }
                            i17 = -1;
                            break;
                        }
                        if (i16 == 64) {
                            break;
                        }
                        i17 = -1;
                        break;
                    }
                    if (i16 == 64) {
                        break;
                    }
                    i17 = -1;
                    break;
                }
                int i24 = i15 + 1;
                if (length > i24) {
                    byte b17 = bArr[i24];
                    if (!((b17 & 192) == 128)) {
                        if (i16 == 64) {
                            break;
                        }
                        i17 = -1;
                        break;
                    }
                    int i25 = (b11 << 6) ^ (b17 ^ 3968);
                    if (i25 >= 128) {
                        int i26 = i16 + 1;
                        if (i16 == 64) {
                            break;
                        }
                        if (i25 != 10 && i25 != 13) {
                            if (i25 >= 0 && i25 < 32) {
                                z12 = true;
                            } else {
                                if (127 <= i25 && i25 < 160) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                if (i25 == 65533) {
                                    if (i25 < 65536) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    i17 += i12;
                                    i15 += 2;
                                    i16 = i26;
                                }
                            }
                        } else if (i25 == 65533) {
                            if (i25 < 65536) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            i17 += i12;
                            i15 += 2;
                            i16 = i26;
                        }
                        i17 = -1;
                        break;
                    }
                    if (i16 == 64) {
                        break;
                    }
                    i17 = -1;
                    break;
                }
                if (i16 == 64) {
                    break;
                }
                i17 = -1;
                break;
            }
            int i27 = i16 + 1;
            if (i16 == 64) {
                break;
            }
            if (b11 != 10 && b11 != 13) {
                if (b11 >= 0 && b11 < 32) {
                    z11 = true;
                } else {
                    if (127 <= b11 && b11 < 160) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    if (b11 != 65533) {
                        if (b11 < 65536) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        i17 += i10;
                        i15++;
                        while (true) {
                            i16 = i27;
                            if (i15 < length) {
                                continue;
                            }
                            i17 += i11;
                        }
                    }
                }
                i17 = -1;
                break;
            }
            if (b11 != 65533) {
                if (b11 < 65536) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                i17 += i10;
                i15++;
                while (true) {
                    i16 = i27;
                    if (i15 < length && (b10 = bArr[i15]) >= 0) {
                        i15++;
                        i27 = i16 + 1;
                        if (i16 == 64) {
                            break loop0;
                        }
                        if (b10 != 10 && b10 != 13) {
                            if (b10 >= 0 && b10 < 32) {
                                z10 = true;
                            } else {
                                if (127 <= b10 && b10 < 160) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                if (b10 == 65533) {
                                    if (b10 < 65536) {
                                        i11 = 1;
                                    } else {
                                        i11 = 2;
                                    }
                                    i17 += i11;
                                }
                            }
                        } else if (b10 == 65533) {
                            if (b10 < 65536) {
                                i11 = 1;
                            } else {
                                i11 = 2;
                            }
                            i17 += i11;
                        }
                    }
                }
            }
            i17 = -1;
            break;
        }
        if (i17 != -1) {
            String strM15988A = m15988A();
            String strSubstring = strM15988A.substring(0, i17);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strM15254T2 = C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i17 >= strM15988A.length()) {
                return "[text=" + strM15254T2 + ']';
            }
            return "[size=" + this.data.length + " text=" + strM15254T2 + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + mo15993s() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.data.length);
        sb2.append(" hex=");
        byte[] bArr2 = this.data;
        if (!(64 <= bArr2.length)) {
            throw new IllegalArgumentException(C0204c.m853l(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (64 == bArr2.length) {
            byteString = this;
        } else {
            C8656b.m16906n(64, bArr2.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, 64);
            C5207g.m11110e(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            byteString = new ByteString(bArrCopyOfRange);
        }
        sb2.append(byteString.mo15993s());
        sb2.append("…]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public byte mo15995w(int i10) {
        return this.data[i10];
    }

    /* JADX INFO: renamed from: x */
    public boolean mo15996x(int i10, int i11, int i12, byte[] bArr) {
        C5207g.m11111f(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.data;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && C5617n.m11989a(i10, i11, i12, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo15997y(ByteString byteString, int i10) {
        C5207g.m11111f(byteString, "other");
        return byteString.mo15996x(0, 0, i10, this.data);
    }

    /* JADX INFO: renamed from: z */
    public ByteString mo15998z() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                C5207g.m11110e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12) {
                        if (b13 <= b10) {
                            bArrCopyOf[i11] = (byte) (b13 + 32);
                        }
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i10++;
        }
    }
}
