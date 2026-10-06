package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ity implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f32215a;

    /* JADX INFO: renamed from: b */
    private final oju f32216b;

    public ity(oju ojuVar, oju ojuVar2) {
        this.f32215a = ojuVar;
        this.f32216b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iuj get() {
        jvb jvbVarM7742a = ((erp) this.f32215a).get();
        ite iteVar = (ite) this.f32216b.get();
        jvbVarM7742a.m13537d(iteVar);
        return iteVar;
    }
}
