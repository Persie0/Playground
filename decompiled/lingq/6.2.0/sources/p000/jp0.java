package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jp0 {

    /* JADX INFO: renamed from: a */
    public static final b47 f45946a;

    /* JADX INFO: renamed from: b */
    public static final a47 f45947b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f45948c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f45949d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f45946a = new b47(hp0.class);
        f45947b = new a47(yk0VarM22237b);
        f45948c = new ri4(cp0.class);
        f45949d = new ki4(yk0VarM22237b, new C3386nv(8));
    }

    /* JADX INFO: renamed from: a */
    public static gp0 m14577a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = ip0.f44390a[outputPrefixType.ordinal()];
        if (i == 1) {
            return gp0.f41118c;
        }
        if (i == 2 || i == 3) {
            return gp0.f41119d;
        }
        if (i == 4) {
            return gp0.f41120e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
