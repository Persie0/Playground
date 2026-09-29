package p486xh;

import dm.C5207g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jp.C6554v;
import jp.InterfaceC6538f;

/* JADX INFO: renamed from: xh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10192d {

    /* JADX INFO: renamed from: a */
    public static final a f51547a = new a();

    /* JADX INFO: renamed from: xh.d$a */
    public static final class a extends InterfaceC6538f.a {
        @Override // jp.InterfaceC6538f.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC6538f mo13121b(Type type, Annotation[] annotationArr, C6554v c6554v) {
            C5207g.m11111f(type, "type");
            C5207g.m11111f(annotationArr, "annotations");
            C5207g.m11111f(c6554v, "retrofit");
            return new C10191c(c6554v, this, type, annotationArr);
        }
    }
}
