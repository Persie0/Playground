package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu3 {

    /* JADX INFO: renamed from: a */
    public static final b47 f58212a;

    /* JADX INFO: renamed from: b */
    public static final a47 f58213b;

    /* JADX INFO: renamed from: c */
    public static final ri4 f58214c;

    /* JADX INFO: renamed from: d */
    public static final ki4 f58215d;

    static {
        yk0 yk0VarM22237b = tma.m22237b("type.googleapis.com/google.crypto.tink.HmacKey");
        f58212a = new b47(lu3.class);
        f58213b = new a47(yk0VarM22237b);
        f58214c = new ri4(gu3.class);
        f58215d = new ki4(yk0VarM22237b, new v63(7));
    }

    /* JADX INFO: renamed from: a */
    public static fo2 m20176a(HashType hashType) throws GeneralSecurityException {
        int i = pu3.f56805a[hashType.ordinal()];
        if (i == 1) {
            return fo2.f39363e;
        }
        if (i == 2) {
            return fo2.f39364f;
        }
        if (i == 3) {
            return fo2.f39365g;
        }
        if (i == 4) {
            return fo2.f39366h;
        }
        if (i == 5) {
            return fo2.f39367i;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    /* JADX INFO: renamed from: b */
    public static C2920da m20177b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = pu3.f56806b[outputPrefixType.ordinal()];
        if (i == 1) {
            return C2920da.f35230i;
        }
        if (i == 2) {
            return C2920da.f35231j;
        }
        if (i == 3) {
            return C2920da.f35232k;
        }
        if (i == 4) {
            return C2920da.f35233l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
