package p000;

import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwu implements ohi {

    /* JADX INFO: renamed from: a */
    private final ljf f12798a;

    public dwu(ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.f12798a = ljfVar;
    }

    /* JADX INFO: renamed from: b */
    public static FocusIndicatorAccessoryView m6833b(ljf ljfVar) {
        Object obj = ljfVar.f38374f;
        obj.getClass();
        return (FocusIndicatorAccessoryView) obj;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FocusIndicatorAccessoryView get() {
        return m6833b(this.f12798a);
    }
}
