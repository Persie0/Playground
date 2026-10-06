package p000;

import android.content.res.Resources;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class act {

    /* JADX INFO: renamed from: a */
    public static final C1116xe f109a;

    static {
        new ConcurrentHashMap();
        f109a = new C1116xe(16);
    }

    /* JADX INFO: renamed from: a */
    public static String m225a(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
