package okio;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import p124fp.C5608e;
import p124fp.C5617n;
import p124fp.C5623t;
import tl.C9322j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, m13365d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "okio"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f43901e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f43902f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f43897d.data);
        this.f43901e = bArr;
        this.f43902f = iArr;
    }

    private final Object writeReplace() {
        return new ByteString(m16003D());
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: C */
    public final void mo15989C(C5608e c5608e, int i10) {
        C5207g.m11111f(c5608e, "buffer");
        int i11 = 0 + i10;
        int iM326Y1 = C0062b.m326Y1(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int[] iArr = this.f43902f;
            int i13 = iM326Y1 == 0 ? 0 : iArr[iM326Y1 - 1];
            int i14 = iArr[iM326Y1] - i13;
            byte[][] bArr = this.f43901e;
            int i15 = iArr[bArr.length + iM326Y1];
            int iMin = Math.min(i11, i14 + i13) - i12;
            int i16 = (i12 - i13) + i15;
            C5623t c5623t = new C5623t(bArr[iM326Y1], i16, i16 + iMin, true);
            C5623t c5623t2 = c5608e.f34434a;
            if (c5623t2 == null) {
                c5623t.f34469g = c5623t;
                c5623t.f34468f = c5623t;
                c5608e.f34434a = c5623t;
            } else {
                C5623t c5623t3 = c5623t2.f34469g;
                C5207g.m11108c(c5623t3);
                c5623t3.m12003b(c5623t);
            }
            i12 += iMin;
            iM326Y1++;
        }
        c5608e.f34435b += (long) i10;
    }

    /* JADX INFO: renamed from: D */
    public final byte[] m16003D() {
        byte[] bArr = new byte[mo15992q()];
        byte[][] bArr2 = this.f43901e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f43902f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            C9322j.m17671Y(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: a */
    public final String mo15990a() {
        throw null;
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ByteString) {
                ByteString byteString = (ByteString) obj;
                if (byteString.mo15992q() == mo15992q() && mo15997y(byteString, mo15992q())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i10 = this.f43899b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f43901e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f43902f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f43899b = i12;
        return i12;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: l */
    public final ByteString mo15991l(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f43901e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f43902f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        C5207g.m11110e(bArrDigest, "digestBytes");
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: q */
    public final int mo15992q() {
        return this.f43902f[this.f43901e.length - 1];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: s */
    public final String mo15993s() {
        return new ByteString(m16003D()).mo15993s();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: t */
    public final byte[] mo15994t() {
        return m16003D();
    }

    @Override // okio.ByteString
    public final String toString() {
        return new ByteString(m16003D()).toString();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: w */
    public final byte mo15995w(int i10) {
        byte[][] bArr = this.f43901e;
        int length = bArr.length - 1;
        int[] iArr = this.f43902f;
        C5617n.m11992d(iArr[length], i10, 1L);
        int iM326Y1 = C0062b.m326Y1(this, i10);
        return bArr[iM326Y1][(i10 - (iM326Y1 == 0 ? 0 : iArr[iM326Y1 - 1])) + iArr[bArr.length + iM326Y1]];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: x */
    public final boolean mo15996x(int i10, int i11, int i12, byte[] bArr) {
        C5207g.m11111f(bArr, "other");
        if (i10 < 0 || i10 > mo15992q() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM326Y1 = C0062b.m326Y1(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f43902f;
            int i14 = iM326Y1 == 0 ? 0 : iArr[iM326Y1 - 1];
            int i15 = iArr[iM326Y1] - i14;
            byte[][] bArr2 = this.f43901e;
            int i16 = iArr[bArr2.length + iM326Y1];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!C5617n.m11989a((i10 - i14) + i16, i11, iMin, bArr2[iM326Y1], bArr)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM326Y1++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: y */
    public final boolean mo15997y(ByteString byteString, int i10) {
        C5207g.m11111f(byteString, "other");
        if (mo15992q() - i10 < 0) {
            return false;
        }
        int i11 = i10 + 0;
        int iM326Y1 = C0062b.m326Y1(this, 0);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int[] iArr = this.f43902f;
            int i14 = iM326Y1 == 0 ? 0 : iArr[iM326Y1 - 1];
            int i15 = iArr[iM326Y1] - i14;
            byte[][] bArr = this.f43901e;
            int i16 = iArr[bArr.length + iM326Y1];
            int iMin = Math.min(i11, i15 + i14) - i12;
            if (!byteString.mo15996x(i13, (i12 - i14) + i16, iMin, bArr[iM326Y1])) {
                return false;
            }
            i13 += iMin;
            i12 += iMin;
            iM326Y1++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: z */
    public final ByteString mo15998z() {
        return new ByteString(m16003D()).mo15998z();
    }
}
