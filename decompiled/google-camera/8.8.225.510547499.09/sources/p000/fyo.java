package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23931a;

    /* JADX INFO: renamed from: b */
    private final oju f23932b;

    /* JADX INFO: renamed from: c */
    private final oju f23933c;

    /* JADX INFO: renamed from: d */
    private final oju f23934d;

    public fyo(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f23931a = ojuVar;
        this.f23932b = ojuVar2;
        this.f23933c = ojuVar3;
        this.f23934d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static fyo m8954b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fyo(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyn get() {
        return new fyn(((cen) this.f23931a).get(), (grc) this.f23932b.get(), ((geb) this.f23933c).get(), ((fzk) this.f23934d).get(), null, null, null, null);
    }
}
