package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etl implements oju {

    /* JADX INFO: renamed from: a */
    private final oju f19833a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f19834b;

    private etl(oju ojuVar, int i, byte[] bArr) {
        this.f19834b = i;
        ojuVar.getClass();
        this.f19833a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static oju m7863b(oju ojuVar) {
        return new etl(ojuVar, 0);
    }

    /* JADX INFO: renamed from: c */
    public static oju m7864c(oju ojuVar) {
        return new etl(ojuVar, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static oju m7865d(oju ojuVar) {
        return new etl(ojuVar, 2, (char[]) null);
    }

    private etl(oju ojuVar, int i) {
        this.f19834b = i;
        ojuVar.getClass();
        this.f19833a = ojuVar;
    }

    private etl(oju ojuVar, int i, char[] cArr) {
        this.f19834b = i;
        ojuVar.getClass();
        this.f19833a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public final mrm m7866a() {
        switch (this.f19834b) {
            case 0:
                return mrm.m16829i(ohh.m18485a(this.f19833a));
            case 1:
                return mrm.m16829i(this.f19833a.get());
            default:
                return mrm.m16829i(this.f19833a);
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f19834b) {
            case 0:
                break;
            case 1:
                break;
        }
        return m7866a();
    }
}
