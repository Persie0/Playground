package p000;

import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwy implements ohi {

    /* JADX INFO: renamed from: a */
    private final ljf f12803a;

    public dwy(ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.f12803a = ljfVar;
    }

    /* JADX INFO: renamed from: b */
    public static dwn m6839b(ljf ljfVar) {
        dwn dwnVar = ((FocusIndicatorRingView) ljfVar.f38371c).f6684b;
        dwnVar.getClass();
        return dwnVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dwn get() {
        return m6839b(this.f12803a);
    }
}
