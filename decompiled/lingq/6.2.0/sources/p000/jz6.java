package p000;

import com.facebook.FacebookException;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.OperationalDataEnum;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class jz6 {

    /* JADX INFO: renamed from: b */
    public static final Map f46432b = AbstractC3194a.m15364Q(new Pair(OperationalDataEnum.IAPParameters, new Pair(AbstractC3550rv.m20855w0(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), AbstractC3550rv.m20855w0(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"}))));

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f46433a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m14754a(OperationalDataEnum operationalDataEnum, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.f46433a;
        operationalDataEnum.getClass();
        str.getClass();
        obj.getClass();
        try {
            HashSet hashSet = AppEvent.f11379f;
            wfb.m23903E(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(operationalDataEnum)) {
                linkedHashMap.put(operationalDataEnum, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(operationalDataEnum);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }
}
