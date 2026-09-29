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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ProviderJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Provider;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProviderJsonAdapter extends AbstractC4949k<Provider> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17367a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17368b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17369c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17370d;

    public ProviderJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17367a = JsonReader.C4932a.m10513a("id", "language", "description", "image", "title", "url");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17368b = c4955q.m10565c(cls, emptySet, "id");
        this.f17369c = c4955q.m10565c(String.class, emptySet, "language");
        this.f17370d = c4955q.m10565c(String.class, emptySet, "description");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Provider mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17367a);
            AbstractC4949k<String> abstractC4949k = this.f17370d;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17368b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a = this.f17369c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case 5:
                    strMo9385a5 = abstractC4949k.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (strMo9385a != null) {
            return new Provider(iIntValue, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5);
        }
        throw C9756b.m18248g("language", "language", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Provider provider) throws IOException {
        Provider provider2 = provider;
        C5207g.m11111f(abstractC9310n, "writer");
        if (provider2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f17368b.mo9386f(abstractC9310n, Integer.valueOf(provider2.f17361a));
        abstractC9310n.mo10551C("language");
        this.f17369c.mo9386f(abstractC9310n, provider2.f17362b);
        abstractC9310n.mo10551C("description");
        String str = provider2.f17363c;
        AbstractC4949k<String> abstractC4949k = this.f17370d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("image");
        abstractC4949k.mo9386f(abstractC9310n, provider2.f17364d);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, provider2.f17365e);
        abstractC9310n.mo10551C("url");
        abstractC4949k.mo9386f(abstractC9310n, provider2.f17366f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Provider)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
