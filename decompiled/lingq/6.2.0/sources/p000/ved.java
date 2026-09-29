package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.base.AbstractC1083c;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ved {

    /* JADX INFO: renamed from: j */
    public static final Object f65286j = new Object();

    /* JADX INFO: renamed from: k */
    public static final Object f65287k = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f65288a;

    /* JADX INFO: renamed from: b */
    public final on9 f65289b;

    /* JADX INFO: renamed from: c */
    public final on9 f65290c;

    /* JADX INFO: renamed from: d */
    public final on9 f65291d;

    /* JADX INFO: renamed from: e */
    public final on9 f65292e;

    /* JADX INFO: renamed from: f */
    public final on9 f65293f;

    /* JADX INFO: renamed from: g */
    public final Uri f65294g;

    /* JADX INFO: renamed from: h */
    public volatile n4d f65295h;

    /* JADX INFO: renamed from: i */
    public final Uri f65296i;

    public ved(Context context, on9 on9Var, on9 on9Var2, on9 on9Var3) {
        this.f65288a = context;
        this.f65290c = on9Var;
        this.f65289b = on9Var3;
        this.f65291d = on9Var2;
        Pattern pattern = rgd.f59246a;
        co7 co7Var = new co7(context);
        co7Var.m4942x("phenotype_storage_info");
        co7Var.m4943y("storage-info.pb");
        this.f65294g = co7Var.m4944z();
        co7 co7Var2 = new co7(context);
        co7Var2.m4942x("phenotype_storage_info");
        co7Var2.m4943y("device-encrypted-storage-info.pb");
        Set set = rgd.f59249d;
        bca.m3614j(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        co7Var2.f10360c = "directboot-files";
        this.f65296i = co7Var2.m4944z();
        int i = 1;
        this.f65292e = AbstractC1083c.m6269a(new yxc(this, i));
        this.f65293f = AbstractC1083c.m6269a(new pyc(on9Var, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m23256a() {
        if (!pvc.m19504L(this.f65288a) || m23258c().m17224w() + 86400000 >= System.currentTimeMillis()) {
            y04 y04Var = y04.f69048b;
            return;
        }
        c26 c26Var = (c26) this.f65290c.get();
        c26Var.getClass();
        ListenableFuture listenableFutureM6400d = AbstractC1118h.m6400d((ListenableFuture) this.f65293f.get());
        int i = k93.f46888h;
        AbstractC1118h.m6403g(listenableFutureM6400d instanceof k93 ? (k93) listenableFutureM6400d : new rc3(listenableFutureM6400d), new InterfaceC3053gw() { // from class: ned
            @Override // p000.InterfaceC3053gw
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return AbstractC1118h.m6400d((ListenableFuture) this.f52661a.f65292e.get());
            }
        }, c26Var);
    }

    /* JADX INFO: renamed from: b */
    public final cdd m23257b() {
        n4d n4dVarM23258c = m23258c();
        return new cdd(n4dVarM23258c.m17222u(), ImmutableList.m6287r(n4dVarM23258c.m17227z()), n4dVarM23258c.m17221t(), n4dVarM23258c.m17223v(), (n4dVarM23258c.m17214A() && n4dVarM23258c.m17215B().m25466t() == ((long) Build.VERSION.SDK_INT)) ? n4dVarM23258c.m17215B().m25465s() : "", ImmutableList.m6287r(n4dVarM23258c.m17225x()), ImmutableList.m6287r(n4dVarM23258c.m17226y()), n4dVarM23258c.m17220s(), n4dVarM23258c.m17217D(), n4dVarM23258c.m17216C(), n4dVarM23258c.m17218E());
    }

    /* JADX INFO: renamed from: c */
    public final n4d m23258c() {
        n4d n4dVarM17212G;
        n4d n4dVar = this.f65295h;
        if (n4dVar != null) {
            return n4dVar;
        }
        synchronized (f65286j) {
            n4dVarM17212G = this.f65295h;
            if (n4dVarM17212G == null) {
                n4dVarM17212G = n4d.m17212G();
                if (pvc.m19504L(this.f65288a)) {
                    ajb ajbVar = (ajb) n4dVarM17212G.mo329r(7);
                    phb phbVar = phb.f56224a;
                    int i = dhb.f35664a;
                    phb phbVar2 = phb.f56225b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamM11077j = eda.m11077j(((dgd) this.f65291d.get()).m10372b(this.f65294g));
                        try {
                            whb whbVarM23288a = ((vhb) ajbVar).m23288a(inputStreamM11077j, phbVar2);
                            if (inputStreamM11077j != null) {
                                inputStreamM11077j.close();
                            }
                            n4d n4dVar2 = (n4d) whbVarM23288a;
                            StrictMode.setThreadPolicy(threadPolicy);
                            n4dVarM17212G = n4dVar2;
                        } catch (Throwable th) {
                            if (inputStreamM11077j != null) {
                                try {
                                    inputStreamM11077j.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                    this.f65295h = n4dVarM17212G;
                }
            }
        }
        return n4dVarM17212G;
    }
}
