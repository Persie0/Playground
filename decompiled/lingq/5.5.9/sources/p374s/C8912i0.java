package p374s;

import ae.C0062b;
import androidx.compose.animation.core.C0370b;
import java.util.ArrayList;
import jm.C6525h;
import jm.C6526i;
import tl.C9325m;

/* JADX INFO: renamed from: s.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8912i0 implements InterfaceC8913j {

    /* JADX INFO: renamed from: a */
    public final ArrayList f46819a;

    public C8912i0(float f3, float f10, AbstractC8911i abstractC8911i) {
        C6526i c6526iM411w2 = C0062b.m411w2(0, abstractC8911i.mo17136b());
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c6526iM411w2, 10));
        C6525h it = c6526iM411w2.iterator();
        while (it.f37168c) {
            arrayList.add(new C0370b(f3, f10, abstractC8911i.mo17135a(it.mo13105a())));
        }
        this.f46819a = arrayList;
    }

    @Override // p374s.InterfaceC8913j
    public final InterfaceC8931s get(int i10) {
        return (C0370b) this.f46819a.get(i10);
    }
}
