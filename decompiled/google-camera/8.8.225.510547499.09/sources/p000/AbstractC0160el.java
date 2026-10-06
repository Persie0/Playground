package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0160el {

    /* JADX INFO: renamed from: a */
    static final ExecutorC0184fi f14533a = new ExecutorC0184fi(new ExecutorC0932qj(1));

    /* JADX INFO: renamed from: b */
    public static final int f14534b = -100;

    /* JADX INFO: renamed from: f */
    private static Boolean f14538f = null;

    /* JADX INFO: renamed from: c */
    public static boolean f14535c = false;

    /* JADX INFO: renamed from: d */
    public static final C1112xa f14536d = new C1112xa();

    /* JADX INFO: renamed from: e */
    public static final Object f14537e = new Object();

    /* JADX INFO: renamed from: i */
    public static void m7430i(AbstractC0160el abstractC0160el) {
        synchronized (f14537e) {
            Iterator it = f14536d.iterator();
            while (it.hasNext()) {
                AbstractC0160el abstractC0160el2 = (AbstractC0160el) ((WeakReference) it.next()).get();
                if (abstractC0160el2 == abstractC0160el || abstractC0160el2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    static boolean m7431n(Context context) {
        if (f14538f == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0183fh.class), 640);
                if (serviceInfo.metaData != null) {
                    f14538f = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException e) {
                f14538f = false;
            }
        }
        return f14538f.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public Context mo7432a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0146dy mo7433b();

    /* JADX INFO: renamed from: c */
    public abstract View mo7434c(int i);

    /* JADX INFO: renamed from: d */
    public abstract void mo7435d(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: e */
    public abstract void mo7436e();

    /* JADX INFO: renamed from: f */
    public abstract void mo7437f();

    /* JADX INFO: renamed from: g */
    public abstract void mo7438g();

    /* JADX INFO: renamed from: h */
    public abstract void mo7439h();

    /* JADX INFO: renamed from: j */
    public abstract void mo7440j(int i);

    /* JADX INFO: renamed from: k */
    public abstract void mo7441k(View view);

    /* JADX INFO: renamed from: l */
    public abstract void mo7442l(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: m */
    public abstract void mo7443m(CharSequence charSequence);

    /* JADX INFO: renamed from: o */
    public abstract void mo7444o();

    /* JADX INFO: renamed from: p */
    public abstract void mo7445p(int i);
}
