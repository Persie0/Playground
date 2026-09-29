package p000;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g06 {

    /* JADX INFO: renamed from: b */
    public static final Object f40017b = new Object();

    /* JADX INFO: renamed from: c */
    public static g06 f40018c;

    /* JADX INFO: renamed from: a */
    public ed1 f40019a;

    /* JADX INFO: renamed from: c */
    public static g06 m12269c() {
        g06 g06Var;
        synchronized (f40017b) {
            lda.m16132r("MlKitContext has not been initialized", f40018c != null);
            g06Var = f40018c;
            lda.m16130p(g06Var);
        }
        return g06Var;
    }

    /* JADX INFO: renamed from: d */
    public static g06 m12270d(Context context, Executor executor) {
        g06 g06Var;
        synchronized (f40017b) {
            lda.m16132r("MlKitContext is already initialized", f40018c == null);
            g06 g06Var2 = new g06();
            f40018c = g06Var2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM3357j = new b64(context, new qn3(MlKitComponentDiscoveryService.class)).m3357j();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C3386nv c3386nv = ad1.f507p;
            arrayList.addAll(arrayListM3357j);
            arrayList2.add(hc1.m13190c(context, Context.class, new Class[0]));
            arrayList2.add(hc1.m13190c(g06Var2, g06.class, new Class[0]));
            ed1 ed1Var = new ed1(executor, arrayList, arrayList2, c3386nv);
            g06Var2.f40019a = ed1Var;
            ed1Var.m11053p(true);
            g06Var = f40018c;
        }
        return g06Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12271a(Class cls) {
        lda.m16132r("MlKitContext has been deleted", f40018c == this);
        lda.m16130p(this.f40019a);
        return this.f40019a.mo4926a(cls);
    }

    /* JADX INFO: renamed from: b */
    public final Context m12272b() {
        return (Context) m12271a(Context.class);
    }
}
