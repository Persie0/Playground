package p000;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hub {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13482a(Unsafe unsafe, ytb ytbVar, long j, Object obj, Object obj2) {
        while (!dub.m10682a(unsafe, ytbVar, j, obj, obj2)) {
            if (unsafe.getObject(ytbVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
