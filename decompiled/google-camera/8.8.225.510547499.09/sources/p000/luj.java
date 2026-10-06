package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luj implements lty {

    /* JADX INFO: renamed from: a */
    private static final SparseArray f39224a;

    /* JADX INFO: renamed from: b */
    private static final SparseArray f39225b;

    /* JADX INFO: renamed from: c */
    private static final SparseArray f39226c;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(8, "FEATURE_ACTION_BAR");
        sparseArray.put(9, "FEATURE_ACTION_BAR_OVERLAY");
        sparseArray.put(10, "FEATURE_ACTION_MODE_OVERLAY");
        sparseArray.put(13, "FEATURE_ACTIVITY_TRANSITIONS");
        sparseArray.put(12, "FEATURE_CONTENT_TRANSITIONS");
        sparseArray.put(6, "FEATURE_CONTEXT_MENU");
        sparseArray.put(7, "FEATURE_CUSTOM_TITLE");
        sparseArray.put(3, "FEATURE_LEFT_ICON");
        sparseArray.put(1, "FEATURE_NO_TITLE");
        sparseArray.put(0, "FEATURE_OPTIONS_PANEL");
        sparseArray.put(4, "FEATURE_RIGHT_ICON");
        sparseArray.put(11, "FEATURE_SWIPE_TO_DISMISS");
        f39224a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        sparseArray2.put(1, "FLAG_ALLOW_LOCK_WHILE_SCREEN_ON");
        sparseArray2.put(131072, "FLAG_ALT_FOCUSABLE_IM");
        sparseArray2.put(2, "FLAG_DIM_BEHIND");
        sparseArray2.put(4194304, "FLAG_DISMISS_KEYGUARD");
        sparseArray2.put(Integer.MIN_VALUE, "FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS");
        sparseArray2.put(2048, "FLAG_FORCE_NOT_FULLSCREEN");
        sparseArray2.put(1024, "FLAG_FULLSCREEN");
        sparseArray2.put(16777216, "FLAG_HARDWARE_ACCELERATED");
        sparseArray2.put(32768, "FLAG_IGNORE_CHEEK_PRESSES");
        sparseArray2.put(128, "FLAG_KEEP_SCREEN_ON");
        sparseArray2.put(1073741824, BcwGDRhrTsnlj.uIqhBFbcGkLX);
        sparseArray2.put(65536, "FLAG_LAYOUT_INSET_DECOR");
        sparseArray2.put(33554432, "FLAG_LAYOUT_IN_OVERSCAN");
        sparseArray2.put(256, "FLAG_LAYOUT_IN_SCREEN");
        sparseArray2.put(512, "FLAG_LAYOUT_NO_LIMITS");
        sparseArray2.put(268435456, "FLAG_LOCAL_FOCUS_MODE");
        sparseArray2.put(8, "FLAG_NOT_FOCUSABLE");
        sparseArray2.put(32, "FLAG_NOT_TOUCH_MODAL");
        sparseArray2.put(16384, "FLAG_SCALED");
        sparseArray2.put(8192, IuyLAqNmW.YTyG);
        sparseArray2.put(1048576, "FLAG_SHOW_WALLPAPER");
        sparseArray2.put(524288, "FLAG_SHOW_WHEN_LOCKED");
        sparseArray2.put(8388608, "FLAG_SPLIT_TOUCH");
        sparseArray2.put(134217728, "FLAG_TRANSLUCENT_NAVIGATION");
        sparseArray2.put(67108864, "FLAG_TRANSLUCENT_STATUS");
        sparseArray2.put(2097152, "FLAG_TURN_SCREEN_ON");
        sparseArray2.put(262144, "FLAG_WATCH_OUTSIDE_TOUCH");
        f39225b = sparseArray2;
        SparseArray sparseArray3 = new SparseArray();
        sparseArray3.put(4, "SYSTEM_UI_FLAG_FULLSCREEN");
        sparseArray3.put(2, "SYSTEM_UI_FLAG_HIDE_NAVIGATION");
        sparseArray3.put(2048, "SYSTEM_UI_FLAG_IMMERSIVE");
        sparseArray3.put(4096, pIeXJQLZLfgIN.Iys);
        sparseArray3.put(1024, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN");
        sparseArray3.put(512, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION");
        sparseArray3.put(256, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        sparseArray3.put(16, "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR");
        sparseArray3.put(8192, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR");
        sparseArray3.put(1, "SYSTEM_UI_FLAG_LOW_PROFILE");
        f39226c = sparseArray3;
    }

    /* JADX INFO: renamed from: b */
    private static Activity m16001b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m16001b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m16002c(SparseArray sparseArray, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            if ((i & iKeyAt) == iKeyAt) {
                arrayList.add((String) sparseArray.valueAt(i2));
            }
        }
        return TextUtils.join(" | ", arrayList);
    }

    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        if (!afe.m461e(view) || (view.getParent() instanceof ViewGroup)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = view;
        }
        Activity activityM16001b = m16001b(viewFindViewById.getContext());
        if (activityM16001b != null) {
            Window window = activityM16001b.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = f39224a;
                if (i >= sparseArray.size()) {
                    break;
                }
                if (window.hasFeature(sparseArray.keyAt(i))) {
                    arrayList.add((String) sparseArray.valueAt(i));
                }
                i++;
            }
            lulVar.m16007a("window_features", TextUtils.join(" | ", arrayList));
            lulVar.m16007a("window_layoutParams_flags", m16002c(f39225b, attributes.flags));
            int i2 = attributes.systemUiVisibility;
            lulVar.m16007a("window_layoutParams_systemUiVisibility", i2 == 0 ? "SYSTEM_UI_FLAG_VISIBLE" : m16002c(f39226c, i2));
            lulVar.m16007a("rootWindowInsets", view.getRootWindowInsets().toString());
            lulVar.m16010d("window_statusBarColor", window.getStatusBarColor());
            lulVar.m16010d(PMZiHihxLGEy.clfZfeLPdwUOLmS, window.getNavigationBarColor());
            luh.m15993c(activityM16001b, activityM16001b, lulVar, "activity_");
        }
    }
}
