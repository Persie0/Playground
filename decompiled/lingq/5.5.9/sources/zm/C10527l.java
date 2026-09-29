package zm;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import p372rm.AbstractC8848l;
import p372rm.C8850m;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8846k;
import p372rm.InterfaceC8865w;
import p441vm.C9760a;
import p441vm.C9761b;
import p441vm.C9762c;
import pn.C8413d;

/* JADX INFO: renamed from: zm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10527l {

    /* JADX INFO: renamed from: a */
    public static final a f52520a;

    /* JADX INFO: renamed from: b */
    public static final b f52521b;

    /* JADX INFO: renamed from: c */
    public static final c f52522c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f52523d;

    /* JADX INFO: renamed from: zm.l$a */
    public static class a extends AbstractC8848l {
        public a(C9760a c9760a) {
            super(c9760a);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m19502e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(C8850m.b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return C10527l.m19501c(interfaceC8846k, interfaceC8838g);
            }
            m19502e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: zm.l$b */
    public static class b extends AbstractC8848l {
        public b(C9762c c9762c) {
            super(c9762c);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m19503e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(C8850m.b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return C10527l.m19500b(bVar, interfaceC8846k, interfaceC8838g);
            }
            m19503e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: zm.l$c */
    public static class c extends AbstractC8848l {
        public c(C9761b c9761b) {
            super(c9761b);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m19504e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(C8850m.b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return C10527l.m19500b(bVar, interfaceC8846k, interfaceC8838g);
            }
            m19504e(1);
            throw null;
        }
    }

    static {
        a aVar = new a(C9760a.f49825c);
        f52520a = aVar;
        b bVar = new b(C9762c.f49827c);
        f52521b = bVar;
        c cVar = new c(C9761b.f49826c);
        f52522c = cVar;
        HashMap map = new HashMap();
        f52523d = map;
        map.put(aVar.f46733a, aVar);
        map.put(bVar.f46733a, bVar);
        map.put(cVar.f46733a, cVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19499a(int i10) {
        String str;
        String str2 = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toDescriptorVisibility";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "isVisibleForProtectedAndPackage";
            }
            str = String.format(str2, objArr);
            if (i10 == 5 && i10 != 6) {
                throw new IllegalArgumentException(str);
            }
            throw new IllegalStateException(str);
        }
        objArr[2] = "areInSamePackage";
        str = String.format(str2, objArr);
        if (i10 == 5) {
        }
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19500b(C8850m.b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m19499a(1);
            throw null;
        }
        if (m19501c(C8413d.m16463v(interfaceC8846k), interfaceC8838g)) {
            return true;
        }
        return C8850m.f46736c.mo17107c(bVar, interfaceC8846k, interfaceC8838g);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static boolean m19501c(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2) {
        if (interfaceC8838g == null) {
            m19499a(2);
            throw null;
        }
        if (interfaceC8838g2 == null) {
            m19499a(3);
            throw null;
        }
        InterfaceC8865w interfaceC8865w = (InterfaceC8865w) C8413d.m16450i(interfaceC8838g, InterfaceC8865w.class, false);
        InterfaceC8865w interfaceC8865w2 = (InterfaceC8865w) C8413d.m16450i(interfaceC8838g2, InterfaceC8865w.class, false);
        return (interfaceC8865w2 == null || interfaceC8865w == null || !interfaceC8865w.mo17120e().equals(interfaceC8865w2.mo17120e())) ? false : true;
    }
}
