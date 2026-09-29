package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ActivityLevelJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/ActivityLevel;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ActivityLevelJsonAdapter extends AbstractC4949k<ActivityLevel> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16851a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f16852b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ActivityLevel> f16853c;

    public ActivityLevelJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16851a = JsonReader.C4932a.m10513a("id", "score");
        this.f16852b = c4955q.m10565c(Integer.TYPE, EmptySet.f38034a, "id");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ActivityLevel mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = numM850i;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f16851a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f16852b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                numMo9385a = this.f16852b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("score", "score", jsonReader);
                }
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new ActivityLevel(numM850i.intValue(), numMo9385a.intValue());
        }
        Constructor<ActivityLevel> declaredConstructor = this.f16853c;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ActivityLevel.class.getDeclaredConstructor(cls, cls, cls, C9756b.f49813c);
            this.f16853c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ActivityLevel::class.jav…his.constructorRef = it }");
        }
        ActivityLevel activityLevelNewInstance = declaredConstructor.newInstance(numM850i, numMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(activityLevelNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return activityLevelNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ActivityLevel activityLevel) throws IOException {
        ActivityLevel activityLevel2 = activityLevel;
        C5207g.m11111f(abstractC9310n, "writer");
        if (activityLevel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(activityLevel2.f16849a);
        AbstractC4949k<Integer> abstractC4949k = this.f16852b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("score");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(activityLevel2.f16850b));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(35, "GeneratedJsonAdapter(ActivityLevel)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
