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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/NotificationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Notification;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationJsonAdapter extends AbstractC4949k<Notification> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17344a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17345b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17346c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17347d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<Notification> f17348e;

    public NotificationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17344a = JsonReader.C4932a.m10513a("pk", "url", "language", "notificationLanguage", "type", "title", "message", "image", "isNew", "timestamp");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17345b = c4955q.m10565c(cls, emptySet, "pk");
        this.f17346c = c4955q.m10565c(String.class, emptySet, "url");
        this.f17347d = c4955q.m10565c(Boolean.class, emptySet, "isNew");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Notification mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        Boolean boolMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17344a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f17345b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a8 = this.f17346c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a6 = this.f17346c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a7 = this.f17346c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f17346c.mo9385a(jsonReader);
                    break;
                case 5:
                    strMo9385a5 = this.f17346c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a2 = this.f17346c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a3 = this.f17346c.mo9385a(jsonReader);
                    break;
                case 8:
                    boolMo9385a = this.f17347d.mo9385a(jsonReader);
                    break;
                case 9:
                    strMo9385a = this.f17346c.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2) {
            return new Notification(numM850i.intValue(), strMo9385a8, strMo9385a6, strMo9385a7, strMo9385a4, strMo9385a5, strMo9385a2, strMo9385a3, boolMo9385a, strMo9385a);
        }
        Constructor<Notification> declaredConstructor = this.f17348e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Notification.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, cls, C9756b.f49813c);
            this.f17348e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Notification::class.java…his.constructorRef = it }");
        }
        Notification notificationNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a8, strMo9385a6, strMo9385a7, strMo9385a4, strMo9385a5, strMo9385a2, strMo9385a3, boolMo9385a, strMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(notificationNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return notificationNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Notification notification) throws IOException {
        Notification notification2 = notification;
        C5207g.m11111f(abstractC9310n, "writer");
        if (notification2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        this.f17345b.mo9386f(abstractC9310n, Integer.valueOf(notification2.f17334a));
        abstractC9310n.mo10551C("url");
        String str = notification2.f17335b;
        AbstractC4949k<String> abstractC4949k = this.f17346c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17336c);
        abstractC9310n.mo10551C("notificationLanguage");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17337d);
        abstractC9310n.mo10551C("type");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17338e);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17339f);
        abstractC9310n.mo10551C("message");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17340g);
        abstractC9310n.mo10551C("image");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17341h);
        abstractC9310n.mo10551C("isNew");
        this.f17347d.mo9386f(abstractC9310n, notification2.f17342i);
        abstractC9310n.mo10551C("timestamp");
        abstractC4949k.mo9386f(abstractC9310n, notification2.f17343j);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(Notification)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
