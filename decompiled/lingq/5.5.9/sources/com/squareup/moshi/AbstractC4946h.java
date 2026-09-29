package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4946h<C extends Collection<T>, T> extends AbstractC4949k<C> {

    /* JADX INFO: renamed from: b */
    public static final a f32245b = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<T> f32246a;

    /* JADX INFO: renamed from: com.squareup.moshi.h$a */
    public class a implements AbstractC4949k.a {
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            Class<?> clsM17658c = C9312p.m17658c(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsM17658c == List.class || clsM17658c == Collection.class) {
                return new C4947i(c4955q.m10564b(C9312p.m17656a(type, Collection.class))).m10534d();
            }
            if (clsM17658c == Set.class) {
                return new C4948j(c4955q.m10564b(C9312p.m17656a(type, Collection.class))).m10534d();
            }
            return null;
        }
    }

    public AbstractC4946h(AbstractC4949k abstractC4949k) {
        this.f32246a = abstractC4949k;
    }

    public final String toString() {
        return this.f32246a + ".collection()";
    }
}
