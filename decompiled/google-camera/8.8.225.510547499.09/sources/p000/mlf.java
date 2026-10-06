package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mlf extends mlj {

    /* JADX INFO: renamed from: a */
    private final mlh f40970a;

    /* JADX INFO: renamed from: b */
    private final float f40971b;

    /* JADX INFO: renamed from: c */
    private final float f40972c;

    public mlf(mlh mlhVar, float f, float f2) {
        this.f40970a = mlhVar;
        this.f40971b = f;
        this.f40972c = f2;
    }

    /* JADX INFO: renamed from: a */
    final float m16600a() {
        mlh mlhVar = this.f40970a;
        return (float) Math.toDegrees(Math.atan((mlhVar.f40981b - this.f40972c) / (mlhVar.f40980a - this.f40971b)));
    }
}
