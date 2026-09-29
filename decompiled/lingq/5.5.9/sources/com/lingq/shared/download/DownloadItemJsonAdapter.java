package com.lingq.shared.download;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/download/DownloadItemJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/download/DownloadItem;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DownloadItemJsonAdapter extends AbstractC4949k<DownloadItem> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17869a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17870b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17871c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17872d;

    public DownloadItemJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17869a = JsonReader.C4932a.m10513a("language", "lessonId", "audioUrl", "isDownloaded");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17870b = c4955q.m10565c(String.class, emptySet, "language");
        this.f17871c = c4955q.m10565c(Integer.TYPE, emptySet, "lessonId");
        this.f17872d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDownloaded");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final DownloadItem mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Integer numMo9385a = null;
        String strMo9385a2 = null;
        Boolean boolMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17869a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f17870b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    numMo9385a = this.f17871c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("lessonId", "lessonId", jsonReader);
                    }
                } else if (iMo10512y0 == 2) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("audioUrl", "audioUrl", jsonReader);
                    }
                } else if (iMo10512y0 == 3 && (boolMo9385a = this.f17872d.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("isDownloaded", "isDownloaded", jsonReader);
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
        if (numMo9385a == null) {
            throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("audioUrl", "audioUrl", jsonReader);
        }
        if (boolMo9385a != null) {
            return new DownloadItem(strMo9385a, iIntValue, strMo9385a2, boolMo9385a.booleanValue());
        }
        throw C9756b.m18248g("isDownloaded", "isDownloaded", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, DownloadItem downloadItem) throws IOException {
        DownloadItem downloadItem2 = downloadItem;
        C5207g.m11111f(abstractC9310n, "writer");
        if (downloadItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        String str = downloadItem2.f17865a;
        AbstractC4949k<String> abstractC4949k = this.f17870b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("lessonId");
        this.f17871c.mo9386f(abstractC9310n, Integer.valueOf(downloadItem2.f17866b));
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k.mo9386f(abstractC9310n, downloadItem2.f17867c);
        abstractC9310n.mo10551C("isDownloaded");
        this.f17872d.mo9386f(abstractC9310n, Boolean.valueOf(downloadItem2.f17868d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(DownloadItem)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
