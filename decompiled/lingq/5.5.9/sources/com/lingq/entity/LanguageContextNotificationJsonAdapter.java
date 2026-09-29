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
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageContextNotificationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LanguageContextNotification;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageContextNotificationJsonAdapter extends AbstractC4949k<LanguageContextNotification> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17023a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17024b;

    public LanguageContextNotificationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17023a = JsonReader.C4932a.m10513a("lotd", "weekly");
        this.f17024b = c4955q.m10565c(String.class, EmptySet.f38034a, "lotd");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageContextNotification mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17023a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f17024b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        return new LanguageContextNotification(strMo9385a, strMo9385a2);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageContextNotification languageContextNotification) throws IOException {
        LanguageContextNotification languageContextNotification2 = languageContextNotification;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageContextNotification2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("lotd");
        String str = languageContextNotification2.f17021a;
        AbstractC4949k<String> abstractC4949k = this.f17024b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("weekly");
        abstractC4949k.mo9386f(abstractC9310n, languageContextNotification2.f17022b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(49, "GeneratedJsonAdapter(LanguageContextNotification)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
