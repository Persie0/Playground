package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class sj7 implements jo5 {

    /* JADX INFO: renamed from: a */
    public final oj7 f60937a;

    /* JADX INFO: renamed from: b */
    public final int f60938b;

    public sj7(oj7 oj7Var, int i) throws InvalidAlgorithmParameterException {
        this.f60937a = oj7Var;
        this.f60938b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        oj7Var.mo18047a(i, new byte[0]);
    }

    @Override // p000.jo5
    /* JADX INFO: renamed from: a */
    public final void mo14570a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(mo14571b(bArr2), bArr)) {
            return;
        }
        v63.m23147y("invalid MAC");
    }

    @Override // p000.jo5
    /* JADX INFO: renamed from: b */
    public final byte[] mo14571b(byte[] bArr) {
        return this.f60937a.mo18047a(this.f60938b, bArr);
    }
}
