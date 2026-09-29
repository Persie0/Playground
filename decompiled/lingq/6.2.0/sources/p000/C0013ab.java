package p000;

import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: classes2.dex */
public final class C0013ab extends AbstractC3517r {
    public C0013ab() {
        super(C3641ua.class, new C3789ya(C3528ra.class));
    }

    /* JADX INFO: renamed from: s */
    public static void m224s(C3641ua c3641ua) {
        vna.m23450c(c3641ua.m22650B());
        vna.m23448a(c3641ua.m22651z().size());
        C2922db c2922dbM22649A = c3641ua.m22649A();
        if (c2922dbM22649A.m10261x() < 12 || c2922dbM22649A.m10261x() > 16) {
            v63.m23147y("invalid IV size");
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: i */
    public final String mo225i() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: j */
    public final AbstractC3572sf mo226j() {
        return new C3826za(C3752xa.class);
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: o */
    public final KeyData$KeyMaterialType mo227o() {
        return KeyData$KeyMaterialType.SYMMETRIC;
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: q */
    public final AbstractC1126a mo228q(ByteString byteString) {
        return C3641ua.m22644D(byteString, ox2.m18561a());
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ void mo229r(AbstractC1126a abstractC1126a) {
        m224s((C3641ua) abstractC1126a);
    }
}
