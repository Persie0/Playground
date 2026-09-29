package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/CourseForImportJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/CourseForImport;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CourseForImportJsonAdapter extends AbstractC4949k<CourseForImport> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16947a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16948b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f16949c;

    public CourseForImportJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16947a = JsonReader.C4932a.m10513a("language", "pk", "title");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16948b = c4955q.m10565c(String.class, emptySet, "language");
        this.f16949c = c4955q.m10565c(Integer.TYPE, emptySet, "pk");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final CourseForImport mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Integer numMo9385a = null;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f16947a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f16948b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    numMo9385a = this.f16949c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                } else if (iMo10512y0 == 2 && (strMo9385a2 = abstractC4949k.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        if (numMo9385a == null) {
            throw C9756b.m18248g("pk", "pk", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (strMo9385a2 != null) {
            return new CourseForImport(strMo9385a, iIntValue, strMo9385a2);
        }
        throw C9756b.m18248g("title", "title", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, CourseForImport courseForImport) throws IOException {
        CourseForImport courseForImport2 = courseForImport;
        C5207g.m11111f(abstractC9310n, "writer");
        if (courseForImport2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        String str = courseForImport2.f16944a;
        AbstractC4949k<String> abstractC4949k = this.f16948b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pk");
        this.f16949c.mo9386f(abstractC9310n, Integer.valueOf(courseForImport2.f16945b));
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, courseForImport2.f16946c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(CourseForImport)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
