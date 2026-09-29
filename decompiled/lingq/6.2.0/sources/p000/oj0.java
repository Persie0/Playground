package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 extends em1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54388a;

    public /* synthetic */ oj0(int i) {
        this.f54388a = i;
    }

    @Override // p000.em1
    /* JADX INFO: renamed from: a */
    public fm1 mo11218a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, o98 o98Var) {
        switch (this.f54388a) {
            case 0:
                if (z68.class.isAssignableFrom(ci8.m4690C(type))) {
                    return n58.f52375c;
                }
                return null;
            default:
                return super.mo11218a(type, annotationArr, annotationArr2, o98Var);
        }
    }

    @Override // p000.em1
    /* JADX INFO: renamed from: b */
    public final fm1 mo11219b(Type type, Annotation[] annotationArr, o98 o98Var) {
        switch (this.f54388a) {
            case 0:
                if (type == m88.class) {
                    return ci8.m4695H(annotationArr, jk9.class) ? bw8.f9100b : my5.f52032c;
                }
                if (type == Void.class) {
                    return to2.f62631a;
                }
                if (ci8.f10126j && type == xfa.class) {
                    return gna.f41054b;
                }
                return null;
            case 1:
                return new vqb(o98Var, this, type, annotationArr);
            default:
                if (ci8.m4690C(type) != Optional.class) {
                    return null;
                }
                return new ck6(o98Var.m17878b(null, ci8.m4689B(0, (ParameterizedType) type), annotationArr), 23);
        }
    }
}
