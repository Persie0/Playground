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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/SharedByUserJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/SharedByUser;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SharedByUserJsonAdapter extends AbstractC4949k<SharedByUser> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17421a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17422b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17423c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<SharedByUser> f17424d;

    public SharedByUserJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17421a = JsonReader.C4932a.m10513a("id", "language", "firstName", "lastName", "photo", "username", "role");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17422b = c4955q.m10565c(cls, emptySet, "id");
        this.f17423c = c4955q.m10565c(String.class, emptySet, "language");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SharedByUser mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17421a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f17422b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a5 = this.f17423c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a6 = this.f17423c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = this.f17423c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f17423c.mo9385a(jsonReader);
                    break;
                case 5:
                    strMo9385a = this.f17423c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a2 = this.f17423c.mo9385a(jsonReader);
                    i10 &= -65;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -66) {
            return new SharedByUser(numM850i.intValue(), strMo9385a5, strMo9385a6, strMo9385a3, strMo9385a4, strMo9385a, strMo9385a2);
        }
        Constructor<SharedByUser> declaredConstructor = this.f17424d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = SharedByUser.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f17424d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "SharedByUser::class.java…his.constructorRef = it }");
        }
        SharedByUser sharedByUserNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a5, strMo9385a6, strMo9385a3, strMo9385a4, strMo9385a, strMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(sharedByUserNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return sharedByUserNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SharedByUser sharedByUser) throws IOException {
        SharedByUser sharedByUser2 = sharedByUser;
        C5207g.m11111f(abstractC9310n, "writer");
        if (sharedByUser2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f17422b.mo9386f(abstractC9310n, Integer.valueOf(sharedByUser2.f17408a));
        abstractC9310n.mo10551C("language");
        String str = sharedByUser2.f17409b;
        AbstractC4949k<String> abstractC4949k = this.f17423c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("firstName");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUser2.f17410c);
        abstractC9310n.mo10551C("lastName");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUser2.f17411d);
        abstractC9310n.mo10551C("photo");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUser2.f17412e);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUser2.f17413f);
        abstractC9310n.mo10551C("role");
        abstractC4949k.mo9386f(abstractC9310n, sharedByUser2.f17414g);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(SharedByUser)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
