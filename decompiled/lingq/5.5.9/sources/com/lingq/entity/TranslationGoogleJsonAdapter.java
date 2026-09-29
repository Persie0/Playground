package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/TranslationGoogleJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/TranslationGoogle;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TranslationGoogleJsonAdapter extends AbstractC4949k<TranslationGoogle> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17527a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<TranslationSimple>> f17528b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<TranslationGoogle> f17529c;

    public TranslationGoogleJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17527a = JsonReader.C4932a.m10513a("translations");
        this.f17528b = c4955q.m10565c(C9312p.m17659d(List.class, TranslationSimple.class), EmptySet.f38034a, "translations");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TranslationGoogle mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<TranslationSimple> listMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17527a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f17528b.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("translations", "translations", jsonReader);
                }
                i10 &= -2;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.TranslationSimple>");
            return new TranslationGoogle(listMo9385a);
        }
        Constructor<TranslationGoogle> declaredConstructor = this.f17529c;
        if (declaredConstructor == null) {
            declaredConstructor = TranslationGoogle.class.getDeclaredConstructor(List.class, Integer.TYPE, C9756b.f49813c);
            this.f17529c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "TranslationGoogle::class…his.constructorRef = it }");
        }
        TranslationGoogle translationGoogleNewInstance = declaredConstructor.newInstance(listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(translationGoogleNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return translationGoogleNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TranslationGoogle translationGoogle) throws IOException {
        TranslationGoogle translationGoogle2 = translationGoogle;
        C5207g.m11111f(abstractC9310n, "writer");
        if (translationGoogle2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("translations");
        this.f17528b.mo9386f(abstractC9310n, translationGoogle2.f17526a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(TranslationGoogle)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
