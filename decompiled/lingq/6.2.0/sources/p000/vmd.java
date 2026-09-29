package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vmd extends afa {

    /* JADX INFO: renamed from: a */
    public Object[] f65625a;

    /* JADX INFO: renamed from: b */
    public int f65626b;

    @Override // p000.afa
    /* JADX INFO: renamed from: g */
    public final int mo357g() {
        return this.f65626b;
    }

    @Override // p000.afa
    /* JADX INFO: renamed from: h */
    public final end mo358h(int i) {
        if (i < this.f65626b) {
            return (end) this.f65625a[i + i];
        }
        v63.m23128b();
        return null;
    }

    @Override // p000.afa
    /* JADX INFO: renamed from: i */
    public final Object mo359i(int i) {
        if (i < this.f65626b) {
            return this.f65625a[i + i + 1];
        }
        v63.m23128b();
        return null;
    }

    @Override // p000.afa
    /* JADX INFO: renamed from: j */
    public final Object mo360j(end endVar) {
        int iM23436l = m23436l(endVar);
        if (iM23436l == -1) {
            return null;
        }
        return endVar.f37585b.cast(this.f65625a[iM23436l + iM23436l + 1]);
    }

    /* JADX INFO: renamed from: k */
    public final void m23435k(end endVar, Object obj) {
        int iM23436l;
        if (!endVar.f37586c && (iM23436l = m23436l(endVar)) != -1) {
            dja.m10418b(obj, "metadata value");
            this.f65625a[iM23436l + iM23436l + 1] = obj;
            return;
        }
        int i = this.f65626b + 1;
        Object[] objArr = this.f65625a;
        int length = objArr.length;
        if (i + i > length) {
            this.f65625a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f65625a;
        int i2 = this.f65626b;
        int i3 = i2 + i2;
        objArr2[i3] = endVar;
        dja.m10418b(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.f65626b++;
    }

    /* JADX INFO: renamed from: l */
    public final int m23436l(end endVar) {
        for (int i = 0; i < this.f65626b; i++) {
            if (this.f65625a[i + i].equals(endVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f65626b; i++) {
            sb.append(" '");
            sb.append(mo358h(i));
            sb.append("': ");
            sb.append(mo359i(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
