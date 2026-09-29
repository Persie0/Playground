package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w8b {

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f66537a;

    /* JADX INFO: renamed from: b */
    public final u70 f66538b = new u70(17);

    public w8b(AbstractC0746d abstractC0746d) {
        this.f66537a = abstractC0746d;
    }

    /* JADX INFO: renamed from: a */
    public final void m23814a(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC0758a.m2859b(this.f66537a, false, true, new r3a(21, this, new v8b((String) it.next(), str)));
        }
    }
}
