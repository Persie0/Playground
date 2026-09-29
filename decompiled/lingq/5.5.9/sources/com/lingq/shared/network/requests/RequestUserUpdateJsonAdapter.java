package com.lingq.shared.network.requests;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestUserUpdateJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestUserUpdate;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestUserUpdateJsonAdapter extends AbstractC4949k<RequestUserUpdate> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18231a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18232b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<String>> f18233c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18234d;

    public RequestUserUpdateJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18231a = JsonReader.C4932a.m10513a("active_language", "dictionary_languages", "dictionary_locale", "email", "id", "locale", "name", "password", "username");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18232b = c4955q.m10565c(String.class, emptySet, "activeLanguage");
        this.f18233c = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "dictionaryLanguages");
        this.f18234d = c4955q.m10565c(Integer.class, emptySet, "id");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestUserUpdate mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<String> listMo9385a = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        Integer numMo9385a = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String strMo9385a7 = null;
        while (jsonReader.mo10511w()) {
            String str = strMo9385a7;
            int iMo10512y0 = jsonReader.mo10512y0(this.f18231a);
            String str2 = strMo9385a;
            AbstractC4949k<String> abstractC4949k = this.f18232b;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z10 = true;
                    continue;
                case 1:
                    listMo9385a = this.f18233c.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z11 = true;
                    continue;
                case 2:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z12 = true;
                    continue;
                case 3:
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z13 = true;
                    continue;
                case 4:
                    numMo9385a = this.f18234d.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z14 = true;
                    continue;
                case 5:
                    strMo9385a5 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z15 = true;
                    continue;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a6 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    strMo9385a = str2;
                    z16 = true;
                    continue;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a7 = str;
                    z17 = true;
                    continue;
                case 8:
                    strMo9385a7 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a = str2;
                    z18 = true;
                    continue;
            }
            strMo9385a7 = str;
            strMo9385a = str2;
        }
        String str3 = strMo9385a;
        String str4 = strMo9385a7;
        jsonReader.mo10508q();
        RequestUserUpdate requestUserUpdate = new RequestUserUpdate();
        if (z10) {
            requestUserUpdate.f18223b = strMo9385a2;
        }
        if (z11) {
            requestUserUpdate.f18229h = listMo9385a;
        }
        if (z12) {
            requestUserUpdate.f18228g = strMo9385a3;
        }
        if (z13) {
            requestUserUpdate.f18225d = strMo9385a4;
        }
        if (z14) {
            requestUserUpdate.f18222a = numMo9385a;
        }
        if (z15) {
            requestUserUpdate.f18230i = strMo9385a5;
        }
        if (z16) {
            requestUserUpdate.f18226e = strMo9385a6;
        }
        if (z17) {
            requestUserUpdate.f18227f = str3;
        }
        if (z18) {
            requestUserUpdate.f18224c = str4;
        }
        return requestUserUpdate;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestUserUpdate requestUserUpdate) throws IOException {
        RequestUserUpdate requestUserUpdate2 = requestUserUpdate;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestUserUpdate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("active_language");
        String str = requestUserUpdate2.f18223b;
        AbstractC4949k<String> abstractC4949k = this.f18232b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("dictionary_languages");
        this.f18233c.mo9386f(abstractC9310n, requestUserUpdate2.f18229h);
        abstractC9310n.mo10551C("dictionary_locale");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18228g);
        abstractC9310n.mo10551C("email");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18225d);
        abstractC9310n.mo10551C("id");
        this.f18234d.mo9386f(abstractC9310n, requestUserUpdate2.f18222a);
        abstractC9310n.mo10551C("locale");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18230i);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18226e);
        abstractC9310n.mo10551C("password");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18227f);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, requestUserUpdate2.f18224c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(RequestUserUpdate)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
