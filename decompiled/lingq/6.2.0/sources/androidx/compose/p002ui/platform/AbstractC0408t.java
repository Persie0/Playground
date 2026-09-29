package androidx.compose.p002ui.platform;

import p000.ux8;
import p000.w64;
import p000.y64;

/* JADX INFO: renamed from: androidx.compose.ui.platform.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408t implements w64 {

    /* JADX INFO: renamed from: a */
    public y64 f4862a;

    @Override // p000.w64
    /* JADX INFO: renamed from: l */
    public final ux8 mo1817l() {
        y64 y64Var = this.f4862a;
        if (y64Var == null) {
            y64Var = new y64();
            InspectableValueKt$NoInspectorInfo$1.f4580b.invoke(y64Var);
        }
        this.f4862a = y64Var;
        return y64Var.f69367c;
    }

    @Override // p000.w64
    /* JADX INFO: renamed from: m */
    public final String mo1818m() {
        y64 y64Var = this.f4862a;
        if (y64Var == null) {
            y64Var = new y64();
            InspectableValueKt$NoInspectorInfo$1.f4580b.invoke(y64Var);
        }
        this.f4862a = y64Var;
        return y64Var.f69365a;
    }
}
