package p000;

import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwt implements ohi {

    /* JADX INFO: renamed from: a */
    private final ljf f12797a;

    public dwt(ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.f12797a = ljfVar;
    }

    /* JADX INFO: renamed from: b */
    public static FocusIndicatorRingView m6831b(ljf ljfVar) {
        Object obj = ljfVar.f38371c;
        obj.getClass();
        return (FocusIndicatorRingView) obj;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FocusIndicatorRingView get() {
        return m6831b(this.f12797a);
    }
}
