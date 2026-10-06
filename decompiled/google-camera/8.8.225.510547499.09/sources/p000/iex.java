package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.ViewStub;
import com.google.android.apps.camera.p014ui.remotecontrol.RemoteControlView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iex implements fbp, fbn, fbo {

    /* JADX INFO: renamed from: a */
    public final Context f30572a;

    /* JADX INFO: renamed from: b */
    final Handler f30573b;

    /* JADX INFO: renamed from: c */
    public RemoteControlView f30574c;

    /* JADX INFO: renamed from: d */
    public ViewStub f30575d;

    /* JADX INFO: renamed from: e */
    public elx f30576e;

    /* JADX INFO: renamed from: f */
    public ieu f30577f;

    /* JADX INFO: renamed from: g */
    public Intent f30578g;

    /* JADX INFO: renamed from: k */
    private final guk f30582k;

    /* JADX INFO: renamed from: h */
    public boolean f30579h = false;

    /* JADX INFO: renamed from: i */
    public boolean f30580i = false;

    /* JADX INFO: renamed from: l */
    private final guj f30583l = new iev(this);

    /* JADX INFO: renamed from: j */
    public final BroadcastReceiver f30581j = new iew(this);

    public iex(Context context, guk gukVar) {
        this.f30572a = context;
        this.f30582k = gukVar;
        this.f30573b = new Handler(context.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public final void m11158a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1) * 100;
        float intExtra2 = intent.getIntExtra("scale", -1);
        RemoteControlView remoteControlView = this.f30574c;
        if (remoteControlView != null) {
            int i = (int) (intExtra / intExtra2);
            if (i < 0 || i > 100) {
                remoteControlView.f7165b.setText("--");
                return;
            }
            remoteControlView.f7165b.setText(i + "%");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11159b(int i) {
        this.f30573b.post(new gdi(this, i, 3));
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        RemoteControlView remoteControlView = this.f30574c;
        if (remoteControlView != null) {
            remoteControlView.m4428a();
        }
        this.f30582k.m9776a(this.f30583l);
        guk gukVar = this.f30582k;
        if (gukVar.f26433a) {
            this.f30580i = gukVar.f26434b;
            m11159b(gukVar.f26435c);
            if (this.f30582k.m9779d()) {
                m11160c(this.f30582k.f26436d);
            }
            if (this.f30582k.m9779d()) {
                m11161f(this.f30582k.f26438f);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11160c(float f) {
        this.f30573b.post(new euw(this, f, 5));
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        if (this.f30574c != null && this.f30579h) {
            this.f30576e.mo7485g(this.f30577f);
            this.f30572a.unregisterReceiver(this.f30581j);
            this.f30579h = false;
        }
        this.f30582k.m9777b(this.f30583l);
        this.f30576e.mo7489k(ely.SMARTS);
    }

    /* JADX INFO: renamed from: f */
    public final void m11161f(float f) {
        this.f30573b.post(new euw(this, f, 6));
    }
}
