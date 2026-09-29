package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserDictionaryDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserDictionaryDataJsonAdapter extends AbstractC4949k<UserDictionaryData> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21716a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21717b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21718c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f21719d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<UserDictionaryData> f21720e;

    public UserDictionaryDataJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21716a = JsonReader.C4932a.m10513a("id", "name", "order", "url_trans", "url_def", "popup_window", "langTo", "var1", "var2", "var3", "var4", "var5", "override_url");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21717b = c4955q.m10565c(cls, emptySet, "id");
        this.f21718c = c4955q.m10565c(String.class, emptySet, "name");
        this.f21719d = c4955q.m10565c(Boolean.TYPE, emptySet, "isPopUpWindow");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserDictionaryData mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        Integer numMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            String str = strMo9385a10;
            switch (jsonReader.mo10512y0(this.f21716a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a2 = this.f21717b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    strMo9385a4 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    numMo9385a = this.f21717b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strMo9385a6 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a6 == null) {
                        throw C9756b.m18254m("urlToTransform", "url_trans", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    strMo9385a7 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a7 == null) {
                        throw C9756b.m18254m("urlDefinition", "url_def", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a = this.f21719d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPopUpWindow", "popup_window", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a9 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a9 == null) {
                        throw C9756b.m18254m("languageTo", "langTo", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a8 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a8 == null) {
                        throw C9756b.m18254m("urlVar1", "var1", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    strMo9385a5 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("urlVar2", "var2", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    strMo9385a3 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("urlVar3", "var3", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    strMo9385a2 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("urlVar4", "var4", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    strMo9385a = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("urlVar5", "var5", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    strMo9385a10 = this.f21718c.mo9385a(jsonReader);
                    if (strMo9385a10 == null) {
                        throw C9756b.m18254m("overrideUrl", "override_url", jsonReader);
                    }
                    i10 &= -4097;
                    continue;
                    break;
            }
            strMo9385a10 = str;
        }
        String str2 = strMo9385a10;
        jsonReader.mo10508q();
        if (i10 == -8191) {
            if (numMo9385a2 == null) {
                throw C9756b.m18248g("id", "id", jsonReader);
            }
            int iIntValue = numMo9385a2.intValue();
            C5207g.m11109d(strMo9385a4, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a6, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a7, "null cannot be cast to non-null type kotlin.String");
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a9, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a8, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a5, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str2, "null cannot be cast to non-null type kotlin.String");
            return new UserDictionaryData(iIntValue, strMo9385a4, iIntValue2, strMo9385a6, strMo9385a7, zBooleanValue, strMo9385a9, strMo9385a8, strMo9385a5, strMo9385a3, strMo9385a2, strMo9385a, str2);
        }
        String str3 = strMo9385a3;
        String str4 = strMo9385a5;
        String str5 = strMo9385a8;
        String str6 = strMo9385a2;
        Constructor<UserDictionaryData> declaredConstructor = this.f21720e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = UserDictionaryData.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f21720e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserDictionaryData::clas…his.constructorRef = it }");
        }
        Object[] objArr = new Object[15];
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a2.intValue());
        objArr[1] = strMo9385a4;
        objArr[2] = numMo9385a;
        objArr[3] = strMo9385a6;
        objArr[4] = strMo9385a7;
        objArr[5] = boolMo9385a;
        objArr[6] = strMo9385a9;
        objArr[7] = str5;
        objArr[8] = str4;
        objArr[9] = str3;
        objArr[10] = str6;
        objArr[11] = strMo9385a;
        objArr[12] = str2;
        objArr[13] = Integer.valueOf(i10);
        objArr[14] = null;
        UserDictionaryData userDictionaryDataNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(userDictionaryDataNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userDictionaryDataNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserDictionaryData userDictionaryData) throws IOException {
        UserDictionaryData userDictionaryData2 = userDictionaryData;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userDictionaryData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(userDictionaryData2.f21703a);
        AbstractC4949k<Integer> abstractC4949k = this.f21717b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("name");
        String str = userDictionaryData2.f21704b;
        AbstractC4949k<String> abstractC4949k2 = this.f21718c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("order");
        C0166e.m775v(userDictionaryData2.f21705c, abstractC4949k, abstractC9310n, "url_trans");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21706d);
        abstractC9310n.mo10551C("url_def");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21707e);
        abstractC9310n.mo10551C("popup_window");
        this.f21719d.mo9386f(abstractC9310n, Boolean.valueOf(userDictionaryData2.f21708f));
        abstractC9310n.mo10551C("langTo");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21709g);
        abstractC9310n.mo10551C("var1");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21710h);
        abstractC9310n.mo10551C("var2");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21711i);
        abstractC9310n.mo10551C("var3");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21712j);
        abstractC9310n.mo10551C("var4");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21713k);
        abstractC9310n.mo10551C("var5");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21714l);
        abstractC9310n.mo10551C("override_url");
        abstractC4949k2.mo9386f(abstractC9310n, userDictionaryData2.f21715m);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(UserDictionaryData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
