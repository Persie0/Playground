package androidx.compose.material3.internal;

import p000.a62;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
public final class AnchoredDraggableUninitializedException extends Throwable {

    /* JADX INFO: renamed from: a */
    public final String f3452a;

    public AnchoredDraggableUninitializedException(boolean z, boolean z2, a62 a62Var, Object obj) {
        StringBuilder sbM13357g = hn1.m13357g("AnchoredDraggableState was not initialized correctly. isLookingAhead=", ",didLookahead=", ",anchors=", z, z2);
        sbM13357g.append(a62Var);
        sbM13357g.append(",targetValue=");
        sbM13357g.append(obj);
        this.f3452a = sbM13357g.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3452a;
    }
}
