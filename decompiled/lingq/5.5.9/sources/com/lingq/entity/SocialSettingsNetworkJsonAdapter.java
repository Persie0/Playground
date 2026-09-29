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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/SocialSettingsNetworkJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/SocialSettingsNetwork;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SocialSettingsNetworkJsonAdapter extends AbstractC4949k<SocialSettingsNetwork> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17450a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<SocialSettingsType> f17451b;

    public SocialSettingsNetworkJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17450a = JsonReader.C4932a.m10513a("reward", "signup", "all");
        this.f17451b = c4955q.m10565c(SocialSettingsType.class, EmptySet.f38034a, "reward");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SocialSettingsNetwork mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        SocialSettingsType socialSettingsTypeMo9385a = null;
        SocialSettingsType socialSettingsTypeMo9385a2 = null;
        SocialSettingsType socialSettingsTypeMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17450a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<SocialSettingsType> abstractC4949k = this.f17451b;
                if (iMo10512y0 == 0) {
                    socialSettingsTypeMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 1) {
                    socialSettingsTypeMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 2) {
                    socialSettingsTypeMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        return new SocialSettingsNetwork(socialSettingsTypeMo9385a, socialSettingsTypeMo9385a2, socialSettingsTypeMo9385a3);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SocialSettingsNetwork socialSettingsNetwork) throws IOException {
        SocialSettingsNetwork socialSettingsNetwork2 = socialSettingsNetwork;
        C5207g.m11111f(abstractC9310n, "writer");
        if (socialSettingsNetwork2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("reward");
        SocialSettingsType socialSettingsType = socialSettingsNetwork2.f17447a;
        AbstractC4949k<SocialSettingsType> abstractC4949k = this.f17451b;
        abstractC4949k.mo9386f(abstractC9310n, socialSettingsType);
        abstractC9310n.mo10551C("signup");
        abstractC4949k.mo9386f(abstractC9310n, socialSettingsNetwork2.f17448b);
        abstractC9310n.mo10551C("all");
        abstractC4949k.mo9386f(abstractC9310n, socialSettingsNetwork2.f17449c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(SocialSettingsNetwork)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
