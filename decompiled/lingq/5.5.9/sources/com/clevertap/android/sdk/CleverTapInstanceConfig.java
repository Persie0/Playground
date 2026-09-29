package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0141b;
import android.text.TextUtils;
import com.clevertap.android.sdk.pushnotification.C2258d;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0009a;
import p290o6.C7967l0;
import p290o6.InterfaceC7984w;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new C2175a();

    /* JADX INFO: renamed from: H */
    public final boolean f10988H;

    /* JADX INFO: renamed from: I */
    public C2181a f10989I;

    /* JADX INFO: renamed from: J */
    public final String f10990J;

    /* JADX INFO: renamed from: K */
    public final boolean f10991K;

    /* JADX INFO: renamed from: L */
    public final String[] f10992L;

    /* JADX INFO: renamed from: M */
    public final boolean f10993M;

    /* JADX INFO: renamed from: N */
    public final boolean f10994N;

    /* JADX INFO: renamed from: a */
    public final String f10995a;

    /* JADX INFO: renamed from: b */
    public final String f10996b;

    /* JADX INFO: renamed from: c */
    public final String f10997c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> f10998d;

    /* JADX INFO: renamed from: e */
    public final boolean f10999e;

    /* JADX INFO: renamed from: f */
    public final boolean f11000f;

    /* JADX INFO: renamed from: g */
    public final boolean f11001g;

    /* JADX INFO: renamed from: h */
    public boolean f11002h;

    /* JADX INFO: renamed from: i */
    public final int f11003i;

    /* JADX INFO: renamed from: j */
    public final boolean f11004j;

    /* JADX INFO: renamed from: k */
    public final boolean f11005k;

    /* JADX INFO: renamed from: l */
    public final String f11006l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapInstanceConfig$a */
    public class C2175a implements Parcelable.Creator<CleverTapInstanceConfig> {
        @Override // android.os.Parcelable.Creator
        public final CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CleverTapInstanceConfig[] newArray(int i10) {
            return new CleverTapInstanceConfig[i10];
        }
    }

    public CleverTapInstanceConfig(Context context, String str, String str2, String str3) {
        this.f10998d = C2258d.m6571a();
        this.f10992L = InterfaceC7984w.f43431d;
        this.f10995a = str;
        this.f10997c = str2;
        this.f10996b = str3;
        this.f10988H = true;
        this.f10999e = false;
        this.f10991K = true;
        int iIntValue = CleverTapAPI.LogLevel.INFO.intValue();
        this.f11003i = iIntValue;
        this.f10989I = new C2181a(iIntValue);
        this.f11002h = false;
        C7967l0 c7967l0M15806h = C7967l0.m15806h(context);
        c7967l0M15806h.getClass();
        this.f10994N = C7967l0.f43374e;
        this.f11004j = C7967l0.f43375f;
        this.f10993M = C7967l0.f43379j;
        this.f11000f = C7967l0.f43380k;
        this.f11006l = C7967l0.f43365H;
        this.f10990J = C7967l0.f43366I;
        this.f11005k = C7967l0.f43381l;
        this.f11001g = C7967l0.f43367J;
        String[] strArr = (String[]) c7967l0M15806h.f43382a;
        this.f10992L = strArr;
        m6434c("ON_USER_LOGIN", "Setting Profile Keys from Manifest: " + Arrays.toString(strArr));
    }

    public CleverTapInstanceConfig(Parcel parcel) {
        this.f10998d = C2258d.m6571a();
        this.f10992L = InterfaceC7984w.f43431d;
        this.f10995a = parcel.readString();
        this.f10997c = parcel.readString();
        this.f10996b = parcel.readString();
        this.f10999e = parcel.readByte() != 0;
        this.f10988H = parcel.readByte() != 0;
        this.f10994N = parcel.readByte() != 0;
        this.f11004j = parcel.readByte() != 0;
        this.f10991K = parcel.readByte() != 0;
        int i10 = parcel.readInt();
        this.f11003i = i10;
        this.f11002h = parcel.readByte() != 0;
        this.f10993M = parcel.readByte() != 0;
        this.f11000f = parcel.readByte() != 0;
        this.f11005k = parcel.readByte() != 0;
        this.f11006l = parcel.readString();
        this.f10990J = parcel.readString();
        this.f10989I = new C2181a(i10);
        this.f11001g = parcel.readByte() != 0;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f10998d = arrayList;
        parcel.readList(arrayList, String.class.getClassLoader());
        this.f10992L = parcel.createStringArray();
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f10998d = C2258d.m6571a();
        this.f10992L = InterfaceC7984w.f43431d;
        this.f10995a = cleverTapInstanceConfig.f10995a;
        this.f10997c = cleverTapInstanceConfig.f10997c;
        this.f10996b = cleverTapInstanceConfig.f10996b;
        this.f10988H = cleverTapInstanceConfig.f10988H;
        this.f10999e = cleverTapInstanceConfig.f10999e;
        this.f10991K = cleverTapInstanceConfig.f10991K;
        this.f11003i = cleverTapInstanceConfig.f11003i;
        this.f10989I = cleverTapInstanceConfig.f10989I;
        this.f10994N = cleverTapInstanceConfig.f10994N;
        this.f11004j = cleverTapInstanceConfig.f11004j;
        this.f11002h = cleverTapInstanceConfig.f11002h;
        this.f10993M = cleverTapInstanceConfig.f10993M;
        this.f11000f = cleverTapInstanceConfig.f11000f;
        this.f11005k = cleverTapInstanceConfig.f11005k;
        this.f11006l = cleverTapInstanceConfig.f11006l;
        this.f10990J = cleverTapInstanceConfig.f10990J;
        this.f11001g = cleverTapInstanceConfig.f11001g;
        this.f10998d = cleverTapInstanceConfig.f10998d;
        this.f10992L = cleverTapInstanceConfig.f10992L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CleverTapInstanceConfig(String str) throws Throwable {
        this.f10998d = C2258d.m6571a();
        this.f10992L = InterfaceC7984w.f43431d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("accountId")) {
                this.f10995a = jSONObject.getString("accountId");
            }
            if (jSONObject.has("accountToken")) {
                this.f10997c = jSONObject.getString("accountToken");
            }
            if (jSONObject.has("accountRegion")) {
                this.f10996b = jSONObject.getString("accountRegion");
            }
            if (jSONObject.has("analyticsOnly")) {
                this.f10999e = jSONObject.getBoolean("analyticsOnly");
            }
            if (jSONObject.has("isDefaultInstance")) {
                this.f10988H = jSONObject.getBoolean("isDefaultInstance");
            }
            if (jSONObject.has("useGoogleAdId")) {
                this.f10994N = jSONObject.getBoolean("useGoogleAdId");
            }
            if (jSONObject.has("disableAppLaunchedEvent")) {
                this.f11004j = jSONObject.getBoolean("disableAppLaunchedEvent");
            }
            if (jSONObject.has("personalization")) {
                this.f10991K = jSONObject.getBoolean("personalization");
            }
            if (jSONObject.has("debugLevel")) {
                this.f11003i = jSONObject.getInt("debugLevel");
            }
            this.f10989I = new C2181a(this.f11003i);
            if (jSONObject.has("packageName")) {
                this.f10990J = jSONObject.getString("packageName");
            }
            if (jSONObject.has("createdPostAppLaunch")) {
                this.f11002h = jSONObject.getBoolean("createdPostAppLaunch");
            }
            if (jSONObject.has("sslPinning")) {
                this.f10993M = jSONObject.getBoolean("sslPinning");
            }
            if (jSONObject.has("backgroundSync")) {
                this.f11000f = jSONObject.getBoolean("backgroundSync");
            }
            if (jSONObject.has("getEnableCustomCleverTapId")) {
                this.f11005k = jSONObject.getBoolean("getEnableCustomCleverTapId");
            }
            if (jSONObject.has("fcmSenderId")) {
                this.f11006l = jSONObject.getString("fcmSenderId");
            }
            if (jSONObject.has("beta")) {
                this.f11001g = jSONObject.getBoolean("beta");
            }
            if (jSONObject.has("allowedPushTypes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("allowedPushTypes");
                ArrayList<String> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(jSONArray.get(i10));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                this.f10998d = arrayList;
            }
            if (jSONObject.has("identityTypes")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("identityTypes");
                Object[] objArr = new Object[jSONArray2.length()];
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    try {
                        objArr[i11] = jSONArray2.get(i11);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
                this.f10992L = (String[]) objArr;
            }
        } catch (Throwable th2) {
            C2181a.m6457j(C0141b.m611g("Error constructing CleverTapInstanceConfig from JSON: ", str, ": "), th2.getCause());
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m6432a(String str) {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(!TextUtils.isEmpty(str) ? ":".concat(str) : "");
        sb2.append(":");
        return C0009a.m23l(sb2, this.f10995a, "]");
    }

    /* JADX INFO: renamed from: b */
    public final C2181a m6433b() {
        if (this.f10989I == null) {
            this.f10989I = new C2181a(this.f11003i);
        }
        return this.f10989I;
    }

    /* JADX INFO: renamed from: c */
    public final void m6434c(String str, String str2) {
        C2181a c2181a = this.f10989I;
        String strM6432a = m6432a(str);
        c2181a.getClass();
        C2181a.m6460m(strM6432a, str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m6435d(String str, Throwable th2) {
        C2181a c2181a = this.f10989I;
        String strM6432a = m6432a("PushProvider");
        c2181a.getClass();
        C2181a.m6461n(strM6432a, str, th2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10995a);
        parcel.writeString(this.f10997c);
        parcel.writeString(this.f10996b);
        parcel.writeByte(this.f10999e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10988H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10994N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11004j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10991K ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11003i);
        parcel.writeByte(this.f11002h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10993M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11000f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11005k ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f11006l);
        parcel.writeString(this.f10990J);
        parcel.writeByte(this.f11001g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f10998d);
        parcel.writeStringArray(this.f10992L);
    }
}
