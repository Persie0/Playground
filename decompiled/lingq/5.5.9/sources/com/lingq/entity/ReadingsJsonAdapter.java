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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ReadingsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Readings;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReadingsJsonAdapter extends AbstractC4949k<Readings> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17376a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<String>> f17377b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<Readings> f17378c;

    public ReadingsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17376a = JsonReader.C4932a.m10513a("romaji", "hiragana", "pinyin", "hant", "hans");
        this.f17377b = c4955q.m10565c(C9312p.m17659d(List.class, String.class), EmptySet.f38034a, "romaji");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Readings mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        List<String> listMo9385a = null;
        List<String> listMo9385a2 = null;
        List<String> listMo9385a3 = null;
        List<String> listMo9385a4 = null;
        List<String> listMo9385a5 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17376a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f17377b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                listMo9385a2 = this.f17377b.mo9385a(jsonReader);
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                listMo9385a3 = this.f17377b.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                listMo9385a4 = this.f17377b.mo9385a(jsonReader);
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                listMo9385a5 = this.f17377b.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -32) {
            return new Readings(listMo9385a, listMo9385a2, listMo9385a3, listMo9385a4, listMo9385a5);
        }
        Constructor<Readings> declaredConstructor = this.f17378c;
        if (declaredConstructor == null) {
            declaredConstructor = Readings.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f17378c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Readings::class.java.get…his.constructorRef = it }");
        }
        Readings readingsNewInstance = declaredConstructor.newInstance(listMo9385a, listMo9385a2, listMo9385a3, listMo9385a4, listMo9385a5, Integer.valueOf(i10), null);
        C5207g.m11110e(readingsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return readingsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Readings readings) throws IOException {
        Readings readings2 = readings;
        C5207g.m11111f(abstractC9310n, "writer");
        if (readings2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("romaji");
        List<String> list = readings2.f17371a;
        AbstractC4949k<List<String>> abstractC4949k = this.f17377b;
        abstractC4949k.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("hiragana");
        abstractC4949k.mo9386f(abstractC9310n, readings2.f17372b);
        abstractC9310n.mo10551C("pinyin");
        abstractC4949k.mo9386f(abstractC9310n, readings2.f17373c);
        abstractC9310n.mo10551C("hant");
        abstractC4949k.mo9386f(abstractC9310n, readings2.f17374d);
        abstractC9310n.mo10551C("hans");
        abstractC4949k.mo9386f(abstractC9310n, readings2.f17375e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Readings)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
