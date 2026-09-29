package p454wa;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wa.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9893r implements InterfaceC9882g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9882g f50525a;

    /* JADX INFO: renamed from: b */
    public long f50526b;

    /* JADX INFO: renamed from: c */
    public Uri f50527c;

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f50528d;

    public C9893r(InterfaceC9882g interfaceC9882g) {
        interfaceC9882g.getClass();
        this.f50525a = interfaceC9882g;
        this.f50527c = Uri.EMPTY;
        this.f50528d = Collections.emptyMap();
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() throws IOException {
        this.f50525a.close();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws IOException {
        this.f50527c = c9884i.f50436a;
        this.f50528d = Collections.emptyMap();
        long jMo7273e = this.f50525a.mo7273e(c9884i);
        Uri uriMo7276k = mo7276k();
        uriMo7276k.getClass();
        this.f50527c = uriMo7276k;
        this.f50528d = mo7275h();
        return jMo7273e;
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: g */
    public final void mo7274g(InterfaceC9894s interfaceC9894s) {
        interfaceC9894s.getClass();
        this.f50525a.mo7274g(interfaceC9894s);
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> mo7275h() {
        return this.f50525a.mo7275h();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f50525a.mo7276k();
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f50525a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f50526b += (long) i12;
        }
        return i12;
    }
}
