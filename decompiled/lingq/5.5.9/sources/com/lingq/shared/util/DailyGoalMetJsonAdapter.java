package com.lingq.shared.util;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/util/DailyGoalMetJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/util/DailyGoalMet;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DailyGoalMetJsonAdapter extends AbstractC4949k<DailyGoalMet> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22153a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f22154b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f22155c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f22156d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<DailyGoalMet> f22157e;

    public DailyGoalMetJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22153a = JsonReader.C4932a.m10513a("date", "met", "goal", "activityId", "isDouble", "slug", "streak");
        EmptySet emptySet = EmptySet.f38034a;
        this.f22154b = c4955q.m10565c(String.class, emptySet, "date");
        this.f22155c = c4955q.m10565c(Integer.TYPE, emptySet, "met");
        this.f22156d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDouble");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final DailyGoalMet mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        Boolean boolMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a3 = null;
        while (true) {
            Integer num = numM850i;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i10 == -65) {
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("date", "date", jsonReader);
                    }
                    if (numMo9385a == null) {
                        throw C9756b.m18248g("met", "met", jsonReader);
                    }
                    int iIntValue = numMo9385a.intValue();
                    if (numMo9385a3 == null) {
                        throw C9756b.m18248g("goal", "goal", jsonReader);
                    }
                    int iIntValue2 = numMo9385a3.intValue();
                    if (numMo9385a2 == null) {
                        throw C9756b.m18248g("activityId", "activityId", jsonReader);
                    }
                    int iIntValue3 = numMo9385a2.intValue();
                    if (boolMo9385a == null) {
                        throw C9756b.m18248g("isDouble", "isDouble", jsonReader);
                    }
                    boolean zBooleanValue = boolMo9385a.booleanValue();
                    if (strMo9385a != null) {
                        return new DailyGoalMet(strMo9385a2, iIntValue, iIntValue2, iIntValue3, zBooleanValue, strMo9385a, num.intValue());
                    }
                    throw C9756b.m18248g("slug", "slug", jsonReader);
                }
                Constructor<DailyGoalMet> declaredConstructor = this.f22157e;
                int i11 = 9;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = DailyGoalMet.class.getDeclaredConstructor(String.class, cls, cls, cls, Boolean.TYPE, String.class, cls, cls, C9756b.f49813c);
                    this.f22157e = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "DailyGoalMet::class.java…his.constructorRef = it }");
                    i11 = 9;
                }
                Object[] objArr = new Object[i11];
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("date", "date", jsonReader);
                }
                objArr[0] = strMo9385a2;
                if (numMo9385a == null) {
                    throw C9756b.m18248g("met", "met", jsonReader);
                }
                objArr[1] = Integer.valueOf(numMo9385a.intValue());
                if (numMo9385a3 == null) {
                    throw C9756b.m18248g("goal", "goal", jsonReader);
                }
                objArr[2] = Integer.valueOf(numMo9385a3.intValue());
                if (numMo9385a2 == null) {
                    throw C9756b.m18248g("activityId", "activityId", jsonReader);
                }
                objArr[3] = Integer.valueOf(numMo9385a2.intValue());
                if (boolMo9385a == null) {
                    throw C9756b.m18248g("isDouble", "isDouble", jsonReader);
                }
                objArr[4] = Boolean.valueOf(boolMo9385a.booleanValue());
                if (strMo9385a == null) {
                    throw C9756b.m18248g("slug", "slug", jsonReader);
                }
                objArr[5] = strMo9385a;
                objArr[6] = num;
                objArr[7] = Integer.valueOf(i10);
                objArr[8] = null;
                DailyGoalMet dailyGoalMetNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(dailyGoalMetNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return dailyGoalMetNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f22153a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a2 = this.f22154b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("date", "date", jsonReader);
                    }
                    break;
                case 1:
                    numMo9385a = this.f22155c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("met", "met", jsonReader);
                    }
                    break;
                case 2:
                    numMo9385a3 = this.f22155c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("goal", "goal", jsonReader);
                    }
                    break;
                case 3:
                    numMo9385a2 = this.f22155c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("activityId", "activityId", jsonReader);
                    }
                    break;
                case 4:
                    boolMo9385a = this.f22156d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isDouble", "isDouble", jsonReader);
                    }
                    break;
                case 5:
                    strMo9385a = this.f22154b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("slug", "slug", jsonReader);
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numM850i = this.f22155c.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("streak", "streak", jsonReader);
                    }
                    i10 &= -65;
                    continue;
                    break;
            }
            numM850i = num;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, DailyGoalMet dailyGoalMet) throws IOException {
        DailyGoalMet dailyGoalMet2 = dailyGoalMet;
        C5207g.m11111f(abstractC9310n, "writer");
        if (dailyGoalMet2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("date");
        String str = dailyGoalMet2.f22146a;
        AbstractC4949k<String> abstractC4949k = this.f22154b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("met");
        Integer numValueOf = Integer.valueOf(dailyGoalMet2.f22147b);
        AbstractC4949k<Integer> abstractC4949k2 = this.f22155c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("goal");
        C0166e.m775v(dailyGoalMet2.f22148c, abstractC4949k2, abstractC9310n, "activityId");
        C0166e.m775v(dailyGoalMet2.f22149d, abstractC4949k2, abstractC9310n, "isDouble");
        this.f22156d.mo9386f(abstractC9310n, Boolean.valueOf(dailyGoalMet2.f22150e));
        abstractC9310n.mo10551C("slug");
        abstractC4949k.mo9386f(abstractC9310n, dailyGoalMet2.f22151f);
        abstractC9310n.mo10551C("streak");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(dailyGoalMet2.f22152g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(DailyGoalMet)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
