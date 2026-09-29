package dm;

import km.InterfaceC6719b;
import km.InterfaceC6721d;
import km.InterfaceC6722e;
import km.InterfaceC6723f;
import km.InterfaceC6724g;
import km.InterfaceC6725h;
import km.InterfaceC6726i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;

/* JADX INFO: renamed from: dm.j */
/* JADX INFO: loaded from: classes2.dex */
public class C5210j {
    /* JADX INFO: renamed from: a */
    public InterfaceC6722e mo11121a(FunctionReference functionReference) {
        return functionReference;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC6719b mo11122b(Class cls) {
        return new C5203c(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC6721d mo11123c(Class cls, String str) {
        return new C5208h(cls, str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC6723f mo11124d(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC6724g mo11125e(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC6725h mo11126f(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC6726i mo11127g(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    /* JADX INFO: renamed from: h */
    public String mo11128h(InterfaceC5205e interfaceC5205e) {
        String string = interfaceC5205e.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: i */
    public String mo11129i(Lambda lambda) {
        return mo11128h(lambda);
    }
}
