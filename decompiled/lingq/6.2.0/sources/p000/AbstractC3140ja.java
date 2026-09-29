package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: ja */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3140ja {

    /* JADX INFO: renamed from: a */
    public static final b47 f45275a;

    /* JADX INFO: renamed from: b */
    public static final a47 f45276b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f45277c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f45278d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f45275a = new b47(C2957ea.class);
        f45276b = new a47(yk0VarM22237b);
        f45277c = new ri4(C3714w9.class);
        f45278d = new ki4(yk0VarM22237b, new gm5(7));
    }

    /* JADX INFO: renamed from: a */
    public static C2920da m14360a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AbstractC3105ia.f43750a[outputPrefixType.ordinal()];
        if (i == 1) {
            return C2920da.f35224c;
        }
        if (i == 2) {
            return C2920da.f35225d;
        }
        if (i == 3) {
            return C2920da.f35226e;
        }
        if (i == 4) {
            return C2920da.f35227f;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
