package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jm2 {

    /* JADX INFO: renamed from: a */
    public static final Method f45819a;

    /* JADX INFO: renamed from: b */
    public static final Method f45820b;

    /* JADX INFO: renamed from: c */
    public static final Method f45821c;

    /* JADX INFO: renamed from: d */
    public static final boolean f45822d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f45819a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f45820b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f45821c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f45822d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
