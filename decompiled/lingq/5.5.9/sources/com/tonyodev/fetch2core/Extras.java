package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C6753d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/tonyodev/fetch2core/Extras;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "a", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class Extras implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b */
    public static final Extras f32540b = new Extras(C6753d.m13459L0());

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f32541a;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.Extras$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<Extras> {
        @Override // android.os.Parcelable.Creator
        public final Extras createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            Serializable serializable = parcel.readSerializable();
            if (serializable != null) {
                return new Extras((HashMap) serializable);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }

        @Override // android.os.Parcelable.Creator
        public final Extras[] newArray(int i10) {
            return new Extras[i10];
        }
    }

    public Extras(Map<String, String> map) {
        C5207g.m11112g(map, "data");
        this.f32541a = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m10685a() {
        Map<String, String> map = this.f32541a;
        if (map.isEmpty()) {
            return "{}";
        }
        String string = new JSONObject(C6753d.m13465R0(map)).toString();
        C5207g.m11107b(string, "JSONObject(map).toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(C5207g.m11106a(this.f32541a, ((Extras) obj).f32541a) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.Extras");
    }

    public int hashCode() {
        return this.f32541a.hashCode();
    }

    public String toString() {
        return m10685a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeSerializable(new HashMap(this.f32541a));
    }
}
