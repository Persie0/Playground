package p000;

import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ibj extends iaz {

    /* JADX INFO: renamed from: d */
    public View f30206d;

    /* JADX INFO: renamed from: e */
    public ibm f30207e;

    /* JADX INFO: renamed from: f */
    public Set f30208f;

    /* JADX INFO: renamed from: i */
    public final void m10998i(boolean z) {
        Iterator it = this.f30208f.iterator();
        while (it.hasNext()) {
            ((ibk) it.next()).mo7488j(z);
        }
    }
}
