package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvx implements bvm {

    /* JADX INFO: renamed from: a */
    public static final bvx f4566a = new bvx(1, null);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4567b;

    public bvx(int i) {
        this.f4567b = i;
    }

    @Deprecated
    public bvx(int i, byte[] bArr) {
        this.f4567b = i;
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4567b) {
            case 0:
                return new bvy(bvqVar.m3100a(bvc.class, InputStream.class));
            case 1:
                return bvp.f4548a;
            default:
                return new bvb(bvqVar.m3100a(bvc.class, InputStream.class), 6);
        }
    }
}
