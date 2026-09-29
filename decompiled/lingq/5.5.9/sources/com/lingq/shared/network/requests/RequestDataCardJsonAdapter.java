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
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestDataCardJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestDataCard;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestDataCardJsonAdapter extends AbstractC4949k<RequestDataCard> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18054a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18055b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18056c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<RequestHintUpdate>> f18057d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f18058e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<String>> f18059f;

    public RequestDataCardJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18054a = JsonReader.C4932a.m10513a("extended_status", "fragment", "hints", "notes", "status", "tags", "term");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18055b = c4955q.m10565c(Integer.class, emptySet, "extendedStatus");
        this.f18056c = c4955q.m10565c(String.class, emptySet, "fragment");
        this.f18057d = c4955q.m10565c(C9312p.m17659d(List.class, RequestHintUpdate.class), emptySet, "hints");
        this.f18058e = c4955q.m10565c(Integer.TYPE, emptySet, "status");
        this.f18059f = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestDataCard mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<RequestHintUpdate> listMo9385a = null;
        String strMo9385a3 = null;
        Integer num = null;
        List<String> listMo9385a2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        Integer numMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18054a);
            String str = strMo9385a;
            AbstractC4949k<String> abstractC4949k = this.f18056c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18055b.mo9385a(jsonReader);
                    strMo9385a = str;
                    z10 = true;
                    continue;
                case 1:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a = str;
                    z11 = true;
                    continue;
                case 2:
                    listMo9385a = this.f18057d.mo9385a(jsonReader);
                    strMo9385a = str;
                    z12 = true;
                    continue;
                case 3:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    strMo9385a = str;
                    z13 = true;
                    continue;
                case 4:
                    Integer numMo9385a2 = this.f18058e.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("status", "status", jsonReader);
                    }
                    num = numMo9385a2;
                    break;
                    break;
                case 5:
                    listMo9385a2 = this.f18059f.mo9385a(jsonReader);
                    strMo9385a = str;
                    z14 = true;
                    continue;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    z15 = true;
                    continue;
            }
            strMo9385a = str;
        }
        String str2 = strMo9385a;
        jsonReader.mo10508q();
        RequestDataCard requestDataCard = new RequestDataCard();
        if (z10) {
            requestDataCard.f18050d = numMo9385a;
        }
        if (z11) {
            requestDataCard.f18048b = strMo9385a2;
        }
        if (z12) {
            requestDataCard.f18052f = listMo9385a;
        }
        if (z13) {
            requestDataCard.f18051e = strMo9385a3;
        }
        requestDataCard.f18049c = num != null ? num.intValue() : requestDataCard.f18049c;
        if (z14) {
            requestDataCard.f18053g = listMo9385a2;
        }
        if (z15) {
            requestDataCard.f18047a = str2;
        }
        return requestDataCard;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestDataCard requestDataCard) throws IOException {
        RequestDataCard requestDataCard2 = requestDataCard;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestDataCard2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("extended_status");
        this.f18055b.mo9386f(abstractC9310n, requestDataCard2.f18050d);
        abstractC9310n.mo10551C("fragment");
        String str = requestDataCard2.f18048b;
        AbstractC4949k<String> abstractC4949k = this.f18056c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("hints");
        this.f18057d.mo9386f(abstractC9310n, requestDataCard2.f18052f);
        abstractC9310n.mo10551C("notes");
        abstractC4949k.mo9386f(abstractC9310n, requestDataCard2.f18051e);
        abstractC9310n.mo10551C("status");
        this.f18058e.mo9386f(abstractC9310n, Integer.valueOf(requestDataCard2.f18049c));
        abstractC9310n.mo10551C("tags");
        this.f18059f.mo9386f(abstractC9310n, requestDataCard2.f18053g);
        abstractC9310n.mo10551C("term");
        abstractC4949k.mo9386f(abstractC9310n, requestDataCard2.f18047a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(RequestDataCard)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
