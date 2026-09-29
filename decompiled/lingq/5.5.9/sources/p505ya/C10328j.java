package p505ya;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import p118fe.C5509a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: ya.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10328j {

    /* JADX INFO: renamed from: a */
    public final C10322d f51977a = new C10322d();

    /* JADX INFO: renamed from: b */
    public final b f51978b;

    /* JADX INFO: renamed from: c */
    public final e f51979c;

    /* JADX INFO: renamed from: d */
    public boolean f51980d;

    /* JADX INFO: renamed from: e */
    public Surface f51981e;

    /* JADX INFO: renamed from: f */
    public float f51982f;

    /* JADX INFO: renamed from: g */
    public float f51983g;

    /* JADX INFO: renamed from: h */
    public float f51984h;

    /* JADX INFO: renamed from: i */
    public float f51985i;

    /* JADX INFO: renamed from: j */
    public int f51986j;

    /* JADX INFO: renamed from: k */
    public long f51987k;

    /* JADX INFO: renamed from: l */
    public long f51988l;

    /* JADX INFO: renamed from: m */
    public long f51989m;

    /* JADX INFO: renamed from: n */
    public long f51990n;

    /* JADX INFO: renamed from: o */
    public long f51991o;

    /* JADX INFO: renamed from: p */
    public long f51992p;

    /* JADX INFO: renamed from: q */
    public long f51993q;

    /* JADX INFO: renamed from: ya.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m19346a(Surface surface, float f3) {
            try {
                surface.setFrameRate(f3, f3 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                C10145n.m19096d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: renamed from: ya.j$b */
    public interface b {

        /* JADX INFO: renamed from: ya.j$b$a */
        public interface a {
        }

        /* JADX INFO: renamed from: a */
        void mo19347a();

        /* JADX INFO: renamed from: b */
        void mo19348b(C5509a c5509a);
    }

    /* JADX INFO: renamed from: ya.j$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final WindowManager f51994a;

        public c(WindowManager windowManager) {
            this.f51994a = windowManager;
        }

        @Override // p505ya.C10328j.b
        /* JADX INFO: renamed from: a */
        public final void mo19347a() {
        }

        @Override // p505ya.C10328j.b
        /* JADX INFO: renamed from: b */
        public final void mo19348b(C5509a c5509a) {
            c5509a.m11740h(this.f51994a.getDefaultDisplay());
        }
    }

    /* JADX INFO: renamed from: ya.j$d */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f51995a;

        /* JADX INFO: renamed from: b */
        public b.a f51996b;

        public d(DisplayManager displayManager) {
            this.f51995a = displayManager;
        }

        @Override // p505ya.C10328j.b
        /* JADX INFO: renamed from: a */
        public final void mo19347a() {
            this.f51995a.unregisterDisplayListener(this);
            this.f51996b = null;
        }

        @Override // p505ya.C10328j.b
        /* JADX INFO: renamed from: b */
        public final void mo19348b(C5509a c5509a) {
            this.f51996b = c5509a;
            Handler handlerM19044k = C10134c0.m19044k(null);
            DisplayManager displayManager = this.f51995a;
            displayManager.registerDisplayListener(this, handlerM19044k);
            c5509a.m11740h(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            b.a aVar = this.f51996b;
            if (aVar == null || i10 != 0) {
                return;
            }
            ((C5509a) aVar).m11740h(this.f51995a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: renamed from: ya.j$e */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: e */
        public static final e f51997e = new e();

        /* JADX INFO: renamed from: a */
        public volatile long f51998a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f51999b;

        /* JADX INFO: renamed from: c */
        public Choreographer f52000c;

        /* JADX INFO: renamed from: d */
        public int f52001d;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = C10134c0.f51354a;
            Handler handler = new Handler(looper, this);
            this.f51999b = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f51998a = j10;
            Choreographer choreographer = this.f52000c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                try {
                    this.f52000c = Choreographer.getInstance();
                } catch (RuntimeException e10) {
                    C10145n.m19100h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
                }
                return true;
            }
            if (i10 == 1) {
                Choreographer choreographer = this.f52000c;
                if (choreographer != null) {
                    int i11 = this.f52001d + 1;
                    this.f52001d = i11;
                    if (i11 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f52000c;
            if (choreographer2 != null) {
                int i12 = this.f52001d - 1;
                this.f52001d = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f51998a = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public C10328j(Context context) {
        b dVar;
        DisplayManager displayManager;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            dVar = (C10134c0.f51354a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new d(displayManager);
            if (dVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    dVar = new c(windowManager);
                } else {
                    dVar = null;
                }
            }
        } else {
            dVar = null;
        }
        this.f51978b = dVar;
        this.f51979c = dVar != null ? e.f51997e : null;
        this.f51987k = -9223372036854775807L;
        this.f51988l = -9223372036854775807L;
        this.f51982f = -1.0f;
        this.f51985i = 1.0f;
        this.f51986j = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m19343a() {
        Surface surface;
        if (C10134c0.f51354a >= 30 && (surface = this.f51981e) != null && this.f51986j != Integer.MIN_VALUE) {
            if (this.f51984h == 0.0f) {
                return;
            }
            this.f51984h = 0.0f;
            a.m19346a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: b */
    public final void m19344b() {
        float f3;
        boolean z10;
        if (C10134c0.f51354a < 30 || this.f51981e == null) {
            return;
        }
        C10322d c10322d = this.f51977a;
        if (!c10322d.m19321a()) {
            f3 = this.f51982f;
        } else if (c10322d.m19321a()) {
            C10322d.a aVar = c10322d.f51902a;
            long j10 = aVar.f51911e;
            long j11 = 0;
            if (j10 != 0) {
                j11 = aVar.f51912f / j10;
            }
            f3 = (float) (1.0E9d / j11);
        } else {
            f3 = -1.0f;
        }
        float f10 = this.f51983g;
        if (f3 == f10) {
            return;
        }
        boolean z11 = true;
        if (f3 != -1.0f && f10 != -1.0f) {
            if (c10322d.m19321a()) {
                if ((c10322d.m19321a() ? c10322d.f51902a.f51912f : -9223372036854775807L) >= 5000000000L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (Math.abs(f3 - this.f51983g) < (z10 ? 0.02f : 1.0f)) {
                z11 = false;
            }
        } else if (f3 == -1.0f && c10322d.f51906e < 30) {
            z11 = false;
        }
        if (z11) {
            this.f51983g = f3;
            m19345c(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: c */
    public final void m19345c(boolean z10) {
        Surface surface;
        float f3;
        if (C10134c0.f51354a >= 30 && (surface = this.f51981e) != null) {
            if (this.f51986j == Integer.MIN_VALUE) {
                return;
            }
            if (this.f51980d) {
                float f10 = this.f51983g;
                if (f10 != -1.0f) {
                    f3 = f10 * this.f51985i;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 0.0f;
            }
            if (!z10 && this.f51984h == f3) {
                return;
            }
            this.f51984h = f3;
            a.m19346a(surface, f3);
        }
    }
}
