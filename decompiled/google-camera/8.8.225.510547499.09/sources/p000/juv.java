package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class juv implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34864a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34865b;

    public juv(eoa eoaVar, int i) {
        this.f34865b = i;
        this.f34864a = eoaVar;
    }

    public juv(jzd jzdVar, int i) {
        this.f34865b = i;
        this.f34864a = jzdVar;
    }

    public juv(kao kaoVar, int i) {
        this.f34865b = i;
        this.f34864a = kaoVar;
    }

    public juv(lav lavVar, int i) {
        this.f34865b = i;
        this.f34864a = lavVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f34865b) {
            case 0:
                return;
            case 1:
                ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(th)).mo17276G((char) 1638)).mo17290o("Encoder writing failed");
                synchronized (((eoa) this.f34864a).f14806c) {
                    ((eob) ((eoa) this.f34864a).f14804a).f14812e.mo8566a(th);
                    Object obj = this.f34864a;
                    ((eoc) ((eoa) obj).f14806c).f14831j.remove(((eob) ((eoa) obj).f14804a).f14808a);
                    break;
                }
                return;
            case 2:
                Log.e("AudioEncoder", "Stopping recording due to: ", th);
                ((jzd) this.f34864a).f35252n.m13792a(jzf.OTHER);
                return;
            default:
                ((lav) this.f34864a).m15131m(kzy.m15111a(th));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kao] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        switch (this.f34865b) {
            case 0:
                this.f34864a.mo3483a(obj);
                return;
            case 1:
                nbz nbzVar = nch.f41987a;
                synchronized (((eoa) this.f34864a).f14806c) {
                    ((eob) ((eoa) this.f34864a).f14804a).f14812e.mo14894e(true);
                    Object obj2 = this.f34864a;
                    ((eoc) ((eoa) obj2).f14806c).f14831j.remove(((eob) ((eoa) obj2).f14804a).f14808a);
                    break;
                }
                return;
            case 2:
                return;
            default:
                if (obj != null) {
                    ((lav) this.f34864a).m15130l(obj);
                    return;
                }
                ((lav) this.f34864a).m15131m(kzy.m15111a(new NullPointerException("Function output is null")));
                return;
        }
    }
}
