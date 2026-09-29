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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/NoticeJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Notice;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NoticeJsonAdapter extends AbstractC4949k<Notice> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17330a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17331b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17332c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17333d;

    public NoticeJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17330a = JsonReader.C4932a.m10513a("id", "language", "title", "startDate", "endDate", "noticeType", "isShown");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17331b = c4955q.m10565c(cls, emptySet, "id");
        this.f17332c = c4955q.m10565c(String.class, emptySet, "language");
        this.f17333d = c4955q.m10565c(Boolean.TYPE, emptySet, "isShown");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Notice mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Boolean boolMo9385a = null;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (true) {
            Boolean bool = boolMo9385a;
            if (!jsonReader.mo10511w()) {
                String str = strMo9385a5;
                jsonReader.mo10508q();
                if (numMo9385a == null) {
                    throw C9756b.m18248g("id", "id", jsonReader);
                }
                int iIntValue = numMo9385a.intValue();
                if (strMo9385a == null) {
                    throw C9756b.m18248g("language", "language", jsonReader);
                }
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("title", "title", jsonReader);
                }
                if (strMo9385a3 == null) {
                    throw C9756b.m18248g("startDate", "startDate", jsonReader);
                }
                if (strMo9385a4 == null) {
                    throw C9756b.m18248g("endDate", "endDate", jsonReader);
                }
                if (str == null) {
                    throw C9756b.m18248g("noticeType", "noticeType", jsonReader);
                }
                if (bool != null) {
                    return new Notice(iIntValue, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, str, bool.booleanValue());
                }
                throw C9756b.m18248g("isShown", "isShown", jsonReader);
            }
            int iMo10512y0 = jsonReader.mo10512y0(this.f17330a);
            String str2 = strMo9385a5;
            AbstractC4949k<String> abstractC4949k = this.f17332c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17331b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case 1:
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case 2:
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case 3:
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("startDate", "startDate", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case 4:
                    strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("endDate", "endDate", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
                case 5:
                    strMo9385a5 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("noticeType", "noticeType", jsonReader);
                    }
                    boolMo9385a = bool;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a = this.f17333d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isShown", "isShown", jsonReader);
                    }
                    strMo9385a5 = str2;
                    break;
                default:
                    boolMo9385a = bool;
                    strMo9385a5 = str2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Notice notice) throws IOException {
        Notice notice2 = notice;
        C5207g.m11111f(abstractC9310n, "writer");
        if (notice2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f17331b.mo9386f(abstractC9310n, Integer.valueOf(notice2.f17323a));
        abstractC9310n.mo10551C("language");
        String str = notice2.f17324b;
        AbstractC4949k<String> abstractC4949k = this.f17332c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, notice2.f17325c);
        abstractC9310n.mo10551C("startDate");
        abstractC4949k.mo9386f(abstractC9310n, notice2.f17326d);
        abstractC9310n.mo10551C("endDate");
        abstractC4949k.mo9386f(abstractC9310n, notice2.f17327e);
        abstractC9310n.mo10551C("noticeType");
        abstractC4949k.mo9386f(abstractC9310n, notice2.f17328f);
        abstractC9310n.mo10551C("isShown");
        this.f17333d.mo9386f(abstractC9310n, Boolean.valueOf(notice2.f17329g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(28, "GeneratedJsonAdapter(Notice)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
