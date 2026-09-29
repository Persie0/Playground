package p486xh;

import dm.C5207g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jp.C6554v;
import jp.InterfaceC6538f;
import so.AbstractC9107y;

/* JADX INFO: renamed from: xh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10191c implements InterfaceC6538f<AbstractC9107y, Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6538f<AbstractC9107y, Object> f51546a;

    public C10191c(C6554v c6554v, C10192d.a aVar, Type type, Annotation[] annotationArr) {
        aVar.getClass();
        this.f51546a = c6554v.m13154d(aVar, type, annotationArr);
    }

    @Override // jp.InterfaceC6538f
    /* JADX INFO: renamed from: a */
    public final Object mo13122a(AbstractC9107y abstractC9107y) {
        AbstractC9107y abstractC9107y2 = abstractC9107y;
        C5207g.m11111f(abstractC9107y2, "value");
        if (abstractC9107y2.mo13136b() != 0) {
            return this.f51546a.mo13122a(abstractC9107y2);
        }
        return null;
    }
}
