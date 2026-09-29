package p469x0;

import dm.C5207g;
import java.util.ArrayList;
import p081e0.AbstractC5293a;

/* JADX INFO: renamed from: x0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10006g extends AbstractC5293a<AbstractC10005f> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10006g(C10001b c10001b) {
        super(c10001b);
        C5207g.m11111f(c10001b, "root");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static C10001b m18594j(AbstractC10005f abstractC10005f) {
        if (abstractC10005f instanceof C10001b) {
            return (C10001b) abstractC10005f;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: a */
    public final void mo11443a(int i10, Object obj) {
        C5207g.m11111f((AbstractC10005f) obj, "instance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: c */
    public final void mo11444c(int i10, int i11, int i12) {
        C10001b c10001bM18594j = m18594j((AbstractC10005f) this.f33565c);
        ArrayList arrayList = c10001bM18594j.f50819c;
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                AbstractC10005f abstractC10005f = (AbstractC10005f) arrayList.get(i10);
                arrayList.remove(i10);
                arrayList.add(i11, abstractC10005f);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                AbstractC10005f abstractC10005f2 = (AbstractC10005f) arrayList.get(i10);
                arrayList.remove(i10);
                arrayList.add(i11 - 1, abstractC10005f2);
                i13++;
            }
        }
        c10001bM18594j.m18593c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: d */
    public final void mo11445d(int i10, int i11) {
        m18594j((AbstractC10005f) this.f33565c).m18585e(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: f */
    public final void mo11446f(int i10, Object obj) {
        AbstractC10005f abstractC10005f = (AbstractC10005f) obj;
        C5207g.m11111f(abstractC10005f, "instance");
        C10001b c10001bM18594j = m18594j((AbstractC10005f) this.f33565c);
        c10001bM18594j.getClass();
        ArrayList arrayList = c10001bM18594j.f50819c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, abstractC10005f);
        } else {
            arrayList.add(abstractC10005f);
        }
        abstractC10005f.mo18584d(c10001bM18594j.f50824h);
        c10001bM18594j.m18593c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.AbstractC5293a
    /* JADX INFO: renamed from: i */
    public final void mo11433i() {
        C10001b c10001bM18594j = m18594j((AbstractC10005f) this.f33563a);
        c10001bM18594j.m18585e(0, c10001bM18594j.f50819c.size());
    }
}
