package p000;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vn7 {

    /* JADX INFO: renamed from: a */
    public final MutablePropertyReference1Impl f65666a;

    /* JADX INFO: renamed from: b */
    public final String f65667b;

    public vn7(MutablePropertyReference1Impl mutablePropertyReference1Impl, String str) {
        str.getClass();
        this.f65666a = mutablePropertyReference1Impl;
        this.f65667b = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m23437a(Object obj) {
        Object obj2 = this.f65666a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        C3386nv.m17633t(AbstractC3393o1.m17738m(new StringBuilder("Field "), this.f65667b, " is not set"));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m23438b(Object obj, Object obj2) {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = this.f65666a;
        Object obj3 = mutablePropertyReference1Impl.get(obj);
        if (obj3 == null) {
            mutablePropertyReference1Impl.mo15408m(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public vn7(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        this(mutablePropertyReference1Impl, mutablePropertyReference1Impl.f47706d);
    }
}
