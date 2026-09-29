package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: tb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3605tb {

    /* JADX INFO: renamed from: a */
    public static final b47 f62085a;

    /* JADX INFO: renamed from: b */
    public static final a47 f62086b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f62087c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f62088d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f62085a = new b47(C3403ob.class);
        f62086b = new a47(yk0VarM22237b);
        f62087c = new ri4(C3106ib.class);
        f62088d = new ki4(yk0VarM22237b, new gm5(8));
    }

    /* JADX INFO: renamed from: a */
    public static C3366nb m21930a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AbstractC3568sb.f60605a[outputPrefixType.ordinal()];
        if (i == 1) {
            return C3366nb.f52549c;
        }
        if (i == 2 || i == 3) {
            return C3366nb.f52550d;
        }
        if (i == 4) {
            return C3366nb.f52551e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
