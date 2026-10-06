package p000;

import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwx implements ohi {

    /* JADX INFO: renamed from: a */
    private final ljf f12802a;

    public dwx(ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.f12802a = ljfVar;
    }

    /* JADX INFO: renamed from: b */
    public static dwl m6837b(ljf ljfVar) {
        dwl dwlVar = ((FocusIndicatorRingView) ljfVar.f38371c).f6683a;
        dwlVar.getClass();
        return dwlVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dwl get() {
        return m6837b(this.f12802a);
    }
}
