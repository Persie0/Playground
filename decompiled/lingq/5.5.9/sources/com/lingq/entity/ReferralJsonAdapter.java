package com.lingq.entity;

import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ReferralJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Referral;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReferralJsonAdapter extends AbstractC4949k<Referral> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17383a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17384b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17385c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<Referral> f17386d;

    public ReferralJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17383a = JsonReader.C4932a.m10513a("pk", "username", "photo", "dateJoined");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17384b = c4955q.m10565c(cls, emptySet, "pk");
        this.f17385c = c4955q.m10565c(String.class, emptySet, "username");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Referral mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17383a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f17384b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("pk", "pk", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f17385c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f17385c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 3) {
                strMo9385a3 = this.f17385c.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2) {
            return new Referral(strMo9385a, numM850i.intValue(), strMo9385a2, strMo9385a3);
        }
        Constructor<Referral> declaredConstructor = this.f17386d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Referral.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f17386d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Referral::class.java.get…his.constructorRef = it }");
        }
        Referral referralNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, strMo9385a2, strMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(referralNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return referralNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Referral referral) throws IOException {
        Referral referral2 = referral;
        C5207g.m11111f(abstractC9310n, "writer");
        if (referral2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        this.f17384b.mo9386f(abstractC9310n, Integer.valueOf(referral2.f17379a));
        abstractC9310n.mo10551C("username");
        String str = referral2.f17380b;
        AbstractC4949k<String> abstractC4949k = this.f17385c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("photo");
        abstractC4949k.mo9386f(abstractC9310n, referral2.f17381c);
        abstractC9310n.mo10551C("dateJoined");
        abstractC4949k.mo9386f(abstractC9310n, referral2.f17382d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Referral)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
