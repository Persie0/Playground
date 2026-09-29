package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mz6 {

    /* JADX INFO: renamed from: a */
    public final Object f52082a;

    public mz6(Object obj) {
        if (obj != null) {
            this.f52082a = obj;
        } else {
            C3386nv.m17635v("value for optional is empty.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m17159a() {
        Object obj = this.f52082a;
        if (obj != null) {
            return obj;
        }
        uk9.m22775i("No value present");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17160b() {
        return this.f52082a != null;
    }

    public mz6() {
        this.f52082a = null;
    }
}
