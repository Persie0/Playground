package p000;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class uhb implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final whb f63949a;

    /* JADX INFO: renamed from: b */
    public whb f63950b;

    public uhb(whb whbVar) {
        this.f63949a = whbVar;
        if (whbVar.m23962f()) {
            C3386nv.m17626m("Default instance must be immutable.");
            throw null;
        }
        this.f63950b = whbVar.m23964h();
    }

    /* JADX INFO: renamed from: a */
    public static void m22738a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22739b() {
        if (this.f63950b.m23962f()) {
            return;
        }
        whb whbVarM23964h = this.f63949a.m23964h();
        cjb.f10181c.m4784a(whbVarM23964h.getClass()).mo11893b(whbVarM23964h, this.f63950b);
        this.f63950b = whbVarM23964h;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final uhb clone() {
        uhb uhbVar = (uhb) this.f63949a.mo329r(5);
        boolean zM23962f = this.f63950b.m23962f();
        whb whbVar = this.f63950b;
        if (zM23962f) {
            whbVar.getClass();
            cjb.f10181c.m4784a(whbVar.getClass()).mo11892a(whbVar);
            whbVar.m23963g();
            whbVar = this.f63950b;
        }
        uhbVar.f63950b = whbVar;
        return uhbVar;
    }

    /* JADX INFO: renamed from: d */
    public final whb m22741d() {
        boolean zM23962f = this.f63950b.m23962f();
        whb whbVar = this.f63950b;
        if (zM23962f) {
            whbVar.getClass();
            cjb.f10181c.m4784a(whbVar.getClass()).mo11892a(whbVar);
            whbVar.m23963g();
            whbVar = this.f63950b;
        }
        whbVar.getClass();
        if (whb.m23959p(whbVar, true)) {
            return whbVar;
        }
        throw new zzafy();
    }

    /* JADX INFO: renamed from: e */
    public final void m22742e(whb whbVar) {
        whb whbVar2 = this.f63949a;
        if (whbVar2.equals(whbVar)) {
            return;
        }
        if (!this.f63950b.m23962f()) {
            whb whbVarM23964h = whbVar2.m23964h();
            cjb.f10181c.m4784a(whbVarM23964h.getClass()).mo11893b(whbVarM23964h, this.f63950b);
            this.f63950b = whbVarM23964h;
        }
        whb whbVar3 = this.f63950b;
        cjb.f10181c.m4784a(whbVar3.getClass()).mo11893b(whbVar3, whbVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m22743f(byte[] bArr, int i, phb phbVar) throws zzaeh {
        if (!this.f63950b.m23962f()) {
            whb whbVarM23964h = this.f63949a.m23964h();
            cjb.f10181c.m4784a(whbVarM23964h.getClass()).mo11893b(whbVarM23964h, this.f63950b);
            this.f63950b = whbVarM23964h;
        }
        try {
            cjb.f10181c.m4784a(this.f63950b.getClass()).mo11898g(this.f63950b, bArr, 0, i, new ehb(phbVar));
        } catch (zzaeh e) {
            throw e;
        } catch (IOException e2) {
            ij6.m13958p("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
