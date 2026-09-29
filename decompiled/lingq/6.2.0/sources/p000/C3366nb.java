package p000;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: nb */
/* JADX INFO: loaded from: classes2.dex */
public final class C3366nb implements xo6 {

    /* JADX INFO: renamed from: c */
    public static final C3366nb f52549c;

    /* JADX INFO: renamed from: d */
    public static final C3366nb f52550d;

    /* JADX INFO: renamed from: e */
    public static final C3366nb f52551e;

    /* JADX INFO: renamed from: f */
    public static final C3366nb f52552f;

    /* JADX INFO: renamed from: g */
    public static final C3366nb f52553g;

    /* JADX INFO: renamed from: h */
    public static final Object f52554h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile Map f52555i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52556a;

    /* JADX INFO: renamed from: b */
    public final String f52557b;

    static {
        int i = 0;
        f52549c = new C3366nb("TINK", i);
        f52550d = new C3366nb("CRUNCHY", i);
        f52551e = new C3366nb("NO_PREFIX", i);
        int i2 = 1;
        f52552f = new C3366nb("VERTICAL", i2);
        f52553g = new C3366nb("HORIZONTAL", i2);
    }

    public C3366nb(Context context, wad wadVar) {
        this.f52556a = 2;
        this.f52557b = wadVar.m23828t() ? bxc.m4223b(context, wadVar.m23827s()) : wadVar.m23827s();
        wadVar.m23829u();
    }

    @Override // p000.xo6
    /* JADX INFO: renamed from: b */
    public String mo9832b() {
        return ux5.m22992o(new StringBuilder("expected '"), this.f52557b, '\'');
    }

    public String toString() {
        int i = this.f52556a;
        String str = this.f52557b;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3366nb(String str, int i) {
        this.f52556a = i;
        this.f52557b = str;
    }

    public C3366nb(String str) {
        this.f52556a = 3;
        str.getClass();
        this.f52557b = str;
    }
}
