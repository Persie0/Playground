package com.squareup.moshi;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: com.squareup.moshi.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C4948j extends AbstractC4946h<Set<Object>, Object> {
    public C4948j(AbstractC4949k abstractC4949k) {
        super(abstractC4949k);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        Collection collectionM10531g = m10531g();
        jsonReader.mo10503a();
        while (jsonReader.mo10511w()) {
            collectionM10531g.add(this.f32246a.mo9385a(jsonReader));
        }
        jsonReader.mo10506l();
        return collectionM10531g;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        abstractC9310n.mo10555a();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f32246a.mo9386f(abstractC9310n, (T) it.next());
        }
        abstractC9310n.mo10559q();
    }

    /* JADX INFO: renamed from: g */
    public final Collection m10531g() {
        return new LinkedHashSet();
    }
}
