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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/AccountTierJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/AccountTier;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AccountTierJsonAdapter extends AbstractC4949k<AccountTier> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17766a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17767b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17768c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17769d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<AccountTier> f17770e;

    public AccountTierJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17766a = JsonReader.C4932a.m10513a("id", "title", "lifetimePremium", "pointsDiscount");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17767b = c4955q.m10565c(cls, emptySet, "id");
        this.f17768c = c4955q.m10565c(String.class, emptySet, "title");
        this.f17769d = c4955q.m10565c(Boolean.class, emptySet, "lifetimePremium");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final AccountTier mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        Integer numMo9385a2 = null;
        Boolean boolMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17766a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f17767b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f17768c.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                boolMo9385a = this.f17769d.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3 && (numMo9385a2 = this.f17767b.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("pointsDiscount", "pointsDiscount", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -5) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("id", "id", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (strMo9385a == null) {
                throw C9756b.m18248g("title", "title", jsonReader);
            }
            if (numMo9385a2 != null) {
                return new AccountTier(iIntValue, strMo9385a, boolMo9385a, numMo9385a2.intValue());
            }
            throw C9756b.m18248g("pointsDiscount", "pointsDiscount", jsonReader);
        }
        Constructor<AccountTier> declaredConstructor = this.f17770e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = AccountTier.class.getDeclaredConstructor(cls, String.class, Boolean.class, cls, cls, C9756b.f49813c);
            this.f17770e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "AccountTier::class.java.…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        if (strMo9385a == null) {
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        objArr[1] = strMo9385a;
        objArr[2] = boolMo9385a;
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("pointsDiscount", "pointsDiscount", jsonReader);
        }
        objArr[3] = Integer.valueOf(numMo9385a2.intValue());
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        AccountTier accountTierNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(accountTierNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return accountTierNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, AccountTier accountTier) throws IOException {
        AccountTier accountTier2 = accountTier;
        C5207g.m11111f(abstractC9310n, "writer");
        if (accountTier2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(accountTier2.f17762a);
        AbstractC4949k<Integer> abstractC4949k = this.f17767b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("title");
        this.f17768c.mo9386f(abstractC9310n, accountTier2.f17763b);
        abstractC9310n.mo10551C("lifetimePremium");
        this.f17769d.mo9386f(abstractC9310n, accountTier2.f17764c);
        abstractC9310n.mo10551C("pointsDiscount");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(accountTier2.f17765d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(33, "GeneratedJsonAdapter(AccountTier)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
