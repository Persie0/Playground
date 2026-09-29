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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LessonUserCompletedJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LessonUserCompleted;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonUserCompletedJsonAdapter extends AbstractC4949k<LessonUserCompleted> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17190a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17191b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Date> f17192c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<LessonUserCompleted> f17193d;

    public LessonUserCompletedJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17190a = JsonReader.C4932a.m10513a("username", "completed");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17191b = c4955q.m10565c(String.class, emptySet, "username");
        this.f17192c = c4955q.m10565c(Date.class, emptySet, "completed");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonUserCompleted mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Date dateMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17190a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f17191b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                dateMo9385a = this.f17192c.mo9385a(jsonReader);
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new LessonUserCompleted(strMo9385a, dateMo9385a);
        }
        Constructor<LessonUserCompleted> declaredConstructor = this.f17193d;
        if (declaredConstructor == null) {
            declaredConstructor = LessonUserCompleted.class.getDeclaredConstructor(String.class, Date.class, Integer.TYPE, C9756b.f49813c);
            this.f17193d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonUserCompleted::cla…his.constructorRef = it }");
        }
        LessonUserCompleted lessonUserCompletedNewInstance = declaredConstructor.newInstance(strMo9385a, dateMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(lessonUserCompletedNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonUserCompletedNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonUserCompleted lessonUserCompleted) throws IOException {
        LessonUserCompleted lessonUserCompleted2 = lessonUserCompleted;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonUserCompleted2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("username");
        this.f17191b.mo9386f(abstractC9310n, lessonUserCompleted2.f17188a);
        abstractC9310n.mo10551C("completed");
        this.f17192c.mo9386f(abstractC9310n, lessonUserCompleted2.f17189b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(LessonUserCompleted)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
