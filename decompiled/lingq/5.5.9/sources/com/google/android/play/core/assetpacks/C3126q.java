package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p290o6.C7967l0;
import p338qd.C8523a1;
import p338qd.C8565o1;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3126q {

    /* JADX INFO: renamed from: b */
    public static final C7967l0 f15971b = new C7967l0("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: a */
    public final C3112c f15972a;

    public C3126q(C3112c c3112c) {
        this.f15972a = c3112c;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: a */
    public final void m9010a(C8565o1 c8565o1) {
        C3112c c3112c = this.f15972a;
        Object obj = c8565o1.f33657b;
        File fileM8975k = c3112c.m8975k((String) obj, c8565o1.f45935c, c8565o1.f45936d, c8565o1.f45937e);
        boolean zExists = fileM8975k.exists();
        String str = c8565o1.f45937e;
        if (!zExists) {
            throw new zzck(String.format("Cannot find unverified files for slice %s.", str), c8565o1.f33656a);
        }
        try {
            C3112c c3112c2 = this.f15972a;
            int i10 = c8565o1.f45935c;
            long j10 = c8565o1.f45936d;
            c3112c2.getClass();
            File file = new File(new File(new File(c3112c2.m8969c((String) obj, i10, j10), "_slices"), "_metadata"), str);
            if (!file.exists()) {
                throw new zzck(String.format("Cannot find metadata files for slice %s.", str), c8565o1.f33656a);
            }
            try {
                if (!C8523a1.m16631a(C3125p.m9009a(fileM8975k, file)).equals(c8565o1.f45938f)) {
                    throw new zzck(String.format("Verification failed for slice %s.", str), c8565o1.f33656a);
                }
                String str2 = (String) obj;
                f15971b.m15814o("Verification of slice %s of pack %s successful.", str, str2);
                File fileM8976l = this.f15972a.m8976l(str2, c8565o1.f45935c, c8565o1.f45936d, c8565o1.f45937e);
                if (!fileM8976l.exists()) {
                    fileM8976l.mkdirs();
                }
                if (!fileM8975k.renameTo(fileM8976l)) {
                    throw new zzck(String.format("Failed to move slice %s after verification.", str), c8565o1.f33656a);
                }
            } catch (IOException e10) {
                throw new zzck(String.format("Could not digest file during verification for slice %s.", str), e10, c8565o1.f33656a);
            } catch (NoSuchAlgorithmException e11) {
                throw new zzck("SHA256 algorithm not supported.", e11, c8565o1.f33656a);
            }
        } catch (IOException e12) {
            throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", str), e12, c8565o1.f33656a);
        }
    }
}
