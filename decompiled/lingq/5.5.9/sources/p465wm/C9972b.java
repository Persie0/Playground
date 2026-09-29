package p465wm;

import ae.C0062b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import mn.C7645b;
import mn.C7646c;
import mo.C7661i;
import p491xm.C10245t;
import zm.InterfaceC10524i;

/* JADX INFO: renamed from: wm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9972b implements InterfaceC10524i {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f50696a;

    public C9972b(ClassLoader classLoader) {
        this.f50696a = classLoader;
    }

    @Override // zm.InterfaceC10524i
    /* JADX INFO: renamed from: a */
    public final void mo18549a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "packageFqName");
    }

    @Override // zm.InterfaceC10524i
    /* JADX INFO: renamed from: b */
    public final C10245t mo18550b(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return new C10245t(c7646c);
    }

    @Override // zm.InterfaceC10524i
    /* JADX INFO: renamed from: c */
    public final C6831a mo18551c(InterfaceC10524i.a aVar) {
        C7645b c7645b = aVar.f52513a;
        C7646c c7646cM15208h = c7645b.m15208h();
        C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
        String strM15253S2 = C7661i.m15253S2(c7645b.m15209i().m15214b(), '.', '$');
        if (!c7646cM15208h.m15216d()) {
            strM15253S2 = c7646cM15208h.m15214b() + '.' + strM15253S2;
        }
        Class clsM403u2 = C0062b.m403u2(this.f50696a, strM15253S2);
        if (clsM403u2 != null) {
            return new C6831a(clsM403u2);
        }
        return null;
    }
}
