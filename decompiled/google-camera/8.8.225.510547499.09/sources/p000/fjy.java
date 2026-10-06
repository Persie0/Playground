package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22350a;

    /* JADX INFO: renamed from: b */
    private final oju f22351b;

    public fjy(oju ojuVar, oju ojuVar2) {
        this.f22350a = ojuVar;
        this.f22351b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgz get() {
        fhb fhbVar = ((fkc) this.f22350a).get();
        fgz fgzVar = ((fja) this.f22351b).get();
        fib fibVar = new fib();
        switch (fhbVar) {
            case FRAMEWORK:
                return fibVar;
            case GCA:
                return fgzVar;
            default:
                throw new IllegalStateException("Unknown muxer type: ".concat(fhbVar.toString()));
        }
    }
}
