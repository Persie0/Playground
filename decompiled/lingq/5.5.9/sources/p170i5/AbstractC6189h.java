package p170i5;

import android.content.Context;
import dm.C5207g;
import java.util.LinkedHashSet;
import kotlin.collections.C6752c;
import p131g5.InterfaceC5697a;
import p146h5.AbstractC5889c;
import p213k4.RunnableC6590j;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;
import sl.C9072e;

/* JADX INFO: renamed from: i5.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6189h<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7479a f36045a;

    /* JADX INFO: renamed from: b */
    public final Context f36046b;

    /* JADX INFO: renamed from: c */
    public final Object f36047c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet<InterfaceC5697a<T>> f36048d;

    /* JADX INFO: renamed from: e */
    public T f36049e;

    public AbstractC6189h(Context context, C7480b c7480b) {
        this.f36045a = c7480b;
        Context applicationContext = context.getApplicationContext();
        C5207g.m11110e(applicationContext, "context.applicationContext");
        this.f36046b = applicationContext;
        this.f36047c = new Object();
        this.f36048d = new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo12702a();

    /* JADX INFO: renamed from: b */
    public final void m12708b(AbstractC5889c abstractC5889c) {
        C5207g.m11111f(abstractC5889c, "listener");
        synchronized (this.f36047c) {
            if (this.f36048d.remove(abstractC5889c) && this.f36048d.isEmpty()) {
                mo12707e();
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12709c(T t10) {
        synchronized (this.f36047c) {
            T t11 = this.f36049e;
            if (t11 == null || !C5207g.m11106a(t11, t10)) {
                this.f36049e = t10;
                ((C7480b) this.f36045a).f41354c.execute(new RunnableC6590j(C6752c.m13453u0(this.f36048d), 1, this));
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo12706d();

    /* JADX INFO: renamed from: e */
    public abstract void mo12707e();
}
