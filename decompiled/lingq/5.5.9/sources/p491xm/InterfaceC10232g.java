package p491xm;

import ae.C0062b;
import dm.C5207g;
import gn.InterfaceC5824d;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.EmptyList;
import mn.C7646c;

/* JADX INFO: renamed from: xm.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10232g extends InterfaceC5824d {

    /* JADX INFO: renamed from: xm.g$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C10229d m19211a(InterfaceC10232g interfaceC10232g, C7646c c7646c) {
            Annotation[] declaredAnnotations;
            C5207g.m11111f(c7646c, "fqName");
            AnnotatedElement annotatedElementMo13652D = interfaceC10232g.mo13652D();
            if (annotatedElementMo13652D == null || (declaredAnnotations = annotatedElementMo13652D.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C0062b.m295O0(declaredAnnotations, c7646c);
        }

        /* JADX INFO: renamed from: b */
        public static List<C10229d> m19212b(InterfaceC10232g interfaceC10232g) {
            Annotation[] declaredAnnotations;
            AnnotatedElement annotatedElementMo13652D = interfaceC10232g.mo13652D();
            return (annotatedElementMo13652D == null || (declaredAnnotations = annotatedElementMo13652D.getDeclaredAnnotations()) == null) ? EmptyList.f38032a : C0062b.m325Y0(declaredAnnotations);
        }
    }

    /* JADX INFO: renamed from: D */
    AnnotatedElement mo13652D();
}
