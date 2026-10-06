package p000;

import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nvk implements kus {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LensApi.LensAvailabilityCallback f44753a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f44754b;

    public /* synthetic */ nvk(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.f44754b = i;
        this.f44753a = lensAvailabilityCallback;
    }

    @Override // p000.kus
    /* JADX INFO: renamed from: a */
    public final void mo14904a(int i) {
        switch (this.f44754b) {
            case 0:
                LensApi.LensAvailabilityCallback lensAvailabilityCallback = this.f44753a;
                int i2 = LensApi.f8407d;
                if (i == 0) {
                    throw null;
                }
                lensAvailabilityCallback.onAvailabilityStatusFetched(i - 2);
                return;
            default:
                LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.f44753a;
                int i3 = LensApi.f8407d;
                if (i == 0) {
                    throw null;
                }
                lensAvailabilityCallback2.onAvailabilityStatusFetched(i - 2);
                return;
        }
    }
}
