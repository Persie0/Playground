package kotlin.reflect.jvm.internal.impl.renderer;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import fo.C5600f;
import fo.C5601g;
import fo.C5602h;
import gm.AbstractC5819a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import km.InterfaceC6719b;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.C7076b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mn.C7650g;
import mo.C7661i;
import mo.C7662j;
import p260m8.C7499b;
import p306on.C8094c;
import p306on.InterfaceC8092a;
import p306on.InterfaceC8093b;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8844j;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8855o0;
import p372rm.InterfaceC8856p;
import p372rm.InterfaceC8862t;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8868z;
import p373rn.AbstractC8875g;
import p373rn.C8869a;
import p373rn.C8870b;
import p373rn.C8883o;
import p385sf.C9000b;
import p388t1.C9181g;
import p420um.C9564e0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5264w0;
import p543do.AbstractC5265x;
import p543do.C5219a;
import p543do.C5226d0;
import p543do.C5237j;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import pn.C8413d;
import sl.C9072e;
import sl.InterfaceC9070c;
import sm.InterfaceC9073a;
import sm.InterfaceC9075c;
import tl.C9325m;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements InterfaceC8093b {

    /* JADX INFO: renamed from: c */
    public final DescriptorRendererOptionsImpl f39560c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f39561d = C6740a.m13372a(new InterfaceC2041a<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1 */
        final class C70051 extends Lambda implements InterfaceC2052l<InterfaceC8093b, C9072e> {

            /* JADX INFO: renamed from: b */
            public static final C70051 f39568b = new C70051();

            public C70051() {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14034g(C9338z.m17691N0(interfaceC8093b2.mo14046m(), C9000b.m17252r(C6797e.a.f38393p, C6797e.a.f38394q)));
                return C9072e.f47360a;
            }
        }

        {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final DescriptorRendererImpl mo807E() throws IllegalAccessException {
            C70051 c70051 = C70051.f39568b;
            DescriptorRendererImpl descriptorRendererImpl = this.f39567b;
            descriptorRendererImpl.getClass();
            C5207g.m11111f(c70051, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            descriptorRendererOptionsImpl.getClass();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
            Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
            C5207g.m11110e(declaredFields, "this::class.java.declaredFields");
            int length = declaredFields.length;
            ?? r10 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(descriptorRendererOptionsImpl);
                    AbstractC5819a abstractC5819a = obj instanceof AbstractC5819a ? (AbstractC5819a) obj : null;
                    if (abstractC5819a != null) {
                        String name = field.getName();
                        C5207g.m11110e(name, "field.name");
                        C7661i.m15256V2(name, "is", r10);
                        InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(DescriptorRendererOptionsImpl.class);
                        String name2 = field.getName();
                        ?? sb2 = new StringBuilder("get");
                        ?? name3 = field.getName();
                        C5207g.m11110e(name3, "field.name");
                        if ((name3.length() > 0 ? 1 : r10) != 0) {
                            char upperCase = Character.toUpperCase(name3.charAt(r10));
                            String strSubstring = name3.substring(1);
                            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                            name3 = upperCase + strSubstring;
                        }
                        sb2.append(name3);
                        new PropertyReference1Impl(interfaceC6719bM11118a, name2, sb2.toString());
                        field.set(descriptorRendererOptionsImpl2, new C8094c(abstractC5819a.f35128a, descriptorRendererOptionsImpl2));
                    }
                }
                i10++;
                r10 = 0;
            }
            c70051.mo528n(descriptorRendererOptionsImpl2);
            descriptorRendererOptionsImpl2.f39596a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
        }
    });

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a */
    public final class C7003a implements InterfaceC8842i<C9072e, StringBuilder> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f39563a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                f39563a = iArr;
            }
        }

        public C7003a() {
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: a */
        public final C9072e mo14052a(InterfaceC8833d0 interfaceC8833d0, StringBuilder sb2) throws IOException {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8833d0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            m14066o(interfaceC8833d0, sb3, "setter");
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: b */
        public final C9072e mo14053b(InterfaceC8830c interfaceC8830c, StringBuilder sb2) throws IOException {
            InterfaceC8828b interfaceC8828bMo13597Y;
            String str;
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8830c, "descriptor");
            C5207g.m11111f(sb3, "builder");
            final DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            boolean z10 = interfaceC8830c.mo13602u() == ClassKind.ENUM_ENTRY;
            if (!descriptorRendererImpl.m13999B()) {
                descriptorRendererImpl.m14004H(sb3, interfaceC8830c, null);
                List<InterfaceC8835e0> listMo14140Q0 = interfaceC8830c.mo14140Q0();
                C5207g.m11110e(listMo14140Q0, "klass.contextReceivers");
                descriptorRendererImpl.m14007K(sb3, listMo14140Q0);
                if (!z10) {
                    AbstractC8852n abstractC8852nMo11886f = interfaceC8830c.mo11886f();
                    C5207g.m11110e(abstractC8852nMo11886f, "klass.visibility");
                    descriptorRendererImpl.m14045l0(abstractC8852nMo11886f, sb3);
                }
                if ((interfaceC8830c.mo13602u() != ClassKind.INTERFACE || interfaceC8830c.mo11891l() != Modality.ABSTRACT) && (!interfaceC8830c.mo13602u().isSingleton() || interfaceC8830c.mo11891l() != Modality.FINAL)) {
                    Modality modalityMo11891l = interfaceC8830c.mo11891l();
                    C5207g.m11110e(modalityMo11891l, "klass.modality");
                    descriptorRendererImpl.m14014R(modalityMo11891l, sb3, DescriptorRendererImpl.m13992F(interfaceC8830c));
                }
                descriptorRendererImpl.m14013Q(interfaceC8830c, sb3);
                descriptorRendererImpl.m14016T(sb3, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.INNER) && interfaceC8830c.mo13596U(), "inner");
                descriptorRendererImpl.m14016T(sb3, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.DATA) && interfaceC8830c.mo13595S0(), "data");
                descriptorRendererImpl.m14016T(sb3, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.INLINE) && interfaceC8830c.mo13603x(), "inline");
                descriptorRendererImpl.m14016T(sb3, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.VALUE) && interfaceC8830c.mo13594S(), "value");
                descriptorRendererImpl.m14016T(sb3, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.FUN) && interfaceC8830c.mo13592J(), "fun");
                if (interfaceC8830c instanceof InterfaceC8845j0) {
                    str = "typealias";
                } else if (interfaceC8830c.mo13589E()) {
                    str = "companion object";
                } else {
                    switch (DescriptorRenderer.C7001a.a.f39558a[interfaceC8830c.mo13602u().ordinal()]) {
                        case 1:
                            str = "class";
                            break;
                        case 2:
                            str = "interface";
                            break;
                        case 3:
                            str = "enum class";
                            break;
                        case 4:
                            str = "object";
                            break;
                        case 5:
                            str = "annotation class";
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "enum entry";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                sb3.append(descriptorRendererImpl.m14011O(str));
            }
            boolean zM16453l = C8413d.m16453l(interfaceC8830c);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            if (zM16453l) {
                if (((Boolean) descriptorRendererOptionsImpl.f39579F.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[30])).booleanValue()) {
                    if (descriptorRendererImpl.m13999B()) {
                        sb3.append("companion object");
                    }
                    DescriptorRendererImpl.m13993c0(sb3);
                    InterfaceC8838g interfaceC8838gMo11876g = interfaceC8830c.mo11876g();
                    if (interfaceC8838gMo11876g != null) {
                        sb3.append("of ");
                        C7648e c7648eMo11874a = interfaceC8838gMo11876g.mo11874a();
                        C5207g.m11110e(c7648eMo11874a, "containingDeclaration.name");
                        sb3.append(descriptorRendererImpl.mo13984t(c7648eMo11874a, false));
                    }
                }
                if (descriptorRendererImpl.m14002E() || !C5207g.m11106a(interfaceC8830c.mo11874a(), C7650g.f42090b)) {
                    if (!descriptorRendererImpl.m13999B()) {
                        DescriptorRendererImpl.m13993c0(sb3);
                    }
                    C7648e c7648eMo11874a2 = interfaceC8830c.mo11874a();
                    C5207g.m11110e(c7648eMo11874a2, "descriptor.name");
                    sb3.append(descriptorRendererImpl.mo13984t(c7648eMo11874a2, true));
                }
            } else {
                if (!descriptorRendererImpl.m13999B()) {
                    DescriptorRendererImpl.m13993c0(sb3);
                }
                descriptorRendererImpl.m14017U(interfaceC8830c, sb3, true);
            }
            if (!z10) {
                List<InterfaceC8847k0> listMo13604z = interfaceC8830c.mo13604z();
                C5207g.m11110e(listMo13604z, "klass.declaredTypeParameters");
                descriptorRendererImpl.m14037h0(listMo13604z, sb3, false);
                descriptorRendererImpl.m14005I(interfaceC8830c, sb3);
                if (!interfaceC8830c.mo13602u().isSingleton() && ((Boolean) descriptorRendererOptionsImpl.f39604i.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[7])).booleanValue() && (interfaceC8828bMo13597Y = interfaceC8830c.mo13597Y()) != null) {
                    sb3.append(" ");
                    descriptorRendererImpl.m14004H(sb3, interfaceC8828bMo13597Y, null);
                    AbstractC8852n abstractC8852nMo11886f2 = interfaceC8828bMo13597Y.mo11886f();
                    C5207g.m11110e(abstractC8852nMo11886f2, "primaryConstructor.visibility");
                    descriptorRendererImpl.m14045l0(abstractC8852nMo11886f2, sb3);
                    sb3.append(descriptorRendererImpl.m14011O("constructor"));
                    List<InterfaceC8853n0> listMo11889i = interfaceC8828bMo13597Y.mo11889i();
                    C5207g.m11110e(listMo11889i, "primaryConstructor.valueParameters");
                    descriptorRendererImpl.m14043k0(listMo11889i, interfaceC8828bMo13597Y.mo5278M(), sb3);
                }
                if (!((Boolean) descriptorRendererOptionsImpl.f39618w.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[21])).booleanValue() && !AbstractC6795c.m13533F(interfaceC8830c.mo5316v())) {
                    Collection<AbstractC5257t> collectionMo11278p = interfaceC8830c.mo13600k().mo11278p();
                    C5207g.m11110e(collectionMo11278p, "klass.typeConstructor.supertypes");
                    if (!collectionMo11278p.isEmpty()) {
                        if (collectionMo11278p.size() != 1 || !AbstractC6795c.m13545y(collectionMo11278p.iterator().next())) {
                            DescriptorRendererImpl.m13993c0(sb3);
                            sb3.append(": ");
                            C6752c.m13429W(collectionMo11278p, sb3, ", ", null, null, new InterfaceC2052l<AbstractC5257t, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final CharSequence mo528n(AbstractC5257t abstractC5257t) {
                                    AbstractC5257t abstractC5257t2 = abstractC5257t;
                                    C5207g.m11110e(abstractC5257t2, "it");
                                    return descriptorRendererImpl.mo13985u(abstractC5257t2);
                                }
                            }, 60);
                        }
                    }
                }
                descriptorRendererImpl.m14047m0(sb3, listMo13604z);
            }
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: c */
        public final C9072e mo14054c(InterfaceC8863u interfaceC8863u, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8863u, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl.this.m14017U(interfaceC8863u, sb3, true);
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: d */
        public final C9072e mo14055d(InterfaceC8847k0 interfaceC8847k0, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8847k0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl.this.m14033f0(interfaceC8847k0, sb3, true);
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: e */
        public final C9072e mo14056e(InterfaceC8865w interfaceC8865w, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8865w, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.m14021Y(interfaceC8865w.mo17120e(), "package-fragment", sb3);
            if (descriptorRendererImpl.mo14048n()) {
                sb3.append(" in ");
                descriptorRendererImpl.m14017U(interfaceC8865w.mo11876g(), sb3, false);
            }
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: f */
        public final C9072e mo14057f(InterfaceC8835e0 interfaceC8835e0, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8835e0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            sb3.append(interfaceC8835e0.mo11874a());
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: g */
        public final C9072e mo14058g(InterfaceC8831c0 interfaceC8831c0, StringBuilder sb2) throws IOException {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8831c0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            m14066o(interfaceC8831c0, sb3, "getter");
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: h */
        public final C9072e mo14059h(InterfaceC8845j0 interfaceC8845j0, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8845j0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.m14004H(sb3, interfaceC8845j0, null);
            AbstractC8852n abstractC8852nMo11886f = interfaceC8845j0.mo11886f();
            C5207g.m11110e(abstractC8852nMo11886f, "typeAlias.visibility");
            descriptorRendererImpl.m14045l0(abstractC8852nMo11886f, sb3);
            descriptorRendererImpl.m14013Q(interfaceC8845j0, sb3);
            sb3.append(descriptorRendererImpl.m14011O("typealias"));
            sb3.append(" ");
            descriptorRendererImpl.m14017U(interfaceC8845j0, sb3, true);
            List<InterfaceC8847k0> listMo13604z = interfaceC8845j0.mo13604z();
            C5207g.m11110e(listMo13604z, "typeAlias.declaredTypeParameters");
            descriptorRendererImpl.m14037h0(listMo13604z, sb3, false);
            descriptorRendererImpl.m14005I(interfaceC8845j0, sb3);
            sb3.append(" = ");
            sb3.append(descriptorRendererImpl.mo13985u(interfaceC8845j0.mo5314n0()));
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: i */
        public final C9072e mo14060i(InterfaceC8868z interfaceC8868z, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8868z, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.m14021Y(interfaceC8868z.mo13627e(), "package", sb3);
            if (descriptorRendererImpl.mo14048n()) {
                sb3.append(" in context of ");
                descriptorRendererImpl.m14017U(interfaceC8868z.mo13625C0(), sb3, false);
            }
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: j */
        public final C9072e mo14061j(InterfaceC8829b0 interfaceC8829b0, StringBuilder sb2) throws IOException {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8829b0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl.m13996w(DescriptorRendererImpl.this, interfaceC8829b0, sb3);
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ C9072e mo14062k(InterfaceC6822c interfaceC6822c, StringBuilder sb2) throws IOException {
            m14065n(interfaceC6822c, sb2);
            return C9072e.f47360a;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0052  */
        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: l */
        public final C9072e mo14063l(InterfaceC6821b interfaceC6821b, StringBuilder sb2) throws IOException {
            boolean z10;
            InterfaceC8828b interfaceC8828bMo13597Y;
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC6821b, "constructorDescriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.m14004H(sb3, interfaceC6821b, null);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            descriptorRendererOptionsImpl.getClass();
            InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
            if (((Boolean) descriptorRendererOptionsImpl.f39610o.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[13])).booleanValue() || interfaceC6821b.mo13615I().mo11891l() != Modality.SEALED) {
                AbstractC8852n abstractC8852nMo11886f = interfaceC6821b.mo11886f();
                C5207g.m11110e(abstractC8852nMo11886f, "constructor.visibility");
                if (descriptorRendererImpl.m14045l0(abstractC8852nMo11886f, sb3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            descriptorRendererImpl.m14012P(interfaceC6821b, sb3);
            boolean z11 = ((Boolean) descriptorRendererOptionsImpl.f39588O.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[39])).booleanValue() || !interfaceC6821b.mo13614H() || z10;
            if (z11) {
                sb3.append(descriptorRendererImpl.m14011O("constructor"));
            }
            InterfaceC8836f interfaceC8836fMo11876g = interfaceC6821b.mo11876g();
            C5207g.m11110e(interfaceC8836fMo11876g, "constructor.containingDeclaration");
            if (((Boolean) descriptorRendererOptionsImpl.f39621z.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[24])).booleanValue()) {
                if (z11) {
                    sb3.append(" ");
                }
                descriptorRendererImpl.m14017U(interfaceC8836fMo11876g, sb3, true);
                List<InterfaceC8847k0> listMo11895r = interfaceC6821b.mo11895r();
                C5207g.m11110e(listMo11895r, "constructor.typeParameters");
                descriptorRendererImpl.m14037h0(listMo11895r, sb3, false);
            }
            List<InterfaceC8853n0> listMo11889i = interfaceC6821b.mo11889i();
            C5207g.m11110e(listMo11889i, "constructor.valueParameters");
            descriptorRendererImpl.m14043k0(listMo11889i, interfaceC6821b.mo5278M(), sb3);
            if (((Boolean) descriptorRendererOptionsImpl.f39612q.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[15])).booleanValue() && !interfaceC6821b.mo13614H() && (interfaceC8836fMo11876g instanceof InterfaceC8830c) && (interfaceC8828bMo13597Y = ((InterfaceC8830c) interfaceC8836fMo11876g).mo13597Y()) != null) {
                List<InterfaceC8853n0> listMo11889i2 = interfaceC8828bMo13597Y.mo11889i();
                C5207g.m11110e(listMo11889i2, "primaryConstructor.valueParameters");
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo11889i2) {
                    InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) obj;
                    if (!interfaceC8853n0.mo13643B0() && interfaceC8853n0.mo13647r0() == null) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb3.append(" : ");
                    sb3.append(descriptorRendererImpl.m14011O("this"));
                    sb3.append(C6752c.m13430X(arrayList, ", ", "(", ")", new InterfaceC2052l<InterfaceC8853n0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final /* bridge */ /* synthetic */ CharSequence mo528n(InterfaceC8853n0 interfaceC8853n1) {
                            return "";
                        }
                    }, 24));
                }
            }
            if (((Boolean) descriptorRendererOptionsImpl.f39621z.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[24])).booleanValue()) {
                List<InterfaceC8847k0> listMo11895r2 = interfaceC6821b.mo11895r();
                C5207g.m11110e(listMo11895r2, "constructor.typeParameters");
                descriptorRendererImpl.m14047m0(sb3, listMo11895r2);
            }
            return C9072e.f47360a;
        }

        @Override // p372rm.InterfaceC8842i
        /* JADX INFO: renamed from: m */
        public final C9072e mo14064m(InterfaceC8853n0 interfaceC8853n0, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            C5207g.m11111f(interfaceC8853n0, "descriptor");
            C5207g.m11111f(sb3, "builder");
            DescriptorRendererImpl.this.m14041j0(interfaceC8853n0, true, sb3, true);
            return C9072e.f47360a;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:68:0x020c  */
        /* JADX WARN: Code duplicated, block: B:69:0x0210  */
        /* JADX INFO: renamed from: n */
        public final void m14065n(InterfaceC6822c interfaceC6822c, StringBuilder sb2) throws IOException {
            String strMo13985u;
            boolean z10;
            boolean z11;
            boolean z12;
            C5207g.m11111f(interfaceC6822c, "descriptor");
            C5207g.m11111f(sb2, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            boolean zM13999B = descriptorRendererImpl.m13999B();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            if (!zM13999B) {
                C8094c c8094c = descriptorRendererOptionsImpl.f39602g;
                InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
                if (!((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[5])).booleanValue()) {
                    descriptorRendererImpl.m14004H(sb2, interfaceC6822c, null);
                    List<InterfaceC8835e0> listMo11901y0 = interfaceC6822c.mo11901y0();
                    C5207g.m11110e(listMo11901y0, "function.contextReceiverParameters");
                    descriptorRendererImpl.m14007K(sb2, listMo11901y0);
                    AbstractC8852n abstractC8852nMo11886f = interfaceC6822c.mo11886f();
                    C5207g.m11110e(abstractC8852nMo11886f, "function.visibility");
                    descriptorRendererImpl.m14045l0(abstractC8852nMo11886f, sb2);
                    descriptorRendererImpl.m14015S(interfaceC6822c, sb2);
                    if (((Boolean) descriptorRendererOptionsImpl.f39591R.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[42])).booleanValue()) {
                        descriptorRendererImpl.m14013Q(interfaceC6822c, sb2);
                    }
                    descriptorRendererImpl.m14020X(interfaceC6822c, sb2);
                    if (((Boolean) descriptorRendererOptionsImpl.f39591R.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[42])).booleanValue()) {
                        boolean z13 = false;
                        if (interfaceC6822c.mo13619X()) {
                            Collection<? extends CallableMemberDescriptor> collectionMo11893p = interfaceC6822c.mo11893p();
                            C5207g.m11110e(collectionMo11893p, "functionDescriptor.overriddenDescriptors");
                            if (!collectionMo11893p.isEmpty()) {
                                Iterator<T> it = collectionMo11893p.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z12 = true;
                                        break;
                                    } else if (((InterfaceC6822c) it.next()).mo13619X()) {
                                        z12 = false;
                                        break;
                                    }
                                }
                            } else {
                                z12 = true;
                                break;
                            }
                            if (z12 || ((Boolean) descriptorRendererOptionsImpl.f39587N.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[38])).booleanValue()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        if (interfaceC6822c.mo13618R0()) {
                            Collection<? extends CallableMemberDescriptor> collectionMo11893p2 = interfaceC6822c.mo11893p();
                            C5207g.m11110e(collectionMo11893p2, "functionDescriptor.overriddenDescriptors");
                            if (!collectionMo11893p2.isEmpty()) {
                                Iterator<T> it2 = collectionMo11893p2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = true;
                                        break;
                                    } else if (((InterfaceC6822c) it2.next()).mo13618R0()) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            } else {
                                z11 = true;
                                break;
                            }
                            if (z11 || ((Boolean) descriptorRendererOptionsImpl.f39587N.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[38])).booleanValue()) {
                                z13 = true;
                            }
                        }
                        descriptorRendererImpl.m14016T(sb2, interfaceC6822c.mo5296W(), "tailrec");
                        descriptorRendererImpl.m14016T(sb2, interfaceC6822c.mo5294F0(), "suspend");
                        descriptorRendererImpl.m14016T(sb2, interfaceC6822c.mo5301x(), "inline");
                        descriptorRendererImpl.m14016T(sb2, z13, "infix");
                        descriptorRendererImpl.m14016T(sb2, z10, "operator");
                    } else {
                        descriptorRendererImpl.m14016T(sb2, interfaceC6822c.mo5294F0(), "suspend");
                    }
                    descriptorRendererImpl.m14012P(interfaceC6822c, sb2);
                    if (descriptorRendererImpl.m14002E()) {
                        if (interfaceC6822c.mo13616E0()) {
                            sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (interfaceC6822c.mo13617L0()) {
                            sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                sb2.append(descriptorRendererImpl.m14011O("fun"));
                sb2.append(" ");
                List<InterfaceC8847k0> listMo11895r = interfaceC6822c.mo11895r();
                C5207g.m11110e(listMo11895r, "function.typeParameters");
                descriptorRendererImpl.m14037h0(listMo11895r, sb2, true);
                descriptorRendererImpl.m14024a0(sb2, interfaceC6822c);
            }
            descriptorRendererImpl.m14017U(interfaceC6822c, sb2, true);
            List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo11889i();
            C5207g.m11110e(listMo11889i, "function.valueParameters");
            descriptorRendererImpl.m14043k0(listMo11889i, interfaceC6822c.mo5278M(), sb2);
            descriptorRendererImpl.m14026b0(sb2, interfaceC6822c);
            AbstractC5257t abstractC5257tMo11900y = interfaceC6822c.mo11900y();
            C8094c c8094c2 = descriptorRendererOptionsImpl.f39607l;
            InterfaceC6727j<?>[] interfaceC6727jArr2 = DescriptorRendererOptionsImpl.f39573W;
            if (!((Boolean) c8094c2.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr2[10])).booleanValue()) {
                if (((Boolean) descriptorRendererOptionsImpl.f39606k.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr2[9])).booleanValue() || abstractC5257tMo11900y == null) {
                    sb2.append(": ");
                    if (abstractC5257tMo11900y == null) {
                        strMo13985u = "[NULL]";
                    } else {
                        strMo13985u = descriptorRendererImpl.mo13985u(abstractC5257tMo11900y);
                    }
                    sb2.append(strMo13985u);
                } else {
                    C7648e c7648e = AbstractC6795c.f38322e;
                    if (!AbstractC6795c.m13532E(abstractC5257tMo11900y, C6797e.a.f38381d)) {
                        sb2.append(": ");
                        if (abstractC5257tMo11900y == null) {
                            strMo13985u = "[NULL]";
                        } else {
                            strMo13985u = descriptorRendererImpl.mo13985u(abstractC5257tMo11900y);
                        }
                        sb2.append(strMo13985u);
                    }
                }
            }
            List<InterfaceC8847k0> listMo11895r2 = interfaceC6822c.mo11895r();
            C5207g.m11110e(listMo11895r2, "function.typeParameters");
            descriptorRendererImpl.m14047m0(sb2, listMo11895r2);
        }

        /* JADX INFO: renamed from: o */
        public final void m14066o(InterfaceC6823d interfaceC6823d, StringBuilder sb2, String str) throws IOException {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            int i10 = a.f39563a[((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.f39580G.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[31])).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                m14065n(interfaceC6823d, sb2);
            } else {
                descriptorRendererImpl.m14013Q(interfaceC6823d, sb2);
                sb2.append(str.concat(" for "));
                InterfaceC8829b0 interfaceC8829b0Mo13621K0 = interfaceC6823d.mo13621K0();
                C5207g.m11110e(interfaceC8829b0Mo13621K0, "descriptor.correspondingProperty");
                DescriptorRendererImpl.m13996w(descriptorRendererImpl, interfaceC8829b0Mo13621K0, sb2);
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$b */
    public /* synthetic */ class C7004b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39565a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39566b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[RenderingFormat.HTML.ordinal()] = 2;
            f39565a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            f39566b = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.f39560c = descriptorRendererOptionsImpl;
    }

    /* JADX INFO: renamed from: F */
    public static Modality m13992F(InterfaceC8862t interfaceC8862t) {
        if (interfaceC8862t instanceof InterfaceC8830c) {
            return ((InterfaceC8830c) interfaceC8862t).mo13602u() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8862t.mo11876g();
        InterfaceC8830c interfaceC8830c = interfaceC8838gMo11876g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g : null;
        if (interfaceC8830c != null && (interfaceC8862t instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) interfaceC8862t;
            Collection<? extends CallableMemberDescriptor> collectionMo11893p = callableMemberDescriptor.mo11893p();
            C5207g.m11110e(collectionMo11893p, "this.overriddenDescriptors");
            if ((!collectionMo11893p.isEmpty()) && interfaceC8830c.mo11891l() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (interfaceC8830c.mo13602u() != ClassKind.INTERFACE || C5207g.m11106a(callableMemberDescriptor.mo11886f(), C8850m.f46734a)) {
                return Modality.FINAL;
            }
            Modality modalityMo11891l = callableMemberDescriptor.mo11891l();
            Modality modality = Modality.ABSTRACT;
            return modalityMo11891l == modality ? modality : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m13993c0(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static String m13994n0(String str, String str2, String str3, String str4, String str5) {
        if (C7661i.m15256V2(str, str2, false) && C7661i.m15256V2(str3, str4, false)) {
            String strSubstring = str.substring(str2.length());
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String strSubstring2 = str3.substring(str4.length());
            C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String strM765k = C0166e.m765k(str5, strSubstring);
            if (C5207g.m11106a(strSubstring, strSubstring2)) {
                return strM765k;
            }
            if (m13997x(strSubstring, strSubstring2)) {
                return strM765k + '!';
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o0 */
    public static boolean m13995o0(AbstractC5257t abstractC5257t) {
        boolean z10;
        if (!C0062b.m398t1(abstractC5257t)) {
            return false;
        }
        List<InterfaceC5246n0> listMo11240V0 = abstractC5257t.mo11240V0();
        if (!(listMo11240V0 instanceof Collection) || !listMo11240V0.isEmpty()) {
            Iterator<T> it = listMo11240V0.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5246n0) it.next()).mo11239f()) {
                    z10 = false;
                    if (z10) {
                        return true;
                    }
                    return false;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static final void m13996w(DescriptorRendererImpl descriptorRendererImpl, InterfaceC8829b0 interfaceC8829b0, StringBuilder sb2) throws IOException {
        if (!descriptorRendererImpl.m13999B()) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f39560c;
            C8094c c8094c = descriptorRendererOptionsImpl.f39602g;
            InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
            if (!((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[5])).booleanValue()) {
                if (descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.m14004H(sb2, interfaceC8829b0, null);
                    InterfaceC8856p interfaceC8856pMo11899x0 = interfaceC8829b0.mo11899x0();
                    if (interfaceC8856pMo11899x0 != null) {
                        descriptorRendererImpl.m14004H(sb2, interfaceC8856pMo11899x0, AnnotationUseSiteTarget.FIELD);
                    }
                    InterfaceC8856p interfaceC8856pMo11898u0 = interfaceC8829b0.mo11898u0();
                    if (interfaceC8856pMo11898u0 != null) {
                        descriptorRendererImpl.m14004H(sb2, interfaceC8856pMo11898u0, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.f39580G.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[31])) == PropertyAccessorRenderingPolicy.NONE) {
                        C9564e0 c9564e0Mo11888h = interfaceC8829b0.mo11888h();
                        if (c9564e0Mo11888h != null) {
                            descriptorRendererImpl.m14004H(sb2, c9564e0Mo11888h, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        InterfaceC8833d0 interfaceC8833d0Mo11887g0 = interfaceC8829b0.mo11887g0();
                        if (interfaceC8833d0Mo11887g0 != null) {
                            descriptorRendererImpl.m14004H(sb2, interfaceC8833d0Mo11887g0, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<InterfaceC8853n0> listMo11889i = interfaceC8833d0Mo11887g0.mo11889i();
                            C5207g.m11110e(listMo11889i, "setter.valueParameters");
                            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) C6752c.m13443k0(listMo11889i);
                            C5207g.m11110e(interfaceC8853n0, "it");
                            descriptorRendererImpl.m14004H(sb2, interfaceC8853n0, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                List<InterfaceC8835e0> listMo11901y0 = interfaceC8829b0.mo11901y0();
                C5207g.m11110e(listMo11901y0, "property.contextReceiverParameters");
                descriptorRendererImpl.m14007K(sb2, listMo11901y0);
                AbstractC8852n abstractC8852nMo11886f = interfaceC8829b0.mo11886f();
                C5207g.m11110e(abstractC8852nMo11886f, "property.visibility");
                descriptorRendererImpl.m14045l0(abstractC8852nMo11886f, sb2);
                descriptorRendererImpl.m14016T(sb2, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.CONST) && interfaceC8829b0.mo5286F(), "const");
                descriptorRendererImpl.m14013Q(interfaceC8829b0, sb2);
                descriptorRendererImpl.m14015S(interfaceC8829b0, sb2);
                descriptorRendererImpl.m14020X(interfaceC8829b0, sb2);
                descriptorRendererImpl.m14016T(sb2, descriptorRendererImpl.m13998A().contains(DescriptorRendererModifier.LATEINIT) && interfaceC8829b0.mo11902z0(), "lateinit");
                descriptorRendererImpl.m14012P(interfaceC8829b0, sb2);
            }
            descriptorRendererImpl.m14039i0(interfaceC8829b0, sb2, false);
            List<InterfaceC8847k0> listMo11895r = interfaceC8829b0.mo11895r();
            C5207g.m11110e(listMo11895r, "property.typeParameters");
            descriptorRendererImpl.m14037h0(listMo11895r, sb2, true);
            descriptorRendererImpl.m14024a0(sb2, interfaceC8829b0);
        }
        descriptorRendererImpl.m14017U(interfaceC8829b0, sb2, true);
        sb2.append(": ");
        AbstractC5257t abstractC5257tMo11884c = interfaceC8829b0.mo11884c();
        C5207g.m11110e(abstractC5257tMo11884c, "property.type");
        sb2.append(descriptorRendererImpl.mo13985u(abstractC5257tMo11884c));
        descriptorRendererImpl.m14026b0(sb2, interfaceC8829b0);
        descriptorRendererImpl.m14010N(interfaceC8829b0, sb2);
        List<InterfaceC8847k0> listMo11895r2 = interfaceC8829b0.mo11895r();
        C5207g.m11110e(listMo11895r2, "property.typeParameters");
        descriptorRendererImpl.m14047m0(sb2, listMo11895r2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX INFO: renamed from: x */
    public static boolean m13997x(String str, String str2) {
        if (!C5207g.m11106a(str, C7661i.m15254T2(str2, "?", ""))) {
            if (C7661i.m15248N2(str2, "?")) {
                if (!C5207g.m11106a(str + '?', str2)) {
                }
            }
            if (!C5207g.m11106a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final Set<DescriptorRendererModifier> m13998A() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return (Set) descriptorRendererOptionsImpl.f39600e.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[3]);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13999B() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return ((Boolean) descriptorRendererOptionsImpl.f39601f.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[4])).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public final RenderingFormat m14000C() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return (RenderingFormat) descriptorRendererOptionsImpl.f39576C.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[27]);
    }

    /* JADX INFO: renamed from: D */
    public final DescriptorRenderer.InterfaceC7002b m14001D() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return (DescriptorRenderer.InterfaceC7002b) descriptorRendererOptionsImpl.f39575B.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[26]);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m14002E() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return ((Boolean) descriptorRendererOptionsImpl.f39605j.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[8])).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    public final String m14003G(InterfaceC8838g interfaceC8838g) {
        InterfaceC8838g interfaceC8838gMo11876g;
        String str;
        C5207g.m11111f(interfaceC8838g, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        interfaceC8838g.mo11871C(new C7003a(), sb2);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        C8094c c8094c = descriptorRendererOptionsImpl.f39598c;
        InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
        if (((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[1])).booleanValue() && !(interfaceC8838g instanceof InterfaceC8865w) && !(interfaceC8838g instanceof InterfaceC8868z) && (interfaceC8838gMo11876g = interfaceC8838g.mo11876g()) != null && !(interfaceC8838gMo11876g instanceof InterfaceC8863u)) {
            sb2.append(" ");
            int i10 = C7004b.f39565a[m14000C().ordinal()];
            if (i10 == 1) {
                str = "defined in";
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            C7647d c7647dM16448g = C8413d.m16448g(interfaceC8838gMo11876g);
            C5207g.m11110e(c7647dM16448g, "getFqName(containingDeclaration)");
            sb2.append(c7647dM16448g.m15225d() ? "root package" : mo13983s(c7647dM16448g));
            if (((Boolean) descriptorRendererOptionsImpl.f39599d.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[2])).booleanValue() && (interfaceC8838gMo11876g instanceof InterfaceC8865w) && (interfaceC8838g instanceof InterfaceC8844j)) {
                ((InterfaceC8844j) interfaceC8838g).mo11890j().mo12989a();
            }
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: H */
    public final void m14004H(StringBuilder sb2, InterfaceC9073a interfaceC9073a, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (m13998A().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            boolean z10 = interfaceC9073a instanceof AbstractC5257t;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
            Set<C7646c> setMo14046m = z10 ? mo14046m() : (Set) descriptorRendererOptionsImpl.f39583J.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[34]);
            InterfaceC2052l interfaceC2052l = (InterfaceC2052l) descriptorRendererOptionsImpl.f39585L.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[36]);
            for (InterfaceC9075c interfaceC9075c : interfaceC9073a.mo11289w()) {
                if (!C6752c.m13415I(setMo14046m, interfaceC9075c.mo12515e()) && !C5207g.m11106a(interfaceC9075c.mo12515e(), C6797e.a.f38395r) && (interfaceC2052l == null || ((Boolean) interfaceC2052l.mo528n(interfaceC9075c)).booleanValue())) {
                    sb2.append(mo13981p(interfaceC9075c, annotationUseSiteTarget));
                    if (((Boolean) descriptorRendererOptionsImpl.f39582I.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[33])).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m14005I(InterfaceC8836f interfaceC8836f, StringBuilder sb2) {
        List<InterfaceC8847k0> listMo13604z = interfaceC8836f.mo13604z();
        C5207g.m11110e(listMo13604z, "classifier.declaredTypeParameters");
        List<InterfaceC8847k0> listMo11260r = interfaceC8836f.mo13600k().mo11260r();
        C5207g.m11110e(listMo11260r, "classifier.typeConstructor.parameters");
        if (m14002E() && interfaceC8836f.mo13596U() && listMo11260r.size() > listMo13604z.size()) {
            sb2.append(" /*captured type parameters: ");
            m14035g0(sb2, listMo11260r.subList(listMo13604z.size(), listMo11260r.size()));
            sb2.append("*/");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J */
    public final String m14006J(AbstractC8875g<?> abstractC8875g) {
        if (abstractC8875g instanceof C8870b) {
            return C6752c.m13430X((Iterable) ((C8870b) abstractC8875g).f46772a, ", ", "{", "}", new InterfaceC2052l<AbstractC8875g<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstant$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final CharSequence mo528n(AbstractC8875g<?> abstractC8875g2) {
                    AbstractC8875g<?> abstractC8875g3 = abstractC8875g2;
                    C5207g.m11111f(abstractC8875g3, "it");
                    return this.f39569b.m14006J(abstractC8875g3);
                }
            }, 24);
        }
        if (abstractC8875g instanceof C8869a) {
            return C7076b.m14292l3("@", mo13981p((InterfaceC9075c) ((C8869a) abstractC8875g).f46772a, null));
        }
        if (!(abstractC8875g instanceof C8883o)) {
            return abstractC8875g.toString();
        }
        C8883o.a aVar = (C8883o.a) ((C8883o) abstractC8875g).f46772a;
        if (aVar instanceof C8883o.a.C10669a) {
            return ((C8883o.a.C10669a) aVar).f46776a + "::class";
        }
        if (!(aVar instanceof C8883o.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        C8883o.a.b bVar = (C8883o.a.b) aVar;
        String strM15214b = bVar.f46777a.f46770a.m15204b().m15214b();
        for (int i10 = 0; i10 < bVar.f46777a.f46771b; i10++) {
            strM15214b = "kotlin.Array<" + strM15214b + '>';
        }
        return C0166e.m765k(strM15214b, "::class");
    }

    /* JADX INFO: renamed from: K */
    public final void m14007K(StringBuilder sb2, List list) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                InterfaceC8835e0 interfaceC8835e0 = (InterfaceC8835e0) it.next();
                m14004H(sb2, interfaceC8835e0, AnnotationUseSiteTarget.RECEIVER);
                AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0.mo11884c();
                C5207g.m11110e(abstractC5257tMo11884c, "contextReceiver.type");
                sb2.append(m14009M(abstractC5257tMo11884c));
                if (i10 == C9000b.m17249o(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m14008L(StringBuilder sb2, AbstractC5265x abstractC5265x) {
        m14004H(sb2, abstractC5265x, null);
        C5237j c5237j = abstractC5265x instanceof C5237j ? (C5237j) abstractC5265x : null;
        AbstractC5265x abstractC5265x2 = c5237j != null ? c5237j.f33327b : null;
        boolean z10 = false;
        if (C7499b.m14926X(abstractC5265x)) {
            boolean z11 = abstractC5265x instanceof C5600f;
            if (z11 && ((C5600f) abstractC5265x).f34410d.isUnresolved()) {
                z10 = true;
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
            if (z10 && ((Boolean) descriptorRendererOptionsImpl.f39593T.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[45])).booleanValue()) {
                sb2.append(((C5600f) abstractC5265x).f34414h);
            } else if (!z11 || ((Boolean) descriptorRendererOptionsImpl.f39595V.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[47])).booleanValue()) {
                sb2.append(abstractC5265x.mo11250X0().toString());
            } else {
                sb2.append(((C5600f) abstractC5265x).f34414h);
            }
            sb2.append(m14029d0(abstractC5265x.mo11240V0()));
        } else if (abstractC5265x instanceof C5226d0) {
            sb2.append(((C5226d0) abstractC5265x).f33306b.toString());
        } else if (abstractC5265x2 instanceof C5226d0) {
            sb2.append(((C5226d0) abstractC5265x2).f33306b.toString());
        } else {
            InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
            InterfaceC8834e interfaceC8834eMo11235q = abstractC5265x.mo11250X0().mo11235q();
            C9181g c9181gM13611a = TypeParameterUtilsKt.m13611a(abstractC5265x, interfaceC8834eMo11235q instanceof InterfaceC8836f ? (InterfaceC8836f) interfaceC8834eMo11235q : null, 0);
            if (c9181gM13611a == null) {
                sb2.append(m14031e0(interfaceC5240k0Mo11250X0));
                sb2.append(m14029d0(abstractC5265x.mo11240V0()));
            } else {
                m14022Z(sb2, c9181gM13611a);
            }
        }
        if (abstractC5265x.mo11242Y0()) {
            sb2.append("?");
        }
        if (abstractC5265x instanceof C5237j) {
            sb2.append(" & Any");
        }
    }

    /* JADX INFO: renamed from: M */
    public final String m14009M(AbstractC5257t abstractC5257t) {
        String strMo13985u = mo13985u(abstractC5257t);
        if (m13995o0(abstractC5257t) && !C5258t0.m11296g(abstractC5257t)) {
            strMo13985u = "(" + strMo13985u + ')';
        }
        return strMo13985u;
    }

    /* JADX INFO: renamed from: N */
    public final void m14010N(InterfaceC8855o0 interfaceC8855o0, StringBuilder sb2) {
        AbstractC8875g<?> abstractC8875gMo11885e0;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((Boolean) descriptorRendererOptionsImpl.f39616u.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[19])).booleanValue() && (abstractC8875gMo11885e0 = interfaceC8855o0.mo11885e0()) != null) {
            sb2.append(" = ");
            sb2.append(m14050y(m14006J(abstractC8875gMo11885e0)));
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m14011O(String str) {
        int i10 = C7004b.f39565a[m14000C().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return ((Boolean) descriptorRendererOptionsImpl.f39594U.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[46])).booleanValue() ? str : C0141b.m611g("<b>", str, "</b>");
    }

    /* JADX INFO: renamed from: P */
    public final void m14012P(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (m13998A().contains(DescriptorRendererModifier.MEMBER_KIND) && m14002E() && callableMemberDescriptor.mo11897u() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(C0062b.m387q2(callableMemberDescriptor.mo11897u().name()));
            sb2.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m14013Q(InterfaceC8862t interfaceC8862t, StringBuilder sb2) {
        m14016T(sb2, interfaceC8862t.mo5293D(), "external");
        boolean z10 = true;
        m14016T(sb2, m13998A().contains(DescriptorRendererModifier.EXPECT) && interfaceC8862t.mo11882T(), "expect");
        if (!m13998A().contains(DescriptorRendererModifier.ACTUAL) || !interfaceC8862t.mo11881O0()) {
            z10 = false;
        }
        m14016T(sb2, z10, "actual");
    }

    /* JADX INFO: renamed from: R */
    public final void m14014R(Modality modality, StringBuilder sb2, Modality modality2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((Boolean) descriptorRendererOptionsImpl.f39611p.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[14])).booleanValue() || modality != modality2) {
            m14016T(sb2, m13998A().contains(DescriptorRendererModifier.MODALITY), C0062b.m387q2(modality.name()));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m14015S(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (C8413d.m16461t(callableMemberDescriptor) && callableMemberDescriptor.mo11891l() == Modality.FINAL) {
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f39574A.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[25])) == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.mo11891l() == Modality.OPEN && (!callableMemberDescriptor.mo11893p().isEmpty())) {
            return;
        }
        Modality modalityMo11891l = callableMemberDescriptor.mo11891l();
        C5207g.m11110e(modalityMo11891l, "callable.modality");
        m14014R(modalityMo11891l, sb2, m13992F(callableMemberDescriptor));
    }

    /* JADX INFO: renamed from: T */
    public final void m14016T(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(m14011O(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m14017U(InterfaceC8838g interfaceC8838g, StringBuilder sb2, boolean z10) {
        C7648e c7648eMo11874a = interfaceC8838g.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "descriptor.name");
        sb2.append(mo13984t(c7648eMo11874a, z10));
    }

    /* JADX INFO: renamed from: V */
    public final void m14018V(StringBuilder sb2, AbstractC5257t abstractC5257t) {
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        C5219a c5219a = abstractC5262v0Mo11288a1 instanceof C5219a ? (C5219a) abstractC5262v0Mo11288a1 : null;
        if (c5219a == null) {
            m14019W(sb2, abstractC5257t);
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        C8094c c8094c = descriptorRendererOptionsImpl.f39590Q;
        InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
        boolean zBooleanValue = ((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[41])).booleanValue();
        AbstractC5265x abstractC5265x = c5219a.f33301b;
        if (zBooleanValue) {
            m14019W(sb2, abstractC5265x);
            return;
        }
        m14019W(sb2, c5219a.f33302c);
        if (((Boolean) descriptorRendererOptionsImpl.f39589P.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[40])).booleanValue()) {
            RenderingFormat renderingFormatM14000C = m14000C();
            RenderingFormat renderingFormat = RenderingFormat.HTML;
            if (renderingFormatM14000C == renderingFormat) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* = ");
            m14019W(sb2, abstractC5265x);
            sb2.append(" */");
            if (m14000C() == renderingFormat) {
                sb2.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    /* JADX INFO: renamed from: W */
    public final void m14019W(StringBuilder sb2, AbstractC5257t abstractC5257t) {
        boolean z10;
        boolean z11;
        C7648e c7648eM292N0;
        String strM14050y;
        boolean z12;
        if ((abstractC5257t instanceof AbstractC5264w0) && mo14048n() && !((AbstractC5264w0) abstractC5257t).mo11308c1()) {
            sb2.append("<Not computed yet>");
            return;
        }
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            sb2.append(((AbstractC5249p) abstractC5262v0Mo11288a1).mo11284f1(this, this));
            return;
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            AbstractC5265x abstractC5265x = (AbstractC5265x) abstractC5262v0Mo11288a1;
            if (!C5207g.m11106a(abstractC5265x, C5258t0.f33353b)) {
                if (!(abstractC5265x != null && abstractC5265x.mo11250X0() == C5258t0.f33352a.f34408b)) {
                    if (abstractC5265x == null) {
                        z10 = false;
                    } else {
                        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
                        if ((interfaceC5240k0Mo11250X0 instanceof C5601g) && ((C5601g) interfaceC5240k0Mo11250X0).f34415a == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
                    if (z10) {
                        if (!((Boolean) descriptorRendererOptionsImpl.f39615t.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[18])).booleanValue()) {
                            sb2.append("???");
                            return;
                        }
                        InterfaceC5240k0 interfaceC5240k0Mo11250X1 = abstractC5265x.mo11250X0();
                        C5207g.m11109d(interfaceC5240k0Mo11250X1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                        String strM611g = ((C5601g) interfaceC5240k0Mo11250X1).f34416b[0];
                        int i10 = C7004b.f39565a[m14000C().ordinal()];
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strM611g = C0141b.m611g("<font color=red><b>", strM611g, "</b></font>");
                        }
                        sb2.append(strM611g);
                        return;
                    }
                    if (C7499b.m14926X(abstractC5265x)) {
                        m14008L(sb2, abstractC5265x);
                        return;
                    }
                    if (!m13995o0(abstractC5265x)) {
                        m14008L(sb2, abstractC5265x);
                        return;
                    }
                    int length = sb2.length();
                    ((DescriptorRendererImpl) this.f39561d.getValue()).m14004H(sb2, abstractC5265x, null);
                    boolean z13 = sb2.length() != length;
                    AbstractC5257t abstractC5257tM362k1 = C0062b.m362k1(abstractC5265x);
                    List listM343e1 = C0062b.m343e1(abstractC5265x);
                    if (!listM343e1.isEmpty()) {
                        sb2.append("context(");
                        Iterator it = listM343e1.subList(0, C9000b.m17249o(listM343e1)).iterator();
                        while (it.hasNext()) {
                            m14018V(sb2, (AbstractC5257t) it.next());
                            sb2.append(", ");
                        }
                        m14018V(sb2, (AbstractC5257t) C6752c.m13432Z(listM343e1));
                        sb2.append(") ");
                    }
                    boolean zM422z1 = C0062b.m422z1(abstractC5265x);
                    boolean zMo11242Y0 = abstractC5265x.mo11242Y0();
                    boolean z14 = zMo11242Y0 || (z13 && abstractC5257tM362k1 != null);
                    if (z14) {
                        if (zM422z1) {
                            sb2.insert(length, '(');
                        } else {
                            if (z13) {
                                C5206f.m11008f1(C7662j.m15259D3(sb2));
                                if (sb2.charAt(C7076b.m14281a3(sb2) - 1) != ')') {
                                    sb2.insert(C7076b.m14281a3(sb2), "()");
                                }
                            }
                            sb2.append("(");
                        }
                    }
                    m14016T(sb2, zM422z1, "suspend");
                    if (abstractC5257tM362k1 != null) {
                        if (m13995o0(abstractC5257tM362k1) && !abstractC5257tM362k1.mo11242Y0()) {
                            z12 = true;
                        } else if (C0062b.m422z1(abstractC5257tM362k1) || !abstractC5257tM362k1.mo11289w().isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            sb2.append("(");
                        }
                        m14018V(sb2, abstractC5257tM362k1);
                        if (z12) {
                            sb2.append(")");
                        }
                        sb2.append(".");
                    }
                    sb2.append("(");
                    if (!C0062b.m398t1(abstractC5265x)) {
                        z11 = false;
                    } else if (abstractC5265x.mo11289w().mo5291h(C6797e.a.f38393p) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || abstractC5265x.mo11240V0().size() > 1) {
                        int i11 = 0;
                        for (InterfaceC5246n0 interfaceC5246n0 : C0062b.m370m1(abstractC5265x)) {
                            int i12 = i11 + 1;
                            if (i11 > 0) {
                                sb2.append(", ");
                            }
                            if (((Boolean) descriptorRendererOptionsImpl.f39592S.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[43])).booleanValue()) {
                                AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                                C5207g.m11110e(abstractC5257tMo11236c, "typeProjection.type");
                                c7648eM292N0 = C0062b.m292N0(abstractC5257tMo11236c);
                            } else {
                                c7648eM292N0 = null;
                            }
                            if (c7648eM292N0 != null) {
                                sb2.append(mo13984t(c7648eM292N0, false));
                                sb2.append(": ");
                            }
                            sb2.append(mo13986v(interfaceC5246n0));
                            i11 = i12;
                        }
                    } else {
                        sb2.append("???");
                    }
                    sb2.append(") ");
                    int i13 = C7004b.f39565a[m14000C().ordinal()];
                    if (i13 == 1) {
                        strM14050y = m14050y("->");
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strM14050y = "&rarr;";
                    }
                    sb2.append(strM14050y);
                    sb2.append(" ");
                    C0062b.m398t1(abstractC5265x);
                    AbstractC5257t abstractC5257tMo11236c2 = ((InterfaceC5246n0) C6752c.m13432Z(abstractC5265x.mo11240V0())).mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c2, "arguments.last().type");
                    m14018V(sb2, abstractC5257tMo11236c2);
                    if (z14) {
                        sb2.append(")");
                    }
                    if (zMo11242Y0) {
                        sb2.append("?");
                        return;
                    }
                    return;
                }
            }
            sb2.append("???");
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m14020X(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (m13998A().contains(DescriptorRendererModifier.OVERRIDE)) {
            if (!callableMemberDescriptor.mo11893p().isEmpty()) {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
                if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f39574A.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[25])) != OverrideRenderingPolicy.RENDER_OPEN) {
                    m14016T(sb2, true, "override");
                    if (m14002E()) {
                        sb2.append("/*");
                        sb2.append(callableMemberDescriptor.mo11893p().size());
                        sb2.append("*/ ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m14021Y(C7646c c7646c, String str, StringBuilder sb2) {
        sb2.append(m14011O(str));
        C7647d c7647dM15221i = c7646c.m15221i();
        C5207g.m11110e(c7647dM15221i, "fqName.toUnsafe()");
        String strMo13983s = mo13983s(c7647dM15221i);
        if (strMo13983s.length() > 0) {
            sb2.append(" ");
            sb2.append(strMo13983s);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m14022Z(StringBuilder sb2, C9181g c9181g) {
        C9181g c9181g2 = (C9181g) c9181g.f47723d;
        Object obj = c9181g.f47721b;
        if (c9181g2 != null) {
            m14022Z(sb2, c9181g2);
            sb2.append('.');
            C7648e c7648eMo11874a = ((InterfaceC8836f) obj).mo11874a();
            C5207g.m11110e(c7648eMo11874a, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(mo13984t(c7648eMo11874a, false));
        } else {
            InterfaceC5240k0 interfaceC5240k0Mo13600k = ((InterfaceC8836f) obj).mo13600k();
            C5207g.m11110e(interfaceC5240k0Mo13600k, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(m14031e0(interfaceC5240k0Mo13600k));
        }
        sb2.append(m14029d0((List) c9181g.f47722c));
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: a */
    public final void mo14023a() {
        this.f39560c.mo14023a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m14024a0(StringBuilder sb2, InterfaceC6816a interfaceC6816a) {
        InterfaceC8835e0 interfaceC8835e0Mo11896s0 = interfaceC6816a.mo11896s0();
        if (interfaceC8835e0Mo11896s0 != null) {
            m14004H(sb2, interfaceC8835e0Mo11896s0, AnnotationUseSiteTarget.RECEIVER);
            AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c, "receiver.type");
            sb2.append(m14009M(abstractC5257tMo11884c));
            sb2.append(".");
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: b */
    public final void mo14025b() {
        this.f39560c.mo14025b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m14026b0(StringBuilder sb2, InterfaceC6816a interfaceC6816a) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((Boolean) descriptorRendererOptionsImpl.f39578E.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[29])).booleanValue()) {
            InterfaceC8835e0 interfaceC8835e0Mo11896s0 = interfaceC6816a.mo11896s0();
            if (interfaceC8835e0Mo11896s0 != null) {
                sb2.append(" on ");
                AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                C5207g.m11110e(abstractC5257tMo11884c, "receiver.type");
                sb2.append(mo13985u(abstractC5257tMo11884c));
            }
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: c */
    public final void mo14027c() {
        this.f39560c.mo14027c();
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: d */
    public final void mo14028d(Set<? extends DescriptorRendererModifier> set) {
        C5207g.m11111f(set, "<set-?>");
        this.f39560c.mo14028d(set);
    }

    /* JADX INFO: renamed from: d0 */
    public final String m14029d0(List<? extends InterfaceC5246n0> list) throws IOException {
        C5207g.m11111f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m14050y("<"));
        C6752c.m13429W(list, sb2, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        sb2.append(m14050y(">"));
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: e */
    public final void mo14030e(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C5207g.m11111f(parameterNameRenderingPolicy, "<set-?>");
        this.f39560c.mo14030e(parameterNameRenderingPolicy);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e0 */
    public final String m14031e0(InterfaceC5240k0 interfaceC5240k0) {
        C5207g.m11111f(interfaceC5240k0, "typeConstructor");
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
        boolean z10 = true;
        if (!(interfaceC8834eMo11235q instanceof InterfaceC8847k0 ? true : interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
            z10 = interfaceC8834eMo11235q instanceof InterfaceC8845j0;
        }
        if (z10) {
            C5207g.m11111f(interfaceC8834eMo11235q, "klass");
            return C5602h.m11915f(interfaceC8834eMo11235q) ? interfaceC8834eMo11235q.mo13600k().toString() : m14051z().mo16006a(interfaceC8834eMo11235q, this);
        }
        if (interfaceC8834eMo11235q == null) {
            return interfaceC5240k0 instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) interfaceC5240k0).m14180d(new InterfaceC2052l<AbstractC5257t, Object>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderTypeConstructor$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Object mo528n(AbstractC5257t abstractC5257t) {
                    AbstractC5257t abstractC5257t2 = abstractC5257t;
                    C5207g.m11111f(abstractC5257t2, "it");
                    if (abstractC5257t2 instanceof C5226d0) {
                        abstractC5257t2 = ((C5226d0) abstractC5257t2).f33306b;
                    }
                    return abstractC5257t2;
                }
            }) : interfaceC5240k0.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC8834eMo11235q.getClass()).toString());
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: f */
    public final boolean mo14032f() {
        return this.f39560c.mo14032f();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f0 */
    public final void m14033f0(InterfaceC8847k0 interfaceC8847k0, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(m14050y("<"));
        }
        if (m14002E()) {
            sb2.append("/*");
            sb2.append(interfaceC8847k0.getIndex());
            sb2.append("*/ ");
        }
        m14016T(sb2, interfaceC8847k0.mo17087L(), "reified");
        String label = interfaceC8847k0.mo17088n().getLabel();
        m14016T(sb2, label.length() > 0, label);
        m14004H(sb2, interfaceC8847k0, null);
        m14017U(interfaceC8847k0, sb2, z10);
        int size = interfaceC8847k0.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            AbstractC5257t next = interfaceC8847k0.getUpperBounds().iterator().next();
            if (next == null) {
                AbstractC6795c.m13540a(141);
                throw null;
            }
            if (!(AbstractC6795c.m13545y(next) && next.mo11242Y0())) {
                sb2.append(" : ");
                sb2.append(mo13985u(next));
            }
            if (z10) {
                sb2.append(m14050y(">"));
            }
        }
        if (z10) {
            boolean z11 = true;
            for (AbstractC5257t abstractC5257t : interfaceC8847k0.getUpperBounds()) {
                if (abstractC5257t == null) {
                    AbstractC6795c.m13540a(141);
                    throw null;
                }
                if (!(AbstractC6795c.m13545y(abstractC5257t) && abstractC5257t.mo11242Y0())) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(mo13985u(abstractC5257t));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(m14050y(">"));
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: g */
    public final void mo14034g(LinkedHashSet linkedHashSet) {
        this.f39560c.mo14034g(linkedHashSet);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m14035g0(StringBuilder sb2, List<? extends InterfaceC8847k0> list) {
        Iterator<? extends InterfaceC8847k0> it = list.iterator();
        while (it.hasNext()) {
            m14033f0(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: h */
    public final void mo14036h() {
        this.f39560c.mo14036h();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m14037h0(List<? extends InterfaceC8847k0> list, StringBuilder sb2, boolean z10) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (!((Boolean) descriptorRendererOptionsImpl.f39617v.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[20])).booleanValue() && (!list.isEmpty())) {
            sb2.append(m14050y("<"));
            m14035g0(sb2, list);
            sb2.append(m14050y(">"));
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: i */
    public final void mo14038i(RenderingFormat renderingFormat) {
        C5207g.m11111f(renderingFormat, "<set-?>");
        this.f39560c.mo14038i(renderingFormat);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m14039i0(InterfaceC8855o0 interfaceC8855o0, StringBuilder sb2, boolean z10) {
        if (!z10 && (interfaceC8855o0 instanceof InterfaceC8853n0)) {
            return;
        }
        sb2.append(m14011O(interfaceC8855o0.mo11894q0() ? "var" : "val"));
        sb2.append(" ");
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: j */
    public final void mo14040j(InterfaceC8092a interfaceC8092a) {
        this.f39560c.mo14040j(interfaceC8092a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX INFO: renamed from: j0 */
    public final void m14041j0(InterfaceC8853n0 interfaceC8853n0, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        if (z11) {
            sb2.append(m14011O("value-parameter"));
            sb2.append(" ");
        }
        if (m14002E()) {
            sb2.append("/*");
            sb2.append(interfaceC8853n0.getIndex());
            sb2.append("*/ ");
        }
        m14004H(sb2, interfaceC8853n0, null);
        m14016T(sb2, interfaceC8853n0.mo13645i0(), "crossinline");
        m14016T(sb2, interfaceC8853n0.mo13644f0(), "noinline");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        C8094c c8094c = descriptorRendererOptionsImpl.f39613r;
        InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
        boolean z13 = true;
        if (((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[16])).booleanValue()) {
            InterfaceC6816a interfaceC6816aMo11876g = interfaceC8853n0.mo11876g();
            InterfaceC8828b interfaceC8828b = interfaceC6816aMo11876g instanceof InterfaceC8828b ? (InterfaceC8828b) interfaceC6816aMo11876g : null;
            if (interfaceC8828b != null && interfaceC8828b.mo13614H()) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            m14016T(sb2, ((Boolean) descriptorRendererOptionsImpl.f39614s.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[17])).booleanValue(), "actual");
        }
        AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
        C5207g.m11110e(abstractC5257tMo11884c, "variable.type");
        AbstractC5257t abstractC5257tMo13647r0 = interfaceC8853n0.mo13647r0();
        AbstractC5257t abstractC5257t = abstractC5257tMo13647r0 == null ? abstractC5257tMo11884c : abstractC5257tMo13647r0;
        m14016T(sb2, abstractC5257tMo13647r0 != null, "vararg");
        if (z12 || (z11 && !m13999B())) {
            m14039i0(interfaceC8853n0, sb2, z12);
        }
        if (z10) {
            m14017U(interfaceC8853n0, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(mo13985u(abstractC5257t));
        m14010N(interfaceC8853n0, sb2);
        if (m14002E() && abstractC5257tMo13647r0 != null) {
            sb2.append(" /*");
            sb2.append(mo13985u(abstractC5257tMo11884c));
            sb2.append("*/");
        }
        if (((InterfaceC2052l) descriptorRendererOptionsImpl.f39620y.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[23])) == null) {
            z13 = false;
        } else {
            if (!(mo14048n() ? interfaceC8853n0.mo13643B0() : DescriptorUtilsKt.m14104a(interfaceC8853n0))) {
                z13 = false;
            }
        }
        if (z13) {
            StringBuilder sb3 = new StringBuilder(" = ");
            InterfaceC2052l interfaceC2052l = (InterfaceC2052l) descriptorRendererOptionsImpl.f39620y.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[23]);
            C5207g.m11108c(interfaceC2052l);
            sb3.append((String) interfaceC2052l.mo528n(interfaceC8853n0));
            sb2.append(sb3.toString());
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: k */
    public final void mo14042k() {
        this.f39560c.mo14042k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r12 == false) goto L17;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14043k0(List list, boolean z10, StringBuilder sb2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        int i10 = C7004b.f39566b[((ParameterNameRenderingPolicy) descriptorRendererOptionsImpl.f39577D.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[28])).ordinal()];
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z11 = false;
        }
        int size = list.size();
        m14001D().mo13988a(sb2);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) it.next();
            m14001D().mo13990c(interfaceC8853n0, sb2);
            m14041j0(interfaceC8853n0, z11, sb2, false);
            m14001D().mo13989b(interfaceC8853n0, i11, size, sb2);
            i11++;
        }
        m14001D().mo13991d(sb2);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: l */
    public final void mo14044l() {
        this.f39560c.mo14044l();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m14045l0(AbstractC8852n abstractC8852n, StringBuilder sb2) {
        if (!m13998A().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        C8094c c8094c = descriptorRendererOptionsImpl.f39609n;
        InterfaceC6727j<?>[] interfaceC6727jArr = DescriptorRendererOptionsImpl.f39573W;
        if (((Boolean) c8094c.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[12])).booleanValue()) {
            abstractC8852n = abstractC8852n.mo17096d();
        }
        if (!((Boolean) descriptorRendererOptionsImpl.f39610o.m12228b(descriptorRendererOptionsImpl, interfaceC6727jArr[13])).booleanValue() && C5207g.m11106a(abstractC8852n, C8850m.f46745l)) {
            return false;
        }
        sb2.append(m14011O(abstractC8852n.mo17095b()));
        sb2.append(" ");
        return true;
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: m */
    public final Set<C7646c> mo14046m() {
        return this.f39560c.mo14046m();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m14047m0(StringBuilder sb2, List list) throws IOException {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((Boolean) descriptorRendererOptionsImpl.f39617v.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) it.next();
            List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
            C5207g.m11110e(upperBounds, "typeParameter.upperBounds");
            for (AbstractC5257t abstractC5257t : C6752c.m13417K(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                C7648e c7648eMo11874a = interfaceC8847k0.mo11874a();
                C5207g.m11110e(c7648eMo11874a, "typeParameter.name");
                sb3.append(mo13984t(c7648eMo11874a, false));
                sb3.append(" : ");
                C5207g.m11110e(abstractC5257t, "it");
                sb3.append(mo13985u(abstractC5257t));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(m14011O("where"));
            sb2.append(" ");
            C6752c.m13429W(arrayList, sb2, ", ", null, null, null, 124);
        }
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: n */
    public final boolean mo14048n() {
        return this.f39560c.mo14048n();
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: o */
    public final void mo14049o() {
        this.f39560c.mo14049o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: p */
    public final String mo13981p(InterfaceC9075c interfaceC9075c, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        InterfaceC8828b interfaceC8828bMo13597Y;
        List<InterfaceC8853n0> listMo11889i;
        C5207g.m11111f(interfaceC9075c, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        AbstractC5257t abstractC5257tMo12514c = interfaceC9075c.mo12514c();
        sb2.append(mo13985u(abstractC5257tMo12514c));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (descriptorRendererOptionsImpl.m14067p().getIncludeAnnotationArguments()) {
            Map<C7648e, AbstractC8875g<?>> mapMo12513a = interfaceC9075c.mo12513a();
            List list = null;
            InterfaceC8830c interfaceC8830cM14107d = ((Boolean) descriptorRendererOptionsImpl.f39581H.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[32])).booleanValue() ? DescriptorUtilsKt.m14107d(interfaceC9075c) : null;
            if (interfaceC8830cM14107d != null && (interfaceC8828bMo13597Y = interfaceC8830cM14107d.mo13597Y()) != null && (listMo11889i = interfaceC8828bMo13597Y.mo11889i()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listMo11889i.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (((InterfaceC8853n0) next).mo13643B0()) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InterfaceC8853n0) it2.next()).mo11874a());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = EmptyList.f38032a;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            loop3: while (true) {
                while (true) {
                    if (!it3.hasNext()) {
                        break loop3;
                    }
                    Object next2 = it3.next();
                    C7648e c7648e = (C7648e) next2;
                    C5207g.m11110e(c7648e, "it");
                    if (!mapMo12513a.containsKey(c7648e)) {
                        arrayList3.add(next2);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(C9325m.m17681z(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((C7648e) it4.next()).m15235f() + " = ...");
            }
            Set<Map.Entry<C7648e, AbstractC8875g<?>>> setEntrySet = mapMo12513a.entrySet();
            ArrayList arrayList5 = new ArrayList(C9325m.m17681z(setEntrySet, 10));
            Iterator<T> it5 = setEntrySet.iterator();
            while (it5.hasNext()) {
                Map.Entry entry = (Map.Entry) it5.next();
                C7648e c7648e2 = (C7648e) entry.getKey();
                AbstractC8875g<?> abstractC8875g = (AbstractC8875g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c7648e2.m15235f());
                sb3.append(" = ");
                sb3.append(!list.contains(c7648e2) ? m14006J(abstractC8875g) : "...");
                arrayList5.add(sb3.toString());
            }
            List listM13446n0 = C6752c.m13446n0(C6752c.m13438f0(arrayList5, arrayList4));
            if (descriptorRendererOptionsImpl.m14067p().getIncludeEmptyAnnotationArguments() || (!listM13446n0.isEmpty())) {
                C6752c.m13429W(listM13446n0, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (m14002E() && (C7499b.m14926X(abstractC5257tMo12514c) || (abstractC5257tMo12514c.mo11250X0().mo11235q() instanceof NotFoundClasses.C6811b))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: r */
    public final String mo13982r(String str, String str2, AbstractC6795c abstractC6795c) {
        C5207g.m11111f(str, "lowerRendered");
        C5207g.m11111f(str2, "upperRendered");
        if (m13997x(str, str2)) {
            return C7661i.m15256V2(str2, "(", false) ? C0141b.m611g("(", str, ")!") : str.concat("!");
        }
        String strM14306z3 = C7076b.m14306z3(m14051z().mo16006a(abstractC6795c.m13553j(C6797e.a.f38350B), this), "Collection");
        String strM13994n0 = m13994n0(str, strM14306z3.concat("Mutable"), str2, strM14306z3, strM14306z3.concat("(Mutable)"));
        if (strM13994n0 != null) {
            return strM13994n0;
        }
        String strM13994n1 = m13994n0(str, strM14306z3.concat("MutableMap.MutableEntry"), str2, strM14306z3.concat("Map.Entry"), strM14306z3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM13994n1 != null) {
            return strM13994n1;
        }
        InterfaceC8092a interfaceC8092aM14051z = m14051z();
        InterfaceC8830c interfaceC8830cM13554k = abstractC6795c.m13554k("Array");
        C5207g.m11110e(interfaceC8830cM13554k, "builtIns.array");
        String strM14306z4 = C7076b.m14306z3(interfaceC8092aM14051z.mo16006a(interfaceC8830cM13554k, this), "Array");
        StringBuilder sbM771r = C0166e.m771r(strM14306z4);
        sbM771r.append(m14050y("Array<"));
        String string = sbM771r.toString();
        StringBuilder sbM771r2 = C0166e.m771r(strM14306z4);
        sbM771r2.append(m14050y("Array<out "));
        String string2 = sbM771r2.toString();
        StringBuilder sbM771r3 = C0166e.m771r(strM14306z4);
        sbM771r3.append(m14050y("Array<(out) "));
        String strM13994n2 = m13994n0(str, string, str2, string2, sbM771r3.toString());
        if (strM13994n2 != null) {
            return strM13994n2;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: s */
    public final String mo13983s(C7647d c7647d) {
        return m14050y(C7499b.m14962r0(c7647d.m15227f()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: t */
    public final String mo13984t(C7648e c7648e, boolean z10) {
        String strM14050y = m14050y(C7499b.m14960q0(c7648e));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        if (((Boolean) descriptorRendererOptionsImpl.f39594U.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[46])).booleanValue() && m14000C() == RenderingFormat.HTML && z10) {
            strM14050y = C0141b.m611g("<b>", strM14050y, "</b>");
        }
        return strM14050y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: u */
    public final String mo13985u(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "type");
        StringBuilder sb2 = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        m14018V(sb2, (AbstractC5257t) ((InterfaceC2052l) descriptorRendererOptionsImpl.f39619x.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[22])).mo528n(abstractC5257t));
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    /* JADX INFO: renamed from: v */
    public final String mo13986v(InterfaceC5246n0 interfaceC5246n0) throws IOException {
        C5207g.m11111f(interfaceC5246n0, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        C6752c.m13429W(C9000b.m17251q(interfaceC5246n0), sb2, ", ", null, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: y */
    public final String m14050y(String str) {
        return m14000C().escape(str);
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC8092a m14051z() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f39560c;
        return (InterfaceC8092a) descriptorRendererOptionsImpl.f39597b.m12228b(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f39573W[0]);
    }
}
