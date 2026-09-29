package p150h9;

import com.google.android.exoplayer2.AbstractC2352a;
import com.google.android.exoplayer2.AbstractC2382c0;
import ga.InterfaceC5732o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: h9.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5922k0 extends AbstractC2352a {

    /* JADX INFO: renamed from: f */
    public final int f35334f;

    /* JADX INFO: renamed from: g */
    public final int f35335g;

    /* JADX INFO: renamed from: h */
    public final int[] f35336h;

    /* JADX INFO: renamed from: i */
    public final int[] f35337i;

    /* JADX INFO: renamed from: j */
    public final AbstractC2382c0[] f35338j;

    /* JADX INFO: renamed from: k */
    public final Object[] f35339k;

    /* JADX INFO: renamed from: l */
    public final HashMap<Object, Integer> f35340l;

    public C5922k0(List list, InterfaceC5732o interfaceC5732o) {
        super(interfaceC5732o);
        int size = list.size();
        this.f35336h = new int[size];
        this.f35337i = new int[size];
        this.f35338j = new AbstractC2382c0[size];
        this.f35339k = new Object[size];
        this.f35340l = new HashMap<>();
        Iterator it = list.iterator();
        int iMo6909o = 0;
        int iMo6905h = 0;
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC5904b0 interfaceC5904b0 = (InterfaceC5904b0) it.next();
            this.f35338j[i10] = interfaceC5904b0.mo7061b();
            this.f35337i[i10] = iMo6909o;
            this.f35336h[i10] = iMo6905h;
            iMo6909o += this.f35338j[i10].mo6909o();
            iMo6905h += this.f35338j[i10].mo6905h();
            this.f35339k[i10] = interfaceC5904b0.mo7060a();
            this.f35340l.put(this.f35339k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f35334f = iMo6909o;
        this.f35335g = iMo6905h;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: h */
    public final int mo6905h() {
        return this.f35335g;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: o */
    public final int mo6909o() {
        return this.f35334f;
    }
}
