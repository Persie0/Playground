package com.lingq.shared.uimodel.challenge;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeSocialSettingsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/challenge/ChallengeSocialSettings;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeSocialSettingsJsonAdapter extends AbstractC4949k<ChallengeSocialSettings> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21655a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<ChallengeSocialSettingsNetwork> f21656b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<ChallengeSocialSettingsType> f21657c;

    public ChallengeSocialSettingsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21655a = JsonReader.C4932a.m10513a("twitter", "signup");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21656b = c4955q.m10565c(ChallengeSocialSettingsNetwork.class, emptySet, "twitter");
        this.f21657c = c4955q.m10565c(ChallengeSocialSettingsType.class, emptySet, "signup");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeSocialSettings mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        ChallengeSocialSettingsNetwork challengeSocialSettingsNetworkMo9385a = null;
        ChallengeSocialSettingsType challengeSocialSettingsTypeMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21655a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                challengeSocialSettingsNetworkMo9385a = this.f21656b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                challengeSocialSettingsTypeMo9385a = this.f21657c.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        return new ChallengeSocialSettings(challengeSocialSettingsNetworkMo9385a, challengeSocialSettingsTypeMo9385a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeSocialSettings challengeSocialSettings) throws IOException {
        ChallengeSocialSettings challengeSocialSettings2 = challengeSocialSettings;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeSocialSettings2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("twitter");
        this.f21656b.mo9386f(abstractC9310n, challengeSocialSettings2.f21653a);
        abstractC9310n.mo10551C("signup");
        this.f21657c.mo9386f(abstractC9310n, challengeSocialSettings2.f21654b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(45, "GeneratedJsonAdapter(ChallengeSocialSettings)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
