package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jgn extends jgk {

    /* JADX INFO: renamed from: b */
    private boolean f33969b;

    /* JADX INFO: renamed from: c */
    private ArrayList f33970c;

    protected jgn(DataHolder dataHolder) {
        super(dataHolder);
        this.f33969b = false;
    }

    /* JADX INFO: renamed from: g */
    private final void m13138g() {
        synchronized (this) {
            if (!this.f33969b) {
                DataHolder dataHolder = this.f33965a;
                jib.m13205j(dataHolder);
                int i = dataHolder.f7633h;
                ArrayList arrayList = new ArrayList();
                this.f33970c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String strMo13141f = mo13141f();
                    String strM4661b = this.f33965a.m4661b(strMo13141f, 0, this.f33965a.m4660a(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int iM4660a = this.f33965a.m4660a(i2);
                        String strM4661b2 = this.f33965a.m4661b(strMo13141f, i2, iM4660a);
                        if (strM4661b2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + strMo13141f + ", at row: " + i2 + ", for window: " + iM4660a);
                        }
                        if (!strM4661b2.equals(strM4661b)) {
                            this.f33970c.add(Integer.valueOf(i2));
                            strM4661b = strM4661b2;
                        }
                    }
                }
                this.f33969b = true;
            }
        }
    }

    @Override // p000.jgk, p000.jgl
    /* JADX INFO: renamed from: b */
    public final int mo13134b() {
        m13138g();
        return this.f33970c.size();
    }

    @Override // p000.jgl
    /* JADX INFO: renamed from: c */
    public final Object mo13135c(int i) {
        m13138g();
        int iM13139d = m13139d(i);
        int iIntValue = 0;
        if (i >= 0 && i != this.f33970c.size()) {
            if (i == this.f33970c.size() - 1) {
                DataHolder dataHolder = this.f33965a;
                jib.m13205j(dataHolder);
                iIntValue = dataHolder.f7633h - ((Integer) this.f33970c.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.f33970c.get(i + 1)).intValue() - ((Integer) this.f33970c.get(i)).intValue();
            }
            if (iIntValue == 1) {
                int iM13139d2 = m13139d(i);
                DataHolder dataHolder2 = this.f33965a;
                jib.m13205j(dataHolder2);
                dataHolder2.m4660a(iM13139d2);
                iIntValue = 1;
            }
        }
        return mo13140e(iM13139d, iIntValue);
    }

    /* JADX INFO: renamed from: d */
    final int m13139d(int i) {
        if (i >= 0 && i < this.f33970c.size()) {
            return ((Integer) this.f33970c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* JADX INFO: renamed from: e */
    protected abstract Object mo13140e(int i, int i2);

    /* JADX INFO: renamed from: f */
    protected abstract String mo13141f();
}
