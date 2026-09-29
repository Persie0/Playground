package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x52 extends wl0 {

    /* JADX INFO: renamed from: a */
    public final Executor f67770a;

    public x52(Executor executor) {
        this.f67770a = executor;
    }

    @Override // p000.wl0
    /* JADX INFO: renamed from: a */
    public final xl0 mo24043a(Type type, Annotation[] annotationArr, o98 o98Var) {
        if (ci8.m4690C(type) != ul0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new b64(ci8.m4689B(0, (ParameterizedType) type), ci8.m4695H(annotationArr, o99.class) ? null : this.f67770a);
        }
        C3386nv.m17626m("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
