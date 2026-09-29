package ae;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import cf.InterfaceC2005b;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.heartbeatinfo.C3218a;
import com.google.firebase.provider.FirebaseInitProvider;
import com.kochava.tracker.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p118fe.C5511c;
import p118fe.C5519k;
import p118fe.C5523o;
import p152hb.ComponentCallbacks2C5953b;
import p156hf.C6042a;
import p176ib.C6268g;
import p176ib.C6272i;
import p223kf.C6667b;
import p262mb.C7531d;
import p326q.AbstractC8451g;
import p326q.C8446b;
import p389t2.C9192k;
import p533ze.InterfaceC10481c;

/* JADX INFO: renamed from: ae.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0065e {

    /* JADX INFO: renamed from: j */
    public static final Object f169j = new Object();

    /* JADX INFO: renamed from: k */
    public static final C8446b f170k = new C8446b();

    /* JADX INFO: renamed from: a */
    public final Context f171a;

    /* JADX INFO: renamed from: b */
    public final String f172b;

    /* JADX INFO: renamed from: c */
    public final C0066f f173c;

    /* JADX INFO: renamed from: d */
    public final C5519k f174d;

    /* JADX INFO: renamed from: g */
    public final C5523o<C6042a> f177g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2005b<C3218a> f178h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f175e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f176f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f179i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ae.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo433a(boolean z10);
    }

    /* JADX INFO: renamed from: ae.e$b */
    @TargetApi(14)
    public static class b implements ComponentCallbacks2C5953b.a {

        /* JADX INFO: renamed from: a */
        public static final AtomicReference<b> f180a = new AtomicReference<>();

        @Override // p152hb.ComponentCallbacks2C5953b.a
        /* JADX INFO: renamed from: a */
        public final void mo441a(boolean z10) {
            synchronized (C0065e.f169j) {
                for (C0065e c0065e : new ArrayList(C0065e.f170k.values())) {
                    if (c0065e.f175e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c0065e.f179i.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).mo433a(z10);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ae.e$c */
    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        public static final AtomicReference<c> f181b = new AtomicReference<>();

        /* JADX INFO: renamed from: a */
        public final Context f182a;

        public c(Context context) {
            this.f182a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (C0065e.f169j) {
                Iterator it = ((AbstractC8451g.e) C0065e.f170k.values()).iterator();
                while (it.hasNext()) {
                    ((C0065e) it.next()).m439d();
                }
            }
            this.f182a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e3 A[LOOP:0: B:25:0x00dc->B:27:0x00e3, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public C0065e(final Context context, C0066f c0066f, String str) {
        Bundle bundle;
        ?? arrayList;
        ArrayList arrayList2;
        a aVar;
        new CopyOnWriteArrayList();
        this.f171a = context;
        C6272i.m12912f(str);
        this.f172b = str;
        this.f173c = c0066f;
        C0061a c0061a = FirebaseInitProvider.f16462a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList3 = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), BuildConfig.SDK_TRUNCATE_LENGTH);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle != null) {
                    arrayList = new ArrayList();
                    loop1: while (true) {
                        for (String str2 : bundle.keySet()) {
                            if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) || !str2.startsWith("com.google.firebase.components:")) {
                                break;
                            } else {
                                arrayList.add(str2.substring(31));
                            }
                        }
                        break loop1;
                    }
                }
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                arrayList = Collections.emptyList();
                for (final String str3 : arrayList) {
                    arrayList3.add(new InterfaceC2005b() { // from class: fe.e
                        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
                        @Override // cf.InterfaceC2005b
                        public final Object get() {
                            String str4 = str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                            } catch (ClassNotFoundException unused) {
                                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                                return null;
                            } catch (IllegalAccessException e10) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e10);
                            } catch (InstantiationException e11) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e11);
                            } catch (NoSuchMethodException e12) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e12);
                            } catch (InvocationTargetException e13) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e13);
                            }
                        }
                    });
                }
                Trace.endSection();
                Trace.beginSection("Runtime");
                UiExecutor uiExecutor = UiExecutor.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList4.addAll(arrayList3);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                arrayList4.add(new InterfaceC2005b() { // from class: fe.j
                    @Override // cf.InterfaceC2005b
                    public final Object get() {
                        return firebaseCommonRegistrar;
                    }
                });
                final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
                arrayList4.add(new InterfaceC2005b() { // from class: fe.j
                    @Override // cf.InterfaceC2005b
                    public final Object get() {
                        return executorsRegistrar;
                    }
                });
                arrayList2.add(C5511c.m11744b(context, Context.class, new Class[0]));
                arrayList2.add(C5511c.m11744b(this, C0065e.class, new Class[0]));
                arrayList2.add(C5511c.m11744b(c0066f, C0066f.class, new Class[0]));
                C6667b c6667b = new C6667b();
                if (C9192k.m17533a(context) && FirebaseInitProvider.f16463b.get()) {
                    arrayList2.add(C5511c.m11744b(c0061a, AbstractC0067g.class, new Class[0]));
                }
                C5519k c5519k = new C5519k(uiExecutor, arrayList4, arrayList2, c6667b);
                this.f174d = c5519k;
                Trace.endSection();
                this.f177g = new C5523o<>(new InterfaceC2005b() { // from class: ae.c
                    @Override // cf.InterfaceC2005b
                    public final Object get() {
                        C0065e c0065e = this.f166a;
                        return new C6042a(context, c0065e.m438c(), (InterfaceC10481c) c0065e.f174d.mo11748a(InterfaceC10481c.class));
                    }
                });
                this.f178h = c5519k.mo11750c(C3218a.class);
                aVar = new a() { // from class: ae.d
                    @Override // ae.C0065e.a
                    /* JADX INFO: renamed from: a */
                    public final void mo433a(boolean z10) {
                        C0065e c0065e = this.f168a;
                        if (z10) {
                            c0065e.getClass();
                        } else {
                            c0065e.f178h.get().m9186c();
                        }
                    }
                };
                m437a();
                if (this.f175e.get() && ComponentCallbacks2C5953b.f35417e.f35418a.get()) {
                    aVar.mo433a(true);
                }
                this.f179i.add(aVar);
                Trace.endSection();
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle != null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            loop1: while (true) {
                while (true) {
                    if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                        break;
                    }
                    arrayList.add(str2.substring(31));
                }
            }
        }
        while (r0.hasNext()) {
            arrayList3.add(new InterfaceC2005b() { // from class: fe.e
                /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
                @Override // cf.InterfaceC2005b
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                        return null;
                    } catch (IllegalAccessException e10) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e10);
                    } catch (InstantiationException e11) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e11);
                    } catch (NoSuchMethodException e12) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e12);
                    } catch (InvocationTargetException e13) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e13);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor2 = UiExecutor.INSTANCE;
        ArrayList arrayList5 = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList5.addAll(arrayList3);
        final ComponentRegistrar firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        arrayList5.add(new InterfaceC2005b() { // from class: fe.j
            @Override // cf.InterfaceC2005b
            public final Object get() {
                return firebaseCommonRegistrar2;
            }
        });
        final ComponentRegistrar executorsRegistrar2 = new ExecutorsRegistrar();
        arrayList5.add(new InterfaceC2005b() { // from class: fe.j
            @Override // cf.InterfaceC2005b
            public final Object get() {
                return executorsRegistrar2;
            }
        });
        arrayList2.add(C5511c.m11744b(context, Context.class, new Class[0]));
        arrayList2.add(C5511c.m11744b(this, C0065e.class, new Class[0]));
        arrayList2.add(C5511c.m11744b(c0066f, C0066f.class, new Class[0]));
        C6667b c6667b2 = new C6667b();
        if (C9192k.m17533a(context)) {
            arrayList2.add(C5511c.m11744b(c0061a, AbstractC0067g.class, new Class[0]));
        }
        C5519k c5519k2 = new C5519k(uiExecutor2, arrayList5, arrayList2, c6667b2);
        this.f174d = c5519k2;
        Trace.endSection();
        this.f177g = new C5523o<>(new InterfaceC2005b() { // from class: ae.c
            @Override // cf.InterfaceC2005b
            public final Object get() {
                C0065e c0065e = this.f166a;
                return new C6042a(context, c0065e.m438c(), (InterfaceC10481c) c0065e.f174d.mo11748a(InterfaceC10481c.class));
            }
        });
        this.f178h = c5519k2.mo11750c(C3218a.class);
        aVar = new a() { // from class: ae.d
            @Override // ae.C0065e.a
            /* JADX INFO: renamed from: a */
            public final void mo433a(boolean z10) {
                C0065e c0065e = this.f168a;
                if (z10) {
                    c0065e.getClass();
                } else {
                    c0065e.f178h.get().m9186c();
                }
            }
        };
        m437a();
        if (this.f175e.get()) {
            aVar.mo433a(true);
        }
        this.f179i.add(aVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static C0065e m434b() {
        C0065e c0065e;
        synchronized (f169j) {
            c0065e = (C0065e) f170k.getOrDefault("[DEFAULT]", null);
            if (c0065e == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C7531d.m15043a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c0065e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static C0065e m435e(Context context) {
        synchronized (f169j) {
            if (f170k.containsKey("[DEFAULT]")) {
                return m434b();
            }
            C0066f c0066fM442a = C0066f.m442a(context);
            if (c0066fM442a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m436f(context, c0066fM442a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static C0065e m436f(Context context, C0066f c0066f) {
        C0065e c0065e;
        boolean z10;
        AtomicReference<b> atomicReference = b.f180a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f180a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    ComponentCallbacks2C5953b componentCallbacks2C5953b = ComponentCallbacks2C5953b.f35417e;
                    synchronized (componentCallbacks2C5953b) {
                        try {
                            if (!componentCallbacks2C5953b.f35421d) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C5953b);
                                application.registerComponentCallbacks(componentCallbacks2C5953b);
                                componentCallbacks2C5953b.f35421d = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    componentCallbacks2C5953b.getClass();
                    synchronized (componentCallbacks2C5953b) {
                        componentCallbacks2C5953b.f35420c.add(bVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f169j) {
            C8446b c8446b = f170k;
            C6272i.m12917k("FirebaseApp name [DEFAULT] already exists!", true ^ c8446b.containsKey("[DEFAULT]"));
            C6272i.m12916j(context, "Application context cannot be null.");
            c0065e = new C0065e(context, c0066f, "[DEFAULT]");
            c8446b.put("[DEFAULT]", c0065e);
        }
        c0065e.m439d();
        return c0065e;
    }

    /* JADX INFO: renamed from: a */
    public final void m437a() {
        C6272i.m12917k("FirebaseApp was deleted", !this.f176f.get());
    }

    /* JADX INFO: renamed from: c */
    public final String m438c() {
        StringBuilder sb2 = new StringBuilder();
        m437a();
        byte[] bytes = this.f172b.getBytes(Charset.defaultCharset());
        String strEncodeToString = null;
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        m437a();
        byte[] bytes2 = this.f173c.f184b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            strEncodeToString = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(strEncodeToString);
        return sb2.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m439d() {
        HashMap map;
        boolean z10 = true;
        if (!C9192k.m17533a(this.f171a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m437a();
            sb2.append(this.f172b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f171a;
            AtomicReference<c> atomicReference = c.f181b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            m437a();
            sb3.append(this.f172b);
            Log.i("FirebaseApp", sb3.toString());
            C5519k c5519k = this.f174d;
            m437a();
            boolean zEquals = "[DEFAULT]".equals(this.f172b);
            AtomicReference<Boolean> atomicReference2 = c5519k.f34175e;
            Boolean boolValueOf = Boolean.valueOf(zEquals);
            while (!atomicReference2.compareAndSet(null, boolValueOf)) {
                if (atomicReference2.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                synchronized (c5519k) {
                    map = new HashMap(c5519k.f34171a);
                }
                c5519k.m11756h(map, zEquals);
            }
            this.f178h.get().m9186c();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0065e)) {
            return false;
        }
        C0065e c0065e = (C0065e) obj;
        c0065e.m437a();
        return this.f172b.equals(c0065e.f172b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m440g() {
        boolean z10;
        m437a();
        C6042a c6042a = this.f177g.get();
        synchronized (c6042a) {
            try {
                z10 = c6042a.f35690b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final int hashCode() {
        return this.f172b.hashCode();
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        aVar.m12906a(this.f172b, "name");
        aVar.m12906a(this.f173c, "options");
        return aVar.toString();
    }
}
