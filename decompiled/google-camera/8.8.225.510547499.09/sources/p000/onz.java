package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onz {

    /* JADX INFO: renamed from: a */
    private static final Object[] f46344a = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final Object[] m18732a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return f46344a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f46344a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                objArrCopyOf.getClass();
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m18733b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            objNewInstance.getClass();
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                objArrCopyOf.getClass();
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }
}
