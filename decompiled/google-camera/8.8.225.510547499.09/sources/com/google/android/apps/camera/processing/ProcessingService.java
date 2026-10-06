package com.google.android.apps.camera.processing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p000.amp;
import p000.emv;
import p000.ent;
import p000.fcn;
import p000.fco;
import p000.gpn;
import p000.gqn;
import p000.gqo;
import p000.gqp;
import p000.gqq;
import p000.gqs;
import p000.gqt;
import p000.gqu;
import p000.ihb;
import p000.jur;
import p000.jvd;
import p000.kbb;
import p000.kbz;
import p000.kpa;
import p000.nqf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProcessingService extends Service implements gqt {

    /* JADX INFO: renamed from: u */
    private static final long f6857u = TimeUnit.SECONDS.toMillis(60);

    /* JADX INFO: renamed from: a */
    public Notification.Builder f6858a;

    /* JADX INFO: renamed from: c */
    public gqu f6860c;

    /* JADX INFO: renamed from: d */
    public gqs f6861d;

    /* JADX INFO: renamed from: g */
    public boolean f6864g;

    /* JADX INFO: renamed from: h */
    public boolean f6865h;

    /* JADX INFO: renamed from: i */
    public boolean f6866i;

    /* JADX INFO: renamed from: j */
    public NotificationManager f6867j;

    /* JADX INFO: renamed from: k */
    public gqq f6868k;

    /* JADX INFO: renamed from: l */
    public PowerManager f6869l;

    /* JADX INFO: renamed from: m */
    public amp f6870m;

    /* JADX INFO: renamed from: n */
    public kbz f6871n;

    /* JADX INFO: renamed from: o */
    public jvd f6872o;

    /* JADX INFO: renamed from: p */
    public Handler f6873p;

    /* JADX INFO: renamed from: q */
    public kpa f6874q;

    /* JADX INFO: renamed from: r */
    public fco f6875r;

    /* JADX INFO: renamed from: s */
    public AccessibilityManager f6876s;

    /* JADX INFO: renamed from: t */
    public ent f6877t;

    /* JADX INFO: renamed from: w */
    private Thread f6879w;

    /* JADX INFO: renamed from: x */
    private boolean f6880x;

    /* JADX INFO: renamed from: v */
    private final gqp f6878v = new gqp(this);

    /* JADX INFO: renamed from: b */
    public final Object f6859b = new Object();

    /* JADX INFO: renamed from: e */
    public volatile boolean f6862e = false;

    /* JADX INFO: renamed from: f */
    public final Object f6863f = new Object();

    /* JADX INFO: renamed from: d */
    private final void m4249d() {
        if (this.f6880x) {
            return;
        }
        this.f6880x = true;
        ((gqo) ((emv) getApplication()).mo4193e(gqo.class)).mo7822q(this);
        boolean z = this.f6874q.f36758a;
        this.f6867j.deleteNotificationChannel("camera");
        Iterator<NotificationChannel> it = this.f6867j.getNotificationChannels().iterator();
        while (it.hasNext()) {
            if ("processing".equals(it.next().getId())) {
                return;
            }
        }
        NotificationChannel notificationChannel = new NotificationChannel("processing", getText(C0100R.string.processing_notification_channel), 2);
        notificationChannel.setShowBadge(false);
        this.f6867j.createNotificationChannel(notificationChannel);
    }

    @Override // p000.gqt
    /* JADX INFO: renamed from: a */
    public final void mo4250a(kbb kbbVar) {
        this.f6858a.setProgress(100, kbbVar.f35516e, false);
        m4252c();
    }

    @Override // p000.gqt
    /* JADX INFO: renamed from: b */
    public final void mo4251b(ihb ihbVar) {
        this.f6858a.setContentText(ihbVar.mo11322a(getResources()));
        m4252c();
    }

    /* JADX INFO: renamed from: c */
    public final void m4252c() {
        synchronized (this.f6863f) {
            if (!this.f6864g || this.f6866i) {
                this.f6865h = true;
            } else {
                this.f6867j.notify(2, this.f6858a.build());
                this.f6864g = false;
                this.f6865h = false;
                this.f6873p.postDelayed(new gpn(this, 9), 1000L);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        m4249d();
        super.onCreate();
        synchronized (this.f6863f) {
            this.f6864g = true;
            this.f6865h = false;
            this.f6866i = false;
        }
        this.f6871n.mo13961e("ProcessingService#onCreate");
        this.f6871n.mo13961e("WakeLock#new");
        gqu gquVar = new gqu(this.f6869l, f6857u);
        this.f6860c = gquVar;
        gquVar.m9654a("onCreate");
        this.f6877t.m7569a();
        this.f6871n.mo13962f();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
        this.f6870m.m962b(this.f6878v, intentFilter);
        boolean z = this.f6874q.f36758a;
        this.f6858a = new Notification.Builder(this, "processing").setSmallIcon(C0100R.drawable.ic_notification).setColor(getResources().getColor(C0100R.color.processing_notification)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(this.f6876s.isTouchExplorationEnabled() ? "" : getText(C0100R.string.app_name));
        this.f6871n.mo13962f();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        nqf nqfVar;
        this.f6860c.m9655b();
        this.f6877t.m7570b();
        this.f6870m.m963c(this.f6878v);
        stopForeground(true);
        gqq gqqVar = this.f6868k;
        synchronized (gqqVar.f26081b) {
            gqqVar.f26086g = 3;
            gqqVar.f26080a.mo13944f("Service destroyed, restarting? " + (gqqVar.f26083d ? "Yes" : "No"));
            if (gqqVar.f26083d) {
                gqqVar.f26083d = false;
                gqqVar.m9650b();
                nqfVar = null;
            } else {
                if (!gqqVar.f26082c.isEmpty()) {
                    throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
                }
                nqf nqfVar2 = gqqVar.f26085f;
                gqqVar.f26085f = nqf.m17621g();
                nqfVar = nqfVar2;
            }
        }
        if (nqfVar != null) {
            nqfVar.mo14894e(Object.class);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m4249d();
        startForeground(2, this.f6858a.build());
        if (this.f6879w != null) {
            return 1;
        }
        jur jurVar = new jur(9, new gqn(this, new fcn(this.f6875r), 0), "CameraProcessingThread");
        this.f6879w = jurVar;
        jurVar.start();
        return 1;
    }
}
