package p000;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC0204gb implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private static final Class[] f24064a = {MenuItem.class};

    /* JADX INFO: renamed from: b */
    private final Object f24065b;

    /* JADX INFO: renamed from: c */
    private Method f24066c;

    public MenuItemOnMenuItemClickListenerC0204gb(Object obj, String str) {
        this.f24065b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f24066c = cls.getMethod(str, f24064a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f24066c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f24066c.invoke(this.f24065b, menuItem)).booleanValue();
            }
            this.f24066c.invoke(this.f24065b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
