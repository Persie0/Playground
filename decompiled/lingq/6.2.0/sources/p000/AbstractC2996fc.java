package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: fc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2996fc {

    /* JADX INFO: renamed from: a */
    public static final b47 f38825a;

    /* JADX INFO: renamed from: b */
    public static final a47 f38826b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f38827c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f38828d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f38825a = new b47(C2923dc.class);
        f38826b = new a47(yk0VarM22237b);
        f38827c = new ri4(C3790yb.class);
        f38828d = new ki4(yk0VarM22237b, new gm5(9));
    }

    /* JADX INFO: renamed from: a */
    public static C0842cc m11761a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AbstractC2959ec.f36987a[outputPrefixType.ordinal()];
        if (i == 1) {
            return C0842cc.f9868c;
        }
        if (i == 2 || i == 3) {
            return C0842cc.f9869d;
        }
        if (i == 4) {
            return C0842cc.f9870e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
