package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: rc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3530rc {

    /* JADX INFO: renamed from: a */
    public static final b47 f59052a;

    /* JADX INFO: renamed from: b */
    public static final a47 f59053b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f59054c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f59055d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f59052a = new b47(C3455pc.class);
        f59053b = new a47(yk0VarM22237b);
        f59054c = new ri4(C3179kc.class);
        f59055d = new ki4(yk0VarM22237b, new gm5(10));
    }

    /* JADX INFO: renamed from: a */
    public static C3404oc m20578a(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AbstractC3492qc.f57552a[outputPrefixType.ordinal()];
        if (i == 1) {
            return C3404oc.f54156c;
        }
        if (i == 2 || i == 3) {
            return C3404oc.f54157d;
        }
        if (i == 4) {
            return C3404oc.f54158e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
