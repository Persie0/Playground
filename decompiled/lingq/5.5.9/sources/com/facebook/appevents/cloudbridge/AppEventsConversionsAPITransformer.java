package com.facebook.appevents.cloudbridge;

import com.facebook.LoggingBehavior;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6753d;
import mo.C7660h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5078r;
import p067d8.C5086z;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AppEventsConversionsAPITransformer {

    /* JADX INFO: renamed from: a */
    public static final Map<AppEventUserAndAppDataField, C2290b> f11491a;

    /* JADX INFO: renamed from: b */
    public static final Map<CustomEventField, C2289a> f11492b;

    /* JADX INFO: renamed from: c */
    public static final Map<String, ConversionsAPIEventName> f11493c;

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m13365d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "OPTIONS", "COUNTRY", "STATE", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private final String rawValue;

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static DataProcessingParameterName[] valuesCustom() {
            DataProcessingParameterName[] dataProcessingParameterNameArrValuesCustom = values();
            return (DataProcessingParameterName[]) Arrays.copyOf(dataProcessingParameterNameArrValuesCustom, dataProcessingParameterNameArrValuesCustom.length);
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13365d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ARRAY", "BOOL", "INT", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ValueTransformationType[] valuesCustom() {
            ValueTransformationType[] valueTransformationTypeArrValuesCustom = values();
            return (ValueTransformationType[]) Arrays.copyOf(valueTransformationTypeArrValuesCustom, valueTransformationTypeArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a */
    public static final class C2289a {

        /* JADX INFO: renamed from: a */
        public final ConversionsAPISection f11494a;

        /* JADX INFO: renamed from: b */
        public final ConversionsAPICustomEventField f11495b;

        public C2289a(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            C5207g.m11111f(conversionsAPICustomEventField, "field");
            this.f11494a = conversionsAPISection;
            this.f11495b = conversionsAPICustomEventField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2289a)) {
                return false;
            }
            C2289a c2289a = (C2289a) obj;
            return this.f11494a == c2289a.f11494a && this.f11495b == c2289a.f11495b;
        }

        public final int hashCode() {
            ConversionsAPISection conversionsAPISection = this.f11494a;
            return this.f11495b.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
        }

        public final String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f11494a + ", field=" + this.f11495b + ')';
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b */
    public static final class C2290b {

        /* JADX INFO: renamed from: a */
        public final ConversionsAPISection f11496a;

        /* JADX INFO: renamed from: b */
        public final ConversionsAPIUserAndAppDataField f11497b;

        public C2290b(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            C5207g.m11111f(conversionsAPISection, "section");
            this.f11496a = conversionsAPISection;
            this.f11497b = conversionsAPIUserAndAppDataField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2290b)) {
                return false;
            }
            C2290b c2290b = (C2290b) obj;
            return this.f11496a == c2290b.f11496a && this.f11497b == c2290b.f11497b;
        }

        public final int hashCode() {
            int iHashCode = this.f11496a.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.f11497b;
            return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final String toString() {
            return "SectionFieldMapping(section=" + this.f11496a + ", field=" + this.f11497b + ')';
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$c */
    public /* synthetic */ class C2291c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11498a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11499b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f11500c;

        static {
            int[] iArr = new int[ValueTransformationType.valuesCustom().length];
            iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            iArr[ValueTransformationType.INT.ordinal()] = 3;
            f11498a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.valuesCustom().length];
            iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            f11499b = iArr2;
            int[] iArr3 = new int[AppEventType.valuesCustom().length];
            iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            f11500c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        f11491a = C6753d.m13462O0(new Pair(appEventUserAndAppDataField, new C2290b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID)), new Pair(AppEventUserAndAppDataField.APP_USER_ID, new C2290b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID)), new Pair(AppEventUserAndAppDataField.ADVERTISER_ID, new C2290b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID)), new Pair(AppEventUserAndAppDataField.PAGE_ID, new C2290b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID)), new Pair(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new C2290b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID)), new Pair(appEventUserAndAppDataField2, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new Pair(AppEventUserAndAppDataField.APP_TE, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new Pair(AppEventUserAndAppDataField.CONSIDER_VIEWS, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new Pair(AppEventUserAndAppDataField.DEVICE_TOKEN, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new Pair(AppEventUserAndAppDataField.EXT_INFO, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new Pair(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new Pair(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new Pair(AppEventUserAndAppDataField.INSTALL_REFERRER, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new Pair(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new Pair(AppEventUserAndAppDataField.RECEIPT_DATA, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new Pair(AppEventUserAndAppDataField.URL_SCHEMES, new C2290b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new Pair(AppEventUserAndAppDataField.USER_DATA, new C2290b(conversionsAPISection, null)));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        f11492b = C6753d.m13462O0(new Pair(CustomEventField.EVENT_TIME, new C2289a(null, ConversionsAPICustomEventField.EVENT_TIME)), new Pair(CustomEventField.EVENT_NAME, new C2289a(null, ConversionsAPICustomEventField.EVENT_NAME)), new Pair(customEventField, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new C2289a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        f11493c = C6753d.m13462O0(new Pair("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), new Pair("fb_mobile_rate", ConversionsAPIEventName.RATED), new Pair("fb_mobile_search", ConversionsAPIEventName.SEARCHED), new Pair("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: a */
    public static final Object m6643a(Object obj, String str) {
        ValueTransformationType valueTransformationType;
        ValueTransformationType.INSTANCE.getClass();
        if (C5207g.m11106a(str, AppEventUserAndAppDataField.EXT_INFO.getRawValue()) || C5207g.m11106a(str, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue()) || C5207g.m11106a(str, CustomEventField.CONTENT_IDS.getRawValue()) || C5207g.m11106a(str, CustomEventField.CONTENTS.getRawValue()) || C5207g.m11106a(str, DataProcessingParameterName.OPTIONS.getRawValue())) {
            valueTransformationType = ValueTransformationType.ARRAY;
        } else if (C5207g.m11106a(str, AppEventUserAndAppDataField.ADV_TE.getRawValue()) || C5207g.m11106a(str, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
            valueTransformationType = ValueTransformationType.BOOL;
        } else {
            valueTransformationType = C5207g.m11106a(str, CustomEventField.EVENT_TIME.getRawValue()) ? ValueTransformationType.INT : null;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (valueTransformationType != null && str2 != null) {
            int i10 = C2291c.f11498a[valueTransformationType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return C7660h.m15246L2(obj.toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Integer numM15246L2 = C7660h.m15246L2(str2);
                if (numM15246L2 == null) {
                    return null;
                }
                return Boolean.valueOf(numM15246L2.intValue() != 0);
            }
            try {
                C5086z c5086z = C5086z.f33015a;
                ArrayList<??> arrayListM10822g = C5086z.m10822g(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (?? M10822g : arrayListM10822g) {
                    try {
                        try {
                            C5086z c5086z2 = C5086z.f33015a;
                            M10822g = C5086z.m10823h(new JSONObject((String) M10822g));
                        } catch (JSONException unused) {
                            C5086z c5086z3 = C5086z.f33015a;
                            M10822g = C5086z.m10822g(new JSONArray((String) M10822g));
                        }
                    } catch (JSONException unused2) {
                    }
                    arrayList.add(M10822g);
                }
                return arrayList;
            } catch (JSONException e10) {
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return C9072e.f47360a;
            }
        }
        return obj;
    }
}
