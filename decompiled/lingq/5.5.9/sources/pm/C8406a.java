package pm;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.text.C7076b;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import om.InterfaceC8084a;
import om.InterfaceC8086c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import tm.InterfaceC9340b;

/* JADX INFO: renamed from: pm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8406a implements InterfaceC9340b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2076h f45525a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8863u f45526b;

    public C8406a(InterfaceC2076h interfaceC2076h, C6829c c6829c) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(c6829c, "module");
        this.f45525a = interfaceC2076h;
        this.f45526b = c6829c;
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: a */
    public final Collection<InterfaceC8830c> mo13581a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "packageFqName");
        return EmptySet.f38034a;
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c mo13582b(C7645b c7645b) {
        C5207g.m11111f(c7645b, "classId");
        C8407b c8407b = null;
        if (!c7645b.f42075c && !c7645b.m15211k()) {
            String strM15214b = c7645b.m15209i().m15214b();
            if (!C7076b.m14278X2(strM15214b, "Function", false)) {
                return null;
            }
            C7646c c7646cM15208h = c7645b.m15208h();
            C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
            FunctionClassKind.Companion.getClass();
            FunctionClassKind.C6798a.a aVarM13571a = FunctionClassKind.C6798a.m13571a(strM15214b, c7646cM15208h);
            if (aVarM13571a == null) {
                return null;
            }
            List<InterfaceC8865w> listMo13626Q = this.f45526b.mo11873R(c7646cM15208h).mo13626Q();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listMo13626Q.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (next instanceof InterfaceC8084a) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof InterfaceC8086c) {
                    arrayList2.add(obj);
                }
            }
            InterfaceC8084a interfaceC8084a = (InterfaceC8086c) C6752c.m13425S(arrayList2);
            if (interfaceC8084a == null) {
                interfaceC8084a = (InterfaceC8084a) C6752c.m13423Q(arrayList);
            }
            c8407b = new C8407b(this.f45525a, interfaceC8084a, aVarM13571a.f38404a, aVarM13571a.f38405b);
        }
        return c8407b;
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: c */
    public final boolean mo13583c(C7646c c7646c, C7648e c7648e) {
        C5207g.m11111f(c7646c, "packageFqName");
        C5207g.m11111f(c7648e, "name");
        String strM15235f = c7648e.m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        if (!C7661i.m15256V2(strM15235f, "Function", false) && !C7661i.m15256V2(strM15235f, "KFunction", false) && !C7661i.m15256V2(strM15235f, "SuspendFunction", false) && !C7661i.m15256V2(strM15235f, "KSuspendFunction", false)) {
            return false;
        }
        FunctionClassKind.Companion.getClass();
        return FunctionClassKind.C6798a.m13571a(strM15235f, c7646c) != null;
    }
}
