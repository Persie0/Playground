package p372rm;

import androidx.datastore.preferences.PreferencesProto$Value;
import io.InterfaceC6383j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import p260m8.C7499b;
import p420um.InterfaceC9574j0;
import p492xn.InterfaceC10257f;
import p492xn.InterfaceC10258g;
import p492xn.InterfaceC10259h;
import p543do.AbstractC5257t;
import pn.C8413d;

/* JADX INFO: renamed from: rm.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C8850m {

    /* JADX INFO: renamed from: a */
    public static final d f46734a;

    /* JADX INFO: renamed from: b */
    public static final e f46735b;

    /* JADX INFO: renamed from: c */
    public static final f f46736c;

    /* JADX INFO: renamed from: d */
    public static final g f46737d;

    /* JADX INFO: renamed from: e */
    public static final h f46738e;

    /* JADX INFO: renamed from: f */
    public static final i f46739f;

    /* JADX INFO: renamed from: g */
    public static final j f46740g;

    /* JADX INFO: renamed from: h */
    public static final k f46741h;

    /* JADX INFO: renamed from: i */
    public static final l f46742i;

    /* JADX INFO: renamed from: j */
    public static final Set<AbstractC8852n> f46743j;

    /* JADX INFO: renamed from: k */
    public static final Map<AbstractC8852n, Integer> f46744k;

    /* JADX INFO: renamed from: l */
    public static final h f46745l;

    /* JADX INFO: renamed from: m */
    public static final a f46746m;

    /* JADX INFO: renamed from: n */
    public static final b f46747n;

    /* JADX INFO: renamed from: o */
    @Deprecated
    public static final c f46748o;

    /* JADX INFO: renamed from: p */
    public static final InterfaceC6383j f46749p;

    /* JADX INFO: renamed from: q */
    public static final HashMap f46750q;

    /* JADX INFO: renamed from: rm.m$a */
    public static class a implements InterfaceC10257f {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p492xn.InterfaceC10257f
        /* JADX INFO: renamed from: c */
        public final AbstractC5257t mo17105c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: rm.m$b */
    public static class b implements InterfaceC10257f {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p492xn.InterfaceC10257f
        /* JADX INFO: renamed from: c */
        public final AbstractC5257t mo17105c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: rm.m$c */
    public static class c implements InterfaceC10257f {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p492xn.InterfaceC10257f
        /* JADX INFO: renamed from: c */
        public final AbstractC5257t mo17105c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: rm.m$d */
    public static class d extends AbstractC8848l {
        public d(C8857p0.e eVar) {
            super(eVar);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17106e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r9v0, types: [rm.g, rm.k] */
        /* JADX WARN: Type inference failed for: r9v1, types: [rm.g] */
        /* JADX WARN: Type inference failed for: r9v2, types: [rm.g] */
        /* JADX WARN: Type inference failed for: r9v4, types: [rm.g] */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g == null) {
                m17106e(2);
                throw null;
            }
            if (C8413d.m16461t(interfaceC8846k)) {
                if (C8413d.m16447f(interfaceC8838g) != InterfaceC8839g0.f46731a) {
                    return C8850m.m17101d(interfaceC8846k, interfaceC8838g);
                }
            }
            if (interfaceC8846k instanceof InterfaceC6821b) {
                ((InterfaceC6821b) interfaceC8846k).mo11876g();
            }
            while (interfaceC8846k != 0) {
                interfaceC8846k = interfaceC8846k.mo11876g();
                if (((interfaceC8846k instanceof InterfaceC8830c) && !C8413d.m16453l(interfaceC8846k)) || (interfaceC8846k instanceof InterfaceC8865w)) {
                    break;
                    break;
                }
            }
            if (interfaceC8846k == 0) {
                return false;
            }
            while (interfaceC8838g != null) {
                if (interfaceC8846k == interfaceC8838g) {
                    return true;
                }
                if (interfaceC8838g instanceof InterfaceC8865w) {
                    return (interfaceC8846k instanceof InterfaceC8865w) && ((InterfaceC8865w) interfaceC8846k).mo17120e().equals(((InterfaceC8865w) interfaceC8838g).mo17120e()) && C8413d.m16445d(interfaceC8838g).equals(C8413d.m16445d(interfaceC8846k));
                }
                interfaceC8838g = interfaceC8838g.mo11876g();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: rm.m$e */
    public static class e extends AbstractC8848l {
        public e(C8857p0.f fVar) {
            super(fVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17108e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            InterfaceC8838g interfaceC8838gM16450i;
            if (interfaceC8838g == null) {
                m17108e(1);
                throw null;
            }
            if (C8850m.f46734a.mo17107c(bVar, interfaceC8846k, interfaceC8838g)) {
                if (bVar == C8850m.f46747n) {
                    return true;
                }
                if (bVar != C8850m.f46746m && (interfaceC8838gM16450i = C8413d.m16450i(interfaceC8846k, InterfaceC8830c.class, true)) != null && (bVar instanceof InterfaceC10259h)) {
                    return ((InterfaceC10259h) bVar).mo19220s().mo11875b().equals(interfaceC8838gM16450i.mo11875b());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: rm.m$f */
    public static class f extends AbstractC8848l {
        public f(C8857p0.g gVar) {
            super(gVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17109e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0092  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            InterfaceC8830c interfaceC8830c;
            if (interfaceC8838g == null) {
                m17109e(1);
                throw null;
            }
            InterfaceC8830c interfaceC8830c2 = (InterfaceC8830c) C8413d.m16450i(interfaceC8846k, InterfaceC8830c.class, true);
            boolean z10 = false;
            InterfaceC8830c interfaceC8830c3 = (InterfaceC8830c) C8413d.m16450i(interfaceC8838g, InterfaceC8830c.class, false);
            if (interfaceC8830c3 == null) {
                return false;
            }
            if (interfaceC8830c2 != null && C8413d.m16453l(interfaceC8830c2) && (interfaceC8830c = (InterfaceC8830c) C8413d.m16450i(interfaceC8830c2, InterfaceC8830c.class, true)) != null && C8413d.m16459r(interfaceC8830c3, interfaceC8830c)) {
                return true;
            }
            InterfaceC8846k interfaceC8846kM16463v = C8413d.m16463v(interfaceC8846k);
            InterfaceC8830c interfaceC8830c4 = (InterfaceC8830c) C8413d.m16450i(interfaceC8846kM16463v, InterfaceC8830c.class, true);
            if (interfaceC8830c4 == null) {
                return false;
            }
            if (C8413d.m16459r(interfaceC8830c3, interfaceC8830c4)) {
                if (bVar != C8850m.f46748o) {
                    if ((interfaceC8846kM16463v instanceof CallableMemberDescriptor) && !(interfaceC8846kM16463v instanceof InterfaceC6821b) && bVar != C8850m.f46747n) {
                        if (bVar != C8850m.f46746m) {
                            if (bVar != 0) {
                                if (!(bVar instanceof InterfaceC10258g)) {
                                    bVar.mo17105c();
                                    throw null;
                                }
                                AbstractC5257t abstractC5257tM19221a = ((InterfaceC10258g) bVar).m19221a();
                                if (C8413d.m16460s(abstractC5257tM19221a, interfaceC8830c3) || C7499b.m14925W(abstractC5257tM19221a)) {
                                }
                            }
                        }
                    }
                    z10 = true;
                }
                if (z10) {
                    return true;
                }
            }
            return mo17107c(bVar, interfaceC8846k, interfaceC8830c3.mo11876g());
        }
    }

    /* JADX INFO: renamed from: rm.m$g */
    public static class g extends AbstractC8848l {
        public g(C8857p0.b bVar) {
            super(bVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17110e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g == null) {
                m17110e(1);
                throw null;
            }
            if (!C8413d.m16445d(interfaceC8838g).mo11879t0(C8413d.m16445d(interfaceC8846k))) {
                return false;
            }
            C8850m.f46749p.mo13013a(interfaceC8846k, interfaceC8838g);
            return true;
        }
    }

    /* JADX INFO: renamed from: rm.m$h */
    public static class h extends AbstractC8848l {
        public h(C8857p0.h hVar) {
            super(hVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17111e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return true;
            }
            m17111e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: rm.m$i */
    public static class i extends AbstractC8848l {
        public i(C8857p0.d dVar) {
            super(dVar);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17112e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
            m17112e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: rm.m$j */
    public static class j extends AbstractC8848l {
        public j(C8857p0.a aVar) {
            super(aVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17113e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                throw new IllegalStateException("Visibility is unknown yet");
            }
            m17113e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: rm.m$k */
    public static class k extends AbstractC8848l {
        public k(C8857p0.c cVar) {
            super(cVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17114e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return false;
            }
            m17114e(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: rm.m$l */
    public static class l extends AbstractC8848l {
        public l(C8857p0.i iVar) {
            super(iVar);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17115e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p372rm.AbstractC8852n
        /* JADX INFO: renamed from: c */
        public final boolean mo17107c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                return false;
            }
            m17115e(1);
            throw null;
        }
    }

    static {
        d dVar = new d(C8857p0.e.f46757c);
        f46734a = dVar;
        e eVar = new e(C8857p0.f.f46758c);
        f46735b = eVar;
        f fVar = new f(C8857p0.g.f46759c);
        f46736c = fVar;
        g gVar = new g(C8857p0.b.f46754c);
        f46737d = gVar;
        h hVar = new h(C8857p0.h.f46760c);
        f46738e = hVar;
        i iVar = new i(C8857p0.d.f46756c);
        f46739f = iVar;
        j jVar = new j(C8857p0.a.f46753c);
        f46740g = jVar;
        k kVar = new k(C8857p0.c.f46755c);
        f46741h = kVar;
        l lVar = new l(C8857p0.i.f46761c);
        f46742i = lVar;
        f46743j = Collections.unmodifiableSet(C7499b.m14973x0(dVar, eVar, gVar, iVar));
        HashMap map = new HashMap(6);
        map.put(eVar, 0);
        map.put(dVar, 0);
        map.put(gVar, 1);
        map.put(fVar, 1);
        map.put(hVar, 2);
        f46744k = Collections.unmodifiableMap(map);
        f46745l = hVar;
        f46746m = new a();
        f46747n = new b();
        f46748o = new c();
        Iterator it = ServiceLoader.load(InterfaceC6383j.class, InterfaceC6383j.class.getClassLoader()).iterator();
        f46749p = it.hasNext() ? (InterfaceC6383j) it.next() : InterfaceC6383j.a.f36788a;
        f46750q = new HashMap();
        m17103f(dVar);
        m17103f(eVar);
        m17103f(fVar);
        m17103f(gVar);
        m17103f(hVar);
        m17103f(iVar);
        m17103f(jVar);
        m17103f(kVar);
        m17103f(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17098a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static Integer m17099b(AbstractC8852n abstractC8852n, AbstractC8852n abstractC8852n2) {
        if (abstractC8852n == null) {
            m17098a(12);
            throw null;
        }
        if (abstractC8852n2 == null) {
            m17098a(13);
            throw null;
        }
        Integer numMo17117a = abstractC8852n.mo17094a().mo17117a(abstractC8852n2.mo17094a());
        if (numMo17117a != null) {
            return numMo17117a;
        }
        Integer numMo17117a2 = abstractC8852n2.mo17094a().mo17117a(abstractC8852n.mo17094a());
        if (numMo17117a2 != null) {
            return Integer.valueOf(-numMo17117a2.intValue());
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC8846k m17100c(b bVar, InterfaceC8846k interfaceC8846k, InterfaceC8838g interfaceC8838g) {
        InterfaceC8846k interfaceC8846kM17100c;
        if (interfaceC8846k == null) {
            m17098a(8);
            throw null;
        }
        if (interfaceC8838g == null) {
            m17098a(9);
            throw null;
        }
        for (InterfaceC8846k interfaceC8846k2 = (InterfaceC8846k) interfaceC8846k.mo11875b(); interfaceC8846k2 != null && interfaceC8846k2.mo11886f() != f46739f; interfaceC8846k2 = (InterfaceC8846k) C8413d.m16450i(interfaceC8846k2, InterfaceC8846k.class, true)) {
            if (!interfaceC8846k2.mo11886f().mo17107c(bVar, interfaceC8846k2, interfaceC8838g)) {
                return interfaceC8846k2;
            }
        }
        if (!(interfaceC8846k instanceof InterfaceC9574j0) || (interfaceC8846kM17100c = m17100c(bVar, ((InterfaceC9574j0) interfaceC8846k).mo13632w0(), interfaceC8838g)) == null) {
            return null;
        }
        return interfaceC8846kM17100c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m17101d(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2) {
        if (interfaceC8838g2 == null) {
            m17098a(7);
            throw null;
        }
        InterfaceC8839g0 interfaceC8839g0M16447f = C8413d.m16447f(interfaceC8838g2);
        if (interfaceC8839g0M16447f != InterfaceC8839g0.f46731a) {
            return interfaceC8839g0M16447f.equals(C8413d.m16447f(interfaceC8838g));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17102e(AbstractC8852n abstractC8852n) {
        if (abstractC8852n == null) {
            m17098a(14);
            throw null;
        }
        if (abstractC8852n != f46734a && abstractC8852n != f46735b) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static void m17103f(AbstractC8848l abstractC8848l) {
        f46750q.put(abstractC8848l.f46733a, abstractC8848l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static AbstractC8852n m17104g(AbstractC8859q0 abstractC8859q0) {
        if (abstractC8859q0 == null) {
            m17098a(15);
            throw null;
        }
        AbstractC8852n abstractC8852n = (AbstractC8852n) f46750q.get(abstractC8859q0);
        if (abstractC8852n != null) {
            return abstractC8852n;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC8859q0);
    }
}
