package p000;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class nan implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g */
    final Object f41901g;

    /* JADX INFO: renamed from: h */
    final Object f41902h;

    public nan(Object obj, Object obj2) {
        obj.getClass();
        this.f41901g = obj;
        this.f41902h = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f41902h) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f41902h) {
            string = this.f41901g.toString();
        }
        return string;
    }
}
