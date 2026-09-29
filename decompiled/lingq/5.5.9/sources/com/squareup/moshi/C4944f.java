package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4944f extends AbstractC4949k<Object> {

    /* JADX INFO: renamed from: c */
    public static final a f32235c = new a();

    /* JADX INFO: renamed from: a */
    public final Class<?> f32236a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Object> f32237b;

    /* JADX INFO: renamed from: com.squareup.moshi.f$a */
    public class a implements AbstractC4949k.a {
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            Type componentType;
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = type instanceof Class ? ((Class) type).getComponentType() : null;
            }
            if (componentType != null && set.isEmpty()) {
                return new C4944f(C9312p.m17658c(componentType), c4955q.m10564b(componentType)).m10534d();
            }
            return null;
        }
    }

    public C4944f(Class<?> cls, AbstractC4949k<Object> abstractC4949k) {
        this.f32236a = cls;
        this.f32237b = abstractC4949k;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo10503a();
        while (jsonReader.mo10511w()) {
            arrayList.add(this.f32237b.mo9385a(jsonReader));
        }
        jsonReader.mo10506l();
        Object objNewInstance = Array.newInstance(this.f32236a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        abstractC9310n.mo10555a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f32237b.mo9386f(abstractC9310n, Array.get(obj, i10));
        }
        abstractC9310n.mo10559q();
    }

    public final String toString() {
        return this.f32237b + ".array()";
    }
}
