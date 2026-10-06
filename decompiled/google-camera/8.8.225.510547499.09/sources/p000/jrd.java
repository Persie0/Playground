package p000;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jrd extends Service implements jqv, jqr {

    /* JADX INFO: renamed from: a */
    public jrb f34633a;

    /* JADX INFO: renamed from: b */
    public Intent f34634b;

    /* JADX INFO: renamed from: d */
    public boolean f34636d;

    /* JADX INFO: renamed from: f */
    private ComponentName f34638f;

    /* JADX INFO: renamed from: g */
    private IBinder f34639g;

    /* JADX INFO: renamed from: h */
    private Looper f34640h;

    /* JADX INFO: renamed from: c */
    public final Object f34635c = new Object();

    /* JADX INFO: renamed from: e */
    public final jrr f34637e = new jrr(new jvh(), null, null);

    /* JADX INFO: renamed from: a */
    public void mo4518a(jtk jtkVar) {
        throw null;
    }

    @Override // p000.jqr
    /* JADX INFO: renamed from: b */
    public final void mo13473b(jrt jrtVar) {
    }

    @Override // p000.jqr
    /* JADX INFO: renamed from: c */
    public final void mo13474c(jrt jrtVar) {
    }

    @Override // p000.jqr
    /* JADX INFO: renamed from: d */
    public final void mo13475d(jrt jrtVar) {
    }

    @Override // p000.jqr
    /* JADX INFO: renamed from: e */
    public final void mo13476e(jrt jrtVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action) {
            case "com.google.android.gms.wearable.BIND_LISTENER":
            case "com.google.android.gms.wearable.DATA_CHANGED":
            case "com.google.android.gms.wearable.NODE_MIGRATED":
            case "com.google.android.gms.wearable.CHANNEL_EVENT":
            case "com.google.android.gms.wearable.REQUEST_RECEIVED":
            case "com.google.android.gms.wearable.MESSAGE_RECEIVED":
            case "com.google.android.gms.wearable.CAPABILITY_CHANGED":
                return this.f34639g;
            default:
                return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f34638f = new ComponentName(this, getClass().getName());
        if (this.f34640h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f34640h = handlerThread.getLooper();
        }
        this.f34633a = new jrb(this, this.f34640h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f34634b = intent;
        intent.setComponent(this.f34638f);
        this.f34639g = new jrc(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        synchronized (this.f34635c) {
            this.f34636d = true;
            jrb jrbVar = this.f34633a;
            if (jrbVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.f34638f));
            }
            jrbVar.getLooper().quit();
            jrbVar.m13479b();
        }
        super.onDestroy();
    }
}
