package p282nn;

import ae.C0062b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import p003a2.C0009a;

/* JADX INFO: renamed from: nn.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7807e extends AbstractC7803a {

    /* JADX INFO: renamed from: b */
    public final byte[] f42893b;

    /* JADX INFO: renamed from: c */
    public int f42894c = 0;

    /* JADX INFO: renamed from: nn.e$a */
    public class a implements AbstractC7803a.a {

        /* JADX INFO: renamed from: a */
        public int f42895a = 0;

        /* JADX INFO: renamed from: b */
        public final int f42896b;

        public a() {
            this.f42896b = C7807e.this.f42893b.length;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final byte m15540a() {
            try {
                byte[] bArr = C7807e.this.f42893b;
                int i10 = this.f42895a;
                this.f42895a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42895a < this.f42896b;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(m15540a());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7807e(byte[] bArr) {
        this.f42893b = bArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m15538B(C7807e c7807e, int i10, int i11) {
        if (i11 > c7807e.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 <= c7807e.size()) {
            int iM15539C = m15539C() + i11;
            int iM15539C2 = m15539C();
            int iM15539C3 = c7807e.m15539C() + i10;
            while (iM15539C2 < iM15539C) {
                if (this.f42893b[iM15539C2] != c7807e.f42893b[iM15539C3]) {
                    return false;
                }
                iM15539C2++;
                iM15539C3++;
            }
            return true;
        }
        int size2 = c7807e.size();
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* JADX INFO: renamed from: C */
    public int m15539C() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC7803a) && size() == ((AbstractC7803a) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C7807e) {
                return m15538B((C7807e) obj, 0, size());
            }
            if (obj instanceof C7810h) {
                return obj.equals(this);
            }
            String strValueOf = String.valueOf(obj.getClass());
            throw new IllegalArgumentException(C0009a.m23l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
        }
        return false;
    }

    public final int hashCode() {
        int iMo15526s = this.f42894c;
        if (iMo15526s == 0) {
            int size = size();
            iMo15526s = mo15526s(size, 0, size);
            if (iMo15526s == 0) {
                iMo15526s = 1;
            }
            this.f42894c = iMo15526s;
        }
        return iMo15526s;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: i */
    public void mo15521i(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f42893b, i10, bArr, i11, i12);
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: l */
    public final int mo15522l() {
        return 0;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: m */
    public final boolean mo15523m() {
        return true;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: o */
    public final boolean mo15524o() {
        byte[] bArr = this.f42893b;
        return C0062b.m284K1(bArr, 0, bArr.length + 0) == 0;
    }

    @Override // p282nn.AbstractC7803a, java.lang.Iterable
    /* JADX INFO: renamed from: p */
    public AbstractC7803a.a iterator() {
        return new a();
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: s */
    public final int mo15526s(int i10, int i11, int i12) {
        int iM15539C = m15539C() + i11;
        for (int i13 = iM15539C; i13 < iM15539C + i12; i13++) {
            i10 = (i10 * 31) + this.f42893b[i13];
        }
        return i10;
    }

    @Override // p282nn.AbstractC7803a
    public int size() {
        return this.f42893b.length;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1[r14] > (-65)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if (r1[r14] > (-65)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c3, code lost:
    
        if (r1[r14] > (-65)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
    
        r14 = r13;
     */
    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo15527t(int i10, int i11, int i12) {
        int i13;
        int i14;
        byte b10 = 0;
        int i15 = i11 + 0;
        int i16 = i12 + i15;
        byte[] bArr = this.f42893b;
        if (i10 != 0) {
            if (i15 >= i16) {
                return i10;
            }
            byte b11 = (byte) i10;
            if (b11 < -32) {
                if (b11 >= -62) {
                    i13 = i15 + 1;
                }
                return -1;
            }
            if (b11 < -16) {
                byte b12 = (byte) (~(i10 >> 8));
                if (b12 == 0) {
                    int i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (i17 < i16) {
                        i15 = i17;
                        b12 = b13;
                        if (b12 > -65 && (b11 != -32 || b12 >= -96)) {
                            if (b11 != -19 || b12 < -96) {
                                i13 = i15 + 1;
                            }
                        }
                    } else if (b11 <= -12) {
                        if (b13 <= -65) {
                            i14 = b13 << 8;
                            return i14 ^ b11;
                        }
                    }
                } else if (b12 > -65) {
                }
                return -1;
            }
            byte b14 = (byte) (~(i10 >> 8));
            if (b14 == 0) {
                int i18 = i15 + 1;
                b14 = bArr[i15];
                if (i18 < i16) {
                    i15 = i18;
                } else if (b11 <= -12) {
                    if (b14 <= -65) {
                        i14 = b14 << 8;
                        return i14 ^ b11;
                    }
                }
                return -1;
            }
            b10 = (byte) (i10 >> 16);
            if (b10 == 0) {
                int i19 = i15 + 1;
                b10 = bArr[i15];
                if (i19 < i16) {
                    i15 = i19;
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) != 0 && b10 <= -65) {
                            i13 = i15 + 1;
                        }
                    }
                } else if (b11 <= -12 && b14 <= -65) {
                    if (b10 <= -65) {
                        return ((b14 << 8) ^ b11) ^ (b10 << 16);
                    }
                }
            } else if (b14 <= -65) {
                if ((((b14 + 112) + (b11 << 28)) >> 30) != 0) {
                }
            }
            return -1;
        }
        return C0062b.m284K1(bArr, i15, i16);
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: u */
    public final int mo15528u() {
        return this.f42894c;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: v */
    public final String mo15529v() throws UnsupportedEncodingException {
        byte[] bArr = this.f42893b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: y */
    public final void mo15530y(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f42893b, m15539C() + i10, i11);
    }
}
