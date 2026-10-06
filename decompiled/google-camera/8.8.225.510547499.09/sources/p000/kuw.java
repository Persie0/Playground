package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kuw implements ThreadFactory {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37262c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kuw f37261b = new kuw(2);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kuw f37260a = new kuw(0);

    public /* synthetic */ kuw(int i) {
        this.f37262c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f37262c) {
            case 0:
                return new Thread(runnable, "LensSvConn");
            case 1:
                return new adx(runnable);
            default:
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
