package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C4953o<K, V> extends AbstractC4949k<Map<K, V>> {

    /* JADX INFO: renamed from: c */
    public static final a f32265c = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<K> f32266a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<V> f32267b;

    /* JADX INFO: renamed from: com.squareup.moshi.o$a */
    public class a implements AbstractC4949k.a {
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            Class<?> clsM17658c;
            Type[] actualTypeArguments;
            if (set.isEmpty() && (clsM17658c = C9312p.m17658c(type)) == Map.class) {
                if (type == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsM17658c)) {
                        throw new IllegalArgumentException();
                    }
                    Type typeM18250i = C9756b.m18250i(type, clsM17658c, C9756b.m18244c(type, clsM17658c, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeM18250i instanceof ParameterizedType ? ((ParameterizedType) typeM18250i).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new C4953o(c4955q, actualTypeArguments[0], actualTypeArguments[1]).m10534d();
            }
            return null;
        }
    }

    public C4953o(C4955q c4955q, Type type, Type type2) {
        this.f32266a = c4955q.m10564b(type);
        this.f32267b = c4955q.m10564b(type2);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo10504b();
        while (jsonReader.mo10511w()) {
            jsonReader.mo10507m0();
            K kMo9385a = this.f32266a.mo9385a(jsonReader);
            V vMo9385a = this.f32267b.mo9385a(jsonReader);
            Object objPut = linkedHashTreeMap.put(kMo9385a, vMo9385a);
            if (objPut != null) {
                throw new JsonDataException("Map key '" + kMo9385a + "' has multiple values at path " + jsonReader.m10509r() + ": " + objPut + " and " + vMo9385a);
            }
        }
        jsonReader.mo10508q();
        return linkedHashTreeMap;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        abstractC9310n.mo10556b();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + abstractC9310n.m17655w());
            }
            int iM17652G = abstractC9310n.m17652G();
            if (iM17652G != 5 && iM17652G != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            abstractC9310n.f48048g = true;
            this.f32266a.mo9386f(abstractC9310n, entry.getKey());
            this.f32267b.mo9386f(abstractC9310n, entry.getValue());
        }
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return "JsonAdapter(" + this.f32266a + "=" + this.f32267b + ")";
    }
}
