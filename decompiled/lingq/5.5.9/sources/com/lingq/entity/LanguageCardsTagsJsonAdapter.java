package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageCardsTagsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LanguageCardsTags;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageCardsTagsJsonAdapter extends AbstractC4949k<LanguageCardsTags> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16991b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<String>> f16992c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<LanguageCardsTags> f16993d;

    public LanguageCardsTagsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16990a = JsonReader.C4932a.m10513a("code", "tags");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16991b = c4955q.m10565c(String.class, emptySet, "code");
        this.f16992c = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageCardsTags mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        List<String> listMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f16990a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f16991b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("code", "code", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f16992c.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("tags", "tags", jsonReader);
                }
                i10 &= -3;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -3) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("code", "code", jsonReader);
            }
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new LanguageCardsTags(listMo9385a, strMo9385a);
        }
        Constructor<LanguageCardsTags> declaredConstructor = this.f16993d;
        if (declaredConstructor == null) {
            declaredConstructor = LanguageCardsTags.class.getDeclaredConstructor(String.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f16993d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LanguageCardsTags::class…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = listMo9385a;
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = null;
        LanguageCardsTags languageCardsTagsNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(languageCardsTagsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return languageCardsTagsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageCardsTags languageCardsTags) throws IOException {
        LanguageCardsTags languageCardsTags2 = languageCardsTags;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageCardsTags2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        this.f16991b.mo9386f(abstractC9310n, languageCardsTags2.f16988a);
        abstractC9310n.mo10551C("tags");
        this.f16992c.mo9386f(abstractC9310n, languageCardsTags2.f16989b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(LanguageCardsTags)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
