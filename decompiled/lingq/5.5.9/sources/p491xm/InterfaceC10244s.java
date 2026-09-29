package p491xm;

import gn.InterfaceC5838r;
import java.lang.reflect.Modifier;
import p372rm.AbstractC8859q0;
import p372rm.C8857p0;
import p441vm.C9760a;
import p441vm.C9761b;
import p441vm.C9762c;

/* JADX INFO: renamed from: xm.s */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10244s extends InterfaceC5838r {

    /* JADX INFO: renamed from: xm.s$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static AbstractC8859q0 m19217a(InterfaceC10244s interfaceC10244s) {
            int iMo13653J = interfaceC10244s.mo13653J();
            if (Modifier.isPublic(iMo13653J)) {
                return C8857p0.h.f46760c;
            }
            if (Modifier.isPrivate(iMo13653J)) {
                return C8857p0.e.f46757c;
            }
            if (Modifier.isProtected(iMo13653J)) {
                return Modifier.isStatic(iMo13653J) ? C9762c.f49827c : C9761b.f49826c;
            }
            return C9760a.f49825c;
        }
    }

    /* JADX INFO: renamed from: J */
    int mo13653J();
}
