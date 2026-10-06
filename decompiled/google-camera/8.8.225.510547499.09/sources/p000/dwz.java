package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12804a;

    /* JADX INFO: renamed from: b */
    private final oju f12805b;

    public dwz(oju ojuVar, oju ojuVar2) {
        this.f12804a = ojuVar;
        this.f12805b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dxh get() {
        djm djmVar = (djm) this.f12804a.get();
        oju ojuVar = this.f12805b;
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) ((jfs) djmVar.f11789c).m13100f(C0100R.id.focus_indicator_view);
        ((iig) ojuVar).get().f31066c.m4462c(focusIndicatorView);
        return focusIndicatorView;
    }
}
