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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/SharedByUserAndQueryJoinJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/SharedByUserAndQueryJoin;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SharedByUserAndQueryJoinJsonAdapter extends AbstractC4949k<SharedByUserAndQueryJoin> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17418a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17419b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17420c;

    public SharedByUserAndQueryJoinJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17418a = JsonReader.C4932a.m10513a("language", "query", "userId");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17419b = c4955q.m10565c(String.class, emptySet, "language");
        this.f17420c = c4955q.m10565c(Integer.TYPE, emptySet, "userId");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SharedByUserAndQueryJoin mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17418a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f17419b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("query", "query", jsonReader);
                    }
                } else if (iMo10512y0 == 2 && (numMo9385a = this.f17420c.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("userId", "userId", jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("query", "query", jsonReader);
        }
        if (numMo9385a != null) {
            return new SharedByUserAndQueryJoin(strMo9385a, numMo9385a.intValue(), strMo9385a2);
        }
        throw C9756b.m18248g("userId", "userId", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SharedByUserAndQueryJoin sharedByUserAndQueryJoin) throws IOException {
        SharedByUserAndQueryJoin sharedByUserAndQueryJoin2 = sharedByUserAndQueryJoin;
        C5207g.m11111f(abstractC9310n, "writer");
        if (sharedByUserAndQueryJoin2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        String str = sharedByUserAndQueryJoin2.f17415a;
        AbstractC4949k<String> abstractC4949k = this.f17419b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("query");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUserAndQueryJoin2.f17416b);
        abstractC9310n.mo10551C("userId");
        this.f17420c.mo9386f(abstractC9310n, Integer.valueOf(sharedByUserAndQueryJoin2.f17417c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(46, "GeneratedJsonAdapter(SharedByUserAndQueryJoin)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
