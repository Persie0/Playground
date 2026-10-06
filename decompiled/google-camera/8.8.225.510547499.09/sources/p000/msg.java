package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msg {

    /* JADX INFO: renamed from: a */
    public int f41540a;

    /* JADX INFO: renamed from: b */
    public final Object f41541b;

    public msg(byte[] bArr) {
        this.f41541b = new ReentrantLock();
    }

    public msg(byte[] bArr, byte[] bArr2) {
        this.f41541b = new Object[256];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final void m16862a(char c, String str) {
        this.f41541b.put(Character.valueOf(c), str);
        if (c > this.f41540a) {
            this.f41540a = c;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final void m16863b() {
        char[][] cArr = new char[this.f41540a + 1][];
        for (Map.Entry entry : this.f41541b.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m16864c() {
        int i = this.f41540a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.f41541b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f41540a = i2;
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m16865d(Object obj) {
        int i = this.f41540a;
        if (i < 256) {
            ((Object[]) this.f41541b)[i] = obj;
            this.f41540a = i + 1;
        }
    }

    public msg() {
        this.f41540a = -1;
        this.f41541b = new HashMap();
    }
}
