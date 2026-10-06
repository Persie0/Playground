package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfx {

    /* JADX INFO: renamed from: a */
    public volatile Object f33921a;

    /* JADX INFO: renamed from: b */
    public volatile jfv f33922b;

    /* JADX INFO: renamed from: c */
    private final Executor f33923c;

    public jfx(Looper looper, Object obj, String str) {
        this.f33923c = new jpr(looper, 1);
        this.f33921a = obj;
        jib.m13203h(str);
        this.f33922b = new jfv(obj, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m13122a() {
        this.f33921a = null;
        this.f33922b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m13123b(jfw jfwVar) {
        jib.m13206k(jfwVar, "Notifier must not be null");
        this.f33923c.execute(new ipe(this, jfwVar, 14));
    }
}
