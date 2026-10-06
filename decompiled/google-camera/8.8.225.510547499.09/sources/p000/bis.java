package p000;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bis extends bie {
    public bis(bko bkoVar, byte[] bArr) {
        this(bkoVar, null, null);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: a */
    public final float mo2488a() {
        return 1.0f;
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: e */
    public final Object mo2492e() {
        return this.f3408d.f3652a;
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final Object mo2493f(bmf bmfVar, float f) {
        return mo2492e();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: h */
    public final void mo2495h() {
        if (this.f3408d != null) {
            super.mo2495h();
        }
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: i */
    public final void mo2496i(float f) {
        this.f3407c = f;
    }

    public bis(bko bkoVar, byte[] bArr, byte[] bArr2) {
        super(Collections.emptyList());
        this.f3408d = bkoVar;
    }
}
