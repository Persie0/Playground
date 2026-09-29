package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LessonUserLikedJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LessonUserLiked;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonUserLikedJsonAdapter extends AbstractC4949k<LessonUserLiked> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17196a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17197b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Date> f17198c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<LessonUserLiked> f17199d;

    public LessonUserLikedJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17196a = JsonReader.C4932a.m10513a("username", "liked");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17197b = c4955q.m10565c(String.class, emptySet, "username");
        this.f17198c = c4955q.m10565c(Date.class, emptySet, "liked");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonUserLiked mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Date dateMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17196a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f17197b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                dateMo9385a = this.f17198c.mo9385a(jsonReader);
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new LessonUserLiked(strMo9385a, dateMo9385a);
        }
        Constructor<LessonUserLiked> declaredConstructor = this.f17199d;
        if (declaredConstructor == null) {
            declaredConstructor = LessonUserLiked.class.getDeclaredConstructor(String.class, Date.class, Integer.TYPE, C9756b.f49813c);
            this.f17199d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonUserLiked::class.j…his.constructorRef = it }");
        }
        LessonUserLiked lessonUserLikedNewInstance = declaredConstructor.newInstance(strMo9385a, dateMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(lessonUserLikedNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonUserLikedNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonUserLiked lessonUserLiked) throws IOException {
        LessonUserLiked lessonUserLiked2 = lessonUserLiked;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonUserLiked2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("username");
        this.f17197b.mo9386f(abstractC9310n, lessonUserLiked2.f17194a);
        abstractC9310n.mo10551C("liked");
        this.f17198c.mo9386f(abstractC9310n, lessonUserLiked2.f17195b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(LessonUserLiked)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
