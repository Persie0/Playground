package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestPlaylistLessonActionJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestPlaylistLessonAction;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestPlaylistLessonActionJsonAdapter extends AbstractC4949k<RequestPlaylistLessonAction> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18147a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18148b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18149c;

    public RequestPlaylistLessonActionJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18147a = JsonReader.C4932a.m10513a("action", "item", "pos");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18148b = c4955q.m10565c(String.class, emptySet, "action");
        this.f18149c = c4955q.m10565c(Integer.class, emptySet, "position");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestPlaylistLessonAction mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Integer numMo9385a = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18147a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f18148b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    z10 = true;
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    z11 = true;
                } else if (iMo10512y0 == 2) {
                    numMo9385a = this.f18149c.mo9385a(jsonReader);
                    z12 = true;
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        RequestPlaylistLessonAction requestPlaylistLessonAction = new RequestPlaylistLessonAction();
        if (z10) {
            requestPlaylistLessonAction.f18145b = strMo9385a;
        }
        if (z11) {
            requestPlaylistLessonAction.f18144a = strMo9385a2;
        }
        if (z12) {
            requestPlaylistLessonAction.f18146c = numMo9385a;
        }
        return requestPlaylistLessonAction;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestPlaylistLessonAction requestPlaylistLessonAction) throws IOException {
        RequestPlaylistLessonAction requestPlaylistLessonAction2 = requestPlaylistLessonAction;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestPlaylistLessonAction2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("action");
        String str = requestPlaylistLessonAction2.f18145b;
        AbstractC4949k<String> abstractC4949k = this.f18148b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("item");
        abstractC4949k.mo9386f(abstractC9310n, requestPlaylistLessonAction2.f18144a);
        abstractC9310n.mo10551C("pos");
        this.f18149c.mo9386f(abstractC9310n, requestPlaylistLessonAction2.f18146c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(49, "GeneratedJsonAdapter(RequestPlaylistLessonAction)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
