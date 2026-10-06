package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fno implements eyp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22795a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22796b;

    public fno(exm exmVar, int i) {
        this.f22796b = i;
        this.f22795a = exmVar;
    }

    public fno(fnp fnpVar, int i) {
        this.f22796b = i;
        this.f22795a = fnpVar;
    }

    public fno(foc focVar, int i) {
        this.f22796b = i;
        this.f22795a = focVar;
    }

    @Override // p000.eyp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo8051a(Object obj) {
        boolean z = false;
        switch (this.f22796b) {
            case 0:
                ((fnp) this.f22795a).f22798b.f22881l = true;
                return;
            case 1:
                exr exrVar = ((exm) this.f22795a).f20749F;
                exrVar.f20865a = ((Float) obj).floatValue();
                exrVar.m8023a();
                eaj eajVar = ((exm) this.f22795a).f20778t;
                if (eajVar != null) {
                    synchronized (eajVar.f13064k) {
                        if (!eajVar.f13061h) {
                            eajVar.f13062i.post(eajVar.f13065l);
                            eajVar.f13061h = true;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 2:
                ((foc) this.f22795a).f22823B.sendEmptyMessage(105);
                return;
            case 3:
                try {
                    ((foc) this.f22795a).f22891v.join();
                    break;
                } catch (InterruptedException e) {
                    ((nbe) ((nbe) ((nbe) foc.f22821b.m17251b()).mo17283h(e)).mo17276G((char) 2387)).mo17290o("photoSpherePreviewWriter interrupted.");
                }
                ((foc) this.f22795a).f22823B.sendEmptyMessage(104);
                return;
            case 4:
                foc focVar = (foc) this.f22795a;
                if (focVar.f22885p == 0) {
                    focVar.f22836O = SystemClock.elapsedRealtime();
                    ((foc) this.f22795a).m8612C();
                }
                ((foc) this.f22795a).f22889t.mo11165i();
                foc focVar2 = (foc) this.f22795a;
                focVar2.f22885p++;
                focVar2.f22823B.sendEmptyMessage(101);
                ((foc) this.f22795a).f22874e.mo10316b(C0100R.raw.panorama_single_photo_shutter_sound);
                foc focVar3 = (foc) this.f22795a;
                if (focVar3.f22884o) {
                    return;
                }
                focVar3.f22884o = true;
                gqq gqqVar = focVar3.f22873d;
                synchronized (gqqVar.f26081b) {
                    synchronized (gqqVar.f26081b) {
                        if (gqqVar.f26086g == 1 || !gqqVar.f26082c.isEmpty()) {
                            z = true;
                        }
                        break;
                    }
                    if (z) {
                        gqqVar.f26080a.mo13940b("Not able to suspend processing.");
                        return;
                    } else {
                        gqqVar.f26080a.mo13940b("Suspend processing");
                        gqqVar.f26084e = true;
                        return;
                    }
                }
            case 5:
                ((foc) this.f22795a).f22823B.post(new fnx(this, 1, (char[]) null));
                return;
            default:
                ((foc) this.f22795a).f22823B.post(new fnx(this, 0, (byte[]) null));
                return;
        }
    }
}
