package p000;

import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0004a2 extends j93 implements Runnable {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f81k = 0;

    /* JADX INFO: renamed from: i */
    public ListenableFuture f82i;

    /* JADX INFO: renamed from: j */
    public Object f83j;

    public AbstractRunnableC0004a2(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f82i = listenableFuture;
        obj.getClass();
        this.f83j = obj;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        ListenableFuture listenableFuture = this.f82i;
        if ((listenableFuture != null) & (this.f13524a instanceof C3058h0)) {
            listenableFuture.cancel(m6389q());
        }
        this.f82i = null;
        this.f83j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        String str;
        ListenableFuture listenableFuture = this.f82i;
        Object obj = this.f83j;
        String strMo43k = super.mo43k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo43k != null) {
                return str.concat(strMo43k);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    /* JADX INFO: renamed from: r */
    public abstract Object mo44r(Object obj, Object obj2);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f82i;
        Object obj = this.f83j;
        if (((this.f13524a instanceof C3058h0) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f82i = null;
        if (listenableFuture.isCancelled()) {
            m6387o(listenableFuture);
            return;
        }
        try {
            try {
                Object objMo44r = mo44r(obj, AbstractC1118h.m6398b(listenableFuture));
                this.f83j = null;
                mo45s(objMo44r);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m6386n(th);
                } finally {
                    this.f83j = null;
                }
            }
        } catch (Error e) {
            m6386n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m6386n(e2.getCause());
        } catch (Exception e3) {
            m6386n(e3);
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo45s(Object obj);
}
