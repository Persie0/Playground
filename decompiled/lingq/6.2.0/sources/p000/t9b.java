package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class t9b extends AbstractC3452p9 {
    /* JADX INFO: renamed from: O */
    public static t9b m21917O(fo2 fo2Var, or3 or3Var, Integer num) throws GeneralSecurityException {
        yk0 yk0Var = (yk0) or3Var.f54782a;
        fo2 fo2Var2 = fo2.f39370l;
        if (fo2Var != fo2Var2 && num == null) {
            ij6.m13954l("For given Variant ", fo2Var, " the value of idRequirement must be non-null");
            return null;
        }
        if (fo2Var == fo2Var2 && num != null) {
            v63.m23147y("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (yk0Var.f69925a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + yk0Var.f69925a.length);
        }
        if (fo2Var == fo2Var2) {
            yk0.m25164a(new byte[0]);
        } else if (fo2Var == fo2.f39369k) {
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (fo2Var != fo2.f39368j) {
                ij6.m13966x(fo2Var, "Unknown Variant: ");
                return null;
            }
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new t9b();
    }
}
