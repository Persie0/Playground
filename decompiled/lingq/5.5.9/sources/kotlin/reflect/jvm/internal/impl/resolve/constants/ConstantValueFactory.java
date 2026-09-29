package kotlin.reflect.jvm.internal.impl.resolve.constants;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p372rm.InterfaceC8863u;
import p373rn.AbstractC8875g;
import p373rn.C8870b;
import p373rn.C8871c;
import p373rn.C8872d;
import p373rn.C8873e;
import p373rn.C8876h;
import p373rn.C8879k;
import p373rn.C8880l;
import p373rn.C8884p;
import p373rn.C8885q;
import p373rn.C8886r;
import p373rn.C8887s;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantValueFactory {
    /* JADX INFO: renamed from: a */
    public static C8870b m14100a(List list, final AbstractC5257t abstractC5257t) {
        C5207g.m11111f(list, "value");
        return new C8870b(list, new InterfaceC2052l<InterfaceC8863u, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(InterfaceC8863u interfaceC8863u) {
                C5207g.m11111f(interfaceC8863u, "it");
                return abstractC5257t;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static C8870b m14101b(List list, final PrimitiveType primitiveType) {
        List listM13453u0 = C6752c.m13453u0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM13453u0.iterator();
        while (true) {
            while (it.hasNext()) {
                AbstractC8875g abstractC8875gM14102c = m14102c(it.next());
                if (abstractC8875gM14102c != null) {
                    arrayList.add(abstractC8875gM14102c);
                }
            }
            return new C8870b(arrayList, new InterfaceC2052l<InterfaceC8863u, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$3
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final AbstractC5257t mo528n(InterfaceC8863u interfaceC8863u) {
                    InterfaceC8863u interfaceC8863u2 = interfaceC8863u;
                    C5207g.m11111f(interfaceC8863u2, "module");
                    AbstractC5265x abstractC5265xM13561r = interfaceC8863u2.mo11877o().m13561r(primitiveType);
                    C5207g.m11110e(abstractC5265xM13561r, "module.builtIns.getPrimi…KotlinType(componentType)");
                    return abstractC5265xM13561r;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v55, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v62, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX INFO: renamed from: c */
    public static AbstractC8875g m14102c(Object obj) {
        ?? M17251q;
        ?? M17251q2;
        ?? M17251q3;
        ?? M17251q4;
        ?? M17251q5;
        List listM13392x0;
        ?? arrayList;
        ?? M17251q6;
        ?? M17251q7;
        if (obj instanceof Byte) {
            return new C8872d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C8886r(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C8880l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C8884p(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C8873e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C8879k(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C8876h(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C8871c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C8887s((String) obj);
        }
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            C5207g.m11111f(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                M17251q7 = EmptyList.f38032a;
            } else if (length != 1) {
                M17251q7 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i10 < length2) {
                    M17251q7.add(Byte.valueOf(bArr[i10]));
                    i10++;
                }
            } else {
                M17251q7 = C9000b.m17251q(Byte.valueOf(bArr[0]));
            }
            return m14101b(M17251q7, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            C5207g.m11111f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    arrayList = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        arrayList.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    M17251q6 = C9000b.m17251q(Short.valueOf(sArr[0]));
                }
                return m14101b(M17251q6, PrimitiveType.SHORT);
            }
            arrayList = EmptyList.f38032a;
            M17251q6 = arrayList;
            return m14101b(M17251q6, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            C5207g.m11111f(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                listM13392x0 = length5 != 1 ? C6744b.m13392x0(iArr) : C9000b.m17251q(Integer.valueOf(iArr[0]));
            } else {
                listM13392x0 = EmptyList.f38032a;
            }
            return m14101b(listM13392x0, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            C5207g.m11111f(jArr, "<this>");
            int length6 = jArr.length;
            if (length6 == 0) {
                M17251q5 = EmptyList.f38032a;
            } else if (length6 != 1) {
                M17251q5 = new ArrayList(jArr.length);
                int length7 = jArr.length;
                while (i10 < length7) {
                    M17251q5.add(Long.valueOf(jArr[i10]));
                    i10++;
                }
            } else {
                M17251q5 = C9000b.m17251q(Long.valueOf(jArr[0]));
            }
            return m14101b(M17251q5, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            C5207g.m11111f(cArr, "<this>");
            int length8 = cArr.length;
            if (length8 == 0) {
                M17251q4 = EmptyList.f38032a;
            } else if (length8 != 1) {
                M17251q4 = new ArrayList(cArr.length);
                int length9 = cArr.length;
                while (i10 < length9) {
                    M17251q4.add(Character.valueOf(cArr[i10]));
                    i10++;
                }
            } else {
                M17251q4 = C9000b.m17251q(Character.valueOf(cArr[0]));
            }
            return m14101b(M17251q4, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            C5207g.m11111f(fArr, "<this>");
            int length10 = fArr.length;
            if (length10 == 0) {
                M17251q3 = EmptyList.f38032a;
            } else if (length10 != 1) {
                M17251q3 = new ArrayList(fArr.length);
                int length11 = fArr.length;
                while (i10 < length11) {
                    M17251q3.add(Float.valueOf(fArr[i10]));
                    i10++;
                }
            } else {
                M17251q3 = C9000b.m17251q(Float.valueOf(fArr[0]));
            }
            return m14101b(M17251q3, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            C5207g.m11111f(dArr, "<this>");
            int length12 = dArr.length;
            if (length12 == 0) {
                M17251q2 = EmptyList.f38032a;
            } else if (length12 != 1) {
                M17251q2 = new ArrayList(dArr.length);
                int length13 = dArr.length;
                while (i10 < length13) {
                    M17251q2.add(Double.valueOf(dArr[i10]));
                    i10++;
                }
            } else {
                M17251q2 = C9000b.m17251q(Double.valueOf(dArr[0]));
            }
            return m14101b(M17251q2, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C8885q();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        C5207g.m11111f(zArr, "<this>");
        int length14 = zArr.length;
        if (length14 == 0) {
            M17251q = EmptyList.f38032a;
        } else if (length14 != 1) {
            M17251q = new ArrayList(zArr.length);
            int length15 = zArr.length;
            while (i10 < length15) {
                M17251q.add(Boolean.valueOf(zArr[i10]));
                i10++;
            }
        } else {
            M17251q = C9000b.m17251q(Boolean.valueOf(zArr[0]));
        }
        return m14101b(M17251q, PrimitiveType.BOOLEAN);
    }
}
