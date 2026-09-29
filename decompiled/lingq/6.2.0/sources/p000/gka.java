package p000;

import android.R;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.slider.AbstractC1071b;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gka {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f40918a = 0;

    /* JADX INFO: renamed from: a */
    public static void m12722a(View view, yva yvaVar) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        zva zvaVar = new zva();
        zvaVar.f72285a = paddingStart;
        zvaVar.f72286b = paddingTop;
        zvaVar.f72287c = paddingEnd;
        zvaVar.f72288d = paddingBottom;
        qfa qfaVar = new qfa(yvaVar, zvaVar);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, qfaVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new wva());
        }
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m12723b(AbstractC1071b abstractC1071b) {
        View rootView = abstractC1071b.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == abstractC1071b || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m12724c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12725d(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C3386nv.m17635v(ux5.m22988k(i2, "at index "));
                return;
            }
        }
    }
}
