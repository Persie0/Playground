package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.security.GeneralSecurityException;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes2.dex */
public final class C3490qa extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57484a;

    public /* synthetic */ C3490qa(int i) {
        this.f57484a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f57484a) {
            case 0:
                try {
                    return (Cipher) ls2.f50068b.f50070a.mo13283r("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    uk9.m22779n(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) ls2.f50068b.f50070a.mo13283r("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    uk9.m22779n(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) ls2.f50068b.f50070a.mo13283r("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    uk9.m22779n(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) ls2.f50068b.f50070a.mo13283r("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    uk9.m22779n(e4);
                    return null;
                }
            case 4:
                return new PathMeasure();
            case 5:
                return new Path();
            case 6:
                return new Path();
            case 7:
                return new float[4];
            case 8:
                return Boolean.FALSE;
            default:
                return new Random();
        }
    }
}
