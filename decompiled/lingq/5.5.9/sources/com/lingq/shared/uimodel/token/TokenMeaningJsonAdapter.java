package com.lingq.shared.uimodel.token;

import android.support.v4.media.C0141b;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenMeaningJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/token/TokenMeaning;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenMeaningJsonAdapter extends AbstractC4949k<TokenMeaning> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22096a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f22097b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f22098c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f22099d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<TokenMeaning> f22100e;

    public TokenMeaningJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22096a = JsonReader.C4932a.m10513a("id", "locale", "text", "popularity", "flagged", "detectedLocale", "isGoogleTranslate", "wordId");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f22097b = c4955q.m10565c(cls, emptySet, "id");
        this.f22098c = c4955q.m10565c(String.class, emptySet, "locale");
        this.f22099d = c4955q.m10565c(Boolean.TYPE, emptySet, "flagged");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TokenMeaning mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22096a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f22097b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f22098c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("locale", "locale", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f22098c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("text", "text", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a2 = this.f22097b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("popularity", "popularity", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    boolMo9385a = this.f22099d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("flagged", "flagged", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a3 = this.f22098c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("detectedLocale", "detectedLocale", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a2 = this.f22099d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isGoogleTranslate", "isGoogleTranslate", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f22097b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("wordId", "wordId", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -256) {
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numMo9385a2.intValue();
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            return new TokenMeaning(iIntValue, strMo9385a, strMo9385a2, iIntValue2, zBooleanValue, strMo9385a3, boolMo9385a2.booleanValue(), numMo9385a3.intValue());
        }
        String str = strMo9385a3;
        Constructor<TokenMeaning> declaredConstructor = this.f22100e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = TokenMeaning.class.getDeclaredConstructor(cls, String.class, String.class, cls, cls2, String.class, cls2, cls, cls, C9756b.f49813c);
            this.f22100e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "TokenMeaning::class.java…his.constructorRef = it }");
        }
        TokenMeaning tokenMeaningNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a, strMo9385a2, numMo9385a2, boolMo9385a, str, boolMo9385a2, numMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(tokenMeaningNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return tokenMeaningNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TokenMeaning tokenMeaning) throws IOException {
        TokenMeaning tokenMeaning2 = tokenMeaning;
        C5207g.m11111f(abstractC9310n, "writer");
        if (tokenMeaning2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(tokenMeaning2.f22088a);
        AbstractC4949k<Integer> abstractC4949k = this.f22097b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("locale");
        String str = tokenMeaning2.f22089b;
        AbstractC4949k<String> abstractC4949k2 = this.f22098c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("text");
        abstractC4949k2.mo9386f(abstractC9310n, tokenMeaning2.f22090c);
        abstractC9310n.mo10551C("popularity");
        C0166e.m775v(tokenMeaning2.f22091d, abstractC4949k, abstractC9310n, "flagged");
        Boolean boolValueOf = Boolean.valueOf(tokenMeaning2.f22092e);
        AbstractC4949k<Boolean> abstractC4949k3 = this.f22099d;
        abstractC4949k3.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("detectedLocale");
        abstractC4949k2.mo9386f(abstractC9310n, tokenMeaning2.f22093f);
        abstractC9310n.mo10551C("isGoogleTranslate");
        C0141b.m623s(tokenMeaning2.f22094g, abstractC4949k3, abstractC9310n, "wordId");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(tokenMeaning2.f22095h));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(TokenMeaning)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
