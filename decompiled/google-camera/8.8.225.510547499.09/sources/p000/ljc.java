package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ljc implements Callable {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f38364d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ljc f38363c = new ljc(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ljc f38362b = new ljc(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ljc f38361a = new ljc(0);

    public /* synthetic */ ljc(int i) {
        this.f38364d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f38364d) {
            case 0:
                return null;
            case 1:
                return ckb.f5963f;
            case 2:
            default:
                return null;
        }
    }
}
