package com.lingq.shared.uimodel.challenge;

import android.support.v4.media.C0141b;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetailJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeDetailJsonAdapter extends AbstractC4949k<ChallengeDetail> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21646a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21647b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21648c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f21649d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f21650e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<ChallengeSocialSettings> f21651f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<ChallengeDetail> f21652g;

    public ChallengeDetailJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21646a = JsonReader.C4932a.m10513a("pk", "code", "title", "description", "startDate", "endDate", "challengeType", "participantsCount", "isPast", "badgeUrl", "isJoined", "rank", "socialSettings");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21647b = c4955q.m10565c(cls, emptySet, "pk");
        this.f21648c = c4955q.m10565c(String.class, emptySet, "code");
        this.f21649d = c4955q.m10565c(String.class, emptySet, "startDate");
        this.f21650e = c4955q.m10565c(Boolean.TYPE, emptySet, "isPast");
        this.f21651f = c4955q.m10565c(ChallengeSocialSettings.class, emptySet, "socialSettings");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeDetail mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        ChallengeSocialSettings challengeSocialSettingsMo9385a = null;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21646a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f21647b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f21648c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a3 = this.f21648c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strMo9385a4 = this.f21648c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("description", "description", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    strMo9385a6 = this.f21649d.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    strMo9385a7 = this.f21649d.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a = this.f21648c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("challengeType", "challengeType", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f21647b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("participantsCount", "participantsCount", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    boolMo9385a = this.f21650e.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPast", "isPast", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    strMo9385a5 = this.f21648c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("badgeUrl", "badgeUrl", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    boolMo9385a2 = this.f21650e.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isJoined", "isJoined", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    numMo9385a3 = this.f21647b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("rank", "rank", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    challengeSocialSettingsMo9385a = this.f21651f.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4096) {
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a4, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numMo9385a2.intValue();
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a5, "null cannot be cast to non-null type kotlin.String");
            return new ChallengeDetail(iIntValue, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a6, strMo9385a7, strMo9385a, iIntValue2, zBooleanValue, strMo9385a5, boolMo9385a2.booleanValue(), numMo9385a3.intValue(), challengeSocialSettingsMo9385a);
        }
        String str = strMo9385a;
        String str2 = strMo9385a5;
        Constructor<ChallengeDetail> declaredConstructor = this.f21652g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = ChallengeDetail.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls2, String.class, cls2, cls, ChallengeSocialSettings.class, cls, C9756b.f49813c);
            this.f21652g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeDetail::class.j…his.constructorRef = it }");
        }
        ChallengeDetail challengeDetailNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a6, strMo9385a7, str, numMo9385a2, boolMo9385a, str2, boolMo9385a2, numMo9385a3, challengeSocialSettingsMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeDetailNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeDetailNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeDetail challengeDetail) throws IOException {
        ChallengeDetail challengeDetail2 = challengeDetail;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeDetail2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(challengeDetail2.f21633a);
        AbstractC4949k<Integer> abstractC4949k = this.f21647b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("code");
        String str = challengeDetail2.f21634b;
        AbstractC4949k<String> abstractC4949k2 = this.f21648c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k2.mo9386f(abstractC9310n, challengeDetail2.f21635c);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, challengeDetail2.f21636d);
        abstractC9310n.mo10551C("startDate");
        String str2 = challengeDetail2.f21637e;
        AbstractC4949k<String> abstractC4949k3 = this.f21649d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("endDate");
        abstractC4949k3.mo9386f(abstractC9310n, challengeDetail2.f21638f);
        abstractC9310n.mo10551C("challengeType");
        abstractC4949k2.mo9386f(abstractC9310n, challengeDetail2.f21639g);
        abstractC9310n.mo10551C("participantsCount");
        C0166e.m775v(challengeDetail2.f21640h, abstractC4949k, abstractC9310n, "isPast");
        Boolean boolValueOf = Boolean.valueOf(challengeDetail2.f21641i);
        AbstractC4949k<Boolean> abstractC4949k4 = this.f21650e;
        abstractC4949k4.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("badgeUrl");
        abstractC4949k2.mo9386f(abstractC9310n, challengeDetail2.f21642j);
        abstractC9310n.mo10551C("isJoined");
        C0141b.m623s(challengeDetail2.f21643k, abstractC4949k4, abstractC9310n, "rank");
        C0166e.m775v(challengeDetail2.f21644l, abstractC4949k, abstractC9310n, "socialSettings");
        this.f21651f.mo9386f(abstractC9310n, challengeDetail2.f21645m);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(ChallengeDetail)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
