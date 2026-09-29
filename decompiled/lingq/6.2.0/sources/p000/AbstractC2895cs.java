package p000;

import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType;
import com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField;
import com.facebook.appevents.cloudbridge.ConversionsAPIEventName;
import com.facebook.appevents.cloudbridge.ConversionsAPISection;
import com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField;
import com.facebook.appevents.cloudbridge.CustomEventField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: cs */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2895cs {

    /* JADX INFO: renamed from: a */
    public static final Map f34437a;

    /* JADX INFO: renamed from: b */
    public static final Map f34438b;

    /* JADX INFO: renamed from: c */
    public static final Map f34439c;

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair pair = new Pair(appEventUserAndAppDataField, new C3843zr(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair pair2 = new Pair(AppEventUserAndAppDataField.APP_USER_ID, new C3843zr(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair pair3 = new Pair(AppEventUserAndAppDataField.ADVERTISER_ID, new C3843zr(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair pair4 = new Pair(AppEventUserAndAppDataField.PAGE_ID, new C3843zr(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair pair5 = new Pair(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new C3843zr(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        f34437a = AbstractC3194a.m15365R(pair, pair2, pair3, pair4, pair5, new Pair(appEventUserAndAppDataField2, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new Pair(AppEventUserAndAppDataField.APP_TE, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new Pair(AppEventUserAndAppDataField.CONSIDER_VIEWS, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new Pair(AppEventUserAndAppDataField.DEVICE_TOKEN, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new Pair(AppEventUserAndAppDataField.EXT_INFO, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new Pair(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new Pair(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new Pair(AppEventUserAndAppDataField.INSTALL_REFERRER, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new Pair(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new Pair(AppEventUserAndAppDataField.RECEIPT_DATA, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new Pair(AppEventUserAndAppDataField.URL_SCHEMES, new C3843zr(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new Pair(AppEventUserAndAppDataField.USER_DATA, new C3843zr(conversionsAPISection, null)));
        Pair pair6 = new Pair(CustomEventField.EVENT_TIME, new C3806yr(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pair7 = new Pair(CustomEventField.EVENT_NAME, new C3806yr(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        f34438b = AbstractC3194a.m15365R(pair6, pair7, new Pair(customEventField, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new C3806yr(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        f34439c = AbstractC3194a.m15365R(new Pair("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), new Pair("fb_mobile_rate", ConversionsAPIEventName.RATED), new Pair("fb_mobile_search", ConversionsAPIEventName.SEARCHED), new Pair("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    /* JADX INFO: renamed from: a */
    public static final Object m9868a(Object obj, String str) {
        AppEventsConversionsAPITransformer$ValueTransformationType appEventsConversionsAPITransformer$ValueTransformationType;
        AppEventsConversionsAPITransformer$ValueTransformationType.Companion.getClass();
        if (str.equals(AppEventUserAndAppDataField.EXT_INFO.getRawValue()) || str.equals(AppEventUserAndAppDataField.URL_SCHEMES.getRawValue()) || str.equals(CustomEventField.CONTENT_IDS.getRawValue()) || str.equals(CustomEventField.CONTENTS.getRawValue()) || str.equals(AppEventsConversionsAPITransformer$DataProcessingParameterName.OPTIONS.getRawValue())) {
            appEventsConversionsAPITransformer$ValueTransformationType = AppEventsConversionsAPITransformer$ValueTransformationType.ARRAY;
        } else if (str.equals(AppEventUserAndAppDataField.ADV_TE.getRawValue()) || str.equals(AppEventUserAndAppDataField.APP_TE.getRawValue())) {
            appEventsConversionsAPITransformer$ValueTransformationType = AppEventsConversionsAPITransformer$ValueTransformationType.BOOL;
        } else {
            appEventsConversionsAPITransformer$ValueTransformationType = str.equals(CustomEventField.EVENT_TIME.getRawValue()) ? AppEventsConversionsAPITransformer$ValueTransformationType.INT : null;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (appEventsConversionsAPITransformer$ValueTransformationType == null || str2 == null) {
            return obj;
        }
        int i = AbstractC0822bs.f8907a[appEventsConversionsAPITransformer$ValueTransformationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return cl9.m4844a0(obj.toString());
                }
                gm5.m12750e();
                return null;
            }
            Integer numM4844a0 = cl9.m4844a0(str2.toString());
            if (numM4844a0 != null) {
                return Boolean.valueOf(numM4844a0.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> arrayListM3916E = bna.m3916E(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? M3916E : arrayListM3916E) {
                try {
                    try {
                        M3916E = bna.m3917F(new JSONObject((String) M3916E));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    M3916E = bna.m3916E(new JSONArray((String) M3916E));
                }
                arrayList.add(M3916E);
            }
            return arrayList;
        } catch (JSONException e) {
            iy5 iy5Var = qj5.f57852d;
            iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e);
            return xfa.f68157a;
        }
    }
}
