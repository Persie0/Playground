package p000;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q43 {

    /* JADX INFO: renamed from: k */
    public static final Object f57250k = new Object();

    /* JADX INFO: renamed from: l */
    public static final C3275kv f57251l = new C3275kv(0);

    /* JADX INFO: renamed from: a */
    public final Context f57252a;

    /* JADX INFO: renamed from: b */
    public final String f57253b;

    /* JADX INFO: renamed from: c */
    public final a53 f57254c;

    /* JADX INFO: renamed from: d */
    public final ed1 f57255d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f57256e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f57257f;

    /* JADX INFO: renamed from: g */
    public final ds4 f57258g;

    /* JADX INFO: renamed from: h */
    public final uo7 f57259h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f57260i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f57261j;

    public q43(Context context, String str, a53 a53Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f57256e = atomicBoolean;
        this.f57257f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f57260i = copyOnWriteArrayList;
        this.f57261j = new CopyOnWriteArrayList();
        this.f57252a = context;
        lda.m16127m(str);
        this.f57253b = str;
        this.f57254c = a53Var;
        k50 k50Var = FirebaseInitProvider.f13789a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM3357j = new b64(context, new qn3(ComponentDiscoveryService.class)).m3357j();
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM3357j);
        int i = 1;
        arrayList.add(new yc1(new FirebaseCommonRegistrar(), i));
        arrayList.add(new yc1(new ExecutorsRegistrar(), i));
        arrayList2.add(hc1.m13190c(context, Context.class, new Class[0]));
        arrayList2.add(hc1.m13190c(this, q43.class, new Class[0]));
        arrayList2.add(hc1.m13190c(a53Var, a53.class, new Class[0]));
        nj0 nj0Var = new nj0(9);
        if (bma.m3879a(context) && FirebaseInitProvider.f13790b.get()) {
            arrayList2.add(hc1.m13190c(k50Var, k50.class, new Class[0]));
        }
        ed1 ed1Var = new ed1(uiExecutor, arrayList, arrayList2, nj0Var);
        this.f57255d = ed1Var;
        Trace.endSection();
        this.f57258g = new ds4(new dd1(2, this, context));
        this.f57259h = ed1Var.mo4928c(n62.class);
        n43 n43Var = new n43(this);
        m19644a();
        if (atomicBoolean.get()) {
            j70.f45129e.f45130a.get();
        }
        copyOnWriteArrayList.add(n43Var);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c */
    public static q43 m19641c() {
        q43 q43Var;
        synchronized (f57250k) {
            try {
                q43Var = (q43) f57251l.get("[DEFAULT]");
                if (q43Var == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (AbstractC3423or.f54777o == null) {
                        AbstractC3423or.f54777o = Application.getProcessName();
                    }
                    sb.append(AbstractC3423or.f54777o);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((n62) q43Var.f57259h.get()).m17248b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return q43Var;
    }

    /* JADX INFO: renamed from: f */
    public static q43 m19642f(Context context) {
        synchronized (f57250k) {
            try {
                if (f57251l.containsKey("[DEFAULT]")) {
                    return m19641c();
                }
                a53 a53VarM123a = a53.m123a(context);
                if (a53VarM123a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m19643g(context, a53VarM123a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static q43 m19643g(Context context, a53 a53Var) {
        q43 q43Var;
        AtomicReference atomicReference = o43.f53820a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = o43.f53820a;
            if (atomicReference2.get() == null) {
                o43 o43Var = new o43();
                do {
                    if (atomicReference2.compareAndSet(null, o43Var)) {
                        j70.m14308b(application);
                        j70.f45129e.m14309a(o43Var);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f57250k) {
            C3275kv c3275kv = f57251l;
            lda.m16132r("FirebaseApp name [DEFAULT] already exists!", !c3275kv.containsKey("[DEFAULT]"));
            lda.m16131q(context, "Application context cannot be null.");
            q43Var = new q43(context, "[DEFAULT]", a53Var);
            c3275kv.put("[DEFAULT]", q43Var);
        }
        q43Var.m19647e();
        return q43Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m19644a() {
        lda.m16132r("FirebaseApp was deleted", !this.f57257f.get());
    }

    /* JADX INFO: renamed from: b */
    public final Object m19645b(Class cls) {
        m19644a();
        return this.f57255d.mo4926a(cls);
    }

    /* JADX INFO: renamed from: d */
    public final String m19646d() {
        StringBuilder sb = new StringBuilder();
        m19644a();
        byte[] bytes = this.f57253b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m19644a();
        byte[] bytes2 = this.f57254c.f261b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m19647e() {
        Context context = this.f57252a;
        boolean zM3879a = bma.m3879a(context);
        String str = this.f57253b;
        if (!zM3879a) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m19644a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            p43.m18882a(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        m19644a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        m19644a();
        this.f57255d.m11053p("[DEFAULT]".equals(str));
        ((n62) this.f57259h.get()).m17248b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43Var = (q43) obj;
        q43Var.m19644a();
        return this.f57253b.equals(q43Var.f57253b);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19648h() {
        boolean z;
        m19644a();
        uz1 uz1Var = (uz1) this.f57258g.get();
        synchronized (uz1Var) {
            z = uz1Var.f64559a;
        }
        return z;
    }

    public final int hashCode() {
        return this.f57253b.hashCode();
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        y12Var.m24830a(this.f57253b, "name");
        y12Var.m24830a(this.f57254c, "options");
        return y12Var.toString();
    }
}
