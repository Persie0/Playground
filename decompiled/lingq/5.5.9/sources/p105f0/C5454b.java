package p105f0;

import dm.C5207g;
import kotlinx.coroutines.scheduling.C7184h;
import p399te.InterfaceC9279a;
import tl.C9322j;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5454b implements InterfaceC9279a {

    /* JADX INFO: renamed from: a */
    public int f34005a;

    /* JADX INFO: renamed from: b */
    public Object[] f34006b;

    /* JADX INFO: renamed from: c */
    public Object f34007c;

    public C5454b() {
        this.f34006b = new Object[16];
        this.f34007c = new Object[16];
    }

    public C5454b(InterfaceC9279a... interfaceC9279aArr) {
        this.f34005a = 1024;
        this.f34006b = interfaceC9279aArr;
        this.f34007c = new C7184h();
    }

    /* JADX INFO: renamed from: a */
    public final int m11674a(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i10 = this.f34005a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f34006b[i12];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i12;
                    }
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj3 = this.f34006b[i13];
                        if (obj3 == obj) {
                            return i13;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.f34005a;
                    while (i14 < i15) {
                        Object obj4 = this.f34006b[i14];
                        if (obj4 == obj) {
                            return i14;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i14 + 1);
                        }
                        i14++;
                    }
                    i14 = this.f34005a;
                    return -(i14 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // p399te.InterfaceC9279a
    /* JADX INFO: renamed from: b */
    public final StackTraceElement[] mo11675b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f34005a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrMo11675b = stackTraceElementArr;
        for (InterfaceC9279a interfaceC9279a : (InterfaceC9279a[]) this.f34006b) {
            if (stackTraceElementArrMo11675b.length <= this.f34005a) {
                break;
            }
            stackTraceElementArrMo11675b = interfaceC9279a.mo11675b(stackTraceElementArr);
        }
        return stackTraceElementArrMo11675b.length > this.f34005a ? ((C7184h) this.f34007c).mo11675b(stackTraceElementArrMo11675b) : stackTraceElementArrMo11675b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m11676c(Object obj) {
        C5207g.m11111f(obj, "key");
        int iM11674a = m11674a(obj);
        if (iM11674a >= 0) {
            return ((Object[]) this.f34007c)[iM11674a];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m11677d(Object obj, Object obj2) {
        C5207g.m11111f(obj, "key");
        int iM11674a = m11674a(obj);
        if (iM11674a >= 0) {
            ((Object[]) this.f34007c)[iM11674a] = obj2;
            return;
        }
        int i10 = -(iM11674a + 1);
        int i11 = this.f34005a;
        Object[] objArr = this.f34006b;
        boolean z10 = i11 == objArr.length;
        Object[] objArr2 = z10 ? new Object[i11 * 2] : objArr;
        int i12 = i10 + 1;
        C9322j.m17673a0(i12, i10, i11, objArr, objArr2);
        if (z10) {
            C9322j.m17675c0(this.f34006b, objArr2, 0, 0, i10, 6);
        }
        objArr2[i10] = obj;
        this.f34006b = objArr2;
        Object[] objArr3 = z10 ? new Object[this.f34005a * 2] : (Object[]) this.f34007c;
        C9322j.m17673a0(i12, i10, this.f34005a, (Object[]) this.f34007c, objArr3);
        if (z10) {
            C9322j.m17675c0((Object[]) this.f34007c, objArr3, 0, 0, i10, 6);
        }
        objArr3[i10] = obj2;
        this.f34007c = objArr3;
        this.f34005a++;
    }
}
