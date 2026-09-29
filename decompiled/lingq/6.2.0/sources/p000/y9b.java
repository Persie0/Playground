package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y9b {

    /* JADX INFO: renamed from: a */
    public static final b47 f69523a;

    /* JADX INFO: renamed from: b */
    public static final a47 f69524b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f69525c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f69526d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f69523a = new b47(w9b.class);
        f69524b = new a47(yk0VarM22237b);
        f69525c = new ri4(t9b.class);
        f69526d = new ki4(yk0VarM22237b, new uk9(22));
    }

    /* JADX INFO: renamed from: a */
    public static fo2 m24997a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = x9b.f67983a[outputPrefixType.ordinal()];
        if (i == 1) {
            return fo2.f39368j;
        }
        if (i == 2 || i == 3) {
            return fo2.f39369k;
        }
        if (i == 4) {
            return fo2.f39370l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
