package p000;

import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kon {

    /* JADX INFO: renamed from: a */
    public final Object f36701a;

    /* JADX INFO: renamed from: b */
    public Object f36702b;

    public kon(Context context) {
        this.f36701a = context;
    }

    public kon(jcz jczVar) {
        this.f36701a = new SparseIntArray();
        jib.m13205j(jczVar);
        this.f36702b = jczVar;
    }

    public kon(jvd jvdVar) {
        this.f36701a = jvdVar;
    }

    public kon(kbo kboVar) {
        this.f36701a = kboVar.mo6314a("FrameServerLock");
    }

    public kon(kdf kdfVar, kme kmeVar) {
        this.f36702b = kdfVar;
        this.f36701a = kmeVar;
    }

    public kon(byte[] bArr, byte[] bArr2) {
        this.f36702b = null;
        this.f36701a = inr.m11545q(new gup(1));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final void m14625a(ktz ktzVar) {
        Object obj = this.f36701a;
        Object obj2 = ktzVar.f37199b;
        khb khbVar = (khb) obj;
        lpe lpeVar = (lpe) khbVar.f36008a.get(obj2);
        if (lpeVar == null) {
            lpeVar = new lpe(ktzVar, (byte[]) null);
            khbVar.f36008a.put(obj2, lpeVar);
        }
        this.f36702b = lpeVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m14626b(khg khgVar) {
        if (!khgVar.equals(this.f36702b)) {
            this.f36701a.mo13940b(String.valueOf(String.valueOf(khgVar)).concat(" is now active."));
            this.f36702b = khgVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m14627c(khg khgVar) {
        if (!khgVar.equals(this.f36702b)) {
            this.f36701a.mo13940b(String.valueOf(String.valueOf(khgVar)).concat(" is now active."));
            this.f36702b = khgVar;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m14628d(khg khgVar) {
        if (this.f36702b == khgVar) {
            this.f36702b = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m14629e(khg khgVar) {
        return khgVar.equals(this.f36702b);
    }

    /* JADX INFO: renamed from: f */
    public final void m14630f() {
        ((SparseIntArray) this.f36701a).clear();
    }

    /* JADX INFO: renamed from: g */
    public final int m14631g(int i) {
        return ((SparseIntArray) this.f36701a).get(i, -1);
    }

    /* JADX INFO: renamed from: h */
    public final int m14632h() {
        int i;
        Object obj = this.f36701a;
        synchronized (((ktz) obj).f37199b) {
            i = ((mtm) ((ktz) obj).f37201d).f41599b;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14633i(long j, flt fltVar) {
        synchronized (this.f36701a) {
            fjd fjdVar = (fjd) ((ktz) this.f36701a).m14857j(j);
            if (fjdVar == null) {
                return false;
            }
            fltVar.mo8486a(fjdVar.f22210a);
            this.f36702b = fjdVar;
            while (true) {
                fjd fjdVar2 = (fjd) ((ktz) this.f36701a).m14858k();
                if (fjdVar2 == null || !fjdVar2.m8485e(fjdVar)) {
                    break;
                    break;
                }
                fjd fjdVar3 = (fjd) ((ktz) this.f36701a).m14859l();
                if (fjdVar3 != null) {
                    fjdVar3.m8483b();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14634j(fjd fjdVar) {
        synchronized (this.f36701a) {
            Object obj = this.f36702b;
            if (obj != null && fjdVar.m8485e((fjd) obj)) {
                fjdVar.m8483b();
                return;
            }
            ((ktz) this.f36701a).m14861n(fjdVar.m8482a(), fjdVar);
        }
    }

    public kon() {
        this.f36701a = new khb((byte[]) null, (char[]) null);
        this.f36702b = null;
        System.nanoTime();
    }
}
