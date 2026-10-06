package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iay {

    /* JADX INFO: renamed from: a */
    public final Object f30189a;

    /* JADX INFO: renamed from: b */
    public final boolean f30190b;

    /* JADX INFO: renamed from: c */
    public final Object f30191c;

    /* JADX INFO: renamed from: d */
    public final Object f30192d;

    public iay(gzl gzlVar, Long l, nps npsVar, boolean z) {
        this.f30189a = gzlVar;
        this.f30191c = l;
        this.f30192d = npsVar;
        this.f30190b = z;
    }

    public iay(Object obj, String str, String str2, boolean z) {
        this.f30189a = obj;
        this.f30191c = str;
        this.f30192d = str2;
        this.f30190b = z;
    }

    public iay(ohb ohbVar, ohb ohbVar2, ohb ohbVar3, mrm mrmVar) {
        this.f30189a = cwd.m5640N(ohbVar);
        this.f30192d = cwd.m5640N(ohbVar2);
        this.f30191c = ohbVar3;
        this.f30190b = ((Boolean) mrmVar.mo16811e(false)).booleanValue();
    }

    public iay(boolean z, cry cryVar, mrm mrmVar, mrm mrmVar2) {
        this.f30190b = z;
        this.f30189a = cryVar;
        this.f30191c = mrmVar;
        this.f30192d = mrmVar2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ohb] */
    /* JADX INFO: renamed from: a */
    public final gbi m10996a(gbi gbiVar) {
        if (!this.f30190b) {
            return gbiVar;
        }
        Object obj = this.f30189a;
        Object obj2 = this.f30192d;
        return new gka(gbiVar, (cwd) obj, (cwd) obj2, (gof) this.f30191c.get(), 0, null, null, null);
    }

    public iay(Object obj, String str, String str2) {
        this(obj, str, str2, true);
    }
}
