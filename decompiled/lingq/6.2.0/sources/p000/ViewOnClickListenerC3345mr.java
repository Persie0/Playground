package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: mr */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3345mr implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final View f51761a;

    /* JADX INFO: renamed from: b */
    public final String f51762b;

    /* JADX INFO: renamed from: c */
    public Method f51763c;

    /* JADX INFO: renamed from: d */
    public Context f51764d;

    public ViewOnClickListenerC3345mr(View view, String str) {
        this.f51761a = view;
        this.f51762b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f51763c != null) {
            break;
        }
        View view2 = this.f51761a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f51762b;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM17742q = AbstractC3393o1.m17742q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM17742q.append(view2.getClass());
                sbM17742q.append(str);
                throw new IllegalStateException(sbM17742q.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f51763c = method;
                    this.f51764d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f51763c.invoke(this.f51764d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
