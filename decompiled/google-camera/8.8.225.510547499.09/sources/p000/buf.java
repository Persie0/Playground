package p000;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buf {

    /* JADX INFO: renamed from: a */
    public String f4478a;

    /* JADX INFO: renamed from: b */
    private final boolean f4479b;

    /* JADX INFO: renamed from: c */
    private int f4480c;

    /* JADX INFO: renamed from: d */
    private int f4481d;

    /* JADX INFO: renamed from: e */
    private final ThreadFactory f4482e = new buh(0);

    public buf(boolean z) {
        this.f4479b = z;
    }

    /* JADX INFO: renamed from: a */
    public final buj m3076a() {
        if (TextUtils.isEmpty(this.f4478a)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.f4478a)));
        }
        return new buj(new ThreadPoolExecutor(this.f4480c, this.f4481d, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new bui(this.f4482e, this.f4478a, this.f4479b)));
    }

    /* JADX INFO: renamed from: b */
    public final void m3077b(int i) {
        this.f4480c = i;
        this.f4481d = i;
    }
}
