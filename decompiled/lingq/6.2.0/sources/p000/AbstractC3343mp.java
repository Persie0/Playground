package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: mp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3343mp {

    /* JADX INFO: renamed from: a */
    public static final by8 f51673a = new by8(new qg2(2));

    /* JADX INFO: renamed from: b */
    public static int f51674b = -100;

    /* JADX INFO: renamed from: c */
    public static yi5 f51675c = null;

    /* JADX INFO: renamed from: d */
    public static yi5 f51676d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f51677e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f51678f = false;

    /* JADX INFO: renamed from: g */
    public static final C3437ov f51679g = new C3437ov(0);

    /* JADX INFO: renamed from: h */
    public static final Object f51680h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f51681i = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean m16965b(Context context) {
        if (f51677e == null) {
            try {
                int i = AbstractServiceC3383ns.f53177a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC3383ns.class), AbstractC3346ms.m17031a() | 128).metaData;
                if (bundle != null) {
                    f51677e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f51677e = Boolean.FALSE;
            }
        }
        return f51677e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m16966f(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp) {
        synchronized (f51680h) {
            try {
                C3437ov c3437ov = f51679g;
                c3437ov.getClass();
                C3052gv c3052gv = new C3052gv(c3437ov);
                while (c3052gv.hasNext()) {
                    AbstractC3343mp abstractC3343mp = (AbstractC3343mp) ((WeakReference) c3052gv.next()).get();
                    if (abstractC3343mp == layoutInflaterFactory2C3804yp || abstractC3343mp == null) {
                        c3052gv.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16967a();

    /* JADX INFO: renamed from: c */
    public abstract void mo16968c();

    /* JADX INFO: renamed from: d */
    public abstract void mo16969d();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo16970g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo16971h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo16972i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo16973j(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: k */
    public abstract void mo16974k(CharSequence charSequence);
}
