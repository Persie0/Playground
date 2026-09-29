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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/TabJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Tab;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TabJsonAdapter extends AbstractC4949k<Tab> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17499a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17500b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17501c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17502d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17503e;

    public TabJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17499a = JsonReader.C4932a.m10513a("preview", "apiUrl", "display", "title", "selected", "level");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17500b = c4955q.m10565c(String.class, emptySet, "preview");
        this.f17501c = c4955q.m10565c(String.class, emptySet, "apiUrl");
        this.f17502d = c4955q.m10565c(Boolean.class, emptySet, "selected");
        this.f17503e = c4955q.m10565c(Integer.class, emptySet, "level");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Tab mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Boolean boolMo9385a = null;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17499a);
            AbstractC4949k<String> abstractC4949k = this.f17501c;
            AbstractC4949k<String> abstractC4949k2 = this.f17500b;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = abstractC4949k2.mo9385a(jsonReader);
                    break;
                case 1:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("apiUrl", "apiUrl", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("display", "display", jsonReader);
                    }
                    break;
                    break;
                case 3:
                    strMo9385a4 = abstractC4949k2.mo9385a(jsonReader);
                    break;
                case 4:
                    boolMo9385a = this.f17502d.mo9385a(jsonReader);
                    break;
                case 5:
                    numMo9385a = this.f17503e.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("apiUrl", "apiUrl", jsonReader);
        }
        if (strMo9385a3 != null) {
            return new Tab(boolMo9385a, numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4);
        }
        throw C9756b.m18248g("display", "display", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Tab tab) throws IOException {
        Tab tab2 = tab;
        C5207g.m11111f(abstractC9310n, "writer");
        if (tab2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("preview");
        String str = tab2.f17493a;
        AbstractC4949k<String> abstractC4949k = this.f17500b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("apiUrl");
        String str2 = tab2.f17494b;
        AbstractC4949k<String> abstractC4949k2 = this.f17501c;
        abstractC4949k2.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("display");
        abstractC4949k2.mo9386f(abstractC9310n, tab2.f17495c);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, tab2.f17496d);
        abstractC9310n.mo10551C("selected");
        this.f17502d.mo9386f(abstractC9310n, tab2.f17497e);
        abstractC9310n.mo10551C("level");
        this.f17503e.mo9386f(abstractC9310n, tab2.f17498f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(25, "GeneratedJsonAdapter(Tab)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
