package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aai {
    public aai() {
    }

    public aai(Context context, AttributeSet attributeSet) {
    }

    /* JADX INFO: renamed from: s */
    public static List m2s(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static void m3t(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo4a(aal aalVar) {
    }

    /* JADX INFO: renamed from: b */
    public void mo5b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo6c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    /* JADX INFO: renamed from: d */
    public boolean mo7d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo9f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo10g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo11h(View view) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void mo12i(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    /* JADX INFO: renamed from: j */
    public void mo13j(CoordinatorLayout coordinatorLayout, View view) {
    }

    /* JADX INFO: renamed from: k */
    public boolean mo14k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo15l(View view) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void mo16m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo17n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    /* JADX INFO: renamed from: o */
    public void mo18o(View view, Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: p */
    public Parcelable mo19p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo20q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo21r(View view, Rect rect) {
        return false;
    }
}
