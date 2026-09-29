package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ho0 extends bj0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42682c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CarouselLayoutManager f42683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.f42682c = i;
        switch (i) {
            case 1:
                this.f42683d = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.f42683d = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.bj0
    /* JADX INFO: renamed from: e */
    public final int mo3752e() {
        int i = this.f42682c;
        CarouselLayoutManager carouselLayoutManager = this.f42683d;
        switch (i) {
            case 0:
                return carouselLayoutManager.f69185o;
            default:
                return carouselLayoutManager.f69185o - carouselLayoutManager.m24890G();
        }
    }

    @Override // p000.bj0
    /* JADX INFO: renamed from: f */
    public final int mo3753f() {
        switch (this.f42682c) {
            case 0:
                return this.f42683d.m24891H();
            default:
                return 0;
        }
    }

    @Override // p000.bj0
    /* JADX INFO: renamed from: g */
    public final int mo3754g() {
        int i = this.f42682c;
        CarouselLayoutManager carouselLayoutManager = this.f42683d;
        switch (i) {
            case 0:
                return carouselLayoutManager.f69184n - carouselLayoutManager.m24893I();
            default:
                return carouselLayoutManager.f69184n;
        }
    }

    @Override // p000.bj0
    /* JADX INFO: renamed from: h */
    public final int mo3755h() {
        switch (this.f42682c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f42683d;
                if (carouselLayoutManager.m6093L0()) {
                    return carouselLayoutManager.f69184n;
                }
                return 0;
        }
    }

    @Override // p000.bj0
    /* JADX INFO: renamed from: j */
    public final int mo3756j() {
        switch (this.f42682c) {
            case 0:
                return 0;
            default:
                return this.f42683d.m24894J();
        }
    }
}
