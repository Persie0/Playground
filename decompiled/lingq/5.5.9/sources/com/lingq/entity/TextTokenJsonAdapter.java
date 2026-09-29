package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/TextTokenJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/TextToken;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TextTokenJsonAdapter extends AbstractC4949k<TextToken> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17517a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17518b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f17519c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<LessonTransliteration> f17520d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17521e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<TextToken> f17522f;

    public TextTokenJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17517a = JsonReader.C4932a.m10513a("punct", "whitespace", "isNumber", "opentag", "closetag", "transliteration", "index", "indexInSentence", "isIgnored", "text", "isUnknown", "isKnown", "wordId");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17518b = c4955q.m10565c(String.class, emptySet, "punct");
        this.f17519c = c4955q.m10565c(Boolean.TYPE, emptySet, "isNumber");
        this.f17520d = c4955q.m10565c(LessonTransliteration.class, emptySet, "transliteration");
        this.f17521e = c4955q.m10565c(Integer.TYPE, emptySet, "index");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TextToken mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a2 = boolMo9385a;
        Integer numMo9385a = 0;
        Integer numMo9385a2 = null;
        Integer numMo9385a3 = null;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        LessonTransliteration lessonTransliterationMo9385a = null;
        String strMo9385a5 = null;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean boolMo9385a4 = boolMo9385a3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17517a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17518b.mo9385a(jsonReader);
                    break;
                case 1:
                    strMo9385a2 = this.f17518b.mo9385a(jsonReader);
                    break;
                case 2:
                    boolMo9385a = this.f17519c.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isNumber", "isNumber", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strMo9385a3 = this.f17518b.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f17518b.mo9385a(jsonReader);
                    break;
                case 5:
                    lessonTransliterationMo9385a = this.f17520d.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a = this.f17521e.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f17521e.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("indexInSentence", "indexInSentence", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    boolMo9385a3 = this.f17519c.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isIgnored", "isIgnored", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    strMo9385a5 = this.f17518b.mo9385a(jsonReader);
                    break;
                case 10:
                    boolMo9385a4 = this.f17519c.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isUnknown", "isUnknown", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    boolMo9385a2 = this.f17519c.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isKnown", "isKnown", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    numMo9385a3 = this.f17521e.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("wordId", "wordId", jsonReader);
                    }
                    i10 &= -4097;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -7621) {
            return new TextToken(strMo9385a, strMo9385a2, boolMo9385a.booleanValue(), strMo9385a3, strMo9385a4, lessonTransliterationMo9385a, numMo9385a.intValue(), numMo9385a2.intValue(), boolMo9385a3.booleanValue(), strMo9385a5, boolMo9385a4.booleanValue(), boolMo9385a2.booleanValue(), numMo9385a3.intValue());
        }
        Constructor<TextToken> declaredConstructor = this.f17522f;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            declaredConstructor = TextToken.class.getDeclaredConstructor(String.class, String.class, cls, String.class, String.class, LessonTransliteration.class, cls2, cls2, cls, String.class, cls, cls, cls2, cls2, C9756b.f49813c);
            this.f17522f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "TextToken::class.java.ge…his.constructorRef = it }");
        }
        TextToken textTokenNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, boolMo9385a, strMo9385a3, strMo9385a4, lessonTransliterationMo9385a, numMo9385a, numMo9385a2, boolMo9385a3, strMo9385a5, boolMo9385a4, boolMo9385a2, numMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(textTokenNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return textTokenNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TextToken textToken) throws IOException {
        TextToken textToken2 = textToken;
        C5207g.m11111f(abstractC9310n, "writer");
        if (textToken2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("punct");
        String str = textToken2.f17504a;
        AbstractC4949k<String> abstractC4949k = this.f17518b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("whitespace");
        abstractC4949k.mo9386f(abstractC9310n, textToken2.f17505b);
        abstractC9310n.mo10551C("isNumber");
        Boolean boolValueOf = Boolean.valueOf(textToken2.f17506c);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f17519c;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("opentag");
        abstractC4949k.mo9386f(abstractC9310n, textToken2.f17507d);
        abstractC9310n.mo10551C("closetag");
        abstractC4949k.mo9386f(abstractC9310n, textToken2.f17508e);
        abstractC9310n.mo10551C("transliteration");
        this.f17520d.mo9386f(abstractC9310n, textToken2.f17509f);
        abstractC9310n.mo10551C("index");
        Integer numValueOf = Integer.valueOf(textToken2.f17510g);
        AbstractC4949k<Integer> abstractC4949k3 = this.f17521e;
        abstractC4949k3.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("indexInSentence");
        C0166e.m775v(textToken2.f17511h, abstractC4949k3, abstractC9310n, "isIgnored");
        C0141b.m623s(textToken2.f17512i, abstractC4949k2, abstractC9310n, "text");
        abstractC4949k.mo9386f(abstractC9310n, textToken2.f17513j);
        abstractC9310n.mo10551C("isUnknown");
        C0141b.m623s(textToken2.f17514k, abstractC4949k2, abstractC9310n, "isKnown");
        C0141b.m623s(textToken2.f17515l, abstractC4949k2, abstractC9310n, "wordId");
        abstractC4949k3.mo9386f(abstractC9310n, Integer.valueOf(textToken2.f17516m));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(31, "GeneratedJsonAdapter(TextToken)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
