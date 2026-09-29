package p000;

import com.iterable.iterableapi.IterableDataRegion;
import com.iterable.iterableapi.RetryPolicy$Type;

/* JADX INFO: loaded from: classes.dex */
public final class kb4 {

    /* JADX INFO: renamed from: a */
    public boolean f46967a = true;

    /* JADX INFO: renamed from: b */
    public final e41 f46968b = new e41(12);

    /* JADX INFO: renamed from: c */
    public final s01 f46969c;

    /* JADX INFO: renamed from: d */
    public final String[] f46970d;

    /* JADX INFO: renamed from: e */
    public final IterableDataRegion f46971e;

    /* JADX INFO: renamed from: f */
    public final boolean f46972f;

    /* JADX INFO: renamed from: g */
    public boolean f46973g;

    /* JADX INFO: renamed from: h */
    public final int f46974h;

    /* JADX INFO: renamed from: i */
    public final wb4 f46975i;

    public kb4() {
        RetryPolicy$Type retryPolicy$Type = RetryPolicy$Type.LINEAR;
        s01 s01Var = new s01(1);
        s01Var.f60110b = 6000L;
        s01Var.f60111c = retryPolicy$Type;
        this.f46969c = s01Var;
        this.f46970d = new String[0];
        this.f46971e = IterableDataRegion.US;
        this.f46972f = true;
        this.f46973g = false;
        this.f46974h = 100;
        this.f46975i = new wb4();
    }
}
