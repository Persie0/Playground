package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy2 {
    /* JADX INFO: renamed from: a */
    public static fr3 m10742a(r6b r6bVar, FoldingFeature foldingFeature) {
        gp0 gp0Var;
        C3404oc c3404oc;
        r6bVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            gp0Var = gp0.f41121f;
        } else {
            if (type != 2) {
                return null;
            }
            gp0Var = gp0.f41122g;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c3404oc = C3404oc.f54159f;
        } else {
            if (state != 2) {
                return null;
            }
            c3404oc = C3404oc.f54160g;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        hh0 hh0Var = new hh0(bounds);
        Rect rectM13239c = r6bVar.f58809a.m13239c();
        if (hh0Var.m13237a() == 0 && hh0Var.m13238b() == 0) {
            return null;
        }
        if (hh0Var.m13238b() != rectM13239c.width() && hh0Var.m13237a() != rectM13239c.height()) {
            return null;
        }
        if (hh0Var.m13238b() < rectM13239c.width() && hh0Var.m13237a() < rectM13239c.height()) {
            return null;
        }
        if (hh0Var.m13238b() == rectM13239c.width() && hh0Var.m13237a() == rectM13239c.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new fr3(new hh0(bounds2), gp0Var, c3404oc);
    }

    /* JADX INFO: renamed from: b */
    public static q6b m10743b(r6b r6bVar, WindowLayoutInfo windowLayoutInfo) {
        r6bVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            fr3 fr3VarM10742a = foldingFeature instanceof FoldingFeature ? m10742a(r6bVar, foldingFeature) : null;
            if (fr3VarM10742a != null) {
                arrayList.add(fr3VarM10742a);
            }
        }
        return new q6b(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static q6b m10744c(Context context, WindowLayoutInfo windowLayoutInfo) {
        v6b v6bVar = my5.f52034e;
        kh0 kh0Var = kh0.f47285b;
        hb2 hb2Var = hb2.f42125b;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        gb2 gb2Var = i >= 34 ? hb2.f42124a : nid.f52785b;
        vz1.m23627e(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                v6bVar = hb2Var;
            } else if (i >= 30) {
                v6bVar = kh0Var;
            }
            return m10743b(v6bVar.mo13181d(context, gb2Var), windowLayoutInfo);
        }
        if (!(context instanceof Activity)) {
            C3386nv.m17636w("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            v6bVar = hb2Var;
        } else if (i >= 30) {
            v6bVar = kh0Var;
        }
        return m10743b(v6bVar.mo13180a(activity, gb2Var), windowLayoutInfo);
    }
}
