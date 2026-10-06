package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.wear.ambient.AmbientMode;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jhh extends jgw implements jdu {

    /* JADX INFO: renamed from: a */
    private static volatile Executor f34056a;

    /* JADX INFO: renamed from: s */
    public final Set f34057s;

    /* JADX INFO: renamed from: t */
    private final Account f34058t;

    /* JADX WARN: Bottom block not found for handler: all -> 0x0077 */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected jhh(Context context, Looper looper, int i, jgz jgzVar, jfe jfeVar, jga jgaVar) throws Throwable {
        synchronized (jhj.f34065a) {
            try {
                if (jhj.f34067h == null) {
                    jhj.f34067h = new jhj(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    throw th;
                }
            }
        }
        jhj jhjVar = jhj.f34067h;
        jcy jcyVar = jcy.f33766a;
        jib.m13205j(jfeVar);
        jib.m13205j(jgaVar);
        super(context, looper, jhjVar, jcyVar, i, new AmbientMode.AmbientController(jfeVar), new AmbientMode.AmbientController(jgaVar), jgzVar.f34019f, null, null, null, null, null, null);
        this.f34058t = jgzVar.f34014a;
        Set set = jgzVar.f34016c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f34057s = set;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: D */
    public final jcw[] mo13155D() {
        return new jcw[0];
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: F */
    protected final void mo13156F() {
    }

    @Override // p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public int mo12833a() {
        throw null;
    }

    @Override // p000.jdu
    /* JADX INFO: renamed from: h */
    public final Set mo12940h() {
        return mo12947o() ? this.f34057s : Collections.emptySet();
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: s */
    public final Account mo13167s() {
        return this.f34058t;
    }
}
