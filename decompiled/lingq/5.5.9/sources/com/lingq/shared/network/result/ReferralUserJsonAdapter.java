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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ReferralUserJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ReferralUser;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReferralUserJsonAdapter extends AbstractC4949k<ReferralUser> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18276a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18277b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Object> f18278c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18279d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<String> f18280e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ReferralUser> f18281f;

    public ReferralUserJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18276a = JsonReader.C4932a.m10513a("activity_index", "blog_url", "deleted", "description", "id", "photo", "role", "username");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18277b = c4955q.m10565c(Integer.class, emptySet, "activityIndex");
        this.f18278c = c4955q.m10565c(Object.class, emptySet, "blogUrl");
        this.f18279d = c4955q.m10565c(Boolean.class, emptySet, "deleted");
        this.f18280e = c4955q.m10565c(String.class, emptySet, "description");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ReferralUser mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Object objMo9385a = null;
        Boolean boolMo9385a = null;
        String strMo9385a = null;
        Integer numMo9385a2 = null;
        String strMo9385a2 = null;
        Object objMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18276a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18277b.mo9385a(jsonReader);
                    i10 &= -2;
                    break;
                case 1:
                    objMo9385a = this.f18278c.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    boolMo9385a = this.f18279d.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    strMo9385a = this.f18280e.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    numMo9385a2 = this.f18277b.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    strMo9385a2 = this.f18280e.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objMo9385a2 = this.f18278c.mo9385a(jsonReader);
                    i10 &= -65;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a3 = this.f18280e.mo9385a(jsonReader);
                    i10 &= -129;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -256) {
            return new ReferralUser(numMo9385a, objMo9385a, boolMo9385a, strMo9385a, numMo9385a2, strMo9385a2, objMo9385a2, strMo9385a3);
        }
        Constructor<ReferralUser> declaredConstructor = this.f18281f;
        if (declaredConstructor == null) {
            declaredConstructor = ReferralUser.class.getDeclaredConstructor(Integer.class, Object.class, Boolean.class, String.class, Integer.class, String.class, Object.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f18281f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ReferralUser::class.java…his.constructorRef = it }");
        }
        ReferralUser referralUserNewInstance = declaredConstructor.newInstance(numMo9385a, objMo9385a, boolMo9385a, strMo9385a, numMo9385a2, strMo9385a2, objMo9385a2, strMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(referralUserNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return referralUserNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ReferralUser referralUser) throws IOException {
        ReferralUser referralUser2 = referralUser;
        C5207g.m11111f(abstractC9310n, "writer");
        if (referralUser2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("activity_index");
        Integer num = referralUser2.f18268a;
        AbstractC4949k<Integer> abstractC4949k = this.f18277b;
        abstractC4949k.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("blog_url");
        Object obj = referralUser2.f18269b;
        AbstractC4949k<Object> abstractC4949k2 = this.f18278c;
        abstractC4949k2.mo9386f(abstractC9310n, obj);
        abstractC9310n.mo10551C("deleted");
        this.f18279d.mo9386f(abstractC9310n, referralUser2.f18270c);
        abstractC9310n.mo10551C("description");
        String str = referralUser2.f18271d;
        AbstractC4949k<String> abstractC4949k3 = this.f18280e;
        abstractC4949k3.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("id");
        abstractC4949k.mo9386f(abstractC9310n, referralUser2.f18272e);
        abstractC9310n.mo10551C("photo");
        abstractC4949k3.mo9386f(abstractC9310n, referralUser2.f18273f);
        abstractC9310n.mo10551C("role");
        abstractC4949k2.mo9386f(abstractC9310n, referralUser2.f18274g);
        abstractC9310n.mo10551C("username");
        abstractC4949k3.mo9386f(abstractC9310n, referralUser2.f18275h);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(ReferralUser)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
