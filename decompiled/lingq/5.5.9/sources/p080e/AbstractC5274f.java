package p080e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0189h;
import com.google.android.material.appbar.MaterialToolbar;
import com.kochava.tracker.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p326q.C8448d;
import p389t2.C9188g;

/* JADX INFO: renamed from: e.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5274f {

    /* JADX INFO: renamed from: a */
    public static final C5287s.a f33368a = new C5287s.a(new C5287s.b());

    /* JADX INFO: renamed from: b */
    public static final int f33369b = -100;

    /* JADX INFO: renamed from: c */
    public static C9188g f33370c = null;

    /* JADX INFO: renamed from: d */
    public static C9188g f33371d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f33372e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f33373f = false;

    /* JADX INFO: renamed from: g */
    public static final C8448d<WeakReference<AbstractC5274f>> f33374g = new C8448d<>();

    /* JADX INFO: renamed from: h */
    public static final Object f33375h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f33376i = new Object();

    /* JADX INFO: renamed from: e.f$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocaleList m11351a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: e.f$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m11352a(Object obj) {
            return C0189h.m813a(obj).getApplicationLocales();
        }

        /* JADX INFO: renamed from: b */
        public static void m11353b(Object obj, LocaleList localeList) {
            C0189h.m813a(obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11326l(Context context) {
        if (f33372e == null) {
            try {
                int i10 = ServiceC5285q.f33488a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC5285q.class), ServiceC5285q.a.m11398a() | BuildConfig.SDK_TRUNCATE_LENGTH).metaData;
                if (bundle != null) {
                    f33372e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f33372e = Boolean.FALSE;
            }
        }
        return f33372e.booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public static void m11327s(AbstractC5274f abstractC5274f) {
        synchronized (f33375h) {
            Iterator<WeakReference<AbstractC5274f>> it = f33374g.iterator();
            while (true) {
                while (true) {
                    if (it.hasNext()) {
                        AbstractC5274f abstractC5274f2 = it.next().get();
                        if (abstractC5274f2 != abstractC5274f && abstractC5274f2 != null) {
                            break;
                        }
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo11328A(CharSequence charSequence);

    /* JADX INFO: renamed from: c */
    public abstract void mo11329c(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: d */
    public Context mo11330d(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: e */
    public abstract <T extends View> T mo11331e(int i10);

    /* JADX INFO: renamed from: f */
    public Context mo11332f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int mo11333g() {
        return -100;
    }

    /* JADX INFO: renamed from: h */
    public abstract MenuInflater mo11334h();

    /* JADX INFO: renamed from: i */
    public abstract AbstractC5269a mo11335i();

    /* JADX INFO: renamed from: j */
    public abstract void mo11336j();

    /* JADX INFO: renamed from: k */
    public abstract void mo11337k();

    /* JADX INFO: renamed from: m */
    public abstract void mo11338m(Configuration configuration);

    /* JADX INFO: renamed from: n */
    public abstract void mo11339n();

    /* JADX INFO: renamed from: o */
    public abstract void mo11340o();

    /* JADX INFO: renamed from: p */
    public abstract void mo11341p();

    /* JADX INFO: renamed from: q */
    public abstract void mo11342q();

    /* JADX INFO: renamed from: r */
    public abstract void mo11343r();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo11344t(int i10);

    /* JADX INFO: renamed from: u */
    public abstract void mo11345u(int i10);

    /* JADX INFO: renamed from: v */
    public abstract void mo11346v(View view);

    /* JADX INFO: renamed from: w */
    public abstract void mo11347w(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: x */
    public abstract void mo11348x(int i10);

    /* JADX INFO: renamed from: y */
    public abstract void mo11349y(MaterialToolbar materialToolbar);

    /* JADX INFO: renamed from: z */
    public void mo11350z(int i10) {
    }
}
