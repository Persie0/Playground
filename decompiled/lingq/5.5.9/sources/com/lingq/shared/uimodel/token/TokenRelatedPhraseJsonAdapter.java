package com.lingq.shared.uimodel.token;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenRelatedPhraseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/token/TokenRelatedPhrase;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenRelatedPhraseJsonAdapter extends AbstractC4949k<TokenRelatedPhrase> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22113a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f22114b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<TokenMeaning>> f22115c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<TokenRelatedPhrase> f22116d;

    public TokenRelatedPhraseJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22113a = JsonReader.C4932a.m10513a("term", "normalizedTerm", "hints");
        EmptySet emptySet = EmptySet.f38034a;
        this.f22114b = c4955q.m10565c(String.class, emptySet, "term");
        this.f22115c = c4955q.m10565c(C9312p.m17659d(List.class, TokenMeaning.class), emptySet, "meanings");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TokenRelatedPhrase mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<TokenMeaning> listMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f22113a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f22114b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("term", "term", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f22114b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("normalizedTerm", "normalizedTerm", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                listMo9385a = this.f22115c.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("meanings", "hints", jsonReader);
                }
                i10 &= -5;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.token.TokenMeaning>");
            return new TokenRelatedPhrase(strMo9385a, strMo9385a2, listMo9385a);
        }
        Constructor<TokenRelatedPhrase> declaredConstructor = this.f22116d;
        if (declaredConstructor == null) {
            declaredConstructor = TokenRelatedPhrase.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f22116d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "TokenRelatedPhrase::clas…his.constructorRef = it }");
        }
        TokenRelatedPhrase tokenRelatedPhraseNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(tokenRelatedPhraseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return tokenRelatedPhraseNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TokenRelatedPhrase tokenRelatedPhrase) throws IOException {
        TokenRelatedPhrase tokenRelatedPhrase2 = tokenRelatedPhrase;
        C5207g.m11111f(abstractC9310n, "writer");
        if (tokenRelatedPhrase2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("term");
        String str = tokenRelatedPhrase2.f22110a;
        AbstractC4949k<String> abstractC4949k = this.f22114b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("normalizedTerm");
        abstractC4949k.mo9386f(abstractC9310n, tokenRelatedPhrase2.f22111b);
        abstractC9310n.mo10551C("hints");
        this.f22115c.mo9386f(abstractC9310n, tokenRelatedPhrase2.f22112c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(TokenRelatedPhrase)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
