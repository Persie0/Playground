package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eia {

    /* JADX INFO: renamed from: a */
    public static final Set f37300a = AbstractC3550rv.m20855w0(new String[]{"standard", "lq-standard", "plus", "lq-plus", "lq-basetrial"});

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX INFO: renamed from: a */
    public static final dia m11162a(String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        boolean zEquals = str.equals(LqAnalyticsValues$UpgradePopupSource.Registration.getValue());
        if (str2 != null) {
            if (vk9.m23391n0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                str3 = str2;
            } else if (str3 != null) {
                str3 = null;
            } else {
                str3 = null;
            }
        } else if (str3 != null || zEquals || vk9.m23391n0(str3)) {
            str3 = null;
        }
        if (zEquals && !z2) {
            str3 = "lq-basetrial";
        }
        return new dia(z && m11163b(str, str3), str3);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11163b(String str, String str2) {
        String lowerCase;
        String string;
        str.getClass();
        if (str.equals(LqAnalyticsValues$UpgradePopupSource.Registration.getValue())) {
            return true;
        }
        if (str2 == null || (string = vk9.m23376L0(str2).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        return lowerCase.length() <= 0 || f37300a.contains(lowerCase);
    }
}
