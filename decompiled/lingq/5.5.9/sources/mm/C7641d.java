package mm;

import ae.C0062b;
import dm.C5206f;
import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jm.C6526i;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import p247lm.C7398k;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;
import pn.C8414e;

/* JADX INFO: renamed from: mm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7641d<M extends Member> implements InterfaceC7639b<M> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7639b<M> f42058a;

    /* JADX INFO: renamed from: b */
    public final boolean f42059b;

    /* JADX INFO: renamed from: c */
    public final a f42060c;

    /* JADX INFO: renamed from: mm.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C6526i f42061a;

        /* JADX INFO: renamed from: b */
        public final Method[] f42062b;

        /* JADX INFO: renamed from: c */
        public final Method f42063c;

        public a(C6526i c6526i, Method[] methodArr, Method method) {
            C5207g.m11111f(c6526i, "argumentRange");
            this.f42061a = c6526i;
            this.f42062b = methodArr;
            this.f42063c = method;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146 A[LOOP:0: B:56:0x013f->B:58:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01ae, please report this as an issue */
    public C7641d(InterfaceC7639b interfaceC7639b, InterfaceC6822c interfaceC6822c, boolean z10) {
        Method declaredMethod;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        InterfaceC8835e0 interfaceC8835e0Mo11896s0;
        AbstractC5257t abstractC5257tMo11884c;
        InterfaceC8838g interfaceC8838gMo11876g;
        InterfaceC8830c interfaceC8830cMo13615I;
        Iterator<T> it;
        int size;
        C6526i c6526iM411w2;
        Method[] methodArr;
        int i13;
        a aVar;
        boolean z11;
        Method methodM14919Q;
        Class clsM14897C0;
        C5207g.m11111f(interfaceC6822c, "descriptor");
        this.f42058a = interfaceC7639b;
        this.f42059b = z10;
        AbstractC5257t abstractC5257tMo11900y = interfaceC6822c.mo11900y();
        C5207g.m11108c(abstractC5257tMo11900y);
        Class clsM14897C1 = C7499b.m14897C0(abstractC5257tMo11900y);
        if (clsM14897C1 != null) {
            try {
                declaredMethod = clsM14897C1.getDeclaredMethod("box-impl", C7499b.m14919Q(clsM14897C1, interfaceC6822c).getReturnType());
                C5207g.m11110e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new KotlinReflectionInternalError("No box method found in inline class: " + clsM14897C1 + " (calling " + interfaceC6822c + ')');
            }
        } else {
            declaredMethod = null;
        }
        if (C8414e.m16464a(interfaceC6822c)) {
            aVar = new a(C6526i.f37170d, new Method[0], declaredMethod);
        } else {
            if (!(interfaceC7639b instanceof AbstractC7640c.g.c)) {
                if (!(interfaceC6822c instanceof InterfaceC6821b)) {
                    if (interfaceC6822c.mo11892m0() != null && !(interfaceC7639b instanceof InterfaceC7638a)) {
                        InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC6822c.mo11876g();
                        C5207g.m11110e(interfaceC8838gMo11876g2, "descriptor.containingDeclaration");
                        if (!C8414e.m16465b(interfaceC8838gMo11876g2)) {
                            i10 = 1;
                        }
                        if (z10) {
                            i11 = 2;
                        } else {
                            i11 = 0;
                        }
                        if (interfaceC6822c.mo5294F0()) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        int i14 = i11 + i12;
                        arrayList = new ArrayList();
                        interfaceC8835e0Mo11896s0 = interfaceC6822c.mo11896s0();
                        if (interfaceC8835e0Mo11896s0 != null) {
                            abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                        } else {
                            abstractC5257tMo11884c = null;
                        }
                        if (abstractC5257tMo11884c != null) {
                            arrayList.add(abstractC5257tMo11884c);
                        } else if (interfaceC6822c instanceof InterfaceC6821b) {
                            interfaceC8830cMo13615I = ((InterfaceC6821b) interfaceC6822c).mo13615I();
                            C5207g.m11110e(interfaceC8830cMo13615I, "descriptor.constructedClass");
                            if (interfaceC8830cMo13615I.mo13596U()) {
                                InterfaceC8838g interfaceC8838gMo11876g3 = interfaceC8830cMo13615I.mo11876g();
                                C5207g.m11109d(interfaceC8838gMo11876g3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g3).mo5316v());
                            }
                        } else {
                            interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
                            C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
                            if ((interfaceC8838gMo11876g instanceof InterfaceC8830c) && C8414e.m16465b(interfaceC8838gMo11876g)) {
                                arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g).mo5316v());
                            }
                        }
                        List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo11889i();
                        C5207g.m11110e(listMo11889i, "descriptor.valueParameters");
                        it = listMo11889i.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InterfaceC8853n0) it.next()).mo11884c());
                        }
                        size = arrayList.size() + i10 + i14;
                        if (C5206f.m10996Q0(this) == size) {
                            throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + C5206f.m10996Q0(this) + " != " + size + "\nCalling: " + interfaceC6822c + "\nParameter types: " + mo13522a() + ")\nDefault: " + this.f42059b);
                        }
                        c6526iM411w2 = C0062b.m411w2(Math.max(i10, 0), arrayList.size() + i10);
                        methodArr = new Method[size];
                        for (i13 = 0; i13 < size; i13++) {
                            int i15 = c6526iM411w2.f37163a;
                            if (i13 <= c6526iM411w2.f37164b || i15 > i13) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11 || (clsM14897C0 = C7499b.m14897C0((AbstractC5257t) arrayList.get(i13 - i10))) == null) {
                                methodM14919Q = null;
                            } else {
                                methodM14919Q = C7499b.m14919Q(clsM14897C0, interfaceC6822c);
                            }
                            methodArr[i13] = methodM14919Q;
                        }
                        aVar = new a(c6526iM411w2, methodArr, declaredMethod);
                    }
                    i10 = 0;
                    if (z10) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (interfaceC6822c.mo5294F0()) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i16 = i11 + i12;
                    arrayList = new ArrayList();
                    interfaceC8835e0Mo11896s0 = interfaceC6822c.mo11896s0();
                    if (interfaceC8835e0Mo11896s0 != null) {
                        abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                    } else {
                        abstractC5257tMo11884c = null;
                    }
                    if (abstractC5257tMo11884c != null) {
                        arrayList.add(abstractC5257tMo11884c);
                    } else if (interfaceC6822c instanceof InterfaceC6821b) {
                        interfaceC8830cMo13615I = ((InterfaceC6821b) interfaceC6822c).mo13615I();
                        C5207g.m11110e(interfaceC8830cMo13615I, "descriptor.constructedClass");
                        if (interfaceC8830cMo13615I.mo13596U()) {
                            InterfaceC8838g interfaceC8838gMo11876g4 = interfaceC8830cMo13615I.mo11876g();
                            C5207g.m11109d(interfaceC8838gMo11876g4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g4).mo5316v());
                        }
                    } else {
                        interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
                        C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
                        if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                            arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g).mo5316v());
                        }
                    }
                    List<InterfaceC8853n0> listMo11889i2 = interfaceC6822c.mo11889i();
                    C5207g.m11110e(listMo11889i2, "descriptor.valueParameters");
                    it = listMo11889i2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InterfaceC8853n0) it.next()).mo11884c());
                    }
                    size = arrayList.size() + i10 + i16;
                    if (C5206f.m10996Q0(this) == size) {
                        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + C5206f.m10996Q0(this) + " != " + size + "\nCalling: " + interfaceC6822c + "\nParameter types: " + mo13522a() + ")\nDefault: " + this.f42059b);
                    }
                    c6526iM411w2 = C0062b.m411w2(Math.max(i10, 0), arrayList.size() + i10);
                    methodArr = new Method[size];
                    while (i13 < size) {
                        int i17 = c6526iM411w2.f37163a;
                        if (i13 <= c6526iM411w2.f37164b) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            methodM14919Q = null;
                        } else {
                            methodM14919Q = null;
                        }
                        methodArr[i13] = methodM14919Q;
                    }
                    aVar = new a(c6526iM411w2, methodArr, declaredMethod);
                } else if (interfaceC7639b instanceof InterfaceC7638a) {
                }
                i10 = 0;
                if (z10) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                if (interfaceC6822c.mo5294F0()) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i18 = i11 + i12;
                arrayList = new ArrayList();
                interfaceC8835e0Mo11896s0 = interfaceC6822c.mo11896s0();
                if (interfaceC8835e0Mo11896s0 != null) {
                    abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                } else {
                    abstractC5257tMo11884c = null;
                }
                if (abstractC5257tMo11884c != null) {
                    arrayList.add(abstractC5257tMo11884c);
                } else if (interfaceC6822c instanceof InterfaceC6821b) {
                    interfaceC8830cMo13615I = ((InterfaceC6821b) interfaceC6822c).mo13615I();
                    C5207g.m11110e(interfaceC8830cMo13615I, "descriptor.constructedClass");
                    if (interfaceC8830cMo13615I.mo13596U()) {
                        InterfaceC8838g interfaceC8838gMo11876g5 = interfaceC8830cMo13615I.mo11876g();
                        C5207g.m11109d(interfaceC8838gMo11876g5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g5).mo5316v());
                    }
                } else {
                    interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
                    C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
                    if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                        arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g).mo5316v());
                    }
                }
                List<InterfaceC8853n0> listMo11889i3 = interfaceC6822c.mo11889i();
                C5207g.m11110e(listMo11889i3, "descriptor.valueParameters");
                it = listMo11889i3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC8853n0) it.next()).mo11884c());
                }
                size = arrayList.size() + i10 + i18;
                if (C5206f.m10996Q0(this) == size) {
                    throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + C5206f.m10996Q0(this) + " != " + size + "\nCalling: " + interfaceC6822c + "\nParameter types: " + mo13522a() + ")\nDefault: " + this.f42059b);
                }
                c6526iM411w2 = C0062b.m411w2(Math.max(i10, 0), arrayList.size() + i10);
                methodArr = new Method[size];
                while (i13 < size) {
                    int i19 = c6526iM411w2.f37163a;
                    if (i13 <= c6526iM411w2.f37164b) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        methodM14919Q = null;
                    } else {
                        methodM14919Q = null;
                    }
                    methodArr[i13] = methodM14919Q;
                }
                aVar = new a(c6526iM411w2, methodArr, declaredMethod);
            }
            i10 = -1;
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (interfaceC6822c.mo5294F0()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i110 = i11 + i12;
            arrayList = new ArrayList();
            interfaceC8835e0Mo11896s0 = interfaceC6822c.mo11896s0();
            if (interfaceC8835e0Mo11896s0 != null) {
                abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
            } else {
                abstractC5257tMo11884c = null;
            }
            if (abstractC5257tMo11884c != null) {
                arrayList.add(abstractC5257tMo11884c);
            } else if (interfaceC6822c instanceof InterfaceC6821b) {
                interfaceC8830cMo13615I = ((InterfaceC6821b) interfaceC6822c).mo13615I();
                C5207g.m11110e(interfaceC8830cMo13615I, "descriptor.constructedClass");
                if (interfaceC8830cMo13615I.mo13596U()) {
                    InterfaceC8838g interfaceC8838gMo11876g6 = interfaceC8830cMo13615I.mo11876g();
                    C5207g.m11109d(interfaceC8838gMo11876g6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g6).mo5316v());
                }
            } else {
                interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
                C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
                if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                    arrayList.add(((InterfaceC8830c) interfaceC8838gMo11876g).mo5316v());
                }
            }
            List<InterfaceC8853n0> listMo11889i4 = interfaceC6822c.mo11889i();
            C5207g.m11110e(listMo11889i4, "descriptor.valueParameters");
            it = listMo11889i4.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8853n0) it.next()).mo11884c());
            }
            size = arrayList.size() + i10 + i110;
            if (C5206f.m10996Q0(this) == size) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + C5206f.m10996Q0(this) + " != " + size + "\nCalling: " + interfaceC6822c + "\nParameter types: " + mo13522a() + ")\nDefault: " + this.f42059b);
            }
            c6526iM411w2 = C0062b.m411w2(Math.max(i10, 0), arrayList.size() + i10);
            methodArr = new Method[size];
            while (i13 < size) {
                int i111 = c6526iM411w2.f37163a;
                if (i13 <= c6526iM411w2.f37164b) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (z11) {
                    methodM14919Q = null;
                } else {
                    methodM14919Q = null;
                }
                methodArr[i13] = methodM14919Q;
            }
            aVar = new a(c6526iM411w2, methodArr, declaredMethod);
        }
        this.f42060c = aVar;
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: a */
    public final List<Type> mo13522a() {
        return this.f42058a.mo13522a();
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: b */
    public final Object mo13523b(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        a aVar = this.f42060c;
        C6526i c6526i = aVar.f42061a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
        int i10 = c6526i.f37163a;
        int i11 = c6526i.f37164b;
        if (i10 <= i11) {
            while (true) {
                Method method = aVar.f42062b[i10];
                Object objM14792c = objArr[i10];
                if (method != null) {
                    if (objM14792c != null) {
                        objM14792c = method.invoke(objM14792c, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        C5207g.m11110e(returnType, "method.returnType");
                        objM14792c = C7398k.m14792c(returnType);
                    }
                }
                objArrCopyOf[i10] = objM14792c;
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        Object objMo13523b = this.f42058a.mo13523b(objArrCopyOf);
        Method method2 = aVar.f42063c;
        if (method2 != null && (objInvoke = method2.invoke(null, objMo13523b)) != null) {
            return objInvoke;
        }
        return objMo13523b;
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: y */
    public final Type mo13524y() {
        return this.f42058a.mo13524y();
    }
}
