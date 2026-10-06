package p000;

import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvm implements kuo {

    /* JADX INFO: renamed from: a */
    private final LensApi.LensAvailabilityCallback f44757a;

    /* JADX INFO: renamed from: b */
    private final int f44758b;

    public nvm(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.f44757a = lensAvailabilityCallback;
        this.f44758b = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[PHI: r3
      0x0018: PHI (r3v4 int) = (r3v2 int), (r3v6 int) binds: [B:8:0x0015, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.kuo
    /* JADX INFO: renamed from: a */
    public final void mo14900a(kvb kvbVar) {
        int iM15691k;
        int i = 1;
        switch (this.f44758b) {
            case 0:
                iM15691k = lle.m15691k(kvbVar.f37314d);
                if (iM15691k != 0) {
                    i = iM15691k;
                }
                break;
            default:
                iM15691k = lle.m15691k(kvbVar.f37315e);
                if (iM15691k != 0) {
                    i = iM15691k;
                }
                break;
        }
        this.f44757a.onAvailabilityStatusFetched(i - 2);
    }
}
