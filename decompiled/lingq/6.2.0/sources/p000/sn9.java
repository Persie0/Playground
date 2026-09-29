package p000;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class sn9 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f61067d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61068a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f61069b;

    /* JADX INFO: renamed from: c */
    public final Object f61070c;

    public sn9(Object obj, String str) {
        this.f61069b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f61070c = cls.getMethod(str, f61067d);
        } catch (Exception e) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Couldn't resolve menu item onClick handler ", str, " in class ");
            sbM17742q.append(cls.getName());
            InflateException inflateException = new InflateException(sbM17742q.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        int i = this.f61068a;
        Object obj = this.f61070c;
        Object obj2 = this.f61069b;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj2, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj2, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    v63.m23141s(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) obj2).onMenuItemClick(((qw5) obj).m15761f(menuItem));
        }
    }

    public sn9(qw5 qw5Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f61070c = qw5Var;
        this.f61069b = onMenuItemClickListener;
    }
}
