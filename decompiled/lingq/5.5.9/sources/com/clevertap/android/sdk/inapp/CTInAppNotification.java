package com.clevertap.android.sdk.inapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.clevertap.android.sdk.C2181a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p066d7.C5051c;
import p066d7.C5052d;

/* JADX INFO: loaded from: classes.dex */
public class CTInAppNotification implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotification> CREATOR = new C2194a();

    /* JADX INFO: renamed from: H */
    public int f11078H;

    /* JADX INFO: renamed from: I */
    public int f11079I;

    /* JADX INFO: renamed from: J */
    public boolean f11080J;

    /* JADX INFO: renamed from: K */
    public String f11081K;

    /* JADX INFO: renamed from: L */
    public String f11082L;

    /* JADX INFO: renamed from: M */
    public CTInAppType f11083M;

    /* JADX INFO: renamed from: N */
    public boolean f11084N;

    /* JADX INFO: renamed from: O */
    public boolean f11085O;

    /* JADX INFO: renamed from: P */
    public boolean f11086P;

    /* JADX INFO: renamed from: Q */
    public boolean f11087Q;

    /* JADX INFO: renamed from: R */
    public JSONObject f11088R;

    /* JADX INFO: renamed from: S */
    public final String f11089S;

    /* JADX INFO: renamed from: T */
    public int f11090T;

    /* JADX INFO: renamed from: U */
    public final ArrayList<CTInAppNotificationMedia> f11091U;

    /* JADX INFO: renamed from: V */
    public String f11092V;

    /* JADX INFO: renamed from: W */
    public String f11093W;

    /* JADX INFO: renamed from: X */
    public char f11094X;

    /* JADX INFO: renamed from: Y */
    public boolean f11095Y;

    /* JADX INFO: renamed from: Z */
    public long f11096Z;

    /* JADX INFO: renamed from: a */
    public InterfaceC2196c f11097a;

    /* JADX INFO: renamed from: a0 */
    public String f11098a0;

    /* JADX INFO: renamed from: b */
    public final String f11099b;

    /* JADX INFO: renamed from: b0 */
    public String f11100b0;

    /* JADX INFO: renamed from: c */
    public final JSONObject f11101c;

    /* JADX INFO: renamed from: c0 */
    public int f11102c0;

    /* JADX INFO: renamed from: d */
    public String f11103d;

    /* JADX INFO: renamed from: d0 */
    public int f11104d0;

    /* JADX INFO: renamed from: e */
    public int f11105e;

    /* JADX INFO: renamed from: e0 */
    public String f11106e0;

    /* JADX INFO: renamed from: f */
    public final ArrayList<CTInAppNotificationButton> f11107f;

    /* JADX INFO: renamed from: f0 */
    public boolean f11108f0;

    /* JADX INFO: renamed from: g */
    public String f11109g;

    /* JADX INFO: renamed from: g0 */
    public int f11110g0;

    /* JADX INFO: renamed from: h */
    public JSONObject f11111h;

    /* JADX INFO: renamed from: h0 */
    public int f11112h0;

    /* JADX INFO: renamed from: i */
    public String f11113i;

    /* JADX INFO: renamed from: i0 */
    public boolean f11114i0;

    /* JADX INFO: renamed from: j */
    public boolean f11115j;

    /* JADX INFO: renamed from: j0 */
    public boolean f11116j0;

    /* JADX INFO: renamed from: k */
    public String f11117k;

    /* JADX INFO: renamed from: l */
    public boolean f11118l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$a */
    public class C2194a implements Parcelable.Creator<CTInAppNotification> {
        @Override // android.os.Parcelable.Creator
        public final CTInAppNotification createFromParcel(Parcel parcel) {
            return new CTInAppNotification(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInAppNotification[] newArray(int i10) {
            return new CTInAppNotification[i10];
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$b */
    public static /* synthetic */ class C2195b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11119a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            f11119a = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeFooter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeHeader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeCover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11119a[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$c */
    public interface InterfaceC2196c {
        /* JADX INFO: renamed from: a */
        void mo6493a(CTInAppNotification cTInAppNotification);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$d */
    public static class C2197d {

        /* JADX INFO: renamed from: a */
        public static final int f11120a;

        /* JADX INFO: renamed from: b */
        public static final int f11121b;

        /* JADX INFO: renamed from: c */
        public static C2212c0 f11122c;

        static {
            int iMaxMemory = ((int) Runtime.getRuntime().maxMemory()) / 1024;
            f11120a = iMaxMemory;
            f11121b = Math.max(iMaxMemory / 32, 5120);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public static void m6494a() {
            boolean z10;
            synchronized (C2197d.class) {
                try {
                    synchronized (C2197d.class) {
                        z10 = f11122c.size() <= 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                C2181a.m6455h("CTInAppNotification.GifCache: cache is empty, removing it");
                f11122c = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m6495b(String str) {
            byte[] bArr;
            synchronized (C2197d.class) {
                C2212c0 c2212c0 = f11122c;
                bArr = c2212c0 == null ? null : c2212c0.get(str);
            }
            return bArr;
        }
    }

    public CTInAppNotification() {
        this.f11107f = new ArrayList<>();
        this.f11091U = new ArrayList<>();
        this.f11114i0 = false;
        this.f11116j0 = false;
    }

    public CTInAppNotification(Parcel parcel) {
        this.f11107f = new ArrayList<>();
        this.f11091U = new ArrayList<>();
        this.f11114i0 = false;
        this.f11116j0 = false;
        try {
            this.f11082L = parcel.readString();
            this.f11109g = parcel.readString();
            this.f11083M = (CTInAppType) parcel.readValue(CTInAppType.class.getClassLoader());
            this.f11081K = parcel.readString();
            this.f11118l = parcel.readByte() != 0;
            this.f11095Y = parcel.readByte() != 0;
            this.f11115j = parcel.readByte() != 0;
            this.f11090T = parcel.readInt();
            this.f11104d0 = parcel.readInt();
            this.f11102c0 = parcel.readInt();
            this.f11094X = ((Character) parcel.readValue(Character.TYPE.getClassLoader())).charValue();
            this.f11078H = parcel.readInt();
            this.f11079I = parcel.readInt();
            this.f11110g0 = parcel.readInt();
            this.f11112h0 = parcel.readInt();
            JSONObject jSONObject = null;
            this.f11088R = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.f11117k = parcel.readString();
            this.f11111h = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.f11101c = jSONObject;
            this.f11106e0 = parcel.readString();
            this.f11098a0 = parcel.readString();
            this.f11100b0 = parcel.readString();
            this.f11103d = parcel.readString();
            this.f11092V = parcel.readString();
            this.f11093W = parcel.readString();
            try {
                this.f11107f = parcel.createTypedArrayList(CTInAppNotificationButton.CREATOR);
            } catch (Throwable unused) {
            }
            try {
                this.f11091U = parcel.createTypedArrayList(CTInAppNotificationMedia.CREATOR);
            } catch (Throwable unused2) {
            }
            this.f11080J = parcel.readByte() != 0;
            this.f11105e = parcel.readInt();
            this.f11086P = parcel.readByte() != 0;
            this.f11113i = parcel.readString();
            this.f11087Q = parcel.readByte() != 0;
            this.f11085O = parcel.readByte() != 0;
            this.f11084N = parcel.readByte() != 0;
            this.f11114i0 = parcel.readByte() != 0;
            this.f11116j0 = parcel.readByte() != 0;
            this.f11089S = parcel.readString();
            this.f11099b = parcel.readString();
            this.f11096Z = parcel.readLong();
        } catch (JSONException unused3) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m6487b(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Character) {
                        bundle.putChar(next, ((Character) obj).charValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putBundle(next, m6487b((JSONObject) obj));
                    }
                } catch (JSONException unused) {
                    C2181a.m6455h("Key had unknown object. Discarding");
                }
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m6488c(CTInAppNotificationMedia cTInAppNotificationMedia) {
        Bitmap bitmap;
        String str = cTInAppNotificationMedia.f11135b;
        int i10 = C5052d.f32898a;
        synchronized (C5052d.class) {
            bitmap = null;
            try {
                if (str != null) {
                    C5051c c5051c = C5052d.f32900c;
                    if (c5051c != null) {
                        bitmap = c5051c.get(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6489e(Bundle bundle, String str, Class cls) {
        return bundle.containsKey(str) && bundle.get(str).getClass().equals(cls);
    }

    /* JADX INFO: renamed from: a */
    public final void m6490a(JSONObject jSONObject) {
        CTInAppNotificationMedia cTInAppNotificationMediaM6497a;
        CTInAppNotificationMedia cTInAppNotificationMediaM6497a2;
        try {
            this.f11082L = jSONObject.has("ti") ? jSONObject.getString("ti") : "";
            this.f11109g = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "";
            this.f11106e0 = jSONObject.getString("type");
            this.f11114i0 = jSONObject.has("isLocalInApp") && jSONObject.getBoolean("isLocalInApp");
            this.f11116j0 = jSONObject.has("fallbackToNotificationSettings") && jSONObject.getBoolean("fallbackToNotificationSettings");
            this.f11118l = jSONObject.has("efc") && jSONObject.getInt("efc") == 1;
            this.f11104d0 = jSONObject.has("tlc") ? jSONObject.getInt("tlc") : -1;
            this.f11102c0 = jSONObject.has("tdc") ? jSONObject.getInt("tdc") : -1;
            this.f11083M = CTInAppType.fromString(this.f11106e0);
            this.f11086P = jSONObject.has("tablet") && jSONObject.getBoolean("tablet");
            this.f11103d = jSONObject.has("bg") ? jSONObject.getString("bg") : "#FFFFFF";
            this.f11085O = !jSONObject.has("hasPortrait") || jSONObject.getBoolean("hasPortrait");
            this.f11084N = jSONObject.has("hasLandscape") && jSONObject.getBoolean("hasLandscape");
            this.f11096Z = jSONObject.has("wzrk_ttl") ? jSONObject.getLong("wzrk_ttl") : System.currentTimeMillis() + 172800000;
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            if (jSONObject2 != null) {
                this.f11098a0 = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                this.f11100b0 = jSONObject2.has("color") ? jSONObject2.getString("color") : "#000000";
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                this.f11092V = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                this.f11093W = jSONObject3.has("color") ? jSONObject3.getString("color") : "#000000";
            }
            this.f11080J = jSONObject.has("close") && jSONObject.getBoolean("close");
            JSONObject jSONObject4 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            ArrayList<CTInAppNotificationMedia> arrayList = this.f11091U;
            if (jSONObject4 != null && (cTInAppNotificationMediaM6497a2 = new CTInAppNotificationMedia().m6497a(jSONObject4, 1)) != null) {
                arrayList.add(cTInAppNotificationMediaM6497a2);
            }
            JSONObject jSONObject5 = jSONObject.has("mediaLandscape") ? jSONObject.getJSONObject("mediaLandscape") : null;
            if (jSONObject5 != null && (cTInAppNotificationMediaM6497a = new CTInAppNotificationMedia().m6497a(jSONObject5, 2)) != null) {
                arrayList.add(cTInAppNotificationMediaM6497a);
            }
            JSONArray jSONArray = jSONObject.has("buttons") ? jSONObject.getJSONArray("buttons") : null;
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    CTInAppNotificationButton cTInAppNotificationButton = new CTInAppNotificationButton();
                    cTInAppNotificationButton.m6496a(jSONArray.getJSONObject(i10));
                    if (cTInAppNotificationButton.f11127e == null) {
                        this.f11107f.add(cTInAppNotificationButton);
                        this.f11105e++;
                    }
                }
            }
            switch (C2195b.f11119a[this.f11083M.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    for (CTInAppNotificationMedia cTInAppNotificationMedia : arrayList) {
                        if (cTInAppNotificationMedia.m6499c() || cTInAppNotificationMedia.m6498b() || cTInAppNotificationMedia.m6501e()) {
                            cTInAppNotificationMedia.f11137d = null;
                            C2181a.m6449a("Unable to download to media. Wrong media type for template");
                        }
                    }
                    break;
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (arrayList.isEmpty()) {
                        this.f11117k = "No media type for template";
                    } else {
                        for (CTInAppNotificationMedia cTInAppNotificationMedia2 : arrayList) {
                            if (cTInAppNotificationMedia2.m6499c() || cTInAppNotificationMedia2.m6498b() || cTInAppNotificationMedia2.m6501e() || !cTInAppNotificationMedia2.m6500d()) {
                                this.f11117k = "Wrong media type for template";
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        } catch (JSONException e10) {
            this.f11117k = "Invalid JSON" + e10.getLocalizedMessage();
        }
    }

    /* JADX INFO: renamed from: d */
    public final CTInAppNotificationMedia m6491d(int i10) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : this.f11091U) {
            if (i10 == cTInAppNotificationMedia.f11134a) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a9 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e3 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ef A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0221 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0236 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0103 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0138 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x013d A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0153 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0169 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0177 A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017f A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x018c A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:49:0x00c1, B:52:0x00c9, B:54:0x00cf, B:56:0x00d9, B:58:0x00df, B:60:0x00e9, B:65:0x00f5, B:67:0x0103, B:69:0x010a, B:71:0x0114, B:73:0x011b, B:75:0x0125, B:79:0x012e, B:81:0x0138, B:83:0x014a, B:85:0x0153, B:88:0x015b, B:90:0x0169, B:91:0x016d, B:93:0x0177, B:94:0x017b, B:96:0x017f, B:97:0x0186, B:99:0x018c, B:101:0x01a9, B:103:0x01af, B:105:0x01b7, B:107:0x01bd, B:109:0x01c5, B:111:0x01cb, B:113:0x01d3, B:115:0x01d9, B:117:0x01e3, B:118:0x01e7, B:119:0x01eb, B:121:0x01ef, B:123:0x01fb, B:125:0x01ff, B:127:0x0203, B:130:0x020c, B:132:0x0210, B:134:0x0214, B:137:0x0221, B:139:0x0225, B:141:0x022d, B:144:0x0236, B:146:0x023a, B:148:0x023e, B:152:0x0249, B:154:0x024d, B:156:0x0253, B:82:0x013d), top: B:160:0x00c1 }] */
    /* JADX INFO: renamed from: h */
    public final void m6492h(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        long jCurrentTimeMillis;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        char c10;
        char c11;
        char c12;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        Bundle bundleM6487b = m6487b(jSONObject);
        try {
            Bundle bundle = bundleM6487b.getBundle("w");
            Bundle bundle2 = bundleM6487b.getBundle("d");
            z10 = (bundle == null || bundle2 == null || (!m6489e(bundle, "xdp", Integer.class) && !m6489e(bundle, "xp", Integer.class)) || ((!m6489e(bundle, "ydp", Integer.class) && !m6489e(bundle, "yp", Integer.class)) || !m6489e(bundle, "dk", Boolean.class) || !m6489e(bundle, "sc", Boolean.class) || !m6489e(bundle2, "html", String.class) || !m6489e(bundle, "pos", String.class) || ((cCharAt = bundle.getString("pos").charAt(0)) != 'b' && cCharAt != 'c' && cCharAt != 'l' && cCharAt != 'r' && cCharAt != 't'))) ? false : true;
        } catch (Throwable th2) {
            C2181a.m6457j("Failed to parse in-app notification!", th2);
        }
        if (!z10) {
            this.f11117k = "Invalid JSON";
            return;
        }
        try {
            this.f11082L = jSONObject.has("ti") ? jSONObject.getString("ti") : "";
            this.f11109g = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "";
            if (jSONObject.has("efc")) {
                z11 = true;
                boolean z12 = jSONObject.getInt("efc") == 1;
                this.f11118l = z12;
                if (jSONObject.has("tlc")) {
                    i10 = jSONObject.getInt("tlc");
                } else {
                    i10 = -1;
                }
                this.f11104d0 = i10;
                if (jSONObject.has("tdc")) {
                    i11 = jSONObject.getInt("tdc");
                } else {
                    i11 = -1;
                }
                this.f11102c0 = i11;
                if (jSONObject.has("isJsEnabled") || !jSONObject.getBoolean("isJsEnabled")) {
                    z11 = false;
                }
                this.f11087Q = z11;
                if (jSONObject.has("wzrk_ttl")) {
                    jCurrentTimeMillis = jSONObject.getLong("wzrk_ttl");
                } else {
                    jCurrentTimeMillis = (System.currentTimeMillis() + 172800000) / 1000;
                }
                this.f11096Z = jCurrentTimeMillis;
                if (jSONObject.has("d")) {
                    jSONObject2 = jSONObject.getJSONObject("d");
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    this.f11081K = jSONObject2.getString("html");
                    this.f11113i = jSONObject2.has("url") ? jSONObject2.getString("url") : "";
                    jSONObject3 = jSONObject2.has("kv") ? jSONObject2.getJSONObject("kv") : null;
                    this.f11111h = jSONObject3;
                    if (jSONObject3 == null) {
                        this.f11111h = new JSONObject();
                    }
                    jSONObject4 = jSONObject.getJSONObject("w");
                    if (jSONObject4 != null) {
                        this.f11115j = jSONObject4.getBoolean("dk");
                        this.f11095Y = jSONObject4.getBoolean("sc");
                        this.f11094X = jSONObject4.getString("pos").charAt(0);
                        if (jSONObject4.has("xdp")) {
                            i12 = jSONObject4.getInt("xdp");
                        } else {
                            i12 = 0;
                        }
                        this.f11110g0 = i12;
                        if (jSONObject4.has("xp")) {
                            i13 = jSONObject4.getInt("xp");
                        } else {
                            i13 = 0;
                        }
                        this.f11112h0 = i13;
                        if (jSONObject4.has("ydp")) {
                            i14 = jSONObject4.getInt("ydp");
                        } else {
                            i14 = 0;
                        }
                        this.f11078H = i14;
                        if (jSONObject4.has("yp")) {
                            i15 = jSONObject4.getInt("yp");
                        } else {
                            i15 = 0;
                        }
                        this.f11079I = i15;
                        this.f11090T = jSONObject4.has("mdc") ? jSONObject4.getInt("mdc") : -1;
                    }
                    if (this.f11081K != null) {
                        c10 = this.f11094X;
                        if (c10 != 't' && this.f11112h0 == 100 && this.f11079I <= 30) {
                            this.f11083M = CTInAppType.CTInAppTypeHeaderHTML;
                            return;
                        }
                        if (c10 != 'b' && this.f11112h0 == 100 && this.f11079I <= 30) {
                            this.f11083M = CTInAppType.CTInAppTypeFooterHTML;
                            return;
                        }
                        c11 = 'c';
                        if (c10 == 'c') {
                            if (this.f11112h0 != 90 && this.f11079I == 85) {
                                this.f11083M = CTInAppType.CTInAppTypeInterstitialHTML;
                                return;
                            }
                            c11 = 'c';
                        }
                        if (c10 != c11) {
                            c12 = c11;
                        } else {
                            if (this.f11112h0 != 100 && this.f11079I == 100) {
                                this.f11083M = CTInAppType.CTInAppTypeCoverHTML;
                                return;
                            }
                            c12 = 'c';
                        }
                        if (c10 != c12 && this.f11112h0 == 90 && this.f11079I == 50) {
                            this.f11083M = CTInAppType.CTInAppTypeHalfInterstitialHTML;
                            return;
                        }
                        return;
                    }
                }
            }
            z11 = true;
            this.f11118l = z12;
            if (jSONObject.has("tlc")) {
                i10 = jSONObject.getInt("tlc");
            } else {
                i10 = -1;
            }
            this.f11104d0 = i10;
            if (jSONObject.has("tdc")) {
                i11 = jSONObject.getInt("tdc");
            } else {
                i11 = -1;
            }
            this.f11102c0 = i11;
            if (jSONObject.has("isJsEnabled")) {
                z11 = false;
            } else {
                z11 = false;
            }
            this.f11087Q = z11;
            if (jSONObject.has("wzrk_ttl")) {
                jCurrentTimeMillis = jSONObject.getLong("wzrk_ttl");
            } else {
                jCurrentTimeMillis = (System.currentTimeMillis() + 172800000) / 1000;
            }
            this.f11096Z = jCurrentTimeMillis;
            if (jSONObject.has("d")) {
                jSONObject2 = jSONObject.getJSONObject("d");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                this.f11081K = jSONObject2.getString("html");
                this.f11113i = jSONObject2.has("url") ? jSONObject2.getString("url") : "";
                if (jSONObject2.has("kv")) {
                }
                this.f11111h = jSONObject3;
                if (jSONObject3 == null) {
                    this.f11111h = new JSONObject();
                }
                jSONObject4 = jSONObject.getJSONObject("w");
                if (jSONObject4 != null) {
                    this.f11115j = jSONObject4.getBoolean("dk");
                    this.f11095Y = jSONObject4.getBoolean("sc");
                    this.f11094X = jSONObject4.getString("pos").charAt(0);
                    if (jSONObject4.has("xdp")) {
                        i12 = jSONObject4.getInt("xdp");
                    } else {
                        i12 = 0;
                    }
                    this.f11110g0 = i12;
                    if (jSONObject4.has("xp")) {
                        i13 = jSONObject4.getInt("xp");
                    } else {
                        i13 = 0;
                    }
                    this.f11112h0 = i13;
                    if (jSONObject4.has("ydp")) {
                        i14 = jSONObject4.getInt("ydp");
                    } else {
                        i14 = 0;
                    }
                    this.f11078H = i14;
                    if (jSONObject4.has("yp")) {
                        i15 = jSONObject4.getInt("yp");
                    } else {
                        i15 = 0;
                    }
                    this.f11079I = i15;
                    this.f11090T = jSONObject4.has("mdc") ? jSONObject4.getInt("mdc") : -1;
                }
                if (this.f11081K != null) {
                    c10 = this.f11094X;
                    if (c10 != 't') {
                    }
                    if (c10 != 'b') {
                    }
                    c11 = 'c';
                    if (c10 == 'c') {
                        if (this.f11112h0 != 90) {
                        }
                        c11 = 'c';
                    }
                    if (c10 != c11) {
                        if (this.f11112h0 != 100) {
                        }
                        c12 = 'c';
                    } else {
                        c12 = c11;
                    }
                    if (c10 != c12) {
                    }
                }
            }
        } catch (JSONException unused) {
            this.f11117k = "Invalid JSON";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11082L);
        parcel.writeString(this.f11109g);
        parcel.writeValue(this.f11083M);
        parcel.writeString(this.f11081K);
        parcel.writeByte(this.f11118l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11095Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11115j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11090T);
        parcel.writeInt(this.f11104d0);
        parcel.writeInt(this.f11102c0);
        parcel.writeValue(Character.valueOf(this.f11094X));
        parcel.writeInt(this.f11078H);
        parcel.writeInt(this.f11079I);
        parcel.writeInt(this.f11110g0);
        parcel.writeInt(this.f11112h0);
        if (this.f11088R == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f11088R.toString());
        }
        parcel.writeString(this.f11117k);
        if (this.f11111h == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f11111h.toString());
        }
        JSONObject jSONObject = this.f11101c;
        if (jSONObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject.toString());
        }
        parcel.writeString(this.f11106e0);
        parcel.writeString(this.f11098a0);
        parcel.writeString(this.f11100b0);
        parcel.writeString(this.f11103d);
        parcel.writeString(this.f11092V);
        parcel.writeString(this.f11093W);
        parcel.writeTypedList(this.f11107f);
        parcel.writeTypedList(this.f11091U);
        parcel.writeByte(this.f11080J ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11105e);
        parcel.writeByte(this.f11086P ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f11113i);
        parcel.writeByte(this.f11087Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11085O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11084N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11114i0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11116j0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f11089S);
        parcel.writeString(this.f11099b);
        parcel.writeLong(this.f11096Z);
    }
}
