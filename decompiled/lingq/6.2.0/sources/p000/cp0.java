package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends AbstractC3452p9 {
    /* JADX INFO: renamed from: O */
    public static cp0 m9823O(gp0 gp0Var, or3 or3Var, Integer num) throws GeneralSecurityException {
        yk0 yk0Var = (yk0) or3Var.f54782a;
        gp0 gp0Var2 = gp0.f41120e;
        if (gp0Var != gp0Var2 && num == null) {
            ij6.m13954l("For given Variant ", gp0Var, " the value of idRequirement must be non-null");
            return null;
        }
        if (gp0Var == gp0Var2 && num != null) {
            v63.m23147y("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (yk0Var.f69925a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + yk0Var.f69925a.length);
        }
        if (gp0Var == gp0Var2) {
            yk0.m25164a(new byte[0]);
        } else if (gp0Var == gp0.f41119d) {
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (gp0Var != gp0.f41118c) {
                ij6.m13966x(gp0Var, "Unknown Variant: ");
                return null;
            }
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new cp0();
    }
}
