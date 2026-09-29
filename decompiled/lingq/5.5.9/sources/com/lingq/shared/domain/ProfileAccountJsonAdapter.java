package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileAccountJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/ProfileAccount;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProfileAccountJsonAdapter extends AbstractC4949k<ProfileAccount> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17814a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17815b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17816c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17817d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17818e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<AccountTier> f17819f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Boolean> f17820g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor<ProfileAccount> f17821h;

    public ProfileAccountJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17814a = JsonReader.C4932a.m10513a("id", "username", "role", "email", "activity_index", "photo", "description", "cardsLimit", "cardsCount", "effectiveTier", "importsCount", "isDowngraded", "tier");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17815b = c4955q.m10565c(cls, emptySet, "id");
        this.f17816c = c4955q.m10565c(String.class, emptySet, "username");
        this.f17817d = c4955q.m10565c(String.class, emptySet, "role");
        this.f17818e = c4955q.m10565c(Integer.class, emptySet, "cardsLimit");
        this.f17819f = c4955q.m10565c(AccountTier.class, emptySet, "effectiveTier");
        this.f17820g = c4955q.m10565c(Boolean.TYPE, emptySet, "isDowngraded");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ProfileAccount mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        Integer numMo9385a3 = null;
        AccountTier accountTierMo9385a = null;
        AccountTier accountTierMo9385a2 = null;
        Integer numMo9385a4 = numMo9385a2;
        Integer numMo9385a5 = numMo9385a4;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17814a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17815b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f17816c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("username", "username", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a3 = this.f17817d.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    strMo9385a4 = this.f17816c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("email", "email", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    numMo9385a4 = this.f17815b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("activityIndex", "activity_index", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a = this.f17816c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("photo", "photo", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f17816c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("description", "description", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f17818e.mo9385a(jsonReader);
                    i10 &= -129;
                    break;
                case 8:
                    numMo9385a5 = this.f17815b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    accountTierMo9385a = this.f17819f.mo9385a(jsonReader);
                    i10 &= -513;
                    break;
                case 10:
                    numMo9385a2 = this.f17815b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("importsCount", "importsCount", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    boolMo9385a = this.f17820g.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isDowngraded", "isDowngraded", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    accountTierMo9385a2 = this.f17819f.mo9385a(jsonReader);
                    i10 &= -4097;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8192) {
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a4, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numMo9385a4.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a5, "null cannot be cast to non-null type kotlin.String");
            return new ProfileAccount(iIntValue, strMo9385a2, strMo9385a3, strMo9385a4, iIntValue2, strMo9385a, strMo9385a5, numMo9385a3, numMo9385a5.intValue(), accountTierMo9385a, numMo9385a2.intValue(), boolMo9385a.booleanValue(), accountTierMo9385a2);
        }
        String str = strMo9385a;
        String str2 = strMo9385a5;
        Constructor<ProfileAccount> declaredConstructor = this.f17821h;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ProfileAccount.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, String.class, String.class, Integer.class, cls, AccountTier.class, cls, Boolean.TYPE, AccountTier.class, cls, C9756b.f49813c);
            this.f17821h = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ProfileAccount::class.ja…his.constructorRef = it }");
        }
        ProfileAccount profileAccountNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a4, str, str2, numMo9385a3, numMo9385a5, accountTierMo9385a, numMo9385a2, boolMo9385a, accountTierMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(profileAccountNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return profileAccountNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ProfileAccount profileAccount) throws IOException {
        ProfileAccount profileAccount2 = profileAccount;
        C5207g.m11111f(abstractC9310n, "writer");
        if (profileAccount2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(profileAccount2.f17801a);
        AbstractC4949k<Integer> abstractC4949k = this.f17815b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("username");
        String str = profileAccount2.f17802b;
        AbstractC4949k<String> abstractC4949k2 = this.f17816c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("role");
        this.f17817d.mo9386f(abstractC9310n, profileAccount2.f17803c);
        abstractC9310n.mo10551C("email");
        abstractC4949k2.mo9386f(abstractC9310n, profileAccount2.f17804d);
        abstractC9310n.mo10551C("activity_index");
        C0166e.m775v(profileAccount2.f17805e, abstractC4949k, abstractC9310n, "photo");
        abstractC4949k2.mo9386f(abstractC9310n, profileAccount2.f17806f);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, profileAccount2.f17807g);
        abstractC9310n.mo10551C("cardsLimit");
        this.f17818e.mo9386f(abstractC9310n, profileAccount2.f17808h);
        abstractC9310n.mo10551C("cardsCount");
        C0166e.m775v(profileAccount2.f17809i, abstractC4949k, abstractC9310n, "effectiveTier");
        AccountTier accountTier = profileAccount2.f17810j;
        AbstractC4949k<AccountTier> abstractC4949k3 = this.f17819f;
        abstractC4949k3.mo9386f(abstractC9310n, accountTier);
        abstractC9310n.mo10551C("importsCount");
        C0166e.m775v(profileAccount2.f17811k, abstractC4949k, abstractC9310n, "isDowngraded");
        this.f17820g.mo9386f(abstractC9310n, Boolean.valueOf(profileAccount2.f17812l));
        abstractC9310n.mo10551C("tier");
        abstractC4949k3.mo9386f(abstractC9310n, profileAccount2.f17813m);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(ProfileAccount)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
