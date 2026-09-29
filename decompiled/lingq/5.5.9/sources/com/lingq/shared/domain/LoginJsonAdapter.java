package com.lingq.shared.domain;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/LoginJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/Login;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LoginJsonAdapter extends AbstractC4949k<Login> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17777a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17778b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f17779c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<Login> f17780d;

    public LoginJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17777a = JsonReader.C4932a.m10513a("keyIdentifier", "token", "key", "is_free", "new_user");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17778b = c4955q.m10565c(String.class, emptySet, "keyIdentifier");
        this.f17779c = c4955q.m10565c(Boolean.TYPE, emptySet, "isFree");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Login mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17777a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f17778b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f17778b.mo9385a(jsonReader);
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                strMo9385a3 = this.f17778b.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                boolMo9385a = this.f17779c.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isFree", "is_free", jsonReader);
                }
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                boolMo9385a2 = this.f17779c.mo9385a(jsonReader);
                if (boolMo9385a2 == null) {
                    throw C9756b.m18254m("isNewUser", "new_user", jsonReader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -32) {
            return new Login(strMo9385a, strMo9385a2, strMo9385a3, boolMo9385a.booleanValue(), boolMo9385a2.booleanValue());
        }
        Constructor<Login> declaredConstructor = this.f17780d;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            declaredConstructor = Login.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls, Integer.TYPE, C9756b.f49813c);
            this.f17780d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Login::class.java.getDec…his.constructorRef = it }");
        }
        Login loginNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, strMo9385a3, boolMo9385a, boolMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(loginNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return loginNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Login login) throws IOException {
        Login login2 = login;
        C5207g.m11111f(abstractC9310n, "writer");
        if (login2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("keyIdentifier");
        String str = login2.f17772a;
        AbstractC4949k<String> abstractC4949k = this.f17778b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("token");
        abstractC4949k.mo9386f(abstractC9310n, login2.f17773b);
        abstractC9310n.mo10551C("key");
        abstractC4949k.mo9386f(abstractC9310n, login2.f17774c);
        abstractC9310n.mo10551C("is_free");
        Boolean boolValueOf = Boolean.valueOf(login2.f17775d);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f17779c;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("new_user");
        abstractC4949k2.mo9386f(abstractC9310n, Boolean.valueOf(login2.f17776e));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(27, "GeneratedJsonAdapter(Login)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
