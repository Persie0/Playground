package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v4.media.session.C0166e;
import androidx.activity.RunnableC0193l;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p404u2.C9385e;
import p404u2.C9386f;
import p404u2.C9392l;
import p404u2.C9393m;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0899m extends C0892f.c {

    /* JADX INFO: renamed from: d */
    public static final a f6026d = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.m$a */
    public static class a {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.m$b */
    public static class b implements C0892f.h {

        /* JADX INFO: renamed from: a */
        public final Context f6027a;

        /* JADX INFO: renamed from: b */
        public final C9386f f6028b;

        /* JADX INFO: renamed from: c */
        public final a f6029c;

        /* JADX INFO: renamed from: d */
        public final Object f6030d;

        /* JADX INFO: renamed from: e */
        public Handler f6031e;

        /* JADX INFO: renamed from: f */
        public Executor f6032f;

        /* JADX INFO: renamed from: g */
        public ThreadPoolExecutor f6033g;

        /* JADX INFO: renamed from: h */
        public C0892f.i f6034h;

        public b(Context context, C9386f c9386f) {
            a aVar = C0899m.f6026d;
            this.f6030d = new Object();
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.f6027a = context.getApplicationContext();
            this.f6028b = c9386f;
            this.f6029c = aVar;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.emoji2.text.C0892f.h
        /* JADX INFO: renamed from: a */
        public final void mo3513a(C0892f.i iVar) {
            synchronized (this.f6030d) {
                try {
                    this.f6034h = iVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m3539c();
        }

        /* JADX INFO: renamed from: b */
        public final void m3538b() {
            synchronized (this.f6030d) {
                this.f6034h = null;
                Handler handler = this.f6031e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f6031e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6033g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6032f = null;
                this.f6033g = null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final void m3539c() {
            synchronized (this.f6030d) {
                if (this.f6034h == null) {
                    return;
                }
                if (this.f6032f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0887a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f6033g = threadPoolExecutor;
                    this.f6032f = threadPoolExecutor;
                }
                this.f6032f.execute(new RunnableC0193l(2, this));
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public final C9393m m3540d() {
            try {
                a aVar = this.f6029c;
                Context context = this.f6027a;
                C9386f c9386f = this.f6028b;
                aVar.getClass();
                C9392l c9392lM17753a = C9385e.m17753a(context, c9386f);
                int i10 = c9392lM17753a.f48200a;
                if (i10 != 0) {
                    throw new RuntimeException(C0166e.m762h("fetchFonts failed (", i10, ")"));
                }
                C9393m[] c9393mArr = c9392lM17753a.f48201b;
                if (c9393mArr == null || c9393mArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c9393mArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public C0899m(Context context, C9386f c9386f) {
        super(new b(context, c9386f));
    }
}
