package com.lingq.shared.network.result;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.MediaSource;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/FastSearchResultJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/FastSearchResult;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class FastSearchResultJsonAdapter extends AbstractC4949k<FastSearchResult> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18262a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18263b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18264c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18265d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<String> f18266e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<MediaSource> f18267f;

    public FastSearchResultJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18262a = JsonReader.C4932a.m10513a("id", "title", "type", "imageUrl", "isTaken", "status", "source");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18263b = c4955q.m10565c(cls, emptySet, "id");
        this.f18264c = c4955q.m10565c(String.class, emptySet, "title");
        this.f18265d = c4955q.m10565c(Boolean.class, emptySet, "isTaken");
        this.f18266e = c4955q.m10565c(String.class, emptySet, "status");
        this.f18267f = c4955q.m10565c(MediaSource.class, emptySet, "source");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final FastSearchResult mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Boolean boolMo9385a = null;
        String strMo9385a4 = null;
        MediaSource mediaSourceMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18262a);
            AbstractC4949k<String> abstractC4949k = this.f18264c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18263b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    break;
                    break;
                case 3:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("imageUrl", "imageUrl", jsonReader);
                    }
                    break;
                    break;
                case 4:
                    boolMo9385a = this.f18265d.mo9385a(jsonReader);
                    break;
                case 5:
                    strMo9385a4 = this.f18266e.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    mediaSourceMo9385a = this.f18267f.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (strMo9385a == null) {
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("type", "type", jsonReader);
        }
        if (strMo9385a3 != null) {
            return new FastSearchResult(iIntValue, strMo9385a, strMo9385a2, strMo9385a3, boolMo9385a, strMo9385a4, mediaSourceMo9385a);
        }
        throw C9756b.m18248g("imageUrl", "imageUrl", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, FastSearchResult fastSearchResult) throws IOException {
        FastSearchResult fastSearchResult2 = fastSearchResult;
        C5207g.m11111f(abstractC9310n, "writer");
        if (fastSearchResult2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f18263b.mo9386f(abstractC9310n, Integer.valueOf(fastSearchResult2.f18255a));
        abstractC9310n.mo10551C("title");
        String str = fastSearchResult2.f18256b;
        AbstractC4949k<String> abstractC4949k = this.f18264c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("type");
        abstractC4949k.mo9386f(abstractC9310n, fastSearchResult2.f18257c);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k.mo9386f(abstractC9310n, fastSearchResult2.f18258d);
        abstractC9310n.mo10551C("isTaken");
        this.f18265d.mo9386f(abstractC9310n, fastSearchResult2.f18259e);
        abstractC9310n.mo10551C("status");
        this.f18266e.mo9386f(abstractC9310n, fastSearchResult2.f18260f);
        abstractC9310n.mo10551C("source");
        this.f18267f.mo9386f(abstractC9310n, fastSearchResult2.f18261g);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(FastSearchResult)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
