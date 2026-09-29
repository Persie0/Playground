package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/SentenceFragmentJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/SentenceFragment;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceFragmentJsonAdapter extends AbstractC4949k<SentenceFragment> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18242a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18243b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f18244c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<SentenceFragment> f18245d;

    public SentenceFragmentJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18242a = JsonReader.C4932a.m10513a("text", "is_occurrence");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18243b = c4955q.m10565c(String.class, emptySet, "text");
        this.f18244c = c4955q.m10565c(Boolean.TYPE, emptySet, "isOccurrence");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SentenceFragment mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        String strMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18242a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18243b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                boolMo9385a = this.f18244c.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isOccurrence", "is_occurrence", jsonReader);
                }
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new SentenceFragment(strMo9385a, boolMo9385a.booleanValue());
        }
        Constructor<SentenceFragment> declaredConstructor = this.f18245d;
        if (declaredConstructor == null) {
            declaredConstructor = SentenceFragment.class.getDeclaredConstructor(String.class, Boolean.TYPE, Integer.TYPE, C9756b.f49813c);
            this.f18245d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "SentenceFragment::class.…his.constructorRef = it }");
        }
        SentenceFragment sentenceFragmentNewInstance = declaredConstructor.newInstance(strMo9385a, boolMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(sentenceFragmentNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return sentenceFragmentNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SentenceFragment sentenceFragment) throws IOException {
        SentenceFragment sentenceFragment2 = sentenceFragment;
        C5207g.m11111f(abstractC9310n, "writer");
        if (sentenceFragment2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("text");
        this.f18243b.mo9386f(abstractC9310n, sentenceFragment2.f18240a);
        abstractC9310n.mo10551C("is_occurrence");
        this.f18244c.mo9386f(abstractC9310n, Boolean.valueOf(sentenceFragment2.f18241b));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(SentenceFragment)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
