package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class oxn extends oxt {

    /* JADX INFO: renamed from: c */
    public final oxp f46781c;

    /* JADX INFO: renamed from: d */
    public oxp f46782d;

    public oxn(oxp oxpVar) {
        super(null);
        this.f46781c = oxpVar;
    }

    @Override // p000.oxt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo19135b(Object obj, Object obj2) {
        oxp oxpVar = (oxp) obj;
        oxpVar.getClass();
        boolean z = obj2 == null;
        oxp oxpVar2 = z ? this.f46781c : this.f46782d;
        if (oxpVar2 != null && oxpVar.f46784c.m18856d(this, oxpVar2) && z) {
            oxp oxpVar3 = this.f46781c;
            oxp oxpVar4 = this.f46782d;
            oxpVar4.getClass();
            oxpVar3.m19142o(oxpVar4);
        }
    }
}
