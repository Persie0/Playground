package p466wn;

import cm.InterfaceC2052l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;

/* JADX INFO: renamed from: wn.h */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9985h {

    /* JADX INFO: renamed from: wn.h$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Collection m18558a(InterfaceC9985h interfaceC9985h, C9981d c9981d, int i10) {
            InterfaceC2052l<C7648e, Boolean> interfaceC2052l;
            if ((i10 & 1) != 0) {
                c9981d = C9981d.f50721m;
            }
            if ((i10 & 2) != 0) {
                MemberScope.f39666a.getClass();
                interfaceC2052l = MemberScope.Companion.f39668b;
            } else {
                interfaceC2052l = null;
            }
            return interfaceC9985h.mo5303e(c9981d, interfaceC2052l);
        }
    }

    /* JADX INFO: renamed from: e */
    Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l);

    /* JADX INFO: renamed from: g */
    InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation);
}
