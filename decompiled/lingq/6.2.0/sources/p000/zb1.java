package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class zb1 extends wl0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71298a;

    public /* synthetic */ zb1(int i) {
        this.f71298a = i;
    }

    @Override // p000.wl0
    /* JADX INFO: renamed from: a */
    public final xl0 mo24043a(Type type, Annotation[] annotationArr, o98 o98Var) {
        switch (this.f71298a) {
            case 0:
                if (ci8.m4690C(type) != CompletableFuture.class) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    C3386nv.m17633t("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                    return null;
                }
                Type typeM4689B = ci8.m4689B(0, (ParameterizedType) type);
                if (ci8.m4690C(typeM4689B) != i88.class) {
                    return new vqb(typeM4689B, 7);
                }
                if (typeM4689B instanceof ParameterizedType) {
                    return new vj6(ci8.m4689B(0, (ParameterizedType) typeM4689B), 9);
                }
                C3386nv.m17633t("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            default:
                type.getClass();
                annotationArr.getClass();
                if (fa4.m11650l(ci8.m4690C(type), NetworkResponse.class)) {
                    if (!(type instanceof ParameterizedType)) {
                        C3386nv.m17626m("NetworkResponse return type must be parameterized as NetworkResponse<Success>");
                        return null;
                    }
                    Type typeM4689B2 = ci8.m4689B(0, (ParameterizedType) type);
                    typeM4689B2.getClass();
                    return new cc4(typeM4689B2);
                }
                if (!fa4.m11650l(ci8.m4690C(type), ul0.class) || !(type instanceof ParameterizedType)) {
                    return null;
                }
                Type typeM4689B3 = ci8.m4689B(0, (ParameterizedType) type);
                if (!fa4.m11650l(ci8.m4690C(typeM4689B3), NetworkResponse.class)) {
                    return null;
                }
                if (!(typeM4689B3 instanceof ParameterizedType)) {
                    C3386nv.m17626m("NetworkResponse return type must be parameterized as NetworkResponse<Success>");
                    return null;
                }
                Type typeM4689B4 = ci8.m4689B(0, (ParameterizedType) typeM4689B3);
                typeM4689B4.getClass();
                return new cc4(typeM4689B4);
        }
    }
}
