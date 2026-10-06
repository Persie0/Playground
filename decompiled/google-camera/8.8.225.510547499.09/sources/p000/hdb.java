package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hdb implements hdi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f27290a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27291b;

    public /* synthetic */ hdb(gzp gzpVar, int i) {
        this.f27291b = i;
        this.f27290a = gzpVar;
    }

    public /* synthetic */ hdb(hdk hdkVar, int i) {
        this.f27291b = i;
        this.f27290a = hdkVar;
    }

    public /* synthetic */ hdb(Boolean bool, int i) {
        this.f27291b = i;
        this.f27290a = bool;
    }

    public /* synthetic */ hdb(kmd kmdVar, int i) {
        this.f27291b = i;
        this.f27290a = kmdVar;
    }

    public /* synthetic */ hdb(kpp kppVar, int i) {
        this.f27291b = i;
        this.f27290a = kppVar;
    }

    public /* synthetic */ hdb(float[] fArr, int i) {
        this.f27291b = i;
        this.f27290a = fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kmd] */
    @Override // p000.hdi
    /* JADX INFO: renamed from: a */
    public final void mo10117a(Object obj) {
        switch (this.f27291b) {
            case 0:
                ((hdz) obj).m10136d(((hdk) this.f27290a).f27339o);
                break;
            case 1:
                ((hdz) obj).m10133a(this.f27290a);
                break;
            case 2:
                float[] fArr = (float[]) this.f27290a;
                Point point = new Point((int) fArr[0], (int) fArr[1]);
                hdz hdzVar = (hdz) obj;
                lku.m15613H(hdzVar.f27413d);
                if (hdzVar.f27414e) {
                    hes hesVar = hdzVar.f27410a;
                    if (hesVar instanceof hep) {
                        ((hep) hesVar).mo8065f(point);
                    }
                }
                break;
            case 3:
                ((hdz) obj).m10139g(hdk.m10120k((gzp) this.f27290a));
                break;
            case 4:
                ((hdz) obj).m10140h(((Boolean) this.f27290a).booleanValue());
                break;
            case 5:
                ?? r0 = this.f27290a;
                hdz hdzVar2 = (hdz) obj;
                lku.m15613H(hdzVar2.f27413d);
                if (hdzVar2.f27414e) {
                    hes hesVar2 = hdzVar2.f27410a;
                    if (hesVar2 instanceof her) {
                        ((her) hesVar2).mo3956i(r0);
                    }
                }
                break;
            case 6:
                ((hdz) obj).m10138f(((hdk) this.f27290a).f27342r);
                break;
            default:
                ((hdz) obj).m10137e(((hdk) this.f27290a).f27340p);
                break;
        }
    }
}
