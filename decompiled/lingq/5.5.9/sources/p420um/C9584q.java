package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2071c;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import p543do.AbstractC5265x;
import p543do.C5229f;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C9584q extends AbstractC9575k {

    /* JADX INFO: renamed from: h */
    public final C5229f f49227h;

    /* JADX INFO: renamed from: i */
    public final a f49228i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2073e<Set<C7648e>> f49229j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9077e f49230k;

    /* JADX INFO: renamed from: um.q$a */
    public class a extends AbstractC9984g {

        /* JADX INFO: renamed from: b */
        public final InterfaceC2071c<C7648e, Collection<? extends InterfaceC6824e>> f49231b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2071c<C7648e, Collection<? extends InterfaceC8829b0>> f49232c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2073e<Collection<InterfaceC8838g>> f49233d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C9584q f49234e;

        /* JADX INFO: renamed from: um.q$a$a, reason: collision with other inner class name */
        public class C10673a implements InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>> {
            public C10673a() {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                a aVar = a.this;
                if (c7648e2 != null) {
                    return aVar.m18049j(aVar.m18048i().mo11904b(c7648e2, NoLookupLocation.FOR_NON_TRACKED_SCOPE), c7648e2);
                }
                aVar.getClass();
                a.m18047h(8);
                throw null;
            }
        }

        /* JADX INFO: renamed from: um.q$a$b */
        public class b implements InterfaceC2052l<C7648e, Collection<? extends InterfaceC8829b0>> {
            public b() {
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC8829b0> mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                a aVar = a.this;
                if (c7648e2 != null) {
                    return aVar.m18049j(aVar.m18048i().mo11905c(c7648e2, NoLookupLocation.FOR_NON_TRACKED_SCOPE), c7648e2);
                }
                aVar.getClass();
                a.m18047h(4);
                throw null;
            }
        }

        /* JADX INFO: renamed from: um.q$a$c */
        public class c implements InterfaceC2041a<Collection<InterfaceC8838g>> {
            public c() {
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<InterfaceC8838g> mo807E() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (C7648e c7648e : aVar.f49234e.f49229j.mo807E()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.mo11904b(c7648e, noLookupLocation));
                    hashSet.addAll(aVar.mo11905c(c7648e, noLookupLocation));
                }
                return hashSet;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a(C9584q c9584q, InterfaceC2076h interfaceC2076h) {
            if (interfaceC2076h == null) {
                m18047h(0);
                throw null;
            }
            this.f49234e = c9584q;
            this.f49231b = interfaceC2076h.mo6221f(new C10673a());
            this.f49232c = interfaceC2076h.mo6221f(new b());
            this.f49233d = interfaceC2076h.mo6217b(new c());
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m18047h(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i11 = 2;
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "location";
                    break;
                case 3:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: a */
        public final Set<C7648e> mo11903a() {
            Set<C7648e> setMo807E = this.f49234e.f49229j.mo807E();
            if (setMo807E != null) {
                return setMo807E;
            }
            m18047h(17);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: b */
        public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
            if (c7648e == null) {
                m18047h(5);
                throw null;
            }
            if (noLookupLocation == null) {
                m18047h(6);
                throw null;
            }
            Collection collection = (Collection) ((LockBasedStorageManager.C7045k) this.f49231b).mo528n(c7648e);
            if (collection != null) {
                return collection;
            }
            m18047h(7);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: c */
        public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
            if (c7648e == null) {
                m18047h(1);
                throw null;
            }
            if (noLookupLocation == null) {
                m18047h(2);
                throw null;
            }
            Collection collection = (Collection) ((LockBasedStorageManager.C7045k) this.f49232c).mo528n(c7648e);
            if (collection != null) {
                return collection;
            }
            m18047h(3);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: d */
        public final Set<C7648e> mo11906d() {
            Set<C7648e> setMo807E = this.f49234e.f49229j.mo807E();
            if (setMo807E != null) {
                return setMo807E;
            }
            m18047h(19);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
        /* JADX INFO: renamed from: e */
        public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
            if (c9981d == null) {
                m18047h(13);
                throw null;
            }
            if (interfaceC2052l == null) {
                m18047h(14);
                throw null;
            }
            Collection<InterfaceC8838g> collectionMo807E = this.f49233d.mo807E();
            if (collectionMo807E != null) {
                return collectionMo807E;
            }
            m18047h(15);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: f */
        public final Set<C7648e> mo11907f() {
            Set<C7648e> setEmptySet = Collections.emptySet();
            if (setEmptySet != null) {
                return setEmptySet;
            }
            m18047h(18);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: i */
        public final MemberScope m18048i() {
            MemberScope memberScopeMo11245q = ((AbstractTypeConstructor) this.f49234e.mo13600k()).mo11278p().iterator().next().mo11245q();
            if (memberScopeMo11245q != null) {
                return memberScopeMo11245q;
            }
            m18047h(9);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: j */
        public final LinkedHashSet m18049j(Collection collection, C7648e c7648e) {
            if (c7648e == null) {
                m18047h(10);
                throw null;
            }
            if (collection == null) {
                m18047h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f39632f.m14083h(c7648e, collection, Collections.emptySet(), this.f49234e, new C9585r(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C9584q(InterfaceC2076h interfaceC2076h, InterfaceC8830c interfaceC8830c, AbstractC5265x abstractC5265x, C7648e c7648e, InterfaceC2073e interfaceC2073e, InterfaceC9077e interfaceC9077e, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC2076h, interfaceC8830c, c7648e, interfaceC8837f0);
        if (interfaceC2076h == null) {
            m18045J0(6);
            throw null;
        }
        if (interfaceC8830c == null) {
            m18045J0(7);
            throw null;
        }
        if (abstractC5265x == null) {
            m18045J0(8);
            throw null;
        }
        if (c7648e == null) {
            m18045J0(9);
            throw null;
        }
        if (interfaceC2073e == null) {
            m18045J0(10);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18045J0(12);
            throw null;
        }
        this.f49230k = interfaceC9077e;
        this.f49227h = new C5229f(this, Collections.emptyList(), Collections.singleton(abstractC5265x), interfaceC2076h);
        this.f49228i = new a(this, interfaceC2076h);
        this.f49229j = interfaceC2073e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m18045J0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "storageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static C9584q m18046V0(InterfaceC2076h interfaceC2076h, InterfaceC8830c interfaceC8830c, C7648e c7648e, InterfaceC2073e<Set<C7648e>> interfaceC2073e, InterfaceC9077e interfaceC9077e, InterfaceC8837f0 interfaceC8837f0) {
        if (interfaceC2076h == null) {
            m18045J0(0);
            throw null;
        }
        if (interfaceC8830c == null) {
            m18045J0(1);
            throw null;
        }
        if (c7648e == null) {
            m18045J0(2);
            throw null;
        }
        if (interfaceC2073e == null) {
            m18045J0(3);
            throw null;
        }
        if (interfaceC8837f0 != null) {
            return new C9584q(interfaceC2076h, interfaceC8830c, interfaceC8830c.mo5316v(), c7648e, interfaceC2073e, interfaceC9077e, interfaceC8837f0);
        }
        m18045J0(5);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: E */
    public final boolean mo13589E() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: G */
    public final Collection<InterfaceC8828b> mo13590G() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18045J0(16);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: I0 */
    public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: J */
    public final boolean mo13592J() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return false;
    }

    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: P */
    public final MemberScope mo13593P(AbstractC5439d abstractC5439d) {
        if (abstractC5439d == null) {
            m18045J0(13);
            throw null;
        }
        a aVar = this.f49228i;
        if (aVar != null) {
            return aVar;
        }
        m18045J0(14);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S */
    public final boolean mo13594S() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S0 */
    public final boolean mo13595S0() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return false;
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final InterfaceC8828b mo13597Y() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        MemberScope.C7015a c7015a = MemberScope.C7015a.f39670b;
        if (c7015a != null) {
            return c7015a;
        }
        m18045J0(15);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8830c mo13599b0() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.h hVar = C8850m.f46738e;
        if (hVar != null) {
            return hVar;
        }
        m18045J0(20);
        throw null;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        C5229f c5229f = this.f49227h;
        if (c5229f != null) {
            return c5229f;
        }
        m18045J0(17);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        m18045J0(19);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8830c> mo13601m() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18045J0(23);
        throw null;
    }

    public final String toString() {
        return "enum entry " + mo11874a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        m18045J0(18);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        InterfaceC9077e interfaceC9077e = this.f49230k;
        if (interfaceC9077e != null) {
            return interfaceC9077e;
        }
        m18045J0(21);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: x */
    public final boolean mo13603x() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18045J0(22);
        throw null;
    }
}
