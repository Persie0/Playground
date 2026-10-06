package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lcb implements lab {

    /* JADX INFO: renamed from: a */
    public static final lcb f37902a = new lcb(0);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37903b;

    public lcb(int i) {
        this.f37903b = i;
    }

    @Override // p000.lab
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kzx mo15098a(Object obj, Executor executor) {
        switch (this.f37903b) {
            case 0:
                return ((kyx) obj).mo15079a();
            default:
                return ((ldi) ((ldx) obj).mo15164c()).mo15079a();
        }
    }
}
