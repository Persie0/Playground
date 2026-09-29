package p420um;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import co.InterfaceC2074f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jo.C6532d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8856p;
import p373rn.AbstractC8875g;
import p492xn.C10254c;
import p492xn.C10255d;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C9562d0 extends AbstractC9580m0 implements InterfaceC8829b0 {

    /* JADX INFO: renamed from: H */
    public final CallableMemberDescriptor.Kind f49152H;

    /* JADX INFO: renamed from: I */
    public final boolean f49153I;

    /* JADX INFO: renamed from: J */
    public final boolean f49154J;

    /* JADX INFO: renamed from: K */
    public final boolean f49155K;

    /* JADX INFO: renamed from: L */
    public final boolean f49156L;

    /* JADX INFO: renamed from: M */
    public final boolean f49157M;

    /* JADX INFO: renamed from: N */
    public final boolean f49158N;

    /* JADX INFO: renamed from: O */
    public List<InterfaceC8835e0> f49159O;

    /* JADX INFO: renamed from: P */
    public InterfaceC8835e0 f49160P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC8835e0 f49161Q;

    /* JADX INFO: renamed from: R */
    public ArrayList f49162R;

    /* JADX INFO: renamed from: S */
    public C9564e0 f49163S;

    /* JADX INFO: renamed from: T */
    public InterfaceC8833d0 f49164T;

    /* JADX INFO: renamed from: U */
    public InterfaceC8856p f49165U;

    /* JADX INFO: renamed from: V */
    public InterfaceC8856p f49166V;

    /* JADX INFO: renamed from: i */
    public final Modality f49167i;

    /* JADX INFO: renamed from: j */
    public AbstractC8852n f49168j;

    /* JADX INFO: renamed from: k */
    public Collection<? extends InterfaceC8829b0> f49169k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC8829b0 f49170l;

    /* JADX INFO: renamed from: um.d0$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC8838g f49171a;

        /* JADX INFO: renamed from: b */
        public Modality f49172b;

        /* JADX INFO: renamed from: c */
        public AbstractC8852n f49173c;

        /* JADX INFO: renamed from: e */
        public CallableMemberDescriptor.Kind f49175e;

        /* JADX INFO: renamed from: h */
        public final InterfaceC8835e0 f49178h;

        /* JADX INFO: renamed from: i */
        public final C7648e f49179i;

        /* JADX INFO: renamed from: j */
        public final AbstractC5257t f49180j;

        /* JADX INFO: renamed from: d */
        public InterfaceC8829b0 f49174d = null;

        /* JADX INFO: renamed from: f */
        public AbstractC5252q0 f49176f = AbstractC5252q0.f33344a;

        /* JADX INFO: renamed from: g */
        public boolean f49177g = true;

        public a() {
            this.f49171a = C9562d0.this.mo11876g();
            this.f49172b = C9562d0.this.mo11891l();
            this.f49173c = C9562d0.this.mo11886f();
            this.f49175e = C9562d0.this.mo11897u();
            this.f49178h = C9562d0.this.f49160P;
            this.f49179i = C9562d0.this.mo11874a();
            this.f49180j = C9562d0.this.mo11884c();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18012a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public final C9562d0 m18013b() {
            AbstractC9561d abstractC9561d;
            C9568g0 c9568g0;
            C9564e0 c9564e0;
            C9566f0 c9566f0;
            InterfaceC2041a<InterfaceC2074f<AbstractC8875g<?>>> interfaceC2041a;
            C9562d0 c9562d0 = C9562d0.this;
            c9562d0.getClass();
            InterfaceC8838g interfaceC8838g = this.f49171a;
            Modality modality = this.f49172b;
            AbstractC8852n abstractC8852n = this.f49173c;
            InterfaceC8829b0 interfaceC8829b0 = this.f49174d;
            CallableMemberDescriptor.Kind kind = this.f49175e;
            C7648e c7648e = this.f49179i;
            InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
            C9562d0 c9562d0Mo5287W0 = c9562d0.mo5287W0(interfaceC8838g, modality, abstractC8852n, interfaceC8829b0, kind, c7648e);
            List<InterfaceC8847k0> listMo11895r = c9562d0.mo11895r();
            ArrayList arrayList = new ArrayList(((ArrayList) listMo11895r).size());
            TypeSubstitutor typeSubstitutorM359j2 = C0062b.m359j2(listMo11895r, this.f49176f, c9562d0Mo5287W0, arrayList);
            Variance variance = Variance.OUT_VARIANCE;
            AbstractC5257t abstractC5257t = this.f49180j;
            AbstractC5257t abstractC5257tM14205k = typeSubstitutorM359j2.m14205k(abstractC5257t, variance);
            if (abstractC5257tM14205k != null) {
                Variance variance2 = Variance.IN_VARIANCE;
                AbstractC5257t abstractC5257tM14205k2 = typeSubstitutorM359j2.m14205k(abstractC5257t, variance2);
                if (abstractC5257tM14205k2 != null) {
                    c9562d0Mo5287W0.mo5288Z0(abstractC5257tM14205k2);
                }
                InterfaceC8835e0 interfaceC8835e0 = this.f49178h;
                if (interfaceC8835e0 != null) {
                    AbstractC9561d abstractC9561dMo5312d = interfaceC8835e0.mo5312d(typeSubstitutorM359j2);
                    abstractC9561d = abstractC9561dMo5312d != null ? abstractC9561dMo5312d : null;
                }
                InterfaceC8835e0 interfaceC8835e1 = c9562d0.f49161Q;
                if (interfaceC8835e1 != null) {
                    AbstractC5257t abstractC5257tM14205k3 = typeSubstitutorM359j2.m14205k(interfaceC8835e1.mo11884c(), variance2);
                    c9568g0 = abstractC5257tM14205k3 == null ? null : new C9568g0(c9562d0Mo5287W0, new C10255d(c9562d0Mo5287W0, abstractC5257tM14205k3, interfaceC8835e1.getValue()), interfaceC8835e1.mo11289w());
                } else {
                    c9568g0 = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC8835e0 interfaceC8835e2 : c9562d0.f49159O) {
                    AbstractC5257t abstractC5257tM14205k4 = typeSubstitutorM359j2.m14205k(interfaceC8835e2.mo11884c(), Variance.IN_VARIANCE);
                    C9568g0 c9568g1 = abstractC5257tM14205k4 == null ? null : new C9568g0(c9562d0Mo5287W0, new C10254c(c9562d0Mo5287W0, abstractC5257tM14205k4, interfaceC8835e2.getValue()), interfaceC8835e2.mo11289w());
                    if (c9568g1 != null) {
                        arrayList2.add(c9568g1);
                    }
                }
                c9562d0Mo5287W0.m18011a1(abstractC5257tM14205k, arrayList, abstractC9561d, c9568g0, arrayList2);
                C9564e0 c9564e1 = c9562d0.f49163S;
                if (c9564e1 == null) {
                    c9564e0 = null;
                } else {
                    InterfaceC9077e interfaceC9077eMo11289w = c9564e1.mo11289w();
                    Modality modality2 = this.f49172b;
                    AbstractC8852n abstractC8852nMo11886f = c9562d0.f49163S.mo11886f();
                    if (this.f49175e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && C8850m.m17102e(abstractC8852nMo11886f.mo17096d())) {
                        abstractC8852nMo11886f = C8850m.f46741h;
                    }
                    AbstractC8852n abstractC8852n2 = abstractC8852nMo11886f;
                    C9564e0 c9564e2 = c9562d0.f49163S;
                    boolean z10 = c9564e2.f49144e;
                    boolean z11 = c9564e2.f49145f;
                    boolean z12 = c9564e2.f49148i;
                    CallableMemberDescriptor.Kind kind2 = this.f49175e;
                    InterfaceC8829b0 interfaceC8829b1 = this.f49174d;
                    c9564e0 = new C9564e0(c9562d0Mo5287W0, interfaceC9077eMo11289w, modality2, abstractC8852n2, z10, z11, z12, kind2, interfaceC8829b1 == null ? null : interfaceC8829b1.mo11888h(), aVar);
                }
                if (c9564e0 != null) {
                    C9564e0 c9564e3 = c9562d0.f49163S;
                    AbstractC5257t abstractC5257t2 = c9564e3.f49183H;
                    c9564e0.f49151l = C9562d0.m18008X0(typeSubstitutorM359j2, c9564e3);
                    c9564e0.m18016X0(abstractC5257t2 != null ? typeSubstitutorM359j2.m14205k(abstractC5257t2, Variance.OUT_VARIANCE) : null);
                }
                InterfaceC8833d0 interfaceC8833d0 = c9562d0.f49164T;
                if (interfaceC8833d0 == null) {
                    c9566f0 = null;
                } else {
                    InterfaceC9077e interfaceC9077eMo11289w2 = interfaceC8833d0.mo11289w();
                    Modality modality3 = this.f49172b;
                    AbstractC8852n abstractC8852nMo11886f2 = c9562d0.f49164T.mo11886f();
                    if (this.f49175e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && C8850m.m17102e(abstractC8852nMo11886f2.mo17096d())) {
                        abstractC8852nMo11886f2 = C8850m.f46741h;
                    }
                    AbstractC8852n abstractC8852n3 = abstractC8852nMo11886f2;
                    boolean zMo13622c0 = c9562d0.f49164T.mo13622c0();
                    boolean zMo5293D = c9562d0.f49164T.mo5293D();
                    boolean zMo5301x = c9562d0.f49164T.mo5301x();
                    CallableMemberDescriptor.Kind kind3 = this.f49175e;
                    InterfaceC8829b0 interfaceC8829b2 = this.f49174d;
                    c9566f0 = new C9566f0(c9562d0Mo5287W0, interfaceC9077eMo11289w2, modality3, abstractC8852n3, zMo13622c0, zMo5293D, zMo5301x, kind3, interfaceC8829b2 == null ? null : interfaceC8829b2.mo11887g0(), aVar);
                }
                if (c9566f0 != null) {
                    List listM13634X0 = AbstractC6828b.m13634X0(c9566f0, c9562d0.f49164T.mo11889i(), typeSubstitutorM359j2, false, false, null);
                    if (listM13634X0 == null) {
                        listM13634X0 = Collections.singletonList(C9566f0.m18018W0(c9566f0, DescriptorUtilsKt.m14108e(this.f49171a).m13558o(), c9562d0.f49164T.mo11889i().get(0).mo11289w()));
                    }
                    if (listM13634X0.size() != 1) {
                        throw new IllegalStateException();
                    }
                    c9566f0.f49151l = C9562d0.m18008X0(typeSubstitutorM359j2, c9562d0.f49164T);
                    InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) listM13634X0.get(0);
                    if (interfaceC8853n0 == null) {
                        C9566f0.m18017N(6);
                        throw null;
                    }
                    c9566f0.f49188H = interfaceC8853n0;
                }
                InterfaceC8856p interfaceC8856p = c9562d0.f49165U;
                C9586s c9586s = interfaceC8856p == null ? null : new C9586s(c9562d0Mo5287W0, interfaceC8856p.mo11289w());
                InterfaceC8856p interfaceC8856p2 = c9562d0.f49166V;
                c9562d0Mo5287W0.m18010Y0(c9564e0, c9566f0, c9586s, interfaceC8856p2 != null ? new C9586s(c9562d0Mo5287W0, interfaceC8856p2.mo11289w()) : null);
                if (this.f49177g) {
                    C6532d c6532d = new C6532d();
                    Iterator<? extends InterfaceC8829b0> it = c9562d0.mo11893p().iterator();
                    while (it.hasNext()) {
                        c6532d.add(it.next().mo5312d(typeSubstitutorM359j2));
                    }
                    c9562d0Mo5287W0.mo11847G0(c6532d);
                }
                if (!c9562d0.mo5286F() || (interfaceC2041a = c9562d0.f49223h) == null) {
                    return c9562d0Mo5287W0;
                }
                c9562d0Mo5287W0.m18041P0(c9562d0.f49222g, interfaceC2041a);
                return c9562d0Mo5287W0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9562d0(InterfaceC8838g interfaceC8838g, InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, Modality modality, AbstractC8852n abstractC8852n, boolean z10, C7648e c7648e, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC8838g, interfaceC9077e, c7648e, z10, interfaceC8837f0);
        if (interfaceC8838g == null) {
            m18007N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18007N(1);
            throw null;
        }
        if (modality == null) {
            m18007N(2);
            throw null;
        }
        if (abstractC8852n == null) {
            m18007N(3);
            throw null;
        }
        if (c7648e == null) {
            m18007N(4);
            throw null;
        }
        if (kind == null) {
            m18007N(5);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18007N(6);
            throw null;
        }
        this.f49169k = null;
        this.f49159O = Collections.emptyList();
        this.f49167i = modality;
        this.f49168j = abstractC8852n;
        this.f49170l = interfaceC8829b0 == null ? this : interfaceC8829b0;
        this.f49152H = kind;
        this.f49153I = z11;
        this.f49154J = z12;
        this.f49155K = z13;
        this.f49156L = z14;
        this.f49157M = z15;
        this.f49158N = z16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18007N(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X0 */
    public static InterfaceC6822c m18008X0(TypeSubstitutor typeSubstitutor, InterfaceC6823d interfaceC6823d) {
        if (interfaceC6823d != null) {
            return interfaceC6823d.mo13620k0() != null ? interfaceC6823d.mo13620k0().mo5312d(typeSubstitutor) : null;
        }
        m18007N(31);
        throw null;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: A */
    public final ArrayList mo11880A() {
        ArrayList arrayList = new ArrayList(2);
        C9564e0 c9564e0 = this.f49163S;
        if (c9564e0 != null) {
            arrayList.add(c9564e0);
        }
        InterfaceC8833d0 interfaceC8833d0 = this.f49164T;
        if (interfaceC8833d0 != null) {
            arrayList.add(interfaceC8833d0);
        }
        return arrayList;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14061j(this, d10);
    }

    /* JADX INFO: renamed from: D */
    public boolean mo5293D() {
        return this.f49157M;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo5286F() {
        return this.f49154J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: G0 */
    public final void mo11847G0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != 0) {
            this.f49169k = collection;
        } else {
            m18007N(40);
            throw null;
        }
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return this.f49156L;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return this.f49155K;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: V */
    public final boolean mo11883V() {
        return this.f49158N;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final C9562d0 mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        a aVar = new a();
        if (interfaceC8838g == null) {
            a.m18012a(0);
            throw null;
        }
        aVar.f49171a = interfaceC8838g;
        aVar.f49174d = null;
        aVar.f49172b = modality;
        if (abstractC8848l == null) {
            a.m18012a(8);
            throw null;
        }
        aVar.f49173c = abstractC8848l;
        if (kind == null) {
            a.m18012a(10);
            throw null;
        }
        aVar.f49175e = kind;
        aVar.f49177g = false;
        C9562d0 c9562d0M18013b = aVar.m18013b();
        if (c9562d0M18013b != null) {
            return c9562d0M18013b;
        }
        m18007N(42);
        throw null;
    }

    /* JADX INFO: renamed from: W0 */
    public C9562d0 mo5287W0(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8852n abstractC8852n, InterfaceC8829b0 interfaceC8829b0, CallableMemberDescriptor.Kind kind, C7648e c7648e) {
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        if (interfaceC8838g == null) {
            m18007N(32);
            throw null;
        }
        if (modality == null) {
            m18007N(33);
            throw null;
        }
        if (abstractC8852n == null) {
            m18007N(34);
            throw null;
        }
        if (kind == null) {
            m18007N(35);
            throw null;
        }
        if (c7648e != null) {
            return new C9562d0(interfaceC8838g, interfaceC8829b0, mo11289w(), modality, abstractC8852n, this.f49221f, c7648e, kind, aVar, this.f49153I, mo5286F(), this.f49155K, this.f49156L, mo5293D(), this.f49158N);
        }
        m18007N(36);
        throw null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m18010Y0(C9564e0 c9564e0, C9566f0 c9566f0, InterfaceC8856p interfaceC8856p, InterfaceC8856p interfaceC8856p2) {
        this.f49163S = c9564e0;
        this.f49164T = c9566f0;
        this.f49165U = interfaceC8856p;
        this.f49166V = interfaceC8856p2;
    }

    /* JADX INFO: renamed from: Z0 */
    public void mo5288Z0(AbstractC5257t abstractC5257t) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a1 */
    public final void m18011a1(AbstractC5257t abstractC5257t, List list, InterfaceC8835e0 interfaceC8835e0, C9568g0 c9568g0, List list2) {
        if (abstractC5257t == null) {
            m18007N(17);
            throw null;
        }
        if (list == null) {
            m18007N(18);
            throw null;
        }
        if (list2 == null) {
            m18007N(19);
            throw null;
        }
        this.f49218e = abstractC5257t;
        this.f49162R = new ArrayList(list);
        this.f49161Q = c9568g0;
        this.f49160P = interfaceC8835e0;
        this.f49159O = list2;
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8829b0 mo18004P0() {
        InterfaceC8829b0 interfaceC8829b0 = this.f49170l;
        InterfaceC8829b0 interfaceC8829b0Mo18004P0 = interfaceC8829b0 == this ? this : interfaceC8829b0.mo18004P0();
        if (interfaceC8829b0Mo18004P0 != null) {
            return interfaceC8829b0Mo18004P0;
        }
        m18007N(38);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8829b0 mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m18007N(27);
            throw null;
        }
        if (typeSubstitutor.m14203h()) {
            return this;
        }
        a aVar = new a();
        AbstractC5252q0 abstractC5252q0M14202g = typeSubstitutor.m14202g();
        if (abstractC5252q0M14202g == null) {
            a.m18012a(15);
            throw null;
        }
        aVar.f49176f = abstractC5252q0M14202g;
        aVar.f49174d = mo18004P0();
        return aVar.m18013b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        AbstractC8852n abstractC8852n = this.f49168j;
        if (abstractC8852n != null) {
            return abstractC8852n;
        }
        m18007N(25);
        throw null;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC8833d0 mo11887g0() {
        return this.f49164T;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: h */
    public final C9564e0 mo11888h() {
        return this.f49163S;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modality = this.f49167i;
        if (modality != null) {
            return modality;
        }
        m18007N(24);
        throw null;
    }

    @Override // p420um.AbstractC9578l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8835e0 mo11892m0() {
        return this.f49160P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC8829b0> mo11893p() {
        Collection<? extends InterfaceC8829b0> collectionEmptyList = this.f49169k;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        m18007N(41);
        throw null;
    }

    /* JADX INFO: renamed from: p0 */
    public <V> V mo5289p0(InterfaceC6816a.a<V> aVar) {
        return null;
    }

    @Override // p420um.AbstractC9578l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11895r() {
        ArrayList arrayList = this.f49162R;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(AbstractC9581n.m18043P(this)));
    }

    @Override // p420um.AbstractC9578l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC8835e0 mo11896s0() {
        return this.f49161Q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: u */
    public final CallableMemberDescriptor.Kind mo11897u() {
        CallableMemberDescriptor.Kind kind = this.f49152H;
        if (kind != null) {
            return kind;
        }
        m18007N(39);
        throw null;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC8856p mo11898u0() {
        return this.f49166V;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC8856p mo11899x0() {
        return this.f49165U;
    }

    @Override // p420um.AbstractC9578l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        AbstractC5257t abstractC5257tMo11884c = mo11884c();
        if (abstractC5257tMo11884c != null) {
            return abstractC5257tMo11884c;
        }
        m18007N(23);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y0 */
    public final List<InterfaceC8835e0> mo11901y0() {
        List<InterfaceC8835e0> list = this.f49159O;
        if (list != null) {
            return list;
        }
        m18007N(22);
        throw null;
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: z0 */
    public final boolean mo11902z0() {
        return this.f49153I;
    }
}
