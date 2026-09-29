package kotlin.reflect.jvm.internal.calls;

import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6719b;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mm.InterfaceC7639b;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationConstructorCaller implements InterfaceC7639b {

    /* JADX INFO: renamed from: a */
    public final Class<?> f38297a;

    /* JADX INFO: renamed from: b */
    public final List<String> f38298b;

    /* JADX INFO: renamed from: c */
    public final CallMode f38299c;

    /* JADX INFO: renamed from: d */
    public final List<Method> f38300d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f38301e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f38302f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f38303g;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode, Origin origin) {
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, callMode, origin, arrayList2);
    }

    public AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode, Origin origin, List list) {
        C5207g.m11111f(cls, "jClass");
        C5207g.m11111f(callMode, "callMode");
        C5207g.m11111f(origin, "origin");
        C5207g.m11111f(list, "methods");
        this.f38297a = cls;
        this.f38298b = arrayList;
        this.f38299c = callMode;
        this.f38300d = list;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f38301e = arrayList2;
        List<Method> list2 = this.f38300d;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            C5207g.m11110e(returnType, "it");
            List<InterfaceC6719b<? extends Object>> list3 = ReflectClassUtilKt.f38580a;
            Class<? extends Object> cls2 = ReflectClassUtilKt.f38582c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f38302f = arrayList3;
        List<Method> list4 = this.f38300d;
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list4, 10));
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f38303g = arrayList4;
        if (this.f38299c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA) {
            if (!C6752c.m13435c0(this.f38298b, "value").isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: a */
    public final List<Type> mo13522a() {
        return this.f38301e;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: b */
    public final Object mo13523b(Object[] objArr) {
        String strMo10975o;
        InterfaceC7639b.a.m15196a(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List<String> list = this.f38298b;
            if (i10 >= length) {
                return AnnotationConstructorCallerKt.m13525a(this.f38297a, C6753d.m13464Q0(C6752c.m13412A0(list, arrayList)), this.f38300d);
            }
            Object array = objArr[i10];
            int i12 = i11 + 1;
            ArrayList arrayList2 = this.f38302f;
            if (array == null && this.f38299c == CallMode.CALL_BY_NAME) {
                array = this.f38303g.get(i11);
            } else {
                Class cls = (Class) arrayList2.get(i11);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof InterfaceC6719b) {
                        array = C5206f.m10998T0((InterfaceC6719b) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (objArr2 instanceof Class[]) {
                            array = null;
                        } else if (objArr2 instanceof InterfaceC6719b[]) {
                            C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            InterfaceC6719b[] interfaceC6719bArr = (InterfaceC6719b[]) array;
                            ArrayList arrayList3 = new ArrayList(interfaceC6719bArr.length);
                            for (InterfaceC6719b interfaceC6719b : interfaceC6719bArr) {
                                arrayList3.add(C5206f.m10998T0(interfaceC6719b));
                            }
                            array = arrayList3.toArray(new Class[0]);
                            C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        } else {
                            array = objArr2;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = list.get(i11);
                Class cls2 = (Class) arrayList2.get(i11);
                InterfaceC6719b interfaceC6719bM11118a = C5207g.m11106a(cls2, Class.class) ? C5209i.m11118a(InterfaceC6719b.class) : (cls2.isArray() && C5207g.m11106a(cls2.getComponentType(), Class.class)) ? C5209i.m11118a(InterfaceC6719b[].class) : C5209i.m11118a(cls2);
                if (C5207g.m11106a(interfaceC6719bM11118a.mo10975o(), C5209i.m11118a(Object[].class).mo10975o())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(interfaceC6719bM11118a.mo10975o());
                    sb2.append('<');
                    Class<?> componentType = C5206f.m10998T0(interfaceC6719bM11118a).getComponentType();
                    C5207g.m11110e(componentType, "kotlinClass.java.componentType");
                    sb2.append(C5209i.m11118a(componentType).mo10975o());
                    sb2.append('>');
                    strMo10975o = sb2.toString();
                } else {
                    strMo10975o = interfaceC6719bM11118a.mo10975o();
                }
                throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + strMo10975o);
            }
            arrayList.add(array);
            i10++;
            i11 = i12;
        }
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: y */
    public final Type mo13524y() {
        return this.f38297a;
    }
}
