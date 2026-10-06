package p000;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnb extends bnq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bnh f3856a;

    /* JADX INFO: renamed from: b */
    private final bnu f3857b;

    /* JADX INFO: renamed from: c */
    private final int f3858c;

    /* JADX INFO: renamed from: d */
    private final Camera f3859d;

    /* JADX INFO: renamed from: e */
    private final bni f3860e;

    public bnb(bnh bnhVar, bnu bnuVar, int i, Camera camera, bni bniVar) {
        this.f3856a = bnhVar;
        this.f3857b = bnuVar;
        this.f3859d = camera;
        this.f3858c = i;
        this.f3860e = bniVar;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: a */
    public final int mo2716a() {
        return this.f3858c;
    }

    @Override // p000.bnq
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final Camera.Parameters mo2717b() {
        bnt bntVar = new bnt();
        Camera.Parameters[] parametersArr = new Camera.Parameters[1];
        try {
            this.f3856a.f3881f.m2807b(new bmj(this, parametersArr, bntVar, 2), bntVar.f3895b, "get parameters");
        } catch (RuntimeException e) {
            ((bnh) this.f3857b).f3882g.mo2759c(e);
        }
        return parametersArr[0];
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: c */
    public final Handler mo2718c() {
        return this.f3856a.f3879d;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: d */
    public final bnu mo2719d() {
        return this.f3857b;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: e */
    public final bob mo2720e() {
        return new bni(this.f3860e);
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: f */
    public final boi mo2721f() {
        return new bnj(this.f3860e, mo2717b());
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: g */
    public final boj mo2722g() {
        return this.f3856a.f3880e;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: h */
    public final bok mo2723h() {
        return this.f3856a.f3881f;
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: j */
    public final void mo2725j(Handler handler, bnk bnkVar) {
        this.f3856a.f3881f.m2806a(new bey(this, new bmz(this, handler, bnkVar), 4));
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: m */
    public final void mo2728m(boi boiVar) {
        m2776s(boiVar, 6);
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: o */
    public final void mo2730o(Handler handler, AmbientMode.AmbientController ambientController) {
        this.f3856a.f3881f.m2806a(new bmj(this, handler, ambientController, 3, (byte[]) null));
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: p */
    public final void mo2731p(Handler handler, AmbientMode.AmbientController ambientController) {
        this.f3856a.f3881f.m2806a(new bmj(this, handler, ambientController, 4, (byte[]) null));
    }

    @Override // p000.bnq
    /* JADX INFO: renamed from: q */
    public final void mo2732q(Handler handler, AmbientModeSupport.AmbientController ambientController, bno bnoVar, bno bnoVar2) {
        try {
            this.f3856a.f3881f.m2806a(new cgg(this, handler, ambientController, bnoVar, new bna(this, handler, bnoVar2), 1, null, null, null, null));
        } catch (RuntimeException e) {
            ((bnh) this.f3857b).f3882g.mo2759c(e);
        }
    }
}
