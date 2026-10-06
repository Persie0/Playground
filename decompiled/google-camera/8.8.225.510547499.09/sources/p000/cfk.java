package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfk {

    /* JADX INFO: renamed from: b */
    private static final cfi f5498b = new ces();

    /* JADX INFO: renamed from: a */
    public cfi f5499a;

    /* JADX INFO: renamed from: c */
    private final jvd f5500c;

    /* JADX INFO: renamed from: d */
    private final cfj f5501d;

    public cfk(jvd jvdVar, cfj cfjVar) {
        this.f5500c = jvdVar;
        this.f5501d = cfjVar;
    }

    /* JADX INFO: renamed from: a */
    public final cfi m3601a(jho jhoVar) {
        cfi cfiVar = this.f5499a;
        if (cfiVar != null && cfiVar.mo3573c() != 3) {
            return f5498b;
        }
        this.f5499a = this.f5501d.mo3574a(jhoVar);
        this.f5500c.execute(new cei(this, 4));
        return this.f5499a;
    }
}
