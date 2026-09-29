package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.engine.C2119e;
import com.bumptech.glide.manager.C2149e;
import com.bumptech.glide.manager.C2158n;
import com.bumptech.glide.manager.InterfaceC2147c;
import com.kochava.tracker.BuildConfig;
import dm.C5206f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p132g6.AbstractC5702a;
import p132g6.C5706e;
import p132g6.InterfaceC5704c;
import p258m6.C7489i;
import p258m6.C7492l;
import p326q.C8446b;
import p407u5.C9453d;
import p407u5.C9457h;
import p407u5.C9458i;
import p407u5.InterfaceC9451b;
import p407u5.InterfaceC9452c;
import p429v5.C9650f;
import p429v5.C9651g;
import p429v5.C9653i;
import p429v5.InterfaceC9652h;
import p449w5.ExecutorServiceC9813a;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2080b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: h */
    public static volatile ComponentCallbacks2C2080b f10548h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f10549i;

    /* JADX INFO: renamed from: a */
    public final InterfaceC9452c f10550a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9652h f10551b;

    /* JADX INFO: renamed from: c */
    public final C2085g f10552c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9451b f10553d;

    /* JADX INFO: renamed from: e */
    public final C2158n f10554e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2147c f10555f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10556g = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.b$a */
    public interface a {
    }

    public ComponentCallbacks2C2080b(Context context, C2119e c2119e, InterfaceC9652h interfaceC9652h, InterfaceC9452c interfaceC9452c, InterfaceC9451b interfaceC9451b, C2158n c2158n, InterfaceC2147c interfaceC2147c, int i10, C2081c c2081c, C8446b c8446b, List list, ArrayList arrayList, AbstractC5702a abstractC5702a, C2086h c2086h) {
        MemoryCategory memoryCategory = MemoryCategory.LOW;
        this.f10550a = interfaceC9452c;
        this.f10553d = interfaceC9451b;
        this.f10551b = interfaceC9652h;
        this.f10554e = c2158n;
        this.f10555f = interfaceC2147c;
        this.f10552c = new C2085g(context, interfaceC9451b, new C2087i(this, arrayList, abstractC5702a), new C5206f(), c2081c, c8446b, list, c2119e, c2086h, i10);
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C2080b m6235a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f10548h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (ComponentCallbacks2C2080b.class) {
                if (f10548h == null) {
                    if (f10549i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f10549i = true;
                    try {
                        m6237c(context, generatedAppGlideModule);
                        f10549i = false;
                    } catch (Throwable th2) {
                        f10549i = false;
                        throw th2;
                    }
                }
            }
        }
        return f10548h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static C2158n m6236b(Context context) {
        if (context != null) {
            return m6235a(context).f10554e;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX INFO: renamed from: c */
    public static void m6237c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C8446b c8446b = new C8446b();
        C2086h.a aVar = new C2086h.a();
        C2081c c2081c = new C2081c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C5706e.m12069a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC5704c interfaceC5704c = (InterfaceC5704c) it.next();
                    if (hashSet.contains(interfaceC5704c.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC5704c);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC5704c) it2.next()).getClass());
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC5704c) it3.next()).m12068b();
            }
            ExecutorServiceC9813a.a aVar2 = new ExecutorServiceC9813a.a();
            if (ExecutorServiceC9813a.f49949c == 0) {
                ExecutorServiceC9813a.f49949c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = ExecutorServiceC9813a.f49949c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            ExecutorServiceC9813a executorServiceC9813a = new ExecutorServiceC9813a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC9813a.b(aVar2, "source", false)));
            int i11 = ExecutorServiceC9813a.f49949c;
            ExecutorServiceC9813a.a aVar3 = new ExecutorServiceC9813a.a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            ExecutorServiceC9813a executorServiceC9813a2 = new ExecutorServiceC9813a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC9813a.b(aVar3, "disk-cache", true)));
            if (ExecutorServiceC9813a.f49949c == 0) {
                ExecutorServiceC9813a.f49949c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = ExecutorServiceC9813a.f49949c >= 4 ? 2 : 1;
            ExecutorServiceC9813a.a aVar4 = new ExecutorServiceC9813a.a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            ExecutorServiceC9813a executorServiceC9813a3 = new ExecutorServiceC9813a(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC9813a.b(aVar4, "animation", true)));
            C9653i c9653i = new C9653i(new C9653i.a(applicationContext));
            C2149e c2149e = new C2149e();
            int i13 = c9653i.f49435a;
            InterfaceC9452c c9458i = i13 > 0 ? new C9458i(i13) : new C9453d();
            C9457h c9457h = new C9457h(c9653i.f49437c);
            C9651g c9651g = new C9651g(c9653i.f49436b);
            C2119e c2119e = new C2119e(c9651g, new C9650f(applicationContext), executorServiceC9813a2, executorServiceC9813a, new ExecutorServiceC9813a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC9813a.f49948b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC9813a.b(new ExecutorServiceC9813a.a(), "source-unlimited", false))), executorServiceC9813a3);
            List listEmptyList = Collections.emptyList();
            C2086h c2086h = new C2086h(aVar);
            ComponentCallbacks2C2080b componentCallbacks2C2080b = new ComponentCallbacks2C2080b(applicationContext, c2119e, c9651g, c9458i, c9457h, new C2158n(null, c2086h), c2149e, 4, c2081c, c8446b, listEmptyList, arrayList, generatedAppGlideModule, c2086h);
            applicationContext.registerComponentCallbacks(componentCallbacks2C2080b);
            f10548h = componentCallbacks2C2080b;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ComponentCallbacks2C2090l m6238e(Context context) {
        return m6236b(context).m6375f(context);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m6239d(ComponentCallbacks2C2090l componentCallbacks2C2090l) {
        synchronized (this.f10556g) {
            if (!this.f10556g.contains(componentCallbacks2C2090l)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f10556g.remove(componentCallbacks2C2090l);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C7492l.m14880a();
        ((C7489i) this.f10551b).m14877e(0L);
        this.f10550a.mo17855b();
        this.f10553d.mo17850b();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        C7492l.m14880a();
        synchronized (this.f10556g) {
            Iterator it = this.f10556g.iterator();
            while (it.hasNext()) {
                ((ComponentCallbacks2C2090l) it.next()).getClass();
            }
        }
        C9651g c9651g = (C9651g) this.f10551b;
        c9651g.getClass();
        if (i10 >= 40) {
            c9651g.m14877e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (c9651g) {
                try {
                    j10 = c9651g.f41375b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c9651g.m14877e(j10 / 2);
        }
        this.f10550a.mo17854a(i10);
        this.f10553d.mo17849a(i10);
    }
}
