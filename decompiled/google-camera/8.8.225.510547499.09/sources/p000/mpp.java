package p000;

import java.util.function.Consumer;
import p021j$.util.Optional;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mpp implements mpu {

    /* JADX INFO: renamed from: a */
    public Optional f41263a = Optional.empty();

    /* JADX INFO: renamed from: b */
    private final Optional f41264b;

    /* JADX INFO: renamed from: c */
    private final int f41265c;

    public mpp(int i, Optional optional) {
        this.f41265c = i;
        this.f41264b = optional;
    }

    @Override // p000.mpu
    /* JADX INFO: renamed from: a */
    public final void mo16740a(byte[] bArr) {
        if (this.f41265c == 1) {
            this.f41264b.ifPresent(new idi(bArr, 8));
        } else {
            this.f41263a.ifPresent(new idi(bArr, 9));
        }
    }

    @Override // p000.mpu
    /* JADX INFO: renamed from: b */
    public final void mo16741b(final int i) {
        this.f41264b.ifPresent(new Consumer() { // from class: mpo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((inr) obj).mo10343c(i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // p000.mpu
    /* JADX INFO: renamed from: c */
    public final void mo16742c() {
        if (this.f41265c == 1) {
            this.f41264b.ifPresent(new mpn(0));
        }
    }

    @Override // p000.mpu
    /* JADX INFO: renamed from: d */
    public final void mo16743d() {
        if (this.f41265c == 1) {
            this.f41264b.ifPresent(new mpn(2));
        }
    }
}
