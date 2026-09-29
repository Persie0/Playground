package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LessonTransliterationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LessonTransliteration;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonTransliterationJsonAdapter extends AbstractC4949k<LessonTransliteration> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17185a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17186b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<LessonTransliteration> f17187c;

    public LessonTransliterationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17185a = JsonReader.C4932a.m10513a("hiragana", "romaji", "pinyin", "hant", "hans", "jyutping");
        this.f17186b = c4955q.m10565c(String.class, EmptySet.f38034a, "hiragana");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonTransliteration mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17185a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17186b.mo9385a(jsonReader);
                    i10 &= -2;
                    break;
                case 1:
                    strMo9385a2 = this.f17186b.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    strMo9385a3 = this.f17186b.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    strMo9385a4 = this.f17186b.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    strMo9385a5 = this.f17186b.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    strMo9385a6 = this.f17186b.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -64) {
            return new LessonTransliteration(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6);
        }
        Constructor<LessonTransliteration> declaredConstructor = this.f17187c;
        if (declaredConstructor == null) {
            declaredConstructor = LessonTransliteration.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f17187c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonTransliteration::c…his.constructorRef = it }");
        }
        LessonTransliteration lessonTransliterationNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, Integer.valueOf(i10), null);
        C5207g.m11110e(lessonTransliterationNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonTransliterationNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonTransliteration lessonTransliteration) throws IOException {
        LessonTransliteration lessonTransliteration2 = lessonTransliteration;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonTransliteration2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("hiragana");
        String str = lessonTransliteration2.f17179a;
        AbstractC4949k<String> abstractC4949k = this.f17186b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("romaji");
        abstractC4949k.mo9386f(abstractC9310n, lessonTransliteration2.f17180b);
        abstractC9310n.mo10551C("pinyin");
        abstractC4949k.mo9386f(abstractC9310n, lessonTransliteration2.f17181c);
        abstractC9310n.mo10551C("hant");
        abstractC4949k.mo9386f(abstractC9310n, lessonTransliteration2.f17182d);
        abstractC9310n.mo10551C("hans");
        abstractC4949k.mo9386f(abstractC9310n, lessonTransliteration2.f17183e);
        abstractC9310n.mo10551C("jyutping");
        abstractC4949k.mo9386f(abstractC9310n, lessonTransliteration2.f17184f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(LessonTransliteration)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
