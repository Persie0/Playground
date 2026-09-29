package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m9b {

    /* JADX INFO: renamed from: b */
    public static final m9b f50821b;

    /* JADX INFO: renamed from: a */
    public C3722wh f50822a;

    static {
        m9b m9bVar = new m9b();
        m9bVar.f50822a = null;
        f50821b = m9bVar;
    }

    /* JADX INFO: renamed from: a */
    public static C3722wh m16702a(Context context) {
        C3722wh c3722wh;
        m9b m9bVar = f50821b;
        synchronized (m9bVar) {
            try {
                if (m9bVar.f50822a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    m9bVar.f50822a = new C3722wh(context, 1);
                }
                c3722wh = m9bVar.f50822a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3722wh;
    }
}
