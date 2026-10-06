package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cab extends bzs {

    /* JADX INFO: renamed from: u */
    private static cab f4881u;

    /* JADX INFO: renamed from: a */
    public static cab m3345a() {
        if (f4881u == null) {
            cab cabVar = (cab) new cab().m3294D(bwy.f4669b, new bwp());
            cabVar.m3306P();
            f4881u = cabVar;
        }
        return f4881u;
    }

    /* JADX INFO: renamed from: b */
    public static cab m3346b(Class cls) {
        return (cab) new cab().m3308n(cls);
    }

    /* JADX INFO: renamed from: c */
    public static cab m3347c(bsk bskVar) {
        return (cab) new cab().m3309o(bskVar);
    }

    @Override // p000.bzs
    public final boolean equals(Object obj) {
        return (obj instanceof cab) && super.equals(obj);
    }
}
