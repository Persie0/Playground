package p465wm;

import ae.C0062b;
import ao.C1269a;
import ao.C1271c;
import dm.C5207g;
import gn.InterfaceC5827g;
import in.InterfaceC6366j;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import mn.C7645b;
import mn.C7646c;
import mo.C7661i;

/* JADX INFO: renamed from: wm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9974d implements InterfaceC6366j {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f50699a;

    /* JADX INFO: renamed from: b */
    public final C1271c f50700b = new C1271c();

    public C9974d(ClassLoader classLoader) {
        this.f50699a = classLoader;
    }

    @Override // in.InterfaceC6366j
    /* JADX INFO: renamed from: a */
    public final InterfaceC6366j.a.b mo12997a(C7645b c7645b) {
        C9973c c9973cM18552a;
        C5207g.m11111f(c7645b, "classId");
        String strM15253S2 = C7661i.m15253S2(c7645b.m15209i().m15214b(), '.', '$');
        if (!c7645b.m15208h().m15216d()) {
            strM15253S2 = c7645b.m15208h() + '.' + strM15253S2;
        }
        Class clsM403u2 = C0062b.m403u2(this.f50699a, strM15253S2);
        if (clsM403u2 == null || (c9973cM18552a = C9973c.a.m18552a(clsM403u2)) == null) {
            return null;
        }
        return new InterfaceC6366j.a.b(c9973cM18552a);
    }

    @Override // p541zn.InterfaceC10551o
    /* JADX INFO: renamed from: b */
    public final InputStream mo18553b(C7646c c7646c) {
        C5207g.m11111f(c7646c, "packageFqName");
        if (!c7646c.m15220h(C6797e.f38343i)) {
            return null;
        }
        C1269a.f7952m.getClass();
        String strM4769a = C1269a.m4769a(c7646c);
        this.f50700b.getClass();
        return C1271c.m4771a(strM4769a);
    }

    @Override // in.InterfaceC6366j
    /* JADX INFO: renamed from: c */
    public final InterfaceC6366j.a.b mo12998c(InterfaceC5827g interfaceC5827g) {
        C9973c c9973cM18552a;
        C5207g.m11111f(interfaceC5827g, "javaClass");
        C7646c c7646cMo12252e = interfaceC5827g.mo12252e();
        if (c7646cMo12252e == null) {
            return null;
        }
        Class clsM403u2 = C0062b.m403u2(this.f50699a, c7646cMo12252e.m15214b());
        if (clsM403u2 == null || (c9973cM18552a = C9973c.a.m18552a(clsM403u2)) == null) {
            return null;
        }
        return new InterfaceC6366j.a.b(c9973cM18552a);
    }
}
