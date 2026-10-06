package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emg implements ohi {

    /* JADX INFO: renamed from: a */
    private final gtd f14705a;

    public emg(gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14705a = gtdVar;
    }

    /* JADX INFO: renamed from: b */
    public static emg m7520b(gtd gtdVar) {
        return new emg(gtdVar, null, null, null, null);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final WeakReference get() {
        return new WeakReference(this.f14705a.f26334a);
    }
}
