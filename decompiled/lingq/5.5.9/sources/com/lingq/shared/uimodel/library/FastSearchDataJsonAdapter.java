package com.lingq.shared.uimodel.library;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/FastSearchDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/FastSearchData;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class FastSearchDataJsonAdapter extends AbstractC4949k<FastSearchData> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21946a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21947b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21948c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<FastSearchData> f21949d;

    public FastSearchDataJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21946a = JsonReader.C4932a.m10513a("id", "language", "type", "title", "imageUrl");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21947b = c4955q.m10565c(String.class, emptySet, "id");
        this.f21948c = c4955q.m10565c(String.class, emptySet, "imageUrl");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final FastSearchData mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21946a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f21947b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f21947b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("language", "language", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                strMo9385a3 = this.f21947b.mo9385a(jsonReader);
                if (strMo9385a3 == null) {
                    throw C9756b.m18254m("type", "type", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                strMo9385a4 = this.f21947b.mo9385a(jsonReader);
                if (strMo9385a4 == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                strMo9385a5 = this.f21948c.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -29) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("id", "id", jsonReader);
            }
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("language", "language", jsonReader);
            }
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a4, "null cannot be cast to non-null type kotlin.String");
            return new FastSearchData(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5);
        }
        Constructor<FastSearchData> declaredConstructor = this.f21949d;
        if (declaredConstructor == null) {
            declaredConstructor = FastSearchData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f21949d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "FastSearchData::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (strMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[1] = strMo9385a2;
        objArr[2] = strMo9385a3;
        objArr[3] = strMo9385a4;
        objArr[4] = strMo9385a5;
        objArr[5] = Integer.valueOf(i10);
        objArr[6] = null;
        FastSearchData fastSearchDataNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(fastSearchDataNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return fastSearchDataNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, FastSearchData fastSearchData) throws IOException {
        FastSearchData fastSearchData2 = fastSearchData;
        C5207g.m11111f(abstractC9310n, "writer");
        if (fastSearchData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        String str = fastSearchData2.f21941a;
        AbstractC4949k<String> abstractC4949k = this.f21947b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, fastSearchData2.f21942b);
        abstractC9310n.mo10551C("type");
        abstractC4949k.mo9386f(abstractC9310n, fastSearchData2.f21943c);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, fastSearchData2.f21944d);
        abstractC9310n.mo10551C("imageUrl");
        this.f21948c.mo9386f(abstractC9310n, fastSearchData2.f21945e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(FastSearchData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
