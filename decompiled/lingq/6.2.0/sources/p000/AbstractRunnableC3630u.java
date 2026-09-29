package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC3630u extends j93 implements Runnable {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f63155l = 0;

    /* JADX INFO: renamed from: i */
    public ListenableFuture f63156i;

    /* JADX INFO: renamed from: j */
    public Class f63157j;

    /* JADX INFO: renamed from: k */
    public Object f63158k;

    public AbstractRunnableC3630u(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f63156i = listenableFuture;
        this.f63157j = cls;
        this.f63158k = obj;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        ListenableFuture listenableFuture = this.f63156i;
        if ((listenableFuture != null) & (this.f13524a instanceof C3058h0)) {
            listenableFuture.cancel(m6389q());
        }
        this.f63156i = null;
        this.f63157j = null;
        this.f63158k = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        String str;
        ListenableFuture listenableFuture = this.f63156i;
        Class cls = this.f63157j;
        Object obj = this.f63158k;
        String strMo43k = super.mo43k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo43k != null) {
                return str.concat(strMo43k);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX INFO: renamed from: r */
    public abstract Object mo20987r(Object obj, Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        Object objM6398b;
        ListenableFuture listenableFuture = this.f63156i;
        Class cls = this.f63157j;
        Object obj = this.f63158k;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.f13524a instanceof C3058h0)) {
            return;
        }
        this.f63156i = null;
        try {
            th = listenableFuture instanceof AbstractC1112b ? ((AbstractC1112b) listenableFuture).m6388p() : null;
            objM6398b = th == null ? AbstractC1118h.m6398b(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m6385m(objM6398b);
            return;
        }
        if (!cls.isInstance(th)) {
            m6387o(listenableFuture);
            return;
        }
        try {
            Object objMo20987r = mo20987r(obj, th);
            this.f63157j = null;
            this.f63158k = null;
            mo20988s(objMo20987r);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m6386n(th2);
            } finally {
                this.f63157j = null;
                this.f63158k = null;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo20988s(Object obj);
}
