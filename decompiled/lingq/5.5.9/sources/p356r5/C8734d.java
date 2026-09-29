package p356r5;

import android.text.TextUtils;
import java.security.MessageDigest;
import p003a2.C0009a;

/* JADX INFO: renamed from: r5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8734d<T> {

    /* JADX INFO: renamed from: e */
    public static final a f46326e = new a();

    /* JADX INFO: renamed from: a */
    public final T f46327a;

    /* JADX INFO: renamed from: b */
    public final b<T> f46328b;

    /* JADX INFO: renamed from: c */
    public final String f46329c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f46330d;

    /* JADX INFO: renamed from: r5.d$a */
    public class a implements b<Object> {
        @Override // p356r5.C8734d.b
        /* JADX INFO: renamed from: a */
        public final void mo6346a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: r5.d$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo6346a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public C8734d(String str, T t10, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f46329c = str;
        this.f46327a = t10;
        this.f46328b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static C8734d m16962a(Object obj, String str) {
        return new C8734d(str, obj, f46326e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8734d) {
            return this.f46329c.equals(((C8734d) obj).f46329c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46329c.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("Option{key='"), this.f46329c, "'}");
    }
}
