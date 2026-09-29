package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class wy2 extends em1 {

    /* JADX INFO: renamed from: a */
    public final xv5 f67510a;

    /* JADX INFO: renamed from: b */
    public final cc4 f67511b;

    public wy2(xv5 xv5Var, cc4 cc4Var) {
        this.f67510a = xv5Var;
        this.f67511b = cc4Var;
    }

    @Override // p000.em1
    /* JADX INFO: renamed from: a */
    public final fm1 mo11218a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, o98 o98Var) {
        type.getClass();
        annotationArr2.getClass();
        cc4 cc4Var = this.f67511b;
        return new mq7(this.f67510a, AbstractC3423or.m18245b0(((df4) cc4Var.f9881a).f35561b, type), cc4Var, 3);
    }

    @Override // p000.em1
    /* JADX INFO: renamed from: b */
    public final fm1 mo11219b(Type type, Annotation[] annotationArr, o98 o98Var) {
        cc4 cc4Var = this.f67511b;
        return new b64(AbstractC3423or.m18245b0(((df4) cc4Var.f9881a).f35561b, type), cc4Var);
    }
}
