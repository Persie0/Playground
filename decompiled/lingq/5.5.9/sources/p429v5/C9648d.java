package p429v5;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p315p5.C8189a;
import p356r5.InterfaceC8732b;
import p392t5.C9198d;

/* JADX INFO: renamed from: v5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9648d implements InterfaceC9645a {

    /* JADX INFO: renamed from: b */
    public final File f49428b;

    /* JADX INFO: renamed from: c */
    public final long f49429c;

    /* JADX INFO: renamed from: e */
    public C8189a f49431e;

    /* JADX INFO: renamed from: d */
    public final C9646b f49430d = new C9646b();

    /* JADX INFO: renamed from: a */
    public final C9654j f49427a = new C9654j();

    @Deprecated
    public C9648d(File file, long j10) {
        this.f49428b = file;
        this.f49429c = j10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p429v5.InterfaceC9645a
    /* JADX INFO: renamed from: d */
    public final void mo16804d(InterfaceC8732b interfaceC8732b, C9198d c9198d) {
        C9646b.a aVar;
        C8189a c8189a;
        String strM18116a = this.f49427a.m18116a(interfaceC8732b);
        C9646b c9646b = this.f49430d;
        synchronized (c9646b) {
            try {
                aVar = (C9646b.a) c9646b.f49420a.get(strM18116a);
                if (aVar == null) {
                    C9646b.b bVar = c9646b.f49421b;
                    synchronized (bVar.f49424a) {
                        try {
                            aVar = (C9646b.a) bVar.f49424a.poll();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (aVar == null) {
                        aVar = new C9646b.a();
                    }
                    c9646b.f49420a.put(strM18116a, aVar);
                }
                aVar.f49423b++;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        aVar.f49422a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM18116a + " for for Key: " + interfaceC8732b);
            }
            try {
                synchronized (this) {
                    if (this.f49431e == null) {
                        this.f49431e = C8189a.m16296E(this.f49428b, this.f49429c);
                    }
                    c8189a = this.f49431e;
                }
                if (c8189a.m16309w(strM18116a) == null) {
                    C8189a.c cVarM16308q = c8189a.m16308q(strM18116a);
                    if (cVarM16308q == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM18116a));
                    }
                    try {
                        if (c9198d.f47740a.mo70e(c9198d.f47741b, cVarM16308q.m16311b(), c9198d.f47742c)) {
                            C8189a.m16297a(C8189a.this, cVarM16308q, true);
                            cVarM16308q.f44349c = true;
                        }
                        if (!cVarM16308q.f44349c) {
                            try {
                                cVarM16308q.m16310a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th4) {
                        if (!cVarM16308q.f44349c) {
                            try {
                                cVarM16308q.m16310a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th4;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            this.f49430d.m18115a(strM18116a);
        } catch (Throwable th5) {
            this.f49430d.m18115a(strM18116a);
            throw th5;
        }
    }

    @Override // p429v5.InterfaceC9645a
    /* JADX INFO: renamed from: f */
    public final File mo16806f(InterfaceC8732b interfaceC8732b) {
        C8189a c8189a;
        String strM18116a = this.f49427a.m18116a(interfaceC8732b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM18116a + " for for Key: " + interfaceC8732b);
        }
        try {
            synchronized (this) {
                if (this.f49431e == null) {
                    this.f49431e = C8189a.m16296E(this.f49428b, this.f49429c);
                }
                c8189a = this.f49431e;
            }
            C8189a.e eVarM16309w = c8189a.m16309w(strM18116a);
            if (eVarM16309w != null) {
                return eVarM16309w.f44358a[0];
            }
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            }
        }
        return null;
    }
}
