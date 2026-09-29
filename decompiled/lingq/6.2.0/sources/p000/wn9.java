package p000;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wn9 {

    /* JADX INFO: renamed from: a */
    public boolean f67094a;

    /* JADX INFO: renamed from: b */
    public boolean f67095b;

    /* JADX INFO: renamed from: c */
    public final Object f67096c;

    /* JADX INFO: renamed from: d */
    public final Object f67097d;

    /* JADX INFO: renamed from: e */
    public final Object f67098e;

    public wn9(Context context, Looper looper, mp9 mp9Var) {
        Context applicationContext = context.getApplicationContext();
        qfa qfaVar = new qfa();
        qfaVar.f57705a = applicationContext;
        this.f67096c = qfaVar;
        this.f67097d = mp9Var.m16990a(looper, null);
        this.f67098e = mp9Var.m16990a(Looper.getMainLooper(), null);
    }

    /* JADX INFO: renamed from: a */
    public void m24083a(final boolean z, final boolean z2) {
        qp9 qp9Var = (qp9) this.f67097d;
        if (z && z2) {
            qp9Var.m20098c(new Runnable() { // from class: c2b
                @Override // java.lang.Runnable
                public final void run() {
                    qfa.m19903c((qfa) this.f9373a.f67096c, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        qp9 qp9Var2 = (qp9) this.f67098e;
        qp9Var2.f58033a.postDelayed(new ks6(6, this, atomicBoolean), 1000L);
        qp9Var.m20098c(new Runnable() { // from class: d2b
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                qfa.m19903c((qfa) this.f34876a.f67096c, z, z2);
            }
        });
    }

    public wn9(Context context, String str, C3126ix c3126ix, boolean z, boolean z2) {
        context.getClass();
        c3126ix.getClass();
        this.f67096c = context;
        this.f67097d = str;
        this.f67098e = c3126ix;
        this.f67094a = z;
        this.f67095b = z2;
    }
}
