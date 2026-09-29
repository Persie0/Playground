package p000;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.clearcut.C0956i;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dmb extends aib {

    /* JADX INFO: renamed from: i */
    public final Object f35878i;

    /* JADX INFO: renamed from: j */
    public String f35879j;

    /* JADX INFO: renamed from: k */
    public C0956i f35880k;

    public dmb(k58 k58Var, String str, C0956i c0956i) {
        super(k58Var, str, c0956i);
        this.f35878i = new Object();
    }

    @Override // p000.aib
    /* JADX INFO: renamed from: c */
    public final Object mo447c(String str) {
        C0956i c0956i;
        try {
            synchronized (this.f35878i) {
                try {
                    if (!str.equals(this.f35879j)) {
                        C0956i c0956iM5340g = C0956i.m5340g(Base64.decode(str, 3));
                        this.f35879j = str;
                        this.f35880k = c0956iM5340g;
                    }
                    c0956i = this.f35880k;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0956i;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f717b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 27);
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
