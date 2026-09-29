package p235l5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1246d;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import java.util.UUID;
import p026b5.AbstractC1314g;
import p026b5.C1310c;
import p026b5.InterfaceC1311d;
import p213k4.RunnableC6590j;
import p214k5.C6617s;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;

/* JADX INFO: renamed from: l5.w */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7276w implements Runnable {

    /* JADX INFO: renamed from: g */
    public static final String f40776g = AbstractC1314g.m4868f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a */
    public final C1268a<Void> f40777a = new C1268a<>();

    /* JADX INFO: renamed from: b */
    public final Context f40778b;

    /* JADX INFO: renamed from: c */
    public final C6617s f40779c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1246d f40780d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1311d f40781e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7479a f40782f;

    /* JADX INFO: renamed from: l5.w$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1268a f40783a;

        public a(C1268a c1268a) {
            this.f40783a = c1268a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (RunnableC7276w.this.f40777a.f7924a instanceof AbstractFuture.C1262b) {
                return;
            }
            try {
                C1310c c1310c = (C1310c) this.f40783a.get();
                if (c1310c == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC7276w.this.f40779c.f37526c + ") but did not provide ForegroundInfo");
                }
                AbstractC1314g.m4867d().mo4869a(RunnableC7276w.f40776g, "Updating notification for " + RunnableC7276w.this.f40779c.f37526c);
                RunnableC7276w runnableC7276w = RunnableC7276w.this;
                C1268a<Void> c1268a = runnableC7276w.f40777a;
                InterfaceC1311d interfaceC1311d = runnableC7276w.f40781e;
                Context context = runnableC7276w.f40778b;
                UUID uuid = runnableC7276w.f40780d.f7829b.f7801a;
                C7278y c7278y = (C7278y) interfaceC1311d;
                c7278y.getClass();
                C1268a c1268a2 = new C1268a();
                c7278y.f40790a.m14863a(new RunnableC7277x(c7278y, c1268a2, uuid, c1310c, context));
                c1268a.m4768k(c1268a2);
            } catch (Throwable th2) {
                RunnableC7276w.this.f40777a.m4767j(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC7276w(Context context, C6617s c6617s, AbstractC1246d abstractC1246d, InterfaceC1311d interfaceC1311d, InterfaceC7479a interfaceC7479a) {
        this.f40778b = context;
        this.f40779c = c6617s;
        this.f40780d = abstractC1246d;
        this.f40781e = interfaceC1311d;
        this.f40782f = interfaceC7479a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.f40779c.f37540q && Build.VERSION.SDK_INT < 31) {
            C1268a c1268a = new C1268a();
            C7480b c7480b = (C7480b) this.f40782f;
            c7480b.f41354c.execute(new RunnableC6590j(this, 2, c1268a));
            c1268a.mo2629f(new a(c1268a), c7480b.f41354c);
            return;
        }
        this.f40777a.m4766i(null);
    }
}
