package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zx8 implements SerialDescriptor, rl0 {

    /* JADX INFO: renamed from: a */
    public final String f72346a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3184kh f72347b;

    /* JADX INFO: renamed from: c */
    public final int f72348c;

    /* JADX INFO: renamed from: d */
    public final List f72349d;

    /* JADX INFO: renamed from: e */
    public final HashSet f72350e;

    /* JADX INFO: renamed from: f */
    public final String[] f72351f;

    /* JADX INFO: renamed from: g */
    public final SerialDescriptor[] f72352g;

    /* JADX INFO: renamed from: h */
    public final List[] f72353h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f72354i;

    /* JADX INFO: renamed from: j */
    public final Map f72355j;

    /* JADX INFO: renamed from: k */
    public final SerialDescriptor[] f72356k;

    /* JADX INFO: renamed from: l */
    public final cs4 f72357l;

    public zx8(String str, AbstractC3184kh abstractC3184kh, int i, List list, a31 a31Var) {
        this.f72346a = str;
        this.f72347b = abstractC3184kh;
        this.f72348c = i;
        this.f72349d = a31Var.f164b;
        ArrayList arrayList = a31Var.f165c;
        this.f72350e = u91.m22620l1(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f72351f = strArr;
        this.f72352g = eh0.m11131k(a31Var.f167e);
        this.f72353h = (List[]) a31Var.f168f.toArray(new List[0]);
        this.f72354i = u91.m22617i1(a31Var.f169g);
        strArr.getClass();
        C3512qv c3512qv = new C3512qv(new C3757xf(strArr, 2), 1);
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(c3512qv, 10));
        Iterator it = c3512qv.iterator();
        while (true) {
            C3705w0 c3705w0 = (C3705w0) it;
            if (!((Iterator) c3705w0.f66156c).hasNext()) {
                this.f72355j = AbstractC3194a.m15370W(arrayList2);
                this.f72356k = eh0.m11131k(list);
                this.f72357l = AbstractC3192a.m15356a(new y47(this, 11));
                return;
            }
            r34 r34Var = (r34) c3705w0.next();
            arrayList2.add(new Pair(r34Var.f58553b, Integer.valueOf(r34Var.f58552a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f72346a;
    }

    @Override // p000.rl0
    /* JADX INFO: renamed from: b */
    public final Set mo3695b() {
        return this.f72350e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        Integer num = (Integer) this.f72355j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return this.f72348c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zx8) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f72346a.equals(serialDescriptor.mo3694a()) && Arrays.equals(this.f72356k, ((zx8) obj).f72356k)) {
                int iMo3697e = serialDescriptor.mo3697e();
                int i = this.f72348c;
                if (i == iMo3697e) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.f72352g;
                        if (fa4.m11650l(serialDescriptorArr[i2].mo3694a(), serialDescriptor.mo3700i(i2).mo3694a()) && fa4.m11650l(serialDescriptorArr[i2].getKind(), serialDescriptor.mo3700i(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return this.f72351f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f72349d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return this.f72347b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        return this.f72353h[i];
    }

    public final int hashCode() {
        return ((Number) this.f72357l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return this.f72352g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        return this.f72354i[i];
    }

    public final String toString() {
        return r46.m20371N(this);
    }
}
