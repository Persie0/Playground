package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tmb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62544a;

    /* JADX INFO: renamed from: b */
    public int f62545b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62546c;

    public /* synthetic */ tmb(Object obj, int i) {
        this.f62544a = i;
        this.f62546c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f62544a) {
            case 0:
                return this.f62545b < ((xmb) this.f62546c).f68360a.length();
            case 1:
                return this.f62545b < ((xmb) this.f62546c).f68360a.length();
            default:
                return this.f62545b < ((cib) this.f62546c).m4744n();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.f62544a;
        Object obj = this.f62546c;
        switch (i) {
            case 0:
                String str = ((xmb) obj).f68360a;
                int i2 = this.f62545b;
                if (i2 < str.length()) {
                    this.f62545b = i2 + 1;
                    return new xmb(String.valueOf(i2));
                }
                uk9.m22784s();
                return null;
            case 1:
                xmb xmbVar = (xmb) obj;
                String str2 = xmbVar.f68360a;
                int i3 = this.f62545b;
                if (i3 < str2.length()) {
                    this.f62545b = i3 + 1;
                    return new xmb(String.valueOf(xmbVar.f68360a.charAt(i3)));
                }
                uk9.m22784s();
                return null;
            default:
                cib cibVar = (cib) obj;
                int i4 = this.f62545b;
                int iM4744n = cibVar.m4744n();
                int i5 = this.f62545b;
                if (i4 < iM4744n) {
                    this.f62545b = i5 + 1;
                    return cibVar.m4745o(i5);
                }
                uk9.m22775i(wq1.m24124t(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
                return null;
        }
    }
}
