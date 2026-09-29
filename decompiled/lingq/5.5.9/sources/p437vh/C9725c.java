package p437vh;

import com.lingq.shared.network.adapters.SingleToArray;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import tk.AbstractC9310n;
import tk.C9312p;
import tk.InterfaceC9308l;

/* JADX INFO: renamed from: vh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9725c extends AbstractC4949k<Object> {

    /* JADX INFO: renamed from: b */
    public static final a f49743b = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<List<Object>> f49744a;

    /* JADX INFO: renamed from: vh.c$a */
    public static final class a implements AbstractC4949k.a {
        /* JADX WARN: Code duplicated, block: B:16:0x005f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0061  */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0083, please report this as an issue */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<Object> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            Set<? extends Annotation> setUnmodifiableSet;
            C5207g.m11111f(type, "type");
            C5207g.m11111f(set, "annotations");
            C5207g.m11111f(c4955q, "moshi");
            if (!SingleToArray.class.isAnnotationPresent(InterfaceC9308l.class)) {
                throw new IllegalArgumentException(SingleToArray.class + " is not a JsonQualifier.");
            }
            if (!set.isEmpty()) {
                Iterator<? extends Annotation> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Annotation next = it.next();
                        if (SingleToArray.class.equals(next.annotationType())) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                            linkedHashSet.remove(next);
                            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                            break;
                        }
                    }
                }
                if (setUnmodifiableSet == null) {
                    return null;
                }
                if (C5207g.m11106a(C9312p.m17658c(type), List.class)) {
                    return new C9725c(c4955q.m10565c(type, setUnmodifiableSet, null), c4955q.m10564b(C9312p.m17656a(type, List.class)));
                }
                throw new IllegalArgumentException("Only lists may be annotated with @SingleToArray. Found: " + type);
            }
            setUnmodifiableSet = null;
            if (setUnmodifiableSet == null) {
                return null;
            }
            if (C5207g.m11106a(C9312p.m17658c(type), List.class)) {
                return new C9725c(c4955q.m10565c(type, setUnmodifiableSet, null), c4955q.m10564b(C9312p.m17656a(type, List.class)));
            }
            throw new IllegalArgumentException("Only lists may be annotated with @SingleToArray. Found: " + type);
        }
    }

    public C9725c(AbstractC4949k<List<Object>> abstractC4949k, AbstractC4949k<Object> abstractC4949k2) {
        this.f49744a = abstractC4949k;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        if (jsonReader.mo10505d0() == JsonReader.Token.BEGIN_ARRAY) {
            return this.f49744a.mo9385a(jsonReader);
        }
        jsonReader.mo10498I0();
        return EmptyList.f38032a;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) {
        C5207g.m11111f(abstractC9310n, "writer");
        throw new UnsupportedOperationException("SingleToArrayAdapter is only used to deserialize objects");
    }
}
