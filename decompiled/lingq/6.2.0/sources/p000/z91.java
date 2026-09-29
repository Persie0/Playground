package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z91 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71217a;

    /* JADX INFO: renamed from: b */
    public final Object f71218b;

    public z91() {
        this.f71217a = 3;
        this.f71218b = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public void m25511b(Object obj, String str) {
        ((ArrayList) this.f71218b).add(new xna(obj, str));
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        int i = this.f71217a;
        Object obj = this.f71218b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return omd.m18129S((zi3) obj);
            case 2:
                return (Iterator) obj;
            default:
                return ((ArrayList) obj).iterator();
        }
    }

    public /* synthetic */ z91(Object obj, int i) {
        this.f71217a = i;
        this.f71218b = obj;
    }
}
