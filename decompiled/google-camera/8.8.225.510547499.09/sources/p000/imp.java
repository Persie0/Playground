package p000;

import android.content.Context;
import com.google.common.p019io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imp {

    /* JADX INFO: renamed from: a */
    private static final nbh f31537a = nbh.m17259h("com/google/android/apps/camera/util/AssetUtils");

    /* JADX INFO: renamed from: a */
    public static byte[] m11477a(Context context, String str) {
        byte[] bArr = new byte[0];
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                int iAvailable = inputStreamOpen.available();
                byte[] bArr2 = new byte[iAvailable];
                int i = ByteStreams.read(inputStreamOpen, bArr2, 0, iAvailable);
                if (inputStreamOpen.available() != 0) {
                    ((nbe) ((nbe) f31537a.m17251b()).mo17276G((char) 4330)).mo17290o("There is more data. This is problematic");
                }
                if (i != iAvailable) {
                    ((nbe) ((nbe) f31537a.m17251b()).mo17276G((char) 4329)).mo17290o("Didn't finish reading the asset.");
                }
                if (inputStreamOpen == null) {
                    return bArr2;
                }
                try {
                    inputStreamOpen.close();
                    return bArr2;
                } catch (IOException e) {
                    e = e;
                    bArr = bArr2;
                    ((nbe) ((nbe) ((nbe) f31537a.m17251b()).mo17283h(e)).mo17276G((char) 4328)).mo17290o("Unable to load the asset");
                    return bArr;
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e2) {
                        }
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }
}
