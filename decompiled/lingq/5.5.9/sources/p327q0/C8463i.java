package p327q0;

import androidx.compose.p017ui.unit.LayoutDirection;
import p375s0.C8944f;
import p470x1.C10016d;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8463i implements InterfaceC8455a {

    /* JADX INFO: renamed from: a */
    public static final C8463i f45634a = new C8463i();

    /* JADX INFO: renamed from: b */
    public static final long f45635b = C8944f.f46907c;

    /* JADX INFO: renamed from: c */
    public static final LayoutDirection f45636c = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: d */
    public static final C10016d f45637d = new C10016d(1.0f, 1.0f);

    @Override // p327q0.InterfaceC8455a
    /* JADX INFO: renamed from: d */
    public final long mo2084d() {
        return f45635b;
    }

    @Override // p327q0.InterfaceC8455a
    public final InterfaceC10015c getDensity() {
        return f45637d;
    }

    @Override // p327q0.InterfaceC8455a
    public final LayoutDirection getLayoutDirection() {
        return f45636c;
    }
}
