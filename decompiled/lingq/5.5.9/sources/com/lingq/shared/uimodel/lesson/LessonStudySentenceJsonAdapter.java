package com.lingq.shared.uimodel.lesson;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudySentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonStudySentenceJsonAdapter extends AbstractC4949k<LessonStudySentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21864a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<LessonStudyTextToken>> f21865b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21866c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f21867d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<Float>> f21868e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f21869f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<LessonStudySentence> f21870g;

    public LessonStudySentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21864a = JsonReader.C4932a.m10513a("tokens", "text", "normalizedText", "index", "timestamp", "startParagraph");
        C9756b.b bVarM17659d = C9312p.m17659d(List.class, LessonStudyTextToken.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f21865b = c4955q.m10565c(bVarM17659d, emptySet, "tokens");
        this.f21866c = c4955q.m10565c(String.class, emptySet, "text");
        this.f21867d = c4955q.m10565c(Integer.TYPE, emptySet, "index");
        this.f21868e = c4955q.m10565c(C9312p.m17659d(List.class, Float.class), emptySet, "timestamp");
        this.f21869f = c4955q.m10565c(Boolean.TYPE, emptySet, "startParagraph");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonStudySentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<LessonStudyTextToken> listMo9385a = null;
        List<Float> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21864a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    listMo9385a = this.f21865b.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tokens", "tokens", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f21866c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = this.f21866c.mo9385a(jsonReader);
                    break;
                case 3:
                    numMo9385a = this.f21867d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    break;
                    break;
                case 4:
                    listMo9385a2 = this.f21868e.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    boolMo9385a = this.f21869f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("startParagraph", "startParagraph", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -50) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.lesson.LessonStudyTextToken>");
            if (numMo9385a != null) {
                return new LessonStudySentence(numMo9385a.intValue(), strMo9385a, strMo9385a2, listMo9385a, listMo9385a2, boolMo9385a.booleanValue());
            }
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        Constructor<LessonStudySentence> declaredConstructor = this.f21870g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LessonStudySentence.class.getDeclaredConstructor(List.class, String.class, String.class, cls, List.class, Boolean.TYPE, cls, C9756b.f49813c);
            this.f21870g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonStudySentence::cla…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        objArr[0] = listMo9385a;
        objArr[1] = strMo9385a;
        objArr[2] = strMo9385a2;
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[3] = Integer.valueOf(numMo9385a.intValue());
        objArr[4] = listMo9385a2;
        objArr[5] = boolMo9385a;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        LessonStudySentence lessonStudySentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(lessonStudySentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonStudySentenceNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonStudySentence lessonStudySentence) throws IOException {
        LessonStudySentence lessonStudySentence2 = lessonStudySentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonStudySentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("tokens");
        this.f21865b.mo9386f(abstractC9310n, lessonStudySentence2.f21858a);
        abstractC9310n.mo10551C("text");
        String str = lessonStudySentence2.f21859b;
        AbstractC4949k<String> abstractC4949k = this.f21866c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("normalizedText");
        abstractC4949k.mo9386f(abstractC9310n, lessonStudySentence2.f21860c);
        abstractC9310n.mo10551C("index");
        this.f21867d.mo9386f(abstractC9310n, Integer.valueOf(lessonStudySentence2.f21861d));
        abstractC9310n.mo10551C("timestamp");
        this.f21868e.mo9386f(abstractC9310n, lessonStudySentence2.f21862e);
        abstractC9310n.mo10551C("startParagraph");
        this.f21869f.mo9386f(abstractC9310n, Boolean.valueOf(lessonStudySentence2.f21863f));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(LessonStudySentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
