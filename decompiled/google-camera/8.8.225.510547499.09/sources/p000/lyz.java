package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lyz {

    /* JADX INFO: renamed from: b */
    private static lyz f39583b;

    /* JADX INFO: renamed from: a */
    public final Object f39584a;

    public lyz() {
    }

    public lyz(Context context) {
        this.f39584a = context;
    }

    public lyz(apt aptVar) {
        this.f39584a = aptVar;
    }

    public lyz(String str) {
        this.f39584a = str;
    }

    public lyz(oju ojuVar) {
        ojuVar.getClass();
        this.f39584a = ojuVar;
    }

    private lyz(byte[] bArr) {
        this.f39584a = new Object();
        new Handler(Looper.getMainLooper(), new mlr(this, null, null));
    }

    public lyz(byte[] bArr, byte[] bArr2) {
        this.f39584a = mkv.m16498F();
    }

    /* JADX INFO: renamed from: a */
    public static lyz m16210a() {
        if (f39583b == null) {
            f39583b = new lyz((byte[]) null);
        }
        return f39583b;
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m16211f(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: h */
    public static lyz m16212h(String str) {
        return new lyz(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public final void m16214c(mzj mzjVar) {
        lku.m15607B(!mzjVar.m17186o(), "range must not be empty, but was %s", mzjVar);
        this.f39584a.add(mzjVar);
    }

    /* JADX INFO: renamed from: d */
    public final String m16215d(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        m16216e(sb, it);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m16216e(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m16211f(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f39584a);
                    sb.append(m16211f(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m16217g(Object obj, Object... objArr) {
        return m16215d(new mri(objArr, obj));
    }

    public lyz(Field field) {
        this.f39584a = field;
        field.setAccessible(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m16213b(Object obj, Object obj2) {
        try {
            ((Field) this.f39584a).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public lyz(char[] cArr) {
        this.f39584a = new ConcurrentHashMap();
    }
}
