package p000;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jupiter.JupiterButton;
import com.google.android.apps.camera.p014ui.bottomsheet.BottomSheetButton;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enn implements enq, fbn, fbo {

    /* JADX INFO: renamed from: a */
    public final BottomBarController f14764a;

    /* JADX INFO: renamed from: b */
    public final eno f14765b;

    /* JADX INFO: renamed from: c */
    public final jwn f14766c;

    /* JADX INFO: renamed from: d */
    public final gjj f14767d;

    /* JADX INFO: renamed from: e */
    public final etn f14768e;

    /* JADX INFO: renamed from: f */
    private final Activity f14769f;

    /* JADX INFO: renamed from: g */
    private final dbr f14770g;

    /* JADX INFO: renamed from: h */
    private final jvd f14771h;

    /* JADX INFO: renamed from: i */
    private final hai f14772i;

    /* JADX INFO: renamed from: j */
    private BottomBarListener f14773j;

    /* JADX INFO: renamed from: k */
    private JupiterButton f14774k;

    /* JADX INFO: renamed from: l */
    private aea f14775l;

    /* JADX INFO: renamed from: m */
    private final cdu f14776m;

    public enn(Activity activity, cdu cduVar, BottomBarController bottomBarController, dbr dbrVar, jvd jvdVar, jwn jwnVar, eno enoVar, gjj gjjVar, etn etnVar, hai haiVar, byte[] bArr, byte[] bArr2) {
        this.f14769f = activity;
        this.f14776m = cduVar;
        this.f14764a = bottomBarController;
        this.f14770g = dbrVar;
        this.f14771h = jvdVar;
        this.f14767d = gjjVar;
        this.f14765b = enoVar;
        this.f14768e = etnVar;
        this.f14766c = jwnVar;
        this.f14772i = haiVar;
    }

    /* JADX INFO: renamed from: a */
    public final View m7563a() {
        if (this.f14774k == null) {
            jvd.m13538a();
            this.f14774k = (JupiterButton) View.inflate(this.f14769f, C0100R.layout.jupiter_button, null);
        }
        return this.f14774k;
    }

    @Override // p000.enq
    /* JADX INFO: renamed from: b */
    public final void mo7564b() {
        this.f14776m.m3529i().m13537d(this.f14766c.mo3830a(new dsu(this, 5), this.f14771h));
        this.f14776m.m3529i().m13537d(this.f14770g.mo3830a(new dsu(this, 6), this.f14771h));
        this.f14773j = new enm(this);
        this.f14775l = new C0078bx(this, 7);
        this.f14771h.execute(new elu(this, 2));
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f14764a.addListener(this.f14773j);
        eno enoVar = this.f14765b;
        aea aeaVar = this.f14775l;
        awk awkVar = enoVar.f14779c;
        jvd jvdVar = enoVar.f14777a;
        jvdVar.getClass();
        aeaVar.getClass();
        our ourVarMo2061a = awkVar.f2589b.mo2061a();
        ReentrantLock reentrantLock = awkVar.f2590c;
        reentrantLock.lock();
        try {
            if (awkVar.f2591d.get(aeaVar) == null) {
                awkVar.f2591d.put(aeaVar, ooc.m18746l(oqv.m18925f(oqv.m18931l(jvdVar)), null, new awj(ourVarMo2061a, aeaVar, null), 3));
            }
            reentrantLock.unlock();
            gjj gjjVar = this.f14767d;
            ((BottomSheetButton) gjjVar.f25002e).setOnClickListener(new ViewOnClickListenerC0250hu(this, 14));
            gjj gjjVar2 = this.f14767d;
            ((BottomSheetButton) gjjVar2.f25003f).setOnClickListener(new ViewOnClickListenerC0250hu(this, 15));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7565c() {
        if (((Boolean) this.f14766c.mo3831be()).booleanValue()) {
            return;
        }
        this.f14772i.mo10033e(gzy.f27016aA, true);
        eno enoVar = this.f14765b;
        Activity activity = this.f14769f;
        if (enoVar.f14781e != null || enoVar.f14780d) {
            return;
        }
        awk awkVar = enoVar.f14779c;
        jvd jvdVar = enoVar.f14777a;
        jvdVar.getClass();
        awkVar.f2589b.mo2062b(activity, jvdVar, enoVar);
        enoVar.f14780d = true;
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f14764a.removeListener(this.f14773j);
        eno enoVar = this.f14765b;
        aea aeaVar = this.f14775l;
        awk awkVar = enoVar.f14779c;
        aeaVar.getClass();
        ReentrantLock reentrantLock = awkVar.f2590c;
        reentrantLock.lock();
        try {
            ory oryVar = (ory) awkVar.f2591d.get(aeaVar);
            if (oryVar != null) {
                oryVar.mo18977r(null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
