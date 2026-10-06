package p000;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lud {

    /* JADX INFO: renamed from: a */
    public static final String f39212a = lud.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    public Method f39214c;

    /* JADX INFO: renamed from: b */
    public final List f39213b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final Matrix f39215d = new Matrix();

    /* JADX INFO: renamed from: e */
    private final RectF f39216e = new RectF();

    /* JADX INFO: renamed from: f */
    private final Rect f39217f = new Rect();

    /* JADX INFO: renamed from: a */
    static String m15989a(Resources resources, int i) {
        if (resources != null && i != 0 && (16711680 & i) != 0 && ((-16777216) & i) != 0) {
            try {
                return resources.getResourceName(i);
            } catch (Resources.NotFoundException e) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m15990b(View view, Map map) {
        int i = 1;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int iMax = 1;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    m15990b(childAt, map);
                    luc lucVar = (luc) map.get(childAt);
                    if (lucVar != null) {
                        iMax = Math.max(iMax, lucVar.f39211a + 1);
                    }
                }
            }
            i = iMax;
        }
        luc lucVar2 = new luc();
        lucVar2.f39211a = i;
        map.put(view, lucVar2);
    }

    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, lty] */
    /* JADX INFO: renamed from: c */
    public final void m15991c(C1058va c1058va, View view, int i, int i2, Map map) {
        lul lulVar = (lul) c1058va.f47802a;
        lulVar.m16010d("hierarchy_depth", i);
        lulVar.m16010d("index", i2);
        luc lucVar = (luc) map.remove(view);
        if (lucVar != null) {
            lulVar.m16010d("hierarchy_height", lucVar.f39211a);
        }
        lulVar.m16007a("class", view.getClass().getName());
        lulVar.m16007a("package", view.getContext().getPackageName());
        lulVar.m16010d("hashcode", view.hashCode());
        String strM15989a = m15989a(view.getResources(), view.getId());
        if (strM15989a != null) {
            lulVar.m16007a("resource_id", strM15989a);
        }
        this.f39215d.reset();
        view.transformMatrixToGlobal(this.f39215d);
        this.f39216e.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        this.f39215d.mapRect(this.f39216e);
        this.f39217f.set(Math.round(this.f39216e.left), Math.round(this.f39216e.top), Math.round(this.f39216e.right), Math.round(this.f39216e.bottom));
        String shortString = this.f39217f.toShortString();
        lulVar.m16007a("bounds", shortString);
        Iterator it = this.f39213b.iterator();
        while (it.hasNext()) {
            ((AmbientMode.AmbientController) it.next()).f1697a.mo15980a((lul) c1058va.f47802a, view);
        }
        if (view.getClass().getName().equals("androidx.compose.ui.platform.ComposeView")) {
            Iterator it2 = this.f39213b.iterator();
            do {
                if (!it2.hasNext()) {
                    lul lulVar2 = (lul) c1058va.m19472K().f47802a;
                    lulVar2.m16007a("class", "🚀 🚀 🚀 See go/hsv-compose 🚀 🚀 🚀");
                    lulVar2.m16007a("bounds", shortString);
                    lulVar2.m16007a("description", "HSV has support for Compose, but an extension needs to be installed to use it. See go/hsv-compose for more info.");
                    lulVar2.m16007a("go link", "go/hsv-compose");
                    break;
                }
            } while (!((AmbientMode.AmbientController) it2.next()).getClass().getName().equals("com.google.android.libraries.view.hierarchysnapshotter.compose.ComposeExtension"));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i3 = i + 1;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null) {
                    m15991c(c1058va.m19472K(), childAt, i3, i4, map);
                } else {
                    String.format("Null child %d/%d, parent: %s", Integer.valueOf(i4), Integer.valueOf(childCount), view);
                }
            }
            if (this.f39214c != null) {
                try {
                    ViewGroup viewGroup2 = (ViewGroup) this.f39214c.invoke(viewGroup.getOverlay(), new Object[0]);
                    if (viewGroup2 == null || viewGroup2.getChildCount() == 0) {
                        return;
                    }
                    m15991c(c1058va.m19472K(), viewGroup2, i3, -1, map);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    Log.w(f39212a, YmzeHXaMYOLk.ewzlFnHTjHXTk, e);
                }
            }
        }
    }
}
