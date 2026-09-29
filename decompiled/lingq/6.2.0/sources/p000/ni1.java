package p000;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;

/* JADX INFO: loaded from: classes2.dex */
public final class ni1 implements bk8, c76 {

    /* JADX INFO: renamed from: a */
    public final bk8 f52749a;

    /* JADX INFO: renamed from: b */
    public final c76 f52750b;

    /* JADX INFO: renamed from: c */
    public kn1 f52751c;

    /* JADX INFO: renamed from: d */
    public Throwable f52752d;

    /* JADX INFO: renamed from: e */
    public final mi1 f52753e;

    public ni1(bk8 bk8Var) {
        C3248a c3248a = new C3248a();
        bk8Var.getClass();
        this.f52749a = bk8Var;
        this.f52750b = c3248a;
        this.f52753e = new mi1(this);
    }

    @Override // p000.bk8
    /* JADX INFO: renamed from: S */
    public final boolean mo2872S() {
        return this.f52749a.mo2872S();
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: a */
    public final boolean mo4386a(Object obj) {
        return this.f52750b.mo4386a(obj);
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: b */
    public final void mo4387b(Object obj) {
        this.f52750b.mo4387b(obj);
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: c */
    public final Object mo4388c(ContinuationImpl continuationImpl) {
        return this.f52750b.mo4388c(continuationImpl);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        mi1 mi1Var = this.f52753e;
        if (mi1Var != null) {
            mi1Var.m244j(-1);
        }
        this.f52749a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m17438e(StringBuilder sb) {
        int i;
        mi1 mi1Var = this.f52753e;
        if (this.f52751c == null && this.f52752d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            kn1 kn1Var = this.f52751c;
            if (kn1Var != null) {
                sb.append("\t\tCoroutine: " + kn1Var);
                sb.append('\n');
            }
            Throwable th = this.f52752d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = u91.m22584B0(vk9.m23395r0(lda.m16112L(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (mi1Var != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (((p84) mi1Var.f474g)) {
                i = mi1Var.f470c;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // p000.bk8
    /* JADX INFO: renamed from: e0 */
    public final ik8 mo2873e0(String str) {
        str.getClass();
        mi1 mi1Var = this.f52753e;
        if (mi1Var == null) {
            return this.f52749a.mo2873e0(str);
        }
        Object objM238d = mi1Var.m238d(str);
        objM238d.getClass();
        return new yc0((ik8) objM238d, 1);
    }

    public final String toString() {
        return this.f52749a.toString();
    }
}
