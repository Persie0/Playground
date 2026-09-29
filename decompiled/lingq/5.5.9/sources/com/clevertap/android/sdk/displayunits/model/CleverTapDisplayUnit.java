package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.displayunits.CTDisplayUnitType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new C2187a();

    /* JADX INFO: renamed from: a */
    public final String f11049a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<CleverTapDisplayUnitContent> f11050b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, String> f11051c;

    /* JADX INFO: renamed from: d */
    public final String f11052d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f11053e;

    /* JADX INFO: renamed from: f */
    public final CTDisplayUnitType f11054f;

    /* JADX INFO: renamed from: g */
    public final String f11055g;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit$a */
    public class C2187a implements Parcelable.Creator<CleverTapDisplayUnit> {
        @Override // android.os.Parcelable.Creator
        public final CleverTapDisplayUnit createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnit(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CleverTapDisplayUnit[] newArray(int i10) {
            return new CleverTapDisplayUnit[i10];
        }
    }

    public CleverTapDisplayUnit(Parcel parcel) {
        try {
            this.f11055g = parcel.readString();
            this.f11054f = (CTDisplayUnitType) parcel.readValue(CTDisplayUnitType.class.getClassLoader());
            this.f11049a = parcel.readString();
            JSONObject jSONObject = null;
            if (parcel.readByte() == 1) {
                ArrayList<CleverTapDisplayUnitContent> arrayList = new ArrayList<>();
                this.f11050b = arrayList;
                parcel.readList(arrayList, CleverTapDisplayUnitContent.class.getClassLoader());
            } else {
                this.f11050b = null;
            }
            this.f11051c = parcel.readHashMap(null);
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.f11053e = jSONObject;
            this.f11052d = parcel.readString();
        } catch (Exception e10) {
            String str = "Error Creating Display Unit from parcel : " + e10.getLocalizedMessage();
            this.f11052d = str;
            C2181a.m6450b("DisplayUnit : ", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    public CleverTapDisplayUnit(JSONObject jSONObject, String str, CTDisplayUnitType cTDisplayUnitType, String str2, ArrayList<CleverTapDisplayUnitContent> arrayList, JSONObject jSONObject2, String str3) {
        this.f11053e = jSONObject;
        this.f11055g = str;
        this.f11054f = cTDisplayUnitType;
        this.f11049a = str2;
        this.f11050b = arrayList;
        HashMap<String, String> map = null;
        if (jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                if (itKeys != null) {
                    HashMap<String, String> map2 = null;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            map2 = map2 == null ? new HashMap<>() : map2;
                            map2.put(next, string);
                        }
                    }
                    map = map2;
                }
            } catch (Exception e10) {
                C2181a.m6450b("DisplayUnit : ", "Error in getting Key Value Pairs " + e10.getLocalizedMessage());
            }
        }
        this.f11051c = map;
        this.f11052d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static CleverTapDisplayUnit m6483a(JSONObject jSONObject) {
        try {
            String string = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            CTDisplayUnitType cTDisplayUnitTypeType = jSONObject.has("type") ? CTDisplayUnitType.type(jSONObject.getString("type")) : null;
            String string2 = jSONObject.has("bg") ? jSONObject.getString("bg") : "";
            JSONArray jSONArray = jSONObject.has("content") ? jSONObject.getJSONArray("content") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContentM6484a = CleverTapDisplayUnitContent.m6484a(jSONArray.getJSONObject(i10));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitContentM6484a.f11058c)) {
                        arrayList.add(cleverTapDisplayUnitContentM6484a);
                    }
                }
            }
            return new CleverTapDisplayUnit(jSONObject, string, cTDisplayUnitTypeType, string2, arrayList, jSONObject.has("custom_kv") ? jSONObject.getJSONObject("custom_kv") : null, null);
        } catch (Exception e10) {
            C2181a.m6450b("DisplayUnit : ", "Unable to init CleverTapDisplayUnit with JSON - " + e10.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e10.getLocalizedMessage());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(" Unit id- ");
            sb2.append(this.f11055g);
            sb2.append(", Type- ");
            CTDisplayUnitType cTDisplayUnitType = this.f11054f;
            sb2.append(cTDisplayUnitType != null ? cTDisplayUnitType.toString() : null);
            sb2.append(", bgColor- ");
            sb2.append(this.f11049a);
            ArrayList<CleverTapDisplayUnitContent> arrayList = this.f11050b;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = arrayList.get(i10);
                    if (cleverTapDisplayUnitContent != null) {
                        sb2.append(", Content Item:");
                        sb2.append(i10);
                        sb2.append(" ");
                        sb2.append(cleverTapDisplayUnitContent.toString());
                        sb2.append("\n");
                    }
                }
            }
            HashMap<String, String> map = this.f11051c;
            if (map != null) {
                sb2.append(", Custom KV:");
                sb2.append(map);
            }
            sb2.append(", JSON -");
            sb2.append(this.f11053e);
            sb2.append(", Error-");
            sb2.append(this.f11052d);
            sb2.append(" ]");
            return sb2.toString();
        } catch (Exception e10) {
            C2181a.m6450b("DisplayUnit : ", "Exception in toString:" + e10);
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11055g);
        parcel.writeValue(this.f11054f);
        parcel.writeString(this.f11049a);
        ArrayList<CleverTapDisplayUnitContent> arrayList = this.f11050b;
        if (arrayList == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList);
        }
        parcel.writeMap(this.f11051c);
        JSONObject jSONObject = this.f11053e;
        if (jSONObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject.toString());
        }
        parcel.writeString(this.f11052d);
    }
}
