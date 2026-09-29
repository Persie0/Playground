package p000;

import com.google.firebase.sessions.C1168d;

/* JADX INFO: loaded from: classes.dex */
public final class wy8 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67528a;

    /* JADX INFO: renamed from: b */
    public final Object f67529b;

    public /* synthetic */ wy8(Object obj, int i) {
        this.f67528a = i;
        this.f67529b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static wy8 m24219a(Object obj) {
        if (obj != null) {
            return new wy8(obj, 2);
        }
        C3386nv.m17635v("instance cannot be null");
        return null;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f67528a;
        Object obj = this.f67529b;
        switch (i) {
            case 0:
                return new vy8((dz8) ((qo7) obj).get());
            case 1:
                return new nz8((C1168d) ((qo7) obj).get());
            default:
                return obj;
        }
    }
}
