package androidx.datastore.core;

import p000.c76;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(c76 c76Var, Object obj, vi3 vi3Var) {
        c76Var.getClass();
        vi3Var.getClass();
        boolean zMo4386a = c76Var.mo4386a(obj);
        try {
            return (R) vi3Var.invoke(Boolean.valueOf(zMo4386a));
        } finally {
            if (zMo4386a) {
                c76Var.mo4387b(obj);
            }
        }
    }

    public static /* synthetic */ Object withTryLock$default(c76 c76Var, Object obj, vi3 vi3Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        c76Var.getClass();
        vi3Var.getClass();
        boolean zMo4386a = c76Var.mo4386a(obj);
        try {
            return vi3Var.invoke(Boolean.valueOf(zMo4386a));
        } finally {
            if (zMo4386a) {
                c76Var.mo4387b(obj);
            }
        }
    }
}
