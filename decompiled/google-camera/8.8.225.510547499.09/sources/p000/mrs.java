package p000;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mrs extends Random {
    private static final long serialVersionUID = 898001275432099254L;

    /* JADX INFO: renamed from: a */
    private final boolean f41483a = true;

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f41483a) {
            throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
        }
        super.setSeed(j);
    }
}
