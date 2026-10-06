package p000;

import p021j$.nio.file.Path;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mps {

    /* JADX INFO: renamed from: a */
    public Optional f41283a;

    /* JADX INFO: renamed from: b */
    public Optional f41284b;

    /* JADX INFO: renamed from: c */
    public npu f41285c;

    /* JADX INFO: renamed from: d */
    public Path f41286d;

    /* JADX INFO: renamed from: e */
    public int f41287e;

    /* JADX INFO: renamed from: f */
    public float f41288f;

    /* JADX INFO: renamed from: g */
    public boolean f41289g;

    /* JADX INFO: renamed from: h */
    public byte f41290h;

    /* JADX INFO: renamed from: i */
    public int f41291i;

    /* JADX INFO: renamed from: j */
    public int f41292j;

    /* JADX INFO: renamed from: k */
    public int f41293k;

    /* JADX INFO: renamed from: l */
    public int f41294l;

    public mps(byte[] bArr) {
        this.f41283a = Optional.empty();
        this.f41284b = Optional.empty();
    }

    /* JADX INFO: renamed from: a */
    public final void m16745a(int i) {
        this.f41287e = i;
        this.f41290h = (byte) (this.f41290h | 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m16746b(float f) {
        this.f41288f = f;
        this.f41290h = (byte) (this.f41290h | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m16747c(boolean z) {
        this.f41289g = z;
        this.f41290h = (byte) (this.f41290h | 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m16748d() {
        this.f41291i = 2;
    }

    public mps() {
    }
}
