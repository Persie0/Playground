package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: kj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0770kj {

    /* JADX INFO: renamed from: a */
    public static Method f36231a;

    /* JADX INFO: renamed from: b */
    public static Method f36232b;

    /* JADX INFO: renamed from: c */
    public static Method f36233c;

    /* JADX INFO: renamed from: d */
    public static boolean f36234d;

    static {
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod(TVkaNXnfP.pLU, Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE);
            f36231a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
            f36232b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
            f36233c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f36234d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
