package p437vh;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import tk.C9312p;

/* JADX INFO: renamed from: vh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9724b implements AbstractC4949k.a {
    @Override // com.squareup.moshi.AbstractC4949k.a
    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
        C5207g.m11111f(type, "type");
        C5207g.m11111f(set, "annotations");
        C5207g.m11111f(c4955q, "moshi");
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (C5207g.m11106a(Pair.class, parameterizedType.getRawType())) {
                return new C9723a(c4955q.m10564b(parameterizedType.getActualTypeArguments()[0]), c4955q.m10564b(parameterizedType.getActualTypeArguments()[1]), c4955q.m10564b(C9312p.m17659d(List.class, String.class)));
            }
        }
        return null;
    }
}
