package android.support.v7.app;

import android.R;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p000.C0265ii;
import p000.C0267ik;
import p000.C0278iv;
import p000.C0752js;
import p000.C1117xf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: c */
    public final Object[] f908c = new Object[2];

    /* JADX INFO: renamed from: d */
    private static final Class[] f906d = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: a */
    public static final int[] f904a = {R.attr.onClick};

    /* JADX INFO: renamed from: b */
    public static final String[] f905b = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e */
    private static final C1117xf f907e = new C1117xf();

    /* JADX INFO: renamed from: a */
    public C0265ii mo1022a(Context context, AttributeSet attributeSet) {
        return new C0265ii(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public AppCompatButton mo1023b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public C0267ik mo1024c(Context context, AttributeSet attributeSet) {
        return new C0267ik(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public C0278iv mo1025d(Context context, AttributeSet attributeSet) {
        return new C0278iv(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C0752js mo1026e(Context context, AttributeSet attributeSet) {
        return new C0752js(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m1027f(Context context, String str, String str2) {
        String str3;
        C1117xf c1117xf = f907e;
        Constructor constructor = (Constructor) c1117xf.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception e) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f906d);
            c1117xf.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f908c);
    }
}
