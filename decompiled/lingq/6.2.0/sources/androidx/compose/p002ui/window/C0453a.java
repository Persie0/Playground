package androidx.compose.p002ui.window;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.bk1;
import p000.ct5;
import p000.ht5;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.window.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0453a implements ht5 {

    /* JADX INFO: renamed from: a */
    public static final C0453a f5288a = new C0453a();

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iM3803k = 0;
        int iM3802j = 0;
        for (int i = 0; i < size; i++) {
            l87 l87VarMo1514r = ((ct5) list.get(i)).mo1514r(j);
            iM3803k = Math.max(iM3803k, l87VarMo1514r.f49301a);
            iM3802j = Math.max(iM3802j, l87VarMo1514r.f49302b);
            arrayList.add(l87VarMo1514r);
        }
        if (list.isEmpty()) {
            iM3803k = bk1.m3803k(j);
            iM3802j = bk1.m3802j(j);
        }
        return jt5Var.mo9895M0(iM3803k, iM3802j, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AbstractC0343j.m1521j(abstractC0343j, (l87) arrayList2.get(i2), 0, 0);
                }
                return xfa.f68157a;
            }
        });
    }
}
