package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestNotificationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestNotification;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestNotificationJsonAdapter extends AbstractC4949k<RequestNotification> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18138a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<Integer>> f18139b;

    public RequestNotificationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18138a = JsonReader.C4932a.m10513a("events");
        this.f18139b = c4955q.m10565c(C9312p.m17659d(List.class, Integer.class), EmptySet.f38034a, "notificationIds");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestNotification mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<Integer> listMo9385a = null;
        boolean z10 = false;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18138a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f18139b.mo9385a(jsonReader);
                z10 = true;
            }
        }
        jsonReader.mo10508q();
        RequestNotification requestNotification = new RequestNotification();
        if (z10) {
            requestNotification.f18137a = listMo9385a;
        }
        return requestNotification;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestNotification requestNotification) throws IOException {
        RequestNotification requestNotification2 = requestNotification;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestNotification2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("events");
        this.f18139b.mo9386f(abstractC9310n, requestNotification2.f18137a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(RequestNotification)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
