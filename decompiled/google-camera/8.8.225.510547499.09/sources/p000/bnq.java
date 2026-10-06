package p000;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bnq {
    /* JADX INFO: renamed from: a */
    public abstract int mo2716a();

    @Deprecated
    /* JADX INFO: renamed from: b */
    public abstract Camera.Parameters mo2717b();

    /* JADX INFO: renamed from: c */
    public abstract Handler mo2718c();

    /* JADX INFO: renamed from: d */
    public abstract bnu mo2719d();

    /* JADX INFO: renamed from: e */
    public abstract bob mo2720e();

    /* JADX INFO: renamed from: f */
    public abstract boi mo2721f();

    /* JADX INFO: renamed from: g */
    public abstract boj mo2722g();

    /* JADX INFO: renamed from: h */
    public abstract bok mo2723h();

    /* JADX INFO: renamed from: i */
    public void mo2724i(byte[] bArr) {
        try {
            mo2723h().m2806a(new bey(this, bArr, 10));
        } catch (RuntimeException e) {
            mo2719d().mo2744c().mo2759c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo2725j(Handler handler, bnk bnkVar);

    /* JADX INFO: renamed from: k */
    public void mo2726k(boolean z) {
        try {
            mo2723h().m2806a(new bnp(this, z, 0));
        } catch (RuntimeException e) {
            mo2719d().mo2744c().mo2759c(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo2727l(SurfaceTexture surfaceTexture) {
        try {
            mo2723h().m2806a(new bey(this, surfaceTexture, 11));
        } catch (RuntimeException e) {
            mo2719d().mo2744c().mo2759c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo2728m(boi boiVar);

    /* JADX INFO: renamed from: n */
    public void mo2729n() {
        if (mo2722g().m2803d()) {
            return;
        }
        bnt bntVar = new bnt();
        try {
            mo2723h().m2807b(new bey(this, bntVar, 12), bntVar.f3895b, "set preview texture");
        } catch (RuntimeException e) {
            mo2719d().mo2744c().mo2759c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo2730o(Handler handler, AmbientMode.AmbientController ambientController);

    /* JADX INFO: renamed from: p */
    public abstract void mo2731p(Handler handler, AmbientMode.AmbientController ambientController);

    /* JADX INFO: renamed from: q */
    public abstract void mo2732q(Handler handler, AmbientModeSupport.AmbientController ambientController, bno bnoVar, bno bnoVar2);

    /* JADX INFO: renamed from: r */
    public final void m2775r(Handler handler, bnr bnrVar) {
        try {
            mo2723h().m2806a(new bmj(this, handler, bnrVar, 6));
        } catch (RuntimeException e) {
            mo2719d().mo2744c().mo2759c(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX INFO: renamed from: s */
    protected final boolean m2776s(boi boiVar, int i) {
        int i2;
        bnx bnxVar;
        bon bonVarM2792e;
        bon bonVarM2793f;
        if (boiVar == null) {
            bop.m2818g(bnu.f3896i);
            return false;
        }
        bob bobVarMo2720e = mo2720e();
        float f = boiVar.f3999p;
        if (bobVarMo2720e.m2784d(bnw.ZOOM)) {
            if (boiVar.f3999p > bobVarMo2720e.f3974t) {
                boo booVar = bob.f3955a;
                StringBuilder sb = new StringBuilder();
                sb.append("Zoom ratio is not supported: ratio = ");
                sb.append(boiVar.f3999p);
                bop.m2818g(booVar);
            } else {
                i2 = boiVar.f4000q;
                if (i2 <= bobVarMo2720e.f3969o) {
                    bop.m2818g(bob.f3955a);
                } else {
                    bop.m2818g(bob.f3955a);
                }
            }
        } else if (f != 1.0f) {
            bop.m2818g(bob.f3955a);
        } else {
            i2 = boiVar.f4000q;
            if (i2 <= bobVarMo2720e.f3969o || i2 < bobVarMo2720e.f3968n) {
                bop.m2818g(bob.f3955a);
            } else {
                bny bnyVar = boiVar.f4002s;
                if (bobVarMo2720e.m2786f(bnyVar)) {
                    bnxVar = boiVar.f4001r;
                    if (bobVarMo2720e.m2785e(bnxVar)) {
                        bonVarM2792e = boiVar.m2792e();
                        if (bobVarMo2720e.f3960f.contains(bonVarM2792e)) {
                            bonVarM2793f = boiVar.m2793f();
                            if (!bobVarMo2720e.f3957c.contains(bonVarM2793f)) {
                                boo booVar2 = bob.f3955a;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unsupported preview size:");
                                sb2.append(bonVarM2793f);
                                bonVarM2793f.toString();
                                bop.m2818g(booVar2);
                            } else {
                                if (boiVar.f4005v || bobVarMo2720e.m2784d(bnw.VIDEO_STABILIZATION)) {
                                    try {
                                        mo2723h().m2806a(new RunnableC0904pi(this, i, boiVar.mo2753a(), 8));
                                        return true;
                                    } catch (RuntimeException e) {
                                        mo2719d().mo2744c().mo2759c(e);
                                        return true;
                                    }
                                }
                                bop.m2818g(bob.f3955a);
                            }
                        } else {
                            boo booVar3 = bob.f3955a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unsupported photo size:");
                            sb3.append(bonVarM2792e);
                            bonVarM2792e.toString();
                            bop.m2818g(booVar3);
                        }
                    } else {
                        boo booVar4 = bob.f3955a;
                        if (bnxVar != null) {
                            bnxVar.name();
                        }
                        bop.m2818g(booVar4);
                    }
                } else if (bobVarMo2720e.m2786f(bny.FIXED)) {
                    bop.m2814c(bob.f3955a, "Focus mode not supported... trying FIXED");
                    boiVar.f4002s = bny.FIXED;
                    bnxVar = boiVar.f4001r;
                    if (bobVarMo2720e.m2785e(bnxVar)) {
                        boo booVar5 = bob.f3955a;
                        if (bnxVar != null) {
                            bnxVar.name();
                        }
                        bop.m2818g(booVar5);
                    } else {
                        bonVarM2792e = boiVar.m2792e();
                        if (bobVarMo2720e.f3960f.contains(bonVarM2792e)) {
                            bonVarM2793f = boiVar.m2793f();
                            if (!bobVarMo2720e.f3957c.contains(bonVarM2793f)) {
                                if (boiVar.f4005v) {
                                }
                                mo2723h().m2806a(new RunnableC0904pi(this, i, boiVar.mo2753a(), 8));
                                return true;
                            }
                            boo booVar6 = bob.f3955a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Unsupported preview size:");
                            sb4.append(bonVarM2793f);
                            bonVarM2793f.toString();
                            bop.m2818g(booVar6);
                        } else {
                            boo booVar7 = bob.f3955a;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Unsupported photo size:");
                            sb5.append(bonVarM2792e);
                            bonVarM2792e.toString();
                            bop.m2818g(booVar7);
                        }
                    }
                } else {
                    boo booVar8 = bob.f3955a;
                    if (bnyVar != null) {
                        bnyVar.name();
                    }
                    bop.m2818g(booVar8);
                }
            }
        }
        bop.m2814c(bnu.f3896i, EArqVBjecl.xDJIMWyAS);
        return false;
    }
}
