package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gnb implements oju {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fuf f25675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ikw f25676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dhv f25677c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mrm f25678d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fvu f25679e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f25680f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ djm f25681g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f25682h;

    public /* synthetic */ gnb(fvu fvuVar, imu imuVar, djm djmVar, fuf fufVar, ikw ikwVar, dhv dhvVar, mrm mrmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f25682h = i;
        this.f25679e = fvuVar;
        this.f25680f = imuVar;
        this.f25681g = djmVar;
        this.f25675a = fufVar;
        this.f25676b = ikwVar;
        this.f25677c = dhvVar;
        this.f25678d = mrmVar;
    }

    public /* synthetic */ gnb(fvu fvuVar, kmd kmdVar, djm djmVar, fuf fufVar, ikw ikwVar, dhv dhvVar, mrm mrmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f25682h = i;
        this.f25679e = fvuVar;
        this.f25680f = kmdVar;
        this.f25681g = djmVar;
        this.f25675a = fufVar;
        this.f25676b = ikwVar;
        this.f25677c = dhvVar;
        this.f25678d = mrmVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kmd] */
    @Override // p000.oju
    public final Object get() {
        switch (this.f25682h) {
            case 0:
                fvu fvuVar = this.f25679e;
                Object obj = this.f25680f;
                djm djmVar = this.f25681g;
                fuf fufVar = this.f25675a;
                ikw ikwVar = this.f25676b;
                dhv dhvVar = this.f25677c;
                mrm mrmVar = this.f25678d;
                lku.m15669w(fvuVar.mo14544M() && fvuVar.mo14535D());
                kmd kmdVarM11493h = ((imu) obj).m11493h();
                kmdVarM11493h.mo14556i();
                kmdVarM11493h.mo14565r();
                return goy.m9597j(djmVar, kmdVarM11493h, fufVar, ikwVar, dhvVar, mrmVar, true);
            case 1:
                fvu fvuVar2 = this.f25679e;
                Object obj2 = this.f25680f;
                djm djmVar2 = this.f25681g;
                fuf fufVar2 = this.f25675a;
                ikw ikwVar2 = this.f25676b;
                dhv dhvVar2 = this.f25677c;
                mrm mrmVar2 = this.f25678d;
                lku.m15669w(fvuVar2.mo14544M() && fvuVar2.mo14535D());
                kmd kmdVarM11489d = ((imu) obj2).m11489d();
                kmdVarM11489d.mo14556i();
                kmdVarM11489d.mo14565r();
                return goy.m9597j(djmVar2, kmdVarM11489d, fufVar2, ikwVar2, dhvVar2, mrmVar2, true);
            default:
                fvu fvuVar3 = this.f25679e;
                ?? r4 = this.f25680f;
                djm djmVar3 = this.f25681g;
                fuf fufVar3 = this.f25675a;
                ikw ikwVar3 = this.f25676b;
                dhv dhvVar3 = this.f25677c;
                mrm mrmVar3 = this.f25678d;
                lku.m15669w(fvuVar3.mo14544M() && fvuVar3.mo14535D());
                r4.mo14565r();
                return goy.m9597j(djmVar3, r4, fufVar3, ikwVar3, dhvVar3, mrmVar3, false);
        }
    }
}
