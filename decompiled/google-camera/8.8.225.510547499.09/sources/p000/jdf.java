package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class jdf extends jhr {

    /* JADX INFO: renamed from: a */
    private static final WeakReference f33776a = new WeakReference(null);

    /* JADX INFO: renamed from: b */
    private WeakReference f33777b;

    public jdf(byte[] bArr) {
        super(bArr);
        this.f33777b = f33776a;
    }

    /* JADX INFO: renamed from: b */
    protected abstract byte[] mo12918b();

    @Override // p000.jhr
    /* JADX INFO: renamed from: w */
    public final byte[] mo12919w() {
        byte[] bArrMo12918b;
        synchronized (this) {
            bArrMo12918b = (byte[]) this.f33777b.get();
            if (bArrMo12918b == null) {
                bArrMo12918b = mo12918b();
                this.f33777b = new WeakReference(bArrMo12918b);
            }
        }
        return bArrMo12918b;
    }
}
