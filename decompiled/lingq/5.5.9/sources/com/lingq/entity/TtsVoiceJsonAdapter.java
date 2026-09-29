package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/TtsVoiceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/TtsVoice;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TtsVoiceJsonAdapter extends AbstractC4949k<TtsVoice> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17571a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17572b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<TtsAppVoice>> f17573c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17574d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f17575e;

    public TtsVoiceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17571a = JsonReader.C4932a.m10513a("name", "title", "voicesByApp", "alternative", "priority");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17572b = c4955q.m10565c(String.class, emptySet, "name");
        this.f17573c = c4955q.m10565c(C9312p.m17659d(List.class, TtsAppVoice.class), emptySet, "voicesByApp");
        this.f17574d = c4955q.m10565c(Boolean.class, emptySet, "alternative");
        this.f17575e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "priority");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TtsVoice mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<TtsAppVoice> listMo9385a = null;
        Boolean boolMo9385a = null;
        List<String> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17571a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f17572b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                } else if (iMo10512y0 == 2) {
                    listMo9385a = this.f17573c.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("voicesByApp", "voicesByApp", jsonReader);
                    }
                } else if (iMo10512y0 == 3) {
                    boolMo9385a = this.f17574d.mo9385a(jsonReader);
                } else if (iMo10512y0 == 4 && (listMo9385a2 = this.f17575e.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("priority", "priority", jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        if (listMo9385a == null) {
            throw C9756b.m18248g("voicesByApp", "voicesByApp", jsonReader);
        }
        if (listMo9385a2 != null) {
            return new TtsVoice(strMo9385a, strMo9385a2, listMo9385a, boolMo9385a, listMo9385a2);
        }
        throw C9756b.m18248g("priority", "priority", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TtsVoice ttsVoice) throws IOException {
        TtsVoice ttsVoice2 = ttsVoice;
        C5207g.m11111f(abstractC9310n, "writer");
        if (ttsVoice2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("name");
        String str = ttsVoice2.f17566a;
        AbstractC4949k<String> abstractC4949k = this.f17572b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, ttsVoice2.f17567b);
        abstractC9310n.mo10551C("voicesByApp");
        this.f17573c.mo9386f(abstractC9310n, ttsVoice2.f17568c);
        abstractC9310n.mo10551C("alternative");
        this.f17574d.mo9386f(abstractC9310n, ttsVoice2.f17569d);
        abstractC9310n.mo10551C("priority");
        this.f17575e.mo9386f(abstractC9310n, ttsVoice2.f17570e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(TtsVoice)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
