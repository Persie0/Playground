package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: nr */
/* JADX INFO: loaded from: classes.dex */
public class C3382nr {

    /* JADX INFO: renamed from: b */
    public static final Class[] f53156b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f53157c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final String[] f53158d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e */
    public static final l79 f53159e = new l79(0);

    /* JADX INFO: renamed from: a */
    public final Object[] f53160a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C2972ep mo6244a(Context context, AttributeSet attributeSet) {
        return new C2972ep(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C3009fp mo6245b(Context context, AttributeSet attributeSet) {
        return new C3009fp(context, attributeSet, R$attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C3083hp mo6246c(Context context, AttributeSet attributeSet) {
        return new C3083hp(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public C3270kq mo6247d(Context context, AttributeSet attributeSet) {
        return new C3270kq(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C3048gr mo6248e(Context context, AttributeSet attributeSet) {
        return new C3048gr(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m17596f(Context context, String str, String str2) {
        String strConcat;
        l79 l79Var = f53159e;
        Constructor constructor = (Constructor) l79Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f53156b);
            l79Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f53160a);
    }
}
