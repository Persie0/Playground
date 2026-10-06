package p000;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lue implements lty {

    /* JADX INFO: renamed from: a */
    private static final SparseArray f39218a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(4, "SYSTEM_UI_FLAG_FULLSCREEN");
        sparseArray.put(2, "SYSTEM_UI_FLAG_HIDE_NAVIGATION");
        sparseArray.put(2048, "SYSTEM_UI_FLAG_IMMERSIVE");
        sparseArray.put(4096, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY");
        sparseArray.put(1024, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN");
        sparseArray.put(512, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION");
        sparseArray.put(256, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        sparseArray.put(16, "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR");
        sparseArray.put(8192, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR");
        sparseArray.put(1, "SYSTEM_UI_FLAG_LOW_PROFILE");
        f39218a = sparseArray;
    }

    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        if (view.getSystemUiVisibility() != 0) {
            int systemUiVisibility = view.getSystemUiVisibility();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = f39218a;
                if (i >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i);
                if ((systemUiVisibility & iKeyAt) == iKeyAt) {
                    arrayList.add((String) sparseArray.valueAt(i));
                }
                i++;
            }
            lulVar.m16007a("systemUiVisibility", TextUtils.join(" | ", arrayList));
        }
        lulVar.m16007a("isLaidOut", String.valueOf(afe.m462f(view)));
        lulVar.m16007a("isLayoutRequested", String.valueOf(view.isLayoutRequested()));
        if (view.getParent() instanceof CoordinatorLayout) {
            lulVar.m16007a("coordinatorLayout_behavior", String.valueOf(((aal) view.getLayoutParams()).f14a));
        }
        if (view.getBackground() instanceof ColorDrawable) {
            lulVar.m16007a("backgroundColor", String.format("#%08X", Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
        } else if (view.getBackground() != null) {
            lulVar.m16007a("background", view.getBackground().toString());
        }
    }
}
