package dm;

import km.InterfaceC6719b;
import km.InterfaceC6723f;
import km.InterfaceC6725h;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.jvm.internal.C6786c;

/* JADX INFO: renamed from: dm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5209i {

    /* JADX INFO: renamed from: a */
    public static final C5210j f33277a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6719b[] f33278b;

    static {
        C5210j c5210j = null;
        try {
            c5210j = (C5210j) C6786c.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5210j == null) {
            c5210j = new C5210j();
        }
        f33277a = c5210j;
        f33278b = new InterfaceC6719b[0];
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6719b m11118a(Class cls) {
        return f33277a.mo11122b(cls);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6723f m11119b(MutablePropertyReference1 mutablePropertyReference1) {
        return f33277a.mo11124d(mutablePropertyReference1);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6725h m11120c(PropertyReference1 propertyReference1) {
        return f33277a.mo11126f(propertyReference1);
    }
}
