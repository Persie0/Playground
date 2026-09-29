package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf3 {

    /* JADX INFO: renamed from: a */
    public static final ag3 f66752a = new ag3();

    /* JADX INFO: renamed from: b */
    public static final cg3 f66753b;

    static {
        cg3 cg3Var = null;
        try {
            cg3Var = (cg3) gg3.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f66753b = cg3Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m23892a(int i, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
