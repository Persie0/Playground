package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultStreakJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultStreak;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultStreakJsonAdapter extends AbstractC4949k<ResultStreak> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18966a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18967b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f18968c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18969d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<String> f18970e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultStreak> f18971f;

    public ResultStreakJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18966a = JsonReader.C4932a.m10513a("streakDays", "coins", "latestStreakDays", "isStreakBroken", "error");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18967b = c4955q.m10565c(cls, emptySet, "streakDays");
        this.f18968c = c4955q.m10565c(Double.TYPE, emptySet, "coins");
        this.f18969d = c4955q.m10565c(Boolean.TYPE, emptySet, "isStreakBroken");
        this.f18970e = c4955q.m10565c(String.class, emptySet, "error");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultStreak mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        Double dMo9385a = dValueOf;
        Integer numMo9385a2 = numMo9385a;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18966a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18967b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                dMo9385a = this.f18968c.mo9385a(jsonReader);
                if (dMo9385a == null) {
                    throw C9756b.m18254m("coins", "coins", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a2 = this.f18967b.mo9385a(jsonReader);
                if (numMo9385a2 == null) {
                    throw C9756b.m18254m("latestStreakDays", "latestStreakDays", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                boolMo9385a = this.f18969d.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isStreakBroken", "isStreakBroken", jsonReader);
                }
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                strMo9385a = this.f18970e.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -32) {
            return new ResultStreak(numMo9385a.intValue(), dMo9385a.doubleValue(), numMo9385a2.intValue(), boolMo9385a.booleanValue(), strMo9385a);
        }
        Constructor<ResultStreak> declaredConstructor = this.f18971f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultStreak.class.getDeclaredConstructor(cls, Double.TYPE, cls, Boolean.TYPE, String.class, cls, C9756b.f49813c);
            this.f18971f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultStreak::class.java…his.constructorRef = it }");
        }
        ResultStreak resultStreakNewInstance = declaredConstructor.newInstance(numMo9385a, dMo9385a, numMo9385a2, boolMo9385a, strMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultStreakNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultStreakNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultStreak resultStreak) throws IOException {
        ResultStreak resultStreak2 = resultStreak;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultStreak2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("streakDays");
        Integer numValueOf = Integer.valueOf(resultStreak2.f18961a);
        AbstractC4949k<Integer> abstractC4949k = this.f18967b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("coins");
        this.f18968c.mo9386f(abstractC9310n, Double.valueOf(resultStreak2.f18962b));
        abstractC9310n.mo10551C("latestStreakDays");
        C0166e.m775v(resultStreak2.f18963c, abstractC4949k, abstractC9310n, "isStreakBroken");
        this.f18969d.mo9386f(abstractC9310n, Boolean.valueOf(resultStreak2.f18964d));
        abstractC9310n.mo10551C("error");
        this.f18970e.mo9386f(abstractC9310n, resultStreak2.f18965e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(ResultStreak)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
