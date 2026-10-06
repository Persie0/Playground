package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecj implements msi {

    /* JADX INFO: renamed from: a */
    private final mrm f13352a;

    /* JADX INFO: renamed from: b */
    private final ikw f13353b;

    /* JADX INFO: renamed from: c */
    private final int f13354c;

    /* JADX INFO: renamed from: d */
    private final int f13355d;

    /* JADX INFO: renamed from: e */
    private final int f13356e;

    /* JADX INFO: renamed from: f */
    private final eby f13357f;

    public ecj(ebv ebvVar, mrm mrmVar, ikw ikwVar, eby ebyVar) {
        this.f13352a = mrmVar;
        this.f13353b = ikwVar;
        int i = ebvVar.f13300b;
        this.f13356e = i;
        this.f13357f = ebyVar;
        this.f13354c = i - ebvVar.f13302d;
        this.f13355d = i - ebvVar.f13303e;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer mo6051a() {
        if (this.f13353b.equals(ikw.MOTION_BLUR) || this.f13353b.equals(ikw.LONG_EXPOSURE) || ((Boolean) this.f13357f.f13316b.mo3831be()).booleanValue()) {
            return Integer.valueOf(this.f13354c);
        }
        mrm mrmVar = this.f13352a;
        if (!mrmVar.mo16813g()) {
            return Integer.valueOf(this.f13356e);
        }
        if (((ftm) mrmVar.mo16809c()).mo8764a() == 1) {
            return Integer.valueOf(this.f13356e);
        }
        return ((ftm) this.f13352a.mo16809c()).mo8764a() == 2 ? Integer.valueOf(this.f13355d) : Integer.valueOf(this.f13354c);
    }
}
