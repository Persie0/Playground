package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultSharedByUserJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultSharedByUser;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultSharedByUserJsonAdapter extends AbstractC4949k<ResultSharedByUser> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18945a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18946b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18947c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f18948d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultSharedByUser> f18949e;

    public ResultSharedByUserJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18945a = JsonReader.C4932a.m10513a("id", "first_name", "last_name", "photo", "username", "role");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18946b = c4955q.m10565c(cls, emptySet, "id");
        this.f18947c = c4955q.m10565c(String.class, emptySet, "firstName");
        this.f18948d = c4955q.m10565c(String.class, emptySet, "role");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultSharedByUser mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer num = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (true) {
            String str = strMo9385a5;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i10 == -33) {
                    if (num == null) {
                        throw C9756b.m18248g("id", "id", jsonReader);
                    }
                    int iIntValue = num.intValue();
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("firstName", "first_name", jsonReader);
                    }
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("lastName", "last_name", jsonReader);
                    }
                    if (strMo9385a3 == null) {
                        throw C9756b.m18248g("photo", "photo", jsonReader);
                    }
                    if (strMo9385a4 != null) {
                        return new ResultSharedByUser(iIntValue, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, str);
                    }
                    throw C9756b.m18248g("username", "username", jsonReader);
                }
                Constructor<ResultSharedByUser> declaredConstructor = this.f18949e;
                int i11 = 8;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = ResultSharedByUser.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, cls, C9756b.f49813c);
                    this.f18949e = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "ResultSharedByUser::clas…his.constructorRef = it }");
                    i11 = 8;
                }
                Object[] objArr = new Object[i11];
                if (num == null) {
                    throw C9756b.m18248g("id", "id", jsonReader);
                }
                objArr[0] = Integer.valueOf(num.intValue());
                if (strMo9385a == null) {
                    throw C9756b.m18248g("firstName", "first_name", jsonReader);
                }
                objArr[1] = strMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("lastName", "last_name", jsonReader);
                }
                objArr[2] = strMo9385a2;
                if (strMo9385a3 == null) {
                    throw C9756b.m18248g("photo", "photo", jsonReader);
                }
                objArr[3] = strMo9385a3;
                if (strMo9385a4 == null) {
                    throw C9756b.m18248g("username", "username", jsonReader);
                }
                objArr[4] = strMo9385a4;
                objArr[5] = str;
                objArr[6] = Integer.valueOf(i10);
                objArr[7] = null;
                ResultSharedByUser resultSharedByUserNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(resultSharedByUserNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return resultSharedByUserNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f18945a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a = this.f18946b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    num = numMo9385a;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18947c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("firstName", "first_name", jsonReader);
                    }
                    break;
                case 2:
                    strMo9385a2 = this.f18947c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("lastName", "last_name", jsonReader);
                    }
                    break;
                case 3:
                    strMo9385a3 = this.f18947c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("photo", "photo", jsonReader);
                    }
                    break;
                case 4:
                    strMo9385a4 = this.f18947c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("username", "username", jsonReader);
                    }
                    break;
                case 5:
                    strMo9385a5 = this.f18948d.mo9385a(jsonReader);
                    i10 &= -33;
                    continue;
            }
            strMo9385a5 = str;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultSharedByUser resultSharedByUser) throws IOException {
        ResultSharedByUser resultSharedByUser2 = resultSharedByUser;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultSharedByUser2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f18946b.mo9386f(abstractC9310n, Integer.valueOf(resultSharedByUser2.f18939a));
        abstractC9310n.mo10551C("first_name");
        String str = resultSharedByUser2.f18940b;
        AbstractC4949k<String> abstractC4949k = this.f18947c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("last_name");
        abstractC4949k.mo9386f(abstractC9310n, resultSharedByUser2.f18941c);
        abstractC9310n.mo10551C("photo");
        abstractC4949k.mo9386f(abstractC9310n, resultSharedByUser2.f18942d);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, resultSharedByUser2.f18943e);
        abstractC9310n.mo10551C("role");
        this.f18948d.mo9386f(abstractC9310n, resultSharedByUser2.f18944f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ResultSharedByUser)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
