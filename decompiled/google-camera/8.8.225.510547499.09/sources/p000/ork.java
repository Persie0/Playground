package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ork extends orm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ oro f46455a;

    /* JADX INFO: renamed from: c */
    private final opx f46456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ork(oro oroVar, long j, opx opxVar) {
        super(j);
        this.f46455a = oroVar;
        this.f46456c = opxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46456c.mo18872c(this.f46455a, oki.f46196a);
    }

    @Override // p000.orm
    public final String toString() {
        String string = super.toString();
        opx opxVar = this.f46456c;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(opxVar);
        return string.concat(opxVar.toString());
    }
}
