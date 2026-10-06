package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cde implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5287a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5288b;

    public cde(oju ojuVar, int i) {
        this.f5288b = i;
        this.f5287a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static cde m3489b(oju ojuVar) {
        return new cde(ojuVar, 1);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5288b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return m3490a();
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m3490a() {
        boolean z = true;
        switch (this.f5288b) {
            case 0:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dhu.f11201c));
            case 1:
                return Boolean.valueOf((!((dhv) this.f5287a.get()).mo6184l(dhu.f11206h) || ivv.f32400i == null || ivv.f32401j == null || ivv.f32402k == null || ivv.f32403l == null) ? false : true);
            case 2:
                dhv dhvVar = (dhv) this.f5287a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6179g();
                return false;
            case 3:
                dhv dhvVar2 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar2.mo6184l(dib.f11296bC) && dhvVar2.mo6184l(dib.f11344by));
            case 4:
                dhv dhvVar3 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar3.mo6184l(dhi.f11115b) && dhvVar3.mo6184l(dhi.f11120g));
            case 5:
                dhv dhvVar4 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar4.mo6184l(dhi.f11115b) && dhvVar4.mo6184l(dhi.f11119f));
            case 6:
                dhv dhvVar5 = (dhv) this.f5287a.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar5.mo6177e();
                return false;
            case 7:
                dhv dhvVar6 = (dhv) this.f5287a.get();
                dhx dhxVar3 = dib.f11240a;
                dhvVar6.mo6177e();
                return false;
            case 8:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dij.f11585i));
            case 9:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dij.f11586j));
            case 10:
                dhv dhvVar7 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar7.mo6184l(dij.f11554D) && dhvVar7.mo6184l(dij.f11555E));
            case 11:
                dhv dhvVar8 = (dhv) this.f5287a.get();
                if (dhvVar8.mo6184l(dij.f11577a)) {
                    dhvVar8.mo6177e();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                dhv dhvVar9 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar9.mo6184l(dij.f11552B) && dhvVar9.mo6184l(dij.f11553C));
            case 13:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dij.f11559I));
            case 14:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dij.f11558H));
            case 15:
                return Boolean.valueOf(((dhv) this.f5287a.get()).mo6184l(dij.f11563M));
            case 16:
                return Boolean.valueOf(enc.m7551g((dhv) this.f5287a.get()));
            case 17:
                dhv dhvVar10 = (dhv) this.f5287a.get();
                dhx dhxVar4 = dib.f11240a;
                dhvVar10.mo6179g();
                return false;
            case 18:
                dhv dhvVar11 = (dhv) this.f5287a.get();
                return Boolean.valueOf(dhvVar11.mo6184l(dis.f11705a) && dhvVar11.mo6184l(dhh.f11079ae));
            case 19:
                return Boolean.valueOf(jpd.m13434o((dhv) this.f5287a.get()));
            default:
                int i = ((dws) this.f5287a).m6830a().getApplicationInfo().flags;
                return Boolean.valueOf(((i & 1) == 0 || (i & 128) == 128) ? false : true);
        }
    }
}
