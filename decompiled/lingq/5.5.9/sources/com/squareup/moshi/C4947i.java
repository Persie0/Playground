package com.squareup.moshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: com.squareup.moshi.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C4947i extends AbstractC4946h<Collection<Object>, Object> {
    public C4947i(AbstractC4949k abstractC4949k) {
        super(abstractC4949k);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IOException {
        Collection<Object> collectionM10530g = m10530g();
        jsonReader.mo10503a();
        while (jsonReader.mo10511w()) {
            ((ArrayList) collectionM10530g).add(this.f32246a.mo9385a(jsonReader));
        }
        jsonReader.mo10506l();
        return collectionM10530g;
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
    public final Collection<Object> m10530g() {
        return new ArrayList();
    }
}
