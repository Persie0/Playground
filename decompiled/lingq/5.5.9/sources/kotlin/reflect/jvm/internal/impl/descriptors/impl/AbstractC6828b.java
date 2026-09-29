package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p420um.AbstractC9561d;
import p420um.AbstractC9582o;
import p420um.C9568g0;
import p420um.C9587t;
import p492xn.C10255d;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8412c;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6828b extends AbstractC9582o implements InterfaceC6822c {

    /* JADX INFO: renamed from: H */
    public boolean f38514H;

    /* JADX INFO: renamed from: I */
    public boolean f38515I;

    /* JADX INFO: renamed from: J */
    public boolean f38516J;

    /* JADX INFO: renamed from: K */
    public boolean f38517K;

    /* JADX INFO: renamed from: L */
    public boolean f38518L;

    /* JADX INFO: renamed from: M */
    public boolean f38519M;

    /* JADX INFO: renamed from: N */
    public boolean f38520N;

    /* JADX INFO: renamed from: O */
    public boolean f38521O;

    /* JADX INFO: renamed from: P */
    public boolean f38522P;

    /* JADX INFO: renamed from: Q */
    public boolean f38523Q;

    /* JADX INFO: renamed from: R */
    public boolean f38524R;

    /* JADX INFO: renamed from: S */
    public boolean f38525S;

    /* JADX INFO: renamed from: T */
    public Collection<? extends InterfaceC6822c> f38526T;

    /* JADX INFO: renamed from: U */
    public volatile InterfaceC2041a<Collection<InterfaceC6822c>> f38527U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC6822c f38528V;

    /* JADX INFO: renamed from: W */
    public final CallableMemberDescriptor.Kind f38529W;

    /* JADX INFO: renamed from: X */
    public InterfaceC6822c f38530X;

    /* JADX INFO: renamed from: Y */
    public Map<InterfaceC6816a.a<?>, Object> f38531Y;

    /* JADX INFO: renamed from: e */
    public List<InterfaceC8847k0> f38532e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC8853n0> f38533f;

    /* JADX INFO: renamed from: g */
    public AbstractC5257t f38534g;

    /* JADX INFO: renamed from: h */
    public List<InterfaceC8835e0> f38535h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8835e0 f38536i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8835e0 f38537j;

    /* JADX INFO: renamed from: k */
    public Modality f38538k;

    /* JADX INFO: renamed from: l */
    public AbstractC8852n f38539l;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b$a */
    public class a implements InterfaceC6822c.a<InterfaceC6822c> {

        /* JADX INFO: renamed from: a */
        public AbstractC5252q0 f38540a;

        /* JADX INFO: renamed from: b */
        public InterfaceC8838g f38541b;

        /* JADX INFO: renamed from: c */
        public Modality f38542c;

        /* JADX INFO: renamed from: d */
        public AbstractC8852n f38543d;

        /* JADX INFO: renamed from: e */
        public InterfaceC6822c f38544e;

        /* JADX INFO: renamed from: f */
        public CallableMemberDescriptor.Kind f38545f;

        /* JADX INFO: renamed from: g */
        public List<InterfaceC8853n0> f38546g;

        /* JADX INFO: renamed from: h */
        public final List<InterfaceC8835e0> f38547h;

        /* JADX INFO: renamed from: i */
        public InterfaceC8835e0 f38548i;

        /* JADX INFO: renamed from: j */
        public InterfaceC8835e0 f38549j;

        /* JADX INFO: renamed from: k */
        public AbstractC5257t f38550k;

        /* JADX INFO: renamed from: l */
        public C7648e f38551l;

        /* JADX INFO: renamed from: m */
        public boolean f38552m;

        /* JADX INFO: renamed from: n */
        public boolean f38553n;

        /* JADX INFO: renamed from: o */
        public boolean f38554o;

        /* JADX INFO: renamed from: p */
        public boolean f38555p;

        /* JADX INFO: renamed from: q */
        public boolean f38556q;

        /* JADX INFO: renamed from: r */
        public List<InterfaceC8847k0> f38557r;

        /* JADX INFO: renamed from: s */
        public InterfaceC9077e f38558s;

        /* JADX INFO: renamed from: t */
        public boolean f38559t;

        /* JADX INFO: renamed from: u */
        public final LinkedHashMap f38560u;

        /* JADX INFO: renamed from: v */
        public Boolean f38561v;

        /* JADX INFO: renamed from: w */
        public boolean f38562w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC6828b f38563x;

        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        public a(AbstractC6828b abstractC6828b, AbstractC5252q0 abstractC5252q0, InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8852n abstractC8852n, CallableMemberDescriptor.Kind kind, List list, List list2, InterfaceC8835e0 interfaceC8835e0, AbstractC5257t abstractC5257t) {
            if (abstractC5252q0 == null) {
                m13640t(0);
                throw null;
            }
            if (interfaceC8838g == null) {
                m13640t(1);
                throw null;
            }
            if (modality == null) {
                m13640t(2);
                throw null;
            }
            if (abstractC8852n == null) {
                m13640t(3);
                throw null;
            }
            if (kind == null) {
                m13640t(4);
                throw null;
            }
            if (list == null) {
                m13640t(5);
                throw null;
            }
            if (list2 == null) {
                m13640t(6);
                throw null;
            }
            if (abstractC5257t == null) {
                m13640t(7);
                throw null;
            }
            this.f38563x = abstractC6828b;
            this.f38544e = null;
            this.f38549j = abstractC6828b.f38537j;
            this.f38552m = true;
            this.f38553n = false;
            this.f38554o = false;
            this.f38555p = false;
            this.f38556q = abstractC6828b.f38521O;
            this.f38557r = null;
            this.f38558s = null;
            this.f38559t = abstractC6828b.f38522P;
            this.f38560u = new LinkedHashMap();
            this.f38561v = null;
            this.f38562w = false;
            this.f38540a = abstractC5252q0;
            this.f38541b = interfaceC8838g;
            this.f38542c = modality;
            this.f38543d = abstractC8852n;
            this.f38545f = kind;
            this.f38546g = list;
            this.f38547h = list2;
            this.f38548i = interfaceC8835e0;
            this.f38550k = abstractC5257t;
            this.f38551l = null;
        }

        /* JADX INFO: renamed from: t */
        public static /* synthetic */ void m13640t(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6822c mo11851a() {
            return this.f38563x.mo13635W0(this);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC6822c.a mo11852b(EmptyList emptyList) {
            if (emptyList != null) {
                this.f38557r = emptyList;
                return this;
            }
            m13640t(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6822c.a mo11853c(List list) {
            if (list != null) {
                this.f38546g = list;
                return this;
            }
            m13640t(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: d */
        public final InterfaceC6822c.a mo11854d(Boolean bool) {
            this.f38560u.put(JavaMethodDescriptor.f38657c0, bool);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: e */
        public final InterfaceC6822c.a mo11855e(AbstractC5257t abstractC5257t) {
            if (abstractC5257t != null) {
                this.f38550k = abstractC5257t;
                return this;
            }
            m13640t(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: f */
        public final InterfaceC6822c.a mo11856f(InterfaceC8838g interfaceC8838g) {
            if (interfaceC8838g != null) {
                this.f38541b = interfaceC8838g;
                return this;
            }
            m13640t(8);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: g */
        public final InterfaceC6822c.a mo11857g(Modality modality) {
            if (modality != null) {
                this.f38542c = modality;
                return this;
            }
            m13640t(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: h */
        public final InterfaceC6822c.a mo11858h() {
            this.f38554o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: i */
        public final InterfaceC6822c.a mo11859i() {
            this.f38559t = true;
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: j */
        public final InterfaceC6822c.a mo11860j(C7648e c7648e) {
            if (c7648e != null) {
                this.f38551l = c7648e;
                return this;
            }
            m13640t(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: k */
        public final InterfaceC6822c.a mo11861k(InterfaceC8828b interfaceC8828b) {
            this.f38544e = interfaceC8828b;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: l */
        public final InterfaceC6822c.a mo11862l() {
            this.f38552m = false;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: m */
        public final InterfaceC6822c.a mo11863m(AbstractC8852n abstractC8852n) {
            if (abstractC8852n != null) {
                this.f38543d = abstractC8852n;
                return this;
            }
            m13640t(12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: n */
        public final InterfaceC6822c.a mo11864n() {
            this.f38556q = true;
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: o */
        public final InterfaceC6822c.a mo11865o(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f38545f = kind;
                return this;
            }
            m13640t(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: p */
        public final InterfaceC6822c.a mo11866p(AbstractC5252q0 abstractC5252q0) {
            if (abstractC5252q0 != null) {
                this.f38540a = abstractC5252q0;
                return this;
            }
            m13640t(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: q */
        public final InterfaceC6822c.a mo11867q(InterfaceC9077e interfaceC9077e) {
            if (interfaceC9077e != null) {
                this.f38558s = interfaceC9077e;
                return this;
            }
            m13640t(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: r */
        public final InterfaceC6822c.a mo11868r(InterfaceC8835e0 interfaceC8835e0) {
            this.f38549j = interfaceC8835e0;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c.a
        /* JADX INFO: renamed from: s */
        public final InterfaceC6822c.a mo11869s() {
            this.f38553n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC6828b(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        super(interfaceC8838g, interfaceC9077e, c7648e, interfaceC8837f0);
        if (interfaceC8838g == null) {
            m13633N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m13633N(1);
            throw null;
        }
        if (c7648e == null) {
            m13633N(2);
            throw null;
        }
        if (kind == null) {
            m13633N(3);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m13633N(4);
            throw null;
        }
        this.f38539l = C8850m.f46742i;
        this.f38514H = false;
        this.f38515I = false;
        this.f38516J = false;
        this.f38517K = false;
        this.f38518L = false;
        this.f38519M = false;
        this.f38520N = false;
        this.f38521O = false;
        this.f38522P = false;
        this.f38523Q = false;
        this.f38524R = true;
        this.f38525S = false;
        this.f38526T = null;
        this.f38527U = null;
        this.f38530X = null;
        this.f38531Y = null;
        this.f38528V = interfaceC6822c == null ? this : interfaceC6822c;
        this.f38529W = kind;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13633N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            default:
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "typeParameters";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static ArrayList m13634X0(InterfaceC6822c interfaceC6822c, List list, TypeSubstitutor typeSubstitutor, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            m13633N(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) it.next();
            AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
            Variance variance = Variance.IN_VARIANCE;
            AbstractC5257t abstractC5257tM14205k = typeSubstitutor.m14205k(abstractC5257tMo11884c, variance);
            AbstractC5257t abstractC5257tMo13647r0 = interfaceC8853n0.mo13647r0();
            AbstractC5257t abstractC5257tM14205k2 = abstractC5257tMo13647r0 == null ? null : typeSubstitutor.m14205k(abstractC5257tMo13647r0, variance);
            if (abstractC5257tM14205k == null) {
                return null;
            }
            if ((abstractC5257tM14205k != interfaceC8853n0.mo11884c() || abstractC5257tMo13647r0 != abstractC5257tM14205k2) && zArr != null) {
                zArr[0] = true;
            }
            C9587t c9587t = interfaceC8853n0 instanceof C6830d.a ? new C9587t((List) ((C6830d.a) interfaceC8853n0).f38579l.getValue()) : null;
            InterfaceC8853n0 interfaceC8853n1 = z10 ? null : interfaceC8853n0;
            int index = interfaceC8853n0.getIndex();
            InterfaceC9077e interfaceC9077eMo11289w = interfaceC8853n0.mo11289w();
            C7648e c7648eMo11874a = interfaceC8853n0.mo11874a();
            boolean zMo13643B0 = interfaceC8853n0.mo13643B0();
            boolean zMo13645i0 = interfaceC8853n0.mo13645i0();
            boolean zMo13644f0 = interfaceC8853n0.mo13644f0();
            InterfaceC8837f0 interfaceC8837f0Mo11890j = z11 ? interfaceC8853n0.mo11890j() : InterfaceC8837f0.f46730a;
            C5207g.m11111f(interfaceC9077eMo11289w, "annotations");
            C5207g.m11111f(c7648eMo11874a, "name");
            C5207g.m11111f(interfaceC8837f0Mo11890j, "source");
            arrayList.add(c9587t == null ? new C6830d(interfaceC6822c, interfaceC8853n1, index, interfaceC9077eMo11289w, c7648eMo11874a, abstractC5257tM14205k, zMo13643B0, zMo13645i0, zMo13644f0, abstractC5257tM14205k2, interfaceC8837f0Mo11890j) : new C6830d.a(interfaceC6822c, interfaceC8853n1, index, interfaceC9077eMo11289w, c7648eMo11874a, abstractC5257tM14205k, zMo13643B0, zMo13645i0, zMo13644f0, abstractC5257tM14205k2, interfaceC8837f0Mo11890j, c9587t));
        }
        return arrayList;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14062k(this, d10);
    }

    /* JADX INFO: renamed from: D */
    public boolean mo5293D() {
        return this.f38516J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: E0 */
    public final boolean mo13616E0() {
        return this.f38521O;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean mo5294F0() {
        return this.f38523Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public void mo11847G0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            m13633N(17);
            throw null;
        }
        this.f38526T = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6822c) it.next()).mo13617L0()) {
                this.f38522P = true;
                break;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: L0 */
    public final boolean mo13617L0() {
        return this.f38522P;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo5278M() {
        return this.f38525S;
    }

    /* JADX INFO: renamed from: M0 */
    public InterfaceC6822c.a<? extends InterfaceC6822c> mo11848M0() {
        return m13637Z0(TypeSubstitutor.f39894b);
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return this.f38520N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6822c mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        InterfaceC6822c interfaceC6822cMo11851a = mo11848M0().mo11856f(interfaceC8838g).mo11857g(modality).mo11863m(abstractC8848l).mo11865o(kind).mo11862l().mo11851a();
        if (interfaceC6822cMo11851a != null) {
            return interfaceC6822cMo11851a;
        }
        m13633N(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: R0 */
    public final boolean mo13618R0() {
        if (this.f38515I) {
            return true;
        }
        Iterator<? extends CallableMemberDescriptor> it = mo18004P0().mo11893p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC6822c) it.next()).mo13618R0()) {
                return true;
            }
        }
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return this.f38519M;
    }

    /* JADX INFO: renamed from: V0 */
    public abstract AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e);

    /* JADX INFO: renamed from: W */
    public boolean mo5296W() {
        return this.f38518L;
    }

    /* JADX INFO: renamed from: W0 */
    public AbstractC6828b mo13635W0(a aVar) {
        C9568g0 c9568g0;
        AbstractC9561d abstractC9561d;
        AbstractC5257t abstractC5257tM14205k;
        if (aVar == null) {
            m13633N(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        InterfaceC9077e interfaceC9077eM409w0 = aVar.f38558s != null ? C0062b.m409w0(mo11289w(), aVar.f38558s) : mo11289w();
        InterfaceC8838g interfaceC8838g = aVar.f38541b;
        InterfaceC6822c interfaceC6822c = aVar.f38544e;
        CallableMemberDescriptor.Kind kind = aVar.f38545f;
        C7648e c7648e = aVar.f38551l;
        InterfaceC8837f0 interfaceC8837f0Mo11890j = aVar.f38554o ? (interfaceC6822c != null ? interfaceC6822c : mo18004P0()).mo11890j() : InterfaceC8837f0.f46730a;
        if (interfaceC8837f0Mo11890j == null) {
            m13633N(27);
            throw null;
        }
        AbstractC6828b abstractC6828bMo5279V0 = mo5279V0(kind, interfaceC8838g, interfaceC6822c, interfaceC8837f0Mo11890j, interfaceC9077eM409w0, c7648e);
        List<InterfaceC8847k0> listMo11895r = aVar.f38557r;
        if (listMo11895r == null) {
            listMo11895r = mo11895r();
        }
        zArr[0] = zArr[0] | (!listMo11895r.isEmpty());
        ArrayList arrayList = new ArrayList(listMo11895r.size());
        TypeSubstitutor typeSubstitutorM363k2 = C0062b.m363k2(listMo11895r, aVar.f38540a, abstractC6828bMo5279V0, arrayList, zArr);
        if (typeSubstitutorM363k2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!aVar.f38547h.isEmpty()) {
            for (InterfaceC8835e0 interfaceC8835e0 : aVar.f38547h) {
                AbstractC5257t abstractC5257tM14205k2 = typeSubstitutorM363k2.m14205k(interfaceC8835e0.mo11884c(), Variance.IN_VARIANCE);
                if (abstractC5257tM14205k2 == null) {
                    return null;
                }
                arrayList2.add(C8412c.m16433b(abstractC6828bMo5279V0, abstractC5257tM14205k2, interfaceC8835e0.mo11289w()));
                zArr[0] = (abstractC5257tM14205k2 != interfaceC8835e0.mo11884c()) | zArr[0];
            }
        }
        InterfaceC8835e0 interfaceC8835e1 = aVar.f38548i;
        if (interfaceC8835e1 != null) {
            AbstractC5257t abstractC5257tM14205k3 = typeSubstitutorM363k2.m14205k(interfaceC8835e1.mo11884c(), Variance.IN_VARIANCE);
            if (abstractC5257tM14205k3 == null) {
                return null;
            }
            C9568g0 c9568g1 = new C9568g0(abstractC6828bMo5279V0, new C10255d(abstractC6828bMo5279V0, abstractC5257tM14205k3, aVar.f38548i.getValue()), aVar.f38548i.mo11289w());
            zArr[0] = (abstractC5257tM14205k3 != aVar.f38548i.mo11884c()) | zArr[0];
            c9568g0 = c9568g1;
        } else {
            c9568g0 = null;
        }
        InterfaceC8835e0 interfaceC8835e2 = aVar.f38549j;
        if (interfaceC8835e2 != null) {
            AbstractC9561d abstractC9561dMo5312d = interfaceC8835e2.mo5312d(typeSubstitutorM363k2);
            if (abstractC9561dMo5312d == null) {
                return null;
            }
            zArr[0] = zArr[0] | (abstractC9561dMo5312d != aVar.f38549j);
            abstractC9561d = abstractC9561dMo5312d;
        } else {
            abstractC9561d = null;
        }
        ArrayList arrayListM13634X0 = m13634X0(abstractC6828bMo5279V0, aVar.f38546g, typeSubstitutorM363k2, aVar.f38555p, aVar.f38554o, zArr);
        if (arrayListM13634X0 == null || (abstractC5257tM14205k = typeSubstitutorM363k2.m14205k(aVar.f38550k, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (abstractC5257tM14205k != aVar.f38550k);
        zArr[0] = z10;
        if (!z10 && aVar.f38562w) {
            return this;
        }
        abstractC6828bMo5279V0.mo13636Y0(c9568g0, abstractC9561d, arrayList2, arrayList, arrayListM13634X0, abstractC5257tM14205k, aVar.f38542c, aVar.f38543d);
        abstractC6828bMo5279V0.f38514H = this.f38514H;
        abstractC6828bMo5279V0.f38515I = this.f38515I;
        abstractC6828bMo5279V0.f38516J = this.f38516J;
        abstractC6828bMo5279V0.f38517K = this.f38517K;
        abstractC6828bMo5279V0.f38518L = this.f38518L;
        abstractC6828bMo5279V0.f38523Q = this.f38523Q;
        abstractC6828bMo5279V0.f38519M = this.f38519M;
        abstractC6828bMo5279V0.f38520N = this.f38520N;
        abstractC6828bMo5279V0.mo5280b1(this.f38524R);
        abstractC6828bMo5279V0.f38521O = aVar.f38556q;
        abstractC6828bMo5279V0.f38522P = aVar.f38559t;
        Boolean bool = aVar.f38561v;
        abstractC6828bMo5279V0.mo5281c1(bool != null ? bool.booleanValue() : this.f38525S);
        if (!aVar.f38560u.isEmpty() || this.f38531Y != null) {
            LinkedHashMap linkedHashMap = aVar.f38560u;
            Map<InterfaceC6816a.a<?>, Object> map = this.f38531Y;
            if (map != null) {
                for (Map.Entry<InterfaceC6816a.a<?>, Object> entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                abstractC6828bMo5279V0.f38531Y = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                abstractC6828bMo5279V0.f38531Y = linkedHashMap;
            }
        }
        if (aVar.f38553n || this.f38530X != null) {
            InterfaceC6822c interfaceC6822c2 = this.f38530X;
            if (interfaceC6822c2 == null) {
                interfaceC6822c2 = this;
            }
            abstractC6828bMo5279V0.f38530X = interfaceC6822c2.mo5312d(typeSubstitutorM363k2);
        }
        if (aVar.f38552m && !mo18004P0().mo11893p().isEmpty()) {
            if (aVar.f38540a.mo11276e()) {
                InterfaceC2041a<Collection<InterfaceC6822c>> interfaceC2041a = this.f38527U;
                if (interfaceC2041a != null) {
                    abstractC6828bMo5279V0.f38527U = interfaceC2041a;
                } else {
                    abstractC6828bMo5279V0.mo11847G0(mo11893p());
                }
            } else {
                abstractC6828bMo5279V0.f38527U = new C6827a(this, typeSubstitutorM363k2);
            }
        }
        return abstractC6828bMo5279V0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: X */
    public final boolean mo13619X() {
        if (this.f38514H) {
            return true;
        }
        Iterator<? extends CallableMemberDescriptor> it = mo18004P0().mo11893p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC6822c) it.next()).mo13619X()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: Y0 */
    public void mo13636Y0(C9568g0 c9568g0, InterfaceC8835e0 interfaceC8835e0, List list, List list2, List list3, AbstractC5257t abstractC5257t, Modality modality, AbstractC8852n abstractC8852n) {
        if (list == null) {
            m13633N(5);
            throw null;
        }
        if (list2 == null) {
            m13633N(6);
            throw null;
        }
        if (list3 == null) {
            m13633N(7);
            throw null;
        }
        if (abstractC8852n == null) {
            m13633N(8);
            throw null;
        }
        this.f38532e = C6752c.m13453u0(list2);
        this.f38533f = C6752c.m13453u0(list3);
        this.f38534g = abstractC5257t;
        this.f38538k = modality;
        this.f38539l = abstractC8852n;
        this.f38536i = c9568g0;
        this.f38537j = interfaceC8835e0;
        this.f38535h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) list2.get(i10);
            if (interfaceC8847k0.getIndex() != i10) {
                throw new IllegalStateException(interfaceC8847k0 + " index is " + interfaceC8847k0.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) list3.get(i11);
            if (interfaceC8853n0.getIndex() != i11 + 0) {
                throw new IllegalStateException(interfaceC8853n0 + "index is " + interfaceC8853n0.getIndex() + " but position is " + i11);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final a m13637Z0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new a(this, typeSubstitutor.m14202g(), mo11876g(), mo11891l(), mo11886f(), mo11897u(), mo11889i(), mo11901y0(), this.f38536i, mo11900y());
        }
        m13633N(24);
        throw null;
    }

    /* JADX INFO: renamed from: a1 */
    public final <V> void m13638a1(InterfaceC6816a.a<V> aVar, Object obj) {
        if (this.f38531Y == null) {
            this.f38531Y = new LinkedHashMap();
        }
        this.f38531Y.put(aVar, obj);
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public InterfaceC6822c mo18004P0() {
        InterfaceC6822c interfaceC6822c = this.f38528V;
        InterfaceC6822c interfaceC6822cMo18004P0 = interfaceC6822c == this ? this : interfaceC6822c.mo18004P0();
        if (interfaceC6822cMo18004P0 != null) {
            return interfaceC6822cMo18004P0;
        }
        m13633N(20);
        throw null;
    }

    /* JADX INFO: renamed from: b1 */
    public void mo5280b1(boolean z10) {
        this.f38524R = z10;
    }

    /* JADX INFO: renamed from: c1 */
    public void mo5281c1(boolean z10) {
        this.f38525S = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public InterfaceC6822c mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m13633N(22);
            throw null;
        }
        if (typeSubstitutor.m14203h()) {
            return this;
        }
        a aVarM13637Z0 = m13637Z0(typeSubstitutor);
        aVarM13637Z0.f38544e = mo18004P0();
        aVarM13637Z0.f38554o = true;
        aVarM13637Z0.f38562w = true;
        return aVarM13637Z0.mo11851a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d1 */
    public final void m13639d1(AbstractC5265x abstractC5265x) {
        if (abstractC5265x != null) {
            this.f38534g = abstractC5265x;
        } else {
            m13633N(11);
            throw null;
        }
    }

    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        AbstractC8852n abstractC8852n = this.f38539l;
        if (abstractC8852n != null) {
            return abstractC8852n;
        }
        m13633N(16);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        List<InterfaceC8853n0> list = this.f38533f;
        if (list != null) {
            return list;
        }
        m13633N(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC6822c mo13620k0() {
        return this.f38530X;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modality = this.f38538k;
        if (modality != null) {
            return modality;
        }
        m13633N(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8835e0 mo11892m0() {
        return this.f38537j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public Collection<? extends InterfaceC6822c> mo11893p() {
        InterfaceC2041a<Collection<InterfaceC6822c>> interfaceC2041a = this.f38527U;
        if (interfaceC2041a != null) {
            this.f38526T = interfaceC2041a.mo807E();
            this.f38527U = null;
        }
        Collection<? extends InterfaceC6822c> collectionEmptyList = this.f38526T;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        m13633N(14);
        throw null;
    }

    /* JADX INFO: renamed from: p0 */
    public <V> V mo5289p0(InterfaceC6816a.a<V> aVar) {
        Map<InterfaceC6816a.a<?>, Object> map = this.f38531Y;
        if (map == null) {
            return null;
        }
        return (V) map.get(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11895r() {
        List<InterfaceC8847k0> list = this.f38532e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC8835e0 mo11896s0() {
        return this.f38536i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: u */
    public final CallableMemberDescriptor.Kind mo11897u() {
        CallableMemberDescriptor.Kind kind = this.f38529W;
        if (kind != null) {
            return kind;
        }
        m13633N(21);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo5301x() {
        return this.f38517K;
    }

    /* JADX INFO: renamed from: y */
    public AbstractC5257t mo11900y() {
        return this.f38534g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y0 */
    public final List<InterfaceC8835e0> mo11901y0() {
        List<InterfaceC8835e0> list = this.f38535h;
        if (list != null) {
            return list;
        }
        m13633N(13);
        throw null;
    }
}
