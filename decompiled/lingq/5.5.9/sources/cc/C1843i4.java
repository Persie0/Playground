package cc;

import android.content.Context;
import android.content.res.Resources;
import com.linguist.R;

/* JADX INFO: renamed from: cc.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843i4 {
    /* JADX INFO: renamed from: a */
    public static String m5627a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
