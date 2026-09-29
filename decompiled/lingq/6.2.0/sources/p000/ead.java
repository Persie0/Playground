package p000;

import android.content.Context;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.achievements.R$string;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ead {
    /* JADX INFO: renamed from: a */
    public static final String m11004a(DailyGoal dailyGoal, Context context) {
        dailyGoal.getClass();
        context.getClass();
        Locale locale = Locale.getDefault();
        String string = context.getString(R$string.settings_daily_goal);
        string.getClass();
        String string2 = context.getString(dailyGoal.getDesc());
        if (string2 == null) {
            string2 = "";
        }
        return String.format(locale, string, Arrays.copyOf(new Object[]{string2, Integer.valueOf(dailyGoal.getCoins()), Integer.valueOf(dailyGoal.getMins())}, 3));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11005b(char c) {
        return '0' <= c && c < ':';
    }

    /* JADX INFO: renamed from: c */
    public static final String m11006c(int i, String str) {
        int iM23388k0;
        if (str.length() >= i + 12) {
            int i2 = 0;
            if (vk9.m23381d0("+-", str.charAt(0)) && (iM23388k0 = vk9.m23388k0(str, '-', 1, 4)) >= 12) {
                while (true) {
                    int i3 = i2 + 1;
                    if (str.charAt(i3) != '0') {
                        break;
                    }
                    i2 = i3;
                }
                if (iM23388k0 - i2 < 12) {
                    return vk9.m23399v0(str, 1, iM23388k0 - 10).toString();
                }
            }
        }
        return str;
    }
}
