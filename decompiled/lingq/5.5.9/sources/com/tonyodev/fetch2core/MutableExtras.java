package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C6753d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/tonyodev/fetch2core/MutableExtras;", "Lcom/tonyodev/fetch2core/Extras;", "Ljava/io/Serializable;", "CREATOR", "a", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class MutableExtras extends Extras {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f32543c;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.MutableExtras$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<MutableExtras> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Parcelable.Creator
        public final MutableExtras createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            Serializable serializable = parcel.readSerializable();
            if (serializable != null) {
                return new MutableExtras(C6753d.m13467T0((HashMap) serializable));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }

        @Override // android.os.Parcelable.Creator
        public final MutableExtras[] newArray(int i10) {
            return new MutableExtras[i10];
        }
    }

    public MutableExtras() {
        this(new LinkedHashMap());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableExtras(Map<String, String> map) {
        super(map);
        C5207g.m11112g(map, "mutableData");
        this.f32543c = map;
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(!C5207g.m11106a(getClass(), obj != null ? obj.getClass() : null)) && super.equals(obj)) {
            if (obj != null) {
                return !(C5207g.m11106a(this.f32543c, ((MutableExtras) obj).f32543c) ^ true);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.MutableExtras");
        }
        return false;
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final int hashCode() {
        return this.f32543c.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final String toString() {
        return m10685a();
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeSerializable(new HashMap(this.f32543c));
    }
}
