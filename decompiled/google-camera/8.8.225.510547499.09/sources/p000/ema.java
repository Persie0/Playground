package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ema implements ohi {

    /* JADX INFO: renamed from: a */
    private final gtd f14698a;

    public ema(gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14698a = gtdVar;
    }

    /* JADX INFO: renamed from: b */
    public static ema m7510b(gtd gtdVar) {
        return new ema(gtdVar, null, null, null, null);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity get() {
        return (Activity) this.f14698a.f26334a;
    }
}
