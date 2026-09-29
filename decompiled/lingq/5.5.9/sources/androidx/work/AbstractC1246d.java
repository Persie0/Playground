package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.C1268a;
import p026b5.C1310c;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: renamed from: androidx.work.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1246d {

    /* JADX INFO: renamed from: a */
    public final Context f7828a;

    /* JADX INFO: renamed from: b */
    public final WorkerParameters f7829b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f7830c;

    /* JADX INFO: renamed from: d */
    public boolean f7831d;

    /* JADX INFO: renamed from: androidx.work.d$a */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.d$a$a, reason: collision with other inner class name */
        public static final class C10594a extends a {

            /* JADX INFO: renamed from: a */
            public final C1244b f7832a = C1244b.f7823c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C10594a.class == obj.getClass()) {
                    return this.f7832a.equals(((C10594a) obj).f7832a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f7832a.hashCode() + (C10594a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f7832a + '}';
            }
        }

        /* JADX INFO: renamed from: androidx.work.d$a$b */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.d$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public final C1244b f7833a;

            public c() {
                this(C1244b.f7823c);
            }

            public c(C1244b c1244b) {
                this.f7833a = c1244b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f7833a.equals(((c) obj).f7833a);
            }

            public final int hashCode() {
                return this.f7833a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f7833a + '}';
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC1246d(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f7828a = context;
        this.f7829b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceFutureC10478a<C1310c> mo4695a() {
        C1268a c1268a = new C1268a();
        c1268a.m4767j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c1268a;
    }

    /* JADX INFO: renamed from: b */
    public void mo4696b() {
    }

    /* JADX INFO: renamed from: c */
    public abstract C1268a mo4697c();

    /* JADX INFO: renamed from: e */
    public final void m4711e() {
        this.f7830c = true;
        mo4696b();
    }
}
