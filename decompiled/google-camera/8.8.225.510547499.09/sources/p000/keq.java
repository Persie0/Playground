package p000;

import android.util.SparseArray;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class keq {

    /* JADX INFO: renamed from: a */
    public static final int[] f35784a = {0, 1, 2, 3, 4};

    /* JADX INFO: renamed from: b */
    public final int f35785b;

    /* JADX INFO: renamed from: d */
    private final SparseArray f35787d = new SparseArray();

    /* JADX INFO: renamed from: c */
    public int f35786c = 0;

    public keq(int i) {
        this.f35785b = i;
    }

    /* JADX INFO: renamed from: f */
    private static int m14073f(short s) {
        return (char) s;
    }

    /* JADX INFO: renamed from: a */
    protected final int m14074a() {
        return this.f35787d.size();
    }

    /* JADX INFO: renamed from: b */
    public final ken m14075b(short s) {
        return (ken) this.f35787d.get(m14073f(s));
    }

    /* JADX INFO: renamed from: c */
    protected final void m14076c(short s) {
        this.f35787d.remove(m14073f(s));
    }

    /* JADX INFO: renamed from: d */
    protected final ken[] m14077d() {
        int size = this.f35787d.size();
        ken[] kenVarArr = new ken[size];
        for (int i = 0; i < size; i++) {
            kenVarArr[i] = (ken) this.f35787d.valueAt(i);
        }
        return kenVarArr;
    }

    /* JADX INFO: renamed from: e */
    public final void m14078e(ken kenVar) {
        kenVar.f35769e = this.f35785b;
        int iM14073f = m14073f(kenVar.f35765a);
        this.f35787d.put(iM14073f, kenVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof keq)) {
            keq keqVar = (keq) obj;
            if (keqVar.f35785b == this.f35785b && keqVar.m14074a() == m14074a()) {
                for (ken kenVar : keqVar.m14077d()) {
                    if (kenVar != null && !ExifInterface.m4677t(kenVar.f35765a) && !kenVar.equals((ken) this.f35787d.get(m14073f(kenVar.f35765a)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35785b), Integer.valueOf(this.f35786c), this.f35787d});
    }
}
