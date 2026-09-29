package com.lingq.shared.uimodel.challenge;

import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeUserProfileJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/challenge/ChallengeUserProfile;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeUserProfileJsonAdapter extends AbstractC4949k<ChallengeUserProfile> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21668a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21669b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21670c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f21671d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ChallengeUserProfile> f21672e;

    public ChallengeUserProfileJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21668a = JsonReader.C4932a.m10513a("id", "username", "photo", "role");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21669b = c4955q.m10565c(cls, emptySet, "id");
        this.f21670c = c4955q.m10565c(String.class, emptySet, "username");
        this.f21671d = c4955q.m10565c(String.class, emptySet, "role");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeUserProfile mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21668a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f21669b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f21670c.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("username", "username", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f21670c.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("photo", "photo", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                strMo9385a3 = this.f21671d.mo9385a(jsonReader);
                i10 &= -9;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -16) {
            int iIntValue = numM850i.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new ChallengeUserProfile(strMo9385a, iIntValue, strMo9385a2, strMo9385a3);
        }
        Constructor<ChallengeUserProfile> declaredConstructor = this.f21672e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ChallengeUserProfile.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f21672e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeUserProfile::cl…his.constructorRef = it }");
        }
        ChallengeUserProfile challengeUserProfileNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, strMo9385a2, strMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeUserProfileNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeUserProfileNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeUserProfile challengeUserProfile) throws IOException {
        ChallengeUserProfile challengeUserProfile2 = challengeUserProfile;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeUserProfile2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f21669b.mo9386f(abstractC9310n, Integer.valueOf(challengeUserProfile2.f21664a));
        abstractC9310n.mo10551C("username");
        String str = challengeUserProfile2.f21665b;
        AbstractC4949k<String> abstractC4949k = this.f21670c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("photo");
        abstractC4949k.mo9386f(abstractC9310n, challengeUserProfile2.f21666c);
        abstractC9310n.mo10551C("role");
        this.f21671d.mo9386f(abstractC9310n, challengeUserProfile2.f21667d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ChallengeUserProfile)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
