package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ero extends fbs {

    /* JADX INFO: renamed from: q */
    public kbz f15254q;

    /* JADX INFO: renamed from: r */
    public fao f15255r;

    /* JADX INFO: renamed from: s */
    public chx f15256s;

    /* JADX INFO: renamed from: t */
    private final Object f15257t = new Object();

    /* JADX INFO: renamed from: u */
    private boolean f15258u = false;

    /* JADX INFO: renamed from: v */
    private cdu f15259v;

    /* JADX INFO: renamed from: w */
    private volatile C1058va f15260w;

    /* JADX INFO: renamed from: z */
    private volatile gtd f15261z;

    public ero() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("GcaActivity(");
        sb.append(simpleName);
        sb.append(")");
    }

    /* JADX INFO: renamed from: q */
    private final void m7737q() {
        if (this.f15258u) {
            return;
        }
        synchronized (this.f15257t) {
            if (!this.f15258u) {
                eso esoVarMo4194f = ((CameraApp) getApplicationContext()).mo4194f();
                this.f15254q = (kbz) ((esz) esoVarMo4194f).f16747h.get();
                this.f15256s = (chx) ((esz) esoVarMo4194f).f17299z.get();
                this.f15255r = fav.m8088b(((esz) esoVarMo4194f).f16770hW);
                chx chxVar = this.f15256s;
                chxVar.getClass();
                lku.m15669w(true);
                this.f15259v = new cdu(chxVar);
                this.f15258u = true;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m7738r() {
        Integer.toHexString(hashCode());
    }

    /* JADX INFO: renamed from: n */
    protected final kbz m7739n() {
        m7737q();
        return this.f15254q;
    }

    /* JADX INFO: renamed from: o */
    protected final C1058va m7740o() {
        m7737q();
        if (this.f15260w == null) {
            synchronized (this.f15257t) {
                if (this.f15260w == null) {
                    fan fanVar = this.f21197x;
                    exg exgVar = this.f21198y;
                    fanVar.m8097e(this.f15255r);
                    fan fanVar2 = this.f21197x;
                    m7737q();
                    this.f15260w = new C1058va(this, fanVar2, exgVar, this.f15259v, (byte[]) null);
                }
            }
        }
        return this.f15260w;
    }

    @Override // p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        m7737q();
        mhq.m16381a(this);
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onCreate");
        cdu cduVar = this.f15259v;
        synchronized (cduVar.f5331a) {
            if (cduVar.f5337g.m3826a()) {
                cduVar.f5334d = cduVar.f5338h.m3790b();
                jvb jvbVar = cduVar.f5334d;
                cjp cjpVar = new cjp();
                jvbVar.m13537d(cjpVar);
                cduVar.f5337g = cjpVar;
                cduVar.f5333c = cduVar.f5338h.m3791c(cduVar.f5334d);
                jvb jvbVar2 = cduVar.f5333c;
                cjp cjpVar2 = new cjp();
                jvbVar2.m13537d(cjpVar2);
                cduVar.f5336f = cjpVar2;
                cduVar.f5332b = cduVar.f5338h.m3789a(cduVar.f5333c);
                jvb jvbVar3 = cduVar.f5332b;
                cjp cjpVar3 = new cjp();
                jvbVar3.m13537d(cjpVar3);
                cduVar.f5335e = cjpVar3;
            }
        }
        super.onCreate(bundle);
        this.f15254q.mo13962f();
    }

    @Override // p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onDestroy() {
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onDestroy");
        super.onDestroy();
        this.f15259v.mo3521bC();
        this.f15254q.mo13962f();
    }

    @Override // p000.fbs, p000.ActivityC0907pl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        m7738r();
        super.onNewIntent(intent);
    }

    @Override // p000.fbs, p000.ActivityC0080bz, android.app.Activity
    protected void onPause() {
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onPause");
        super.onPause();
        this.f15259v.mo3522bE();
        this.f15254q.mo13962f();
    }

    @Override // p000.fbs, p000.ActivityC0080bz, android.app.Activity
    protected void onResume() {
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onResume");
        this.f15259v.mo3523bF();
        super.onResume();
        this.f15254q.mo13962f();
    }

    @Override // p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onStart() {
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onStart");
        this.f15259v.mo3524bG();
        super.onStart();
        this.f15254q.mo13962f();
    }

    @Override // p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onStop() {
        m7738r();
        this.f15254q.mo13961e("GcaActivity#onStop");
        super.onStop();
        this.f15259v.mo3525e();
        this.f15254q.mo13962f();
    }

    /* JADX INFO: renamed from: p */
    protected final gtd m7741p() {
        if (this.f15261z == null) {
            synchronized (this.f15257t) {
                if (this.f15261z == null) {
                    this.f15261z = new gtd(this);
                }
            }
        }
        return this.f15261z;
    }
}
