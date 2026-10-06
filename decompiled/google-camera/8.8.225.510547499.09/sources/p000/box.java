package p000;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class box implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: g */
    private static volatile box f4030g;

    /* JADX INFO: renamed from: h */
    private static volatile boolean f4031h;

    /* JADX INFO: renamed from: a */
    public final bti f4032a;

    /* JADX INFO: renamed from: b */
    public final bpc f4033b;

    /* JADX INFO: renamed from: c */
    public final btg f4034c;

    /* JADX INFO: renamed from: d */
    public final bzg f4035d;

    /* JADX INFO: renamed from: e */
    public final List f4036e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final bzq f4037f;

    /* JADX INFO: renamed from: i */
    private final bub f4038i;

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    public box(Context context, ljf ljfVar, bub bubVar, bti btiVar, btg btgVar, bzg bzgVar, bzq bzqVar, Map map, List list, List list2, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f4032a = btiVar;
        this.f4034c = btgVar;
        this.f4038i = bubVar;
        this.f4035d = bzgVar;
        this.f4037f = bzqVar;
        if (((bpa) ((bpd) bkoVar.f3652a.get(bpa.class))) != null) {
            bxh.f4692a = 0;
        }
        this.f4033b = new bpc(context, btgVar, new bpl(this, list2), new bzq((char[]) null), map, list, ljfVar, bkoVar, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static box m2826b(Context context) {
        if (f4030g == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM2828d = m2828d(context.getApplicationContext());
            synchronized (box.class) {
                if (f4030g == null) {
                    if (f4031h) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f4031h = true;
                    try {
                        C1109wy c1109wy = new C1109wy();
                        bko bkoVar = new bko((byte[]) null);
                        Context applicationContext = context.getApplicationContext();
                        Collections.emptyList();
                        ArrayList<GlideConfiguration> arrayList = new ArrayList();
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo.metaData != null) {
                                for (String str : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                        arrayList.add(dkm.m6316b(str));
                                    }
                                }
                            }
                            if (generatedAppGlideModuleM2828d != null && !GeneratedAppGlideModule.m4032a().isEmpty()) {
                                Set setM4032a = GeneratedAppGlideModule.m4032a();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (setM4032a.contains(((GlideConfiguration) it.next()).getClass())) {
                                        it.remove();
                                    }
                                }
                            }
                            for (GlideConfiguration glideConfiguration : arrayList) {
                            }
                            buf bufVar = new buf(false);
                            bufVar.m3077b(buj.m3078a());
                            bufVar.f4478a = "source";
                            buj bujVarM3076a = bufVar.m3076a();
                            buf bufVar2 = new buf(true);
                            bufVar2.m3077b(1);
                            bufVar2.f4478a = "disk-cache";
                            buj bujVarM3076a2 = bufVar2.m3076a();
                            int i = buj.m3078a() >= 4 ? 2 : 1;
                            buf bufVar3 = new buf(true);
                            bufVar3.m3077b(i);
                            bufVar3.f4478a = "animation";
                            buj bujVarM3076a3 = bufVar3.m3076a();
                            buc bucVar = new buc(applicationContext);
                            int i2 = true != bucVar.f4472a.isLowRamDevice() ? 4194304 : 2097152;
                            ActivityManager activityManager = bucVar.f4472a;
                            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (true != activityManager.isLowRamDevice() ? 0.4f : 0.33f));
                            float f = ((DisplayMetrics) bucVar.f4474c.f3651a).widthPixels * ((DisplayMetrics) bucVar.f4474c.f3651a).heightPixels * 4;
                            int iRound2 = Math.round(bucVar.f4473b * f);
                            int iRound3 = Math.round(f + f);
                            int i3 = iRound - i2;
                            if (iRound3 + iRound2 > i3) {
                                float f2 = i3 / (bucVar.f4473b + 2.0f);
                                iRound3 = Math.round(f2 + f2);
                                iRound2 = Math.round(f2 * bucVar.f4473b);
                            }
                            bzq bzqVar = new bzq((short[]) null);
                            bti btqVar = iRound2 > 0 ? new btq(iRound2) : new btj();
                            btp btpVar = new btp(i2);
                            bub bubVar = new bub(iRound3);
                            bkn bknVar = new bkn(applicationContext);
                            new ThreadPoolExecutor(0, Integer.MAX_VALUE, buj.f4488a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new bui(new buh(0), "source-unlimited", false));
                            box boxVar = new box(applicationContext, new ljf(bubVar, bknVar, bujVarM3076a2, bujVarM3076a, bujVarM3076a3, (byte[]) null, (byte[]) null), bubVar, btqVar, btpVar, new bzg(), bzqVar, c1109wy, Collections.emptyList(), arrayList, new bko(bkoVar, (byte[]) null, (byte[]) null), null, null, null, null, null);
                            applicationContext.registerComponentCallbacks(boxVar);
                            f4030g = boxVar;
                            f4031h = false;
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
                        }
                    } catch (Throwable th) {
                        f4031h = false;
                        throw th;
                    }
                }
            }
        }
        return f4030g;
    }

    /* JADX INFO: renamed from: c */
    public static bpp m2827c(Context context) {
        bzq.m3277q(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2826b(context).f4035d.m3213a(context);
    }

    /* JADX INFO: renamed from: d */
    private static GeneratedAppGlideModule m2828d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e2) {
            m2829e(e2);
            return null;
        } catch (InstantiationException e3) {
            m2829e(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            m2829e(e4);
            return null;
        } catch (InvocationTargetException e5) {
            m2829e(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m2829e(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX INFO: renamed from: a */
    public final Context m2830a() {
        return this.f4033b.getBaseContext();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        cbi.m3387h();
        this.f4038i.m3375i();
        this.f4032a.mo3044c();
        this.f4034c.mo3035b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        cbi.m3387h();
        synchronized (this.f4036e) {
            for (bpp bppVar : this.f4036e) {
            }
        }
        bub bubVar = this.f4038i;
        if (i >= 40) {
            bubVar.m3375i();
        } else if (i >= 20) {
            bubVar.m3376j(bubVar.m3371e() / 2);
        } else if (i == 15) {
            i = 15;
            bubVar.m3376j(bubVar.m3371e() / 2);
        }
        this.f4032a.mo3046e(i);
        this.f4034c.mo3037d(i);
    }
}
