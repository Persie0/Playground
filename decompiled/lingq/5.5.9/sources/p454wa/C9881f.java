package p454wa;

import android.net.Uri;
import android.util.Base64;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;
import p479xa.C10129a;
import p479xa.C10134c0;
import p482xd.C10170b;

/* JADX INFO: renamed from: wa.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9881f extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public C9884i f50426e;

    /* JADX INFO: renamed from: f */
    public byte[] f50427f;

    /* JADX INFO: renamed from: g */
    public int f50428g;

    /* JADX INFO: renamed from: h */
    public int f50429h;

    public C9881f() {
        super(false);
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() {
        if (this.f50427f != null) {
            this.f50427f = null;
            m18377o();
        }
        this.f50426e = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws IOException {
        m18378p(c9884i);
        this.f50426e = c9884i;
        Uri uri = c9884i.f50436a;
        String scheme = uri.getScheme();
        C10129a.m18989a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = C10134c0.f51354a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f50427f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ParserException(C0204c.m852k("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f50427f = C10134c0.m19018C(URLDecoder.decode(str, C10170b.f51475a.name()));
        }
        byte[] bArr = this.f50427f;
        long length = bArr.length;
        long j10 = c9884i.f50441f;
        if (j10 > length) {
            this.f50427f = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j10;
        this.f50428g = i11;
        int length2 = bArr.length - i11;
        this.f50429h = length2;
        long j11 = c9884i.f50442g;
        if (j11 != -1) {
            this.f50429h = (int) Math.min(length2, j11);
        }
        m18379q(c9884i);
        return j11 != -1 ? j11 : this.f50429h;
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        C9884i c9884i = this.f50426e;
        if (c9884i != null) {
            return c9884i.f50436a;
        }
        return null;
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f50429h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f50427f;
        int i13 = C10134c0.f51354a;
        System.arraycopy(bArr2, this.f50428g, bArr, i10, iMin);
        this.f50428g += iMin;
        this.f50429h -= iMin;
        m18376n(iMin);
        return iMin;
    }
}
