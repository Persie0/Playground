package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ib3 implements oq2 {

    /* JADX INFO: renamed from: a */
    public final Context f43887a;

    /* JADX INFO: renamed from: b */
    public final hb3 f43888b;

    /* JADX INFO: renamed from: c */
    public final mkd f43889c;

    /* JADX INFO: renamed from: d */
    public final Object f43890d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f43891e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f43892f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f43893g;

    /* JADX INFO: renamed from: h */
    public d32 f43894h;

    public ib3(Context context, hb3 hb3Var) {
        xwc.m24776n(context, "Context cannot be null");
        this.f43887a = context.getApplicationContext();
        this.f43888b = hb3Var;
        this.f43889c = jb3.f45377d;
    }

    @Override // p000.oq2
    /* JADX INFO: renamed from: a */
    public final void mo11839a(d32 d32Var) {
        synchronized (this.f43890d) {
            this.f43894h = d32Var;
        }
        synchronized (this.f43890d) {
            try {
                if (this.f43894h == null) {
                    return;
                }
                if (this.f43892f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new dg1("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f43893g = threadPoolExecutor;
                    this.f43892f = threadPoolExecutor;
                }
                this.f43892f.execute(new RunnableC3781y2(this, 21));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13752b() {
        synchronized (this.f43890d) {
            try {
                this.f43894h = null;
                Handler handler = this.f43891e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f43891e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f43893g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f43892f = null;
                this.f43893g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final dc3 m13753c() {
        try {
            mkd mkdVar = this.f43889c;
            Context context = this.f43887a;
            hb3 hb3Var = this.f43888b;
            mkdVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{hb3Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            ztb ztbVarM12460a = gb3.m12460a(context, Collections.unmodifiableList(arrayList));
            int i = ztbVarM12460a.f72161b;
            if (i != 0) {
                ho2.m13385e(ux5.m22989l("fetchFonts failed (", i, ")"));
                return null;
            }
            dc3[] dc3VarArr = (dc3[]) ((List) ztbVarM12460a.f72162c).get(0);
            if (dc3VarArr != null && dc3VarArr.length != 0) {
                return dc3VarArr[0];
            }
            ho2.m13385e("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ij6.m13958p("provider not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13754d(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.f43890d) {
            this.f43892f = threadPoolExecutor;
        }
    }
}
