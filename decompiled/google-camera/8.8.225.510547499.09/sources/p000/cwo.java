package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwo extends jxd implements cws {

    /* JADX INFO: renamed from: a */
    private final dhv f9884a;

    public cwo(dhv dhvVar, haq haqVar) {
        super(haqVar);
        this.f9884a = dhvVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        return jxn.m13653b(((gzm) obj).name());
    }

    @Override // p000.jxd, p000.jwn
    /* JADX INFO: renamed from: be */
    public final /* bridge */ /* synthetic */ Object mo3831be() {
        return (jxn) this.f9884a.mo6173a(dhh.f11089b).map(new cwp(this, 1)).orElse((jxn) super.mo3831be());
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        return gzm.m10017a(((jxn) obj).name());
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ jxn m5686d(Integer num) {
        if (num.intValue() == 30) {
            return jxn.FPS_30;
        }
        if (num.intValue() == 60) {
            return jxn.FPS_60;
        }
        return num.intValue() == 0 ? jxn.FPS_AUTO : (jxn) super.mo3831be();
    }
}
