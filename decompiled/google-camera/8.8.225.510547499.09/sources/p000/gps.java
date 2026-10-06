package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Timer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gps implements kba {

    /* JADX INFO: renamed from: a */
    public final elx f26013a;

    /* JADX INFO: renamed from: b */
    public final idb f26014b;

    /* JADX INFO: renamed from: c */
    public final jvd f26015c;

    /* JADX INFO: renamed from: d */
    public final Object f26016d = new Object();

    /* JADX INFO: renamed from: e */
    public Boolean f26017e = false;

    /* JADX INFO: renamed from: f */
    public boolean f26018f = true;

    /* JADX INFO: renamed from: g */
    public int f26019g = 1;

    /* JADX INFO: renamed from: h */
    private final Timer f26020h;

    public gps(elx elxVar, jvd jvdVar, Context context, Timer timer) {
        this.f26013a = elxVar;
        this.f26015c = jvdVar;
        this.f26020h = timer;
        this.f26014b = jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.portrait_notification_tap_to_focus), context, false, -1, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m9619a() {
        if (this.f26019g != 1) {
            this.f26019g = 1;
            m9620b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9620b() {
        this.f26013a.mo7485g(this.f26014b);
    }

    /* JADX INFO: renamed from: c */
    public final void m9621c(long j) {
        synchronized (this.f26016d) {
            if (this.f26018f) {
                this.f26020h.schedule(new gpr(this), j);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f26016d) {
            this.f26020h.cancel();
            this.f26018f = false;
            m9619a();
        }
    }
}
