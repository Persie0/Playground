package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.p002ui.platform.C0397i;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: dl */
/* JADX INFO: loaded from: classes.dex */
public final class C2932dl extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35763a;

    public /* synthetic */ C2932dl(int i) {
        this.f35763a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f35763a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C0397i c0397i = new C0397i(choreographer, Handler.createAsync(looperMyLooper));
                    return eh0.m11113J(c0397i, c0397i.f4781l);
                }
                C3386nv.m17633t("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(kcb.f47051a);
                return simpleDateFormat;
            case 2:
                return new Random();
            case 3:
                try {
                    return (Cipher) ls2.f50068b.f50070a.mo13283r("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    uk9.m22779n(e);
                    return null;
                }
            case 4:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 5:
                ugb ugbVar = new ugb();
                ugbVar.f63909a = 0;
                return ugbVar;
            case 6:
                return 0L;
            default:
                AbstractC3695vr.m23489G(Thread.currentThread());
                fmd fmdVar = new fmd();
                fmdVar.f39317a = false;
                fmdVar.f39318b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = qld.f57921b;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, fmdVar);
                    break;
                }
                return fmdVar;
        }
    }
}
