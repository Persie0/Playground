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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestPushNotificationRegistrationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestPushNotificationRegistration;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestPushNotificationRegistrationJsonAdapter extends AbstractC4949k<RequestPushNotificationRegistration> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18160a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18161b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f18162c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<RequestPushNotificationRegistration> f18163d;

    public RequestPushNotificationRegistrationJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18160a = JsonReader.C4932a.m10513a("dev_id", "reg_id", "name", "isActive");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18161b = c4955q.m10565c(String.class, emptySet, "devId");
        this.f18162c = c4955q.m10565c(Boolean.TYPE, emptySet, "isActive");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestPushNotificationRegistration mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18160a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18161b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("devId", "dev_id", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f18161b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("token", "reg_id", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                strMo9385a3 = this.f18161b.mo9385a(jsonReader);
                if (strMo9385a3 == null) {
                    throw C9756b.m18254m("name", "name", jsonReader);
                }
            } else if (iMo10512y0 == 3) {
                boolMo9385a = this.f18162c.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isActive", "isActive", jsonReader);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -9) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("devId", "dev_id", jsonReader);
            }
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("token", "reg_id", jsonReader);
            }
            if (strMo9385a3 != null) {
                return new RequestPushNotificationRegistration(strMo9385a, strMo9385a2, strMo9385a3, boolMo9385a.booleanValue());
            }
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        Constructor<RequestPushNotificationRegistration> declaredConstructor = this.f18163d;
        if (declaredConstructor == null) {
            declaredConstructor = RequestPushNotificationRegistration.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, C9756b.f49813c);
            this.f18163d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestPushNotificationR…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (strMo9385a == null) {
            throw C9756b.m18248g("devId", "dev_id", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("token", "reg_id", jsonReader);
        }
        objArr[1] = strMo9385a2;
        if (strMo9385a3 == null) {
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        objArr[2] = strMo9385a3;
        objArr[3] = boolMo9385a;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        RequestPushNotificationRegistration requestPushNotificationRegistrationNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(requestPushNotificationRegistrationNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestPushNotificationRegistrationNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestPushNotificationRegistration requestPushNotificationRegistration) throws IOException {
        RequestPushNotificationRegistration requestPushNotificationRegistration2 = requestPushNotificationRegistration;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestPushNotificationRegistration2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("dev_id");
        String str = requestPushNotificationRegistration2.f18156a;
        AbstractC4949k<String> abstractC4949k = this.f18161b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("reg_id");
        abstractC4949k.mo9386f(abstractC9310n, requestPushNotificationRegistration2.f18157b);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, requestPushNotificationRegistration2.f18158c);
        abstractC9310n.mo10551C("isActive");
        this.f18162c.mo9386f(abstractC9310n, Boolean.valueOf(requestPushNotificationRegistration2.f18159d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(57, "GeneratedJsonAdapter(RequestPushNotificationRegistration)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
