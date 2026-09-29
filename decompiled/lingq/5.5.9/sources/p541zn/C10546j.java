package p541zn;

import ae.C0062b;
import dm.C5207g;
import mn.C7645b;
import mn.C7646c;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8866x;

/* JADX INFO: renamed from: zn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10546j implements InterfaceC10542f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8866x f52600a;

    public C10546j(InterfaceC8866x interfaceC8866x) {
        C5207g.m11111f(interfaceC8866x, "packageFragmentProvider");
        this.f52600a = interfaceC8866x;
    }

    @Override // p541zn.InterfaceC10542f
    /* JADX INFO: renamed from: a */
    public final C10541e mo12988a(C7645b c7645b) {
        C10541e c10541eMo12988a;
        C5207g.m11111f(c7645b, "classId");
        C7646c c7646cM15208h = c7645b.m15208h();
        C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
        for (InterfaceC8865w interfaceC8865w : C0062b.m281J1(this.f52600a, c7646cM15208h)) {
            if ((interfaceC8865w instanceof AbstractC10547k) && (c10541eMo12988a = ((AbstractC10547k) interfaceC8865w).mo14122P0().mo12988a(c7645b)) != null) {
                return c10541eMo12988a;
            }
        }
        return null;
    }
}
