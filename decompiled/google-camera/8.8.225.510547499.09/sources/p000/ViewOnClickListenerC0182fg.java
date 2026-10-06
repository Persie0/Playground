package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: fg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0182fg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final View f21784a;

    /* JADX INFO: renamed from: b */
    private final String f21785b;

    /* JADX INFO: renamed from: c */
    private Method f21786c;

    /* JADX INFO: renamed from: d */
    private Context f21787d;

    public ViewOnClickListenerC0182fg(View view, String str) {
        this.f21784a = view;
        this.f21785b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f21786c != null) {
            break;
        }
        Context context = this.f21784a.getContext();
        while (true) {
            if (context == null) {
                int id = this.f21784a.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + this.f21784a.getContext().getResources().getResourceEntryName(id) + wUzNh.JHoWegoxZpUsdJE;
                }
                throw new IllegalStateException("Could not find method " + this.f21785b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f21784a.getClass() + str);
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(this.f21785b, View.class)) != null) {
                    this.f21786c = method;
                    this.f21787d = context;
                    break;
                }
            } catch (NoSuchMethodException e) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f21786c.invoke(this.f21787d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
