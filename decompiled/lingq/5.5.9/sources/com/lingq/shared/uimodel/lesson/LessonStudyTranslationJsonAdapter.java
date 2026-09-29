package com.lingq.shared.uimodel.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslation;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonStudyTranslationJsonAdapter extends AbstractC4949k<LessonStudyTranslation> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21892a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21893b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<String>> f21894c;

    public LessonStudyTranslationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21892a = JsonReader.C4932a.m10513a("language", "sentences");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21893b = c4955q.m10565c(String.class, emptySet, "language");
        this.f21894c = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "sentences");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonStudyTranslation mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<String> listMo9385a = null;
        String strMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21892a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f21893b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f21894c.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        return new LessonStudyTranslation(listMo9385a, strMo9385a);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonStudyTranslation lessonStudyTranslation) throws IOException {
        LessonStudyTranslation lessonStudyTranslation2 = lessonStudyTranslation;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonStudyTranslation2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        this.f21893b.mo9386f(abstractC9310n, lessonStudyTranslation2.f21890a);
        abstractC9310n.mo10551C("sentences");
        this.f21894c.mo9386f(abstractC9310n, lessonStudyTranslation2.f21891b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(LessonStudyTranslation)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
