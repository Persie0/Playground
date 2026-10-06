package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class nbz {

    /* JADX INFO: renamed from: a */
    public final String f41965a;

    /* JADX INFO: renamed from: b */
    public final boolean f41966b;

    /* JADX INFO: renamed from: c */
    public final long f41967c;

    /* JADX INFO: renamed from: d */
    private final Class f41968d;

    /* JADX INFO: renamed from: e */
    private final boolean f41969e;

    protected nbz(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    /* JADX INFO: renamed from: c */
    public static nbz m17309c(String str, Class cls) {
        return new nbz(str, cls, false, false);
    }

    /* JADX INFO: renamed from: a */
    protected void mo17261a(Iterator it, nby nbyVar) {
        while (it.hasNext()) {
            mo17262b(it.next(), nbyVar);
        }
    }

    /* JADX INFO: renamed from: b */
    protected void mo17262b(Object obj, nby nbyVar) {
        nbyVar.mo17308a(this.f41965a, obj);
    }

    /* JADX INFO: renamed from: d */
    public final Object m17310d(Object obj) {
        return this.f41968d.cast(obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m17311e(Object obj, nby nbyVar) {
        if (!this.f41969e || ndk.m17360a() <= 20) {
            mo17262b(obj, nbyVar);
        } else {
            nbyVar.mo17308a(this.f41965a, obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17312f(Iterator it, nby nbyVar) {
        if (!this.f41966b) {
            throw new IllegalStateException("non repeating key");
        }
        if (!this.f41969e || ndk.m17360a() <= 20) {
            mo17261a(it, nbyVar);
        } else {
            while (it.hasNext()) {
                nbyVar.mo17308a(this.f41965a, it.next());
            }
        }
    }

    public final String toString() {
        return getClass().getName() + "/" + this.f41965a + "[" + this.f41968d.getName() + "]";
    }

    private nbz(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!nea.m17396j(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!nea.m17396j(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.f41965a = str;
        this.f41968d = cls;
        this.f41966b = z;
        this.f41969e = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f41967c = j;
    }
}
