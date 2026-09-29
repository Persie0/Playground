package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class xsa {
    /* JADX INFO: renamed from: a */
    public static f6b m24661a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        f6b f6bVarM11570g = f6b.m11570g(null, rootWindowInsets);
        c6b c6bVar = f6bVarM11570g.f38536a;
        c6bVar.mo4377y(f6bVarM11570g);
        View rootView = view.getRootView();
        c6bVar.mo4363d(rootView);
        c6bVar.mo138p(rootView);
        c6bVar.mo3380q();
        return f6bVarM11570g;
    }
}
