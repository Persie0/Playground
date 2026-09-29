package androidx.compose.p017ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6740a;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;
import p389t2.C9187f;
import sl.C9072e;
import sl.InterfaceC9070c;
import tl.C9320h;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* JADX INFO: renamed from: H */
    public static final InterfaceC9070c<CoroutineContext> f4106H = C6740a.m13372a(new InterfaceC2041a<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final CoroutineContext mo807E() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C7178b c7178b = C7832g0.f42930a;
                choreographer = (Choreographer) C7828f.m15572f(C7162l.f40438a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            }
            C5207g.m11110e(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerM17522a = C9187f.m17522a(Looper.getMainLooper());
            C5207g.m11110e(handlerM17522a, "createAsync(Looper.getMainLooper())");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerM17522a);
            return androidUiDispatcher.mo1471C(androidUiDispatcher.f4117l);
        }
    });

    /* JADX INFO: renamed from: I */
    public static final C0584a f4107I = new C0584a();

    /* JADX INFO: renamed from: c */
    public final Choreographer f4108c;

    /* JADX INFO: renamed from: d */
    public final Handler f4109d;

    /* JADX INFO: renamed from: i */
    public boolean f4114i;

    /* JADX INFO: renamed from: j */
    public boolean f4115j;

    /* JADX INFO: renamed from: l */
    public final AndroidUiFrameClock f4117l;

    /* JADX INFO: renamed from: e */
    public final Object f4110e = new Object();

    /* JADX INFO: renamed from: f */
    public final C9320h<Runnable> f4111f = new C9320h<>();

    /* JADX INFO: renamed from: g */
    public List<Choreographer.FrameCallback> f4112g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<Choreographer.FrameCallback> f4113h = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final ChoreographerFrameCallbackC0585b f4116k = new ChoreographerFrameCallbackC0585b();

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$a */
    public static final class C0584a extends ThreadLocal<CoroutineContext> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            C5207g.m11110e(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerM17522a = C9187f.m17522a(looperMyLooper);
            C5207g.m11110e(handlerM17522a, "createAsync(\n           …d\")\n                    )");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerM17522a);
            return androidUiDispatcher.mo1471C(androidUiDispatcher.f4117l);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$b */
    public static final class ChoreographerFrameCallbackC0585b implements Choreographer.FrameCallback, Runnable {
        public ChoreographerFrameCallbackC0585b() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            AndroidUiDispatcher.this.f4109d.removeCallbacks(this);
            AndroidUiDispatcher.m2306C1(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f4110e) {
                try {
                    if (androidUiDispatcher.f4115j) {
                        androidUiDispatcher.f4115j = false;
                        List<Choreographer.FrameCallback> list = androidUiDispatcher.f4112g;
                        androidUiDispatcher.f4112g = androidUiDispatcher.f4113h;
                        androidUiDispatcher.f4113h = list;
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            list.get(i10).doFrame(j10);
                        }
                        list.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidUiDispatcher.m2306C1(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f4110e) {
                if (androidUiDispatcher.f4112g.isEmpty()) {
                    androidUiDispatcher.f4108c.removeFrameCallback(this);
                    androidUiDispatcher.f4115j = false;
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f4108c = choreographer;
        this.f4109d = handler;
        this.f4117l = new AndroidUiFrameClock(choreographer);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: C1 */
    public static final void m2306C1(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnableM17665U;
        boolean z10;
        do {
            synchronized (androidUiDispatcher.f4110e) {
                try {
                    C9320h<Runnable> c9320h = androidUiDispatcher.f4111f;
                    runnableM17665U = c9320h.isEmpty() ? null : c9320h.m17665U();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (runnableM17665U != null) {
                runnableM17665U.run();
                synchronized (androidUiDispatcher.f4110e) {
                    try {
                        C9320h<Runnable> c9320h2 = androidUiDispatcher.f4111f;
                        runnableM17665U = c9320h2.isEmpty() ? null : c9320h2.m17665U();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (androidUiDispatcher.f4110e) {
                if (androidUiDispatcher.f4111f.isEmpty()) {
                    z10 = false;
                    androidUiDispatcher.f4114i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        C5207g.m11111f(coroutineContext, "context");
        C5207g.m11111f(runnable, "block");
        synchronized (this.f4110e) {
            try {
                this.f4111f.m17668t(runnable);
                if (!this.f4114i) {
                    this.f4114i = true;
                    this.f4109d.post(this.f4116k);
                    if (!this.f4115j) {
                        this.f4115j = true;
                        this.f4108c.postFrameCallback(this.f4116k);
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
