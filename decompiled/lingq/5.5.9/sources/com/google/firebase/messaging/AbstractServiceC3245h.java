package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p150h9.RunnableC5918i0;
import p208k.ExecutorC6558a;
import p276nb.ThreadFactoryC7736a;
import p382s7.C8969b;

/* JADX INFO: renamed from: com.google.firebase.messaging.h */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class AbstractServiceC3245h extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    /* JADX INFO: renamed from: com.google.firebase.messaging.h$a */
    public class a implements BinderC3242f0.a {
        public a() {
        }
    }

    public AbstractServiceC3245h() {
        ThreadFactoryC7736a threadFactoryC7736a = new ThreadFactoryC7736a("Firebase-Messaging-Intent-Handle");
        ThreadPriority threadPriority = ThreadPriority.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC7736a);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void finishTask(Intent intent) {
        if (intent != null) {
            C3238d0.m9252a(intent);
        }
        synchronized (this.lock) {
            int i10 = this.runningTasks - 1;
            this.runningTasks = i10;
            if (i10 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, AbstractC5751g abstractC5751g) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, C5752h c5752h) {
        try {
            handleIntent(intent);
        } finally {
            c5752h.m12114b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5751g<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.m8539c(null);
        }
        C5752h c5752h = new C5752h();
        this.executor.execute(new RunnableC5918i0(4, this, intent, c5752h));
        return c5752h.f34812a;
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new BinderC3242f0(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            try {
                this.lastStartId = i11;
                this.runningTasks++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        AbstractC5751g<Void> abstractC5751gProcessIntent = processIntent(startCommandIntent);
        if (abstractC5751gProcessIntent.mo12110l()) {
            finishTask(intent);
            return 2;
        }
        abstractC5751gProcessIntent.mo12101c(new ExecutorC6558a(3), new C8969b(this, 10, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
