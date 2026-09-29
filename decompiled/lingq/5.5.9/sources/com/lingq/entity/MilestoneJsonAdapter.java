package com.lingq.entity;

import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/MilestoneJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Milestone;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MilestoneJsonAdapter extends AbstractC4949k<Milestone> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17306a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17307b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17308c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f17309d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<Milestone> f17310e;

    public MilestoneJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17306a = JsonReader.C4932a.m10513a("languageAndSlug", "language", "slug", "name", "goal", "stat", "date");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17307b = c4955q.m10565c(String.class, emptySet, "languageAndSlug");
        this.f17308c = c4955q.m10565c(String.class, emptySet, "language");
        this.f17309d = c4955q.m10565c(Integer.TYPE, emptySet, "goal");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Milestone mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17306a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a5 = this.f17307b.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("languageAndSlug", "languageAndSlug", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a6 = this.f17308c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a3 = this.f17308c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a4 = this.f17308c.mo9385a(jsonReader);
                    break;
                case 4:
                    numM850i = this.f17309d.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("goal", "goal", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a = this.f17308c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a2 = this.f17308c.mo9385a(jsonReader);
                    i10 &= -65;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -81) {
            if (strMo9385a5 != null) {
                return new Milestone(numM850i.intValue(), strMo9385a5, strMo9385a6, strMo9385a3, strMo9385a4, strMo9385a, strMo9385a2);
            }
            throw C9756b.m18248g("languageAndSlug", "languageAndSlug", jsonReader);
        }
        Constructor<Milestone> declaredConstructor = this.f17310e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Milestone.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, String.class, String.class, cls, C9756b.f49813c);
            this.f17310e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Milestone::class.java.ge…his.constructorRef = it }");
        }
        Object[] objArr = new Object[9];
        if (strMo9385a5 == null) {
            throw C9756b.m18248g("languageAndSlug", "languageAndSlug", jsonReader);
        }
        objArr[0] = strMo9385a5;
        objArr[1] = strMo9385a6;
        objArr[2] = strMo9385a3;
        objArr[3] = strMo9385a4;
        objArr[4] = numM850i;
        objArr[5] = strMo9385a;
        objArr[6] = strMo9385a2;
        objArr[7] = Integer.valueOf(i10);
        objArr[8] = null;
        Milestone milestoneNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(milestoneNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return milestoneNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Milestone milestone) throws IOException {
        Milestone milestone2 = milestone;
        C5207g.m11111f(abstractC9310n, "writer");
        if (milestone2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("languageAndSlug");
        this.f17307b.mo9386f(abstractC9310n, milestone2.f17299a);
        abstractC9310n.mo10551C("language");
        String str = milestone2.f17300b;
        AbstractC4949k<String> abstractC4949k = this.f17308c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("slug");
        abstractC4949k.mo9386f(abstractC9310n, milestone2.f17301c);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, milestone2.f17302d);
        abstractC9310n.mo10551C("goal");
        this.f17309d.mo9386f(abstractC9310n, Integer.valueOf(milestone2.f17303e));
        abstractC9310n.mo10551C("stat");
        abstractC4949k.mo9386f(abstractC9310n, milestone2.f17304f);
        abstractC9310n.mo10551C("date");
        abstractC4949k.mo9386f(abstractC9310n, milestone2.f17305g);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(31, "GeneratedJsonAdapter(Milestone)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
