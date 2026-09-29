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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LessonBookmarkJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LessonBookmark;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonBookmarkJsonAdapter extends AbstractC4949k<LessonBookmark> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17148a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17149b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17150c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17151d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<LessonBookmark> f17152e;

    public LessonBookmarkJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17148a = JsonReader.C4932a.m10513a("contentId", "wordIndex", "client", "timestamp", "languageTimestamp");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17149b = c4955q.m10565c(cls, emptySet, "contentId");
        this.f17150c = c4955q.m10565c(Integer.class, emptySet, "wordIndex");
        this.f17151d = c4955q.m10565c(String.class, emptySet, "client");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonBookmark mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17148a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f17149b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("contentId", "contentId", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                numMo9385a2 = this.f17150c.mo9385a(jsonReader);
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                strMo9385a = this.f17151d.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                strMo9385a2 = this.f17151d.mo9385a(jsonReader);
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                strMo9385a3 = this.f17151d.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -31) {
            if (numMo9385a != null) {
                return new LessonBookmark(numMo9385a.intValue(), numMo9385a2, strMo9385a, strMo9385a2, strMo9385a3);
            }
            throw C9756b.m18248g("contentId", "contentId", jsonReader);
        }
        Constructor<LessonBookmark> declaredConstructor = this.f17152e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LessonBookmark.class.getDeclaredConstructor(cls, Integer.class, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f17152e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonBookmark::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (numMo9385a == null) {
            throw C9756b.m18248g("contentId", "contentId", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        objArr[1] = numMo9385a2;
        objArr[2] = strMo9385a;
        objArr[3] = strMo9385a2;
        objArr[4] = strMo9385a3;
        objArr[5] = Integer.valueOf(i10);
        objArr[6] = null;
        LessonBookmark lessonBookmarkNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(lessonBookmarkNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonBookmarkNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonBookmark lessonBookmark) throws IOException {
        LessonBookmark lessonBookmark2 = lessonBookmark;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonBookmark2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("contentId");
        this.f17149b.mo9386f(abstractC9310n, Integer.valueOf(lessonBookmark2.f17143a));
        abstractC9310n.mo10551C("wordIndex");
        this.f17150c.mo9386f(abstractC9310n, lessonBookmark2.f17144b);
        abstractC9310n.mo10551C("client");
        String str = lessonBookmark2.f17145c;
        AbstractC4949k<String> abstractC4949k = this.f17151d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("timestamp");
        abstractC4949k.mo9386f(abstractC9310n, lessonBookmark2.f17146d);
        abstractC9310n.mo10551C("languageTimestamp");
        abstractC4949k.mo9386f(abstractC9310n, lessonBookmark2.f17147e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(LessonBookmark)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
