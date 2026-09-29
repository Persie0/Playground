package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/FastSearchJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/FastSearch;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class FastSearchJsonAdapter extends AbstractC4949k<FastSearch> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16978a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16979b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f16980c;

    public FastSearchJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16978a = JsonReader.C4932a.m10513a("id", "language", "query", "type", "title");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16979b = c4955q.m10565c(String.class, emptySet, "id");
        this.f16980c = c4955q.m10565c(String.class, emptySet, "title");
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final FastSearch mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f16978a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f16979b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                } else if (iMo10512y0 == 2) {
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("query", "query", jsonReader);
                    }
                } else if (iMo10512y0 == 3) {
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                } else if (iMo10512y0 == 4) {
                    strMo9385a5 = this.f16980c.mo9385a(jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        if (strMo9385a3 == null) {
            throw C9756b.m18248g("query", "query", jsonReader);
        }
        if (strMo9385a4 != null) {
            return new FastSearch(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5);
        }
        throw C9756b.m18248g("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, FastSearch fastSearch) throws IOException {
        FastSearch fastSearch2 = fastSearch;
        C5207g.m11111f(abstractC9310n, "writer");
        if (fastSearch2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        String str = fastSearch2.f16973a;
        AbstractC4949k<String> abstractC4949k = this.f16979b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, fastSearch2.f16974b);
        abstractC9310n.mo10551C("query");
        abstractC4949k.mo9386f(abstractC9310n, fastSearch2.f16975c);
        abstractC9310n.mo10551C("type");
        abstractC4949k.mo9386f(abstractC9310n, fastSearch2.f16976d);
        abstractC9310n.mo10551C("title");
        this.f16980c.mo9386f(abstractC9310n, fastSearch2.f16977e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(32, "GeneratedJsonAdapter(FastSearch)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
