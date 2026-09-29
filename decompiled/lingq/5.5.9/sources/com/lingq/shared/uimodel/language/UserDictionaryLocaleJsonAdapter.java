package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserDictionaryLocaleJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserDictionaryLocaleJsonAdapter extends AbstractC4949k<UserDictionaryLocale> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21723a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21724b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<UserDictionaryLocale> f21725c;

    public UserDictionaryLocaleJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21723a = JsonReader.C4932a.m10513a("code", "title");
        this.f21724b = c4955q.m10565c(String.class, EmptySet.f38034a, "code");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserDictionaryLocale mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21723a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f21724b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("code", "code", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f21724b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -3) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("code", "code", jsonReader);
            }
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new UserDictionaryLocale(strMo9385a, strMo9385a2);
        }
        Constructor<UserDictionaryLocale> declaredConstructor = this.f21725c;
        if (declaredConstructor == null) {
            declaredConstructor = UserDictionaryLocale.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f21725c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserDictionaryLocale::cl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = strMo9385a2;
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = null;
        UserDictionaryLocale userDictionaryLocaleNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(userDictionaryLocaleNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userDictionaryLocaleNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserDictionaryLocale userDictionaryLocale) throws IOException {
        UserDictionaryLocale userDictionaryLocale2 = userDictionaryLocale;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userDictionaryLocale2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        String str = userDictionaryLocale2.f21721a;
        AbstractC4949k<String> abstractC4949k = this.f21724b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, userDictionaryLocale2.f21722b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(UserDictionaryLocale)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
