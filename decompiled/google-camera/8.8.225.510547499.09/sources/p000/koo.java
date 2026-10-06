package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class koo implements koh {

    /* JADX INFO: renamed from: a */
    public final Object f36703a = new Object();

    /* JADX INFO: renamed from: b */
    public final kon f36704b = new kon();

    /* JADX INFO: renamed from: c */
    private final kol f36705c;

    public koo(kol kolVar) {
        this.f36705c = kolVar;
        kolVar.f36699b = this;
        mo14619a();
    }

    @Override // p000.koh
    /* JADX INFO: renamed from: a */
    public final void mo14619a() {
        synchronized (this.f36703a) {
            System.nanoTime();
            kol kolVar = this.f36705c;
            kon konVar = this.f36704b;
            for (ktz ktzVar : kolVar.f36698a.values()) {
                ((koa) ktzVar.f37201d).mo14612b(konVar, ktzVar);
            }
        }
    }
}
