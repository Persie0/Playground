package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultNotificationsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultNotifications;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultNotificationsJsonAdapter extends AbstractC4949k<ResultNotifications> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18815a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18816b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18817c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18818d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<ResultNotification>> f18819e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultNotifications> f18820f;

    public ResultNotificationsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18815a = JsonReader.C4932a.m10513a("count", "next", "previous", "new_notifications", "results");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18816b = c4955q.m10565c(cls, emptySet, "count");
        this.f18817c = c4955q.m10565c(String.class, emptySet, "next");
        this.f18818d = c4955q.m10565c(Integer.class, emptySet, "unreadNotifications");
        this.f18819e = c4955q.m10565c(C9312p.m17659d(List.class, ResultNotification.class), emptySet, "results");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultNotifications mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = null;
        List<ResultNotification> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18815a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f18816b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("count", "count", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f18817c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f18817c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 3) {
                numMo9385a = this.f18818d.mo9385a(jsonReader);
            } else if (iMo10512y0 == 4) {
                listMo9385a = this.f18819e.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -18) {
            return new ResultNotifications(numM850i.intValue(), strMo9385a, strMo9385a2, numMo9385a, listMo9385a);
        }
        Constructor<ResultNotifications> declaredConstructor = this.f18820f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultNotifications.class.getDeclaredConstructor(cls, String.class, String.class, Integer.class, List.class, cls, C9756b.f49813c);
            this.f18820f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultNotifications::cla…his.constructorRef = it }");
        }
        ResultNotifications resultNotificationsNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, strMo9385a2, numMo9385a, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultNotificationsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultNotificationsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultNotifications resultNotifications) throws IOException {
        ResultNotifications resultNotifications2 = resultNotifications;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultNotifications2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("count");
        this.f18816b.mo9386f(abstractC9310n, Integer.valueOf(resultNotifications2.f18810a));
        abstractC9310n.mo10551C("next");
        String str = resultNotifications2.f18811b;
        AbstractC4949k<String> abstractC4949k = this.f18817c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("previous");
        abstractC4949k.mo9386f(abstractC9310n, resultNotifications2.f18812c);
        abstractC9310n.mo10551C("new_notifications");
        this.f18818d.mo9386f(abstractC9310n, resultNotifications2.f18813d);
        abstractC9310n.mo10551C("results");
        this.f18819e.mo9386f(abstractC9310n, resultNotifications2.f18814e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(ResultNotifications)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
