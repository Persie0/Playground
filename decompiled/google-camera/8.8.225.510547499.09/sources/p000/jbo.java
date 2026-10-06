package p000;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbo {

    /* JADX INFO: renamed from: a */
    public static final lqq f33666a = new lqq("GoogleSignInCommon");

    /* JADX INFO: renamed from: a */
    public static void m12842a(Context context) {
        jbq.m12843c(context).m12847d();
        Iterator it = jec.m12966a().iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        synchronized (jfm.f33892c) {
            jfm jfmVar = jfm.f33893d;
            if (jfmVar != null) {
                jfmVar.f33899j.incrementAndGet();
                Handler handler = jfmVar.f33903n;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
