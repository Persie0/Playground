package p000;

import android.appwidget.AppWidgetProviderInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y2d {

    /* JADX INFO: renamed from: a */
    public static p04 f69196a;

    /* JADX INFO: renamed from: a */
    public static final String m24910a(int i) {
        return ux5.m22988k(i, "appWidget-");
    }

    /* JADX INFO: renamed from: b */
    public static final List m24911b(Bundle bundle, ui3 ui3Var) {
        ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            int i = bundle.getInt("appWidgetMinHeight", 0);
            int i2 = bundle.getInt("appWidgetMaxHeight", 0);
            int i3 = bundle.getInt("appWidgetMinWidth", 0);
            int i4 = bundle.getInt("appWidgetMaxWidth", 0);
            return (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) ? vz1.m23604J(ui3Var.mo0a()) : vz1.m23605K(new bk2(AbstractC3584sr.m21614a(i3, i2)), new bk2(AbstractC3584sr.m21614a(i4, i)));
        }
        ArrayList arrayList = new ArrayList(v91.m23189q0(parcelableArrayList, 10));
        for (SizeF sizeF : parcelableArrayList) {
            arrayList.add(new bk2(AbstractC3584sr.m21614a(sizeF.getWidth(), sizeF.getHeight())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m24912c(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        bk2 bk2Var = null;
        bk2 bk2Var2 = (i == 0 || i2 == 0) ? null : new bk2(AbstractC3584sr.m21614a(i2, i));
        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
        int i4 = bundle.getInt("appWidgetMinWidth", 0);
        if (i3 != 0 && i4 != 0) {
            bk2Var = new bk2(AbstractC3584sr.m21614a(i4, i3));
        }
        return AbstractC3550rv.m20837e0(new bk2[]{bk2Var2, bk2Var});
    }

    /* JADX INFO: renamed from: d */
    public static final bk2 m24913d(long j, Collection collection) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            long j2 = ((bk2) it.next()).f8632a;
            if (((float) Math.ceil(bk2.m3806b(j))) + 1.0f > bk2.m3806b(j2) && ((float) Math.ceil(bk2.m3805a(j))) + 1.0f > bk2.m3805a(j2)) {
                bk2 bk2Var = new bk2(j2);
                float fM3806b = bk2.m3806b(j) - bk2.m3806b(j2);
                float fM3805a = bk2.m3805a(j) - bk2.m3805a(j2);
                pair = new Pair(bk2Var, Float.valueOf((fM3805a * fM3805a) + (fM3806b * fM3806b)));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float fFloatValue = ((Number) ((Pair) next).f47624b).floatValue();
                do {
                    Object next2 = it2.next();
                    float fFloatValue2 = ((Number) ((Pair) next2).f47624b).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                        next = next2;
                        fFloatValue = fFloatValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (bk2) pair2.f47623a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final long m24914e(AppWidgetProviderInfo appWidgetProviderInfo, DisplayMetrics displayMetrics) {
        int iMin = Math.min(appWidgetProviderInfo.minWidth, (appWidgetProviderInfo.resizeMode & 1) != 0 ? appWidgetProviderInfo.minResizeWidth : Integer.MAX_VALUE);
        int iMin2 = Math.min(appWidgetProviderInfo.minHeight, (appWidgetProviderInfo.resizeMode & 2) != 0 ? appWidgetProviderInfo.minResizeHeight : Integer.MAX_VALUE);
        float f = displayMetrics.density;
        return AbstractC3584sr.m21614a(iMin / f, iMin2 / f);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m24915f(C0785at c0785at) {
        int i = c0785at.f7451a;
        boolean z = false;
        if (Integer.MIN_VALUE <= i && i < -1) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: g */
    public static final void m24916g(Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
    }

    /* JADX INFO: renamed from: h */
    public static final List m24917h(Collection collection) {
        return u91.m22614f1(collection, ss5.m21717n(new C3013ft(0), new C3013ft(1)));
    }
}
