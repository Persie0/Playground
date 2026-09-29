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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/LanguageToLearnJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/LanguageToLearn;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageToLearnJsonAdapter extends AbstractC4949k<LanguageToLearn> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21687a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21688b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f21689c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f21690d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<String> f21691e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<LanguageToLearn> f21692f;

    public LanguageToLearnJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21687a = JsonReader.C4932a.m10513a("code", "supported", "title", "knownWords", "dictionaryLocaleActive", "lastUsed");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21688b = c4955q.m10565c(String.class, emptySet, "code");
        this.f21689c = c4955q.m10565c(Boolean.TYPE, emptySet, "supported");
        this.f21690d = c4955q.m10565c(Integer.TYPE, emptySet, "knownWords");
        this.f21691e = c4955q.m10565c(String.class, emptySet, "dictionaryLocaleActive");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageToLearn mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        Integer numMo9385a = 0;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21687a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f21688b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    boolMo9385a = this.f21689c.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("supported", "supported", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f21688b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a = this.f21690d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    strMo9385a3 = this.f21691e.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    strMo9385a4 = this.f21691e.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -63) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("code", "code", jsonReader);
            }
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new LanguageToLearn(strMo9385a, zBooleanValue, strMo9385a2, numMo9385a.intValue(), strMo9385a3, strMo9385a4);
        }
        Constructor<LanguageToLearn> declaredConstructor = this.f21692f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LanguageToLearn.class.getDeclaredConstructor(String.class, Boolean.TYPE, String.class, cls, String.class, String.class, cls, C9756b.f49813c);
            this.f21692f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LanguageToLearn::class.j…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = boolMo9385a;
        objArr[2] = strMo9385a2;
        objArr[3] = numMo9385a;
        objArr[4] = strMo9385a3;
        objArr[5] = strMo9385a4;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        LanguageToLearn languageToLearnNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(languageToLearnNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return languageToLearnNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageToLearn languageToLearn) throws IOException {
        LanguageToLearn languageToLearn2 = languageToLearn;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageToLearn2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        String str = languageToLearn2.f21681a;
        AbstractC4949k<String> abstractC4949k = this.f21688b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("supported");
        this.f21689c.mo9386f(abstractC9310n, Boolean.valueOf(languageToLearn2.f21682b));
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, languageToLearn2.f21683c);
        abstractC9310n.mo10551C("knownWords");
        this.f21690d.mo9386f(abstractC9310n, Integer.valueOf(languageToLearn2.f21684d));
        abstractC9310n.mo10551C("dictionaryLocaleActive");
        String str2 = languageToLearn2.f21685e;
        AbstractC4949k<String> abstractC4949k2 = this.f21691e;
        abstractC4949k2.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("lastUsed");
        abstractC4949k2.mo9386f(abstractC9310n, languageToLearn2.f21686f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(LanguageToLearn)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
