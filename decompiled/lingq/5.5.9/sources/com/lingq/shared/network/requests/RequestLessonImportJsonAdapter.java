package com.lingq.shared.network.requests;

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
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonImportJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestLessonImport;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestLessonImportJsonAdapter extends AbstractC4949k<RequestLessonImport> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18108a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18109b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18110c;

    public RequestLessonImportJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18108a = JsonReader.C4932a.m10513a("collection", "collection_title", "level", "originalUrl", "save", "source", "status", "text", "title", "url");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18109b = c4955q.m10565c(Integer.class, emptySet, "collection");
        this.f18110c = c4955q.m10565c(String.class, emptySet, "collectionTitle");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestLessonImport mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        String strMo9385a3 = null;
        Integer numMo9385a2 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        String strMo9385a8 = null;
        while (jsonReader.mo10511w()) {
            String str = strMo9385a2;
            int iMo10512y0 = jsonReader.mo10512y0(this.f18108a);
            String str2 = strMo9385a8;
            AbstractC4949k<Integer> abstractC4949k = this.f18109b;
            String str3 = strMo9385a;
            AbstractC4949k<String> abstractC4949k2 = this.f18110c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z10 = true;
                    continue;
                case 1:
                    strMo9385a3 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z11 = true;
                    continue;
                case 2:
                    numMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z12 = true;
                    continue;
                case 3:
                    strMo9385a4 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z13 = true;
                    continue;
                case 4:
                    strMo9385a5 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z14 = true;
                    continue;
                case 5:
                    strMo9385a6 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z15 = true;
                    continue;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a7 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z16 = true;
                    continue;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a8 = str2;
                    z17 = true;
                    continue;
                case 8:
                    strMo9385a8 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a2 = str;
                    strMo9385a = str3;
                    z18 = true;
                    continue;
                case 9:
                    strMo9385a2 = abstractC4949k2.mo9385a(jsonReader);
                    strMo9385a8 = str2;
                    strMo9385a = str3;
                    z19 = true;
                    continue;
            }
            strMo9385a2 = str;
            strMo9385a8 = str2;
            strMo9385a = str3;
        }
        String str4 = strMo9385a;
        String str5 = strMo9385a8;
        String str6 = strMo9385a2;
        jsonReader.mo10508q();
        RequestLessonImport requestLessonImport = new RequestLessonImport();
        if (z10) {
            requestLessonImport.f18106i = numMo9385a;
        }
        if (z11) {
            requestLessonImport.f18107j = strMo9385a3;
        }
        if (z12) {
            requestLessonImport.f18101d = numMo9385a2;
        }
        if (z13) {
            requestLessonImport.f18102e = strMo9385a4;
        }
        if (z14) {
            requestLessonImport.f18103f = strMo9385a5;
        }
        if (z15) {
            requestLessonImport.f18105h = strMo9385a6;
        }
        if (z16) {
            requestLessonImport.f18104g = strMo9385a7;
        }
        if (z17) {
            requestLessonImport.f18100c = str4;
        }
        if (z18) {
            requestLessonImport.f18099b = str5;
        }
        if (z19) {
            requestLessonImport.f18098a = str6;
        }
        return requestLessonImport;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestLessonImport requestLessonImport) throws IOException {
        RequestLessonImport requestLessonImport2 = requestLessonImport;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestLessonImport2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("collection");
        Integer num = requestLessonImport2.f18106i;
        AbstractC4949k<Integer> abstractC4949k = this.f18109b;
        abstractC4949k.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("collection_title");
        String str = requestLessonImport2.f18107j;
        AbstractC4949k<String> abstractC4949k2 = this.f18110c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("level");
        abstractC4949k.mo9386f(abstractC9310n, requestLessonImport2.f18101d);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18102e);
        abstractC9310n.mo10551C("save");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18103f);
        abstractC9310n.mo10551C("source");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18105h);
        abstractC9310n.mo10551C("status");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18104g);
        abstractC9310n.mo10551C("text");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18100c);
        abstractC9310n.mo10551C("title");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18099b);
        abstractC9310n.mo10551C("url");
        abstractC4949k2.mo9386f(abstractC9310n, requestLessonImport2.f18098a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(RequestLessonImport)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
