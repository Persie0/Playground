package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: qv */
/* JADX INFO: loaded from: classes.dex */
public final class C3512qv implements Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58235a;

    /* JADX INFO: renamed from: b */
    public final Object f58236b;

    public /* synthetic */ C3512qv(Object obj, int i) {
        this.f58235a = i;
        this.f58236b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f58235a;
        Object obj = this.f58236b;
        switch (i) {
            case 0:
                return new C3705w0((Object[]) obj);
            case 1:
                return new C3705w0((Iterator) ((ui3) obj).mo0a());
            default:
                return new cb2((db2) obj);
        }
    }
}
