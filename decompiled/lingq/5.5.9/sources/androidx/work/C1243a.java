package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p026b5.AbstractC1320m;
import p026b5.C1313f;
import p026b5.C1319l;
import p026b5.ThreadFactoryC1308a;
import p041c5.C1702c;

/* JADX INFO: renamed from: androidx.work.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1243a {

    /* JADX INFO: renamed from: a */
    public final Executor f7810a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f7811b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1320m f7812c;

    /* JADX INFO: renamed from: d */
    public final C1313f f7813d;

    /* JADX INFO: renamed from: e */
    public final C1702c f7814e;

    /* JADX INFO: renamed from: f */
    public final int f7815f;

    /* JADX INFO: renamed from: g */
    public final int f7816g;

    /* JADX INFO: renamed from: h */
    public final int f7817h;

    /* JADX INFO: renamed from: androidx.work.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Executor f7818a;

        /* JADX INFO: renamed from: b */
        public AbstractC1320m f7819b;

        /* JADX INFO: renamed from: c */
        public int f7820c = 4;

        /* JADX INFO: renamed from: d */
        public int f7821d = 20;
    }

    /* JADX INFO: renamed from: androidx.work.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C1243a mo4701a();
    }

    public C1243a(a aVar) {
        Executor executor = aVar.f7818a;
        if (executor == null) {
            this.f7810a = m4700a(false);
        } else {
            this.f7810a = executor;
        }
        this.f7811b = m4700a(true);
        AbstractC1320m abstractC1320m = aVar.f7819b;
        if (abstractC1320m == null) {
            String str = AbstractC1320m.f8073a;
            this.f7812c = new C1319l();
        } else {
            this.f7812c = abstractC1320m;
        }
        this.f7813d = new C1313f();
        this.f7814e = new C1702c();
        this.f7815f = aVar.f7820c;
        this.f7816g = Integer.MAX_VALUE;
        this.f7817h = aVar.f7821d;
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m4700a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1308a(z10));
    }
}
