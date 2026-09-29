package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: za */
/* JADX INFO: loaded from: classes2.dex */
public final class C3826za extends AbstractC3572sf {
    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: m */
    public final AbstractC1126a mo3497m(AbstractC1126a abstractC1126a) {
        C3752xa c3752xa = (C3752xa) abstractC1126a;
        C3604ta c3604taM22643C = C3641ua.m22643C();
        C2922db c2922dbM24430z = c3752xa.m24430z();
        c3604taM22643C.m22174d();
        C3641ua.m22646w((C3641ua) c3604taM22643C.f62440b, c2922dbM24430z);
        byte[] bArrM15648a = kq7.m15648a(c3752xa.m24429y());
        ByteString byteStringM6408g = ByteString.m6408g(bArrM15648a, 0, bArrM15648a.length);
        c3604taM22643C.m22174d();
        C3641ua.m22647x((C3641ua) c3604taM22643C.f62440b, byteStringM6408g);
        c3604taM22643C.m22174d();
        C3641ua.m22645v((C3641ua) c3604taM22643C.f62440b);
        return (C3641ua) c3604taM22643C.m22171a();
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: u */
    public final AbstractC1126a mo3499u(ByteString byteString) {
        return C3752xa.m24425B(byteString, ox2.m18561a());
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: z */
    public final void mo3500z(AbstractC1126a abstractC1126a) throws GeneralSecurityException {
        C3752xa c3752xa = (C3752xa) abstractC1126a;
        vna.m23448a(c3752xa.m24429y());
        C2922db c2922dbM24430z = c3752xa.m24430z();
        if (c2922dbM24430z.m10261x() < 12 || c2922dbM24430z.m10261x() > 16) {
            v63.m23147y("invalid IV size");
        }
    }
}
