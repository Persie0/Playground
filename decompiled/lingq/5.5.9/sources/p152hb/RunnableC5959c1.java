package p152hb;

import android.os.Bundle;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.play.core.assetpacks.C3111b;
import java.util.concurrent.Callable;
import p136gc.AbstractC5751g;
import p136gc.C5753i;
import p136gc.C5757m;
import p136gc.C5761q;
import p136gc.ExecutorC5760p;
import p136gc.InterfaceC5745a;
import p136gc.InterfaceC5747c;
import p136gc.InterfaceC5749e;

/* JADX INFO: renamed from: hb.c1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5959c1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35430c;

    public /* synthetic */ RunnableC5959c1(Object obj, int i10, Object obj2) {
        this.f35428a = i10;
        this.f35429b = obj;
        this.f35430c = obj2;
    }

    public /* synthetic */ RunnableC5959c1(Object obj, Object obj2, int i10) {
        this.f35428a = i10;
        this.f35430c = obj;
        this.f35429b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35428a) {
            case 2:
                Object obj = this.f35430c;
                try {
                    AbstractC5751g abstractC5751g = (AbstractC5751g) ((InterfaceC5745a) ((C5757m) obj).f34830c).mo5485i((AbstractC5751g) this.f35429b);
                    if (abstractC5751g == null) {
                        ((C5757m) obj).mo12097b(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC5760p executorC5760p = C5753i.f34814b;
                    C5757m c5757m = (C5757m) obj;
                    abstractC5751g.mo12103e(executorC5760p, c5757m);
                    abstractC5751g.mo12102d(executorC5760p, c5757m);
                    abstractC5751g.mo12099a(executorC5760p, c5757m);
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((C5761q) ((C5757m) obj).f34831d).m12122p((Exception) e10.getCause());
                        return;
                    } else {
                        ((C5761q) ((C5757m) obj).f34831d).m12122p(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((C5761q) ((C5757m) obj).f34831d).m12122p(e11);
                    return;
                }
            case 3:
                synchronized (((C5757m) this.f35430c).f34830c) {
                    Object obj2 = ((C5757m) this.f35430c).f34831d;
                    if (((InterfaceC5747c) obj2) != null) {
                        ((InterfaceC5747c) obj2).mo205e((AbstractC5751g) this.f35429b);
                    }
                    break;
                }
                return;
            case 4:
                synchronized (((C5757m) this.f35430c).f34830c) {
                    Object obj3 = ((C5757m) this.f35430c).f34831d;
                    if (((InterfaceC5749e) obj3) != null) {
                        ((InterfaceC5749e) obj3).mo12098a(((AbstractC5751g) this.f35429b).mo12107i());
                    }
                    break;
                }
                return;
            case 5:
                Object obj4 = this.f35429b;
                try {
                    ((C5761q) obj4).m12123q(((Callable) this.f35430c).call());
                    return;
                } catch (Exception e12) {
                    ((C5761q) obj4).m12122p(e12);
                    return;
                } catch (Throwable th2) {
                    ((C5761q) obj4).m12122p(new RuntimeException(th2));
                    return;
                }
            default:
                ((C3111b) this.f35429b).m8964c((Bundle) this.f35430c);
                return;
        }
    }
}
