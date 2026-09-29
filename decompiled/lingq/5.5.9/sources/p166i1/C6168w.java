package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;

/* JADX INFO: renamed from: i1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6168w {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b.c m12691a(InterfaceC6137c interfaceC6137c, int i10) {
        InterfaceC0500b.c cVar = interfaceC6137c.mo1934v().f3330e;
        if (cVar != null && (cVar.f3328c & i10) != 0) {
            while (cVar != null) {
                int i11 = cVar.f3327b;
                if ((i11 & 2) != 0) {
                    break;
                }
                if ((i11 & i10) != 0) {
                    return cVar;
                }
                cVar = cVar.f3330e;
            }
        }
        return null;
    }
}
