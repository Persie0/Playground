package com.lingq.shared.uimodel.lesson;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTextTokenJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTextToken;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonStudyTextTokenJsonAdapter extends AbstractC4949k<LessonStudyTextToken> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21884a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21885b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f21886c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<LessonStudyTransliteration> f21887d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f21888e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<LessonStudyTextToken> f21889f;

    public LessonStudyTextTokenJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21884a = JsonReader.C4932a.m10513a("punct", "whitespace", "isNumber", "opentag", "closetag", "transliteration", "index", "indexInSentence", "isIgnored", "text", "isUnknown", "isKnown", "wordId");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21885b = c4955q.m10565c(String.class, emptySet, "punct");
        this.f21886c = c4955q.m10565c(Boolean.TYPE, emptySet, "isNumber");
        this.f21887d = c4955q.m10565c(LessonStudyTransliteration.class, emptySet, "transliteration");
        this.f21888e = c4955q.m10565c(Integer.TYPE, emptySet, "index");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonStudyTextToken mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
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
        LessonStudyTransliteration lessonStudyTransliterationMo9385a = null;
        String strMo9385a5 = null;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean boolMo9385a4 = boolMo9385a3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21884a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f21885b.mo9385a(jsonReader);
                    break;
                case 1:
                    strMo9385a2 = this.f21885b.mo9385a(jsonReader);
                    break;
                case 2:
                    boolMo9385a = this.f21886c.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isNumber", "isNumber", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strMo9385a3 = this.f21885b.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f21885b.mo9385a(jsonReader);
                    break;
                case 5:
                    lessonStudyTransliterationMo9385a = this.f21887d.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a = this.f21888e.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f21888e.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("indexInSentence", "indexInSentence", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    boolMo9385a3 = this.f21886c.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isIgnored", "isIgnored", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    strMo9385a5 = this.f21885b.mo9385a(jsonReader);
                    break;
                case 10:
                    boolMo9385a4 = this.f21886c.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isUnknown", "isUnknown", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    boolMo9385a2 = this.f21886c.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isKnown", "isKnown", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    numMo9385a3 = this.f21888e.mo9385a(jsonReader);
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
            return new LessonStudyTextToken(strMo9385a, strMo9385a2, boolMo9385a.booleanValue(), strMo9385a3, strMo9385a4, lessonStudyTransliterationMo9385a, numMo9385a.intValue(), numMo9385a2.intValue(), boolMo9385a3.booleanValue(), strMo9385a5, boolMo9385a4.booleanValue(), boolMo9385a2.booleanValue(), numMo9385a3.intValue());
        }
        Constructor<LessonStudyTextToken> declaredConstructor = this.f21889f;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            declaredConstructor = LessonStudyTextToken.class.getDeclaredConstructor(String.class, String.class, cls, String.class, String.class, LessonStudyTransliteration.class, cls2, cls2, cls, String.class, cls, cls, cls2, cls2, C9756b.f49813c);
            this.f21889f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonStudyTextToken::cl…his.constructorRef = it }");
        }
        LessonStudyTextToken lessonStudyTextTokenNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, boolMo9385a, strMo9385a3, strMo9385a4, lessonStudyTransliterationMo9385a, numMo9385a, numMo9385a2, boolMo9385a3, strMo9385a5, boolMo9385a4, boolMo9385a2, numMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(lessonStudyTextTokenNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonStudyTextTokenNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonStudyTextToken lessonStudyTextToken) throws IOException {
        LessonStudyTextToken lessonStudyTextToken2 = lessonStudyTextToken;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonStudyTextToken2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("punct");
        String str = lessonStudyTextToken2.f21871a;
        AbstractC4949k<String> abstractC4949k = this.f21885b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("whitespace");
        abstractC4949k.mo9386f(abstractC9310n, lessonStudyTextToken2.f21872b);
        abstractC9310n.mo10551C("isNumber");
        Boolean boolValueOf = Boolean.valueOf(lessonStudyTextToken2.f21873c);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f21886c;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("opentag");
        abstractC4949k.mo9386f(abstractC9310n, lessonStudyTextToken2.f21874d);
        abstractC9310n.mo10551C("closetag");
        abstractC4949k.mo9386f(abstractC9310n, lessonStudyTextToken2.f21875e);
        abstractC9310n.mo10551C("transliteration");
        this.f21887d.mo9386f(abstractC9310n, lessonStudyTextToken2.f21876f);
        abstractC9310n.mo10551C("index");
        Integer numValueOf = Integer.valueOf(lessonStudyTextToken2.f21877g);
        AbstractC4949k<Integer> abstractC4949k3 = this.f21888e;
        abstractC4949k3.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("indexInSentence");
        C0166e.m775v(lessonStudyTextToken2.f21878h, abstractC4949k3, abstractC9310n, "isIgnored");
        C0141b.m623s(lessonStudyTextToken2.f21879i, abstractC4949k2, abstractC9310n, "text");
        abstractC4949k.mo9386f(abstractC9310n, lessonStudyTextToken2.f21880j);
        abstractC9310n.mo10551C("isUnknown");
        C0141b.m623s(lessonStudyTextToken2.f21881k, abstractC4949k2, abstractC9310n, "isKnown");
        C0141b.m623s(lessonStudyTextToken2.f21882l, abstractC4949k2, abstractC9310n, "wordId");
        abstractC4949k3.mo9386f(abstractC9310n, Integer.valueOf(lessonStudyTextToken2.f21883m));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(LessonStudyTextToken)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
