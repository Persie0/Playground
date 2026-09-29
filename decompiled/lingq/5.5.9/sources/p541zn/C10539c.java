package p541zn;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jm.C6525h;
import kn.C6732b;
import kn.InterfaceC6733c;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C7024b;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p373rn.AbstractC8875g;
import p373rn.AbstractC8878j;
import p373rn.C8869a;
import p373rn.C8870b;
import p373rn.C8871c;
import p373rn.C8872d;
import p373rn.C8873e;
import p373rn.C8876h;
import p373rn.C8877i;
import p373rn.C8879k;
import p373rn.C8880l;
import p373rn.C8883o;
import p373rn.C8884p;
import p373rn.C8886r;
import p373rn.C8887s;
import p373rn.C8888t;
import p373rn.C8889u;
import p373rn.C8890v;
import p373rn.C8891w;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8413d;
import sm.C9076d;
import tl.C9325m;

/* JADX INFO: renamed from: zn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10539c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8863u f52571a;

    /* JADX INFO: renamed from: b */
    public final NotFoundClasses f52572b;

    /* JADX INFO: renamed from: zn.c$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52573a;

        static {
            int[] iArr = new int[ProtoBuf$Annotation.Argument.Value.Type.values().length];
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            f52573a = iArr;
        }
    }

    public C10539c(InterfaceC8863u interfaceC8863u, NotFoundClasses notFoundClasses) {
        C5207g.m11111f(interfaceC8863u, "module");
        C5207g.m11111f(notFoundClasses, "notFoundClasses");
        this.f52571a = interfaceC8863u;
        this.f52572b = notFoundClasses;
    }

    /* JADX INFO: renamed from: a */
    public final C9076d m19510a(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC6733c interfaceC6733c) {
        C5207g.m11111f(protoBuf$Annotation, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        InterfaceC8830c interfaceC8830cM13586c = FindClassInModuleKt.m13586c(this.f52571a, C7499b.m14896C(interfaceC6733c, protoBuf$Annotation.f38939c), this.f52572b);
        Map mapM13459L0 = C6753d.m13459L0();
        if (protoBuf$Annotation.f38940d.size() != 0 && !C5602h.m11915f(interfaceC8830cM13586c)) {
            int i10 = C8413d.f45539a;
            if (C8413d.m16455n(interfaceC8830cM13586c, ClassKind.ANNOTATION_CLASS)) {
                Collection<InterfaceC8828b> collectionMo13590G = interfaceC8830cM13586c.mo13590G();
                C5207g.m11110e(collectionMo13590G, "annotationClass.constructors");
                InterfaceC8828b interfaceC8828b = (InterfaceC8828b) C6752c.m13444l0(collectionMo13590G);
                if (interfaceC8828b != null) {
                    List<InterfaceC8853n0> listMo11889i = interfaceC8828b.mo11889i();
                    C5207g.m11110e(listMo11889i, "constructor.valueParameters");
                    int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(listMo11889i, 10));
                    if (iM14941g0 < 16) {
                        iM14941g0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                    for (Object obj : listMo11889i) {
                        linkedHashMap.put(((InterfaceC8853n0) obj).mo11874a(), obj);
                    }
                    List<ProtoBuf$Annotation.Argument> list = protoBuf$Annotation.f38940d;
                    C5207g.m11110e(list, "proto.argumentList");
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    loop1: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop1;
                            }
                            ProtoBuf$Annotation.Argument argument = (ProtoBuf$Annotation.Argument) it.next();
                            C5207g.m11110e(argument, "it");
                            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) linkedHashMap.get(C7499b.m14910J(interfaceC6733c, argument.f38947c));
                            Object pair = null;
                            if (interfaceC8853n0 != null) {
                                C7648e c7648eM14910J = C7499b.m14910J(interfaceC6733c, argument.f38947c);
                                AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c, "parameter.type");
                                ProtoBuf$Annotation.Argument.Value value = argument.f38948d;
                                C5207g.m11110e(value, "proto.value");
                                AbstractC8875g<?> abstractC8875gM19512c = m19512c(abstractC5257tMo11884c, value, interfaceC6733c);
                                pair = m19511b(abstractC8875gM19512c, abstractC5257tMo11884c, value) ? abstractC8875gM19512c : null;
                                if (pair == null) {
                                    String str = "Unexpected argument value: actual type " + value.f38958c + " != expected type " + abstractC5257tMo11884c;
                                    C5207g.m11111f(str, "message");
                                    pair = new AbstractC8878j.a(str);
                                }
                                pair = new Pair(c7648eM14910J, pair);
                            }
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                    }
                    mapM13459L0 = C6753d.m13464Q0(arrayList);
                }
            }
        }
        return new C9076d(interfaceC8830cM13586c.mo5316v(), mapM13459L0, InterfaceC8837f0.f46730a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19511b(AbstractC8875g<?> abstractC8875g, AbstractC5257t abstractC5257t, ProtoBuf$Annotation.Argument.Value value) {
        ProtoBuf$Annotation.Argument.Value.Type type = value.f38958c;
        int i10 = type == null ? -1 : a.f52573a[type.ordinal()];
        if (i10 != 10) {
            InterfaceC8863u interfaceC8863u = this.f52571a;
            if (i10 != 13) {
                return C5207g.m11106a(abstractC8875g.mo17121a(interfaceC8863u), abstractC5257t);
            }
            if (!((abstractC8875g instanceof C8870b) && ((List) ((C8870b) abstractC8875g).f46772a).size() == value.f38966k.size())) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC8875g).toString());
            }
            AbstractC5257t abstractC5257tM13550g = interfaceC8863u.mo11877o().m13550g(abstractC5257t);
            C8870b c8870b = (C8870b) abstractC8875g;
            Iterable iterableM17248n = C9000b.m17248n((Collection) c8870b.f46772a);
            if (!(iterableM17248n instanceof Collection) || !((Collection) iterableM17248n).isEmpty()) {
                C6525h it = iterableM17248n.iterator();
                while (it.f37168c) {
                    int iMo13105a = it.mo13105a();
                    AbstractC8875g<?> abstractC8875g2 = (AbstractC8875g) ((List) c8870b.f46772a).get(iMo13105a);
                    ProtoBuf$Annotation.Argument.Value value2 = value.f38966k.get(iMo13105a);
                    C5207g.m11110e(value2, "value.getArrayElement(i)");
                    if (!m19511b(abstractC8875g2, abstractC5257tM13550g, value2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
        if (interfaceC8830c != null) {
            C7648e c7648e = AbstractC6795c.f38322e;
            if (!AbstractC6795c.m13542c(interfaceC8830c, C6797e.a.f38364P)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC8875g<?> m19512c(AbstractC5257t abstractC5257t, ProtoBuf$Annotation.Argument.Value value, InterfaceC6733c interfaceC6733c) {
        AbstractC8875g<?> c8873e;
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        boolean zM779z = C0166e.m779z(C6732b.f37962M, value.f38953H, "IS_UNSIGNED.get(value.flags)");
        ProtoBuf$Annotation.Argument.Value.Type type = value.f38958c;
        switch (type == null ? -1 : a.f52573a[type.ordinal()]) {
            case 1:
                byte b10 = (byte) value.f38959d;
                return zM779z ? new C8888t(b10) : new C8872d(b10);
            case 2:
                c8873e = new C8873e((char) value.f38959d);
                break;
            case 3:
                short s10 = (short) value.f38959d;
                return zM779z ? new C8891w(s10) : new C8886r(s10);
            case 4:
                int i10 = (int) value.f38959d;
                return zM779z ? new C8889u(i10) : new C8880l(i10);
            case 5:
                long j10 = value.f38959d;
                return zM779z ? new C8890v(j10) : new C8884p(j10);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                c8873e = new C8879k(value.f38960e);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                c8873e = new C8876h(value.f38961f);
                break;
            case 8:
                c8873e = new C8871c(value.f38959d != 0);
                break;
            case 9:
                c8873e = new C8887s(interfaceC6733c.mo13351a(value.f38962g));
                break;
            case 10:
                c8873e = new C8883o(C7499b.m14896C(interfaceC6733c, value.f38963h), value.f38967l);
                break;
            case 11:
                c8873e = new C8877i(C7499b.m14896C(interfaceC6733c, value.f38963h), C7499b.m14910J(interfaceC6733c, value.f38964i));
                break;
            case 12:
                ProtoBuf$Annotation protoBuf$Annotation = value.f38965j;
                C5207g.m11110e(protoBuf$Annotation, "value.annotation");
                c8873e = new C8869a(m19510a(protoBuf$Annotation, interfaceC6733c));
                break;
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> list = value.f38966k;
                C5207g.m11110e(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : list) {
                    AbstractC5265x abstractC5265xM13549f = this.f52571a.mo11877o().m13549f();
                    C5207g.m11110e(abstractC5265xM13549f, "builtIns.anyType");
                    C5207g.m11110e(value2, "it");
                    arrayList.add(m19512c(abstractC5265xM13549f, value2, interfaceC6733c));
                }
                return new C7024b(arrayList, abstractC5257t);
            default:
                StringBuilder sb2 = new StringBuilder("Unsupported annotation argument type: ");
                sb2.append(value.f38958c);
                sb2.append(" (expected ");
                sb2.append(abstractC5257t);
                sb2.append(')');
                throw new IllegalStateException(sb2.toString().toString());
        }
        return c8873e;
    }
}
