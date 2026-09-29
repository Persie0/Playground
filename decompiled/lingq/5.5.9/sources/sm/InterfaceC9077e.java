package sm;

import dm.C5207g;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import mn.C7646c;
import p100em.InterfaceC5429a;
import tl.C9330r;

/* JADX INFO: renamed from: sm.e */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9077e extends Iterable<InterfaceC9075c>, InterfaceC5429a {

    /* JADX INFO: renamed from: sm.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C10670a f47365a = new C10670a();

        /* JADX INFO: renamed from: sm.e$a$a, reason: collision with other inner class name */
        public static final class C10670a implements InterfaceC9077e {
            @Override // sm.InterfaceC9077e
            /* JADX INFO: renamed from: h */
            public final InterfaceC9075c mo5291h(C7646c c7646c) {
                C5207g.m11111f(c7646c, "fqName");
                return null;
            }

            @Override // sm.InterfaceC9077e
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<InterfaceC9075c> iterator() {
                EmptyList.f38032a.getClass();
                return C9330r.f48065a;
            }

            public final String toString() {
                return "EMPTY";
            }

            @Override // sm.InterfaceC9077e
            /* JADX INFO: renamed from: x */
            public final boolean mo5292x(C7646c c7646c) {
                return b.m17281b(this, c7646c);
            }
        }
    }

    /* JADX INFO: renamed from: sm.e$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static InterfaceC9075c m17280a(InterfaceC9077e interfaceC9077e, C7646c c7646c) {
            InterfaceC9075c next;
            C5207g.m11111f(c7646c, "fqName");
            Iterator<InterfaceC9075c> it = interfaceC9077e.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (C5207g.m11106a(next.mo12515e(), c7646c)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m17281b(InterfaceC9077e interfaceC9077e, C7646c c7646c) {
            C5207g.m11111f(c7646c, "fqName");
            return interfaceC9077e.mo5291h(c7646c) != null;
        }
    }

    /* JADX INFO: renamed from: h */
    InterfaceC9075c mo5291h(C7646c c7646c);

    boolean isEmpty();

    /* JADX INFO: renamed from: x */
    boolean mo5292x(C7646c c7646c);
}
