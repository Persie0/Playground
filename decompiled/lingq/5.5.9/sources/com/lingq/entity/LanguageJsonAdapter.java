package com.lingq.entity;

import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Language;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageJsonAdapter extends AbstractC4949k<Language> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17025a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17026b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f17027c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17028d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17029e;

    public LanguageJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17025a = JsonReader.C4932a.m10513a("code", "supported", "title", "lastUsed", "knownWords", "dictionaryLocaleActive", "grammarResourceSlug");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17026b = c4955q.m10565c(String.class, emptySet, "code");
        this.f17027c = c4955q.m10565c(Boolean.class, emptySet, "supported");
        this.f17028d = c4955q.m10565c(String.class, emptySet, "title");
        this.f17029e = c4955q.m10565c(Integer.class, emptySet, "knownWords");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Language mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Boolean boolMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Integer numMo9385a = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17025a);
            AbstractC4949k<String> abstractC4949k = this.f17028d;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17026b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    boolMo9385a = this.f17027c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case 4:
                    numMo9385a = this.f17029e.mo9385a(jsonReader);
                    break;
                case 5:
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = abstractC4949k.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a != null) {
            return new Language(strMo9385a, boolMo9385a, strMo9385a2, strMo9385a3, numMo9385a, strMo9385a4, strMo9385a5);
        }
        throw C9756b.m18248g("code", "code", jsonReader);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Language language) throws IOException {
        Language language2 = language;
        C5207g.m11111f(abstractC9310n, "writer");
        if (language2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        this.f17026b.mo9386f(abstractC9310n, language2.f16981a);
        abstractC9310n.mo10551C("supported");
        this.f17027c.mo9386f(abstractC9310n, language2.f16982b);
        abstractC9310n.mo10551C("title");
        String str = language2.f16983c;
        AbstractC4949k<String> abstractC4949k = this.f17028d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("lastUsed");
        abstractC4949k.mo9386f(abstractC9310n, language2.f16984d);
        abstractC9310n.mo10551C("knownWords");
        this.f17029e.mo9386f(abstractC9310n, language2.f16985e);
        abstractC9310n.mo10551C("dictionaryLocaleActive");
        abstractC4949k.mo9386f(abstractC9310n, language2.f16986f);
        abstractC9310n.mo10551C("grammarResourceSlug");
        abstractC4949k.mo9386f(abstractC9310n, language2.f16987g);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Language)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
