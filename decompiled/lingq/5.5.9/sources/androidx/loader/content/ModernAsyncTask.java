package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.kochava.tracker.BuildConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: f */
    public static final ThreadPoolExecutor f6703f;

    /* JADX INFO: renamed from: g */
    public static HandlerC1066f f6704g;

    /* JADX INFO: renamed from: a */
    public final C1062b f6705a;

    /* JADX INFO: renamed from: b */
    public final C1063c f6706b;

    /* JADX INFO: renamed from: c */
    public volatile Status f6707c = Status.PENDING;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f6708d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f6709e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class ThreadFactoryC1061a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f6710a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f6710a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$b */
    public class C1062b extends AbstractCallableC1067g<Params, Result> {
        public C1062b() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Result call() throws Exception {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.f6709e.set(true);
            try {
                Process.setThreadPriority(10);
                modernAsyncTask.mo3967a(this.f6716a);
                Binder.flushPendingCommands();
                modernAsyncTask.m3970d(null);
                return null;
            } catch (Throwable th2) {
                try {
                    modernAsyncTask.f6708d.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    modernAsyncTask.m3970d(null);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$c */
    public class C1063c extends FutureTask<Result> {
        public C1063c(C1062b c1062b) {
            super(c1062b);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            try {
                Result result = get();
                if (!modernAsyncTask.f6709e.get()) {
                    modernAsyncTask.m3970d(result);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                if (!modernAsyncTask.f6709e.get()) {
                    modernAsyncTask.m3970d(null);
                }
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$d */
    public static /* synthetic */ class C1064d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6713a;

        static {
            int[] iArr = new int[Status.values().length];
            f6713a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6713a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$e */
    public static class C1065e<Data> {

        /* JADX INFO: renamed from: a */
        public final ModernAsyncTask f6714a;

        /* JADX INFO: renamed from: b */
        public final Data[] f6715b;

        public C1065e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f6714a = modernAsyncTask;
            this.f6715b = dataArr;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$f */
    public static class HandlerC1066f extends Handler {
        public HandlerC1066f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1065e c1065e = (C1065e) message.obj;
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                c1065e.f6714a.getClass();
            } else {
                ModernAsyncTask modernAsyncTask = c1065e.f6714a;
                Object obj = c1065e.f6715b[0];
                if (modernAsyncTask.f6708d.get()) {
                    modernAsyncTask.mo3968b(obj);
                } else {
                    modernAsyncTask.mo3969c(obj);
                }
                modernAsyncTask.f6707c = Status.FINISHED;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$g */
    public static abstract class AbstractCallableC1067g<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a */
        public Params[] f6716a;
    }

    static {
        ThreadFactoryC1061a threadFactoryC1061a = new ThreadFactoryC1061a();
        f6703f = new ThreadPoolExecutor(5, BuildConfig.SDK_TRUNCATE_LENGTH, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC1061a);
    }

    public ModernAsyncTask() {
        C1062b c1062b = new C1062b();
        this.f6705a = c1062b;
        this.f6706b = new C1063c(c1062b);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3967a(Object... objArr);

    /* JADX INFO: renamed from: b */
    public void mo3968b(Result result) {
    }

    /* JADX INFO: renamed from: c */
    public void mo3969c(Result result) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m3970d(Object obj) {
        HandlerC1066f handlerC1066f;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f6704g == null) {
                    f6704g = new HandlerC1066f();
                }
                handlerC1066f = f6704g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handlerC1066f.obtainMessage(1, new C1065e(this, obj)).sendToTarget();
    }
}
