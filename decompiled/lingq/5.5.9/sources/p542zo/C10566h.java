package p542zo;

import dm.C5207g;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import p442vo.AbstractC9765a;
import sl.C9072e;

/* JADX INFO: renamed from: zo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10566h extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d.c f52717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f52718f = false;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C10578t f52719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10566h(String str, C10562d.c cVar, C10578t c10578t) {
        super(str, true);
        this.f52717e = cVar;
        this.f52719g = c10578t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, zo.t] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        ?? r10;
        long jM19586a;
        int i10;
        C10574p[] c10574pArr;
        C10562d.c cVar = this.f52717e;
        boolean z10 = this.f52718f;
        C10578t c10578t = this.f52719g;
        cVar.getClass();
        C5207g.m11111f(c10578t, "settings");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C10562d c10562d = cVar.f52701b;
        synchronized (c10562d.f52675T) {
            try {
                synchronized (c10562d) {
                    C10578t c10578t2 = c10562d.f52669N;
                    if (z10) {
                        r10 = c10578t;
                    } else {
                        C10578t c10578t3 = new C10578t();
                        c10578t3.m19587b(c10578t2);
                        c10578t3.m19587b(c10578t);
                        r10 = c10578t3;
                    }
                    ref$ObjectRef.f38127a = r10;
                    jM19586a = ((long) r10.m19586a()) - ((long) c10578t2.m19586a());
                    i10 = 0;
                    if (jM19586a == 0 || c10562d.f52680c.isEmpty()) {
                        c10574pArr = null;
                    } else {
                        Object[] array = c10562d.f52680c.values().toArray(new C10574p[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        c10574pArr = (C10574p[]) array;
                    }
                    C10578t c10578t4 = (C10578t) ref$ObjectRef.f38127a;
                    C5207g.m11111f(c10578t4, "<set-?>");
                    c10562d.f52669N = c10578t4;
                    c10562d.f52688k.m18258c(new C10563e(C5207g.m11116k(" onSettings", c10562d.f52681d), c10562d, ref$ObjectRef), 0L);
                    C9072e c9072e = C9072e.f47360a;
                }
                try {
                    c10562d.f52675T.m19579a((C10578t) ref$ObjectRef.f38127a);
                } catch (IOException e10) {
                    c10562d.m19544b(e10);
                }
                C9072e c9072e2 = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10574pArr != null) {
            int length = c10574pArr.length;
            while (i10 < length) {
                C10574p c10574p = c10574pArr[i10];
                i10++;
                synchronized (c10574p) {
                    try {
                        c10574p.f52758f += jM19586a;
                        if (jM19586a > 0) {
                            c10574p.notifyAll();
                        }
                        C9072e c9072e3 = C9072e.f47360a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return -1L;
    }
}
