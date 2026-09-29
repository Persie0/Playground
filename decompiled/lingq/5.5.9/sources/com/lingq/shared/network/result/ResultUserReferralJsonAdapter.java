package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultUserReferralJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultUserReferral;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultUserReferralJsonAdapter extends AbstractC4949k<ResultUserReferral> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19043a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f19044b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Object> f19045c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f19046d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f19047e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<ReferralUser> f19048f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<ResultUserReferral> f19049g;

    public ResultUserReferralJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19043a = JsonReader.C4932a.m10513a("dateJoined", "email", "emailDate", "hasUpgraded", "lingqsEarned", "pk", "pointsEarned", "tierCategory", "tierLevel", "url", "user", "username");
        EmptySet emptySet = EmptySet.f38034a;
        this.f19044b = c4955q.m10565c(String.class, emptySet, "dateJoined");
        this.f19045c = c4955q.m10565c(Object.class, emptySet, "emailDate");
        this.f19046d = c4955q.m10565c(Boolean.class, emptySet, "hasUpgraded");
        this.f19047e = c4955q.m10565c(Integer.class, emptySet, "lingqsEarned");
        this.f19048f = c4955q.m10565c(ReferralUser.class, emptySet, "user");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultUserReferral mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Object objMo9385a = null;
        Boolean boolMo9385a = null;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        Object objMo9385a2 = null;
        String strMo9385a3 = null;
        Integer numMo9385a3 = null;
        String strMo9385a4 = null;
        ReferralUser referralUserMo9385a = null;
        String strMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f19043a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f19044b.mo9385a(jsonReader);
                    i10 &= -2;
                    break;
                case 1:
                    strMo9385a2 = this.f19044b.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    objMo9385a = this.f19045c.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    boolMo9385a = this.f19046d.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    numMo9385a = this.f19047e.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    numMo9385a2 = this.f19047e.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objMo9385a2 = this.f19045c.mo9385a(jsonReader);
                    i10 &= -65;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a3 = this.f19044b.mo9385a(jsonReader);
                    i10 &= -129;
                    break;
                case 8:
                    numMo9385a3 = this.f19047e.mo9385a(jsonReader);
                    i10 &= -257;
                    break;
                case 9:
                    strMo9385a4 = this.f19044b.mo9385a(jsonReader);
                    i10 &= -513;
                    break;
                case 10:
                    referralUserMo9385a = this.f19048f.mo9385a(jsonReader);
                    i10 &= -1025;
                    break;
                case 11:
                    strMo9385a5 = this.f19044b.mo9385a(jsonReader);
                    i10 &= -2049;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4096) {
            return new ResultUserReferral(strMo9385a, strMo9385a2, objMo9385a, boolMo9385a, numMo9385a, numMo9385a2, objMo9385a2, strMo9385a3, numMo9385a3, strMo9385a4, referralUserMo9385a, strMo9385a5);
        }
        Constructor<ResultUserReferral> declaredConstructor = this.f19049g;
        if (declaredConstructor == null) {
            declaredConstructor = ResultUserReferral.class.getDeclaredConstructor(String.class, String.class, Object.class, Boolean.class, Integer.class, Integer.class, Object.class, String.class, Integer.class, String.class, ReferralUser.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f19049g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultUserReferral::clas…his.constructorRef = it }");
        }
        ResultUserReferral resultUserReferralNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, objMo9385a, boolMo9385a, numMo9385a, numMo9385a2, objMo9385a2, strMo9385a3, numMo9385a3, strMo9385a4, referralUserMo9385a, strMo9385a5, Integer.valueOf(i10), null);
        C5207g.m11110e(resultUserReferralNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultUserReferralNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultUserReferral resultUserReferral) throws IOException {
        ResultUserReferral resultUserReferral2 = resultUserReferral;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultUserReferral2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("dateJoined");
        String str = resultUserReferral2.f19031a;
        AbstractC4949k<String> abstractC4949k = this.f19044b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("email");
        abstractC4949k.mo9386f(abstractC9310n, resultUserReferral2.f19032b);
        abstractC9310n.mo10551C("emailDate");
        Object obj = resultUserReferral2.f19033c;
        AbstractC4949k<Object> abstractC4949k2 = this.f19045c;
        abstractC4949k2.mo9386f(abstractC9310n, obj);
        abstractC9310n.mo10551C("hasUpgraded");
        this.f19046d.mo9386f(abstractC9310n, resultUserReferral2.f19034d);
        abstractC9310n.mo10551C("lingqsEarned");
        Integer num = resultUserReferral2.f19035e;
        AbstractC4949k<Integer> abstractC4949k3 = this.f19047e;
        abstractC4949k3.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("pk");
        abstractC4949k3.mo9386f(abstractC9310n, resultUserReferral2.f19036f);
        abstractC9310n.mo10551C("pointsEarned");
        abstractC4949k2.mo9386f(abstractC9310n, resultUserReferral2.f19037g);
        abstractC9310n.mo10551C("tierCategory");
        abstractC4949k.mo9386f(abstractC9310n, resultUserReferral2.f19038h);
        abstractC9310n.mo10551C("tierLevel");
        abstractC4949k3.mo9386f(abstractC9310n, resultUserReferral2.f19039i);
        abstractC9310n.mo10551C("url");
        abstractC4949k.mo9386f(abstractC9310n, resultUserReferral2.f19040j);
        abstractC9310n.mo10551C("user");
        this.f19048f.mo9386f(abstractC9310n, resultUserReferral2.f19041k);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, resultUserReferral2.f19042l);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ResultUserReferral)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
