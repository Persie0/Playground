package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserActivityLevelJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserActivityLevel;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserActivityLevelJsonAdapter extends AbstractC4949k<UserActivityLevel> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21694a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21695b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<UserActivityLevel> f21696c;

    public UserActivityLevelJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21694a = JsonReader.C4932a.m10513a("id");
        this.f21695b = c4955q.m10565c(Integer.TYPE, EmptySet.f38034a, "id");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserActivityLevel mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21694a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f21695b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
                i10 &= -2;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2) {
            return new UserActivityLevel(numM850i.intValue());
        }
        Constructor<UserActivityLevel> declaredConstructor = this.f21696c;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = UserActivityLevel.class.getDeclaredConstructor(cls, cls, C9756b.f49813c);
            this.f21696c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserActivityLevel::class…his.constructorRef = it }");
        }
        UserActivityLevel userActivityLevelNewInstance = declaredConstructor.newInstance(numM850i, Integer.valueOf(i10), null);
        C5207g.m11110e(userActivityLevelNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userActivityLevelNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserActivityLevel userActivityLevel) throws IOException {
        UserActivityLevel userActivityLevel2 = userActivityLevel;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userActivityLevel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f21695b.mo9386f(abstractC9310n, Integer.valueOf(userActivityLevel2.f21693a));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(UserActivityLevel)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
