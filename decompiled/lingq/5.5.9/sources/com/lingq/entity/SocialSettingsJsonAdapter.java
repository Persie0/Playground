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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/SocialSettingsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/SocialSettings;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SocialSettingsJsonAdapter extends AbstractC4949k<SocialSettings> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17444a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<SocialSettingsNetwork> f17445b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<SocialSettingsType> f17446c;

    public SocialSettingsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17444a = JsonReader.C4932a.m10513a("twitter", "reward", "signup", "all");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17445b = c4955q.m10565c(SocialSettingsNetwork.class, emptySet, "twitter");
        this.f17446c = c4955q.m10565c(SocialSettingsType.class, emptySet, "reward");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SocialSettings mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        SocialSettingsNetwork socialSettingsNetworkMo9385a = null;
        SocialSettingsType socialSettingsTypeMo9385a = null;
        SocialSettingsType socialSettingsTypeMo9385a2 = null;
        SocialSettingsType socialSettingsTypeMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17444a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<SocialSettingsType> abstractC4949k = this.f17446c;
                if (iMo10512y0 == 1) {
                    socialSettingsTypeMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 2) {
                    socialSettingsTypeMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 3) {
                    socialSettingsTypeMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                }
            } else {
                socialSettingsNetworkMo9385a = this.f17445b.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        return new SocialSettings(socialSettingsNetworkMo9385a, socialSettingsTypeMo9385a, socialSettingsTypeMo9385a2, socialSettingsTypeMo9385a3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SocialSettings socialSettings) throws IOException {
        SocialSettings socialSettings2 = socialSettings;
        C5207g.m11111f(abstractC9310n, "writer");
        if (socialSettings2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("twitter");
        this.f17445b.mo9386f(abstractC9310n, socialSettings2.f17440a);
        abstractC9310n.mo10551C("reward");
        SocialSettingsType socialSettingsType = socialSettings2.f17441b;
        AbstractC4949k<SocialSettingsType> abstractC4949k = this.f17446c;
        abstractC4949k.mo9386f(abstractC9310n, socialSettingsType);
        abstractC9310n.mo10551C("signup");
        abstractC4949k.mo9386f(abstractC9310n, socialSettings2.f17442c);
        abstractC9310n.mo10551C("all");
        abstractC4949k.mo9386f(abstractC9310n, socialSettings2.f17443d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(SocialSettings)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
