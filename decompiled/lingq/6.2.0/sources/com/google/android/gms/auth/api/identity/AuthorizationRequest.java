package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import p000.C3670v2;
import p000.l70;
import p000.lda;
import p000.x74;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new C3670v2(14);

    /* JADX INFO: renamed from: a */
    public final List f11551a;

    /* JADX INFO: renamed from: b */
    public final String f11552b;

    /* JADX INFO: renamed from: c */
    public final boolean f11553c;

    /* JADX INFO: renamed from: d */
    public final boolean f11554d;

    /* JADX INFO: renamed from: e */
    public final Account f11555e;

    /* JADX INFO: renamed from: f */
    public final String f11556f;

    /* JADX INFO: renamed from: g */
    public final String f11557g;

    /* JADX INFO: renamed from: h */
    public final boolean f11558h;

    /* JADX INFO: renamed from: i */
    public final Bundle f11559i;

    /* JADX INFO: renamed from: j */
    public final boolean f11560j;

    /* JADX INFO: renamed from: k */
    public final int f11561k;

    /* JADX INFO: loaded from: classes2.dex */
    public enum ResourceParameter {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");

        final String zba;

        ResourceParameter(String str) {
            this.zba = str;
        }
    }

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4, int i) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        lda.m16124j("requestedScopes cannot be null or empty", z5);
        this.f11551a = list;
        this.f11552b = str;
        this.f11553c = z;
        this.f11554d = z2;
        this.f11555e = account;
        this.f11556f = str2;
        this.f11557g = str3;
        this.f11558h = z3;
        this.f11559i = bundle;
        this.f11560j = z4;
        this.f11561k = i;
    }

    /* JADX INFO: renamed from: r */
    public static C0944a m5267r(AuthorizationRequest authorizationRequest) {
        ResourceParameter resourceParameter;
        C0944a c0944a = new C0944a();
        c0944a.f11579k = 0;
        List list = authorizationRequest.f11551a;
        lda.m16124j("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        c0944a.f11569a = list;
        Bundle bundle = authorizationRequest.f11559i;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                ResourceParameter[] resourceParameterArrValues = ResourceParameter.values();
                int length = resourceParameterArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        resourceParameter = null;
                        break;
                    }
                    resourceParameter = resourceParameterArrValues[i];
                    if (resourceParameter.zba.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && resourceParameter != null) {
                    if (c0944a.f11577i == null) {
                        c0944a.f11577i = new Bundle();
                    }
                    c0944a.f11577i.putString(resourceParameter.zba, string);
                }
            }
        }
        boolean z = authorizationRequest.f11558h;
        String str2 = authorizationRequest.f11557g;
        String str3 = authorizationRequest.f11556f;
        Account account = authorizationRequest.f11555e;
        String str4 = authorizationRequest.f11552b;
        if (str2 != null) {
            c0944a.f11575g = str2;
        }
        if (str3 != null) {
            lda.m16127m(str3);
            c0944a.f11574f = str3;
        }
        if (account != null) {
            c0944a.f11573e = account;
        }
        if (authorizationRequest.f11554d && str4 != null) {
            c0944a.m5269a(str4);
            c0944a.f11570b = str4;
            c0944a.f11572d = true;
        }
        if (authorizationRequest.f11553c && str4 != null) {
            c0944a.m5269a(str4);
            c0944a.f11570b = str4;
            c0944a.f11571c = true;
            c0944a.f11576h = z;
            if (z) {
                c0944a.f11579k |= 1;
            }
        }
        c0944a.f11578j = authorizationRequest.f11560j;
        c0944a.f11579k = authorizationRequest.f11561k;
        return c0944a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f11551a;
        int size = list.size();
        List list2 = authorizationRequest.f11551a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.f11559i;
            Bundle bundle2 = this.f11559i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!x74.m24360q(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f11553c == authorizationRequest.f11553c && this.f11558h == authorizationRequest.f11558h && this.f11554d == authorizationRequest.f11554d && this.f11560j == authorizationRequest.f11560j && this.f11561k == authorizationRequest.f11561k && x74.m24360q(this.f11552b, authorizationRequest.f11552b) && x74.m24360q(this.f11555e, authorizationRequest.f11555e) && x74.m24360q(this.f11556f, authorizationRequest.f11556f) && x74.m24360q(this.f11557g, authorizationRequest.f11557g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11551a, this.f11552b, Boolean.valueOf(this.f11553c), Boolean.valueOf(this.f11558h), Boolean.valueOf(this.f11554d), this.f11555e, this.f11556f, this.f11557g, this.f11559i, Boolean.valueOf(this.f11560j), Integer.valueOf(this.f11561k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15934Y(parcel, 1, this.f11551a);
        l70.m15930U(parcel, 2, this.f11552b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11553c ? 1 : 0);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11554d ? 1 : 0);
        l70.m15929T(parcel, 5, this.f11555e, i);
        l70.m15930U(parcel, 6, this.f11556f);
        l70.m15930U(parcel, 7, this.f11557g);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f11558h ? 1 : 0);
        l70.m15924O(parcel, 9, this.f11559i);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeInt(this.f11560j ? 1 : 0);
        l70.m15935Z(parcel, 11, 4);
        parcel.writeInt(this.f11561k);
        l70.m15939b0(parcel, iM15937a0);
    }
}
