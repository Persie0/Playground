package p000;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ip9 extends m80 {

    /* JADX INFO: renamed from: c */
    public final HashMap f44408c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jp9 f44409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip9(jp9 jp9Var) {
        super(0);
        this.f44409d = jp9Var;
        this.f44408c = new HashMap();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final void mo14068g(m5b m5bVar) {
        ArrayList arrayList = this.f44409d.f45973b;
        if ((m5bVar.f50624a.mo14859d() & 519) != 0) {
            this.f44408c.remove(m5bVar);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yn7 yn7Var = (yn7) arrayList.get(size);
                int i = yn7Var.f70114e;
                boolean z = i > 0;
                int i2 = i - 1;
                yn7Var.f70114e = i2;
                if (z && i2 == 0) {
                    yn7Var.m25214c();
                }
            }
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: h */
    public final void mo14069h(m5b m5bVar) {
        ArrayList arrayList = this.f44409d.f45973b;
        if ((m5bVar.f50624a.mo14859d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yn7) arrayList.get(size)).f70114e++;
            }
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: i */
    public final f6b mo14070i(f6b f6bVar, List list) {
        ArrayList arrayList = this.f44409d.f45973b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            m5b m5bVar = (m5b) list.get(size);
            Integer num = (Integer) this.f44408c.get(m5bVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fMo14856a = m5bVar.f50624a.mo14856a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fMo14856a;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fMo14856a;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fMo14856a;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fMo14856a;
                }
                i |= iIntValue;
            }
        }
        l64.m15829b(f6bVar.f38536a.mo136i(519), f6bVar.f38536a.mo136i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            yn7 yn7Var = (yn7) arrayList.get(size2);
            l64 l64Var = yn7Var.f70113d;
            ArrayList arrayList2 = yn7Var.f70110a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((na1) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return f6bVar;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: j */
    public final p33 mo14071j(m5b m5bVar, p33 p33Var) {
        if ((m5bVar.f50624a.mo14859d() & 519) != 0) {
            l64 l64Var = (l64) p33Var.f55514c;
            l64 l64Var2 = (l64) p33Var.f55513b;
            int i = l64Var.f49116a != l64Var2.f49116a ? 1 : 0;
            if (l64Var.f49117b != l64Var2.f49117b) {
                i |= 2;
            }
            if (l64Var.f49118c != l64Var2.f49118c) {
                i |= 4;
            }
            if (l64Var.f49119d != l64Var2.f49119d) {
                i |= 8;
            }
            this.f44408c.put(m5bVar, Integer.valueOf(i));
        }
        return p33Var;
    }
}
