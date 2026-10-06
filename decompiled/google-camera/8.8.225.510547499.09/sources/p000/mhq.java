package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhq {

    /* JADX INFO: renamed from: a */
    private static final int[] f40536a = {C0100R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b */
    private static final mhp f40537b;

    /* JADX INFO: renamed from: c */
    private static final mhp f40538c;

    static {
        mho mhoVar = new mho();
        f40537b = mhoVar;
        mho mhoVar2 = new mho();
        f40538c = mhoVar2;
        HashMap map = new HashMap();
        map.put("fcnt", mhoVar);
        map.put("google", mhoVar);
        map.put("hmd global", mhoVar);
        map.put("infinix", mhoVar);
        map.put("infinix mobility limited", mhoVar);
        map.put("itel", mhoVar);
        map.put("kyocera", mhoVar);
        map.put("lenovo", mhoVar);
        map.put("lge", mhoVar);
        map.put("motorola", mhoVar);
        map.put("nothing", mhoVar);
        map.put("oneplus", mhoVar);
        map.put("oppo", mhoVar);
        map.put("realme", mhoVar);
        map.put("robolectric", mhoVar);
        map.put("samsung", mhoVar2);
        map.put("sharp", mhoVar);
        map.put(rmwTRjObXLGH.QLkzrrVjqYWDQGY, mhoVar);
        map.put("tcl", mhoVar);
        map.put("tecno", mhoVar);
        map.put("tecno mobile limited", mhoVar);
        map.put("vivo", mhoVar);
        map.put("wingtech", mhoVar);
        map.put(JrxsYuVZZqnFC.xJxgnmqmIDqOV, mhoVar);
        Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", mhoVar);
        map2.put("jio", mhoVar);
        Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m16381a(Activity activity) {
        View viewPeekDecorView;
        Context context;
        int i = adg.f162a;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f40536a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        activity.getTheme().applyStyle(resourceId, true);
        Window window = activity.getWindow();
        Resources.Theme theme = null;
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && (context = viewPeekDecorView.getContext()) != null) {
            theme = context.getTheme();
        }
        if (theme != null) {
            theme.applyStyle(resourceId, true);
        }
    }
}
