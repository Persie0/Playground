package p080e;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0301c;
import androidx.appcompat.widget.C0307e;
import androidx.appcompat.widget.C0336q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p326q.C8452h;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
public class C5284p {

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f33476b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f33477c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f33478d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f33479e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f33480f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f33481g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C8452h<String, Constructor<? extends View>> f33482h = new C8452h<>();

    /* JADX INFO: renamed from: a */
    public final Object[] f33483a = new Object[2];

    /* JADX INFO: renamed from: e.p$a */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final View f33484a;

        /* JADX INFO: renamed from: b */
        public final String f33485b;

        /* JADX INFO: renamed from: c */
        public Method f33486c;

        /* JADX INFO: renamed from: d */
        public Context f33487d;

        public a(View view, String str) {
            this.f33484a = view;
            this.f33485b = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f33486c != null) {
                break;
            }
            View view2 = this.f33484a;
            Context context = view2.getContext();
            while (true) {
                Context context2 = context;
                String str2 = this.f33485b;
                if (context2 == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbM854m = C0204c.m854m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM854m.append(view2.getClass());
                    sbM854m.append(str);
                    throw new IllegalStateException(sbM854m.toString());
                }
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(str2, View.class)) != null) {
                        this.f33486c = method;
                        this.f33487d = context2;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null;
            }
            try {
                this.f33486c.invoke(this.f33487d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0301c mo8921a(Context context, AttributeSet attributeSet) {
        return new C0301c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C0307e mo8922b(Context context, AttributeSet attributeSet) {
        return new C0307e(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public AppCompatCheckBox mo8923c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public C0336q mo8924d(Context context, AttributeSet attributeSet) {
        return new C0336q(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public AppCompatTextView mo8925e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m11396f(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String strConcat;
        C8452h<String, Constructor<? extends View>> c8452h = f33482h;
        Constructor<? extends View> orDefault = c8452h.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            orDefault = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f33476b);
            c8452h.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f33483a);
    }

    /* JADX INFO: renamed from: g */
    public final void m11397g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
