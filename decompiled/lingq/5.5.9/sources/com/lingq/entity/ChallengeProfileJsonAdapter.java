package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ChallengeProfileJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/ChallengeProfile;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeProfileJsonAdapter extends AbstractC4949k<ChallengeProfile> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16913a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f16914b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f16915c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f16916d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ChallengeProfile> f16917e;

    public ChallengeProfileJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16913a = JsonReader.C4932a.m10513a("id", "username", "description", "blog_url", "activity_index", "deleted", "photo", "role");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f16914b = c4955q.m10565c(cls, emptySet, "id");
        this.f16915c = c4955q.m10565c(String.class, emptySet, "username");
        this.f16916d = c4955q.m10565c(Boolean.TYPE, emptySet, "deleted");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeProfile mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        Boolean boolMo9385a = bool;
        Integer numMo9385a2 = numMo9385a;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f16913a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f16914b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f16915c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = this.f16915c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = this.f16915c.mo9385a(jsonReader);
                    break;
                case 4:
                    numMo9385a2 = this.f16914b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("activityIndex", "activity_index", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a = this.f16916d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("deleted", "deleted", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a4 = this.f16915c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a5 = this.f16915c.mo9385a(jsonReader);
                    i10 &= -129;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -178) {
            return new ChallengeProfile(numMo9385a.intValue(), strMo9385a, strMo9385a2, strMo9385a3, numMo9385a2.intValue(), boolMo9385a.booleanValue(), strMo9385a4, strMo9385a5);
        }
        Constructor<ChallengeProfile> declaredConstructor = this.f16917e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ChallengeProfile.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, Boolean.TYPE, String.class, String.class, cls, C9756b.f49813c);
            this.f16917e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeProfile::class.…his.constructorRef = it }");
        }
        ChallengeProfile challengeProfileNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, numMo9385a2, boolMo9385a, strMo9385a4, strMo9385a5, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeProfileNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeProfileNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeProfile challengeProfile) throws IOException {
        ChallengeProfile challengeProfile2 = challengeProfile;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeProfile2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(challengeProfile2.f16905a);
        AbstractC4949k<Integer> abstractC4949k = this.f16914b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("username");
        String str = challengeProfile2.f16906b;
        AbstractC4949k<String> abstractC4949k2 = this.f16915c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, challengeProfile2.f16907c);
        abstractC9310n.mo10551C("blog_url");
        abstractC4949k2.mo9386f(abstractC9310n, challengeProfile2.f16908d);
        abstractC9310n.mo10551C("activity_index");
        C0166e.m775v(challengeProfile2.f16909e, abstractC4949k, abstractC9310n, "deleted");
        this.f16916d.mo9386f(abstractC9310n, Boolean.valueOf(challengeProfile2.f16910f));
        abstractC9310n.mo10551C("photo");
        abstractC4949k2.mo9386f(abstractC9310n, challengeProfile2.f16911g);
        abstractC9310n.mo10551C("role");
        abstractC4949k2.mo9386f(abstractC9310n, challengeProfile2.f16912h);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ChallengeProfile)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
