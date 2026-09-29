package p295ob;

import android.content.Context;

/* JADX INFO: renamed from: ob.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8032b {

    /* JADX INFO: renamed from: b */
    public static final C8032b f43661b = new C8032b();

    /* JADX INFO: renamed from: a */
    public C8031a f43662a = null;

    /* JADX INFO: renamed from: a */
    public static C8031a m15902a(Context context) {
        C8031a c8031a;
        C8032b c8032b = f43661b;
        synchronized (c8032b) {
            try {
                if (c8032b.f43662a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c8032b.f43662a = new C8031a(context);
                }
                c8031a = c8032b.f43662a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8031a;
    }
}
