package p000;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bbh {

    /* JADX INFO: renamed from: a */
    public final Context f2896a;

    /* JADX INFO: renamed from: b */
    public final Object f2897b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f2898c;

    /* JADX INFO: renamed from: d */
    public Object f2899d;

    /* JADX INFO: renamed from: e */
    private final C1058va f2900e;

    protected bbh(Context context, C1058va c1058va, byte[] bArr) {
        this.f2900e = c1058va;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f2896a = applicationContext;
        this.f2897b = new Object();
        this.f2898c = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo2174b();

    /* JADX INFO: renamed from: d */
    public abstract void mo2176d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2177e();

    /* JADX INFO: renamed from: f */
    public final void m2178f(bal balVar) {
        synchronized (this.f2897b) {
            if (this.f2898c.remove(balVar) && this.f2898c.isEmpty()) {
                mo2177e();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: g */
    public final void m2179g(Object obj) {
        synchronized (this.f2897b) {
            Object obj2 = this.f2899d;
            if (obj2 == null || !ooc.m18737c(obj2, obj)) {
                this.f2899d = obj;
                this.f2900e.f47803b.execute(new RunnableC0058bd(omn.m18673M(this.f2898c), this, 20));
            }
        }
    }
}
